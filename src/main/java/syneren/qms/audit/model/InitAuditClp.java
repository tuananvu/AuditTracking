package syneren.qms.audit.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import syneren.qms.audit.service.ClpSerializer;
import syneren.qms.audit.service.InitAuditLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class InitAuditClp extends BaseModelImpl<InitAudit> implements InitAudit {
    private long _InitAuditId;
    private String _InitAuditName;
    private Date _StartDate;
    private Date _EndDate;
    private long _companyId;
    private long _groupId;
    private long _userId;
    private String _userUuid;
    private Date _createDate;
    private Date _modifiedDate;
    private BaseModel<?> _initAuditRemoteModel;
    private Class<?> _clpSerializerClass = syneren.qms.audit.service.ClpSerializer.class;

    public InitAuditClp() {
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
    public long getPrimaryKey() {
        return _InitAuditId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setInitAuditId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _InitAuditId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getInitAuditId() {
        return _InitAuditId;
    }

    @Override
    public void setInitAuditId(long InitAuditId) {
        _InitAuditId = InitAuditId;

        if (_initAuditRemoteModel != null) {
            try {
                Class<?> clazz = _initAuditRemoteModel.getClass();

                Method method = clazz.getMethod("setInitAuditId", long.class);

                method.invoke(_initAuditRemoteModel, InitAuditId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getInitAuditName() {
        return _InitAuditName;
    }

    @Override
    public void setInitAuditName(String InitAuditName) {
        _InitAuditName = InitAuditName;

        if (_initAuditRemoteModel != null) {
            try {
                Class<?> clazz = _initAuditRemoteModel.getClass();

                Method method = clazz.getMethod("setInitAuditName", String.class);

                method.invoke(_initAuditRemoteModel, InitAuditName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getStartDate() {
        return _StartDate;
    }

    @Override
    public void setStartDate(Date StartDate) {
        _StartDate = StartDate;

        if (_initAuditRemoteModel != null) {
            try {
                Class<?> clazz = _initAuditRemoteModel.getClass();

                Method method = clazz.getMethod("setStartDate", Date.class);

                method.invoke(_initAuditRemoteModel, StartDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getEndDate() {
        return _EndDate;
    }

    @Override
    public void setEndDate(Date EndDate) {
        _EndDate = EndDate;

        if (_initAuditRemoteModel != null) {
            try {
                Class<?> clazz = _initAuditRemoteModel.getClass();

                Method method = clazz.getMethod("setEndDate", Date.class);

                method.invoke(_initAuditRemoteModel, EndDate);
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

        if (_initAuditRemoteModel != null) {
            try {
                Class<?> clazz = _initAuditRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_initAuditRemoteModel, companyId);
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

        if (_initAuditRemoteModel != null) {
            try {
                Class<?> clazz = _initAuditRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_initAuditRemoteModel, groupId);
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

        if (_initAuditRemoteModel != null) {
            try {
                Class<?> clazz = _initAuditRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_initAuditRemoteModel, userId);
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

        if (_initAuditRemoteModel != null) {
            try {
                Class<?> clazz = _initAuditRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_initAuditRemoteModel, createDate);
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

        if (_initAuditRemoteModel != null) {
            try {
                Class<?> clazz = _initAuditRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_initAuditRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getInitAuditRemoteModel() {
        return _initAuditRemoteModel;
    }

    public void setInitAuditRemoteModel(BaseModel<?> initAuditRemoteModel) {
        _initAuditRemoteModel = initAuditRemoteModel;
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

        Class<?> remoteModelClass = _initAuditRemoteModel.getClass();

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

        Object returnValue = method.invoke(_initAuditRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            InitAuditLocalServiceUtil.addInitAudit(this);
        } else {
            InitAuditLocalServiceUtil.updateInitAudit(this);
        }
    }

    @Override
    public InitAudit toEscapedModel() {
        return (InitAudit) ProxyUtil.newProxyInstance(InitAudit.class.getClassLoader(),
            new Class[] { InitAudit.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        InitAuditClp clone = new InitAuditClp();

        clone.setInitAuditId(getInitAuditId());
        clone.setInitAuditName(getInitAuditName());
        clone.setStartDate(getStartDate());
        clone.setEndDate(getEndDate());
        clone.setCompanyId(getCompanyId());
        clone.setGroupId(getGroupId());
        clone.setUserId(getUserId());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());

        return clone;
    }

    @Override
    public int compareTo(InitAudit initAudit) {
        long primaryKey = initAudit.getPrimaryKey();

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

        if (!(obj instanceof InitAuditClp)) {
            return false;
        }

        InitAuditClp initAudit = (InitAuditClp) obj;

        long primaryKey = initAudit.getPrimaryKey();

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

        sb.append("{InitAuditId=");
        sb.append(getInitAuditId());
        sb.append(", InitAuditName=");
        sb.append(getInitAuditName());
        sb.append(", StartDate=");
        sb.append(getStartDate());
        sb.append(", EndDate=");
        sb.append(getEndDate());
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
        sb.append("syneren.qms.audit.model.InitAudit");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>InitAuditId</column-name><column-value><![CDATA[");
        sb.append(getInitAuditId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>InitAuditName</column-name><column-value><![CDATA[");
        sb.append(getInitAuditName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>StartDate</column-name><column-value><![CDATA[");
        sb.append(getStartDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>EndDate</column-name><column-value><![CDATA[");
        sb.append(getEndDate());
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
