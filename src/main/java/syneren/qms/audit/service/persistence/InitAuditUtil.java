package syneren.qms.audit.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import syneren.qms.audit.model.InitAudit;

import java.util.List;

/**
 * The persistence utility for the init audit service. This utility wraps {@link InitAuditPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author anguyen
 * @see InitAuditPersistence
 * @see InitAuditPersistenceImpl
 * @generated
 */
public class InitAuditUtil {
    private static InitAuditPersistence _persistence;

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
    public static void clearCache(InitAudit initAudit) {
        getPersistence().clearCache(initAudit);
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
    public static List<InitAudit> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<InitAudit> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<InitAudit> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static InitAudit update(InitAudit initAudit)
        throws SystemException {
        return getPersistence().update(initAudit);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static InitAudit update(InitAudit initAudit,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(initAudit, serviceContext);
    }

    /**
    * Returns all the init audits where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching init audits
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.InitAudit> findByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId(groupId);
    }

    /**
    * Returns a range of all the init audits where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.InitAuditModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of init audits
    * @param end the upper bound of the range of init audits (not inclusive)
    * @return the range of matching init audits
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.InitAudit> findByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId(groupId, start, end);
    }

    /**
    * Returns an ordered range of all the init audits where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.InitAuditModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of init audits
    * @param end the upper bound of the range of init audits (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching init audits
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.InitAudit> findByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByGroupId(groupId, start, end, orderByComparator);
    }

    /**
    * Returns the first init audit in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching init audit
    * @throws syneren.qms.audit.NoSuchInitAuditException if a matching init audit could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.InitAudit findByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchInitAuditException {
        return getPersistence().findByGroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the first init audit in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching init audit, or <code>null</code> if a matching init audit could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.InitAudit fetchByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the last init audit in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching init audit
    * @throws syneren.qms.audit.NoSuchInitAuditException if a matching init audit could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.InitAudit findByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchInitAuditException {
        return getPersistence().findByGroupId_Last(groupId, orderByComparator);
    }

    /**
    * Returns the last init audit in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching init audit, or <code>null</code> if a matching init audit could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.InitAudit fetchByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
    }

    /**
    * Returns the init audits before and after the current init audit in the ordered set where groupId = &#63;.
    *
    * @param InitAuditId the primary key of the current init audit
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next init audit
    * @throws syneren.qms.audit.NoSuchInitAuditException if a init audit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.InitAudit[] findByGroupId_PrevAndNext(
        long InitAuditId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchInitAuditException {
        return getPersistence()
                   .findByGroupId_PrevAndNext(InitAuditId, groupId,
            orderByComparator);
    }

    /**
    * Returns all the init audits that the user has permission to view where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching init audits that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.InitAudit> filterFindByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().filterFindByGroupId(groupId);
    }

    /**
    * Returns a range of all the init audits that the user has permission to view where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.InitAuditModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of init audits
    * @param end the upper bound of the range of init audits (not inclusive)
    * @return the range of matching init audits that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.InitAudit> filterFindByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().filterFindByGroupId(groupId, start, end);
    }

    /**
    * Returns an ordered range of all the init audits that the user has permissions to view where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.InitAuditModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of init audits
    * @param end the upper bound of the range of init audits (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching init audits that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.InitAudit> filterFindByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .filterFindByGroupId(groupId, start, end, orderByComparator);
    }

    /**
    * Returns the init audits before and after the current init audit in the ordered set of init audits that the user has permission to view where groupId = &#63;.
    *
    * @param InitAuditId the primary key of the current init audit
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next init audit
    * @throws syneren.qms.audit.NoSuchInitAuditException if a init audit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.InitAudit[] filterFindByGroupId_PrevAndNext(
        long InitAuditId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchInitAuditException {
        return getPersistence()
                   .filterFindByGroupId_PrevAndNext(InitAuditId, groupId,
            orderByComparator);
    }

    /**
    * Removes all the init audits where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByGroupId(groupId);
    }

    /**
    * Returns the number of init audits where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching init audits
    * @throws SystemException if a system exception occurred
    */
    public static int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByGroupId(groupId);
    }

    /**
    * Returns the number of init audits that the user has permission to view where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching init audits that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static int filterCountByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().filterCountByGroupId(groupId);
    }

    /**
    * Returns all the init audits where InitAuditId = &#63;.
    *
    * @param InitAuditId the init audit ID
    * @return the matching init audits
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.InitAudit> findByAuditId(
        long InitAuditId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByAuditId(InitAuditId);
    }

    /**
    * Returns a range of all the init audits where InitAuditId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.InitAuditModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param InitAuditId the init audit ID
    * @param start the lower bound of the range of init audits
    * @param end the upper bound of the range of init audits (not inclusive)
    * @return the range of matching init audits
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.InitAudit> findByAuditId(
        long InitAuditId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByAuditId(InitAuditId, start, end);
    }

    /**
    * Returns an ordered range of all the init audits where InitAuditId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.InitAuditModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param InitAuditId the init audit ID
    * @param start the lower bound of the range of init audits
    * @param end the upper bound of the range of init audits (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching init audits
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.InitAudit> findByAuditId(
        long InitAuditId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByAuditId(InitAuditId, start, end, orderByComparator);
    }

    /**
    * Returns the first init audit in the ordered set where InitAuditId = &#63;.
    *
    * @param InitAuditId the init audit ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching init audit
    * @throws syneren.qms.audit.NoSuchInitAuditException if a matching init audit could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.InitAudit findByAuditId_First(
        long InitAuditId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchInitAuditException {
        return getPersistence()
                   .findByAuditId_First(InitAuditId, orderByComparator);
    }

    /**
    * Returns the first init audit in the ordered set where InitAuditId = &#63;.
    *
    * @param InitAuditId the init audit ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching init audit, or <code>null</code> if a matching init audit could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.InitAudit fetchByAuditId_First(
        long InitAuditId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByAuditId_First(InitAuditId, orderByComparator);
    }

    /**
    * Returns the last init audit in the ordered set where InitAuditId = &#63;.
    *
    * @param InitAuditId the init audit ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching init audit
    * @throws syneren.qms.audit.NoSuchInitAuditException if a matching init audit could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.InitAudit findByAuditId_Last(
        long InitAuditId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchInitAuditException {
        return getPersistence()
                   .findByAuditId_Last(InitAuditId, orderByComparator);
    }

    /**
    * Returns the last init audit in the ordered set where InitAuditId = &#63;.
    *
    * @param InitAuditId the init audit ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching init audit, or <code>null</code> if a matching init audit could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.InitAudit fetchByAuditId_Last(
        long InitAuditId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByAuditId_Last(InitAuditId, orderByComparator);
    }

    /**
    * Removes all the init audits where InitAuditId = &#63; from the database.
    *
    * @param InitAuditId the init audit ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByAuditId(long InitAuditId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByAuditId(InitAuditId);
    }

    /**
    * Returns the number of init audits where InitAuditId = &#63;.
    *
    * @param InitAuditId the init audit ID
    * @return the number of matching init audits
    * @throws SystemException if a system exception occurred
    */
    public static int countByAuditId(long InitAuditId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByAuditId(InitAuditId);
    }

    /**
    * Returns all the init audits where InitAuditName = &#63;.
    *
    * @param InitAuditName the init audit name
    * @return the matching init audits
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.InitAudit> findByAuditName(
        java.lang.String InitAuditName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByAuditName(InitAuditName);
    }

    /**
    * Returns a range of all the init audits where InitAuditName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.InitAuditModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param InitAuditName the init audit name
    * @param start the lower bound of the range of init audits
    * @param end the upper bound of the range of init audits (not inclusive)
    * @return the range of matching init audits
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.InitAudit> findByAuditName(
        java.lang.String InitAuditName, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByAuditName(InitAuditName, start, end);
    }

    /**
    * Returns an ordered range of all the init audits where InitAuditName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.InitAuditModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param InitAuditName the init audit name
    * @param start the lower bound of the range of init audits
    * @param end the upper bound of the range of init audits (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching init audits
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.InitAudit> findByAuditName(
        java.lang.String InitAuditName, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByAuditName(InitAuditName, start, end, orderByComparator);
    }

    /**
    * Returns the first init audit in the ordered set where InitAuditName = &#63;.
    *
    * @param InitAuditName the init audit name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching init audit
    * @throws syneren.qms.audit.NoSuchInitAuditException if a matching init audit could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.InitAudit findByAuditName_First(
        java.lang.String InitAuditName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchInitAuditException {
        return getPersistence()
                   .findByAuditName_First(InitAuditName, orderByComparator);
    }

    /**
    * Returns the first init audit in the ordered set where InitAuditName = &#63;.
    *
    * @param InitAuditName the init audit name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching init audit, or <code>null</code> if a matching init audit could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.InitAudit fetchByAuditName_First(
        java.lang.String InitAuditName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByAuditName_First(InitAuditName, orderByComparator);
    }

    /**
    * Returns the last init audit in the ordered set where InitAuditName = &#63;.
    *
    * @param InitAuditName the init audit name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching init audit
    * @throws syneren.qms.audit.NoSuchInitAuditException if a matching init audit could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.InitAudit findByAuditName_Last(
        java.lang.String InitAuditName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchInitAuditException {
        return getPersistence()
                   .findByAuditName_Last(InitAuditName, orderByComparator);
    }

    /**
    * Returns the last init audit in the ordered set where InitAuditName = &#63;.
    *
    * @param InitAuditName the init audit name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching init audit, or <code>null</code> if a matching init audit could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.InitAudit fetchByAuditName_Last(
        java.lang.String InitAuditName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByAuditName_Last(InitAuditName, orderByComparator);
    }

    /**
    * Returns the init audits before and after the current init audit in the ordered set where InitAuditName = &#63;.
    *
    * @param InitAuditId the primary key of the current init audit
    * @param InitAuditName the init audit name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next init audit
    * @throws syneren.qms.audit.NoSuchInitAuditException if a init audit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.InitAudit[] findByAuditName_PrevAndNext(
        long InitAuditId, java.lang.String InitAuditName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchInitAuditException {
        return getPersistence()
                   .findByAuditName_PrevAndNext(InitAuditId, InitAuditName,
            orderByComparator);
    }

    /**
    * Removes all the init audits where InitAuditName = &#63; from the database.
    *
    * @param InitAuditName the init audit name
    * @throws SystemException if a system exception occurred
    */
    public static void removeByAuditName(java.lang.String InitAuditName)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByAuditName(InitAuditName);
    }

