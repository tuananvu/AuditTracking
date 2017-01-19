package syneren.qms.audit.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import syneren.qms.audit.model.AuditPlan;

import java.util.List;

/**
 * The persistence utility for the audit plan service. This utility wraps {@link AuditPlanPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author anguyen
 * @see AuditPlanPersistence
 * @see AuditPlanPersistenceImpl
 * @generated
 */
public class AuditPlanUtil {
    private static AuditPlanPersistence _persistence;

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
    public static void clearCache(AuditPlan auditPlan) {
        getPersistence().clearCache(auditPlan);
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
    public static List<AuditPlan> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<AuditPlan> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<AuditPlan> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static AuditPlan update(AuditPlan auditPlan)
        throws SystemException {
        return getPersistence().update(auditPlan);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static AuditPlan update(AuditPlan auditPlan,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(auditPlan, serviceContext);
    }

    /**
    * Returns all the audit plans where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching audit plans
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.AuditPlan> findByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId(groupId);
    }

    /**
    * Returns a range of all the audit plans where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditPlanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of audit plans
    * @param end the upper bound of the range of audit plans (not inclusive)
    * @return the range of matching audit plans
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.AuditPlan> findByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId(groupId, start, end);
    }

    /**
    * Returns an ordered range of all the audit plans where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditPlanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of audit plans
    * @param end the upper bound of the range of audit plans (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching audit plans
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.AuditPlan> findByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByGroupId(groupId, start, end, orderByComparator);
    }

    /**
    * Returns the first audit plan in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching audit plan
    * @throws syneren.qms.audit.NoSuchAuditPlanException if a matching audit plan could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditPlan findByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditPlanException {
        return getPersistence().findByGroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the first audit plan in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching audit plan, or <code>null</code> if a matching audit plan could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditPlan fetchByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the last audit plan in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching audit plan
    * @throws syneren.qms.audit.NoSuchAuditPlanException if a matching audit plan could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditPlan findByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditPlanException {
        return getPersistence().findByGroupId_Last(groupId, orderByComparator);
    }

    /**
    * Returns the last audit plan in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching audit plan, or <code>null</code> if a matching audit plan could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditPlan fetchByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
    }

    /**
    * Returns the audit plans before and after the current audit plan in the ordered set where groupId = &#63;.
    *
    * @param PlanId the primary key of the current audit plan
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next audit plan
    * @throws syneren.qms.audit.NoSuchAuditPlanException if a audit plan with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditPlan[] findByGroupId_PrevAndNext(
        long PlanId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditPlanException {
        return getPersistence()
                   .findByGroupId_PrevAndNext(PlanId, groupId, orderByComparator);
    }

    /**
    * Returns all the audit plans that the user has permission to view where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching audit plans that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.AuditPlan> filterFindByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().filterFindByGroupId(groupId);
    }

    /**
    * Returns a range of all the audit plans that the user has permission to view where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditPlanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of audit plans
    * @param end the upper bound of the range of audit plans (not inclusive)
    * @return the range of matching audit plans that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.AuditPlan> filterFindByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().filterFindByGroupId(groupId, start, end);
    }

    /**
    * Returns an ordered range of all the audit plans that the user has permissions to view where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditPlanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of audit plans
    * @param end the upper bound of the range of audit plans (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching audit plans that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.AuditPlan> filterFindByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .filterFindByGroupId(groupId, start, end, orderByComparator);
    }

    /**
    * Returns the audit plans before and after the current audit plan in the ordered set of audit plans that the user has permission to view where groupId = &#63;.
    *
    * @param PlanId the primary key of the current audit plan
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next audit plan
    * @throws syneren.qms.audit.NoSuchAuditPlanException if a audit plan with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditPlan[] filterFindByGroupId_PrevAndNext(
        long PlanId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditPlanException {
        return getPersistence()
                   .filterFindByGroupId_PrevAndNext(PlanId, groupId,
            orderByComparator);
    }

    /**
    * Removes all the audit plans where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByGroupId(groupId);
    }

    /**
    * Returns the number of audit plans where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching audit plans
    * @throws SystemException if a system exception occurred
    */
    public static int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByGroupId(groupId);
    }

    /**
    * Returns the number of audit plans that the user has permission to view where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching audit plans that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static int filterCountByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().filterCountByGroupId(groupId);
    }

    /**
    * Returns all the audit plans where PlanId = &#63;.
    *
    * @param PlanId the plan ID
    * @return the matching audit plans
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.AuditPlan> findByPlanId(
        long PlanId) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPlanId(PlanId);
    }

    /**
    * Returns a range of all the audit plans where PlanId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditPlanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param PlanId the plan ID
    * @param start the lower bound of the range of audit plans
    * @param end the upper bound of the range of audit plans (not inclusive)
    * @return the range of matching audit plans
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.AuditPlan> findByPlanId(
        long PlanId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPlanId(PlanId, start, end);
    }

    /**
    * Returns an ordered range of all the audit plans where PlanId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditPlanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param PlanId the plan ID
    * @param start the lower bound of the range of audit plans
    * @param end the upper bound of the range of audit plans (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching audit plans
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.AuditPlan> findByPlanId(
        long PlanId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByPlanId(PlanId, start, end, orderByComparator);
    }

    /**
    * Returns the first audit plan in the ordered set where PlanId = &#63;.
    *
    * @param PlanId the plan ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching audit plan
    * @throws syneren.qms.audit.NoSuchAuditPlanException if a matching audit plan could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditPlan findByPlanId_First(
        long PlanId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditPlanException {
        return getPersistence().findByPlanId_First(PlanId, orderByComparator);
    }

    /**
    * Returns the first audit plan in the ordered set where PlanId = &#63;.
    *
    * @param PlanId the plan ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching audit plan, or <code>null</code> if a matching audit plan could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditPlan fetchByPlanId_First(
        long PlanId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPlanId_First(PlanId, orderByComparator);
    }

    /**
    * Returns the last audit plan in the ordered set where PlanId = &#63;.
    *
    * @param PlanId the plan ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching audit plan
    * @throws syneren.qms.audit.NoSuchAuditPlanException if a matching audit plan could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditPlan findByPlanId_Last(
        long PlanId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditPlanException {
        return getPersistence().findByPlanId_Last(PlanId, orderByComparator);
    }

    /**
    * Returns the last audit plan in the ordered set where PlanId = &#63;.
    *
    * @param PlanId the plan ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching audit plan, or <code>null</code> if a matching audit plan could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditPlan fetchByPlanId_Last(
        long PlanId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPlanId_Last(PlanId, orderByComparator);
    }

    /**
    * Removes all the audit plans where PlanId = &#63; from the database.
    *
    * @param PlanId the plan ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByPlanId(long PlanId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByPlanId(PlanId);
    }

    /**
    * Returns the number of audit plans where PlanId = &#63;.
    *
    * @param PlanId the plan ID
    * @return the number of matching audit plans
    * @throws SystemException if a system exception occurred
    */
    public static int countByPlanId(long PlanId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByPlanId(PlanId);
    }

    /**
    * Returns all the audit plans where groupId = &#63; and InitAuditId = &#63;.
    *
    * @param groupId the group ID
    * @param InitAuditId the init audit ID
    * @return the matching audit plans
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.AuditPlan> findByG_A(
        long groupId, long InitAuditId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_A(groupId, InitAuditId);
    }

    /**
    * Returns a range of all the audit plans where groupId = &#63; and InitAuditId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditPlanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param InitAuditId the init audit ID
    * @param start the lower bound of the range of audit plans
    * @param end the upper bound of the range of audit plans (not inclusive)
    * @return the range of matching audit plans
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.AuditPlan> findByG_A(
        long groupId, long InitAuditId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_A(groupId, InitAuditId, start, end);
    }

    /**
    * Returns an ordered range of all the audit plans where groupId = &#63; and InitAuditId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditPlanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param InitAuditId the init audit ID
    * @param start the lower bound of the range of audit plans
    * @param end the upper bound of the range of audit plans (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching audit plans
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.AuditPlan> findByG_A(
        long groupId, long InitAuditId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_A(groupId, InitAuditId, start, end,
            orderByComparator);
    }

    /**
    * Returns the first audit plan in the ordered set where groupId = &#63; and InitAuditId = &#63;.
    *
    * @param groupId the group ID
    * @param InitAuditId the init audit ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching audit plan
    * @throws syneren.qms.audit.NoSuchAuditPlanException if a matching audit plan could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditPlan findByG_A_First(
        long groupId, long InitAuditId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditPlanException {
        return getPersistence()
                   .findByG_A_First(groupId, InitAuditId, orderByComparator);
    }

    /**
    * Returns the first audit plan in the ordered set where groupId = &#63; and InitAuditId = &#63;.
    *
    * @param groupId the group ID
    * @param InitAuditId the init audit ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching audit plan, or <code>null</code> if a matching audit plan could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditPlan fetchByG_A_First(
        long groupId, long InitAuditId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_A_First(groupId, InitAuditId, orderByComparator);
    }

    /**
    * Returns the last audit plan in the ordered set where groupId = &#63; and InitAuditId = &#63;.
    *
    * @param groupId the group ID
    * @param InitAuditId the init audit ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching audit plan
    * @throws syneren.qms.audit.NoSuchAuditPlanException if a matching audit plan could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditPlan findByG_A_Last(
        long groupId, long InitAuditId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditPlanException {
        return getPersistence()
                   .findByG_A_Last(groupId, InitAuditId, orderByComparator);
    }

    /**
    * Returns the last audit plan in the ordered set where groupId = &#63; and InitAuditId = &#63;.
    *
    * @param groupId the group ID
    * @param InitAuditId the init audit ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching audit plan, or <code>null</code> if a matching audit plan could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditPlan fetchByG_A_Last(
        long groupId, long InitAuditId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_A_Last(groupId, InitAuditId, orderByComparator);
    }

    /**
    * Returns the audit plans before and after the current audit plan in the ordered set where groupId = &#63; and InitAuditId = &#63;.
    *
    * @param PlanId the primary key of the current audit plan
    * @param groupId the group ID
    * @param InitAuditId the init audit ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next audit plan
    * @throws syneren.qms.audit.NoSuchAuditPlanException if a audit plan with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditPlan[] findByG_A_PrevAndNext(
        long PlanId, long groupId, long InitAuditId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditPlanException {
        return getPersistence()
                   .findByG_A_PrevAndNext(PlanId, groupId, InitAuditId,
            orderByComparator);
    }

    /**
    * Returns all the audit plans that the user has permission to view where groupId = &#63; and InitAuditId = &#63;.
    *
    * @param groupId the group ID
    * @param InitAuditId the init audit ID
    * @return the matching audit plans that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.AuditPlan> filterFindByG_A(
        long groupId, long InitAuditId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().filterFindByG_A(groupId, InitAuditId);
    }

    /**
    * Returns a range of all the audit plans that the user has permission to view where groupId = &#63; and InitAuditId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditPlanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param InitAuditId the init audit ID
    * @param start the lower bound of the range of audit plans
    * @param end the upper bound of the range of audit plans (not inclusive)
    * @return the range of matching audit plans that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.AuditPlan> filterFindByG_A(
        long groupId, long InitAuditId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().filterFindByG_A(groupId, InitAuditId, start, end);
    }

    /**
    * Returns an ordered range of all the audit plans that the user has permissions to view where groupId = &#63; and InitAuditId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditPlanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param InitAuditId the init audit ID
    * @param start the lower bound of the range of audit plans
    * @param end the upper bound of the range of audit plans (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching audit plans that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.AuditPlan> filterFindByG_A(
        long groupId, long InitAuditId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .filterFindByG_A(groupId, InitAuditId, start, end,
            orderByComparator);
    }

    /**
    * Returns the audit plans before and after the current audit plan in the ordered set of audit plans that the user has permission to view where groupId = &#63; and InitAuditId = &#63;.
    *
    * @param PlanId the primary key of the current audit plan
    * @param groupId the group ID
    * @param InitAuditId the init audit ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next audit plan
    * @throws syneren.qms.audit.NoSuchAuditPlanException if a audit plan with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditPlan[] filterFindByG_A_PrevAndNext(
        long PlanId, long groupId, long InitAuditId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditPlanException {
        return getPersistence()
                   .filterFindByG_A_PrevAndNext(PlanId, groupId, InitAuditId,
            orderByComparator);
    }

    /**
    * Removes all the audit plans where groupId = &#63; and InitAuditId = &#63; from the database.
    *
    * @param groupId the group ID
    * @param InitAuditId the init audit ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByG_A(long groupId, long InitAuditId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByG_A(groupId, InitAuditId);
    }

    /**
    * Returns the number of audit plans where groupId = &#63; and InitAuditId = &#63;.
    *
    * @param groupId the group ID
    * @param InitAuditId the init audit ID
    * @return the number of matching audit plans
    * @throws SystemException if a system exception occurred
    */
    public static int countByG_A(long groupId, long InitAuditId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByG_A(groupId, InitAuditId);
    }

    /**
    * Returns the number of audit plans that the user has permission to view where groupId = &#63; and InitAuditId = &#63;.
    *
    * @param groupId the group ID
    * @param InitAuditId the init audit ID
    * @return the number of matching audit plans that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static int filterCountByG_A(long groupId, long InitAuditId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().filterCountByG_A(groupId, InitAuditId);
    }

    /**
    * Caches the audit plan in the entity cache if it is enabled.
    *
    * @param auditPlan the audit plan
    */
    public static void cacheResult(syneren.qms.audit.model.AuditPlan auditPlan) {
        getPersistence().cacheResult(auditPlan);
    }

    /**
    * Caches the audit plans in the entity cache if it is enabled.
    *
    * @param auditPlans the audit plans
    */
    public static void cacheResult(
        java.util.List<syneren.qms.audit.model.AuditPlan> auditPlans) {
        getPersistence().cacheResult(auditPlans);
    }

    /**
    * Creates a new audit plan with the primary key. Does not add the audit plan to the database.
    *
    * @param PlanId the primary key for the new audit plan
    * @return the new audit plan
    */
    public static syneren.qms.audit.model.AuditPlan create(long PlanId) {
        return getPersistence().create(PlanId);
    }

    /**
    * Removes the audit plan with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param PlanId the primary key of the audit plan
    * @return the audit plan that was removed
    * @throws syneren.qms.audit.NoSuchAuditPlanException if a audit plan with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditPlan remove(long PlanId)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditPlanException {
        return getPersistence().remove(PlanId);
    }

    public static syneren.qms.audit.model.AuditPlan updateImpl(
        syneren.qms.audit.model.AuditPlan auditPlan)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(auditPlan);
    }

    /**
    * Returns the audit plan with the primary key or throws a {@link syneren.qms.audit.NoSuchAuditPlanException} if it could not be found.
    *
    * @param PlanId the primary key of the audit plan
    * @return the audit plan
    * @throws syneren.qms.audit.NoSuchAuditPlanException if a audit plan with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditPlan findByPrimaryKey(
        long PlanId)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditPlanException {
        return getPersistence().findByPrimaryKey(PlanId);
    }

    /**
    * Returns the audit plan with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param PlanId the primary key of the audit plan
    * @return the audit plan, or <code>null</code> if a audit plan with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditPlan fetchByPrimaryKey(
        long PlanId) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(PlanId);
    }

    /**
    * Returns all the audit plans.
    *
    * @return the audit plans
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.AuditPlan> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the audit plans.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditPlanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of audit plans
    * @param end the upper bound of the range of audit plans (not inclusive)
    * @return the range of audit plans
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.AuditPlan> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the audit plans.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditPlanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of audit plans
    * @param end the upper bound of the range of audit plans (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of audit plans
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.AuditPlan> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the audit plans from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of audit plans.
    *
    * @return the number of audit plans
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static AuditPlanPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (AuditPlanPersistence) PortletBeanLocatorUtil.locate(syneren.qms.audit.service.ClpSerializer.getServletContextName(),
                    AuditPlanPersistence.class.getName());

            ReferenceRegistry.registerReference(AuditPlanUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(AuditPlanPersistence persistence) {
    }
}
