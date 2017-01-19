package syneren.qms.audit.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author anguyen
 * @generated
 */
public class AuditPlanSoap implements Serializable {
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
    private Date _createDate;
    private Date _modifiedDate;

    public AuditPlanSoap() {
    }

    public static AuditPlanSoap toSoapModel(AuditPlan model) {
        AuditPlanSoap soapModel = new AuditPlanSoap();

        soapModel.setPlanId(model.getPlanId());
        soapModel.setPlanName(model.getPlanName());
        soapModel.setInitAuditId(model.getInitAuditId());
        soapModel.setAuditor(model.getAuditor());
        soapModel.setAuditTeam(model.getAuditTeam());
        soapModel.setInterviewes(model.getInterviewes());
        soapModel.setPlanDate(model.getPlanDate());
        soapModel.setActDate(model.getActDate());
        soapModel.setStatus(model.getStatus());
        soapModel.setNote(model.getNote());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setUserId(model.getUserId());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());

        return soapModel;
    }

    public static AuditPlanSoap[] toSoapModels(AuditPlan[] models) {
        AuditPlanSoap[] soapModels = new AuditPlanSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static AuditPlanSoap[][] toSoapModels(AuditPlan[][] models) {
        AuditPlanSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new AuditPlanSoap[models.length][models[0].length];
        } else {
            soapModels = new AuditPlanSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static AuditPlanSoap[] toSoapModels(List<AuditPlan> models) {
        List<AuditPlanSoap> soapModels = new ArrayList<AuditPlanSoap>(models.size());

        for (AuditPlan model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new AuditPlanSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _PlanId;
    }

    public void setPrimaryKey(long pk) {
        setPlanId(pk);
    }

    public long getPlanId() {
        return _PlanId;
    }

    public void setPlanId(long PlanId) {
        _PlanId = PlanId;
    }

    public String getPlanName() {
        return _PlanName;
    }

    public void setPlanName(String PlanName) {
        _PlanName = PlanName;
    }

    public long getInitAuditId() {
        return _InitAuditId;
    }

    public void setInitAuditId(long InitAuditId) {
        _InitAuditId = InitAuditId;
    }

    public String getAuditor() {
        return _Auditor;
    }

    public void setAuditor(String Auditor) {
        _Auditor = Auditor;
    }

    public String getAuditTeam() {
        return _AuditTeam;
    }

    public void setAuditTeam(String AuditTeam) {
        _AuditTeam = AuditTeam;
    }

    public String getInterviewes() {
        return _Interviewes;
    }

    public void setInterviewes(String Interviewes) {
        _Interviewes = Interviewes;
    }

    public Date getPlanDate() {
        return _PlanDate;
    }

    public void setPlanDate(Date PlanDate) {
        _PlanDate = PlanDate;
    }

    public Date getActDate() {
        return _ActDate;
    }

    public void setActDate(Date ActDate) {
        _ActDate = ActDate;
    }

    public String getStatus() {
        return _Status;
    }

    public void setStatus(String Status) {
        _Status = Status;
    }

    public String getNote() {
        return _Note;
    }

    public void setNote(String Note) {
        _Note = Note;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }
}
