package syneren.qms.audit.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import syneren.qms.audit.model.CorrectiveAction;

/**
 * The persistence interface for the corrective action service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author anguyen
 * @see CorrectiveActionPersistenceImpl
 * @see CorrectiveActionUtil
 * @generated
 */
public interface CorrectiveActionPersistence extends BasePersistence<CorrectiveAction> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link CorrectiveActionUtil} to access the corrective action persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the corrective actions where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching corrective actions
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<syneren.qms.audit.model.CorrectiveAction> findByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<syneren.qms.audit.model.CorrectiveAction> findByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<syneren.qms.audit.model.CorrectiveAction> findByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first corrective action in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching corrective action
    * @throws syneren.qms.audit.NoSuchCorrectiveActionException if a matching corrective action could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.CorrectiveAction findByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchCorrectiveActionException;

    /**
    * Returns the first corrective action in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching corrective action, or <code>null</code> if a matching corrective action could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.CorrectiveAction fetchByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last corrective action in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching corrective action
    * @throws syneren.qms.audit.NoSuchCorrectiveActionException if a matching corrective action could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.CorrectiveAction findByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchCorrectiveActionException;

    /**
    * Returns the last corrective action in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching corrective action, or <code>null</code> if a matching corrective action could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.CorrectiveAction fetchByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public syneren.qms.audit.model.CorrectiveAction[] findByGroupId_PrevAndNext(
        long ActionId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchCorrectiveActionException;

    /**
    * Removes all the corrective actions where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of corrective actions where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching corrective actions
    * @throws SystemException if a system exception occurred
    */
    public int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the corrective actions where ActionId = &#63;.
    *
    * @param ActionId the action ID
    * @return the matching corrective actions
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<syneren.qms.audit.model.CorrectiveAction> findByActionId(
        long ActionId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<syneren.qms.audit.model.CorrectiveAction> findByActionId(
        long ActionId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<syneren.qms.audit.model.CorrectiveAction> findByActionId(
        long ActionId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first corrective action in the ordered set where ActionId = &#63;.
    *
    * @param ActionId the action ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching corrective action
    * @throws syneren.qms.audit.NoSuchCorrectiveActionException if a matching corrective action could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.CorrectiveAction findByActionId_First(
        long ActionId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchCorrectiveActionException;

    /**
    * Returns the first corrective action in the ordered set where ActionId = &#63;.
    *
    * @param ActionId the action ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching corrective action, or <code>null</code> if a matching corrective action could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.CorrectiveAction fetchByActionId_First(
        long ActionId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last corrective action in the ordered set where ActionId = &#63;.
    *
    * @param ActionId the action ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching corrective action
    * @throws syneren.qms.audit.NoSuchCorrectiveActionException if a matching corrective action could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.CorrectiveAction findByActionId_Last(
        long ActionId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchCorrectiveActionException;

    /**
    * Returns the last corrective action in the ordered set where ActionId = &#63;.
    *
    * @param ActionId the action ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching corrective action, or <code>null</code> if a matching corrective action could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.CorrectiveAction fetchByActionId_Last(
        long ActionId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the corrective actions where ActionId = &#63; from the database.
    *
    * @param ActionId the action ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByActionId(long ActionId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of corrective actions where ActionId = &#63;.
    *
    * @param ActionId the action ID
    * @return the number of matching corrective actions
    * @throws SystemException if a system exception occurred
    */
    public int countByActionId(long ActionId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the corrective action in the entity cache if it is enabled.
    *
    * @param correctiveAction the corrective action
    */
    public void cacheResult(
        syneren.qms.audit.model.CorrectiveAction correctiveAction);

    /**
    * Caches the corrective actions in the entity cache if it is enabled.
    *
    * @param correctiveActions the corrective actions
    */
    public void cacheResult(
        java.util.List<syneren.qms.audit.model.CorrectiveAction> correctiveActions);

    /**
    * Creates a new corrective action with the primary key. Does not add the corrective action to the database.
    *
    * @param ActionId the primary key for the new corrective action
    * @return the new corrective action
    */
    public syneren.qms.audit.model.CorrectiveAction create(long ActionId);

    /**
    * Removes the corrective action with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param ActionId the primary key of the corrective action
    * @return the corrective action that was removed
    * @throws syneren.qms.audit.NoSuchCorrectiveActionException if a corrective action with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.CorrectiveAction remove(long ActionId)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchCorrectiveActionException;

    public syneren.qms.audit.model.CorrectiveAction updateImpl(
        syneren.qms.audit.model.CorrectiveAction correctiveAction)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the corrective action with the primary key or throws a {@link syneren.qms.audit.NoSuchCorrectiveActionException} if it could not be found.
    *
    * @param ActionId the primary key of the corrective action
    * @return the corrective action
    * @throws syneren.qms.audit.NoSuchCorrectiveActionException if a corrective action with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.CorrectiveAction findByPrimaryKey(
        long ActionId)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchCorrectiveActionException;

    /**
    * Returns the corrective action with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param ActionId the primary key of the corrective action
    * @return the corrective action, or <code>null</code> if a corrective action with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public syneren.qms.audit.model.CorrectiveAction fetchByPrimaryKey(
        long ActionId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the corrective actions.
    *
    * @return the corrective actions
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<syneren.qms.audit.model.CorrectiveAction> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<syneren.qms.audit.model.CorrectiveAction> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<syneren.qms.audit.model.CorrectiveAction> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the corrective actions from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of corrective actions.
    *
    * @return the number of corrective actions
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
