package syneren.qms.audit.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import syneren.qms.audit.model.AuditFinding;

/**
 * The persistence interface for the audit finding service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author anguyen
 * @see AuditFindingPersistenceImpl
 * @see AuditFindingUtil
 * @generated
 */
public interface AuditFindingPersistence extends BasePersistence<AuditFinding> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link AuditFindingUtil} to access the audit finding persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the audit findings where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching audit findings
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<syneren.qms.audit.model.AuditFinding> findByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the audit findings where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditFindingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of audit findings
    * @param end the upper bound of the range of audit findings (not inclusive)
    * @return the range of matching audit findings
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<syneren.qms.audit.model.AuditFinding> findByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the audit findings where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditFindingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of audit findings
    * @param end the upper bound of the range of audit findings (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching audit findings
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<syneren.qms.audit.model.AuditFinding> findByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first audit finding in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching audit finding
    * @throws syneren.qms.audit.NoSuchAuditFindingException if a matching audit finding could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditFinding findByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditFindingException;

    /**
    * Returns the first audit finding in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching audit finding, or <code>null</code> if a matching audit finding could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditFinding fetchByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last audit finding in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching audit finding
    * @throws syneren.qms.audit.NoSuchAuditFindingException if a matching audit finding could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditFinding findByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditFindingException;

    /**
    * Returns the last audit finding in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching audit finding, or <code>null</code> if a matching audit finding could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditFinding fetchByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the audit findings before and after the current audit finding in the ordered set where groupId = &#63;.
    *
    * @param FindingId the primary key of the current audit finding
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next audit finding
    * @throws syneren.qms.audit.NoSuchAuditFindingException if a audit finding with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditFinding[] findByGroupId_PrevAndNext(
        long FindingId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditFindingException;

    /**
    * Removes all the audit findings where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of audit findings where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching audit findings
    * @throws SystemException if a system exception occurred
    */
    public int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the audit findings where FindingId = &#63;.
    *
    * @param FindingId the finding ID
    * @return the matching audit findings
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<syneren.qms.audit.model.AuditFinding> findByFindingId(
        long FindingId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the audit findings where FindingId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditFindingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param FindingId the finding ID
    * @param start the lower bound of the range of audit findings
    * @param end the upper bound of the range of audit findings (not inclusive)
    * @return the range of matching audit findings
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<syneren.qms.audit.model.AuditFinding> findByFindingId(
        long FindingId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the audit findings where FindingId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditFindingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param FindingId the finding ID
    * @param start the lower bound of the range of audit findings
    * @param end the upper bound of the range of audit findings (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching audit findings
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<syneren.qms.audit.model.AuditFinding> findByFindingId(
        long FindingId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first audit finding in the ordered set where FindingId = &#63;.
    *
    * @param FindingId the finding ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching audit finding
    * @throws syneren.qms.audit.NoSuchAuditFindingException if a matching audit finding could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditFinding findByFindingId_First(
        long FindingId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditFindingException;

    /**
    * Returns the first audit finding in the ordered set where FindingId = &#63;.
    *
    * @param FindingId the finding ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching audit finding, or <code>null</code> if a matching audit finding could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditFinding fetchByFindingId_First(
        long FindingId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last audit finding in the ordered set where FindingId = &#63;.
    *
    * @param FindingId the finding ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching audit finding
    * @throws syneren.qms.audit.NoSuchAuditFindingException if a matching audit finding could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditFinding findByFindingId_Last(
        long FindingId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditFindingException;

    /**
    * Returns the last audit finding in the ordered set where FindingId = &#63;.
    *
    * @param FindingId the finding ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching audit finding, or <code>null</code> if a matching audit finding could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditFinding fetchByFindingId_Last(
        long FindingId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the audit findings where FindingId = &#63; from the database.
    *
    * @param FindingId the finding ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByFindingId(long FindingId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of audit findings where FindingId = &#63;.
    *
    * @param FindingId the finding ID
    * @return the number of matching audit findings
    * @throws SystemException if a system exception occurred
    */
    public int countByFindingId(long FindingId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the audit finding in the entity cache if it is enabled.
    *
    * @param auditFinding the audit finding
    */
    public void cacheResult(syneren.qms.audit.model.AuditFinding auditFinding);

    /**
    * Caches the audit findings in the entity cache if it is enabled.
    *
    * @param auditFindings the audit findings
    */
    public void cacheResult(
        java.util.List<syneren.qms.audit.model.AuditFinding> auditFindings);

    /**
    * Creates a new audit finding with the primary key. Does not add the audit finding to the database.
    *
    * @param FindingId the primary key for the new audit finding
    * @return the new audit finding
    */
    public syneren.qms.audit.model.AuditFinding create(long FindingId);

    /**
    * Removes the audit finding with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param FindingId the primary key of the audit finding
    * @return the audit finding that was removed
    * @throws syneren.qms.audit.NoSuchAuditFindingException if a audit finding with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditFinding remove(long FindingId)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditFindingException;

    public syneren.qms.audit.model.AuditFinding updateImpl(
        syneren.qms.audit.model.AuditFinding auditFinding)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the audit finding with the primary key or throws a {@link syneren.qms.audit.NoSuchAuditFindingException} if it could not be found.
    *
    * @param FindingId the primary key of the audit finding
    * @return the audit finding
    * @throws syneren.qms.audit.NoSuchAuditFindingException if a audit finding with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditFinding findByPrimaryKey(long FindingId)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditFindingException;

    /**
    * Returns the audit finding with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param FindingId the primary key of the audit finding
    * @return the audit finding, or <code>null</code> if a audit finding with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditFinding fetchByPrimaryKey(
        long FindingId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the audit findings.
    *
    * @return the audit findings
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<syneren.qms.audit.model.AuditFinding> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the audit findings.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditFindingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of audit findings
    * @param end the upper bound of the range of audit findings (not inclusive)
    * @return the range of audit findings
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<syneren.qms.audit.model.AuditFinding> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the audit findings.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditFindingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of audit findings
    * @param end the upper bound of the range of audit findings (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of audit findings
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<syneren.qms.audit.model.AuditFinding> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the audit findings from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of audit findings.
    *
    * @return the number of audit findings
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
