package syneren.qms.audit.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import syneren.qms.audit.model.AuditCheckItem;
import syneren.qms.audit.model.AuditCheckItemModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the AuditCheckItem service. Represents a row in the &quot;AuditCheckItem&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link syneren.qms.audit.model.AuditCheckItemModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AuditCheckItemImpl}.
 * </p>
 *
 * @author anguyen
 * @see AuditCheckItemImpl
 * @see syneren.qms.audit.model.AuditCheckItem
 * @see syneren.qms.audit.model.AuditCheckItemModel
 * @generated
 */
public class AuditCheckItemModelImpl extends BaseModelImpl<AuditCheckItem>
    implements AuditCheckItemModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a audit check item model instance should use the {@link syneren.qms.audit.model.AuditCheckItem} interface instead.
     */
    public static final String TABLE_NAME = "AuditCheckItem";
    public static final Object[][] TABLE_COLUMNS = {
            { "CheckItemId", Types.BIGINT },
            { "CheckItemName", Types.VARCHAR },
            { "Question", Types.VARCHAR },
            { "Answer", Types.VARCHAR },
            { "Complie", Types.BOOLEAN },
            { "Evidence", Types.VARCHAR },
            { "Outcome", Types.VARCHAR },
            { "companyId", Types.BIGINT },
            { "groupId", Types.BIGINT },
            { "userId", Types.BIGINT },
            { "createDate", Types.TIMESTAMP },
            { "modifiedDate", Types.TIMESTAMP },
            { "AuditId", Types.BIGINT }
        };
    public static final String TABLE_SQL_CREATE = "create table AuditCheckItem (CheckItemId LONG not null primary key,CheckItemName VARCHAR(75) null,Question VARCHAR(75) null,Answer VARCHAR(75) null,Complie BOOLEAN,Evidence VARCHAR(75) null,Outcome VARCHAR(75) null,companyId LONG,groupId LONG,userId LONG,createDate DATE null,modifiedDate DATE null,AuditId LONG)";
    public static final String TABLE_SQL_DROP = "drop table AuditCheckItem";
    public static final String ORDER_BY_JPQL = " ORDER BY auditCheckItem.CheckItemId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY AuditCheckItem.CheckItemId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.syneren.qms.audit.model.AuditCheckItem"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.syneren.qms.audit.model.AuditCheckItem"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.syneren.qms.audit.model.AuditCheckItem"),
            true);
    public static long AUDITID_COLUMN_BITMASK = 1L;
    public static long CHECKITEMID_COLUMN_BITMASK = 2L;
    public static long GROUPID_COLUMN_BITMASK = 4L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.syneren.qms.audit.model.AuditCheckItem"));
    private static ClassLoader _classLoader = AuditCheckItem.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            AuditCheckItem.class
        };
    private long _CheckItemId;
    private long _originalCheckItemId;
    private boolean _setOriginalCheckItemId;
    private String _CheckItemName;
    private String _Question;
    private String _Answer;
    private boolean _Complie;
    private String _Evidence;
    private String _Outcome;
    private long _companyId;
    private long _groupId;
    private long _originalGroupId;
    private boolean _setOriginalGroupId;
    private long _userId;
    private String _userUuid;
    private Date _createDate;
    private Date _modifiedDate;
    private long _AuditId;
    private long _originalAuditId;
    private boolean _setOriginalAuditId;
    private long _columnBitmask;
    private AuditCheckItem _escapedModel;

    public AuditCheckItemModelImpl() {
    }

    @Override
    public long getPrimaryKey() {
        return _CheckItemId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setCheckItemId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _CheckItemId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return AuditCheckItem.class;
    }

    @Override
    public String getModelClassName() {
        return AuditCheckItem.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("CheckItemId", getCheckItemId());
        attributes.put("CheckItemName", getCheckItemName());
        attributes.put("Question", getQuestion());
        attributes.put("Answer", getAnswer());
        attributes.put("Complie", getComplie());
        attributes.put("Evidence", getEvidence());
        attributes.put("Outcome", getOutcome());
        attributes.put("companyId", getCompanyId());
        attributes.put("groupId", getGroupId());
        attributes.put("userId", getUserId());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("AuditId", getAuditId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long CheckItemId = (Long) attributes.get("CheckItemId");

        if (CheckItemId != null) {
            setCheckItemId(CheckItemId);
        }

        String CheckItemName = (String) attributes.get("CheckItemName");

        if (CheckItemName != null) {
            setCheckItemName(CheckItemName);
        }

        String Question = (String) attributes.get("Question");

        if (Question != null) {
            setQuestion(Question);
        }

        String Answer = (String) attributes.get("Answer");

        if (Answer != null) {
            setAnswer(Answer);
        }

        Boolean Complie = (Boolean) attributes.get("Complie");

        if (Complie != null) {
            setComplie(Complie);
        }

        String Evidence = (String) attributes.get("Evidence");

        if (Evidence != null) {
            setEvidence(Evidence);
        }

        String Outcome = (String) attributes.get("Outcome");

        if (Outcome != null) {
            setOutcome(Outcome);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        Long AuditId = (Long) attributes.get("AuditId");

        if (AuditId != null) {
            setAuditId(AuditId);
        }
    }

    @Override
    public long getCheckItemId() {
        return _CheckItemId;
    }

    @Override
    public void setCheckItemId(long CheckItemId) {
        _columnBitmask |= CHECKITEMID_COLUMN_BITMASK;

        if (!_setOriginalCheckItemId) {
            _setOriginalCheckItemId = true;

            _originalCheckItemId = _CheckItemId;
        }

        _CheckItemId = CheckItemId;
    }

    public long getOriginalCheckItemId() {
        return _originalCheckItemId;
    }

    @Override
    public String getCheckItemName() {
        if (_CheckItemName == null) {
            return StringPool.BLANK;
        } else {
            return _CheckItemName;
        }
    }

    @Override
    public void setCheckItemName(String CheckItemName) {
        _CheckItemName = CheckItemName;
    }

    @Override
    public String getQuestion() {
        if (_Question == null) {
            return StringPool.BLANK;
        } else {
            return _Question;
        }
    }

    @Override
    public void setQuestion(String Question) {
        _Question = Question;
    }

    @Override
    public String getAnswer() {
        if (_Answer == null) {
            return StringPool.BLANK;
        } else {
            return _Answer;
        }
    }

    @Override
    public void setAnswer(String Answer) {
        _Answer = Answer;
    }

    @Override
    public boolean getComplie() {
        return _Complie;
    }

    @Override
    public boolean isComplie() {
        return _Complie;
    }

    @Override
    public void setComplie(boolean Complie) {
        _Complie = Complie;
    }

    @Override
    public String getEvidence() {
        if (_Evidence == null) {
            return StringPool.BLANK;
        } else {
            return _Evidence;
        }
    }

    @Override
    public void setEvidence(String Evidence) {
        _Evidence = Evidence;
    }

    @Override
    public String getOutcome() {
        if (_Outcome == null) {
            return StringPool.BLANK;
        } else {
            return _Outcome;
        }
    }

    @Override
    public void setOutcome(String Outcome) {
        _Outcome = Outcome;
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _columnBitmask |= GROUPID_COLUMN_BITMASK;

        if (!_setOriginalGroupId) {
            _setOriginalGroupId = true;

            _originalGroupId = _groupId;
        }

        _groupId = groupId;
    }

    public long getOriginalGroupId() {
        return _originalGroupId;
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    @Override
    public long getAuditId() {
        return _AuditId;
    }

    @Override
    public void setAuditId(long AuditId) {
        _columnBitmask |= AUDITID_COLUMN_BITMASK;

        if (!_setOriginalAuditId) {
            _setOriginalAuditId = true;

            _originalAuditId = _AuditId;
        }

        _AuditId = AuditId;
    }

    public long getOriginalAuditId() {
        return _originalAuditId;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
            AuditCheckItem.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public AuditCheckItem toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (AuditCheckItem) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        AuditCheckItemImpl auditCheckItemImpl = new AuditCheckItemImpl();

        auditCheckItemImpl.setCheckItemId(getCheckItemId());
        auditCheckItemImpl.setCheckItemName(getCheckItemName());
        auditCheckItemImpl.setQuestion(getQuestion());
        auditCheckItemImpl.setAnswer(getAnswer());
        auditCheckItemImpl.setComplie(getComplie());
        auditCheckItemImpl.setEvidence(getEvidence());
        auditCheckItemImpl.setOutcome(getOutcome());
        auditCheckItemImpl.setCompanyId(getCompanyId());
        auditCheckItemImpl.setGroupId(getGroupId());
        auditCheckItemImpl.setUserId(getUserId());
        auditCheckItemImpl.setCreateDate(getCreateDate());
        auditCheckItemImpl.setModifiedDate(getModifiedDate());
        auditCheckItemImpl.setAuditId(getAuditId());

        auditCheckItemImpl.resetOriginalValues();

        return auditCheckItemImpl;
    }

    @Override
    public int compareTo(AuditCheckItem auditCheckItem) {
        long primaryKey = auditCheckItem.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof AuditCheckItem)) {
            return false;
        }

        AuditCheckItem auditCheckItem = (AuditCheckItem) obj;

        long primaryKey = auditCheckItem.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
        AuditCheckItemModelImpl auditCheckItemModelImpl = this;

        auditCheckItemModelImpl._originalCheckItemId = auditCheckItemModelImpl._CheckItemId;

        auditCheckItemModelImpl._setOriginalCheckItemId = false;

        auditCheckItemModelImpl._originalGroupId = auditCheckItemModelImpl._groupId;

        auditCheckItemModelImpl._setOriginalGroupId = false;

        auditCheckItemModelImpl._originalAuditId = auditCheckItemModelImpl._AuditId;

        auditCheckItemModelImpl._setOriginalAuditId = false;

        auditCheckItemModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<AuditCheckItem> toCacheModel() {
        AuditCheckItemCacheModel auditCheckItemCacheModel = new AuditCheckItemCacheModel();

        auditCheckItemCacheModel.CheckItemId = getCheckItemId();

        auditCheckItemCacheModel.CheckItemName = getCheckItemName();

        String CheckItemName = auditCheckItemCacheModel.CheckItemName;

        if ((CheckItemName != null) && (CheckItemName.length() == 0)) {
            auditCheckItemCacheModel.CheckItemName = null;
        }

        auditCheckItemCacheModel.Question = getQuestion();

        String Question = auditCheckItemCacheModel.Question;

        if ((Question != null) && (Question.length() == 0)) {
            auditCheckItemCacheModel.Question = null;
        }

        auditCheckItemCacheModel.Answer = getAnswer();

        String Answer = auditCheckItemCacheModel.Answer;

        if ((Answer != null) && (Answer.length() == 0)) {
            auditCheckItemCacheModel.Answer = null;
        }

        auditCheckItemCacheModel.Complie = getComplie();

        auditCheckItemCacheModel.Evidence = getEvidence();

        String Evidence = auditCheckItemCacheModel.Evidence;

        if ((Evidence != null) && (Evidence.length() == 0)) {
            auditCheckItemCacheModel.Evidence = null;
        }

        auditCheckItemCacheModel.Outcome = getOutcome();

        String Outcome = auditCheckItemCacheModel.Outcome;

        if ((Outcome != null) && (Outcome.length() == 0)) {
            auditCheckItemCacheModel.Outcome = null;
        }

        auditCheckItemCacheModel.companyId = getCompanyId();

        auditCheckItemCacheModel.groupId = getGroupId();

        auditCheckItemCacheModel.userId = getUserId();

        Date createDate = getCreateDate();

        if (createDate != null) {
            auditCheckItemCacheModel.createDate = createDate.getTime();
        } else {
            auditCheckItemCacheModel.createDate = Long.MIN_VALUE;
        }

        Date modifiedDate = getModifiedDate();

        if (modifiedDate != null) {
            auditCheckItemCacheModel.modifiedDate = modifiedDate.getTime();
        } else {
            auditCheckItemCacheModel.modifiedDate = Long.MIN_VALUE;
        }

        auditCheckItemCacheModel.AuditId = getAuditId();

        return auditCheckItemCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(27);

        sb.append("{CheckItemId=");
        sb.append(getCheckItemId());
        sb.append(", CheckItemName=");
        sb.append(getCheckItemName());
        sb.append(", Question=");
        sb.append(getQuestion());
        sb.append(", Answer=");
        sb.append(getAnswer());
        sb.append(", Complie=");
        sb.append(getComplie());
        sb.append(", Evidence=");
        sb.append(getEvidence());
        sb.append(", Outcome=");
        sb.append(getOutcome());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", AuditId=");
        sb.append(getAuditId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(43);

        sb.append("<model><model-name>");
        sb.append("syneren.qms.audit.model.AuditCheckItem");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>CheckItemId</column-name><column-value><![CDATA[");
        sb.append(getCheckItemId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CheckItemName</column-name><column-value><![CDATA[");
        sb.append(getCheckItemName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Question</column-name><column-value><![CDATA[");
        sb.append(getQuestion());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Answer</column-name><column-value><![CDATA[");
        sb.append(getAnswer());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Complie</column-name><column-value><![CDATA[");
        sb.append(getComplie());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Evidence</column-name><column-value><![CDATA[");
        sb.append(getEvidence());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Outcome</column-name><column-value><![CDATA[");
        sb.append(getOutcome());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>AuditId</column-name><column-value><![CDATA[");
        sb.append(getAuditId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
