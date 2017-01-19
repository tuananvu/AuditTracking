package syneren.qms.audit.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import syneren.qms.audit.service.AuditReportLocalServiceUtil;
import syneren.qms.audit.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class AuditReportClp extends BaseModelImpl<AuditReport>
    implements AuditReport {
    private long _AuditId;
    private String _AuditName;
    private long _InitAuditId;
    private String _Auditor;
    private String _Note;
    private long _companyId;
    private long _groupId;
    private long _userId;
    private String _userUuid;
    private Date _createDate;
    private Date _modifiedDate;
    private BaseModel<?> _auditReportRemoteModel;
    private Class<?> _clpSerializerClass = syneren.qms.audit.service.ClpSerializer.class;

    public AuditReportClp() {
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
    public long getPrimaryKey() {
        return _AuditId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setAuditId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _AuditId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getAuditId() {
        return _AuditId;
    }

    @Override
    public void setAuditId(long AuditId) {
        _AuditId = AuditId;

        if (_auditReportRemoteModel != null) {
            try {
                Class<?> clazz = _auditReportRemoteModel.getClass();

                Method method = clazz.getMethod("setAuditId", long.class);

                method.invoke(_auditReportRemoteModel, AuditId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getAuditName() {
        return _AuditName;
    }

    @Override
    public void setAuditName(String AuditName) {
        _AuditName = AuditName;

        if (_auditReportRemoteModel != null) {
            try {
                Class<?> clazz = _auditReportRemoteModel.getClass();

                Method method = clazz.getMethod("setAuditName", String.class);

                method.invoke(_auditReportRemoteModel, AuditName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getInitAuditId() {
        return _InitAuditId;
    }

    @Override
    public void setInitAuditId(long InitAuditId) {
        _InitAuditId = InitAuditId;

        if (_auditReportRemoteModel != null) {
            try {
                Class<?> clazz = _auditReportRemoteModel.getClass();

                Method method = clazz.getMethod("setInitAuditId", long.class);

                method.invoke(_auditReportRemoteModel, InitAuditId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getAuditor() {
        return _Auditor;
    }

    @Override
    public void setAuditor(String Auditor) {
        _Auditor = Auditor;

        if (_auditReportRemoteModel != null) {
            try {
                Class<?> clazz = _auditReportRemoteModel.getClass();

                Method method = clazz.getMethod("setAuditor", String.class);

                method.invoke(_auditReportRemoteModel, Auditor);
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

        if (_auditReportRemoteModel != null) {
            try {
                Class<?> clazz = _auditReportRemoteModel.getClass();

                Method method = clazz.getMethod("setNote", String.class);

                method.invoke(_auditReportRemoteModel, Note);
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

        if (_auditReportRemoteModel != null) {
            try {
                Class<?> clazz = _auditReportRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_auditReportRemoteModel, companyId);
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

        if (_auditReportRemoteModel != null) {
            try {
                Class<?> clazz = _auditReportRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_auditReportRemoteModel, groupId);
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

        if (_auditReportRemoteModel != null) {
            try {
                Class<?> clazz = _auditReportRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_auditReportRemoteModel, userId);
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

        if (_auditReportRemoteModel != null) {
            try {
                Class<?> clazz = _auditReportRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_auditReportRemoteModel, createDate);
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

        if (_auditReportRemoteModel != null) {
            try {
                Class<?> clazz = _auditReportRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_auditReportRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getAuditReportRemoteModel() {
        return _auditReportRemoteModel;
    }

    public void setAuditReportRemoteModel(BaseModel<?> auditReportRemoteModel) {
        _auditReportRemoteModel = auditReportRemoteModel;
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

        Class<?> remoteModelClass = _auditReportRemoteModel.getClass();

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

        Object returnValue = method.invoke(_auditReportRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            AuditReportLocalServiceUtil.addAuditReport(this);
        } else {
            AuditReportLocalServiceUtil.updateAuditReport(this);
        }
    }

    @Override
    public AuditReport toEscapedModel() {
        return (AuditReport) ProxyUtil.newProxyInstance(AuditReport.class.getClassLoader(),
            new Class[] { AuditReport.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        AuditReportClp clone = new AuditReportClp();

        clone.setAuditId(getAuditId());
        clone.setAuditName(getAuditName());
        clone.setInitAuditId(getInitAuditId());
        clone.setAuditor(getAuditor());
        clone.setNote(getNote());
        clone.setCompanyId(getCompanyId());
        clone.setGroupId(getGroupId());
        clone.setUserId(getUserId());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());

        return clone;
    }

    @Override
    public int compareTo(AuditReport auditReport) {
        long primaryKey = auditReport.getPrimaryKey();

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

        if (!(obj instanceof AuditReportClp)) {
            return false;
        }

        AuditReportClp auditReport = (AuditReportClp) obj;

        long primaryKey = auditReport.getPrimaryKey();

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
        StringBundler sb = new StringBundler(21);

        sb.append("{AuditId=");
        sb.append(getAuditId());
        sb.append(", AuditName=");
        sb.append(getAuditName());
        sb.append(", InitAuditId=");
        sb.append(getInitAuditId());
        sb.append(", Auditor=");
        sb.append(getAuditor());
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
        StringBundler sb = new StringBundler(34);

        sb.append("<model><model-name>");
        sb.append("syneren.qms.audit.model.AuditReport");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>AuditId</column-name><column-value><![CDATA[");
        sb.append(getAuditId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>AuditName</column-name><column-value><![CDATA[");
        sb.append(getAuditName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>InitAuditId</column-name><column-value><![CDATA[");
        sb.append(getInitAuditId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Auditor</column-name><column-value><![CDATA[");
        sb.append(getAuditor());
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
