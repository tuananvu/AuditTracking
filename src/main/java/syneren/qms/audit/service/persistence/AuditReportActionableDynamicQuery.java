package syneren.qms.audit.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import syneren.qms.audit.model.AuditReport;
import syneren.qms.audit.service.AuditReportLocalServiceUtil;

/**
 * @author anguyen
 * @generated
 */
public abstract class AuditReportActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public AuditReportActionableDynamicQuery() throws SystemException {
        setBaseLocalService(AuditReportLocalServiceUtil.getService());
        setClass(AuditReport.class);

        setClassLoader(syneren.qms.audit.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("AuditId");
    }
}
