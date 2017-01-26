package syneren.qms.audit.model.impl;

/**
 * The extended model implementation for the AuditCheckItem service. Represents a row in the &quot;audit_AuditCheckItem&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link syneren.qms.audit.model.AuditCheckItem} interface.
 * </p>
 *
 * @author anguyen
 */
public class AuditCheckItemImpl extends AuditCheckItemBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this class directly. All methods that expect a audit check item model instance should use the {@link syneren.qms.audit.model.AuditCheckItem} interface instead.
     */
    public AuditCheckItemImpl() {
    }
    public boolean isEditable() {
		return editable;
	}
	public void setEditable(boolean editable) {
		this.editable = editable;
	}
	private boolean editable;
}
