package syneren.qms.audit.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CorrectiveAction}.
 * </p>
 *
 * @author anguyen
 * @see CorrectiveAction
 * @generated
 */
public class CorrectiveActionWrapper implements CorrectiveAction,
    ModelWrapper<CorrectiveAction> {
    private CorrectiveAction _correctiveAction;

    public CorrectiveActionWrapper(CorrectiveAction correctiveAction) {
        _correctiveAction = correctiveAction;
    }

    @Override
    public Class<?> getModelClass() {
        return CorrectiveAction.class;
    }

    @Override
    public String getModelClassName() {
        return CorrectiveAction.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("ActionId", getActionId());
        attributes.put("ActionName", getActionName());
        attributes.put("FindingId", getFindingId());
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
        Long ActionId = (Long) attributes.get("ActionId");

        if (ActionId != null) {
            setActionId(ActionId);
        }

        String ActionName = (String) attributes.get("ActionName");

        if (ActionName != null) {
            setActionName(ActionName);
        }

        Long FindingId = (Long) attributes.get("FindingId");

        if (FindingId != null) {
            setFindingId(FindingId);
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
    * Returns the primary key of this corrective action.
    *
    * @return the primary key of this corrective action
    */
    @Override
    public long getPrimaryKey() {
        return _correctiveAction.getPrimaryKey();
    }

    /**
    * Sets the primary key of this corrective action.
    *
    * @param primaryKey the primary key of this corrective action
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _correctiveAction.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the action ID of this corrective action.
    *
    * @return the action ID of this corrective action
    */
    @Override
    public long getActionId() {
        return _correctiveAction.getActionId();
    }

    /**
    * Sets the action ID of this corrective action.
    *
    * @param ActionId the action ID of this corrective action
    */
    @Override
    public void setActionId(long ActionId) {
        _correctiveAction.setActionId(ActionId);
    }

    /**
    * Returns the action name of this corrective action.
    *
    * @return the action name of this corrective action
    */
    @Override
    public java.lang.String getActionName() {
        return _correctiveAction.getActionName();
    }

    /**
    * Sets the action name of this corrective action.
    *
    * @param ActionName the action name of this corrective action
    */
    @Override
    public void setActionName(java.lang.String ActionName) {
        _correctiveAction.setActionName(ActionName);
    }

    /**
    * Returns the finding ID of this corrective action.
    *
    * @return the finding ID of this corrective action
    */
    @Override
    public long getFindingId() {
        return _correctiveAction.getFindingId();
    }

    /**
    * Sets the finding ID of this corrective action.
    *
    * @param FindingId the finding ID of this corrective action
    */
    @Override
    public void setFindingId(long FindingId) {
        _correctiveAction.setFindingId(FindingId);
    }

    /**
    * Returns the note of this corrective action.
    *
    * @return the note of this corrective action
    */
    @Override
    public java.lang.String getNote() {
        return _correctiveAction.getNote();
    }

    /**
    * Sets the note of this corrective action.
    *
    * @param Note the note of this corrective action
    */
    @Override
    public void setNote(java.lang.String Note) {
        _correctiveAction.setNote(Note);
    }

    /**
    * Returns the company ID of this corrective action.
    *
    * @return the company ID of this corrective action
    */
    @Override
    public long getCompanyId() {
        return _correctiveAction.getCompanyId();
    }

    /**
    * Sets the company ID of this corrective action.
    *
    * @param companyId the company ID of this corrective action
    */
    @Override
    public void setCompanyId(long companyId) {
        _correctiveAction.setCompanyId(companyId);
    }

    /**
    * Returns the group ID of this corrective action.
    *
    * @return the group ID of this corrective action
    */
    @Override
    public long getGroupId() {
        return _correctiveAction.getGroupId();
    }

    /**
    * Sets the group ID of this corrective action.
    *
    * @param groupId the group ID of this corrective action
    */
    @Override
    public void setGroupId(long groupId) {
        _correctiveAction.setGroupId(groupId);
    }

    /**
    * Returns the user ID of this corrective action.
    *
    * @return the user ID of this corrective action
    */
    @Override
    public long getUserId() {
        return _correctiveAction.getUserId();
    }

    /**
    * Sets the user ID of this corrective action.
    *
    * @param userId the user ID of this corrective action
    */
    @Override
    public void setUserId(long userId) {
        _correctiveAction.setUserId(userId);
    }

    /**
    * Returns the user uuid of this corrective action.
    *
    * @return the user uuid of this corrective action
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _correctiveAction.getUserUuid();
    }

    /**
    * Sets the user uuid of this corrective action.
    *
    * @param userUuid the user uuid of this corrective action
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _correctiveAction.setUserUuid(userUuid);
    }

    /**
    * Returns the create date of this corrective action.
    *
    * @return the create date of this corrective action
    */
    @Override
    public java.util.Date getCreateDate() {
        return _correctiveAction.getCreateDate();
    }

    /**
    * Sets the create date of this corrective action.
    *
    * @param createDate the create date of this corrective action
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _correctiveAction.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this corrective action.
    *
    * @return the modified date of this corrective action
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _correctiveAction.getModifiedDate();
    }

    /**
    * Sets the modified date of this corrective action.
    *
    * @param modifiedDate the modified date of this corrective action
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _correctiveAction.setModifiedDate(modifiedDate);
    }

    @Override
    public boolean isNew() {
        return _correctiveAction.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _correctiveAction.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _correctiveAction.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _correctiveAction.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _correctiveAction.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _correctiveAction.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _correctiveAction.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _correctiveAction.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _correctiveAction.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _correctiveAction.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _correctiveAction.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new CorrectiveActionWrapper((CorrectiveAction) _correctiveAction.clone());
    }

    @Override
    public int compareTo(
        syneren.qms.audit.model.CorrectiveAction correctiveAction) {
        return _correctiveAction.compareTo(correctiveAction);
    }

    @Override
    public int hashCode() {
        return _correctiveAction.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<syneren.qms.audit.model.CorrectiveAction> toCacheModel() {
        return _correctiveAction.toCacheModel();
    }

    @Override
    public syneren.qms.audit.model.CorrectiveAction toEscapedModel() {
        return new CorrectiveActionWrapper(_correctiveAction.toEscapedModel());
    }

    @Override
    public syneren.qms.audit.model.CorrectiveAction toUnescapedModel() {
        return new CorrectiveActionWrapper(_correctiveAction.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _correctiveAction.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _correctiveAction.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _correctiveAction.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof CorrectiveActionWrapper)) {
            return false;
        }

        CorrectiveActionWrapper correctiveActionWrapper = (CorrectiveActionWrapper) obj;

        if (Validator.equals(_correctiveAction,
                    correctiveActionWrapper._correctiveAction)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public CorrectiveAction getWrappedCorrectiveAction() {
        return _correctiveAction;
    }

    @Override
    public CorrectiveAction getWrappedModel() {
        return _correctiveAction;
    }

    @Override
    public void resetOriginalValues() {
        _correctiveAction.resetOriginalValues();
    }
}
