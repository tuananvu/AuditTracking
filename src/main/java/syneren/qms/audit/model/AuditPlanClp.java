package syneren.qms.audit.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import syneren.qms.audit.service.AuditPlanLocalServiceUtil;
import syneren.qms.audit.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class AuditPlanClp extends BaseModelImpl<AuditPlan> implements AuditPlan {
    private long _PlanId;
    private String _PlanName;
    private long _InitAuditId;
    private String _Auditor;
    private String _AuditTeam;
    private String _Interviewes;
    private Date _PlanDate;
    private Date _ActDate;
    private String _Status;
    private String _Note;
    private long _companyId;
    private long _groupId;
    private long _userId;
    private String _userUuid;
    private Date _createDate;
    private Date _modifiedDate;
    private BaseModel<?> _auditPlanRemoteModel;
    private Class<?> _clpSerializerClass = syneren.qms.audit.service.ClpSerializer.class;

    public AuditPlanClp() {
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
    public long getPrimaryKey() {
        return _PlanId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setPlanId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _PlanId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getPlanId() {
        return _PlanId;
    }

    @Override
    public void setPlanId(long PlanId) {
        _PlanId = PlanId;

        if (_auditPlanRemoteModel != null) {
            try {
                Class<?> clazz = _auditPlanRemoteModel.getClass();

                Method method = clazz.getMethod("setPlanId", long.class);

                method.invoke(_auditPlanRemoteModel, PlanId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPlanName() {
        return _PlanName;
    }

    @Override
    public void setPlanName(String PlanName) {
        _PlanName = PlanName;

        if (_auditPlanRemoteModel != null) {
            try {
                Class<?> clazz = _auditPlanRemoteModel.getClass();

                Method method = clazz.getMethod("setPlanName", String.class);

                method.invoke(_auditPlanRemoteModel, PlanName);
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

        if (_auditPlanRemoteModel != null) {
            try {
                Class<?> clazz = _auditPlanRemoteModel.getClass();

                Method method = clazz.getMethod("setInitAuditId", long.class);

                method.invoke(_auditPlanRemoteModel, InitAuditId);
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

        if (_auditPlanRemoteModel != null) {
            try {
                Class<?> clazz = _auditPlanRemoteModel.getClass();

                Method method = clazz.getMethod("setAuditor", String.class);

                method.invoke(_auditPlanRemoteModel, Auditor);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getAuditTeam() {
        return _AuditTeam;
    }

    @Override
    public void setAuditTeam(String AuditTeam) {
        _AuditTeam = AuditTeam;

        if (_auditPlanRemoteModel != null) {
            try {
                Class<?> clazz = _auditPlanRemoteModel.getClass();

                Method method = clazz.getMethod("setAuditTeam", String.class);

                method.invoke(_auditPlanRemoteModel, AuditTeam);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getInterviewes() {
        return _Interviewes;
    }

    @Override
    public void setInterviewes(String Interviewes) {
        _Interviewes = Interviewes;

        if (_auditPlanRemoteModel != null) {
            try {
                Class<?> clazz = _auditPlanRemoteModel.getClass();

                Method method = clazz.getMethod("setInterviewes", String.class);

                method.invoke(_auditPlanRemoteModel, Interviewes);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getPlanDate() {
        return _PlanDate;
    }

    @Override
    public void setPlanDate(Date PlanDate) {
        _PlanDate = PlanDate;

        if (_auditPlanRemoteModel != null) {
            try {
                Class<?> clazz = _auditPlanRemoteModel.getClass();

                Method method = clazz.getMethod("setPlanDate", Date.class);

                method.invoke(_auditPlanRemoteModel, PlanDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getActDate() {
        return _ActDate;
    }

    @Override
    public void setActDate(Date ActDate) {
        _ActDate = ActDate;

        if (_auditPlanRemoteModel != null) {
            try {
                Class<?> clazz = _auditPlanRemoteModel.getClass();

                Method method = clazz.getMethod("setActDate", Date.class);

                method.invoke(_auditPlanRemoteModel, ActDate);
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

        if (_auditPlanRemoteModel != null) {
            try {
                Class<?> clazz = _auditPlanRemoteModel.getClass();

                Method method = clazz.getMethod("setStatus", String.class);

                method.invoke(_auditPlanRemoteModel, Status);
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

        if (_auditPlanRemoteModel != null) {
            try {
                Class<?> clazz = _auditPlanRemoteModel.getClass();

                Method method = clazz.getMethod("setNote", String.class);

                method.invoke(_auditPlanRemoteModel, Note);
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

        if (_auditPlanRemoteModel != null) {
            try {
                Class<?> clazz = _auditPlanRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_auditPlanRemoteModel, companyId);
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

        if (_auditPlanRemoteModel != null) {
            try {
                Class<?> clazz = _auditPlanRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_auditPlanRemoteModel, groupId);
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

        if (_auditPlanRemoteModel != null) {
            try {
                Class<?> clazz = _auditPlanRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_auditPlanRemoteModel, userId);
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

        if (_auditPlanRemoteModel != null) {
            try {
                Class<?> clazz = _auditPlanRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_auditPlanRemoteModel, createDate);
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

        if (_auditPlanRemoteModel != null) {
            try {
                Class<?> clazz = _auditPlanRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_auditPlanRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getAuditPlanRemoteModel() {
        return _auditPlanRemoteModel;
    }

    public void setAuditPlanRemoteModel(BaseModel<?> auditPlanRemoteModel) {
        _auditPlanRemoteModel = auditPlanRemoteModel;
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

        Class<?> remoteModelClass = _auditPlanRemoteModel.getClass();

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

        Object returnValue = method.invoke(_auditPlanRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            AuditPlanLocalServiceUtil.addAuditPlan(this);
        } else {
            AuditPlanLocalServiceUtil.updateAuditPlan(this);
        }
    }

    @Override
    public AuditPlan toEscapedModel() {
        return (AuditPlan) ProxyUtil.newProxyInstance(AuditPlan.class.getClassLoader(),
            new Class[] { AuditPlan.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        AuditPlanClp clone = new AuditPlanClp();

        clone.setPlanId(getPlanId());
        clone.setPlanName(getPlanName());
        clone.setInitAuditId(getInitAuditId());
        clone.setAuditor(getAuditor());
        clone.setAuditTeam(getAuditTeam());
        clone.setInterviewes(getInterviewes());
        clone.setPlanDate(getPlanDate());
        clone.setActDate(getActDate());
        clone.setStatus(getStatus());
        clone.setNote(getNote());
        clone.setCompanyId(getCompanyId());
        clone.setGroupId(getGroupId());
        clone.setUserId(getUserId());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());

        return clone;
    }

    @Override
    public int compareTo(AuditPlan auditPlan) {
        long primaryKey = auditPlan.getPrimaryKey();

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

        if (!(obj instanceof AuditPlanClp)) {
            return false;
        }

        AuditPlanClp auditPlan = (AuditPlanClp) obj;

        long primaryKey = auditPlan.getPrimaryKey();

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
        StringBundler sb = new StringBundler(31);

        sb.append("{PlanId=");
        sb.append(getPlanId());
        sb.append(", PlanName=");
        sb.append(getPlanName());
        sb.append(", InitAuditId=");
        sb.append(getInitAuditId());
        sb.append(", Auditor=");
        sb.append(getAuditor());
        sb.append(", AuditTeam=");
        sb.append(getAuditTeam());
        sb.append(", Interviewes=");
        sb.append(getInterviewes());
        sb.append(", PlanDate=");
        sb.append(getPlanDate());
        sb.append(", ActDate=");
        sb.append(getActDate());
        sb.append(", Status=");
        sb.append(getStatus());
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
        StringBundler sb = new StringBundler(49);

        sb.append("<model><model-name>");
        sb.append("syneren.qms.audit.model.AuditPlan");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>PlanId</column-name><column-value><![CDATA[");
        sb.append(getPlanId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>PlanName</column-name><column-value><![CDATA[");
        sb.append(getPlanName());
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
            "<column><column-name>AuditTeam</column-name><column-value><![CDATA[");
        sb.append(getAuditTeam());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Interviewes</column-name><column-value><![CDATA[");
        sb.append(getInterviewes());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>PlanDate</column-name><column-value><![CDATA[");
        sb.append(getPlanDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ActDate</column-name><column-value><![CDATA[");
        sb.append(getActDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Status</column-name><column-value><![CDATA[");
        sb.append(getStatus());
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
