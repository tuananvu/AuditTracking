package syneren.qms.audit.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;

import javax.faces.bean.ViewScoped;
import javax.faces.event.ValueChangeEvent;
import com.liferay.faces.portal.context.LiferayFacesContext;
import syneren.qms.audit.model.AuditCheckItem;
import syneren.qms.audit.model.AuditReport;
import syneren.qms.audit.service.AuditCheckItemLocalServiceUtil;
import syneren.qms.audit.service.AuditReportLocalServiceUtil;
import syneren.qms.audit.service.persistence.AuditReportUtil;

@ManagedBean(name = "auditReportBacking")
@ViewScoped
public class AuditReportBacking extends AbstractBacking implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean addReportMode;//mode = 1
	private boolean editReportMode;//mode = 2
	private boolean addCheckItemMode;//mode = 3
	private boolean editCheckItemMode;//mode = 4
	private long initAuditId;  
	private AuditReport selectedAuditReport;
	private List<AuditReport> auditReports;
	Date date = new Date();
	private List<AuditCheckItem> auditCheckItems;
	private AuditCheckItem selectedAuditCheckItem;
	
	public void add(){		
		setMode(1);
		AuditReport auditReport = AuditReportUtil.create(0L);
		LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
		auditReport.setGroupId(liferayFacesContext.getScopeGroupId());
		auditReport.setInitAuditId(initAuditId);
		auditReport.setCreateDate(date);
		this.setSelectedAuditReport(auditReport);
		logger.debug("initAuditId:" + initAuditId);
	}
	public void save(){
		LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
		AuditReport auditReport = this.getSelectedAuditReport();
		auditReport.setCompanyId(liferayFacesContext.getCompanyId());
		auditReport.setUserId(liferayFacesContext.getUserId());
		auditReport.setModifiedDate(date);
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
		setMode(10);
	}
	public void cancel(){
		setMode(10);
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
		addCheckItemMode = false;
		editCheckItemMode = false;
		
		if(mode == 1){
			addReportMode = true;
		}
		else if (mode == 2){
			editReportMode = true;
		}
		else if (mode ==3){
			addCheckItemMode = true;
		}
		else if (mode ==4) {
			editCheckItemMode = true;
		}
	}
	public void view(){
		setMode(10);	
		auditReports = null;
	}	
	public void select(AuditReport auditReport){
		if(auditReport == null){
			setSelectedAuditReport(null);			
		}
		else{
			setSelectedAuditReport(auditReport);
		}
		
		//Force InitAudit and AuditPlan to reload
		auditReports = null;		
		auditCheckItems = null;
		setMode(10);
	}
	public void initAuditChanged(ValueChangeEvent e){
		System.out.println("test initAuditChanged function");
		initAuditId = (Long) e.getNewValue();		
		auditReports = null;
		selectedAuditReport = null;
		auditCheckItems = null;
		setMode(10);
	}
	public AuditReport getSelectedAuditReport() {				
		return selectedAuditReport;
	}
	public void setSelectedAuditReport(AuditReport selectedAuditReport) {
		this.selectedAuditReport = selectedAuditReport;
	}
	public List<AuditReport> getAuditReports() {
		if(auditReports == null){
			long scopeGroupId = LiferayFacesContext.getInstance().getScopeGroupId();
			
			try {
				auditReports = new ArrayList<AuditReport>();
				if(initAuditId == 0){
					logger.info("getAuditReports: initAuditId == 0 ...");
				}
				else{
					List<AuditReport> list = AuditReportLocalServiceUtil.getAuditReports(scopeGroupId, initAuditId);
					for(AuditReport auditReport : list){
						auditReports.add(auditReport);
					}
				}
			} catch (Exception e) {
				logger.error(e);
			}
		}		
		return auditReports;
	}
	public void setAuditReports(List<AuditReport> auditReports) {
		this.auditReports = auditReports;
	}
	public long getInitAuditId() {
		return initAuditId;
	}
	public void setInitAuditId(long initAuditId) {
		this.initAuditId = initAuditId;
	}
	public List<AuditCheckItem> getAuditCheckItems() {
		if(auditCheckItems == null){
			long scopeGroupId = LiferayFacesContext.getInstance().getScopeGroupId();
			AuditReport selectedAuditReport = getSelectedAuditReport();
			try {
				auditCheckItems = new ArrayList<AuditCheckItem>();
				if(selectedAuditReport == null){
					logger.info("getAuditCheckItems: selectedAuditReport == null ...");
				}
				else{
					List<AuditCheckItem> list = AuditCheckItemLocalServiceUtil.getAuditCheckItems(scopeGroupId, selectedAuditReport.getAuditId());
					for(AuditCheckItem auditCheckItem : list){
						auditCheckItems.add(auditCheckItem);
					}
				}
			} catch (Exception e) {
				logger.error(e);
			}
		}	
		return auditCheckItems;
	}
	public void setAuditCheckItems(List<AuditCheckItem> auditCheckItems) {
		this.auditCheckItems = auditCheckItems;
	}
	public boolean isAddCheckItemMode() {
		return addCheckItemMode;
	}
	public void setAddCheckItemMode(boolean addCheckItemMode) {
		this.addCheckItemMode = addCheckItemMode;
	}
	public boolean isEditCheckItemMode() {
		return editCheckItemMode;
	}
	public void setEditCheckItemMode(boolean editCheckItemMode) {
		this.editCheckItemMode = editCheckItemMode;
	}
	public AuditCheckItem getSelectedAuditCheckItem() {		
		return selectedAuditCheckItem;
	}
	public void setSelectedAuditCheckItem(AuditCheckItem selectedAuditCheckItem) {
		this.selectedAuditCheckItem = selectedAuditCheckItem;
	}
}
