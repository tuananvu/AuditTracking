package syneren.qms.audit.bean;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import syneren.qms.audit.model.AuditCheckItem;
import syneren.qms.audit.model.AuditFinding;
import syneren.qms.audit.model.AuditReport;
import syneren.qms.audit.service.AuditCheckItemLocalServiceUtil;
import syneren.qms.audit.service.AuditFindingLocalServiceUtil;
import syneren.qms.audit.service.persistence.AuditCheckItemUtil;
import syneren.qms.audit.service.persistence.AuditFindingUtil;
import syneren.qms.audit.wrappers.AuditPlan;

import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.portlet.assettagadmin.action.EditTagAction;

@ManagedBean(name="auditCheckItemBacking")
@ViewScoped
public class AuditCheckItemBacking extends AbstractBacking implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Date date = new Date();
	private boolean editable;
	
	@ManagedProperty (name="auditReportBacking", value="#{auditReportBacking}")
	protected AuditReportBacking auditReportBacking;
	
	public void add(AuditReport auditReport){
		auditReportBacking.setMode(3);
		AuditCheckItem auditCheckItem = AuditCheckItemUtil.create(0L);
		LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
		auditCheckItem.setGroupId(liferayFacesContext.getScopeGroupId());
		auditCheckItem.setCreateDate(date);		
		auditReportBacking.setSelectedAuditReport(auditReport);
		auditCheckItem.setAuditId(auditReportBacking.getSelectedAuditReport().getAuditId());	
		auditReportBacking.setSelectedAuditCheckItem(auditCheckItem);		
	}
	public void save(){
		AuditCheckItem auditCheckItem = auditReportBacking.getSelectedAuditCheckItem();
		System.out.println(auditCheckItem.getAuditId() + ", " + auditCheckItem.getQuestion());
		LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
		auditCheckItem.setCompanyId(liferayFacesContext.getCompanyId());
		auditCheckItem.setUserId(liferayFacesContext.getUserId());
		auditCheckItem.setModifiedDate(date);
		try {
			if(auditCheckItem.getCheckItemId() == 0){
				AuditCheckItemLocalServiceUtil.addAuditCheckItem(auditCheckItem);				
			}
			else{
				AuditCheckItemLocalServiceUtil.updateAuditCheckItem(auditCheckItem);				
			}
			addGlobalSuccessInfoMessage();
		} catch (Exception e) {
			addGlobalUnexpectedErrorMessage();
			logger.error(e);
		}
		
		editable = false;
		System.out.println(auditCheckItem.getAuditId() + ", " + auditCheckItem.getQuestion());
		auditReportBacking.setMode(10);
	}
	public void test(){	
		editable =false;
		auditReportBacking.setMode(10);
		System.out.println("test");
		
	}
	public void edit(AuditCheckItem auditCheckItem){
		editable = true;
		auditReportBacking.setSelectedAuditCheckItem(auditCheckItem);
		System.out.println(auditCheckItem.getAuditId() + ", " + auditCheckItem.getQuestion());
		//auditReportBacking.setMode(4);
	}
	public void setAuditReportBacking(AuditReportBacking auditReportBacking){
		this.auditReportBacking = auditReportBacking;
	}
	public boolean isEditable() {
		return editable;
	}
	public void setEditable(boolean editable) {
		this.editable = editable;
	}
}
