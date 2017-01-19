package syneren.qms.audit.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import syneren.qms.audit.model.CorrectiveAction;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CorrectiveAction in entity cache.
 *
 * @author anguyen
 * @see CorrectiveAction
 * @generated
 */
public class CorrectiveActionCacheModel implements CacheModel<CorrectiveAction>,
    Externalizable {
    public long ActionId;
    public String ActionName;
    public long FindingId;
    public String Note;
    public long companyId;
    public long groupId;
    public long userId;
    public long createDate;
    public long modifiedDate;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{ActionId=");
        sb.append(ActionId);
        sb.append(", ActionName=");
        sb.append(ActionName);
        sb.append(", FindingId=");
        sb.append(FindingId);
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
    public CorrectiveAction toEntityModel() {
        CorrectiveActionImpl correctiveActionImpl = new CorrectiveActionImpl();

        correctiveActionImpl.setActionId(ActionId);

        if (ActionName == null) {
            correctiveActionImpl.setActionName(StringPool.BLANK);
        } else {
            correctiveActionImpl.setActionName(ActionName);
        }

        correctiveActionImpl.setFindingId(FindingId);

        if (Note == null) {
            correctiveActionImpl.setNote(StringPool.BLANK);
        } else {
            correctiveActionImpl.setNote(Note);
        }

        correctiveActionImpl.setCompanyId(companyId);
        correctiveActionImpl.setGroupId(groupId);
        correctiveActionImpl.setUserId(userId);

        if (createDate == Long.MIN_VALUE) {
            correctiveActionImpl.setCreateDate(null);
        } else {
            correctiveActionImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            correctiveActionImpl.setModifiedDate(null);
        } else {
            correctiveActionImpl.setModifiedDate(new Date(modifiedDate));
        }

        correctiveActionImpl.resetOriginalValues();

        return correctiveActionImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        ActionId = objectInput.readLong();
        ActionName = objectInput.readUTF();
        FindingId = objectInput.readLong();
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
        objectOutput.writeLong(ActionId);

        if (ActionName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(ActionName);
        }

        objectOutput.writeLong(FindingId);

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
