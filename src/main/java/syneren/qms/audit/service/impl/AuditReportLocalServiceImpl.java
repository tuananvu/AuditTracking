package syneren.qms.audit.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import syneren.qms.audit.model.AuditReport;
import syneren.qms.audit.service.base.AuditReportLocalServiceBaseImpl;

/**
 * The implementation of the audit report local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link syneren.qms.audit.service.AuditReportLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author anguyen
 * @see syneren.qms.audit.service.base.AuditReportLocalServiceBaseImpl
 * @see syneren.qms.audit.service.AuditReportLocalServiceUtil
 */
public class AuditReportLocalServiceImpl extends AuditReportLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link syneren.qms.audit.service.AuditReportLocalServiceUtil} to access the audit report local service.
     */
	public List<AuditReport> getAuditReports(long groupId, long InitAuditId) throws SystemException{
		return auditReportPersistence.findByG_I(groupId, InitAuditId);
	}
	
	public List<AuditReport> getAuditReports(long groupId, long InitAuditId, int start, int end) throws SystemException{
		return auditReportPersistence.findByG_I(groupId, InitAuditId, start, end);
	}
	
	@Override
	public AuditReport addAuditReport(AuditReport auditReport) throws SystemException{
		long auditReportId = counterLocalService.increment(AuditReport.class.getName());
		auditReport.setAuditId(auditReportId);
		return super.addAuditReport(auditReport);
	}
	public int getAuditReportsCount(long groupId, long initAuditId) throws SystemException{
		return auditReportPersistence.countByG_I(groupId, initAuditId);
	}
}
