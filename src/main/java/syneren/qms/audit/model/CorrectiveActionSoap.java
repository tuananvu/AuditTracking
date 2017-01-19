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
public class CorrectiveActionSoap implements Serializable {
    private long _ActionId;
    private String _ActionName;
    private long _FindingId;
    private String _Note;
    private long _companyId;
    private long _groupId;
    private long _userId;
    private Date _createDate;
    private Date _modifiedDate;

    public CorrectiveActionSoap() {
    }

    public static CorrectiveActionSoap toSoapModel(CorrectiveAction model) {
        CorrectiveActionSoap soapModel = new CorrectiveActionSoap();

        soapModel.setActionId(model.getActionId());
        soapModel.setActionName(model.getActionName());
        soapModel.setFindingId(model.getFindingId());
        soapModel.setNote(model.getNote());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setUserId(model.getUserId());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());

        return soapModel;
    }

    public static CorrectiveActionSoap[] toSoapModels(CorrectiveAction[] models) {
        CorrectiveActionSoap[] soapModels = new CorrectiveActionSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static CorrectiveActionSoap[][] toSoapModels(
        CorrectiveAction[][] models) {
        CorrectiveActionSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new CorrectiveActionSoap[models.length][models[0].length];
        } else {
            soapModels = new CorrectiveActionSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static CorrectiveActionSoap[] toSoapModels(
        List<CorrectiveAction> models) {
        List<CorrectiveActionSoap> soapModels = new ArrayList<CorrectiveActionSoap>(models.size());

        for (CorrectiveAction model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new CorrectiveActionSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _ActionId;
    }

    public void setPrimaryKey(long pk) {
        setActionId(pk);
    }

    public long getActionId() {
        return _ActionId;
    }

    public void setActionId(long ActionId) {
        _ActionId = ActionId;
    }

    public String getActionName() {
        return _ActionName;
    }

    public void setActionName(String ActionName) {
        _ActionName = ActionName;
    }

    public long getFindingId() {
        return _FindingId;
    }

    public void setFindingId(long FindingId) {
        _FindingId = FindingId;
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
