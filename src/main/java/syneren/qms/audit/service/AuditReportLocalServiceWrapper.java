package syneren.qms.audit.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AuditReportLocalService}.
 *
 * @author anguyen
 * @see AuditReportLocalService
 * @generated
 */
public class AuditReportLocalServiceWrapper implements AuditReportLocalService,
    ServiceWrapper<AuditReportLocalService> {
    private AuditReportLocalService _auditReportLocalService;

    public AuditReportLocalServiceWrapper(
        AuditReportLocalService auditReportLocalService) {
        _auditReportLocalService = auditReportLocalService;
    }

    /**
    * Adds the audit report to the database. Also notifies the appropriate model listeners.
    *
    * @param auditReport the audit report
    * @return the audit report that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public syneren.qms.audit.model.AuditReport addAuditReport(
        syneren.qms.audit.model.AuditReport auditReport)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _auditReportLocalService.addAuditReport(auditReport);
    }

    /**
    * Creates a new audit report with the primary key. Does not add the audit report to the database.
    *
    * @param AuditId the primary key for the new audit report
    * @return the new audit report
    */
    @Override
    public syneren.qms.audit.model.AuditReport createAuditReport(long AuditId) {
        return _auditReportLocalService.createAuditReport(AuditId);
    }

    /**
    * Deletes the audit report with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param AuditId the primary key of the audit report
    * @return the audit report that was removed
    * @throws PortalException if a audit report with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public syneren.qms.audit.model.AuditReport deleteAuditReport(long AuditId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _auditReportLocalService.deleteAuditReport(AuditId);
    }

    /**
    * Deletes the audit report from the database. Also notifies the appropriate model listeners.
    *
    * @param auditReport the audit report
    * @return the audit report that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public syneren.qms.audit.model.AuditReport deleteAuditReport(
        syneren.qms.audit.model.AuditReport auditReport)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _auditReportLocalService.deleteAuditReport(auditReport);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _auditReportLocalService.dynamicQuery();
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
        return _auditReportLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _auditReportLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _auditReportLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _auditReportLocalService.dynamicQueryCount(dynamicQuery);
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
        return _auditReportLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public syneren.qms.audit.model.AuditReport fetchAuditReport(long AuditId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _auditReportLocalService.fetchAuditReport(AuditId);
    }

    /**
    * Returns the audit report with the primary key.
    *
    * @param AuditId the primary key of the audit report
    * @return the audit report
    * @throws PortalException if a audit report with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public syneren.qms.audit.model.AuditReport getAuditReport(long AuditId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _auditReportLocalService.getAuditReport(AuditId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _auditReportLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the audit reports.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of audit reports
    * @param end the upper bound of the range of audit reports (not inclusive)
    * @return the range of audit reports
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<syneren.qms.audit.model.AuditReport> getAuditReports(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _auditReportLocalService.getAuditReports(start, end);
    }

    /**
    * Returns the number of audit reports.
    *
    * @return the number of audit reports
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getAuditReportsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _auditReportLocalService.getAuditReportsCount();
    }

    /**
    * Updates the audit report in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param auditReport the audit report
    * @return the audit report that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public syneren.qms.audit.model.AuditReport updateAuditReport(
        syneren.qms.audit.model.AuditReport auditReport)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _auditReportLocalService.updateAuditReport(auditReport);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _auditReportLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _auditReportLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _auditReportLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public AuditReportLocalService getWrappedAuditReportLocalService() {
        return _auditReportLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedAuditReportLocalService(
        AuditReportLocalService auditReportLocalService) {
        _auditReportLocalService = auditReportLocalService;
    }

    @Override
    public AuditReportLocalService getWrappedService() {
        return _auditReportLocalService;
    }

    @Override
    public void setWrappedService(
        AuditReportLocalService auditReportLocalService) {
        _auditReportLocalService = auditReportLocalService;
    }
}
