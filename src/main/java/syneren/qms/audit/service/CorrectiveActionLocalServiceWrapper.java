package syneren.qms.audit.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CorrectiveActionLocalService}.
 *
 * @author anguyen
 * @see CorrectiveActionLocalService
 * @generated
 */
public class CorrectiveActionLocalServiceWrapper
    implements CorrectiveActionLocalService,
        ServiceWrapper<CorrectiveActionLocalService> {
    private CorrectiveActionLocalService _correctiveActionLocalService;

    public CorrectiveActionLocalServiceWrapper(
        CorrectiveActionLocalService correctiveActionLocalService) {
        _correctiveActionLocalService = correctiveActionLocalService;
    }

    /**
    * Adds the corrective action to the database. Also notifies the appropriate model listeners.
    *
    * @param correctiveAction the corrective action
    * @return the corrective action that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public syneren.qms.audit.model.CorrectiveAction addCorrectiveAction(
        syneren.qms.audit.model.CorrectiveAction correctiveAction)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _correctiveActionLocalService.addCorrectiveAction(correctiveAction);
    }

    /**
    * Creates a new corrective action with the primary key. Does not add the corrective action to the database.
    *
    * @param ActionId the primary key for the new corrective action
    * @return the new corrective action
    */
    @Override
    public syneren.qms.audit.model.CorrectiveAction createCorrectiveAction(
        long ActionId) {
        return _correctiveActionLocalService.createCorrectiveAction(ActionId);
    }

    /**
    * Deletes the corrective action with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param ActionId the primary key of the corrective action
    * @return the corrective action that was removed
    * @throws PortalException if a corrective action with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public syneren.qms.audit.model.CorrectiveAction deleteCorrectiveAction(
        long ActionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _correctiveActionLocalService.deleteCorrectiveAction(ActionId);
    }

    /**
    * Deletes the corrective action from the database. Also notifies the appropriate model listeners.
    *
    * @param correctiveAction the corrective action
    * @return the corrective action that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public syneren.qms.audit.model.CorrectiveAction deleteCorrectiveAction(
        syneren.qms.audit.model.CorrectiveAction correctiveAction)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _correctiveActionLocalService.deleteCorrectiveAction(correctiveAction);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _correctiveActionLocalService.dynamicQuery();
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
        return _correctiveActionLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.CorrectiveActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _correctiveActionLocalService.dynamicQuery(dynamicQuery, start,
            end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.CorrectiveActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _correctiveActionLocalService.dynamicQuery(dynamicQuery, start,
            end, orderByComparator);
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
        return _correctiveActionLocalService.dynamicQueryCount(dynamicQuery);
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
        return _correctiveActionLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public syneren.qms.audit.model.CorrectiveAction fetchCorrectiveAction(
        long ActionId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _correctiveActionLocalService.fetchCorrectiveAction(ActionId);
    }

    /**
    * Returns the corrective action with the primary key.
    *
    * @param ActionId the primary key of the corrective action
    * @return the corrective action
    * @throws PortalException if a corrective action with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public syneren.qms.audit.model.CorrectiveAction getCorrectiveAction(
        long ActionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _correctiveActionLocalService.getCorrectiveAction(ActionId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _correctiveActionLocalService.getPersistedModel(primaryKeyObj);
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
    @Override
    public java.util.List<syneren.qms.audit.model.CorrectiveAction> getCorrectiveActions(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _correctiveActionLocalService.getCorrectiveActions(start, end);
    }

    /**
    * Returns the number of corrective actions.
    *
    * @return the number of corrective actions
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getCorrectiveActionsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _correctiveActionLocalService.getCorrectiveActionsCount();
    }

    /**
    * Updates the corrective action in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param correctiveAction the corrective action
    * @return the corrective action that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public syneren.qms.audit.model.CorrectiveAction updateCorrectiveAction(
        syneren.qms.audit.model.CorrectiveAction correctiveAction)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _correctiveActionLocalService.updateCorrectiveAction(correctiveAction);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _correctiveActionLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _correctiveActionLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _correctiveActionLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public CorrectiveActionLocalService getWrappedCorrectiveActionLocalService() {
        return _correctiveActionLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedCorrectiveActionLocalService(
        CorrectiveActionLocalService correctiveActionLocalService) {
        _correctiveActionLocalService = correctiveActionLocalService;
    }

    @Override
    public CorrectiveActionLocalService getWrappedService() {
        return _correctiveActionLocalService;
    }

    @Override
    public void setWrappedService(
        CorrectiveActionLocalService correctiveActionLocalService) {
        _correctiveActionLocalService = correctiveActionLocalService;
    }
}
