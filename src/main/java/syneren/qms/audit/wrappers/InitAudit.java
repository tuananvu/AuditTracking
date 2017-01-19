package syneren.qms.audit.wrappers;

import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.portal.security.permission.ActionKeys;

public class InitAudit extends syneren.qms.audit.model.InitAuditWrapper{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8294427814006503973L;
	private static final String MODEL = "syneren.qms.audit.model.InitAudit";
	private Boolean viewable;
	public InitAudit(syneren.qms.audit.model.InitAudit initAudit) {
		super(initAudit);
		// TODO Auto-generated constructor stub
	}
	public Boolean getViewable(){
		if(viewable == null){
			LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
			long scopeGroupId = liferayFacesContext.getScopeGroupId();
			viewable = liferayFacesContext.getThemeDisplay().getPermissionChecker().
					hasPermission(scopeGroupId, MODEL, getInitAuditId(), ActionKeys.VIEW);
		}
		return viewable;
	}
}
