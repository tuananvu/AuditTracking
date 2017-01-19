package syneren.qms.audit.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import syneren.qms.audit.model.CorrectiveAction;

import java.util.List;

/**
 * The persistence utility for the corrective action service. This utility wraps {@link CorrectiveActionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author anguyen
 * @see CorrectiveActionPersistence
 * @see CorrectiveActionPersistenceImpl
 * @generated
 */
public class CorrectiveActionUtil {
    private static CorrectiveActionPersistence _persistence;

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
    public static void clearCache(CorrectiveAction correctiveAction) {
        getPersistence().clearCache(correctiveAction);
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
    public static List<CorrectiveAction> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<CorrectiveAction> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<CorrectiveAction> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static CorrectiveAction update(CorrectiveAction correctiveAction)
        throws SystemException {
        return getPersistence().update(correctiveAction);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static CorrectiveAction update(CorrectiveAction correctiveAction,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(correctiveAction, serviceContext);
    }

    /**
    * Returns all the corrective actions where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching corrective actions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.CorrectiveAction> findByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId(groupId);
    }

    /**
    * Returns a range of all the corrective actions where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.CorrectiveActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of corrective actions
    * @param end the upper bound of the range of corrective actions (not inclusive)
    * @return the range of matching corrective actions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.CorrectiveAction> findByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId(groupId, start, end);
    }

    /**
    * Returns an ordered range of all the corrective actions where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.CorrectiveActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of corrective actions
    * @param end the upper bound of the range of corrective actions (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching corrective actions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.CorrectiveAction> findByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByGroupId(groupId, start, end, orderByComparator);
    }

    /**
    * Returns the first corrective action in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching corrective action
    * @throws syneren.qms.audit.NoSuchCorrectiveActionException if a matching corrective action could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.CorrectiveAction findByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchCorrectiveActionException {
        return getPersistence().findByGroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the first corrective action in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching corrective action, or <code>null</code> if a matching corrective action could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.CorrectiveAction fetchByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the last corrective action in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching corrective action
    * @throws syneren.qms.audit.NoSuchCorrectiveActionException if a matching corrective action could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.CorrectiveAction findByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchCorrectiveActionException {
        return getPersistence().findByGroupId_Last(groupId, orderByComparator);
    }

    /**
    * Returns the last corrective action in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching corrective action, or <code>null</code> if a matching corrective action could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.CorrectiveAction fetchByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
    }

    /**
    * Returns the corrective actions before and after the current corrective action in the ordered set where groupId = &#63;.
    *
    * @param ActionId the primary key of the current corrective action
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next corrective action
    * @throws syneren.qms.audit.NoSuchCorrectiveActionException if a corrective action with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.CorrectiveAction[] findByGroupId_PrevAndNext(
        long ActionId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchCorrectiveActionException {
        return getPersistence()
                   .findByGroupId_PrevAndNext(ActionId, groupId,
            orderByComparator);
    }

    /**
    * Removes all the corrective actions where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByGroupId(groupId);
    }

    /**
    * Returns the number of corrective actions where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching corrective actions
    * @throws SystemException if a system exception occurred
    */
    public static int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByGroupId(groupId);
    }

    /**
    * Returns all the corrective actions where ActionId = &#63;.
    *
    * @param ActionId the action ID
    * @return the matching corrective actions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.CorrectiveAction> findByActionId(
        long ActionId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByActionId(ActionId);
    }

    /**
    * Returns a range of all the corrective actions where ActionId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.CorrectiveActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param ActionId the action ID
    * @param start the lower bound of the range of corrective actions
    * @param end the upper bound of the range of corrective actions (not inclusive)
    * @return the range of matching corrective actions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.CorrectiveAction> findByActionId(
        long ActionId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByActionId(ActionId, start, end);
    }

    /**
    * Returns an ordered range of all the corrective actions where ActionId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.CorrectiveActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param ActionId the action ID
    * @param start the lower bound of the range of corrective actions
    * @param end the upper bound of the range of corrective actions (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching corrective actions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.CorrectiveAction> findByActionId(
        long ActionId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByActionId(ActionId, start, end, orderByComparator);
    }

    /**
    * Returns the first corrective action in the ordered set where ActionId = &#63;.
    *
    * @param ActionId the action ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching corrective action
    * @throws syneren.qms.audit.NoSuchCorrectiveActionException if a matching corrective action could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.CorrectiveAction findByActionId_First(
        long ActionId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchCorrectiveActionException {
        return getPersistence().findByActionId_First(ActionId, orderByComparator);
    }

    /**
    * Returns the first corrective action in the ordered set where ActionId = &#63;.
    *
    * @param ActionId the action ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching corrective action, or <code>null</code> if a matching corrective action could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.CorrectiveAction fetchByActionId_First(
        long ActionId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByActionId_First(ActionId, orderByComparator);
    }

    /**
    * Returns the last corrective action in the ordered set where ActionId = &#63;.
    *
    * @param ActionId the action ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching corrective action
    * @throws syneren.qms.audit.NoSuchCorrectiveActionException if a matching corrective action could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.CorrectiveAction findByActionId_Last(
        long ActionId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchCorrectiveActionException {
        return getPersistence().findByActionId_Last(ActionId, orderByComparator);
    }

    /**
    * Returns the last corrective action in the ordered set where ActionId = &#63;.
    *
    * @param ActionId the action ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching corrective action, or <code>null</code> if a matching corrective action could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.CorrectiveAction fetchByActionId_Last(
        long ActionId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByActionId_Last(ActionId, orderByComparator);
    }

    /**
    * Removes all the corrective actions where ActionId = &#63; from the database.
    *
    * @param ActionId the action ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByActionId(long ActionId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByActionId(ActionId);
    }

    /**
    * Returns the number of corrective actions where ActionId = &#63;.
    *
    * @param ActionId the action ID
    * @return the number of matching corrective actions
    * @throws SystemException if a system exception occurred
    */
    public static int countByActionId(long ActionId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByActionId(ActionId);
    }

    /**
    * Caches the corrective action in the entity cache if it is enabled.
    *
    * @param correctiveAction the corrective action
    */
    public static void cacheResult(
        syneren.qms.audit.model.CorrectiveAction correctiveAction) {
        getPersistence().cacheResult(correctiveAction);
    }

    /**
    * Caches the corrective actions in the entity cache if it is enabled.
    *
    * @param correctiveActions the corrective actions
    */
    public static void cacheResult(
        java.util.List<syneren.qms.audit.model.CorrectiveAction> correctiveActions) {
        getPersistence().cacheResult(correctiveActions);
    }

    /**
    * Creates a new corrective action with the primary key. Does not add the corrective action to the database.
    *
    * @param ActionId the primary key for the new corrective action
    * @return the new corrective action
    */
    public static syneren.qms.audit.model.CorrectiveAction create(long ActionId) {
        return getPersistence().create(ActionId);
    }

    /**
    * Removes the corrective action with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param ActionId the primary key of the corrective action
    * @return the corrective action that was removed
    * @throws syneren.qms.audit.NoSuchCorrectiveActionException if a corrective action with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.CorrectiveAction remove(long ActionId)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchCorrectiveActionException {
        return getPersistence().remove(ActionId);
    }

    public static syneren.qms.audit.model.CorrectiveAction updateImpl(
        syneren.qms.audit.model.CorrectiveAction correctiveAction)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(correctiveAction);
    }

    /**
    * Returns the corrective action with the primary key or throws a {@link syneren.qms.audit.NoSuchCorrectiveActionException} if it could not be found.
    *
    * @param ActionId the primary key of the corrective action
    * @return the corrective action
    * @throws syneren.qms.audit.NoSuchCorrectiveActionException if a corrective action with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.CorrectiveAction findByPrimaryKey(
        long ActionId)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchCorrectiveActionException {
        return getPersistence().findByPrimaryKey(ActionId);
    }

    /**
    * Returns the corrective action with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param ActionId the primary key of the corrective action
    * @return the corrective action, or <code>null</code> if a corrective action with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.CorrectiveAction fetchByPrimaryKey(
        long ActionId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(ActionId);
    }

    /**
    * Returns all the corrective actions.
    *
    * @return the corrective actions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.CorrectiveAction> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the corrective actions.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.CorrectiveActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of corrective actions
    * @param end the upper bound of the range of corrective actions (not inclusive)
    * @return the range of corrective actions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.CorrectiveAction> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the corrective actions.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.CorrectiveActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of corrective actions
    * @param end the upper bound of the range of corrective actions (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of corrective actions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.CorrectiveAction> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the corrective actions from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of corrective actions.
    *
    * @return the number of corrective actions
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static CorrectiveActionPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (CorrectiveActionPersistence) PortletBeanLocatorUtil.locate(syneren.qms.audit.service.ClpSerializer.getServletContextName(),
                    CorrectiveActionPersistence.class.getName());

            ReferenceRegistry.registerReference(CorrectiveActionUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(CorrectiveActionPersistence persistence) {
    }
}
