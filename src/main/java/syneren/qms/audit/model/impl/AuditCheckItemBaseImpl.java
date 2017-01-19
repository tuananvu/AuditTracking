package syneren.qms.audit.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import syneren.qms.audit.model.AuditCheckItem;
import syneren.qms.audit.service.AuditCheckItemLocalServiceUtil;

/**
 * The extended model base implementation for the AuditCheckItem service. Represents a row in the &quot;AuditCheckItem&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AuditCheckItemImpl}.
 * </p>
 *
 * @author anguyen
 * @see AuditCheckItemImpl
 * @see syneren.qms.audit.model.AuditCheckItem
 * @generated
 */
public abstract class AuditCheckItemBaseImpl extends AuditCheckItemModelImpl
    implements AuditCheckItem {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a audit check item model instance should use the {@link AuditCheckItem} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            AuditCheckItemLocalServiceUtil.addAuditCheckItem(this);
        } else {
            AuditCheckItemLocalServiceUtil.updateAuditCheckItem(this);
        }
    }
}
