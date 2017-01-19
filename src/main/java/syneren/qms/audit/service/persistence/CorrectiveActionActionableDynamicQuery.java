package syneren.qms.audit.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import syneren.qms.audit.model.CorrectiveAction;
import syneren.qms.audit.service.CorrectiveActionLocalServiceUtil;

/**
 * @author anguyen
 * @generated
 */
public abstract class CorrectiveActionActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public CorrectiveActionActionableDynamicQuery() throws SystemException {
        setBaseLocalService(CorrectiveActionLocalServiceUtil.getService());
        setClass(CorrectiveAction.class);

        setClassLoader(syneren.qms.audit.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("ActionId");
    }
}
