package syneren.qms.audit.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AuditFindingLocalService}.
 *
 * @author anguyen
 * @see AuditFindingLocalService
 * @generated
 */
public class AuditFindingLocalServiceWrapper implements AuditFindingLocalService,
    ServiceWrapper<AuditFindingLocalService> {
    private AuditFindingLocalService _auditFindingLocalService;

    public AuditFindingLocalServiceWrapper(
        AuditFindingLocalService auditFindingLocalService) {
        _auditFindingLocalService = auditFindingLocalService;
    }

    /**
    * Adds the audit finding to the database. Also notifies the appropriate model listeners.
    *
    * @param auditFinding the audit finding
    * @return the audit finding that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public syneren.qms.audit.model.AuditFinding addAuditFinding(
        syneren.qms.audit.model.AuditFinding auditFinding)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _auditFindingLocalService.addAuditFinding(auditFinding);
    }

    /**
    * Creates a new audit finding with the primary key. Does not add the audit finding to the database.
    *
    * @param FindingId the primary key for the new audit finding
    * @return the new audit finding
    */
    @Override
    public syneren.qms.audit.model.AuditFinding createAuditFinding(
        long FindingId) {
        return _auditFindingLocalService.createAuditFinding(FindingId);
    }

    /**
    * Deletes the audit finding with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param FindingId the primary key of the audit finding
    * @return the audit finding that was removed
    * @throws PortalException if a audit finding with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public syneren.qms.audit.model.AuditFinding deleteAuditFinding(
        long FindingId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _auditFindingLocalService.deleteAuditFinding(FindingId);
    }

    /**
    * Deletes the audit finding from the database. Also notifies the appropriate model listeners.
    *
    * @param auditFinding the audit finding
    * @return the audit finding that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public syneren.qms.audit.model.AuditFinding deleteAuditFinding(
        syneren.qms.audit.model.AuditFinding auditFinding)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _auditFindingLocalService.deleteAuditFinding(auditFinding);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _auditFindingLocalService.dynamicQuery();
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
        return _auditFindingLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditFindingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _auditFindingLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditFindingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _auditFindingLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _auditFindingLocalService.dynamicQueryCount(dynamicQuery);
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
        return _auditFindingLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public syneren.qms.audit.model.AuditFinding fetchAuditFinding(
        long FindingId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _auditFindingLocalService.fetchAuditFinding(FindingId);
    }

    /**
    * Returns the audit finding with the primary key.
    *
    * @param FindingId the primary key of the audit finding
    * @return the audit finding
    * @throws PortalException if a audit finding with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public syneren.qms.audit.model.AuditFinding getAuditFinding(long FindingId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _auditFindingLocalService.getAuditFinding(FindingId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _auditFindingLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the audit findings.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditFindingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of audit findings
    * @param end the upper bound of the range of audit findings (not inclusive)
    * @return the range of audit findings
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<syneren.qms.audit.model.AuditFinding> getAuditFindings(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _auditFindingLocalService.getAuditFindings(start, end);
    }

    /**
    * Returns the number of audit findings.
    *
    * @return the number of audit findings
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getAuditFindingsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _auditFindingLocalService.getAuditFindingsCount();
    }

    /**
    * Updates the audit finding in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param auditFinding the audit finding
    * @return the audit finding that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public syneren.qms.audit.model.AuditFinding updateAuditFinding(
        syneren.qms.audit.model.AuditFinding auditFinding)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _auditFindingLocalService.updateAuditFinding(auditFinding);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _auditFindingLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _auditFindingLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _auditFindingLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public AuditFindingLocalService getWrappedAuditFindingLocalService() {
        return _auditFindingLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedAuditFindingLocalService(
        AuditFindingLocalService auditFindingLocalService) {
        _auditFindingLocalService = auditFindingLocalService;
    }

    @Override
    public AuditFindingLocalService getWrappedService() {
        return _auditFindingLocalService;
    }

    @Override
    public void setWrappedService(
        AuditFindingLocalService auditFindingLocalService) {
        _auditFindingLocalService = auditFindingLocalService;
    }
}
