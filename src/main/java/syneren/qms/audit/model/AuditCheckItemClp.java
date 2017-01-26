package syneren.qms.audit.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import syneren.qms.audit.service.AuditCheckItemLocalServiceUtil;
import syneren.qms.audit.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class AuditCheckItemClp extends BaseModelImpl<AuditCheckItem>
    implements AuditCheckItem {
    private long _CheckItemId;
    private String _CheckItemName;
    private String _Question;
    private String _Answer;
    private boolean _Complie;
    private String _Evidence;
    private String _Outcome;
    private long _companyId;
    private long _groupId;
    private long _userId;
    private String _userUuid;
    private Date _createDate;
    private Date _modifiedDate;
    private long _AuditId;
    private BaseModel<?> _auditCheckItemRemoteModel;
    private Class<?> _clpSerializerClass = syneren.qms.audit.service.ClpSerializer.class;

    public AuditCheckItemClp() {
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
    public long getPrimaryKey() {
        return _CheckItemId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setCheckItemId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _CheckItemId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getCheckItemId() {
        return _CheckItemId;
    }

    @Override
    public void setCheckItemId(long CheckItemId) {
        _CheckItemId = CheckItemId;

        if (_auditCheckItemRemoteModel != null) {
            try {
                Class<?> clazz = _auditCheckItemRemoteModel.getClass();

                Method method = clazz.getMethod("setCheckItemId", long.class);

                method.invoke(_auditCheckItemRemoteModel, CheckItemId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCheckItemName() {
        return _CheckItemName;
    }

    @Override
    public void setCheckItemName(String CheckItemName) {
        _CheckItemName = CheckItemName;

        if (_auditCheckItemRemoteModel != null) {
            try {
                Class<?> clazz = _auditCheckItemRemoteModel.getClass();

                Method method = clazz.getMethod("setCheckItemName", String.class);

                method.invoke(_auditCheckItemRemoteModel, CheckItemName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getQuestion() {
        return _Question;
    }

    @Override
    public void setQuestion(String Question) {
        _Question = Question;

        if (_auditCheckItemRemoteModel != null) {
            try {
                Class<?> clazz = _auditCheckItemRemoteModel.getClass();

                Method method = clazz.getMethod("setQuestion", String.class);

                method.invoke(_auditCheckItemRemoteModel, Question);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getAnswer() {
        return _Answer;
    }

    @Override
    public void setAnswer(String Answer) {
        _Answer = Answer;

        if (_auditCheckItemRemoteModel != null) {
            try {
                Class<?> clazz = _auditCheckItemRemoteModel.getClass();

                Method method = clazz.getMethod("setAnswer", String.class);

                method.invoke(_auditCheckItemRemoteModel, Answer);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getComplie() {
        return _Complie;
    }

    @Override
    public boolean isComplie() {
        return _Complie;
    }

    @Override
    public void setComplie(boolean Complie) {
        _Complie = Complie;

        if (_auditCheckItemRemoteModel != null) {
            try {
                Class<?> clazz = _auditCheckItemRemoteModel.getClass();

                Method method = clazz.getMethod("setComplie", boolean.class);

                method.invoke(_auditCheckItemRemoteModel, Complie);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEvidence() {
        return _Evidence;
    }

    @Override
    public void setEvidence(String Evidence) {
        _Evidence = Evidence;

        if (_auditCheckItemRemoteModel != null) {
            try {
                Class<?> clazz = _auditCheckItemRemoteModel.getClass();

                Method method = clazz.getMethod("setEvidence", String.class);

                method.invoke(_auditCheckItemRemoteModel, Evidence);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getOutcome() {
        return _Outcome;
    }

    @Override
    public void setOutcome(String Outcome) {
        _Outcome = Outcome;

        if (_auditCheckItemRemoteModel != null) {
            try {
                Class<?> clazz = _auditCheckItemRemoteModel.getClass();

                Method method = clazz.getMethod("setOutcome", String.class);

                method.invoke(_auditCheckItemRemoteModel, Outcome);
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

        if (_auditCheckItemRemoteModel != null) {
            try {
                Class<?> clazz = _auditCheckItemRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_auditCheckItemRemoteModel, companyId);
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

        if (_auditCheckItemRemoteModel != null) {
            try {
                Class<?> clazz = _auditCheckItemRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_auditCheckItemRemoteModel, groupId);
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

        if (_auditCheckItemRemoteModel != null) {
            try {
                Class<?> clazz = _auditCheckItemRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_auditCheckItemRemoteModel, userId);
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

        if (_auditCheckItemRemoteModel != null) {
            try {
                Class<?> clazz = _auditCheckItemRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_auditCheckItemRemoteModel, createDate);
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

        if (_auditCheckItemRemoteModel != null) {
            try {
                Class<?> clazz = _auditCheckItemRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_auditCheckItemRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getAuditId() {
        return _AuditId;
    }

    @Override
    public void setAuditId(long AuditId) {
        _AuditId = AuditId;

        if (_auditCheckItemRemoteModel != null) {
            try {
                Class<?> clazz = _auditCheckItemRemoteModel.getClass();

                Method method = clazz.getMethod("setAuditId", long.class);

                method.invoke(_auditCheckItemRemoteModel, AuditId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean isEditable() {
        try {
            String methodName = "isEditable";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            Boolean returnObj = (Boolean) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public void setEditable(boolean editable) {
        try {
            String methodName = "setEditable";

            Class<?>[] parameterTypes = new Class<?>[] { boolean.class };

            Object[] parameterValues = new Object[] { editable };

            invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    public BaseModel<?> getAuditCheckItemRemoteModel() {
        return _auditCheckItemRemoteModel;
    }

    public void setAuditCheckItemRemoteModel(
        BaseModel<?> auditCheckItemRemoteModel) {
        _auditCheckItemRemoteModel = auditCheckItemRemoteModel;
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

        Class<?> remoteModelClass = _auditCheckItemRemoteModel.getClass();

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

        Object returnValue = method.invoke(_auditCheckItemRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            AuditCheckItemLocalServiceUtil.addAuditCheckItem(this);
        } else {
            AuditCheckItemLocalServiceUtil.updateAuditCheckItem(this);
        }
    }

    @Override
    public AuditCheckItem toEscapedModel() {
        return (AuditCheckItem) ProxyUtil.newProxyInstance(AuditCheckItem.class.getClassLoader(),
            new Class[] { AuditCheckItem.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        AuditCheckItemClp clone = new AuditCheckItemClp();

        clone.setCheckItemId(getCheckItemId());
        clone.setCheckItemName(getCheckItemName());
        clone.setQuestion(getQuestion());
        clone.setAnswer(getAnswer());
        clone.setComplie(getComplie());
        clone.setEvidence(getEvidence());
        clone.setOutcome(getOutcome());
        clone.setCompanyId(getCompanyId());
        clone.setGroupId(getGroupId());
        clone.setUserId(getUserId());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setAuditId(getAuditId());

        return clone;
    }

    @Override
    public int compareTo(AuditCheckItem auditCheckItem) {
        long primaryKey = auditCheckItem.getPrimaryKey();

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

        if (!(obj instanceof AuditCheckItemClp)) {
            return false;
        }

        AuditCheckItemClp auditCheckItem = (AuditCheckItemClp) obj;

        long primaryKey = auditCheckItem.getPrimaryKey();

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
        StringBundler sb = new StringBundler(27);

        sb.append("{CheckItemId=");
        sb.append(getCheckItemId());
        sb.append(", CheckItemName=");
        sb.append(getCheckItemName());
        sb.append(", Question=");
        sb.append(getQuestion());
        sb.append(", Answer=");
        sb.append(getAnswer());
        sb.append(", Complie=");
        sb.append(getComplie());
        sb.append(", Evidence=");
        sb.append(getEvidence());
        sb.append(", Outcome=");
        sb.append(getOutcome());
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
        sb.append(", AuditId=");
        sb.append(getAuditId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(43);

        sb.append("<model><model-name>");
        sb.append("syneren.qms.audit.model.AuditCheckItem");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>CheckItemId</column-name><column-value><![CDATA[");
        sb.append(getCheckItemId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CheckItemName</column-name><column-value><![CDATA[");
        sb.append(getCheckItemName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Question</column-name><column-value><![CDATA[");
        sb.append(getQuestion());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Answer</column-name><column-value><![CDATA[");
        sb.append(getAnswer());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Complie</column-name><column-value><![CDATA[");
        sb.append(getComplie());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Evidence</column-name><column-value><![CDATA[");
        sb.append(getEvidence());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Outcome</column-name><column-value><![CDATA[");
        sb.append(getOutcome());
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
        sb.append(
            "<column><column-name>AuditId</column-name><column-value><![CDATA[");
        sb.append(getAuditId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
