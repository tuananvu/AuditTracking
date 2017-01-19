package syneren.qms.audit.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import syneren.qms.audit.model.AuditPlan;
import syneren.qms.audit.service.AuditPlanLocalServiceUtil;

/**
 * The extended model base implementation for the AuditPlan service. Represents a row in the &quot;AuditPlan&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AuditPlanImpl}.
 * </p>
 *
 * @author anguyen
 * @see AuditPlanImpl
 * @see syneren.qms.audit.model.AuditPlan
 * @generated
 */
public abstract class AuditPlanBaseImpl extends AuditPlanModelImpl
    implements AuditPlan {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a audit plan model instance should use the {@link AuditPlan} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            AuditPlanLocalServiceUtil.addAuditPlan(this);
        } else {
            AuditPlanLocalServiceUtil.updateAuditPlan(this);
        }
    }
}
