package syneren.qms.audit.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import syneren.qms.audit.model.AuditCheckItem;
import syneren.qms.audit.model.AuditReport;
import syneren.qms.audit.service.AuditCheckItemLocalServiceUtil;
import syneren.qms.audit.service.persistence.AuditCheckItemUtil;

import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.portal.kernel.exception.SystemException;

@ManagedBean(name="auditCheckItemBacking")
@ViewScoped
public class AuditCheckItemBacking extends AbstractBacking implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Date date = new Date();	
	
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
		auditCheckItem.setEditable(false);
		
		System.out.println(auditCheckItem.getAuditId() + ", " + auditCheckItem.getQuestion());
		auditReportBacking.setMode(10);
	}
	public void cancel(){
		auditReportBacking.setMode(10);
	}
	public void save(AuditCheckItem auditCheckItem){			
		auditCheckItem.setEditable(false);
		
		auditReportBacking.setSelectedAuditCheckItem(auditCheckItem);
		auditReportBacking.setMode(10);		
		save();
	}
	public void edit(AuditCheckItem auditCheckItem){
		auditCheckItem.setEditable(true);		
		auditReportBacking.setSelectedAuditCheckItem(auditCheckItem);
		System.out.println(auditCheckItem.getAuditId() + ", " + auditCheckItem.getQuestion());
		auditReportBacking.setMode(4);
	}
	public void generateAuditCheckItems(AuditReport auditReport){
		List<AuditCheckItem> checkItems = new ArrayList<AuditCheckItem>();
		LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
		auditReportBacking.setSelectedAuditReport(auditReport);
		for(int i=0; i<4; i++){
			AuditCheckItem auditCheckItem = AuditCheckItemUtil.create(0L);
			auditCheckItem.setGroupId(liferayFacesContext.getScopeGroupId());
			auditCheckItem.setCreateDate(date);				
			auditCheckItem.setAuditId(auditReportBacking.getSelectedAuditReport().getAuditId());
			auditCheckItem.setCompanyId(liferayFacesContext.getCompanyId());
			auditCheckItem.setUserId(liferayFacesContext.getUserId());
			auditCheckItem.setModifiedDate(date);
			checkItems.add(auditCheckItem);
		}
		checkItems.get(0).setCheckItemName("4.1 Understanding the organization and its context");
		checkItems.get(0).setQuestion("How has the organization determined"
				+ " external and internal issues relevant to its purpose and strategic direction?"
				+ " How do these affect the ability to achieve the intended result of the QMS?");
				
		checkItems.get(1).setCheckItemName("4.1 Understanding the organization and its context");
		checkItems.get(1).setQuestion("How do you monitor and review information about these internal and external issues?");
		checkItems.get(2).setCheckItemName("4.2 Understanding the needs and expectations of interested parties");
		checkItems.get(2).setQuestion("How have you determined what interested parties are relevant to the QMS?"
				+ " How have you determined what requirements those parties have that are relevant to the QMS?"
				+ " How has impact or potential impact been determined?");
		checkItems.get(3).setCheckItemName("4.2 Understanding the needs and expectations of interested parties");
		checkItems.get(3).setQuestion("How do you monitor and review the information about interested parties and"
				+ " their relevant requirements?");
		/*checkItems.get().setCheckItemName("");
		checkItems.get().setQuestion("");
		checkItems.get().setCheckItemName("");
		checkItems.get().setQuestion("");
		checkItems.get().setCheckItemName("");
		checkItems.get().setQuestion("");
		checkItems.get().setCheckItemName("");
		checkItems.get().setQuestion("");
		checkItems.get().setCheckItemName("");
		checkItems.get().setQuestion("");
		checkItems.get().setCheckItemName("");
		checkItems.get().setQuestion("");
		checkItems.get().setCheckItemName("");
		checkItems.get().setQuestion("");
		checkItems.get().setCheckItemName("");
		checkItems.get().setQuestion("");
		checkItems.get().setCheckItemName("");
		checkItems.get().setQuestion("");
		checkItems.get().setCheckItemName("");
		checkItems.get().setQuestion("");
		checkItems.get().setCheckItemName("");
		checkItems.get().setQuestion("");
		checkItems.get().setCheckItemName("");
		checkItems.get().setQuestion("");
		checkItems.get().setCheckItemName("");
		checkItems.get().setQuestion("");*/
				
		try {
			for (AuditCheckItem auditCheckItem : checkItems) {
			AuditCheckItemLocalServiceUtil.addAuditCheckItem(auditCheckItem);			
			}
			addGlobalSuccessInfoMessage();
		} catch (SystemException e) {
			addGlobalUnexpectedErrorMessage();
			logger.error(e);
		}
		auditReportBacking.setMode(10);
		
	}
	public void setAuditReportBacking(AuditReportBacking auditReportBacking){
		this.auditReportBacking = auditReportBacking;
	}	
}
