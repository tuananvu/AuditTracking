package syneren.qms.audit.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import syneren.qms.audit.model.AuditReport;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AuditReport in entity cache.
 *
 * @author anguyen
 * @see AuditReport
 * @generated
 */
public class AuditReportCacheModel implements CacheModel<AuditReport>,
    Externalizable {
    public long AuditId;
    public String AuditName;
    public long InitAuditId;
    public String Auditor;
    public String Note;
    public long companyId;
    public long groupId;
    public long userId;
    public long createDate;
    public long modifiedDate;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{AuditId=");
        sb.append(AuditId);
        sb.append(", AuditName=");
        sb.append(AuditName);
        sb.append(", InitAuditId=");
        sb.append(InitAuditId);
        sb.append(", Auditor=");
        sb.append(Auditor);
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
    public AuditReport toEntityModel() {
        AuditReportImpl auditReportImpl = new AuditReportImpl();

        auditReportImpl.setAuditId(AuditId);

        if (AuditName == null) {
            auditReportImpl.setAuditName(StringPool.BLANK);
        } else {
            auditReportImpl.setAuditName(AuditName);
        }

        auditReportImpl.setInitAuditId(InitAuditId);

        if (Auditor == null) {
            auditReportImpl.setAuditor(StringPool.BLANK);
        } else {
            auditReportImpl.setAuditor(Auditor);
        }

        if (Note == null) {
            auditReportImpl.setNote(StringPool.BLANK);
        } else {
            auditReportImpl.setNote(Note);
        }

        auditReportImpl.setCompanyId(companyId);
        auditReportImpl.setGroupId(groupId);
        auditReportImpl.setUserId(userId);

        if (createDate == Long.MIN_VALUE) {
            auditReportImpl.setCreateDate(null);
        } else {
            auditReportImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            auditReportImpl.setModifiedDate(null);
        } else {
            auditReportImpl.setModifiedDate(new Date(modifiedDate));
        }

        auditReportImpl.resetOriginalValues();

        return auditReportImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        AuditId = objectInput.readLong();
        AuditName = objectInput.readUTF();
        InitAuditId = objectInput.readLong();
        Auditor = objectInput.readUTF();
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
        objectOutput.writeLong(AuditId);

        if (AuditName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(AuditName);
        }

        objectOutput.writeLong(InitAuditId);

        if (Auditor == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(Auditor);
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
