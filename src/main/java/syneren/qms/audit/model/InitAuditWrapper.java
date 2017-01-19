package syneren.qms.audit.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link InitAudit}.
 * </p>
 *
 * @author anguyen
 * @see InitAudit
 * @generated
 */
public class InitAuditWrapper implements InitAudit, ModelWrapper<InitAudit> {
    private InitAudit _initAudit;

    public InitAuditWrapper(InitAudit initAudit) {
        _initAudit = initAudit;
    }

    @Override
    public Class<?> getModelClass() {
        return InitAudit.class;
    }

    @Override
    public String getModelClassName() {
        return InitAudit.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("InitAuditId", getInitAuditId());
        attributes.put("InitAuditName", getInitAuditName());
        attributes.put("StartDate", getStartDate());
        attributes.put("EndDate", getEndDate());
        attributes.put("companyId", getCompanyId());
        attributes.put("groupId", getGroupId());
        attributes.put("userId", getUserId());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long InitAuditId = (Long) attributes.get("InitAuditId");

        if (InitAuditId != null) {
            setInitAuditId(InitAuditId);
        }

        String InitAuditName = (String) attributes.get("InitAuditName");

        if (InitAuditName != null) {
            setInitAuditName(InitAuditName);
        }

        Date StartDate = (Date) attributes.get("StartDate");

        if (StartDate != null) {
            setStartDate(StartDate);
        }

        Date EndDate = (Date) attributes.get("EndDate");

        if (EndDate != null) {
            setEndDate(EndDate);
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
    * Returns the primary key of this init audit.
    *
    * @return the primary key of this init audit
    */
    @Override
    public long getPrimaryKey() {
        return _initAudit.getPrimaryKey();
    }

    /**
    * Sets the primary key of this init audit.
    *
    * @param primaryKey the primary key of this init audit
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _initAudit.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the init audit ID of this init audit.
    *
    * @return the init audit ID of this init audit
    */
    @Override
    public long getInitAuditId() {
        return _initAudit.getInitAuditId();
    }

    /**
    * Sets the init audit ID of this init audit.
    *
    * @param InitAuditId the init audit ID of this init audit
    */
    @Override
    public void setInitAuditId(long InitAuditId) {
        _initAudit.setInitAuditId(InitAuditId);
    }

    /**
    * Returns the init audit name of this init audit.
    *
    * @return the init audit name of this init audit
    */
    @Override
    public java.lang.String getInitAuditName() {
        return _initAudit.getInitAuditName();
    }

    /**
    * Sets the init audit name of this init audit.
    *
    * @param InitAuditName the init audit name of this init audit
    */
    @Override
    public void setInitAuditName(java.lang.String InitAuditName) {
        _initAudit.setInitAuditName(InitAuditName);
    }

    /**
    * Returns the start date of this init audit.
    *
    * @return the start date of this init audit
    */
    @Override
    public java.util.Date getStartDate() {
        return _initAudit.getStartDate();
    }

    /**
    * Sets the start date of this init audit.
    *
    * @param StartDate the start date of this init audit
    */
    @Override
    public void setStartDate(java.util.Date StartDate) {
        _initAudit.setStartDate(StartDate);
    }

    /**
    * Returns the end date of this init audit.
    *
    * @return the end date of this init audit
    */
    @Override
    public java.util.Date getEndDate() {
        return _initAudit.getEndDate();
    }

    /**
    * Sets the end date of this init audit.
    *
    * @param EndDate the end date of this init audit
    */
    @Override
    public void setEndDate(java.util.Date EndDate) {
        _initAudit.setEndDate(EndDate);
    }

    /**
    * Returns the company ID of this init audit.
    *
    * @return the company ID of this init audit
    */
    @Override
    public long getCompanyId() {
        return _initAudit.getCompanyId();
    }

    /**
    * Sets the company ID of this init audit.
    *
    * @param companyId the company ID of this init audit
    */
    @Override
    public void setCompanyId(long companyId) {
        _initAudit.setCompanyId(companyId);
    }

    /**
    * Returns the group ID of this init audit.
    *
    * @return the group ID of this init audit
    */
    @Override
    public long getGroupId() {
        return _initAudit.getGroupId();
    }

    /**
    * Sets the group ID of this init audit.
    *
    * @param groupId the group ID of this init audit
    */
    @Override
    public void setGroupId(long groupId) {
        _initAudit.setGroupId(groupId);
    }

    /**
    * Returns the user ID of this init audit.
    *
    * @return the user ID of this init audit
    */
    @Override
    public long getUserId() {
        return _initAudit.getUserId();
    }

    /**
    * Sets the user ID of this init audit.
    *
    * @param userId the user ID of this init audit
    */
    @Override
    public void setUserId(long userId) {
        _initAudit.setUserId(userId);
    }

    /**
    * Returns the user uuid of this init audit.
    *
    * @return the user uuid of this init audit
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _initAudit.getUserUuid();
    }

    /**
    * Sets the user uuid of this init audit.
    *
    * @param userUuid the user uuid of this init audit
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _initAudit.setUserUuid(userUuid);
    }

    /**
    * Returns the create date of this init audit.
    *
    * @return the create date of this init audit
    */
    @Override
    public java.util.Date getCreateDate() {
        return _initAudit.getCreateDate();
    }

    /**
    * Sets the create date of this init audit.
    *
    * @param createDate the create date of this init audit
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _initAudit.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this init audit.
    *
    * @return the modified date of this init audit
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _initAudit.getModifiedDate();
    }

    /**
    * Sets the modified date of this init audit.
    *
    * @param modifiedDate the modified date of this init audit
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _initAudit.setModifiedDate(modifiedDate);
    }

    @Override
    public boolean isNew() {
        return _initAudit.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _initAudit.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _initAudit.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _initAudit.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _initAudit.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _initAudit.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _initAudit.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _initAudit.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _initAudit.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _initAudit.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _initAudit.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new InitAuditWrapper((InitAudit) _initAudit.clone());
    }

    @Override
    public int compareTo(syneren.qms.audit.model.InitAudit initAudit) {
        return _initAudit.compareTo(initAudit);
    }

    @Override
    public int hashCode() {
        return _initAudit.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<syneren.qms.audit.model.InitAudit> toCacheModel() {
        return _initAudit.toCacheModel();
    }

    @Override
    public syneren.qms.audit.model.InitAudit toEscapedModel() {
        return new InitAuditWrapper(_initAudit.toEscapedModel());
    }

    @Override
    public syneren.qms.audit.model.InitAudit toUnescapedModel() {
        return new InitAuditWrapper(_initAudit.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _initAudit.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _initAudit.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _initAudit.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof InitAuditWrapper)) {
            return false;
        }

        InitAuditWrapper initAuditWrapper = (InitAuditWrapper) obj;

        if (Validator.equals(_initAudit, initAuditWrapper._initAudit)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public InitAudit getWrappedInitAudit() {
        return _initAudit;
    }

    @Override
    public InitAudit getWrappedModel() {
        return _initAudit;
    }

    @Override
    public void resetOriginalValues() {
        _initAudit.resetOriginalValues();
    }
}
