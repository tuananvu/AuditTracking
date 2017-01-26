package syneren.qms.audit.bean;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import syneren.qms.audit.model.AuditFinding;
import syneren.qms.audit.service.AuditFindingLocalServiceUtil;
import syneren.qms.audit.service.persistence.AuditFindingUtil;
import syneren.qms.audit.wrappers.AuditPlan;

import com.liferay.faces.portal.context.LiferayFacesContext;

@ManagedBean(name="auditFindingBacking")
@RequestScoped
public class AuditFindingBacking extends AbstractBacking implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManagedProperty(name="initAuditBacking", value="#{initAuditBacking}")
	protected InitAuditBacking initAuditBacking;
	
	@ManagedProperty(name="auditPlanBacking", value="#{auditPlanBacking}")
	protected AuditPlanBacking auditPlanBacking;
	Date date = new Date();
	
	public void setInitAuditBacking(InitAuditBacking initAuditBacking){
		this.initAuditBacking = initAuditBacking;
	}
	public void setAuditPlanBacking(AuditPlanBacking auditPlanBacking){
		this.auditPlanBacking = auditPlanBacking;
	}
	public void add(AuditPlan auditPlan){
		AuditFinding auditFinding = AuditFindingUtil.create(0L);
		LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
		auditFinding.setGroupId(liferayFacesContext.getScopeGroupId());
		auditFinding.setCreateDate(date);
		//auditFinding.setPlanId(auditPlanBacking.getSelectedAuditPlan().getPlanId());
		auditPlanBacking.setSelectedAuditPlan(auditPlan);
		auditFinding.setPlanId(auditPlanBacking.getSelectedAuditPlan().getPlanId());	
		auditPlanBacking.setSelectedAuditFinding(auditFinding);
		initAuditBacking.editAuditFinding();
	}
	public void save(){
		AuditFinding auditFinding = auditPlanBacking.getSelectedAuditFinding();
		LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
		auditFinding.setCompanyId(liferayFacesContext.getCompanyId());
		auditFinding.setUserId(liferayFacesContext.getUserId());
		auditFinding.setModifiedDate(date);
		try {
			if(auditFinding.getFindingId() == 0){
				AuditFindingLocalServiceUtil.addAuditFinding(auditFinding);
			}
			else{
				AuditFindingLocalServiceUtil.updateAuditFinding(auditFinding);
			}
			addGlobalSuccessInfoMessage();
		} catch (Exception e) {
			addGlobalUnexpectedErrorMessage();
			logger.error(e);
		}
		auditPlanBacking.select(auditPlanBacking.getSelectedAuditPlan());
		//initAuditBacking.select(initAuditBacking.getSelectedInitAudit());		
	}
	public void edit(AuditFinding auditFinding){
		auditPlanBacking.setSelectedAuditFinding(auditFinding);
		//initAuditBacking.setSelectedAuditPlan(auditPlan);
		initAuditBacking.editAuditFinding();
	}
	public void cancel(){
		auditPlanBacking.select(auditPlanBacking.getSelectedAuditPlan());
		//initAuditBacking.select(initAuditBacking.getSelectedInitAudit());
	}
	public void delete(AuditFinding auditFinding){
		try {
			AuditFindingLocalServiceUtil.deleteAuditFinding(auditFinding);
			addGlobalSuccessInfoMessage();
		} catch (Exception e) {
			addGlobalUnexpectedErrorMessage();
			logger.error(e);
		}
		auditPlanBacking.select(auditPlanBacking.getSelectedAuditPlan());
		//initAuditBacking.select(initAuditBacking.getSelectedInitAudit());
	}
}
