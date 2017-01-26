package syneren.qms.audit.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import syneren.qms.audit.model.AuditCheckItem;
import syneren.qms.audit.service.base.AuditCheckItemLocalServiceBaseImpl;

/**
 * The implementation of the audit check item local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link syneren.qms.audit.service.AuditCheckItemLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author anguyen
 * @see syneren.qms.audit.service.base.AuditCheckItemLocalServiceBaseImpl
 * @see syneren.qms.audit.service.AuditCheckItemLocalServiceUtil
 */
public class AuditCheckItemLocalServiceImpl
    extends AuditCheckItemLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link syneren.qms.audit.service.AuditCheckItemLocalServiceUtil} to access the audit check item local service.
     */
	public List<AuditCheckItem> getAuditCheckItems(long groupId, long AuditId) throws SystemException{
		return auditCheckItemPersistence.findByG_A(groupId, AuditId);
	}
	public List<AuditCheckItem> getAuditCheckItems(long groupId, long AuditId, int start, int end) throws SystemException{
		return auditCheckItemPersistence.findByG_A(groupId, AuditId, start, end);
	}
	@Override
	public AuditCheckItem addAuditCheckItem(AuditCheckItem auditCheckItem) throws SystemException{
		long checkItemId = counterLocalService.increment(AuditCheckItem.class.getName());
		auditCheckItem.setCheckItemId(checkItemId);
		return super.addAuditCheckItem(auditCheckItem);
	}
	public int getAuditCheckItemsCount(long groupId, long AuditId) throws SystemException{
		return auditCheckItemPersistence.countByG_A(groupId, AuditId);
	}
}
