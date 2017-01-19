package syneren.qms.audit.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import syneren.qms.audit.wrappers.AuditPlan;
import syneren.qms.audit.wrappers.InitAudit;
import syneren.qms.audit.service.AuditPlanLocalServiceUtil;
import syneren.qms.audit.service.InitAuditLocalServiceUtil;
import syneren.qms.audit.service.persistence.InitAuditUtil;

import com.liferay.faces.portal.context.LiferayFacesContext;

@ManagedBean(name = "initAuditBacking")
@ViewScoped
public class InitAuditBacking extends AbstractBacking {
	public static final String MODEL = "syneren.qms.audit.model";
	private Boolean hasAddPermission;
	private Boolean hasViewPermission;
	public Boolean getHasAddPersmission() {
		if(hasAddPermission == null){
			LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
			long scopeGroupId = liferayFacesContext.getScopeGroupId();
			hasAddPermission = liferayFacesContext.getThemeDisplay().getPermissionChecker().
					hasPermission(scopeGroupId, MODEL, scopeGroupId, "ADD_INITAUDIT");
		}
		return hasAddPermission;
	}
	public void setHasAddPersmission(Boolean hasAddPermission) {
		this.hasAddPermission = hasAddPermission; 
	}
	public Boolean getHasViewPermission() {
		if(hasViewPermission == null){
			LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
			long scopeGroupId = liferayFacesContext.getScopeGroupId();
			hasViewPermission = liferayFacesContext.getThemeDisplay().getPermissionChecker().
					hasPermission(scopeGroupId, "syneren.qms.audit.model.InitAudit", scopeGroupId, "VIEW");
		}
		return hasViewPermission;
	}
	public void setHasViewPermission(Boolean hasViewPermission) {
		this.hasViewPermission = hasViewPermission;
	}	
	
	public InitAudit getOriginalInitAudit() {
		return originalInitAudit;
	}
	public void setOriginalInitAudit(InitAudit originalInitAudit) {
		this.originalInitAudit = originalInitAudit;
	}
	public InitAudit getSelectedInitAudit() {
		if(selectedInitAudit == null){
			long scopeGroupId = LiferayFacesContext.getInstance().getScopeGroupId();
			try {
				syneren.qms.audit.model.InitAudit firstInitAuditByName = InitAuditLocalServiceUtil.getFirstInitAuditByName(scopeGroupId, DEFAULT_INITAUDIT_NAME);
				if(firstInitAuditByName == null){
					logger.info("getSelectedInitAudit: No Init Audit named " + DEFAULT_INITAUDIT_NAME);
				}
				else{
					selectedInitAudit = new InitAudit(firstInitAuditByName);
				}
			} catch (Exception e) {
				logger.error(e);
			}
		}
		return selectedInitAudit;
	}
	public void setSelectedInitAudit(InitAudit selectedInitAudit) {
		this.selectedInitAudit = selectedInitAudit;
	}
	public List<InitAudit> getInitAudits() {
		if(initAudits == null){
			long scopeGroupId = LiferayFacesContext.getInstance().getScopeGroupId();
			try {
				initAudits = new ArrayList<InitAudit>();
				List<syneren.qms.audit.model.InitAudit> list = InitAuditLocalServiceUtil.getInitAudits(scopeGroupId);
				for(syneren.qms.audit.model.InitAudit initaudit:list){
					initAudits.add(new InitAudit(initaudit));
				}
			} catch (Exception e) {
				logger.error(e);
			}
		}
		logger.info("getInitAudits: initAudits.size() = " + initAudits.size());
		return initAudits;
	}
	public void setInitAudits(List<InitAudit> initAudits) {
		this.initAudits = initAudits;
	}
	public AuditPlan getSelectedAuditPlan() {
		return selectedAuditPlan;
	}
	public void setSelectedAuditPlan(AuditPlan selectedAuditPlan) {
		this.selectedAuditPlan = selectedAuditPlan;
	}
	public List<AuditPlan> getAuditPlans() {
		if(auditPlans == null){
			long scopeGroupId = LiferayFacesContext.getInstance().getScopeGroupId();
			InitAudit selectedInitAudit = getSelectedInitAudit();
			try {
				auditPlans = new ArrayList<AuditPlan>();
				if(selectedInitAudit == null){
					logger.info("getAuditPlans: selectedInitAudit == null ...");
				}
				else{
					List<syneren.qms.audit.model.AuditPlan> list = AuditPlanLocalServiceUtil.getAuditPlans(scopeGroupId, selectedInitAudit.getInitAuditId());
					for(syneren.qms.audit.model.AuditPlan auditplan : list){
						auditPlans.add(new AuditPlan(auditplan));
					}
				}
			} catch (Exception e) {
				logger.error(e);
			}
		}
		return auditPlans;
	}
	public void setAuditPlans(List<AuditPlan> auditPlans) {
		this.auditPlans = auditPlans;
	}
	public boolean isEditingInitAudit() {
		return editingInitAudit;
	}
	public void setEditingInitAudit(boolean editingInitAudit) {
		this.editingInitAudit = editingInitAudit;
	}
	public boolean isEditingAuditPlan() {
		return editingAuditPlan;
	}
	public void setEditingAuditPlan(boolean editingAuditPlan) {
		this.editingAuditPlan = editingAuditPlan;
	}
	public static final String DEFAULT_INITAUDIT_NAME = "Sample";
	private InitAudit originalInitAudit;
	private InitAudit selectedInitAudit;
	private List<InitAudit> initAudits;
	private AuditPlan selectedAuditPlan;
	private List<AuditPlan> auditPlans;
	private boolean editingInitAudit;
	private boolean editingAuditPlan;
	Date date=new Date();
	
