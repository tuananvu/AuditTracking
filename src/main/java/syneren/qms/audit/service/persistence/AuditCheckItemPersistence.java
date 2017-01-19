package syneren.qms.audit.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import syneren.qms.audit.model.AuditCheckItem;

/**
 * The persistence interface for the audit check item service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author anguyen
 * @see AuditCheckItemPersistenceImpl
 * @see AuditCheckItemUtil
 * @generated
 */
public interface AuditCheckItemPersistence extends BasePersistence<AuditCheckItem> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link AuditCheckItemUtil} to access the audit check item persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the audit check items where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching audit check items
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<syneren.qms.audit.model.AuditCheckItem> findByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the audit check items where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditCheckItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of audit check items
    * @param end the upper bound of the range of audit check items (not inclusive)
    * @return the range of matching audit check items
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<syneren.qms.audit.model.AuditCheckItem> findByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the audit check items where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditCheckItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of audit check items
    * @param end the upper bound of the range of audit check items (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching audit check items
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<syneren.qms.audit.model.AuditCheckItem> findByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first audit check item in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching audit check item
    * @throws syneren.qms.audit.NoSuchAuditCheckItemException if a matching audit check item could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditCheckItem findByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditCheckItemException;

    /**
    * Returns the first audit check item in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching audit check item, or <code>null</code> if a matching audit check item could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditCheckItem fetchByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last audit check item in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching audit check item
    * @throws syneren.qms.audit.NoSuchAuditCheckItemException if a matching audit check item could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditCheckItem findByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditCheckItemException;

    /**
    * Returns the last audit check item in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching audit check item, or <code>null</code> if a matching audit check item could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditCheckItem fetchByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the audit check items before and after the current audit check item in the ordered set where groupId = &#63;.
    *
    * @param CheckItemId the primary key of the current audit check item
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next audit check item
    * @throws syneren.qms.audit.NoSuchAuditCheckItemException if a audit check item with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditCheckItem[] findByGroupId_PrevAndNext(
        long CheckItemId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditCheckItemException;

    /**
    * Removes all the audit check items where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of audit check items where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching audit check items
    * @throws SystemException if a system exception occurred
    */
    public int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the audit check items where CheckItemId = &#63;.
    *
    * @param CheckItemId the check item ID
    * @return the matching audit check items
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<syneren.qms.audit.model.AuditCheckItem> findByCheckItemId(
        long CheckItemId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the audit check items where CheckItemId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditCheckItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param CheckItemId the check item ID
    * @param start the lower bound of the range of audit check items
    * @param end the upper bound of the range of audit check items (not inclusive)
    * @return the range of matching audit check items
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<syneren.qms.audit.model.AuditCheckItem> findByCheckItemId(
        long CheckItemId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the audit check items where CheckItemId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditCheckItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param CheckItemId the check item ID
    * @param start the lower bound of the range of audit check items
    * @param end the upper bound of the range of audit check items (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching audit check items
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<syneren.qms.audit.model.AuditCheckItem> findByCheckItemId(
        long CheckItemId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first audit check item in the ordered set where CheckItemId = &#63;.
    *
    * @param CheckItemId the check item ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching audit check item
    * @throws syneren.qms.audit.NoSuchAuditCheckItemException if a matching audit check item could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditCheckItem findByCheckItemId_First(
        long CheckItemId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditCheckItemException;

    /**
    * Returns the first audit check item in the ordered set where CheckItemId = &#63;.
    *
    * @param CheckItemId the check item ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching audit check item, or <code>null</code> if a matching audit check item could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditCheckItem fetchByCheckItemId_First(
        long CheckItemId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last audit check item in the ordered set where CheckItemId = &#63;.
    *
    * @param CheckItemId the check item ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching audit check item
    * @throws syneren.qms.audit.NoSuchAuditCheckItemException if a matching audit check item could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditCheckItem findByCheckItemId_Last(
        long CheckItemId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditCheckItemException;

    /**
    * Returns the last audit check item in the ordered set where CheckItemId = &#63;.
    *
    * @param CheckItemId the check item ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching audit check item, or <code>null</code> if a matching audit check item could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditCheckItem fetchByCheckItemId_Last(
        long CheckItemId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the audit check items where CheckItemId = &#63; from the database.
    *
    * @param CheckItemId the check item ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByCheckItemId(long CheckItemId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of audit check items where CheckItemId = &#63;.
    *
    * @param CheckItemId the check item ID
    * @return the number of matching audit check items
    * @throws SystemException if a system exception occurred
    */
    public int countByCheckItemId(long CheckItemId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the audit check item in the entity cache if it is enabled.
    *
    * @param auditCheckItem the audit check item
    */
    public void cacheResult(
        syneren.qms.audit.model.AuditCheckItem auditCheckItem);

    /**
    * Caches the audit check items in the entity cache if it is enabled.
    *
    * @param auditCheckItems the audit check items
    */
    public void cacheResult(
        java.util.List<syneren.qms.audit.model.AuditCheckItem> auditCheckItems);

    /**
    * Creates a new audit check item with the primary key. Does not add the audit check item to the database.
    *
    * @param CheckItemId the primary key for the new audit check item
    * @return the new audit check item
    */
    public syneren.qms.audit.model.AuditCheckItem create(long CheckItemId);

    /**
    * Removes the audit check item with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param CheckItemId the primary key of the audit check item
    * @return the audit check item that was removed
    * @throws syneren.qms.audit.NoSuchAuditCheckItemException if a audit check item with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditCheckItem remove(long CheckItemId)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditCheckItemException;

    public syneren.qms.audit.model.AuditCheckItem updateImpl(
        syneren.qms.audit.model.AuditCheckItem auditCheckItem)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the audit check item with the primary key or throws a {@link syneren.qms.audit.NoSuchAuditCheckItemException} if it could not be found.
    *
    * @param CheckItemId the primary key of the audit check item
    * @return the audit check item
    * @throws syneren.qms.audit.NoSuchAuditCheckItemException if a audit check item with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditCheckItem findByPrimaryKey(
        long CheckItemId)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditCheckItemException;

    /**
    * Returns the audit check item with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param CheckItemId the primary key of the audit check item
    * @return the audit check item, or <code>null</code> if a audit check item with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditCheckItem fetchByPrimaryKey(
        long CheckItemId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the audit check items.
    *
    * @return the audit check items
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<syneren.qms.audit.model.AuditCheckItem> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the audit check items.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditCheckItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of audit check items
    * @param end the upper bound of the range of audit check items (not inclusive)
    * @return the range of audit check items
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<syneren.qms.audit.model.AuditCheckItem> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the audit check items.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditCheckItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of audit check items
    * @param end the upper bound of the range of audit check items (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of audit check items
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<syneren.qms.audit.model.AuditCheckItem> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the audit check items from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of audit check items.
    *
    * @return the number of audit check items
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
