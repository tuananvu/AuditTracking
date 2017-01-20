package syneren.qms.audit.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import syneren.qms.audit.model.AuditFinding;
import syneren.qms.audit.service.base.AuditFindingLocalServiceBaseImpl;

/**
 * The implementation of the audit finding local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link syneren.qms.audit.service.AuditFindingLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author anguyen
 * @see syneren.qms.audit.service.base.AuditFindingLocalServiceBaseImpl
 * @see syneren.qms.audit.service.AuditFindingLocalServiceUtil
 */
public class AuditFindingLocalServiceImpl
    extends AuditFindingLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link syneren.qms.audit.service.AuditFindingLocalServiceUtil} to access the audit finding local service.
     */
	public List<AuditFinding> getAuditFindings(long groupId, long PlanId) throws SystemException{
		return auditFindingPersistence.findByG_P(groupId, PlanId);
	}
	public List<AuditFinding> getAuditFindings(long groupId, long PlanId, int start, int end) throws SystemException{
		return auditFindingPersistence.findByG_P(groupId, PlanId, start, end);
	}
	
	@Override
	public AuditFinding addAuditFinding(AuditFinding auditFinding) throws SystemException{
		long findingId = counterLocalService.increment(AuditFinding.class.getName());
		auditFinding.setFindingId(findingId);
		return super.addAuditFinding(auditFinding);
	}
	public int getAuditFindingsCount(long groupId, long PlanId) throws SystemException{
		return auditFindingPersistence.countByG_P(groupId, PlanId);
	}
}
