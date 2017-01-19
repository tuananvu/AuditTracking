package syneren.qms.audit.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import syneren.qms.audit.model.InitAudit;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing InitAudit in entity cache.
 *
 * @author anguyen
 * @see InitAudit
 * @generated
 */
public class InitAuditCacheModel implements CacheModel<InitAudit>,
    Externalizable {
    public long InitAuditId;
    public String InitAuditName;
    public long StartDate;
    public long EndDate;
    public long companyId;
    public long groupId;
    public long userId;
    public long createDate;
    public long modifiedDate;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{InitAuditId=");
        sb.append(InitAuditId);
        sb.append(", InitAuditName=");
        sb.append(InitAuditName);
        sb.append(", StartDate=");
        sb.append(StartDate);
        sb.append(", EndDate=");
        sb.append(EndDate);
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
    public InitAudit toEntityModel() {
        InitAuditImpl initAuditImpl = new InitAuditImpl();

        initAuditImpl.setInitAuditId(InitAuditId);

        if (InitAuditName == null) {
            initAuditImpl.setInitAuditName(StringPool.BLANK);
        } else {
            initAuditImpl.setInitAuditName(InitAuditName);
        }

        if (StartDate == Long.MIN_VALUE) {
            initAuditImpl.setStartDate(null);
        } else {
            initAuditImpl.setStartDate(new Date(StartDate));
        }

        if (EndDate == Long.MIN_VALUE) {
            initAuditImpl.setEndDate(null);
        } else {
            initAuditImpl.setEndDate(new Date(EndDate));
        }

        initAuditImpl.setCompanyId(companyId);
        initAuditImpl.setGroupId(groupId);
        initAuditImpl.setUserId(userId);

        if (createDate == Long.MIN_VALUE) {
            initAuditImpl.setCreateDate(null);
        } else {
            initAuditImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            initAuditImpl.setModifiedDate(null);
        } else {
            initAuditImpl.setModifiedDate(new Date(modifiedDate));
        }

        initAuditImpl.resetOriginalValues();

        return initAuditImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        InitAuditId = objectInput.readLong();
        InitAuditName = objectInput.readUTF();
        StartDate = objectInput.readLong();
        EndDate = objectInput.readLong();
        companyId = objectInput.readLong();
        groupId = objectInput.readLong();
        userId = objectInput.readLong();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(InitAuditId);

        if (InitAuditName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(InitAuditName);
        }

        objectOutput.writeLong(StartDate);
        objectOutput.writeLong(EndDate);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(userId);
        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);
    }
}
