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
public class AuditCheckItemSoap implements Serializable {
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
    private Date _createDate;
    private Date _modifiedDate;
    private long _AuditId;

    public AuditCheckItemSoap() {
    }

    public static AuditCheckItemSoap toSoapModel(AuditCheckItem model) {
        AuditCheckItemSoap soapModel = new AuditCheckItemSoap();

        soapModel.setCheckItemId(model.getCheckItemId());
        soapModel.setCheckItemName(model.getCheckItemName());
        soapModel.setQuestion(model.getQuestion());
        soapModel.setAnswer(model.getAnswer());
        soapModel.setComplie(model.getComplie());
        soapModel.setEvidence(model.getEvidence());
        soapModel.setOutcome(model.getOutcome());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setUserId(model.getUserId());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setAuditId(model.getAuditId());

        return soapModel;
    }

    public static AuditCheckItemSoap[] toSoapModels(AuditCheckItem[] models) {
        AuditCheckItemSoap[] soapModels = new AuditCheckItemSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static AuditCheckItemSoap[][] toSoapModels(AuditCheckItem[][] models) {
        AuditCheckItemSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new AuditCheckItemSoap[models.length][models[0].length];
        } else {
            soapModels = new AuditCheckItemSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static AuditCheckItemSoap[] toSoapModels(List<AuditCheckItem> models) {
        List<AuditCheckItemSoap> soapModels = new ArrayList<AuditCheckItemSoap>(models.size());

        for (AuditCheckItem model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new AuditCheckItemSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _CheckItemId;
    }

    public void setPrimaryKey(long pk) {
        setCheckItemId(pk);
    }

    public long getCheckItemId() {
        return _CheckItemId;
    }

    public void setCheckItemId(long CheckItemId) {
        _CheckItemId = CheckItemId;
    }

    public String getCheckItemName() {
        return _CheckItemName;
    }

    public void setCheckItemName(String CheckItemName) {
        _CheckItemName = CheckItemName;
    }

    public String getQuestion() {
        return _Question;
    }

    public void setQuestion(String Question) {
        _Question = Question;
    }

    public String getAnswer() {
        return _Answer;
    }

    public void setAnswer(String Answer) {
        _Answer = Answer;
    }

    public boolean getComplie() {
        return _Complie;
    }

    public boolean isComplie() {
        return _Complie;
    }

    public void setComplie(boolean Complie) {
        _Complie = Complie;
    }

    public String getEvidence() {
        return _Evidence;
    }

    public void setEvidence(String Evidence) {
        _Evidence = Evidence;
    }

    public String getOutcome() {
        return _Outcome;
    }

    public void setOutcome(String Outcome) {
        _Outcome = Outcome;
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

    public long getAuditId() {
        return _AuditId;
    }

    public void setAuditId(long AuditId) {
        _AuditId = AuditId;
    }
}
