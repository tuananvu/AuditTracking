package syneren.qms.audit.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AuditReport}.
 * </p>
 *
 * @author anguyen
 * @see AuditReport
 * @generated
 */
public class AuditReportWrapper implements AuditReport,
    ModelWrapper<AuditReport> {
    private AuditReport _auditReport;

    public AuditReportWrapper(AuditReport auditReport) {
        _auditReport = auditReport;
    }

    @Override
    public Class<?> getModelClass() {
        return AuditReport.class;
    }

    @Override
    public String getModelClassName() {
        return AuditReport.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("AuditId", getAuditId());
        attributes.put("AuditName", getAuditName());
        attributes.put("InitAuditId", getInitAuditId());
        attributes.put("Auditor", getAuditor());
        attributes.put("Note", getNote());
        attributes.put("companyId", getCompanyId());
        attributes.put("groupId", getGroupId());
        attributes.put("userId", getUserId());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long AuditId = (Long) attributes.get("AuditId");

        if (AuditId != null) {
            setAuditId(AuditId);
        }

        String AuditName = (String) attributes.get("AuditName");

        if (AuditName != null) {
            setAuditName(AuditName);
        }

        Long InitAuditId = (Long) attributes.get("InitAuditId");

        if (InitAuditId != null) {
            setInitAuditId(InitAuditId);
        }

        String Auditor = (String) attributes.get("Auditor");

        if (Auditor != null) {
            setAuditor(Auditor);
        }

        String Note = (String) attributes.get("Note");

        if (Note != null) {
            setNote(Note);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }
    }

    /**
    * Returns the primary key of this audit report.
    *
    * @return the primary key of this audit report
    */
    @Override
    public long getPrimaryKey() {
        return _auditReport.getPrimaryKey();
    }

    /**
    * Sets the primary key of this audit report.
    *
    * @param primaryKey the primary key of this audit report
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _auditReport.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the audit ID of this audit report.
    *
    * @return the audit ID of this audit report
    */
    @Override
    public long getAuditId() {
        return _auditReport.getAuditId();
    }

    /**
    * Sets the audit ID of this audit report.
    *
    * @param AuditId the audit ID of this audit report
    */
    @Override
    public void setAuditId(long AuditId) {
        _auditReport.setAuditId(AuditId);
    }

    /**
    * Returns the audit name of this audit report.
    *
    * @return the audit name of this audit report
    */
    @Override
    public java.lang.String getAuditName() {
        return _auditReport.getAuditName();
    }

    /**
    * Sets the audit name of this audit report.
    *
    * @param AuditName the audit name of this audit report
    */
    @Override
    public void setAuditName(java.lang.String AuditName) {
        _auditReport.setAuditName(AuditName);
    }

    /**
    * Returns the init audit ID of this audit report.
    *
    * @return the init audit ID of this audit report
    */
    @Override
    public long getInitAuditId() {
        return _auditReport.getInitAuditId();
    }

    /**
    * Sets the init audit ID of this audit report.
    *
    * @param InitAuditId the init audit ID of this audit report
    */
    @Override
    public void setInitAuditId(long InitAuditId) {
        _auditReport.setInitAuditId(InitAuditId);
    }

    /**
    * Returns the auditor of this audit report.
    *
    * @return the auditor of this audit report
    */
    @Override
    public java.lang.String getAuditor() {
        return _auditReport.getAuditor();
    }

    /**
    * Sets the auditor of this audit report.
    *
    * @param Auditor the auditor of this audit report
    */
    @Override
    public void setAuditor(java.lang.String Auditor) {
        _auditReport.setAuditor(Auditor);
    }

    /**
    * Returns the note of this audit report.
    *
    * @return the note of this audit report
    */
    @Override
    public java.lang.String getNote() {
        return _auditReport.getNote();
    }

    /**
    * Sets the note of this audit report.
    *
    * @param Note the note of this audit report
    */
    @Override
    public void setNote(java.lang.String Note) {
        _auditReport.setNote(Note);
    }

    /**
    * Returns the company ID of this audit report.
    *
    * @return the company ID of this audit report
    */
    @Override
    public long getCompanyId() {
        return _auditReport.getCompanyId();
    }

    /**
    * Sets the company ID of this audit report.
    *
    * @param companyId the company ID of this audit report
    */
    @Override
    public void setCompanyId(long companyId) {
        _auditReport.setCompanyId(companyId);
    }

    /**
    * Returns the group ID of this audit report.
    *
    * @return the group ID of this audit report
    */
    @Override
    public long getGroupId() {
        return _auditReport.getGroupId();
    }

    /**
    * Sets the group ID of this audit report.
    *
    * @param groupId the group ID of this audit report
    */
    @Override
    public void setGroupId(long groupId) {
        _auditReport.setGroupId(groupId);
    }

    /**
    * Returns the user ID of this audit report.
    *
    * @return the user ID of this audit report
    */
    @Override
    public long getUserId() {
        return _auditReport.getUserId();
    }

    /**
    * Sets the user ID of this audit report.
    *
    * @param userId the user ID of this audit report
    */
    @Override
    public void setUserId(long userId) {
        _auditReport.setUserId(userId);
    }

    /**
    * Returns the user uuid of this audit report.
    *
    * @return the user uuid of this audit report
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _auditReport.getUserUuid();
    }

    /**
    * Sets the user uuid of this audit report.
    *
    * @param userUuid the user uuid of this audit report
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _auditReport.setUserUuid(userUuid);
    }

    /**
    * Returns the create date of this audit report.
    *
    * @return the create date of this audit report
    */
    @Override
    public java.util.Date getCreateDate() {
        return _auditReport.getCreateDate();
    }

    /**
    * Sets the create date of this audit report.
    *
    * @param createDate the create date of this audit report
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _auditReport.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this audit report.
    *
    * @return the modified date of this audit report
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _auditReport.getModifiedDate();
    }

    /**
    * Sets the modified date of this audit report.
    *
    * @param modifiedDate the modified date of this audit report
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _auditReport.setModifiedDate(modifiedDate);
    }

    @Override
    public boolean isNew() {
        return _auditReport.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _auditReport.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _auditReport.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _auditReport.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _auditReport.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _auditReport.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _auditReport.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _auditReport.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _auditReport.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _auditReport.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _auditReport.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new AuditReportWrapper((AuditReport) _auditReport.clone());
    }

    @Override
    public int compareTo(syneren.qms.audit.model.AuditReport auditReport) {
        return _auditReport.compareTo(auditReport);
    }

    @Override
    public int hashCode() {
        return _auditReport.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<syneren.qms.audit.model.AuditReport> toCacheModel() {
        return _auditReport.toCacheModel();
    }

    @Override
    public syneren.qms.audit.model.AuditReport toEscapedModel() {
        return new AuditReportWrapper(_auditReport.toEscapedModel());
    }

    @Override
    public syneren.qms.audit.model.AuditReport toUnescapedModel() {
        return new AuditReportWrapper(_auditReport.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _auditReport.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _auditReport.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _auditReport.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof AuditReportWrapper)) {
            return false;
        }

        AuditReportWrapper auditReportWrapper = (AuditReportWrapper) obj;

        if (Validator.equals(_auditReport, auditReportWrapper._auditReport)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public AuditReport getWrappedAuditReport() {
        return _auditReport;
    }

    @Override
    public AuditReport getWrappedModel() {
        return _auditReport;
    }

    @Override
    public void resetOriginalValues() {
        _auditReport.resetOriginalValues();
    }
}
