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
public class AuditFindingSoap implements Serializable {
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
    private Date _createDate;
    private Date _modifiedDate;

    public AuditFindingSoap() {
    }

    public static AuditFindingSoap toSoapModel(AuditFinding model) {
        AuditFindingSoap soapModel = new AuditFindingSoap();

        soapModel.setFindingId(model.getFindingId());
        soapModel.setFindingName(model.getFindingName());
        soapModel.setPlanId(model.getPlanId());
        soapModel.setType(model.getType());
        soapModel.setDueDate(model.getDueDate());
        soapModel.setStatus(model.getStatus());
        soapModel.setFollowupDue(model.getFollowupDue());
        soapModel.setFollowupStatus(model.getFollowupStatus());
        soapModel.setNote(model.getNote());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setUserId(model.getUserId());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());

        return soapModel;
    }

    public static AuditFindingSoap[] toSoapModels(AuditFinding[] models) {
        AuditFindingSoap[] soapModels = new AuditFindingSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static AuditFindingSoap[][] toSoapModels(AuditFinding[][] models) {
        AuditFindingSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new AuditFindingSoap[models.length][models[0].length];
        } else {
            soapModels = new AuditFindingSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static AuditFindingSoap[] toSoapModels(List<AuditFinding> models) {
        List<AuditFindingSoap> soapModels = new ArrayList<AuditFindingSoap>(models.size());

        for (AuditFinding model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new AuditFindingSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _FindingId;
    }

    public void setPrimaryKey(long pk) {
        setFindingId(pk);
    }

    public long getFindingId() {
        return _FindingId;
    }

    public void setFindingId(long FindingId) {
        _FindingId = FindingId;
    }

    public String getFindingName() {
        return _FindingName;
    }

    public void setFindingName(String FindingName) {
        _FindingName = FindingName;
    }

    public long getPlanId() {
        return _PlanId;
    }

    public void setPlanId(long PlanId) {
        _PlanId = PlanId;
    }

    public String getType() {
        return _Type;
    }

    public void setType(String Type) {
        _Type = Type;
    }

    public Date getDueDate() {
        return _DueDate;
    }

    public void setDueDate(Date DueDate) {
        _DueDate = DueDate;
    }

    public String getStatus() {
        return _Status;
    }

    public void setStatus(String Status) {
        _Status = Status;
    }

    public Date getFollowupDue() {
        return _FollowupDue;
    }

    public void setFollowupDue(Date FollowupDue) {
        _FollowupDue = FollowupDue;
    }

    public String getFollowupStatus() {
        return _FollowupStatus;
    }

    public void setFollowupStatus(String FollowupStatus) {
        _FollowupStatus = FollowupStatus;
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
