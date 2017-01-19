package syneren.qms.audit.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import syneren.qms.audit.model.AuditReport;

/**
 * The persistence interface for the audit report service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author anguyen
 * @see AuditReportPersistenceImpl
 * @see AuditReportUtil
 * @generated
 */
public interface AuditReportPersistence extends BasePersistence<AuditReport> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link AuditReportUtil} to access the audit report persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the audit reports where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching audit reports
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<syneren.qms.audit.model.AuditReport> findByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the audit reports where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of audit reports
    * @param end the upper bound of the range of audit reports (not inclusive)
    * @return the range of matching audit reports
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<syneren.qms.audit.model.AuditReport> findByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the audit reports where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of audit reports
    * @param end the upper bound of the range of audit reports (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching audit reports
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<syneren.qms.audit.model.AuditReport> findByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first audit report in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching audit report
    * @throws syneren.qms.audit.NoSuchAuditReportException if a matching audit report could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditReport findByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditReportException;

    /**
    * Returns the first audit report in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching audit report, or <code>null</code> if a matching audit report could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditReport fetchByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last audit report in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching audit report
    * @throws syneren.qms.audit.NoSuchAuditReportException if a matching audit report could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditReport findByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditReportException;

    /**
    * Returns the last audit report in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching audit report, or <code>null</code> if a matching audit report could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditReport fetchByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the audit reports before and after the current audit report in the ordered set where groupId = &#63;.
    *
    * @param AuditId the primary key of the current audit report
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next audit report
    * @throws syneren.qms.audit.NoSuchAuditReportException if a audit report with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditReport[] findByGroupId_PrevAndNext(
        long AuditId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditReportException;

    /**
    * Removes all the audit reports where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of audit reports where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching audit reports
    * @throws SystemException if a system exception occurred
    */
    public int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the audit reports where AuditId = &#63;.
    *
    * @param AuditId the audit ID
    * @return the matching audit reports
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<syneren.qms.audit.model.AuditReport> findByAuditId(
        long AuditId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the audit reports where AuditId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param AuditId the audit ID
    * @param start the lower bound of the range of audit reports
    * @param end the upper bound of the range of audit reports (not inclusive)
    * @return the range of matching audit reports
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<syneren.qms.audit.model.AuditReport> findByAuditId(
        long AuditId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the audit reports where AuditId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param AuditId the audit ID
    * @param start the lower bound of the range of audit reports
    * @param end the upper bound of the range of audit reports (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching audit reports
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<syneren.qms.audit.model.AuditReport> findByAuditId(
        long AuditId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first audit report in the ordered set where AuditId = &#63;.
    *
    * @param AuditId the audit ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching audit report
    * @throws syneren.qms.audit.NoSuchAuditReportException if a matching audit report could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditReport findByAuditId_First(
        long AuditId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditReportException;

    /**
    * Returns the first audit report in the ordered set where AuditId = &#63;.
    *
    * @param AuditId the audit ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching audit report, or <code>null</code> if a matching audit report could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditReport fetchByAuditId_First(
        long AuditId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last audit report in the ordered set where AuditId = &#63;.
    *
    * @param AuditId the audit ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching audit report
    * @throws syneren.qms.audit.NoSuchAuditReportException if a matching audit report could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditReport findByAuditId_Last(
        long AuditId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditReportException;

    /**
    * Returns the last audit report in the ordered set where AuditId = &#63;.
    *
    * @param AuditId the audit ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching audit report, or <code>null</code> if a matching audit report could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditReport fetchByAuditId_Last(
        long AuditId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the audit reports where AuditId = &#63; from the database.
    *
    * @param AuditId the audit ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByAuditId(long AuditId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of audit reports where AuditId = &#63;.
    *
    * @param AuditId the audit ID
    * @return the number of matching audit reports
    * @throws SystemException if a system exception occurred
    */
    public int countByAuditId(long AuditId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the audit report in the entity cache if it is enabled.
    *
    * @param auditReport the audit report
    */
    public void cacheResult(syneren.qms.audit.model.AuditReport auditReport);

    /**
    * Caches the audit reports in the entity cache if it is enabled.
    *
    * @param auditReports the audit reports
    */
    public void cacheResult(
        java.util.List<syneren.qms.audit.model.AuditReport> auditReports);

    /**
    * Creates a new audit report with the primary key. Does not add the audit report to the database.
    *
    * @param AuditId the primary key for the new audit report
    * @return the new audit report
    */
    public syneren.qms.audit.model.AuditReport create(long AuditId);

    /**
    * Removes the audit report with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param AuditId the primary key of the audit report
    * @return the audit report that was removed
    * @throws syneren.qms.audit.NoSuchAuditReportException if a audit report with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditReport remove(long AuditId)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditReportException;

    public syneren.qms.audit.model.AuditReport updateImpl(
        syneren.qms.audit.model.AuditReport auditReport)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the audit report with the primary key or throws a {@link syneren.qms.audit.NoSuchAuditReportException} if it could not be found.
    *
    * @param AuditId the primary key of the audit report
    * @return the audit report
    * @throws syneren.qms.audit.NoSuchAuditReportException if a audit report with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditReport findByPrimaryKey(long AuditId)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditReportException;

    /**
    * Returns the audit report with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param AuditId the primary key of the audit report
    * @return the audit report, or <code>null</code> if a audit report with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditReport fetchByPrimaryKey(long AuditId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the audit reports.
    *
    * @return the audit reports
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<syneren.qms.audit.model.AuditReport> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the audit reports.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of audit reports
    * @param end the upper bound of the range of audit reports (not inclusive)
    * @return the range of audit reports
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<syneren.qms.audit.model.AuditReport> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the audit reports.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of audit reports
    * @param end the upper bound of the range of audit reports (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of audit reports
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<syneren.qms.audit.model.AuditReport> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the audit reports from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of audit reports.
    *
    * @return the number of audit reports
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
