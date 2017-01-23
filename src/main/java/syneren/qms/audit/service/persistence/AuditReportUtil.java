package syneren.qms.audit.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import syneren.qms.audit.model.AuditReport;

import java.util.List;

/**
 * The persistence utility for the audit report service. This utility wraps {@link AuditReportPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author anguyen
 * @see AuditReportPersistence
 * @see AuditReportPersistenceImpl
 * @generated
 */
public class AuditReportUtil {
    private static AuditReportPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(AuditReport auditReport) {
        getPersistence().clearCache(auditReport);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<AuditReport> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<AuditReport> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<AuditReport> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static AuditReport update(AuditReport auditReport)
        throws SystemException {
        return getPersistence().update(auditReport);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static AuditReport update(AuditReport auditReport,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(auditReport, serviceContext);
    }

    /**
    * Returns all the audit reports where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching audit reports
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.AuditReport> findByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId(groupId);
    }

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
    public static java.util.List<syneren.qms.audit.model.AuditReport> findByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId(groupId, start, end);
    }

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
    public static java.util.List<syneren.qms.audit.model.AuditReport> findByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByGroupId(groupId, start, end, orderByComparator);
    }

    /**
    * Returns the first audit report in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching audit report
    * @throws syneren.qms.audit.NoSuchAuditReportException if a matching audit report could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditReport findByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditReportException {
        return getPersistence().findByGroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the first audit report in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching audit report, or <code>null</code> if a matching audit report could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditReport fetchByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the last audit report in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching audit report
    * @throws syneren.qms.audit.NoSuchAuditReportException if a matching audit report could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditReport findByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditReportException {
        return getPersistence().findByGroupId_Last(groupId, orderByComparator);
    }

    /**
    * Returns the last audit report in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching audit report, or <code>null</code> if a matching audit report could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditReport fetchByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
    }

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
    public static syneren.qms.audit.model.AuditReport[] findByGroupId_PrevAndNext(
        long AuditId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditReportException {
        return getPersistence()
                   .findByGroupId_PrevAndNext(AuditId, groupId,
            orderByComparator);
    }

    /**
    * Removes all the audit reports where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByGroupId(groupId);
    }

    /**
    * Returns the number of audit reports where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching audit reports
    * @throws SystemException if a system exception occurred
    */
    public static int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByGroupId(groupId);
    }

    /**
    * Returns all the audit reports where AuditId = &#63;.
    *
    * @param AuditId the audit ID
    * @return the matching audit reports
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.AuditReport> findByAuditId(
        long AuditId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByAuditId(AuditId);
    }

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
    public static java.util.List<syneren.qms.audit.model.AuditReport> findByAuditId(
        long AuditId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByAuditId(AuditId, start, end);
    }

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
    public static java.util.List<syneren.qms.audit.model.AuditReport> findByAuditId(
        long AuditId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByAuditId(AuditId, start, end, orderByComparator);
    }

    /**
    * Returns the first audit report in the ordered set where AuditId = &#63;.
    *
    * @param AuditId the audit ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching audit report
    * @throws syneren.qms.audit.NoSuchAuditReportException if a matching audit report could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditReport findByAuditId_First(
        long AuditId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditReportException {
        return getPersistence().findByAuditId_First(AuditId, orderByComparator);
    }

    /**
    * Returns the first audit report in the ordered set where AuditId = &#63;.
    *
    * @param AuditId the audit ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching audit report, or <code>null</code> if a matching audit report could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditReport fetchByAuditId_First(
        long AuditId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByAuditId_First(AuditId, orderByComparator);
    }

    /**
    * Returns the last audit report in the ordered set where AuditId = &#63;.
    *
    * @param AuditId the audit ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching audit report
    * @throws syneren.qms.audit.NoSuchAuditReportException if a matching audit report could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditReport findByAuditId_Last(
        long AuditId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditReportException {
        return getPersistence().findByAuditId_Last(AuditId, orderByComparator);
    }

    /**
    * Returns the last audit report in the ordered set where AuditId = &#63;.
    *
    * @param AuditId the audit ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching audit report, or <code>null</code> if a matching audit report could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditReport fetchByAuditId_Last(
        long AuditId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByAuditId_Last(AuditId, orderByComparator);
    }

    /**
    * Removes all the audit reports where AuditId = &#63; from the database.
    *
    * @param AuditId the audit ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByAuditId(long AuditId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByAuditId(AuditId);
    }

    /**
    * Returns the number of audit reports where AuditId = &#63;.
    *
    * @param AuditId the audit ID
    * @return the number of matching audit reports
    * @throws SystemException if a system exception occurred
    */
    public static int countByAuditId(long AuditId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByAuditId(AuditId);
    }

    /**
    * Returns all the audit reports where groupId = &#63; and InitAuditId = &#63;.
    *
    * @param groupId the group ID
    * @param InitAuditId the init audit ID
    * @return the matching audit reports
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.AuditReport> findByG_I(
        long groupId, long InitAuditId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_I(groupId, InitAuditId);
    }

    /**
    * Returns a range of all the audit reports where groupId = &#63; and InitAuditId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param InitAuditId the init audit ID
    * @param start the lower bound of the range of audit reports
    * @param end the upper bound of the range of audit reports (not inclusive)
    * @return the range of matching audit reports
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.AuditReport> findByG_I(
        long groupId, long InitAuditId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_I(groupId, InitAuditId, start, end);
    }

    /**
    * Returns an ordered range of all the audit reports where groupId = &#63; and InitAuditId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param InitAuditId the init audit ID
    * @param start the lower bound of the range of audit reports
    * @param end the upper bound of the range of audit reports (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching audit reports
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.AuditReport> findByG_I(
        long groupId, long InitAuditId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_I(groupId, InitAuditId, start, end,
            orderByComparator);
    }

    /**
    * Returns the first audit report in the ordered set where groupId = &#63; and InitAuditId = &#63;.
    *
    * @param groupId the group ID
    * @param InitAuditId the init audit ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching audit report
    * @throws syneren.qms.audit.NoSuchAuditReportException if a matching audit report could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditReport findByG_I_First(
        long groupId, long InitAuditId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditReportException {
        return getPersistence()
                   .findByG_I_First(groupId, InitAuditId, orderByComparator);
    }

    /**
    * Returns the first audit report in the ordered set where groupId = &#63; and InitAuditId = &#63;.
    *
    * @param groupId the group ID
    * @param InitAuditId the init audit ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching audit report, or <code>null</code> if a matching audit report could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditReport fetchByG_I_First(
        long groupId, long InitAuditId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_I_First(groupId, InitAuditId, orderByComparator);
    }

    /**
    * Returns the last audit report in the ordered set where groupId = &#63; and InitAuditId = &#63;.
    *
    * @param groupId the group ID
    * @param InitAuditId the init audit ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching audit report
    * @throws syneren.qms.audit.NoSuchAuditReportException if a matching audit report could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditReport findByG_I_Last(
        long groupId, long InitAuditId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditReportException {
        return getPersistence()
                   .findByG_I_Last(groupId, InitAuditId, orderByComparator);
    }

    /**
    * Returns the last audit report in the ordered set where groupId = &#63; and InitAuditId = &#63;.
    *
    * @param groupId the group ID
    * @param InitAuditId the init audit ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching audit report, or <code>null</code> if a matching audit report could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditReport fetchByG_I_Last(
        long groupId, long InitAuditId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_I_Last(groupId, InitAuditId, orderByComparator);
    }

    /**
    * Returns the audit reports before and after the current audit report in the ordered set where groupId = &#63; and InitAuditId = &#63;.
    *
    * @param AuditId the primary key of the current audit report
    * @param groupId the group ID
    * @param InitAuditId the init audit ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next audit report
    * @throws syneren.qms.audit.NoSuchAuditReportException if a audit report with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditReport[] findByG_I_PrevAndNext(
        long AuditId, long groupId, long InitAuditId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditReportException {
        return getPersistence()
                   .findByG_I_PrevAndNext(AuditId, groupId, InitAuditId,
            orderByComparator);
    }

    /**
    * Removes all the audit reports where groupId = &#63; and InitAuditId = &#63; from the database.
    *
    * @param groupId the group ID
    * @param InitAuditId the init audit ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByG_I(long groupId, long InitAuditId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByG_I(groupId, InitAuditId);
    }

    /**
    * Returns the number of audit reports where groupId = &#63; and InitAuditId = &#63;.
    *
    * @param groupId the group ID
    * @param InitAuditId the init audit ID
    * @return the number of matching audit reports
    * @throws SystemException if a system exception occurred
    */
    public static int countByG_I(long groupId, long InitAuditId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByG_I(groupId, InitAuditId);
    }

    /**
    * Caches the audit report in the entity cache if it is enabled.
    *
    * @param auditReport the audit report
    */
    public static void cacheResult(
        syneren.qms.audit.model.AuditReport auditReport) {
        getPersistence().cacheResult(auditReport);
    }

    /**
    * Caches the audit reports in the entity cache if it is enabled.
    *
    * @param auditReports the audit reports
    */
    public static void cacheResult(
        java.util.List<syneren.qms.audit.model.AuditReport> auditReports) {
        getPersistence().cacheResult(auditReports);
    }

    /**
    * Creates a new audit report with the primary key. Does not add the audit report to the database.
    *
    * @param AuditId the primary key for the new audit report
    * @return the new audit report
    */
    public static syneren.qms.audit.model.AuditReport create(long AuditId) {
        return getPersistence().create(AuditId);
    }

    /**
    * Removes the audit report with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param AuditId the primary key of the audit report
    * @return the audit report that was removed
    * @throws syneren.qms.audit.NoSuchAuditReportException if a audit report with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditReport remove(long AuditId)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditReportException {
        return getPersistence().remove(AuditId);
    }

    public static syneren.qms.audit.model.AuditReport updateImpl(
        syneren.qms.audit.model.AuditReport auditReport)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(auditReport);
    }

    /**
    * Returns the audit report with the primary key or throws a {@link syneren.qms.audit.NoSuchAuditReportException} if it could not be found.
    *
    * @param AuditId the primary key of the audit report
    * @return the audit report
    * @throws syneren.qms.audit.NoSuchAuditReportException if a audit report with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditReport findByPrimaryKey(
        long AuditId)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditReportException {
        return getPersistence().findByPrimaryKey(AuditId);
    }

    /**
    * Returns the audit report with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param AuditId the primary key of the audit report
    * @return the audit report, or <code>null</code> if a audit report with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditReport fetchByPrimaryKey(
        long AuditId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(AuditId);
    }

    /**
    * Returns all the audit reports.
    *
    * @return the audit reports
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.AuditReport> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

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
    public static java.util.List<syneren.qms.audit.model.AuditReport> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<syneren.qms.audit.model.AuditReport> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the audit reports from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of audit reports.
    *
    * @return the number of audit reports
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static AuditReportPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (AuditReportPersistence) PortletBeanLocatorUtil.locate(syneren.qms.audit.service.ClpSerializer.getServletContextName(),
                    AuditReportPersistence.class.getName());

            ReferenceRegistry.registerReference(AuditReportUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(AuditReportPersistence persistence) {
    }
}
