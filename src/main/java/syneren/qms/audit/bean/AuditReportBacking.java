package syneren.qms.audit.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.liferay.faces.portal.context.LiferayFacesContext;

import syneren.qms.audit.model.AuditReport;
import syneren.qms.audit.service.AuditReportLocalServiceUtil;
import syneren.qms.audit.service.InitAuditLocalServiceUtil;
import syneren.qms.audit.service.persistence.AuditReportUtil;
import syneren.qms.audit.wrappers.InitAudit;

@ManagedBean(name = "auditReportBacking")
@ViewScoped
public class AuditReportBacking extends AbstractBacking {

	private boolean addReportMode;
	private boolean editReportMode;
	public long initAuditId;  
	private AuditReport selectedAuditReport;
	
	
	public void add(){		
		setMode(1);
		AuditReport auditReport = AuditReportUtil.create(0L);
		LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
		auditReport.setGroupId(liferayFacesContext.getScopeGroupId());
		auditReport.setInitAuditId(initAuditId);
		this.setSelectedAuditReport(auditReport);
	}
	public void save(){
		LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
		AuditReport auditReport = this.getSelectedAuditReport();
		auditReport.setCompanyId(liferayFacesContext.getCompanyId());
		auditReport.setUserId(liferayFacesContext.getUserId());
		try {
			if(auditReport.getAuditId() == 0){
				AuditReportLocalServiceUtil.addAuditReport(auditReport);
			}
			else{
				AuditReportLocalServiceUtil.updateAuditReport(auditReport);
			}
			addGlobalSuccessInfoMessage();
		} catch (Exception e) {
			addGlobalUnexpectedErrorMessage();
			logger.error(e);
		}
	}
	public boolean isAddReportMode() {
		return addReportMode;
	}
	public void setAddReportMode(boolean addReportMode) {
		this.addReportMode = addReportMode;
	}
	public boolean isEditReportMode() {
		return editReportMode;
	}
	public void setEditReportMode(boolean editReportMode) {
		this.editReportMode = editReportMode;
	}
	public void setMode(int mode){
		addReportMode = false;
		editReportMode = false;
		if(mode == 1){
			addReportMode = true;
		}
		else if (mode == 2){
			editReportMode = true;
		}
	}
	
	public AuditReport getSelectedAuditReport() {				
		return selectedAuditReport;
	}
	public void setSelectedAuditReport(AuditReport selectedAuditReport) {
		this.selectedAuditReport = selectedAuditReport;
	}
}
