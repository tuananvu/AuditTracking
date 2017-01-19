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
public class AuditReportSoap implements Serializable {
    private long _AuditId;
    private String _AuditName;
    private long _InitAuditId;
    private String _Auditor;
    private String _Note;
    private long _companyId;
    private long _groupId;
    private long _userId;
    private Date _createDate;
    private Date _modifiedDate;

    public AuditReportSoap() {
    }

    public static AuditReportSoap toSoapModel(AuditReport model) {
        AuditReportSoap soapModel = new AuditReportSoap();

        soapModel.setAuditId(model.getAuditId());
        soapModel.setAuditName(model.getAuditName());
        soapModel.setInitAuditId(model.getInitAuditId());
        soapModel.setAuditor(model.getAuditor());
        soapModel.setNote(model.getNote());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setUserId(model.getUserId());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());

        return soapModel;
    }

    public static AuditReportSoap[] toSoapModels(AuditReport[] models) {
        AuditReportSoap[] soapModels = new AuditReportSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static AuditReportSoap[][] toSoapModels(AuditReport[][] models) {
        AuditReportSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new AuditReportSoap[models.length][models[0].length];
        } else {
            soapModels = new AuditReportSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static AuditReportSoap[] toSoapModels(List<AuditReport> models) {
        List<AuditReportSoap> soapModels = new ArrayList<AuditReportSoap>(models.size());

        for (AuditReport model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new AuditReportSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _AuditId;
    }

    public void setPrimaryKey(long pk) {
        setAuditId(pk);
    }

    public long getAuditId() {
        return _AuditId;
    }

    public void setAuditId(long AuditId) {
        _AuditId = AuditId;
    }

    public String getAuditName() {
        return _AuditName;
    }

    public void setAuditName(String AuditName) {
        _AuditName = AuditName;
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
