package syneren.qms.audit.bean;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import com.liferay.faces.portal.context.LiferayFacesContext;

import syneren.qms.audit.wrappers.AuditPlan;
import syneren.qms.audit.service.AuditPlanLocalServiceUtil;
import syneren.qms.audit.service.persistence.AuditPlanUtil;

@ManagedBean(name = "auditPlanBacking")
@RequestScoped
public class AuditPlanBacking extends AbstractBacking {
	private Boolean hasAddPermission;
	
	public Boolean getHasAddPermission() {
		if(hasAddPermission == null){
			LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
			long scopeGroupId = liferayFacesContext.getScopeGroupId();
			hasAddPermission = liferayFacesContext.getThemeDisplay().getPermissionChecker().
					hasPermission(scopeGroupId, InitAuditBacking.MODEL, scopeGroupId, "ADD_AUDITPLAN");
		}
		return hasAddPermission;
	}
	public void setHasAddPermission(Boolean hasAddPermission) {
		this.hasAddPermission = hasAddPermission;
	}

	@ManagedProperty(name="initAuditBacking", value="#{initAuditBacking}")
	protected InitAuditBacking initAuditBacking;
	
	public void setInitAuditBacking(InitAuditBacking initAuditBacking){
		this.initAuditBacking = initAuditBacking;
	}
	
	Date date = new Date();
	public void add(){
		AuditPlan auditPlan = new AuditPlan(AuditPlanUtil.create(0L));
		LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
		auditPlan.setGroupId(liferayFacesContext.getScopeGroupId());
		auditPlan.setCreateDate(date);
		auditPlan.setInitAuditId(initAuditBacking.getSelectedInitAudit().getInitAuditId());
		initAuditBacking.setSelectedAuditPlan(auditPlan);
		initAuditBacking.editAuditPlan();
	}
	public void cancel(){
		initAuditBacking.select(initAuditBacking.getSelectedInitAudit());
	}
	public void save(){
		AuditPlan auditPlan = new AuditPlan(initAuditBacking.getSelectedAuditPlan());
		LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
		auditPlan.setCompanyId(liferayFacesContext.getCompanyId());
		auditPlan.setUserId(liferayFacesContext.getUserId());
		auditPlan.setModifiedDate(date);
		try {
			if(auditPlan.getPlanId() == 0){
				AuditPlanLocalServiceUtil.addAuditPlan(auditPlan, liferayFacesContext.getUserId());
			}
			else{
				AuditPlanLocalServiceUtil.updateAuditPlan(auditPlan);
			}
			addGlobalSuccessInfoMessage();
		} catch (Exception e) {
			addGlobalUnexpectedErrorMessage();
			logger.error(e);
		}
		initAuditBacking.select(initAuditBacking.getSelectedInitAudit());
		
	}
	public void delete(AuditPlan auditPlan){
		try {
			AuditPlanLocalServiceUtil.deleteAuditPlan(auditPlan);
			addGlobalSuccessInfoMessage();
		} catch (Exception e) {
			addGlobalUnexpectedErrorMessage();
			logger.error(e);
		}
		initAuditBacking.select(initAuditBacking.getSelectedInitAudit());
	}
	public void edit(AuditPlan auditPlan){
		initAuditBacking.setSelectedAuditPlan(auditPlan);
		initAuditBacking.editAuditPlan();
	}
}