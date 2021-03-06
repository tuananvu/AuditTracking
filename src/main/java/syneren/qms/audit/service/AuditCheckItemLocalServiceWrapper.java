package syneren.qms.audit.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AuditCheckItemLocalService}.
 *
 * @author anguyen
 * @see AuditCheckItemLocalService
 * @generated
 */
public class AuditCheckItemLocalServiceWrapper
    implements AuditCheckItemLocalService,
        ServiceWrapper<AuditCheckItemLocalService> {
    private AuditCheckItemLocalService _auditCheckItemLocalService;

    public AuditCheckItemLocalServiceWrapper(
        AuditCheckItemLocalService auditCheckItemLocalService) {
        _auditCheckItemLocalService = auditCheckItemLocalService;
    }

    /**
    * Adds the audit check item to the database. Also notifies the appropriate model listeners.
    *
    * @param auditCheckItem the audit check item
    * @return the audit check item that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public syneren.qms.audit.model.AuditCheckItem addAuditCheckItem(
        syneren.qms.audit.model.AuditCheckItem auditCheckItem)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _auditCheckItemLocalService.addAuditCheckItem(auditCheckItem);
    }

    /**
    * Creates a new audit check item with the primary key. Does not add the audit check item to the database.
    *
    * @param CheckItemId the primary key for the new audit check item
    * @return the new audit check item
    */
    @Override
    public syneren.qms.audit.model.AuditCheckItem createAuditCheckItem(
        long CheckItemId) {
        return _auditCheckItemLocalService.createAuditCheckItem(CheckItemId);
    }

    /**
    * Deletes the audit check item with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param CheckItemId the primary key of the audit check item
    * @return the audit check item that was removed
    * @throws PortalException if a audit check item with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public syneren.qms.audit.model.AuditCheckItem deleteAuditCheckItem(
        long CheckItemId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _auditCheckItemLocalService.deleteAuditCheckItem(CheckItemId);
    }

    /**
    * Deletes the audit check item from the database. Also notifies the appropriate model listeners.
    *
    * @param auditCheckItem the audit check item
    * @return the audit check item that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public syneren.qms.audit.model.AuditCheckItem deleteAuditCheckItem(
        syneren.qms.audit.model.AuditCheckItem auditCheckItem)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _auditCheckItemLocalService.deleteAuditCheckItem(auditCheckItem);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _auditCheckItemLocalService.dynamicQuery();
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
        return _auditCheckItemLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditCheckItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _auditCheckItemLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditCheckItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _auditCheckItemLocalService.dynamicQuery(dynamicQuery, start,
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
        return _auditCheckItemLocalService.dynamicQueryCount(dynamicQuery);
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
        return _auditCheckItemLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public syneren.qms.audit.model.AuditCheckItem fetchAuditCheckItem(
        long CheckItemId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _auditCheckItemLocalService.fetchAuditCheckItem(CheckItemId);
    }

    /**
    * Returns the audit check item with the primary key.
    *
    * @param CheckItemId the primary key of the audit check item
    * @return the audit check item
    * @throws PortalException if a audit check item with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public syneren.qms.audit.model.AuditCheckItem getAuditCheckItem(
        long CheckItemId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _auditCheckItemLocalService.getAuditCheckItem(CheckItemId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _auditCheckItemLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the audit check items.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditCheckItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of audit check items
    * @param end the upper bound of the range of audit check items (not inclusive)
    * @return the range of audit check items
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<syneren.qms.audit.model.AuditCheckItem> getAuditCheckItems(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _auditCheckItemLocalService.getAuditCheckItems(start, end);
    }

    /**
    * Returns the number of audit check items.
    *
    * @return the number of audit check items
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getAuditCheckItemsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _auditCheckItemLocalService.getAuditCheckItemsCount();
    }

    /**
    * Updates the audit check item in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param auditCheckItem the audit check item
    * @return the audit check item that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public syneren.qms.audit.model.AuditCheckItem updateAuditCheckItem(
        syneren.qms.audit.model.AuditCheckItem auditCheckItem)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _auditCheckItemLocalService.updateAuditCheckItem(auditCheckItem);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _auditCheckItemLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _auditCheckItemLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _auditCheckItemLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public java.util.List<syneren.qms.audit.model.AuditCheckItem> getAuditCheckItems(
        long groupId, long AuditId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _auditCheckItemLocalService.getAuditCheckItems(groupId, AuditId);
    }

    @Override
    public java.util.List<syneren.qms.audit.model.AuditCheckItem> getAuditCheckItems(
        long groupId, long AuditId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _auditCheckItemLocalService.getAuditCheckItems(groupId, AuditId,
            start, end);
    }

    @Override
    public int getAuditCheckItemsCount(long groupId, long AuditId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _auditCheckItemLocalService.getAuditCheckItemsCount(groupId,
            AuditId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public AuditCheckItemLocalService getWrappedAuditCheckItemLocalService() {
        return _auditCheckItemLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedAuditCheckItemLocalService(
        AuditCheckItemLocalService auditCheckItemLocalService) {
        _auditCheckItemLocalService = auditCheckItemLocalService;
    }

    @Override
    public AuditCheckItemLocalService getWrappedService() {
        return _auditCheckItemLocalService;
    }

    @Override
    public void setWrappedService(
        AuditCheckItemLocalService auditCheckItemLocalService) {
        _auditCheckItemLocalService = auditCheckItemLocalService;
    }
}
