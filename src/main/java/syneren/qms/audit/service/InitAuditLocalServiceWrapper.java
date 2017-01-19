package syneren.qms.audit.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link InitAuditLocalService}.
 *
 * @author anguyen
 * @see InitAuditLocalService
 * @generated
 */
public class InitAuditLocalServiceWrapper implements InitAuditLocalService,
    ServiceWrapper<InitAuditLocalService> {
    private InitAuditLocalService _initAuditLocalService;

    public InitAuditLocalServiceWrapper(
        InitAuditLocalService initAuditLocalService) {
        _initAuditLocalService = initAuditLocalService;
    }

    /**
    * Adds the init audit to the database. Also notifies the appropriate model listeners.
    *
    * @param initAudit the init audit
    * @return the init audit that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public syneren.qms.audit.model.InitAudit addInitAudit(
        syneren.qms.audit.model.InitAudit initAudit)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _initAuditLocalService.addInitAudit(initAudit);
    }

    /**
    * Creates a new init audit with the primary key. Does not add the init audit to the database.
    *
    * @param InitAuditId the primary key for the new init audit
    * @return the new init audit
    */
    @Override
    public syneren.qms.audit.model.InitAudit createInitAudit(long InitAuditId) {
        return _initAuditLocalService.createInitAudit(InitAuditId);
    }

    /**
    * Deletes the init audit with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param InitAuditId the primary key of the init audit
    * @return the init audit that was removed
    * @throws PortalException if a init audit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public syneren.qms.audit.model.InitAudit deleteInitAudit(long InitAuditId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _initAuditLocalService.deleteInitAudit(InitAuditId);
    }

    /**
    * Deletes the init audit from the database. Also notifies the appropriate model listeners.
    *
    * @param initAudit the init audit
    * @return the init audit that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public syneren.qms.audit.model.InitAudit deleteInitAudit(
        syneren.qms.audit.model.InitAudit initAudit)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _initAuditLocalService.deleteInitAudit(initAudit);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _initAuditLocalService.dynamicQuery();
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
        return _initAuditLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.InitAuditModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _initAuditLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.InitAuditModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _initAuditLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _initAuditLocalService.dynamicQueryCount(dynamicQuery);
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
        return _initAuditLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public syneren.qms.audit.model.InitAudit fetchInitAudit(long InitAuditId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _initAuditLocalService.fetchInitAudit(InitAuditId);
    }

    /**
    * Returns the init audit with the primary key.
    *
    * @param InitAuditId the primary key of the init audit
    * @return the init audit
    * @throws PortalException if a init audit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public syneren.qms.audit.model.InitAudit getInitAudit(long InitAuditId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _initAuditLocalService.getInitAudit(InitAuditId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _initAuditLocalService.getPersistedModel(primaryKeyObj);
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
    @Override
    public java.util.List<syneren.qms.audit.model.InitAudit> getInitAudits(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _initAuditLocalService.getInitAudits(start, end);
    }

    /**
    * Returns the number of init audits.
    *
    * @return the number of init audits
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getInitAuditsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _initAuditLocalService.getInitAuditsCount();
    }

    /**
    * Updates the init audit in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param initAudit the init audit
    * @return the init audit that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public syneren.qms.audit.model.InitAudit updateInitAudit(
        syneren.qms.audit.model.InitAudit initAudit)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _initAuditLocalService.updateInitAudit(initAudit);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _initAuditLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _initAuditLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _initAuditLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public java.util.List<syneren.qms.audit.model.InitAudit> getInitAudits(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _initAuditLocalService.getInitAudits(groupId);
    }

    @Override
    public java.util.List<syneren.qms.audit.model.InitAudit> getInitAudits(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _initAuditLocalService.getInitAudits(groupId, start, end);
    }

    @Override
    public syneren.qms.audit.model.InitAudit addInitAudit(
        syneren.qms.audit.model.InitAudit initAudit, long userId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _initAuditLocalService.addInitAudit(initAudit, userId);
    }

    @Override
    public syneren.qms.audit.model.InitAudit getFirstInitAuditByName(
        long groupId, java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _initAuditLocalService.getFirstInitAuditByName(groupId, name);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public InitAuditLocalService getWrappedInitAuditLocalService() {
        return _initAuditLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedInitAuditLocalService(
        InitAuditLocalService initAuditLocalService) {
        _initAuditLocalService = initAuditLocalService;
    }

    @Override
    public InitAuditLocalService getWrappedService() {
        return _initAuditLocalService;
    }

    @Override
    public void setWrappedService(InitAuditLocalService initAuditLocalService) {
        _initAuditLocalService = initAuditLocalService;
    }
}