    /**
    * Returns the number of init audits where InitAuditName = &#63;.
    *
    * @param InitAuditName the init audit name
    * @return the number of matching init audits
    * @throws SystemException if a system exception occurred
    */
    public static int countByAuditName(java.lang.String InitAuditName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByAuditName(InitAuditName);
    }

    /**
    * Caches the init audit in the entity cache if it is enabled.
    *
    * @param initAudit the init audit
    */
    public static void cacheResult(syneren.qms.audit.model.InitAudit initAudit) {
        getPersistence().cacheResult(initAudit);
    }

    /**
    * Caches the init audits in the entity cache if it is enabled.
    *
    * @param initAudits the init audits
    */
    public static void cacheResult(
        java.util.List<syneren.qms.audit.model.InitAudit> initAudits) {
        getPersistence().cacheResult(initAudits);
    }

    /**
    * Creates a new init audit with the primary key. Does not add the init audit to the database.
    *
    * @param InitAuditId the primary key for the new init audit
    * @return the new init audit
    */
    public static syneren.qms.audit.model.InitAudit create(long InitAuditId) {
        return getPersistence().create(InitAuditId);
    }

    /**
    * Removes the init audit with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param InitAuditId the primary key of the init audit
    * @return the init audit that was removed
    * @throws syneren.qms.audit.NoSuchInitAuditException if a init audit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.InitAudit remove(long InitAuditId)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchInitAuditException {
        return getPersistence().remove(InitAuditId);
    }

    public static syneren.qms.audit.model.InitAudit updateImpl(
        syneren.qms.audit.model.InitAudit initAudit)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(initAudit);
    }

    /**
    * Returns the init audit with the primary key or throws a {@link syneren.qms.audit.NoSuchInitAuditException} if it could not be found.
    *
    * @param InitAuditId the primary key of the init audit
    * @return the init audit
    * @throws syneren.qms.audit.NoSuchInitAuditException if a init audit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.InitAudit findByPrimaryKey(
        long InitAuditId)
        throws com.liferay.portal.kernel.exception.SystemException,
            syneren.qms.audit.NoSuchInitAuditException {
        return getPersistence().findByPrimaryKey(InitAuditId);
    }

    /**
    * Returns the init audit with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param InitAuditId the primary key of the init audit
    * @return the init audit, or <code>null</code> if a init audit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.InitAudit fetchByPrimaryKey(
        long InitAuditId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(InitAuditId);
    }

    /**
    * Returns all the init audits.
    *
    * @return the init audits
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.InitAudit> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the init audits.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.InitAuditModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of init audits
    * @param end the upper bound of the range of init audits (not inclusive)
    * @return the range of init audits
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.InitAudit> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the init audits.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.InitAuditModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of init audits
    * @param end the upper bound of the range of init audits (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of init audits
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<syneren.qms.audit.model.InitAudit> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the init audits from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of init audits.
    *
    * @return the number of init audits
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static InitAuditPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (InitAuditPersistence) PortletBeanLocatorUtil.locate(syneren.qms.audit.service.ClpSerializer.getServletContextName(),
                    InitAuditPersistence.class.getName());

            ReferenceRegistry.registerReference(InitAuditUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(InitAuditPersistence persistence) {
    }
}
