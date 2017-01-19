package syneren.qms.audit.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for AuditPlan. This utility wraps
 * {@link syneren.qms.audit.service.impl.AuditPlanLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author anguyen
 * @see AuditPlanLocalService
 * @see syneren.qms.audit.service.base.AuditPlanLocalServiceBaseImpl
 * @see syneren.qms.audit.service.impl.AuditPlanLocalServiceImpl
 * @generated
 */
public class AuditPlanLocalServiceUtil {
    private static AuditPlanLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link syneren.qms.audit.service.impl.AuditPlanLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the audit plan to the database. Also notifies the appropriate model listeners.
    *
    * @param auditPlan the audit plan
    * @return the audit plan that was added
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditPlan addAuditPlan(
        syneren.qms.audit.model.AuditPlan auditPlan)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addAuditPlan(auditPlan);
    }

    /**
    * Creates a new audit plan with the primary key. Does not add the audit plan to the database.
    *
    * @param PlanId the primary key for the new audit plan
    * @return the new audit plan
    */
    public static syneren.qms.audit.model.AuditPlan createAuditPlan(long PlanId) {
        return getService().createAuditPlan(PlanId);
    }

    /**
    * Deletes the audit plan with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param PlanId the primary key of the audit plan
    * @return the audit plan that was removed
    * @throws PortalException if a audit plan with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditPlan deleteAuditPlan(long PlanId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteAuditPlan(PlanId);
    }

    /**
    * Deletes the audit plan from the database. Also notifies the appropriate model listeners.
    *
    * @param auditPlan the audit plan
    * @return the audit plan that was removed
    * @throws PortalException
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditPlan deleteAuditPlan(
        syneren.qms.audit.model.AuditPlan auditPlan)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteAuditPlan(auditPlan);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditPlanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditPlanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static syneren.qms.audit.model.AuditPlan fetchAuditPlan(long PlanId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchAuditPlan(PlanId);
    }

    /**
    * Returns the audit plan with the primary key.
    *
    * @param PlanId the primary key of the audit plan
    * @return the audit plan
    * @throws PortalException if a audit plan with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditPlan getAuditPlan(long PlanId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getAuditPlan(PlanId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<syneren.qms.audit.model.AuditPlan> getAuditPlans(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getAuditPlans(start, end);
    }

    /**
    * Returns the number of audit plans.
    *
    * @return the number of audit plans
    * @throws SystemException if a system exception occurred
    */
    public static int getAuditPlansCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getAuditPlansCount();
    }

    /**
    * Updates the audit plan in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param auditPlan the audit plan
    * @return the audit plan that was updated
    * @throws SystemException if a system exception occurred
    */
    public static syneren.qms.audit.model.AuditPlan updateAuditPlan(
        syneren.qms.audit.model.AuditPlan auditPlan)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateAuditPlan(auditPlan);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static java.util.List<syneren.qms.audit.model.AuditPlan> getAuditPlans(
        long groupId, long InitAuditId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getAuditPlans(groupId, InitAuditId);
    }

    public static java.util.List<syneren.qms.audit.model.AuditPlan> getAuditPlans(
        long groupId, long InitAuditId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getAuditPlans(groupId, InitAuditId, start, end);
    }

    public static syneren.qms.audit.model.AuditPlan addAuditPlan(
        syneren.qms.audit.model.AuditPlan auditPlan, long userId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().addAuditPlan(auditPlan, userId);
    }

    public static int getAuditPlanCount(long groupId, long InitAuditId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getAuditPlanCount(groupId, InitAuditId);
    }

    public static void clearService() {
        _service = null;
    }

    public static AuditPlanLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    AuditPlanLocalService.class.getName());

            if (invokableLocalService instanceof AuditPlanLocalService) {
                _service = (AuditPlanLocalService) invokableLocalService;
            } else {
                _service = new AuditPlanLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(AuditPlanLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(AuditPlanLocalService service) {
    }
}
