package syneren.qms.audit.wrappers;

import javax.el.ELContext;
import javax.faces.context.ExternalContext;
import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.faces.util.jsp.PageContextAdapter;
import com.liferay.faces.util.jsp.StringJspWriter;
import com.liferay.faces.util.logging.Logger;
import com.liferay.faces.util.logging.LoggerFactory;
import com.liferay.portal.security.permission.ActionKeys;
import com.liferay.portal.util.PortalUtil;
import com.liferay.taglib.security.*;


public class AuditPlan extends syneren.qms.audit.model.AuditPlanWrapper{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2043496291015208919L;
	private static final String MODEL = "syneren.qms.audit.model.AuditPlan";
	private Boolean viewable;
	private static final Logger logger = LoggerFactory.getLogger(AuditPlan.class);
	private String permissionsUrl;
	private Boolean deleteable;
	private Boolean permissible;
	private Boolean updateable;
	
	public AuditPlan(syneren.qms.audit.model.AuditPlan auditPlan) {
		super(auditPlan);
		// TODO Auto-generated constructor stub
	}
	public Boolean getViewable(){
		if(viewable == null){
			LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
			long scopeGroupId = liferayFacesContext.getScopeGroupId();
			viewable = liferayFacesContext.getThemeDisplay().getPermissionChecker()
					.hasPermission(scopeGroupId, MODEL, getPlanId(), ActionKeys.VIEW);			
		}
		return viewable;		
	}
	public String getPermissionsUrl(){
		if (permissionsUrl == null) {

	        LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
	        ExternalContext externalContext = liferayFacesContext.getExternalContext();
	        long scopeGroupId = liferayFacesContext.getScopeGroupId();

	        // Get the underlying HttpServletRequest and HttpServletResponse
	        PortletRequest portletRequest = (PortletRequest) externalContext.getRequest();
	        HttpServletRequest httpServletRequest = PortalUtil.getHttpServletRequest(portletRequest);
	        PortletResponse portletResponse = (PortletResponse) externalContext.getResponse();
	        HttpServletResponse httpServletResponse = PortalUtil.getHttpServletResponse(portletResponse);
	        ELContext elContext = liferayFacesContext.getELContext();
	        StringJspWriter stringJspWriter = new StringJspWriter();
	        PageContextAdapter pageContextAdapter = new PageContextAdapter(httpServletRequest, httpServletResponse,
	            elContext, stringJspWriter);

	        // Invoke the Liferay Tag class directly (rather than using the tag from a JSP).
	        PermissionsURLTag permissionsURLTag = new PermissionsURLTag();
	        
	        permissionsURLTag.setPageContext(pageContextAdapter);
	        permissionsURLTag.setModelResource(MODEL);	       
	        permissionsURLTag.setModelResourceDescription(getPlanName());
	        permissionsURLTag.setRedirect("false");
	        permissionsURLTag.setResourceGroupId(scopeGroupId);
	        permissionsURLTag.setResourcePrimKey(String.valueOf(getPlanId()));

	        // Set var to null if you want the tag to write out the url
	        permissionsURLTag.setVar(null);

	        try {
	            permissionsURLTag.doStartTag();
	            permissionsURLTag.doEndTag();
	            permissionsUrl = stringJspWriter.toString();
	        }
	        catch (Exception e) {
	            logger.error(e);
	        }

	    }
	    return permissionsUrl;
	}
	public Boolean getDeleteable() {

	    if (deleteable == null) {
	        LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
	        long scopeGroupId = liferayFacesContext.getScopeGroupId();
	        deleteable = liferayFacesContext.getThemeDisplay().getPermissionChecker().
	        		hasPermission(scopeGroupId, MODEL, getPlanId(), ActionKeys.DELETE);
	    }

	    return deleteable;
	}

	public Boolean getPermissible() {

	    if (permissible == null) {
	        LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
	        long scopeGroupId = liferayFacesContext.getScopeGroupId();
	        permissible = liferayFacesContext.getThemeDisplay().getPermissionChecker().hasPermission(scopeGroupId,
	            MODEL, getPlanId(), ActionKeys.PERMISSIONS);
	    }

	    return permissible;
	}

	public Boolean getUpdateable() {

	    if (updateable == null) {
	        LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
	        long scopeGroupId = liferayFacesContext.getScopeGroupId();
	        updateable = liferayFacesContext.getThemeDisplay().getPermissionChecker().hasPermission(scopeGroupId,
	            MODEL, getPlanId(), ActionKeys.UPDATE);
	    }

	    return updateable;
	}
}
