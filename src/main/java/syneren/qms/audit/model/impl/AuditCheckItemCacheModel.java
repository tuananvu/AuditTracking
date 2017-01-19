package syneren.qms.audit.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import syneren.qms.audit.model.AuditCheckItem;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AuditCheckItem in entity cache.
 *
 * @author anguyen
 * @see AuditCheckItem
 * @generated
 */
public class AuditCheckItemCacheModel implements CacheModel<AuditCheckItem>,
    Externalizable {
    public long CheckItemId;
    public String CheckItemName;
    public String Question;
    public String Answer;
    public boolean Complie;
    public String Evidence;
    public String Outcome;
    public long companyId;
    public long groupId;
    public long userId;
    public long createDate;
    public long modifiedDate;
    public long AuditId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(27);

        sb.append("{CheckItemId=");
        sb.append(CheckItemId);
        sb.append(", CheckItemName=");
        sb.append(CheckItemName);
        sb.append(", Question=");
        sb.append(Question);
        sb.append(", Answer=");
        sb.append(Answer);
        sb.append(", Complie=");
        sb.append(Complie);
        sb.append(", Evidence=");
        sb.append(Evidence);
        sb.append(", Outcome=");
        sb.append(Outcome);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", AuditId=");
        sb.append(AuditId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public AuditCheckItem toEntityModel() {
        AuditCheckItemImpl auditCheckItemImpl = new AuditCheckItemImpl();

        auditCheckItemImpl.setCheckItemId(CheckItemId);

        if (CheckItemName == null) {
            auditCheckItemImpl.setCheckItemName(StringPool.BLANK);
        } else {
            auditCheckItemImpl.setCheckItemName(CheckItemName);
        }

        if (Question == null) {
            auditCheckItemImpl.setQuestion(StringPool.BLANK);
        } else {
            auditCheckItemImpl.setQuestion(Question);
        }

        if (Answer == null) {
            auditCheckItemImpl.setAnswer(StringPool.BLANK);
        } else {
            auditCheckItemImpl.setAnswer(Answer);
        }

        auditCheckItemImpl.setComplie(Complie);

        if (Evidence == null) {
            auditCheckItemImpl.setEvidence(StringPool.BLANK);
        } else {
            auditCheckItemImpl.setEvidence(Evidence);
        }

        if (Outcome == null) {
            auditCheckItemImpl.setOutcome(StringPool.BLANK);
        } else {
            auditCheckItemImpl.setOutcome(Outcome);
        }

        auditCheckItemImpl.setCompanyId(companyId);
        auditCheckItemImpl.setGroupId(groupId);
        auditCheckItemImpl.setUserId(userId);

        if (createDate == Long.MIN_VALUE) {
            auditCheckItemImpl.setCreateDate(null);
        } else {
            auditCheckItemImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            auditCheckItemImpl.setModifiedDate(null);
        } else {
            auditCheckItemImpl.setModifiedDate(new Date(modifiedDate));
        }

        auditCheckItemImpl.setAuditId(AuditId);

        auditCheckItemImpl.resetOriginalValues();

        return auditCheckItemImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        CheckItemId = objectInput.readLong();
        CheckItemName = objectInput.readUTF();
        Question = objectInput.readUTF();
        Answer = objectInput.readUTF();
        Complie = objectInput.readBoolean();
        Evidence = objectInput.readUTF();
        Outcome = objectInput.readUTF();
        companyId = objectInput.readLong();
        groupId = objectInput.readLong();
        userId = objectInput.readLong();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        AuditId = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(CheckItemId);

        if (CheckItemName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(CheckItemName);
        }

        if (Question == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(Question);
        }

        if (Answer == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(Answer);
        }

        objectOutput.writeBoolean(Complie);

        if (Evidence == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(Evidence);
        }

        if (Outcome == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(Outcome);
        }

        objectOutput.writeLong(companyId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(userId);
        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);
        objectOutput.writeLong(AuditId);
    }
}
