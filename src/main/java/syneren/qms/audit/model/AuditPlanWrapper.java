package syneren.qms.audit.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AuditPlan}.
 * </p>
 *
 * @author anguyen
 * @see AuditPlan
 * @generated
 */
public class AuditPlanWrapper implements AuditPlan, ModelWrapper<AuditPlan> {
    private AuditPlan _auditPlan;

    public AuditPlanWrapper(AuditPlan auditPlan) {
        _auditPlan = auditPlan;
    }

    @Override
    public Class<?> getModelClass() {
        return AuditPlan.class;
    }

    @Override
    public String getModelClassName() {
        return AuditPlan.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("PlanId", getPlanId());
        attributes.put("PlanName", getPlanName());
        attributes.put("InitAuditId", getInitAuditId());
        attributes.put("Auditor", getAuditor());
        attributes.put("AuditTeam", getAuditTeam());
        attributes.put("Interviewes", getInterviewes());
        attributes.put("PlanDate", getPlanDate());
        attributes.put("ActDate", getActDate());
        attributes.put("Status", getStatus());
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
        Long PlanId = (Long) attributes.get("PlanId");

        if (PlanId != null) {
            setPlanId(PlanId);
        }

        String PlanName = (String) attributes.get("PlanName");

        if (PlanName != null) {
            setPlanName(PlanName);
        }

        Long InitAuditId = (Long) attributes.get("InitAuditId");

        if (InitAuditId != null) {
            setInitAuditId(InitAuditId);
        }

        String Auditor = (String) attributes.get("Auditor");

        if (Auditor != null) {
            setAuditor(Auditor);
        }

        String AuditTeam = (String) attributes.get("AuditTeam");

        if (AuditTeam != null) {
            setAuditTeam(AuditTeam);
        }

        String Interviewes = (String) attributes.get("Interviewes");

        if (Interviewes != null) {
            setInterviewes(Interviewes);
        }

        Date PlanDate = (Date) attributes.get("PlanDate");

        if (PlanDate != null) {
            setPlanDate(PlanDate);
        }

        Date ActDate = (Date) attributes.get("ActDate");

        if (ActDate != null) {
            setActDate(ActDate);
        }

        String Status = (String) attributes.get("Status");

        if (Status != null) {
            setStatus(Status);
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
    * Returns the primary key of this audit plan.
    *
    * @return the primary key of this audit plan
    */
    @Override
    public long getPrimaryKey() {
        return _auditPlan.getPrimaryKey();
    }

    /**
    * Sets the primary key of this audit plan.
    *
    * @param primaryKey the primary key of this audit plan
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _auditPlan.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the plan ID of this audit plan.
    *
    * @return the plan ID of this audit plan
    */
    @Override
    public long getPlanId() {
        return _auditPlan.getPlanId();
    }

    /**
    * Sets the plan ID of this audit plan.
    *
    * @param PlanId the plan ID of this audit plan
    */
    @Override
    public void setPlanId(long PlanId) {
        _auditPlan.setPlanId(PlanId);
    }

    /**
    * Returns the plan name of this audit plan.
    *
    * @return the plan name of this audit plan
    */
    @Override
    public java.lang.String getPlanName() {
        return _auditPlan.getPlanName();
    }

    /**
    * Sets the plan name of this audit plan.
    *
    * @param PlanName the plan name of this audit plan
    */
    @Override
    public void setPlanName(java.lang.String PlanName) {
        _auditPlan.setPlanName(PlanName);
    }

    /**
    * Returns the init audit ID of this audit plan.
    *
    * @return the init audit ID of this audit plan
    */
    @Override
    public long getInitAuditId() {
        return _auditPlan.getInitAuditId();
    }

    /**
    * Sets the init audit ID of this audit plan.
    *
    * @param InitAuditId the init audit ID of this audit plan
    */
    @Override
    public void setInitAuditId(long InitAuditId) {
        _auditPlan.setInitAuditId(InitAuditId);
    }

    /**
    * Returns the auditor of this audit plan.
    *
    * @return the auditor of this audit plan
    */
    @Override
    public java.lang.String getAuditor() {
        return _auditPlan.getAuditor();
    }

    /**
    * Sets the auditor of this audit plan.
    *
    * @param Auditor the auditor of this audit plan
    */
    @Override
    public void setAuditor(java.lang.String Auditor) {
        _auditPlan.setAuditor(Auditor);
    }

    /**
    * Returns the audit team of this audit plan.
    *
    * @return the audit team of this audit plan
    */
    @Override
    public java.lang.String getAuditTeam() {
        return _auditPlan.getAuditTeam();
    }

    /**
    * Sets the audit team of this audit plan.
    *
    * @param AuditTeam the audit team of this audit plan
    */
    @Override
    public void setAuditTeam(java.lang.String AuditTeam) {
        _auditPlan.setAuditTeam(AuditTeam);
    }

    /**
    * Returns the interviewes of this audit plan.
    *
    * @return the interviewes of this audit plan
    */
    @Override
    public java.lang.String getInterviewes() {
        return _auditPlan.getInterviewes();
    }

    /**
    * Sets the interviewes of this audit plan.
    *
    * @param Interviewes the interviewes of this audit plan
    */
    @Override
    public void setInterviewes(java.lang.String Interviewes) {
        _auditPlan.setInterviewes(Interviewes);
    }

    /**
    * Returns the plan date of this audit plan.
    *
    * @return the plan date of this audit plan
    */
    @Override
    public java.util.Date getPlanDate() {
        return _auditPlan.getPlanDate();
    }

    /**
    * Sets the plan date of this audit plan.
    *
    * @param PlanDate the plan date of this audit plan
    */
    @Override
    public void setPlanDate(java.util.Date PlanDate) {
        _auditPlan.setPlanDate(PlanDate);
    }

    /**
    * Returns the act date of this audit plan.
    *
    * @return the act date of this audit plan
    */
    @Override
    public java.util.Date getActDate() {
        return _auditPlan.getActDate();
    }

    /**
    * Sets the act date of this audit plan.
    *
    * @param ActDate the act date of this audit plan
    */
    @Override
    public void setActDate(java.util.Date ActDate) {
        _auditPlan.setActDate(ActDate);
    }

    /**
    * Returns the status of this audit plan.
    *
    * @return the status of this audit plan
    */
    @Override
    public java.lang.String getStatus() {
        return _auditPlan.getStatus();
    }

    /**
    * Sets the status of this audit plan.
    *
    * @param Status the status of this audit plan
    */
    @Override
    public void setStatus(java.lang.String Status) {
        _auditPlan.setStatus(Status);
    }

    /**
    * Returns the note of this audit plan.
    *
    * @return the note of this audit plan
    */
    @Override
    public java.lang.String getNote() {
        return _auditPlan.getNote();
    }

    /**
    * Sets the note of this audit plan.
    *
    * @param Note the note of this audit plan
    */
    @Override
    public void setNote(java.lang.String Note) {
        _auditPlan.setNote(Note);
    }

    /**
    * Returns the company ID of this audit plan.
    *
    * @return the company ID of this audit plan
    */
    @Override
    public long getCompanyId() {
        return _auditPlan.getCompanyId();
    }

    /**
    * Sets the company ID of this audit plan.
    *
    * @param companyId the company ID of this audit plan
    */
    @Override
    public void setCompanyId(long companyId) {
        _auditPlan.setCompanyId(companyId);
    }

    /**
    * Returns the group ID of this audit plan.
    *
    * @return the group ID of this audit plan
    */
    @Override
    public long getGroupId() {
        return _auditPlan.getGroupId();
    }

    /**
    * Sets the group ID of this audit plan.
    *
    * @param groupId the group ID of this audit plan
    */
    @Override
    public void setGroupId(long groupId) {
        _auditPlan.setGroupId(groupId);
    }

    /**
    * Returns the user ID of this audit plan.
    *
    * @return the user ID of this audit plan
    */
    @Override
    public long getUserId() {
        return _auditPlan.getUserId();
    }

    /**
    * Sets the user ID of this audit plan.
    *
    * @param userId the user ID of this audit plan
    */
    @Override
    public void setUserId(long userId) {
        _auditPlan.setUserId(userId);
    }

    /**
    * Returns the user uuid of this audit plan.
    *
    * @return the user uuid of this audit plan
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _auditPlan.getUserUuid();
    }

    /**
    * Sets the user uuid of this audit plan.
    *
    * @param userUuid the user uuid of this audit plan
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _auditPlan.setUserUuid(userUuid);
    }

    /**
    * Returns the create date of this audit plan.
    *
    * @return the create date of this audit plan
    */
    @Override
    public java.util.Date getCreateDate() {
        return _auditPlan.getCreateDate();
    }

    /**
    * Sets the create date of this audit plan.
    *
    * @param createDate the create date of this audit plan
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _auditPlan.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this audit plan.
    *
    * @return the modified date of this audit plan
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _auditPlan.getModifiedDate();
    }

    /**
    * Sets the modified date of this audit plan.
    *
    * @param modifiedDate the modified date of this audit plan
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _auditPlan.setModifiedDate(modifiedDate);
    }

    @Override
    public boolean isNew() {
        return _auditPlan.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _auditPlan.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _auditPlan.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _auditPlan.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _auditPlan.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _auditPlan.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _auditPlan.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _auditPlan.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _auditPlan.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _auditPlan.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _auditPlan.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new AuditPlanWrapper((AuditPlan) _auditPlan.clone());
    }

    @Override
    public int compareTo(syneren.qms.audit.model.AuditPlan auditPlan) {
        return _auditPlan.compareTo(auditPlan);
    }

    @Override
    public int hashCode() {
        return _auditPlan.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<syneren.qms.audit.model.AuditPlan> toCacheModel() {
        return _auditPlan.toCacheModel();
    }

    @Override
    public syneren.qms.audit.model.AuditPlan toEscapedModel() {
        return new AuditPlanWrapper(_auditPlan.toEscapedModel());
    }

    @Override
    public syneren.qms.audit.model.AuditPlan toUnescapedModel() {
        return new AuditPlanWrapper(_auditPlan.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _auditPlan.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _auditPlan.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _auditPlan.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof AuditPlanWrapper)) {
            return false;
        }

        AuditPlanWrapper auditPlanWrapper = (AuditPlanWrapper) obj;

        if (Validator.equals(_auditPlan, auditPlanWrapper._auditPlan)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public AuditPlan getWrappedAuditPlan() {
        return _auditPlan;
    }

    @Override
    public AuditPlan getWrappedModel() {
        return _auditPlan;
    }

    @Override
    public void resetOriginalValues() {
        _auditPlan.resetOriginalValues();
    }
}
