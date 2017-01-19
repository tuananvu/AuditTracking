package syneren.qms.audit.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import syneren.qms.audit.model.AuditCheckItem;
import syneren.qms.audit.service.AuditCheckItemLocalServiceUtil;

/**
 * @author anguyen
 * @generated
 */
public abstract class AuditCheckItemActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public AuditCheckItemActionableDynamicQuery() throws SystemException {
        setBaseLocalService(AuditCheckItemLocalServiceUtil.getService());
        setClass(AuditCheckItem.class);

        setClassLoader(syneren.qms.audit.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("CheckItemId");
    }
}
