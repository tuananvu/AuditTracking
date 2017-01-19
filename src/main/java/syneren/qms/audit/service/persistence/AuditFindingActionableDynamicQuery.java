package syneren.qms.audit.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import syneren.qms.audit.model.AuditFinding;
import syneren.qms.audit.service.AuditFindingLocalServiceUtil;

/**
 * @author anguyen
 * @generated
 */
public abstract class AuditFindingActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public AuditFindingActionableDynamicQuery() throws SystemException {
        setBaseLocalService(AuditFindingLocalServiceUtil.getService());
        setClass(AuditFinding.class);

        setClassLoader(syneren.qms.audit.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("FindingId");
    }
}
