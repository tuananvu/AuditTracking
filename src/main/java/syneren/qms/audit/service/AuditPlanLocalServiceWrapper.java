package syneren.qms.audit.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AuditPlanLocalService}.
 *
 * @author anguyen
 * @see AuditPlanLocalService
 * @generated
 */
public class AuditPlanLocalServiceWrapper implements AuditPlanLocalService,
    ServiceWrapper<AuditPlanLocalService> {
    private AuditPlanLocalService _auditPlanLocalService;

    public AuditPlanLocalServiceWrapper(
        AuditPlanLocalService auditPlanLocalService) {
        _auditPlanLocalService = auditPlanLocalService;
    }

    /**
    * Adds the audit plan to the database. Also notifies the appropriate model listeners.
    *
    * @param auditPlan the audit plan
    * @return the audit plan that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public syneren.qms.audit.model.AuditPlan addAuditPlan(
        syneren.qms.audit.model.AuditPlan auditPlan)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _auditPlanLocalService.addAuditPlan(auditPlan);
    }

    /**
    * Creates a new audit plan with the primary key. Does not add the audit plan to the database.
    *
    * @param PlanId the primary key for the new audit plan
    * @return the new audit plan
    */
    @Override
    public syneren.qms.audit.model.AuditPlan createAuditPlan(long PlanId) {
        return _auditPlanLocalService.createAuditPlan(PlanId);
    }

    /**
    * Deletes the audit plan with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param PlanId the primary key of the audit plan
    * @return the audit plan that was removed
    * @throws PortalException if a audit plan with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public syneren.qms.audit.model.AuditPlan deleteAuditPlan(long PlanId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _auditPlanLocalService.deleteAuditPlan(PlanId);
    }

    /**
    * Deletes the audit plan from the database. Also notifies the appropriate model listeners.
    *
    * @param auditPlan the audit plan
    * @return the audit plan that was removed
    * @throws PortalException
    * @throws SystemException if a system exception occurred
    */
    @Override
    public syneren.qms.audit.model.AuditPlan deleteAuditPlan(
        syneren.qms.audit.model.AuditPlan auditPlan)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _auditPlanLocalService.deleteAuditPlan(auditPlan);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _auditPlanLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _auditPlanLocalService.dynamicQuery(dynamicQuery);
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
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _auditPlanLocalService.dynamicQuery(dynamicQuery, start, end);
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
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _auditPlanLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _auditPlanLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _auditPlanLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public syneren.qms.audit.model.AuditPlan fetchAuditPlan(long PlanId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _auditPlanLocalService.fetchAuditPlan(PlanId);
    }

    /**
    * Returns the audit plan with the primary key.
    *
    * @param PlanId the primary key of the audit plan
    * @return the audit plan
    * @throws PortalException if a audit plan with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public syneren.qms.audit.model.AuditPlan getAuditPlan(long PlanId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _auditPlanLocalService.getAuditPlan(PlanId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _auditPlanLocalService.getPersistedModel(primaryKeyObj);
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
    @Override
    public java.util.List<syneren.qms.audit.model.AuditPlan> getAuditPlans(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _auditPlanLocalService.getAuditPlans(start, end);
    }

    /**
    * Returns the number of audit plans.
    *
    * @return the number of audit plans
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getAuditPlansCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _auditPlanLocalService.getAuditPlansCount();
    }

    /**
    * Updates the audit plan in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param auditPlan the audit plan
    * @return the audit plan that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public syneren.qms.audit.model.AuditPlan updateAuditPlan(
        syneren.qms.audit.model.AuditPlan auditPlan)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _auditPlanLocalService.updateAuditPlan(auditPlan);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _auditPlanLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _auditPlanLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _auditPlanLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public java.util.List<syneren.qms.audit.model.AuditPlan> getAuditPlans(
        long groupId, long InitAuditId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _auditPlanLocalService.getAuditPlans(groupId, InitAuditId);
    }

    @Override
    public java.util.List<syneren.qms.audit.model.AuditPlan> getAuditPlans(
        long groupId, long InitAuditId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _auditPlanLocalService.getAuditPlans(groupId, InitAuditId,
            start, end);
    }

    @Override
    public syneren.qms.audit.model.AuditPlan addAuditPlan(
        syneren.qms.audit.model.AuditPlan auditPlan, long userId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _auditPlanLocalService.addAuditPlan(auditPlan, userId);
    }

    @Override
    public int getAuditPlanCount(long groupId, long InitAuditId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _auditPlanLocalService.getAuditPlanCount(groupId, InitAuditId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public AuditPlanLocalService getWrappedAuditPlanLocalService() {
        return _auditPlanLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedAuditPlanLocalService(
        AuditPlanLocalService auditPlanLocalService) {
        _auditPlanLocalService = auditPlanLocalService;
    }

    @Override
    public AuditPlanLocalService getWrappedService() {
        return _auditPlanLocalService;
    }

    @Override
    public void setWrappedService(AuditPlanLocalService auditPlanLocalService) {
        _auditPlanLocalService = auditPlanLocalService;
    }
}
