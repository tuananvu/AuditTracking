package syneren.qms.audit.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import syneren.qms.audit.model.AuditPlan;

/**
 * The persistence interface for the audit plan service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author anguyen
 * @see AuditPlanPersistenceImpl
 * @see AuditPlanUtil
 * @generated
 */
public interface AuditPlanPersistence extends BasePersistence<AuditPlan> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link AuditPlanUtil} to access the audit plan persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the audit plans where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching audit plans
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<syneren.qms.audit.model.AuditPlan> findByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<syneren.qms.audit.model.AuditPlan> findByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<syneren.qms.audit.model.AuditPlan> findByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first audit plan in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching audit plan
    * @throws syneren.qms.audit.NoSuchAuditPlanException if a matching audit plan could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditPlan findByGroupId_First(long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditPlanException;

    /**
    * Returns the first audit plan in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching audit plan, or <code>null</code> if a matching audit plan could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditPlan fetchByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last audit plan in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching audit plan
    * @throws syneren.qms.audit.NoSuchAuditPlanException if a matching audit plan could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditPlan findByGroupId_Last(long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditPlanException;

    /**
    * Returns the last audit plan in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching audit plan, or <code>null</code> if a matching audit plan could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditPlan fetchByGroupId_Last(long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public syneren.qms.audit.model.AuditPlan[] findByGroupId_PrevAndNext(
        long PlanId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditPlanException;

    /**
    * Returns all the audit plans that the user has permission to view where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching audit plans that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<syneren.qms.audit.model.AuditPlan> filterFindByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<syneren.qms.audit.model.AuditPlan> filterFindByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<syneren.qms.audit.model.AuditPlan> filterFindByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public syneren.qms.audit.model.AuditPlan[] filterFindByGroupId_PrevAndNext(
        long PlanId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditPlanException;

    /**
    * Removes all the audit plans where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of audit plans where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching audit plans
    * @throws SystemException if a system exception occurred
    */
    public int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of audit plans that the user has permission to view where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching audit plans that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public int filterCountByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the audit plans where PlanId = &#63;.
    *
    * @param PlanId the plan ID
    * @return the matching audit plans
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<syneren.qms.audit.model.AuditPlan> findByPlanId(
        long PlanId) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<syneren.qms.audit.model.AuditPlan> findByPlanId(
        long PlanId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<syneren.qms.audit.model.AuditPlan> findByPlanId(
        long PlanId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first audit plan in the ordered set where PlanId = &#63;.
    *
    * @param PlanId the plan ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching audit plan
    * @throws syneren.qms.audit.NoSuchAuditPlanException if a matching audit plan could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditPlan findByPlanId_First(long PlanId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditPlanException;

    /**
    * Returns the first audit plan in the ordered set where PlanId = &#63;.
    *
    * @param PlanId the plan ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching audit plan, or <code>null</code> if a matching audit plan could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditPlan fetchByPlanId_First(long PlanId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last audit plan in the ordered set where PlanId = &#63;.
    *
    * @param PlanId the plan ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching audit plan
    * @throws syneren.qms.audit.NoSuchAuditPlanException if a matching audit plan could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditPlan findByPlanId_Last(long PlanId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditPlanException;

    /**
    * Returns the last audit plan in the ordered set where PlanId = &#63;.
    *
    * @param PlanId the plan ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching audit plan, or <code>null</code> if a matching audit plan could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditPlan fetchByPlanId_Last(long PlanId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the audit plans where PlanId = &#63; from the database.
    *
    * @param PlanId the plan ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByPlanId(long PlanId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of audit plans where PlanId = &#63;.
    *
    * @param PlanId the plan ID
    * @return the number of matching audit plans
    * @throws SystemException if a system exception occurred
    */
    public int countByPlanId(long PlanId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the audit plans where groupId = &#63; and InitAuditId = &#63;.
    *
    * @param groupId the group ID
    * @param InitAuditId the init audit ID
    * @return the matching audit plans
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<syneren.qms.audit.model.AuditPlan> findByG_A(
        long groupId, long InitAuditId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<syneren.qms.audit.model.AuditPlan> findByG_A(
        long groupId, long InitAuditId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<syneren.qms.audit.model.AuditPlan> findByG_A(
        long groupId, long InitAuditId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public syneren.qms.audit.model.AuditPlan findByG_A_First(long groupId,
        long InitAuditId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditPlanException;

    /**
    * Returns the first audit plan in the ordered set where groupId = &#63; and InitAuditId = &#63;.
    *
    * @param groupId the group ID
    * @param InitAuditId the init audit ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching audit plan, or <code>null</code> if a matching audit plan could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditPlan fetchByG_A_First(long groupId,
        long InitAuditId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public syneren.qms.audit.model.AuditPlan findByG_A_Last(long groupId,
        long InitAuditId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditPlanException;

    /**
    * Returns the last audit plan in the ordered set where groupId = &#63; and InitAuditId = &#63;.
    *
    * @param groupId the group ID
    * @param InitAuditId the init audit ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching audit plan, or <code>null</code> if a matching audit plan could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditPlan fetchByG_A_Last(long groupId,
        long InitAuditId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public syneren.qms.audit.model.AuditPlan[] findByG_A_PrevAndNext(
        long PlanId, long groupId, long InitAuditId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditPlanException;

    /**
    * Returns all the audit plans that the user has permission to view where groupId = &#63; and InitAuditId = &#63;.
    *
    * @param groupId the group ID
    * @param InitAuditId the init audit ID
    * @return the matching audit plans that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<syneren.qms.audit.model.AuditPlan> filterFindByG_A(
        long groupId, long InitAuditId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<syneren.qms.audit.model.AuditPlan> filterFindByG_A(
        long groupId, long InitAuditId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<syneren.qms.audit.model.AuditPlan> filterFindByG_A(
        long groupId, long InitAuditId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public syneren.qms.audit.model.AuditPlan[] filterFindByG_A_PrevAndNext(
        long PlanId, long groupId, long InitAuditId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditPlanException;

    /**
    * Removes all the audit plans where groupId = &#63; and InitAuditId = &#63; from the database.
    *
    * @param groupId the group ID
    * @param InitAuditId the init audit ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByG_A(long groupId, long InitAuditId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of audit plans where groupId = &#63; and InitAuditId = &#63;.
    *
    * @param groupId the group ID
    * @param InitAuditId the init audit ID
    * @return the number of matching audit plans
    * @throws SystemException if a system exception occurred
    */
    public int countByG_A(long groupId, long InitAuditId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of audit plans that the user has permission to view where groupId = &#63; and InitAuditId = &#63;.
    *
    * @param groupId the group ID
    * @param InitAuditId the init audit ID
    * @return the number of matching audit plans that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public int filterCountByG_A(long groupId, long InitAuditId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the audit plan in the entity cache if it is enabled.
    *
    * @param auditPlan the audit plan
    */
    public void cacheResult(syneren.qms.audit.model.AuditPlan auditPlan);

    /**
    * Caches the audit plans in the entity cache if it is enabled.
    *
    * @param auditPlans the audit plans
    */
    public void cacheResult(
        java.util.List<syneren.qms.audit.model.AuditPlan> auditPlans);

    /**
    * Creates a new audit plan with the primary key. Does not add the audit plan to the database.
    *
    * @param PlanId the primary key for the new audit plan
    * @return the new audit plan
    */
    public syneren.qms.audit.model.AuditPlan create(long PlanId);

    /**
    * Removes the audit plan with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param PlanId the primary key of the audit plan
    * @return the audit plan that was removed
    * @throws syneren.qms.audit.NoSuchAuditPlanException if a audit plan with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditPlan remove(long PlanId)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditPlanException;

    public syneren.qms.audit.model.AuditPlan updateImpl(
        syneren.qms.audit.model.AuditPlan auditPlan)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the audit plan with the primary key or throws a {@link syneren.qms.audit.NoSuchAuditPlanException} if it could not be found.
    *
    * @param PlanId the primary key of the audit plan
    * @return the audit plan
    * @throws syneren.qms.audit.NoSuchAuditPlanException if a audit plan with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditPlan findByPrimaryKey(long PlanId)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchAuditPlanException;

    /**
    * Returns the audit plan with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param PlanId the primary key of the audit plan
    * @return the audit plan, or <code>null</code> if a audit plan with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.AuditPlan fetchByPrimaryKey(long PlanId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the audit plans.
    *
    * @return the audit plans
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<syneren.qms.audit.model.AuditPlan> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<syneren.qms.audit.model.AuditPlan> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<syneren.qms.audit.model.AuditPlan> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the audit plans from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of audit plans.
    *
    * @return the number of audit plans
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
