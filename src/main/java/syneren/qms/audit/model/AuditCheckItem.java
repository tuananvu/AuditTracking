package syneren.qms.audit.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the AuditCheckItem service. Represents a row in the &quot;AuditCheckItem&quot; database table, with each column mapped to a property of this class.
 *
 * @author anguyen
 * @see AuditCheckItemModel
 * @see syneren.qms.audit.model.impl.AuditCheckItemImpl
 * @see syneren.qms.audit.model.impl.AuditCheckItemModelImpl
 * @generated
 */
public interface AuditCheckItem extends AuditCheckItemModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link syneren.qms.audit.model.impl.AuditCheckItemImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public boolean isEditable();

    public void setEditable(boolean editable);
}
