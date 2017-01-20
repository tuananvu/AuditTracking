package syneren.qms.audit.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import syneren.qms.audit.model.AuditFinding;

import java.util.List;

/**
 * The persistence utility for the audit finding service. This utility wraps {@link AuditFindingPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author anguyen
 * @see AuditFindingPersistence
 * @see AuditFindingPersistenceImpl
 * @generated
 */
public class AuditFindingUtil {
    private static AuditFindingPersistence _persistence;

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
    public static void clearCache(AuditFinding auditFinding) {
        getPersistence().clearCache(auditFinding);
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
    public static List<AuditFinding> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<AuditFinding> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<AuditFinding> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static AuditFinding update(AuditFinding auditFinding)
        throws SystemException {
        return getPersistence().update(auditFinding);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static AuditFinding update(AuditFinding auditFinding,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(auditFinding, serviceContext);
    }

    /**
    * Returns all the audit findings where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching audit findings
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.AuditFinding> findByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId(groupId);
    }

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
    public static java.util.List<syneren.qms.audit.model.AuditFinding> findByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId(groupId, start, end);
    }

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
    public static java.util.List<syneren.qms.audit.model.AuditFinding> findByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByGroupId(groupId, start, end, orderByComparator);
    }

    /**
    * Returns the first audit finding in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching audit finding
    * @throws syneren.qms.audit.NoSuchAuditFindingException if a matching audit finding could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditFinding findByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditFindingException {
        return getPersistence().findByGroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the first audit finding in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching audit finding, or <code>null</code> if a matching audit finding could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditFinding fetchByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the last audit finding in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching audit finding
    * @throws syneren.qms.audit.NoSuchAuditFindingException if a matching audit finding could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditFinding findByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditFindingException {
        return getPersistence().findByGroupId_Last(groupId, orderByComparator);
    }

    /**
    * Returns the last audit finding in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching audit finding, or <code>null</code> if a matching audit finding could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditFinding fetchByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
    }

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
    public static syneren.qms.audit.model.AuditFinding[] findByGroupId_PrevAndNext(
        long FindingId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditFindingException {
        return getPersistence()
                   .findByGroupId_PrevAndNext(FindingId, groupId,
            orderByComparator);
    }

    /**
    * Removes all the audit findings where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByGroupId(groupId);
    }

    /**
    * Returns the number of audit findings where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching audit findings
    * @throws SystemException if a system exception occurred
    */
    public static int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByGroupId(groupId);
    }

    /**
    * Returns all the audit findings where FindingId = &#63;.
    *
    * @param FindingId the finding ID
    * @return the matching audit findings
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.AuditFinding> findByFindingId(
        long FindingId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByFindingId(FindingId);
    }

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
    public static java.util.List<syneren.qms.audit.model.AuditFinding> findByFindingId(
        long FindingId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByFindingId(FindingId, start, end);
    }

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
    public static java.util.List<syneren.qms.audit.model.AuditFinding> findByFindingId(
        long FindingId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByFindingId(FindingId, start, end, orderByComparator);
    }

    /**
    * Returns the first audit finding in the ordered set where FindingId = &#63;.
    *
    * @param FindingId the finding ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching audit finding
    * @throws syneren.qms.audit.NoSuchAuditFindingException if a matching audit finding could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditFinding findByFindingId_First(
        long FindingId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditFindingException {
        return getPersistence()
                   .findByFindingId_First(FindingId, orderByComparator);
    }

    /**
    * Returns the first audit finding in the ordered set where FindingId = &#63;.
    *
    * @param FindingId the finding ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching audit finding, or <code>null</code> if a matching audit finding could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditFinding fetchByFindingId_First(
        long FindingId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByFindingId_First(FindingId, orderByComparator);
    }

    /**
    * Returns the last audit finding in the ordered set where FindingId = &#63;.
    *
    * @param FindingId the finding ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching audit finding
    * @throws syneren.qms.audit.NoSuchAuditFindingException if a matching audit finding could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditFinding findByFindingId_Last(
        long FindingId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditFindingException {
        return getPersistence()
                   .findByFindingId_Last(FindingId, orderByComparator);
    }

    /**
    * Returns the last audit finding in the ordered set where FindingId = &#63;.
    *
    * @param FindingId the finding ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching audit finding, or <code>null</code> if a matching audit finding could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditFinding fetchByFindingId_Last(
        long FindingId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByFindingId_Last(FindingId, orderByComparator);
    }

    /**
    * Removes all the audit findings where FindingId = &#63; from the database.
    *
    * @param FindingId the finding ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByFindingId(long FindingId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByFindingId(FindingId);
    }

    /**
    * Returns the number of audit findings where FindingId = &#63;.
    *
    * @param FindingId the finding ID
    * @return the number of matching audit findings
    * @throws SystemException if a system exception occurred
    */
    public static int countByFindingId(long FindingId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByFindingId(FindingId);
    }

    /**
    * Returns all the audit findings where groupId = &#63; and PlanId = &#63;.
    *
    * @param groupId the group ID
    * @param PlanId the plan ID
    * @return the matching audit findings
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.AuditFinding> findByG_P(
        long groupId, long PlanId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_P(groupId, PlanId);
    }

    /**
    * Returns a range of all the audit findings where groupId = &#63; and PlanId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditFindingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param PlanId the plan ID
    * @param start the lower bound of the range of audit findings
    * @param end the upper bound of the range of audit findings (not inclusive)
    * @return the range of matching audit findings
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.AuditFinding> findByG_P(
        long groupId, long PlanId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_P(groupId, PlanId, start, end);
    }

    /**
    * Returns an ordered range of all the audit findings where groupId = &#63; and PlanId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditFindingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param PlanId the plan ID
    * @param start the lower bound of the range of audit findings
    * @param end the upper bound of the range of audit findings (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching audit findings
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.AuditFinding> findByG_P(
        long groupId, long PlanId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_P(groupId, PlanId, start, end, orderByComparator);
    }

    /**
    * Returns the first audit finding in the ordered set where groupId = &#63; and PlanId = &#63;.
    *
    * @param groupId the group ID
    * @param PlanId the plan ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching audit finding
    * @throws syneren.qms.audit.NoSuchAuditFindingException if a matching audit finding could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditFinding findByG_P_First(
        long groupId, long PlanId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditFindingException {
        return getPersistence()
                   .findByG_P_First(groupId, PlanId, orderByComparator);
    }

    /**
    * Returns the first audit finding in the ordered set where groupId = &#63; and PlanId = &#63;.
    *
    * @param groupId the group ID
    * @param PlanId the plan ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching audit finding, or <code>null</code> if a matching audit finding could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditFinding fetchByG_P_First(
        long groupId, long PlanId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_P_First(groupId, PlanId, orderByComparator);
    }

    /**
    * Returns the last audit finding in the ordered set where groupId = &#63; and PlanId = &#63;.
    *
    * @param groupId the group ID
    * @param PlanId the plan ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching audit finding
    * @throws syneren.qms.audit.NoSuchAuditFindingException if a matching audit finding could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditFinding findByG_P_Last(
        long groupId, long PlanId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditFindingException {
        return getPersistence()
                   .findByG_P_Last(groupId, PlanId, orderByComparator);
    }

    /**
    * Returns the last audit finding in the ordered set where groupId = &#63; and PlanId = &#63;.
    *
    * @param groupId the group ID
    * @param PlanId the plan ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching audit finding, or <code>null</code> if a matching audit finding could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditFinding fetchByG_P_Last(
        long groupId, long PlanId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_P_Last(groupId, PlanId, orderByComparator);
    }

    /**
    * Returns the audit findings before and after the current audit finding in the ordered set where groupId = &#63; and PlanId = &#63;.
    *
    * @param FindingId the primary key of the current audit finding
    * @param groupId the group ID
    * @param PlanId the plan ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next audit finding
    * @throws syneren.qms.audit.NoSuchAuditFindingException if a audit finding with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditFinding[] findByG_P_PrevAndNext(
        long FindingId, long groupId, long PlanId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditFindingException {
        return getPersistence()
                   .findByG_P_PrevAndNext(FindingId, groupId, PlanId,
            orderByComparator);
    }

    /**
    * Removes all the audit findings where groupId = &#63; and PlanId = &#63; from the database.
    *
    * @param groupId the group ID
    * @param PlanId the plan ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByG_P(long groupId, long PlanId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByG_P(groupId, PlanId);
    }

    /**
    * Returns the number of audit findings where groupId = &#63; and PlanId = &#63;.
    *
    * @param groupId the group ID
    * @param PlanId the plan ID
    * @return the number of matching audit findings
    * @throws SystemException if a system exception occurred
    */
    public static int countByG_P(long groupId, long PlanId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByG_P(groupId, PlanId);
    }

    /**
    * Caches the audit finding in the entity cache if it is enabled.
    *
    * @param auditFinding the audit finding
    */
    public static void cacheResult(
        syneren.qms.audit.model.AuditFinding auditFinding) {
        getPersistence().cacheResult(auditFinding);
    }

    /**
    * Caches the audit findings in the entity cache if it is enabled.
    *
    * @param auditFindings the audit findings
    */
    public static void cacheResult(
        java.util.List<syneren.qms.audit.model.AuditFinding> auditFindings) {
        getPersistence().cacheResult(auditFindings);
    }

    /**
    * Creates a new audit finding with the primary key. Does not add the audit finding to the database.
    *
    * @param FindingId the primary key for the new audit finding
    * @return the new audit finding
    */
    public static syneren.qms.audit.model.AuditFinding create(long FindingId) {
        return getPersistence().create(FindingId);
    }

    /**
    * Removes the audit finding with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param FindingId the primary key of the audit finding
    * @return the audit finding that was removed
    * @throws syneren.qms.audit.NoSuchAuditFindingException if a audit finding with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditFinding remove(long FindingId)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditFindingException {
        return getPersistence().remove(FindingId);
    }

    public static syneren.qms.audit.model.AuditFinding updateImpl(
        syneren.qms.audit.model.AuditFinding auditFinding)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(auditFinding);
    }

    /**
    * Returns the audit finding with the primary key or throws a {@link syneren.qms.audit.NoSuchAuditFindingException} if it could not be found.
    *
    * @param FindingId the primary key of the audit finding
    * @return the audit finding
    * @throws syneren.qms.audit.NoSuchAuditFindingException if a audit finding with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditFinding findByPrimaryKey(
        long FindingId)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditFindingException {
        return getPersistence().findByPrimaryKey(FindingId);
    }

    /**
    * Returns the audit finding with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param FindingId the primary key of the audit finding
    * @return the audit finding, or <code>null</code> if a audit finding with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditFinding fetchByPrimaryKey(
        long FindingId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(FindingId);
    }

    /**
    * Returns all the audit findings.
    *
    * @return the audit findings
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.AuditFinding> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

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
    public static java.util.List<syneren.qms.audit.model.AuditFinding> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<syneren.qms.audit.model.AuditFinding> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the audit findings from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of audit findings.
    *
    * @return the number of audit findings
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static AuditFindingPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (AuditFindingPersistence) PortletBeanLocatorUtil.locate(syneren.qms.audit.service.ClpSerializer.getServletContextName(),
                    AuditFindingPersistence.class.getName());

            ReferenceRegistry.registerReference(AuditFindingUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(AuditFindingPersistence persistence) {
    }
}
