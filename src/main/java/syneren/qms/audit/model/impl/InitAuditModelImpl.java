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

import syneren.qms.audit.model.InitAudit;
import syneren.qms.audit.model.InitAuditModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the InitAudit service. Represents a row in the &quot;InitAudit&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link syneren.qms.audit.model.InitAuditModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link InitAuditImpl}.
 * </p>
 *
 * @author anguyen
 * @see InitAuditImpl
 * @see syneren.qms.audit.model.InitAudit
 * @see syneren.qms.audit.model.InitAuditModel
 * @generated
 */
public class InitAuditModelImpl extends BaseModelImpl<InitAudit>
    implements InitAuditModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a init audit model instance should use the {@link syneren.qms.audit.model.InitAudit} interface instead.
     */
    public static final String TABLE_NAME = "InitAudit";
    public static final Object[][] TABLE_COLUMNS = {
            { "InitAuditId", Types.BIGINT },
            { "InitAuditName", Types.VARCHAR },
            { "StartDate", Types.TIMESTAMP },
            { "EndDate", Types.TIMESTAMP },
            { "companyId", Types.BIGINT },
            { "groupId", Types.BIGINT },
            { "userId", Types.BIGINT },
            { "createDate", Types.TIMESTAMP },
            { "modifiedDate", Types.TIMESTAMP }
        };
    public static final String TABLE_SQL_CREATE = "create table InitAudit (InitAuditId LONG not null primary key,InitAuditName VARCHAR(75) null,StartDate DATE null,EndDate DATE null,companyId LONG,groupId LONG,userId LONG,createDate DATE null,modifiedDate DATE null)";
    public static final String TABLE_SQL_DROP = "drop table InitAudit";
    public static final String ORDER_BY_JPQL = " ORDER BY initAudit.InitAuditId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY InitAudit.InitAuditId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.syneren.qms.audit.model.InitAudit"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.syneren.qms.audit.model.InitAudit"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.syneren.qms.audit.model.InitAudit"),
            true);
    public static long INITAUDITID_COLUMN_BITMASK = 1L;
    public static long INITAUDITNAME_COLUMN_BITMASK = 2L;
    public static long GROUPID_COLUMN_BITMASK = 4L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.syneren.qms.audit.model.InitAudit"));
    private static ClassLoader _classLoader = InitAudit.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            InitAudit.class
        };
    private long _InitAuditId;
    private long _originalInitAuditId;
    private boolean _setOriginalInitAuditId;
    private String _InitAuditName;
    private String _originalInitAuditName;
    private Date _StartDate;
    private Date _EndDate;
    private long _companyId;
    private long _groupId;
    private long _originalGroupId;
    private boolean _setOriginalGroupId;
    private long _userId;
    private String _userUuid;
    private Date _createDate;
    private Date _modifiedDate;
    private long _columnBitmask;
    private InitAudit _escapedModel;

    public InitAuditModelImpl() {
    }

    @Override
    public long getPrimaryKey() {
        return _InitAuditId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setInitAuditId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _InitAuditId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return InitAudit.class;
    }

    @Override
    public String getModelClassName() {
        return InitAudit.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("InitAuditId", getInitAuditId());
        attributes.put("InitAuditName", getInitAuditName());
        attributes.put("StartDate", getStartDate());
        attributes.put("EndDate", getEndDate());
        attributes.put("companyId", getCompanyId());
        attributes.put("groupId", getGroupId());
        attributes.put("userId", getUserId());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long InitAuditId = (Long) attributes.get("InitAuditId");

        if (InitAuditId != null) {
            setInitAuditId(InitAuditId);
        }

        String InitAuditName = (String) attributes.get("InitAuditName");

        if (InitAuditName != null) {
            setInitAuditName(InitAuditName);
        }

        Date StartDate = (Date) attributes.get("StartDate");

        if (StartDate != null) {
            setStartDate(StartDate);
        }

        Date EndDate = (Date) attributes.get("EndDate");

        if (EndDate != null) {
            setEndDate(EndDate);
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
    }

    @Override
    public long getInitAuditId() {
        return _InitAuditId;
    }

    @Override
    public void setInitAuditId(long InitAuditId) {
        _columnBitmask |= INITAUDITID_COLUMN_BITMASK;

        if (!_setOriginalInitAuditId) {
            _setOriginalInitAuditId = true;

            _originalInitAuditId = _InitAuditId;
        }

        _InitAuditId = InitAuditId;
    }

    public long getOriginalInitAuditId() {
        return _originalInitAuditId;
    }

    @Override
    public String getInitAuditName() {
        if (_InitAuditName == null) {
            return StringPool.BLANK;
        } else {
            return _InitAuditName;
        }
    }

    @Override
    public void setInitAuditName(String InitAuditName) {
        _columnBitmask |= INITAUDITNAME_COLUMN_BITMASK;

        if (_originalInitAuditName == null) {
            _originalInitAuditName = _InitAuditName;
        }

        _InitAuditName = InitAuditName;
    }

    public String getOriginalInitAuditName() {
        return GetterUtil.getString(_originalInitAuditName);
    }

    @Override
    public Date getStartDate() {
        return _StartDate;
    }

    @Override
    public void setStartDate(Date StartDate) {
        _StartDate = StartDate;
    }

    @Override
    public Date getEndDate() {
        return _EndDate;
    }

    @Override
    public void setEndDate(Date EndDate) {
        _EndDate = EndDate;
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

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
            InitAudit.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public InitAudit toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (InitAudit) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        InitAuditImpl initAuditImpl = new InitAuditImpl();

        initAuditImpl.setInitAuditId(getInitAuditId());
        initAuditImpl.setInitAuditName(getInitAuditName());
        initAuditImpl.setStartDate(getStartDate());
        initAuditImpl.setEndDate(getEndDate());
        initAuditImpl.setCompanyId(getCompanyId());
        initAuditImpl.setGroupId(getGroupId());
        initAuditImpl.setUserId(getUserId());
        initAuditImpl.setCreateDate(getCreateDate());
        initAuditImpl.setModifiedDate(getModifiedDate());

        initAuditImpl.resetOriginalValues();

        return initAuditImpl;
    }

    @Override
    public int compareTo(InitAudit initAudit) {
        long primaryKey = initAudit.getPrimaryKey();

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

        if (!(obj instanceof InitAudit)) {
            return false;
        }

        InitAudit initAudit = (InitAudit) obj;

        long primaryKey = initAudit.getPrimaryKey();

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
        InitAuditModelImpl initAuditModelImpl = this;

        initAuditModelImpl._originalInitAuditId = initAuditModelImpl._InitAuditId;

        initAuditModelImpl._setOriginalInitAuditId = false;

        initAuditModelImpl._originalInitAuditName = initAuditModelImpl._InitAuditName;

        initAuditModelImpl._originalGroupId = initAuditModelImpl._groupId;

        initAuditModelImpl._setOriginalGroupId = false;

        initAuditModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<InitAudit> toCacheModel() {
        InitAuditCacheModel initAuditCacheModel = new InitAuditCacheModel();

        initAuditCacheModel.InitAuditId = getInitAuditId();

        initAuditCacheModel.InitAuditName = getInitAuditName();

        String InitAuditName = initAuditCacheModel.InitAuditName;

        if ((InitAuditName != null) && (InitAuditName.length() == 0)) {
            initAuditCacheModel.InitAuditName = null;
        }

        Date StartDate = getStartDate();

        if (StartDate != null) {
            initAuditCacheModel.StartDate = StartDate.getTime();
        } else {
            initAuditCacheModel.StartDate = Long.MIN_VALUE;
        }

        Date EndDate = getEndDate();

        if (EndDate != null) {
            initAuditCacheModel.EndDate = EndDate.getTime();
        } else {
            initAuditCacheModel.EndDate = Long.MIN_VALUE;
        }

        initAuditCacheModel.companyId = getCompanyId();

        initAuditCacheModel.groupId = getGroupId();

        initAuditCacheModel.userId = getUserId();

        Date createDate = getCreateDate();

        if (createDate != null) {
            initAuditCacheModel.createDate = createDate.getTime();
        } else {
            initAuditCacheModel.createDate = Long.MIN_VALUE;
        }

        Date modifiedDate = getModifiedDate();

        if (modifiedDate != null) {
            initAuditCacheModel.modifiedDate = modifiedDate.getTime();
        } else {
            initAuditCacheModel.modifiedDate = Long.MIN_VALUE;
        }

        return initAuditCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{InitAuditId=");
        sb.append(getInitAuditId());
        sb.append(", InitAuditName=");
        sb.append(getInitAuditName());
        sb.append(", StartDate=");
        sb.append(getStartDate());
        sb.append(", EndDate=");
        sb.append(getEndDate());
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
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(31);

        sb.append("<model><model-name>");
        sb.append("syneren.qms.audit.model.InitAudit");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>InitAuditId</column-name><column-value><![CDATA[");
        sb.append(getInitAuditId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>InitAuditName</column-name><column-value><![CDATA[");
        sb.append(getInitAuditName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>StartDate</column-name><column-value><![CDATA[");
        sb.append(getStartDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>EndDate</column-name><column-value><![CDATA[");
        sb.append(getEndDate());
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

        sb.append("</model>");

        return sb.toString();
    }
}
