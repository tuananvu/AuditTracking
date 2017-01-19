package syneren.qms.audit.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import syneren.qms.audit.model.InitAudit;
import syneren.qms.audit.service.base.InitAuditLocalServiceBaseImpl;
import syneren.qms.audit.service.persistence.InitAuditPersistence;



/**
 * The implementation of the init audit local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link syneren.qms.audit.service.InitAuditLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author anguyen
 * @see syneren.qms.audit.service.base.InitAuditLocalServiceBaseImpl
 * @see syneren.qms.audit.service.InitAuditLocalServiceUtil
 */
public class InitAuditLocalServiceImpl extends InitAuditLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link syneren.qms.audit.service.InitAuditLocalServiceUtil} to access the init audit local service.
     */
	public List<InitAudit> getInitAudits(long groupId) throws SystemException{
		return initAuditPersistence.findByGroupId(groupId);
	}
	public List<InitAudit> getInitAudits(long groupId, int start, int end) throws SystemException{
		return initAuditPersistence.findByGroupId(groupId, start, end);
	}
	
	@Override
	public InitAudit addInitAudit(InitAudit initAudit, long userId) throws  PortalException, SystemException{
		long initAuditId = counterLocalService.increment(InitAudit.class.getName());
		initAudit.setInitAuditId(initAuditId);
		initAudit = super.addInitAudit(initAudit);
		resourceLocalService.addResources(initAudit.getCompanyId(), initAudit.getGroupId(), userId,
				InitAudit.class.getName(), initAuditId, false, true, true);
		return initAudit;
	}
	public InitAudit getFirstInitAuditByName(long groupId, String name)throws SystemException{
		InitAudit initAudit = null;
		List<InitAudit> initAudits = initAuditPersistence.findByAuditName(name);
		if(initAudits != null && initAudits.size() >0){
			initAudit = initAudits.get(0);
		}
		return initAudit;
	}
}
