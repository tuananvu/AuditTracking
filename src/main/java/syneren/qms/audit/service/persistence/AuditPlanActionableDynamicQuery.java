package syneren.qms.audit.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import syneren.qms.audit.model.AuditPlan;
import syneren.qms.audit.service.AuditPlanLocalServiceUtil;

/**
 * @author anguyen
 * @generated
 */
public abstract class AuditPlanActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public AuditPlanActionableDynamicQuery() throws SystemException {
        setBaseLocalService(AuditPlanLocalServiceUtil.getService());
        setClass(AuditPlan.class);

        setClassLoader(syneren.qms.audit.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("PlanId");
    }
}
