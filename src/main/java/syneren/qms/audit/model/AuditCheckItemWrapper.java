package syneren.qms.audit.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AuditCheckItem}.
 * </p>
 *
 * @author anguyen
 * @see AuditCheckItem
 * @generated
 */
public class AuditCheckItemWrapper implements AuditCheckItem,
    ModelWrapper<AuditCheckItem> {
    private AuditCheckItem _auditCheckItem;

    public AuditCheckItemWrapper(AuditCheckItem auditCheckItem) {
        _auditCheckItem = auditCheckItem;
    }

    @Override
    public Class<?> getModelClass() {
        return AuditCheckItem.class;
    }

    @Override
    public String getModelClassName() {
        return AuditCheckItem.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("CheckItemId", getCheckItemId());
        attributes.put("CheckItemName", getCheckItemName());
        attributes.put("Question", getQuestion());
        attributes.put("Answer", getAnswer());
        attributes.put("Complie", getComplie());
        attributes.put("Evidence", getEvidence());
        attributes.put("Outcome", getOutcome());
        attributes.put("companyId", getCompanyId());
        attributes.put("groupId", getGroupId());
        attributes.put("userId", getUserId());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("AuditId", getAuditId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long CheckItemId = (Long) attributes.get("CheckItemId");

        if (CheckItemId != null) {
            setCheckItemId(CheckItemId);
        }

        String CheckItemName = (String) attributes.get("CheckItemName");

        if (CheckItemName != null) {
            setCheckItemName(CheckItemName);
        }

        String Question = (String) attributes.get("Question");

        if (Question != null) {
            setQuestion(Question);
        }

        String Answer = (String) attributes.get("Answer");

        if (Answer != null) {
            setAnswer(Answer);
        }

        Boolean Complie = (Boolean) attributes.get("Complie");

        if (Complie != null) {
            setComplie(Complie);
        }

        String Evidence = (String) attributes.get("Evidence");

        if (Evidence != null) {
            setEvidence(Evidence);
        }

        String Outcome = (String) attributes.get("Outcome");

        if (Outcome != null) {
            setOutcome(Outcome);
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

        Long AuditId = (Long) attributes.get("AuditId");

        if (AuditId != null) {
            setAuditId(AuditId);
        }
    }

    /**
    * Returns the primary key of this audit check item.
    *
    * @return the primary key of this audit check item
    */
    @Override
    public long getPrimaryKey() {
        return _auditCheckItem.getPrimaryKey();
    }

    /**
    * Sets the primary key of this audit check item.
    *
    * @param primaryKey the primary key of this audit check item
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _auditCheckItem.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the check item ID of this audit check item.
    *
    * @return the check item ID of this audit check item
    */
    @Override
    public long getCheckItemId() {
        return _auditCheckItem.getCheckItemId();
    }

    /**
    * Sets the check item ID of this audit check item.
    *
    * @param CheckItemId the check item ID of this audit check item
    */
    @Override
    public void setCheckItemId(long CheckItemId) {
        _auditCheckItem.setCheckItemId(CheckItemId);
    }

    /**
    * Returns the check item name of this audit check item.
    *
    * @return the check item name of this audit check item
    */
    @Override
    public java.lang.String getCheckItemName() {
        return _auditCheckItem.getCheckItemName();
    }

    /**
    * Sets the check item name of this audit check item.
    *
    * @param CheckItemName the check item name of this audit check item
    */
    @Override
    public void setCheckItemName(java.lang.String CheckItemName) {
        _auditCheckItem.setCheckItemName(CheckItemName);
    }

    /**
    * Returns the question of this audit check item.
    *
    * @return the question of this audit check item
    */
    @Override
    public java.lang.String getQuestion() {
        return _auditCheckItem.getQuestion();
    }

    /**
    * Sets the question of this audit check item.
    *
    * @param Question the question of this audit check item
    */
    @Override
    public void setQuestion(java.lang.String Question) {
        _auditCheckItem.setQuestion(Question);
    }

    /**
    * Returns the answer of this audit check item.
    *
    * @return the answer of this audit check item
    */
    @Override
    public java.lang.String getAnswer() {
        return _auditCheckItem.getAnswer();
    }

    /**
    * Sets the answer of this audit check item.
    *
    * @param Answer the answer of this audit check item
    */
    @Override
    public void setAnswer(java.lang.String Answer) {
        _auditCheckItem.setAnswer(Answer);
    }

    /**
    * Returns the complie of this audit check item.
    *
    * @return the complie of this audit check item
    */
    @Override
    public boolean getComplie() {
        return _auditCheckItem.getComplie();
    }

    /**
    * Returns <code>true</code> if this audit check item is complie.
    *
    * @return <code>true</code> if this audit check item is complie; <code>false</code> otherwise
    */
    @Override
    public boolean isComplie() {
        return _auditCheckItem.isComplie();
    }

    /**
    * Sets whether this audit check item is complie.
    *
    * @param Complie the complie of this audit check item
    */
    @Override
    public void setComplie(boolean Complie) {
        _auditCheckItem.setComplie(Complie);
    }

    /**
    * Returns the evidence of this audit check item.
    *
    * @return the evidence of this audit check item
    */
    @Override
    public java.lang.String getEvidence() {
        return _auditCheckItem.getEvidence();
    }

    /**
    * Sets the evidence of this audit check item.
    *
    * @param Evidence the evidence of this audit check item
    */
    @Override
    public void setEvidence(java.lang.String Evidence) {
        _auditCheckItem.setEvidence(Evidence);
    }

    /**
    * Returns the outcome of this audit check item.
    *
    * @return the outcome of this audit check item
    */
    @Override
    public java.lang.String getOutcome() {
        return _auditCheckItem.getOutcome();
    }

    /**
    * Sets the outcome of this audit check item.
    *
    * @param Outcome the outcome of this audit check item
    */
    @Override
    public void setOutcome(java.lang.String Outcome) {
        _auditCheckItem.setOutcome(Outcome);
    }

    /**
    * Returns the company ID of this audit check item.
    *
    * @return the company ID of this audit check item
    */
    @Override
    public long getCompanyId() {
        return _auditCheckItem.getCompanyId();
    }

    /**
    * Sets the company ID of this audit check item.
    *
    * @param companyId the company ID of this audit check item
    */
    @Override
    public void setCompanyId(long companyId) {
        _auditCheckItem.setCompanyId(companyId);
    }

    /**
    * Returns the group ID of this audit check item.
    *
    * @return the group ID of this audit check item
    */
    @Override
    public long getGroupId() {
        return _auditCheckItem.getGroupId();
    }

    /**
    * Sets the group ID of this audit check item.
    *
    * @param groupId the group ID of this audit check item
    */
    @Override
    public void setGroupId(long groupId) {
        _auditCheckItem.setGroupId(groupId);
    }

    /**
    * Returns the user ID of this audit check item.
    *
    * @return the user ID of this audit check item
    */
    @Override
    public long getUserId() {
        return _auditCheckItem.getUserId();
    }

    /**
    * Sets the user ID of this audit check item.
    *
    * @param userId the user ID of this audit check item
    */
    @Override
    public void setUserId(long userId) {
        _auditCheckItem.setUserId(userId);
    }

    /**
    * Returns the user uuid of this audit check item.
    *
    * @return the user uuid of this audit check item
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _auditCheckItem.getUserUuid();
    }

    /**
    * Sets the user uuid of this audit check item.
    *
    * @param userUuid the user uuid of this audit check item
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _auditCheckItem.setUserUuid(userUuid);
    }

    /**
    * Returns the create date of this audit check item.
    *
    * @return the create date of this audit check item
    */
    @Override
    public java.util.Date getCreateDate() {
        return _auditCheckItem.getCreateDate();
    }

    /**
    * Sets the create date of this audit check item.
    *
    * @param createDate the create date of this audit check item
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _auditCheckItem.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this audit check item.
    *
    * @return the modified date of this audit check item
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _auditCheckItem.getModifiedDate();
    }

    /**
    * Sets the modified date of this audit check item.
    *
    * @param modifiedDate the modified date of this audit check item
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _auditCheckItem.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the audit ID of this audit check item.
    *
    * @return the audit ID of this audit check item
    */
    @Override
    public long getAuditId() {
        return _auditCheckItem.getAuditId();
    }

    /**
    * Sets the audit ID of this audit check item.
    *
    * @param AuditId the audit ID of this audit check item
    */
    @Override
    public void setAuditId(long AuditId) {
        _auditCheckItem.setAuditId(AuditId);
    }

    @Override
    public boolean isNew() {
        return _auditCheckItem.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _auditCheckItem.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _auditCheckItem.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _auditCheckItem.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _auditCheckItem.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _auditCheckItem.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _auditCheckItem.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _auditCheckItem.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _auditCheckItem.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _auditCheckItem.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _auditCheckItem.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new AuditCheckItemWrapper((AuditCheckItem) _auditCheckItem.clone());
    }

    @Override
    public int compareTo(syneren.qms.audit.model.AuditCheckItem auditCheckItem) {
        return _auditCheckItem.compareTo(auditCheckItem);
    }

    @Override
    public int hashCode() {
        return _auditCheckItem.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<syneren.qms.audit.model.AuditCheckItem> toCacheModel() {
        return _auditCheckItem.toCacheModel();
    }

    @Override
    public syneren.qms.audit.model.AuditCheckItem toEscapedModel() {
        return new AuditCheckItemWrapper(_auditCheckItem.toEscapedModel());
    }

    @Override
    public syneren.qms.audit.model.AuditCheckItem toUnescapedModel() {
        return new AuditCheckItemWrapper(_auditCheckItem.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _auditCheckItem.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _auditCheckItem.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _auditCheckItem.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof AuditCheckItemWrapper)) {
            return false;
        }

        AuditCheckItemWrapper auditCheckItemWrapper = (AuditCheckItemWrapper) obj;

        if (Validator.equals(_auditCheckItem,
                    auditCheckItemWrapper._auditCheckItem)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public AuditCheckItem getWrappedAuditCheckItem() {
        return _auditCheckItem;
    }

    @Override
    public AuditCheckItem getWrappedModel() {
        return _auditCheckItem;
    }

    @Override
    public void resetOriginalValues() {
        _auditCheckItem.resetOriginalValues();
    }
}
