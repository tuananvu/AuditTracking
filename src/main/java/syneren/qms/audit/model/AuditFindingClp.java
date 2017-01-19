package syneren.qms.audit.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import syneren.qms.audit.service.AuditFindingLocalServiceUtil;
import syneren.qms.audit.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class AuditFindingClp extends BaseModelImpl<AuditFinding>
    implements AuditFinding {
    private long _FindingId;
    private String _FindingName;
    private long _PlanId;
    private String _Type;
    private Date _DueDate;
    private String _Status;
    private Date _FollowupDue;
    private String _FollowupStatus;
    private String _Note;
    private long _companyId;
    private long _groupId;
    private long _userId;
    private String _userUuid;
    private Date _createDate;
    private Date _modifiedDate;
    private BaseModel<?> _auditFindingRemoteModel;
    private Class<?> _clpSerializerClass = syneren.qms.audit.service.ClpSerializer.class;

    public AuditFindingClp() {
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
    public long getPrimaryKey() {
        return _FindingId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setFindingId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _FindingId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getFindingId() {
        return _FindingId;
    }

    @Override
    public void setFindingId(long FindingId) {
        _FindingId = FindingId;

        if (_auditFindingRemoteModel != null) {
            try {
                Class<?> clazz = _auditFindingRemoteModel.getClass();

                Method method = clazz.getMethod("setFindingId", long.class);

                method.invoke(_auditFindingRemoteModel, FindingId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getFindingName() {
        return _FindingName;
    }

    @Override
    public void setFindingName(String FindingName) {
        _FindingName = FindingName;

        if (_auditFindingRemoteModel != null) {
            try {
                Class<?> clazz = _auditFindingRemoteModel.getClass();

                Method method = clazz.getMethod("setFindingName", String.class);

                method.invoke(_auditFindingRemoteModel, FindingName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getPlanId() {
        return _PlanId;
    }

    @Override
    public void setPlanId(long PlanId) {
        _PlanId = PlanId;

        if (_auditFindingRemoteModel != null) {
            try {
                Class<?> clazz = _auditFindingRemoteModel.getClass();

                Method method = clazz.getMethod("setPlanId", long.class);

                method.invoke(_auditFindingRemoteModel, PlanId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getType() {
        return _Type;
    }

    @Override
    public void setType(String Type) {
        _Type = Type;

        if (_auditFindingRemoteModel != null) {
            try {
                Class<?> clazz = _auditFindingRemoteModel.getClass();

                Method method = clazz.getMethod("setType", String.class);

                method.invoke(_auditFindingRemoteModel, Type);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getDueDate() {
        return _DueDate;
    }

    @Override
    public void setDueDate(Date DueDate) {
        _DueDate = DueDate;

        if (_auditFindingRemoteModel != null) {
            try {
                Class<?> clazz = _auditFindingRemoteModel.getClass();

                Method method = clazz.getMethod("setDueDate", Date.class);

                method.invoke(_auditFindingRemoteModel, DueDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getStatus() {
        return _Status;
    }

    @Override
    public void setStatus(String Status) {
        _Status = Status;

        if (_auditFindingRemoteModel != null) {
            try {
                Class<?> clazz = _auditFindingRemoteModel.getClass();

                Method method = clazz.getMethod("setStatus", String.class);

                method.invoke(_auditFindingRemoteModel, Status);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getFollowupDue() {
        return _FollowupDue;
    }

    @Override
    public void setFollowupDue(Date FollowupDue) {
        _FollowupDue = FollowupDue;

        if (_auditFindingRemoteModel != null) {
            try {
                Class<?> clazz = _auditFindingRemoteModel.getClass();

                Method method = clazz.getMethod("setFollowupDue", Date.class);

                method.invoke(_auditFindingRemoteModel, FollowupDue);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getFollowupStatus() {
        return _FollowupStatus;
    }

    @Override
    public void setFollowupStatus(String FollowupStatus) {
        _FollowupStatus = FollowupStatus;

        if (_auditFindingRemoteModel != null) {
            try {
                Class<?> clazz = _auditFindingRemoteModel.getClass();

                Method method = clazz.getMethod("setFollowupStatus",
                        String.class);

                method.invoke(_auditFindingRemoteModel, FollowupStatus);
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

        if (_auditFindingRemoteModel != null) {
            try {
                Class<?> clazz = _auditFindingRemoteModel.getClass();

                Method method = clazz.getMethod("setNote", String.class);

                method.invoke(_auditFindingRemoteModel, Note);
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

        if (_auditFindingRemoteModel != null) {
            try {
                Class<?> clazz = _auditFindingRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_auditFindingRemoteModel, companyId);
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

        if (_auditFindingRemoteModel != null) {
            try {
                Class<?> clazz = _auditFindingRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_auditFindingRemoteModel, groupId);
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

        if (_auditFindingRemoteModel != null) {
            try {
                Class<?> clazz = _auditFindingRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_auditFindingRemoteModel, userId);
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

        if (_auditFindingRemoteModel != null) {
            try {
                Class<?> clazz = _auditFindingRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_auditFindingRemoteModel, createDate);
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

        if (_auditFindingRemoteModel != null) {
            try {
                Class<?> clazz = _auditFindingRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_auditFindingRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getAuditFindingRemoteModel() {
        return _auditFindingRemoteModel;
    }

    public void setAuditFindingRemoteModel(BaseModel<?> auditFindingRemoteModel) {
        _auditFindingRemoteModel = auditFindingRemoteModel;
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

        Class<?> remoteModelClass = _auditFindingRemoteModel.getClass();

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

        Object returnValue = method.invoke(_auditFindingRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            AuditFindingLocalServiceUtil.addAuditFinding(this);
        } else {
            AuditFindingLocalServiceUtil.updateAuditFinding(this);
        }
    }

    @Override
    public AuditFinding toEscapedModel() {
        return (AuditFinding) ProxyUtil.newProxyInstance(AuditFinding.class.getClassLoader(),
            new Class[] { AuditFinding.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        AuditFindingClp clone = new AuditFindingClp();

        clone.setFindingId(getFindingId());
        clone.setFindingName(getFindingName());
        clone.setPlanId(getPlanId());
        clone.setType(getType());
        clone.setDueDate(getDueDate());
        clone.setStatus(getStatus());
        clone.setFollowupDue(getFollowupDue());
        clone.setFollowupStatus(getFollowupStatus());
        clone.setNote(getNote());
        clone.setCompanyId(getCompanyId());
        clone.setGroupId(getGroupId());
        clone.setUserId(getUserId());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());

        return clone;
    }

    @Override
    public int compareTo(AuditFinding auditFinding) {
        long primaryKey = auditFinding.getPrimaryKey();

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

        if (!(obj instanceof AuditFindingClp)) {
            return false;
        }

        AuditFindingClp auditFinding = (AuditFindingClp) obj;

        long primaryKey = auditFinding.getPrimaryKey();

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
        StringBundler sb = new StringBundler(29);

        sb.append("{FindingId=");
        sb.append(getFindingId());
        sb.append(", FindingName=");
        sb.append(getFindingName());
        sb.append(", PlanId=");
        sb.append(getPlanId());
        sb.append(", Type=");
        sb.append(getType());
        sb.append(", DueDate=");
        sb.append(getDueDate());
        sb.append(", Status=");
        sb.append(getStatus());
        sb.append(", FollowupDue=");
        sb.append(getFollowupDue());
        sb.append(", FollowupStatus=");
        sb.append(getFollowupStatus());
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
        StringBundler sb = new StringBundler(46);

        sb.append("<model><model-name>");
        sb.append("syneren.qms.audit.model.AuditFinding");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>FindingId</column-name><column-value><![CDATA[");
        sb.append(getFindingId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FindingName</column-name><column-value><![CDATA[");
        sb.append(getFindingName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>PlanId</column-name><column-value><![CDATA[");
        sb.append(getPlanId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Type</column-name><column-value><![CDATA[");
        sb.append(getType());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>DueDate</column-name><column-value><![CDATA[");
        sb.append(getDueDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Status</column-name><column-value><![CDATA[");
        sb.append(getStatus());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FollowupDue</column-name><column-value><![CDATA[");
        sb.append(getFollowupDue());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>FollowupStatus</column-name><column-value><![CDATA[");
        sb.append(getFollowupStatus());
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
