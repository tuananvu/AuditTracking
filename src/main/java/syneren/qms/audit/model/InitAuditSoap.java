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
public class InitAuditSoap implements Serializable {
    private long _InitAuditId;
    private String _InitAuditName;
    private Date _StartDate;
    private Date _EndDate;
    private long _companyId;
    private long _groupId;
    private long _userId;
    private Date _createDate;
    private Date _modifiedDate;

    public InitAuditSoap() {
    }

    public static InitAuditSoap toSoapModel(InitAudit model) {
        InitAuditSoap soapModel = new InitAuditSoap();

        soapModel.setInitAuditId(model.getInitAuditId());
        soapModel.setInitAuditName(model.getInitAuditName());
        soapModel.setStartDate(model.getStartDate());
        soapModel.setEndDate(model.getEndDate());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setUserId(model.getUserId());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());

        return soapModel;
    }

    public static InitAuditSoap[] toSoapModels(InitAudit[] models) {
        InitAuditSoap[] soapModels = new InitAuditSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static InitAuditSoap[][] toSoapModels(InitAudit[][] models) {
        InitAuditSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new InitAuditSoap[models.length][models[0].length];
        } else {
            soapModels = new InitAuditSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static InitAuditSoap[] toSoapModels(List<InitAudit> models) {
        List<InitAuditSoap> soapModels = new ArrayList<InitAuditSoap>(models.size());

        for (InitAudit model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new InitAuditSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _InitAuditId;
    }

    public void setPrimaryKey(long pk) {
        setInitAuditId(pk);
    }

    public long getInitAuditId() {
        return _InitAuditId;
    }

    public void setInitAuditId(long InitAuditId) {
        _InitAuditId = InitAuditId;
    }

    public String getInitAuditName() {
        return _InitAuditName;
    }

    public void setInitAuditName(String InitAuditName) {
        _InitAuditName = InitAuditName;
    }

    public Date getStartDate() {
        return _StartDate;
    }

    public void setStartDate(Date StartDate) {
        _StartDate = StartDate;
    }

    public Date getEndDate() {
        return _EndDate;
    }

    public void setEndDate(Date EndDate) {
        _EndDate = EndDate;
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
