package syneren.qms.audit.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import syneren.qms.audit.model.AuditFinding;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AuditFinding in entity cache.
 *
 * @author anguyen
 * @see AuditFinding
 * @generated
 */
public class AuditFindingCacheModel implements CacheModel<AuditFinding>,
    Externalizable {
    public long FindingId;
    public String FindingName;
    public long PlanId;
    public String Type;
    public long DueDate;
    public String Status;
    public long FollowupDue;
    public String FollowupStatus;
    public String Note;
    public long companyId;
    public long groupId;
    public long userId;
    public long createDate;
    public long modifiedDate;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(29);

        sb.append("{FindingId=");
        sb.append(FindingId);
        sb.append(", FindingName=");
        sb.append(FindingName);
        sb.append(", PlanId=");
        sb.append(PlanId);
        sb.append(", Type=");
        sb.append(Type);
        sb.append(", DueDate=");
        sb.append(DueDate);
        sb.append(", Status=");
        sb.append(Status);
        sb.append(", FollowupDue=");
        sb.append(FollowupDue);
        sb.append(", FollowupStatus=");
        sb.append(FollowupStatus);
        sb.append(", Note=");
        sb.append(Note);
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
        sb.append("}");

        return sb.toString();
    }

    @Override
    public AuditFinding toEntityModel() {
        AuditFindingImpl auditFindingImpl = new AuditFindingImpl();

        auditFindingImpl.setFindingId(FindingId);

        if (FindingName == null) {
            auditFindingImpl.setFindingName(StringPool.BLANK);
        } else {
            auditFindingImpl.setFindingName(FindingName);
        }

        auditFindingImpl.setPlanId(PlanId);

        if (Type == null) {
            auditFindingImpl.setType(StringPool.BLANK);
        } else {
            auditFindingImpl.setType(Type);
        }

        if (DueDate == Long.MIN_VALUE) {
            auditFindingImpl.setDueDate(null);
        } else {
            auditFindingImpl.setDueDate(new Date(DueDate));
        }

        if (Status == null) {
            auditFindingImpl.setStatus(StringPool.BLANK);
        } else {
            auditFindingImpl.setStatus(Status);
        }

        if (FollowupDue == Long.MIN_VALUE) {
            auditFindingImpl.setFollowupDue(null);
        } else {
            auditFindingImpl.setFollowupDue(new Date(FollowupDue));
        }

        if (FollowupStatus == null) {
            auditFindingImpl.setFollowupStatus(StringPool.BLANK);
        } else {
            auditFindingImpl.setFollowupStatus(FollowupStatus);
        }

        if (Note == null) {
            auditFindingImpl.setNote(StringPool.BLANK);
        } else {
            auditFindingImpl.setNote(Note);
        }

        auditFindingImpl.setCompanyId(companyId);
        auditFindingImpl.setGroupId(groupId);
        auditFindingImpl.setUserId(userId);

        if (createDate == Long.MIN_VALUE) {
            auditFindingImpl.setCreateDate(null);
        } else {
            auditFindingImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            auditFindingImpl.setModifiedDate(null);
        } else {
            auditFindingImpl.setModifiedDate(new Date(modifiedDate));
        }

        auditFindingImpl.resetOriginalValues();

        return auditFindingImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        FindingId = objectInput.readLong();
        FindingName = objectInput.readUTF();
        PlanId = objectInput.readLong();
        Type = objectInput.readUTF();
        DueDate = objectInput.readLong();
        Status = objectInput.readUTF();
        FollowupDue = objectInput.readLong();
        FollowupStatus = objectInput.readUTF();
        Note = objectInput.readUTF();
        companyId = objectInput.readLong();
        groupId = objectInput.readLong();
        userId = objectInput.readLong();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(FindingId);

        if (FindingName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(FindingName);
        }

        objectOutput.writeLong(PlanId);

        if (Type == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(Type);
        }

        objectOutput.writeLong(DueDate);

        if (Status == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(Status);
        }

        objectOutput.writeLong(FollowupDue);

        if (FollowupStatus == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(FollowupStatus);
        }

        if (Note == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(Note);
        }

        objectOutput.writeLong(companyId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(userId);
        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);
    }
}
