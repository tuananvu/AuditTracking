package syneren.qms.audit.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import syneren.qms.audit.model.InitAudit;
import syneren.qms.audit.service.InitAuditLocalServiceUtil;

/**
 * @author anguyen
 * @generated
 */
public abstract class InitAuditActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public InitAuditActionableDynamicQuery() throws SystemException {
        setBaseLocalService(InitAuditLocalServiceUtil.getService());
        setClass(InitAudit.class);

        setClassLoader(syneren.qms.audit.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("InitAuditId");
    }
}
