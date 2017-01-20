package syneren.qms.audit.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

import com.liferay.faces.portal.context.LiferayFacesContext;

import syneren.qms.audit.wrappers.AuditPlan;
import syneren.qms.audit.wrappers.InitAudit;
import syneren.qms.audit.model.AuditFinding;
import syneren.qms.audit.service.AuditFindingLocalServiceUtil;
import syneren.qms.audit.service.AuditPlanLocalServiceUtil;
import syneren.qms.audit.service.InitAuditLocalServiceUtil;
import syneren.qms.audit.service.persistence.AuditPlanUtil;

@ManagedBean(name = "auditPlanBacking")
@ViewScoped
public class AuditPlanBacking extends AbstractBacking {
	private Boolean hasAddPermission;
	private AuditPlan originalAuditPlan;		
	private AuditPlan selectedAuditPlan;
	private List<AuditFinding> auditFindings;
	private List<AuditPlan> auditPlans;
	private AuditFinding selectedAuditFinding;
	
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
	
	public void select(AuditPlan auditPlan){
		if(auditPlan == null){
			setSelectedAuditPlan(null);			
		}
		else{
			setSelectedAuditPlan(auditPlan);
		}
		
		//Force InitAudit and AuditPlan to reload
		setAuditPlans(null);
		setAuditFindings(null);
		initAuditBacking.setEditModesToFalse();
		//editingAuditPlan = false;
		//editingInitAudit = false;
	}
	
	public AuditPlan getOriginalAuditPlan() {
		return originalAuditPlan;
	}
	public void setOriginalAuditPlan(AuditPlan originalAuditPlan) {
		this.originalAuditPlan = originalAuditPlan;
	}
	public AuditPlan getSelectedAuditPlan() {		
		return selectedAuditPlan;
	}
	public void setSelectedAuditPlan(AuditPlan selectedAuditPlan) {
		this.selectedAuditPlan = selectedAuditPlan;
	}
	public List<AuditPlan> getAuditPlans() {
		return auditPlans;
	}
	public void setAuditPlans(List<AuditPlan> auditPlans) {
		this.auditPlans = auditPlans;
	}
	public List<AuditFinding> getAuditFindings() {
		if(auditFindings == null){
			long scopeGroupId = LiferayFacesContext.getInstance().getScopeGroupId();
			AuditPlan selectedAuditPlan = getSelectedAuditPlan();
			try {
				auditFindings = new ArrayList<AuditFinding>();
				if(selectedAuditPlan == null){
					logger.info("getAuditPlans: selectedInitAudit == null ...");
				}
				else{
					List<AuditFinding> list = AuditFindingLocalServiceUtil.getAuditFindings(scopeGroupId, selectedAuditPlan.getPlanId());
					for(AuditFinding auditFinding : list){
						auditFindings.add(auditFinding);
					}
				}
			} catch (Exception e) {
				logger.error(e);
			}
		}		
		return auditFindings;
	}
	public void setAuditFindings(List<AuditFinding> auditFindings) {
		this.auditFindings = auditFindings;
	}
	public AuditFinding getSelectedAuditFinding() {
		return selectedAuditFinding;
	}
	public void setSelectedAuditFinding(AuditFinding selectedAuditFinding) {
		this.selectedAuditFinding = selectedAuditFinding;
	}
}