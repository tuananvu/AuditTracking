package syneren.qms.audit.service.impl;


import java.util.List;

import syneren.qms.audit.model.AuditPlan;
import syneren.qms.audit.service.base.AuditPlanLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.ResourceConstants;

/**
 * The implementation of the audit plan local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link syneren.qms.audit.service.AuditPlanLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author anguyen
 * @see syneren.qms.audit.service.base.AuditPlanLocalServiceBaseImpl
 * @see syneren.qms.audit.service.AuditPlanLocalServiceUtil
 */
public class AuditPlanLocalServiceImpl extends AuditPlanLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link syneren.qms.audit.service.AuditPlanLocalServiceUtil} to access the audit plan local service.
     */
	public List<AuditPlan> getAuditPlans(long groupId, long InitAuditId) throws SystemException{
		return auditPlanPersistence.findByG_A(groupId, InitAuditId);
	}
	public List<AuditPlan> getAuditPlans(long groupId, long InitAuditId, int start, int end) throws SystemException{
		return auditPlanPersistence.findByG_A(groupId, InitAuditId, start, end);
	}
	@Override
	public AuditPlan addAuditPlan(AuditPlan auditPlan, long userId)throws PortalException, SystemException{
		long auditPlanId = counterLocalService.increment(AuditPlan.class.getName());
		auditPlan.setPlanId(auditPlanId);
		auditPlan = super.addAuditPlan(auditPlan);
		resourceLocalService.addResources(auditPlan.getCompanyId(), auditPlan.getGroupId(), userId, 
				AuditPlan.class.getName(), auditPlanId, false, true, true);
		return auditPlan;
	}
	public int getAuditPlanCount(long groupId, long InitAuditId)throws SystemException{
		return auditPlanPersistence.countByG_A(groupId, InitAuditId);
	}
	@Override
	public AuditPlan deleteAuditPlan(AuditPlan auditPlan)throws PortalException, SystemException{
		resourceLocalService.deleteResource(auditPlan.getCompanyId(), AuditPlan.class.getName(), 
				ResourceConstants.SCOPE_INDIVIDUAL, auditPlan.getPrimaryKey());
		return super.deleteAuditPlan(auditPlan);
		
	}
}
