package syneren.qms.audit.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import syneren.qms.audit.model.AuditPlan;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AuditPlan in entity cache.
 *
 * @author anguyen
 * @see AuditPlan
 * @generated
 */
public class AuditPlanCacheModel implements CacheModel<AuditPlan>,
    Externalizable {
    public long PlanId;
    public String PlanName;
    public long InitAuditId;
    public String Auditor;
    public String AuditTeam;
    public String Interviewes;
    public long PlanDate;
    public long ActDate;
    public String Status;
    public String Note;
    public long companyId;
    public long groupId;
    public long userId;
    public long createDate;
    public long modifiedDate;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(31);

        sb.append("{PlanId=");
        sb.append(PlanId);
        sb.append(", PlanName=");
        sb.append(PlanName);
        sb.append(", InitAuditId=");
        sb.append(InitAuditId);
        sb.append(", Auditor=");
        sb.append(Auditor);
        sb.append(", AuditTeam=");
        sb.append(AuditTeam);
        sb.append(", Interviewes=");
        sb.append(Interviewes);
        sb.append(", PlanDate=");
        sb.append(PlanDate);
        sb.append(", ActDate=");
        sb.append(ActDate);
        sb.append(", Status=");
        sb.append(Status);
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
    public AuditPlan toEntityModel() {
        AuditPlanImpl auditPlanImpl = new AuditPlanImpl();

        auditPlanImpl.setPlanId(PlanId);

        if (PlanName == null) {
            auditPlanImpl.setPlanName(StringPool.BLANK);
        } else {
            auditPlanImpl.setPlanName(PlanName);
        }

        auditPlanImpl.setInitAuditId(InitAuditId);

        if (Auditor == null) {
            auditPlanImpl.setAuditor(StringPool.BLANK);
        } else {
            auditPlanImpl.setAuditor(Auditor);
        }

        if (AuditTeam == null) {
            auditPlanImpl.setAuditTeam(StringPool.BLANK);
        } else {
            auditPlanImpl.setAuditTeam(AuditTeam);
        }

        if (Interviewes == null) {
            auditPlanImpl.setInterviewes(StringPool.BLANK);
        } else {
            auditPlanImpl.setInterviewes(Interviewes);
        }

        if (PlanDate == Long.MIN_VALUE) {
            auditPlanImpl.setPlanDate(null);
        } else {
            auditPlanImpl.setPlanDate(new Date(PlanDate));
        }

        if (ActDate == Long.MIN_VALUE) {
            auditPlanImpl.setActDate(null);
        } else {
            auditPlanImpl.setActDate(new Date(ActDate));
        }

        if (Status == null) {
            auditPlanImpl.setStatus(StringPool.BLANK);
        } else {
            auditPlanImpl.setStatus(Status);
        }

        if (Note == null) {
            auditPlanImpl.setNote(StringPool.BLANK);
        } else {
            auditPlanImpl.setNote(Note);
        }

        auditPlanImpl.setCompanyId(companyId);
        auditPlanImpl.setGroupId(groupId);
        auditPlanImpl.setUserId(userId);

        if (createDate == Long.MIN_VALUE) {
            auditPlanImpl.setCreateDate(null);
        } else {
            auditPlanImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            auditPlanImpl.setModifiedDate(null);
        } else {
            auditPlanImpl.setModifiedDate(new Date(modifiedDate));
        }

        auditPlanImpl.resetOriginalValues();

        return auditPlanImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        PlanId = objectInput.readLong();
        PlanName = objectInput.readUTF();
        InitAuditId = objectInput.readLong();
        Auditor = objectInput.readUTF();
        AuditTeam = objectInput.readUTF();
        Interviewes = objectInput.readUTF();
        PlanDate = objectInput.readLong();
        ActDate = objectInput.readLong();
        Status = objectInput.readUTF();
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
        objectOutput.writeLong(PlanId);

        if (PlanName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(PlanName);
        }

        objectOutput.writeLong(InitAuditId);

        if (Auditor == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(Auditor);
        }

        if (AuditTeam == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(AuditTeam);
        }

        if (Interviewes == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(Interviewes);
        }

        objectOutput.writeLong(PlanDate);
        objectOutput.writeLong(ActDate);

        if (Status == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(Status);
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