	public void add(){
		setOriginalInitAudit(getSelectedInitAudit());
		InitAudit initAudit = new InitAudit(InitAuditUtil.create(0L));
		LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
		initAudit.setGroupId(liferayFacesContext.getScopeGroupId());
		initAudit.setCreateDate(date);
		setSelectedInitAudit(initAudit);
		editInitAudit();
	}
	public void cancel(){
		select(getOriginalInitAudit());
	}
	public void save(){
		InitAudit initAudit = getSelectedInitAudit();
		LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
		initAudit.setCompanyId(liferayFacesContext.getCompanyId());
		initAudit.setUserId(liferayFacesContext.getUserId());
		initAudit.setModifiedDate(date);
		try {
			if(initAudit.getInitAuditId() == 0){
				initAudit = new InitAudit(InitAuditLocalServiceUtil.addInitAudit(initAudit, liferayFacesContext.getUserId()));
			}
			else{
				initAudit = new InitAudit(InitAuditLocalServiceUtil.updateInitAudit(initAudit));
			}
			addGlobalSuccessInfoMessage();
		} catch (Exception e) {
			addGlobalUnexpectedErrorMessage();
			logger.error(e);
		}
		//go back to master view
		select(initAudit);
	}
	public void select(InitAudit initAudit){
		if(initAudit == null){
			setSelectedInitAudit(null);			
		}
		else{
			setSelectedInitAudit(initAudit);
		}
		
		//Force InitAudit and AuditPlan to reload
		setInitAudits(null);
		setAuditPlans(null);
		editingAuditPlan = false;
		editingInitAudit = false;
	}
	public void createSampleInitAudit(){
		try {
			LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
			long scopeGroupId = liferayFacesContext.getScopeGroupId();
			syneren.qms.audit.model.InitAudit defaultInitAudit = InitAuditLocalServiceUtil.getFirstInitAuditByName(scopeGroupId, DEFAULT_INITAUDIT_NAME);
			
			//Create the default InitAudit if it does not exist in the database
			if(defaultInitAudit == null){
				logger.info("postConstruct: creating a default initAudit named " + DEFAULT_INITAUDIT_NAME + "...");
				InitAudit initAudit = new InitAudit(InitAuditUtil.create(0L));
				initAudit.setInitAuditName(DEFAULT_INITAUDIT_NAME);
				initAudit.setGroupId(scopeGroupId);
				initAudit.setCompanyId(liferayFacesContext.getCompanyId());
				initAudit.setUserId(liferayFacesContext.getUserId());
				initAudit.setCreateDate(date);
				initAudit.setModifiedDate(date);
				InitAuditLocalServiceUtil.addInitAudit(initAudit,liferayFacesContext.getUserId());
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@PostConstruct
	public void postConstruct(){
		createSampleInitAudit();
	}
	public void editInitAudit(){
		editingAuditPlan = false;
		editingInitAudit = true;
	}
	public void editAuditPlan(){
		editingAuditPlan = true;
		editingInitAudit = false;
	}
	
}