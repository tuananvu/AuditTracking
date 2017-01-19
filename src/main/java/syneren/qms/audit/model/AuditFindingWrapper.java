package syneren.qms.audit.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AuditFinding}.
 * </p>
 *
 * @author anguyen
 * @see AuditFinding
 * @generated
 */
public class AuditFindingWrapper implements AuditFinding,
    ModelWrapper<AuditFinding> {
    private AuditFinding _auditFinding;

    public AuditFindingWrapper(AuditFinding auditFinding) {
        _auditFinding = auditFinding;
    }

    @Override
    public Class<?> getModelClass() {
        return AuditFinding.class;
    }

    @Override
    public String getModelClassName() {
        return AuditFinding.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("FindingId", getFindingId());
        attributes.put("FindingName", getFindingName());
        attributes.put("PlanId", getPlanId());
        attributes.put("Type", getType());
        attributes.put("DueDate", getDueDate());
        attributes.put("Status", getStatus());
        attributes.put("FollowupDue", getFollowupDue());
        attributes.put("FollowupStatus", getFollowupStatus());
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
        Long FindingId = (Long) attributes.get("FindingId");

        if (FindingId != null) {
            setFindingId(FindingId);
        }

        String FindingName = (String) attributes.get("FindingName");

        if (FindingName != null) {
            setFindingName(FindingName);
        }

        Long PlanId = (Long) attributes.get("PlanId");

        if (PlanId != null) {
            setPlanId(PlanId);
        }

        String Type = (String) attributes.get("Type");

        if (Type != null) {
            setType(Type);
        }

        Date DueDate = (Date) attributes.get("DueDate");

        if (DueDate != null) {
            setDueDate(DueDate);
        }

        String Status = (String) attributes.get("Status");

        if (Status != null) {
            setStatus(Status);
        }

        Date FollowupDue = (Date) attributes.get("FollowupDue");

        if (FollowupDue != null) {
            setFollowupDue(FollowupDue);
        }

        String FollowupStatus = (String) attributes.get("FollowupStatus");

        if (FollowupStatus != null) {
            setFollowupStatus(FollowupStatus);
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
    * Returns the primary key of this audit finding.
    *
    * @return the primary key of this audit finding
    */
    @Override
    public long getPrimaryKey() {
        return _auditFinding.getPrimaryKey();
    }

    /**
    * Sets the primary key of this audit finding.
    *
    * @param primaryKey the primary key of this audit finding
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _auditFinding.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the finding ID of this audit finding.
    *
    * @return the finding ID of this audit finding
    */
    @Override
    public long getFindingId() {
        return _auditFinding.getFindingId();
    }

    /**
    * Sets the finding ID of this audit finding.
    *
    * @param FindingId the finding ID of this audit finding
    */
    @Override
    public void setFindingId(long FindingId) {
        _auditFinding.setFindingId(FindingId);
    }

    /**
    * Returns the finding name of this audit finding.
    *
    * @return the finding name of this audit finding
    */
    @Override
    public java.lang.String getFindingName() {
        return _auditFinding.getFindingName();
    }

    /**
    * Sets the finding name of this audit finding.
    *
    * @param FindingName the finding name of this audit finding
    */
    @Override
    public void setFindingName(java.lang.String FindingName) {
        _auditFinding.setFindingName(FindingName);
    }

    /**
    * Returns the plan ID of this audit finding.
    *
    * @return the plan ID of this audit finding
    */
    @Override
    public long getPlanId() {
        return _auditFinding.getPlanId();
    }

    /**
    * Sets the plan ID of this audit finding.
    *
    * @param PlanId the plan ID of this audit finding
    */
    @Override
    public void setPlanId(long PlanId) {
        _auditFinding.setPlanId(PlanId);
    }

    /**
    * Returns the type of this audit finding.
    *
    * @return the type of this audit finding
    */
    @Override
    public java.lang.String getType() {
        return _auditFinding.getType();
    }

    /**
    * Sets the type of this audit finding.
    *
    * @param Type the type of this audit finding
    */
    @Override
    public void setType(java.lang.String Type) {
        _auditFinding.setType(Type);
    }

    /**
    * Returns the due date of this audit finding.
    *
    * @return the due date of this audit finding
    */
    @Override
    public java.util.Date getDueDate() {
        return _auditFinding.getDueDate();
    }

    /**
    * Sets the due date of this audit finding.
    *
    * @param DueDate the due date of this audit finding
    */
    @Override
    public void setDueDate(java.util.Date DueDate) {
        _auditFinding.setDueDate(DueDate);
    }

    /**
    * Returns the status of this audit finding.
    *
    * @return the status of this audit finding
    */
    @Override
    public java.lang.String getStatus() {
        return _auditFinding.getStatus();
    }

    /**
    * Sets the status of this audit finding.
    *
    * @param Status the status of this audit finding
    */
    @Override
    public void setStatus(java.lang.String Status) {
        _auditFinding.setStatus(Status);
    }

    /**
    * Returns the followup due of this audit finding.
    *
    * @return the followup due of this audit finding
    */
    @Override
    public java.util.Date getFollowupDue() {
        return _auditFinding.getFollowupDue();
    }

    /**
    * Sets the followup due of this audit finding.
    *
    * @param FollowupDue the followup due of this audit finding
    */
    @Override
    public void setFollowupDue(java.util.Date FollowupDue) {
        _auditFinding.setFollowupDue(FollowupDue);
    }

    /**
    * Returns the followup status of this audit finding.
    *
    * @return the followup status of this audit finding
    */
    @Override
    public java.lang.String getFollowupStatus() {
        return _auditFinding.getFollowupStatus();
    }

    /**
    * Sets the followup status of this audit finding.
    *
    * @param FollowupStatus the followup status of this audit finding
    */
    @Override
    public void setFollowupStatus(java.lang.String FollowupStatus) {
        _auditFinding.setFollowupStatus(FollowupStatus);
    }

    /**
    * Returns the note of this audit finding.
    *
    * @return the note of this audit finding
    */
    @Override
    public java.lang.String getNote() {
        return _auditFinding.getNote();
    }

    /**
    * Sets the note of this audit finding.
    *
    * @param Note the note of this audit finding
    */
    @Override
    public void setNote(java.lang.String Note) {
        _auditFinding.setNote(Note);
    }

    /**
    * Returns the company ID of this audit finding.
    *
    * @return the company ID of this audit finding
    */
    @Override
    public long getCompanyId() {
        return _auditFinding.getCompanyId();
    }

    /**
    * Sets the company ID of this audit finding.
    *
    * @param companyId the company ID of this audit finding
    */
    @Override
    public void setCompanyId(long companyId) {
        _auditFinding.setCompanyId(companyId);
    }

    /**
    * Returns the group ID of this audit finding.
    *
    * @return the group ID of this audit finding
    */
    @Override
    public long getGroupId() {
        return _auditFinding.getGroupId();
    }

    /**
    * Sets the group ID of this audit finding.
    *
    * @param groupId the group ID of this audit finding
    */
    @Override
    public void setGroupId(long groupId) {
        _auditFinding.setGroupId(groupId);
    }

    /**
    * Returns the user ID of this audit finding.
    *
    * @return the user ID of this audit finding
    */
    @Override
    public long getUserId() {
        return _auditFinding.getUserId();
    }

    /**
    * Sets the user ID of this audit finding.
    *
    * @param userId the user ID of this audit finding
    */
    @Override
    public void setUserId(long userId) {
        _auditFinding.setUserId(userId);
    }

    /**
    * Returns the user uuid of this audit finding.
    *
    * @return the user uuid of this audit finding
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _auditFinding.getUserUuid();
    }

    /**
    * Sets the user uuid of this audit finding.
    *
    * @param userUuid the user uuid of this audit finding
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _auditFinding.setUserUuid(userUuid);
    }

    /**
    * Returns the create date of this audit finding.
    *
    * @return the create date of this audit finding
    */
    @Override
    public java.util.Date getCreateDate() {
        return _auditFinding.getCreateDate();
    }

    /**
    * Sets the create date of this audit finding.
    *
    * @param createDate the create date of this audit finding
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _auditFinding.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this audit finding.
    *
    * @return the modified date of this audit finding
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _auditFinding.getModifiedDate();
    }

    /**
    * Sets the modified date of this audit finding.
    *
    * @param modifiedDate the modified date of this audit finding
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _auditFinding.setModifiedDate(modifiedDate);
    }

    @Override
    public boolean isNew() {
        return _auditFinding.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _auditFinding.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _auditFinding.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _auditFinding.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _auditFinding.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _auditFinding.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _auditFinding.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _auditFinding.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _auditFinding.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _auditFinding.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _auditFinding.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new AuditFindingWrapper((AuditFinding) _auditFinding.clone());
    }

    @Override
    public int compareTo(syneren.qms.audit.model.AuditFinding auditFinding) {
        return _auditFinding.compareTo(auditFinding);
    }

    @Override
    public int hashCode() {
        return _auditFinding.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<syneren.qms.audit.model.AuditFinding> toCacheModel() {
        return _auditFinding.toCacheModel();
    }

    @Override
    public syneren.qms.audit.model.AuditFinding toEscapedModel() {
        return new AuditFindingWrapper(_auditFinding.toEscapedModel());
    }

    @Override
    public syneren.qms.audit.model.AuditFinding toUnescapedModel() {
        return new AuditFindingWrapper(_auditFinding.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _auditFinding.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _auditFinding.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _auditFinding.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof AuditFindingWrapper)) {
            return false;
        }

        AuditFindingWrapper auditFindingWrapper = (AuditFindingWrapper) obj;

        if (Validator.equals(_auditFinding, auditFindingWrapper._auditFinding)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public AuditFinding getWrappedAuditFinding() {
        return _auditFinding;
    }

    @Override
    public AuditFinding getWrappedModel() {
        return _auditFinding;
    }

    @Override
    public void resetOriginalValues() {
        _auditFinding.resetOriginalValues();
    }
}
