package syneren.qms.audit.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import syneren.qms.audit.service.ClpSerializer;
import syneren.qms.audit.service.CorrectiveActionLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class CorrectiveActionClp extends BaseModelImpl<CorrectiveAction>
    implements CorrectiveAction {
    private long _ActionId;
    private String _ActionName;
    private long _FindingId;
    private String _Note;
    private long _companyId;
    private long _groupId;
    private long _userId;
    private String _userUuid;
    private Date _createDate;
    private Date _modifiedDate;
    private BaseModel<?> _correctiveActionRemoteModel;
    private Class<?> _clpSerializerClass = syneren.qms.audit.service.ClpSerializer.class;

    public CorrectiveActionClp() {
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
    public long getPrimaryKey() {
        return _ActionId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setActionId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _ActionId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getActionId() {
        return _ActionId;
    }

    @Override
    public void setActionId(long ActionId) {
        _ActionId = ActionId;

        if (_correctiveActionRemoteModel != null) {
            try {
                Class<?> clazz = _correctiveActionRemoteModel.getClass();

                Method method = clazz.getMethod("setActionId", long.class);

                method.invoke(_correctiveActionRemoteModel, ActionId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getActionName() {
        return _ActionName;
    }

    @Override
    public void setActionName(String ActionName) {
        _ActionName = ActionName;

        if (_correctiveActionRemoteModel != null) {
            try {
                Class<?> clazz = _correctiveActionRemoteModel.getClass();

                Method method = clazz.getMethod("setActionName", String.class);

                method.invoke(_correctiveActionRemoteModel, ActionName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getFindingId() {
        return _FindingId;
    }

    @Override
    public void setFindingId(long FindingId) {
        _FindingId = FindingId;

        if (_correctiveActionRemoteModel != null) {
            try {
                Class<?> clazz = _correctiveActionRemoteModel.getClass();

                Method method = clazz.getMethod("setFindingId", long.class);

                method.invoke(_correctiveActionRemoteModel, FindingId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getNote() {
        return _Note;
    }

    @Override
    public void setNote(String Note) {
        _Note = Note;

        if (_correctiveActionRemoteModel != null) {
            try {
                Class<?> clazz = _correctiveActionRemoteModel.getClass();

                Method method = clazz.getMethod("setNote", String.class);

                method.invoke(_correctiveActionRemoteModel, Note);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;

        if (_correctiveActionRemoteModel != null) {
            try {
                Class<?> clazz = _correctiveActionRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_correctiveActionRemoteModel, companyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;

        if (_correctiveActionRemoteModel != null) {
            try {
                Class<?> clazz = _correctiveActionRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_correctiveActionRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;

        if (_correctiveActionRemoteModel != null) {
            try {
                Class<?> clazz = _correctiveActionRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_correctiveActionRemoteModel, userId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;

        if (_correctiveActionRemoteModel != null) {
            try {
                Class<?> clazz = _correctiveActionRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_correctiveActionRemoteModel, createDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;

        if (_correctiveActionRemoteModel != null) {
            try {
                Class<?> clazz = _correctiveActionRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_correctiveActionRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getCorrectiveActionRemoteModel() {
        return _correctiveActionRemoteModel;
    }

    public void setCorrectiveActionRemoteModel(
        BaseModel<?> correctiveActionRemoteModel) {
        _correctiveActionRemoteModel = correctiveActionRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _correctiveActionRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_correctiveActionRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            CorrectiveActionLocalServiceUtil.addCorrectiveAction(this);
        } else {
            CorrectiveActionLocalServiceUtil.updateCorrectiveAction(this);
        }
    }

    @Override
    public CorrectiveAction toEscapedModel() {
        return (CorrectiveAction) ProxyUtil.newProxyInstance(CorrectiveAction.class.getClassLoader(),
            new Class[] { CorrectiveAction.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        CorrectiveActionClp clone = new CorrectiveActionClp();

        clone.setActionId(getActionId());
        clone.setActionName(getActionName());
        clone.setFindingId(getFindingId());
        clone.setNote(getNote());
        clone.setCompanyId(getCompanyId());
        clone.setGroupId(getGroupId());
        clone.setUserId(getUserId());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());

        return clone;
    }

    @Override
    public int compareTo(CorrectiveAction correctiveAction) {
        long primaryKey = correctiveAction.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof CorrectiveActionClp)) {
            return false;
        }

        CorrectiveActionClp correctiveAction = (CorrectiveActionClp) obj;

        long primaryKey = correctiveAction.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{ActionId=");
        sb.append(getActionId());
        sb.append(", ActionName=");
        sb.append(getActionName());
        sb.append(", FindingId=");
        sb.append(getFindingId());
        sb.append(", Note=");
        sb.append(getNote());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(31);

        sb.append("<model><model-name>");
        sb.append("syneren.qms.audit.model.CorrectiveAction");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>ActionId</column-name><column-value><![CDATA[");
        sb.append(getActionId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ActionName</column-name><column-value><![CDATA[");
        sb.append(getActionName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FindingId</column-name><column-value><![CDATA[");
        sb.append(getFindingId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Note</column-name><column-value><![CDATA[");
        sb.append(getNote());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
