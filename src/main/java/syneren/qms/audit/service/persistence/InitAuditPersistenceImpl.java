package syneren.qms.audit.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.security.permission.InlineSQLHelperUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import syneren.qms.audit.NoSuchInitAuditException;
import syneren.qms.audit.model.InitAudit;
import syneren.qms.audit.model.impl.InitAuditImpl;
import syneren.qms.audit.model.impl.InitAuditModelImpl;
import syneren.qms.audit.service.persistence.InitAuditPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the init audit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author anguyen
 * @see InitAuditPersistence
 * @see InitAuditUtil
 * @generated
 */
public class InitAuditPersistenceImpl extends BasePersistenceImpl<InitAudit>
    implements InitAuditPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link InitAuditUtil} to access the init audit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = InitAuditImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(InitAuditModelImpl.ENTITY_CACHE_ENABLED,
            InitAuditModelImpl.FINDER_CACHE_ENABLED, InitAuditImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(InitAuditModelImpl.ENTITY_CACHE_ENABLED,
            InitAuditModelImpl.FINDER_CACHE_ENABLED, InitAuditImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(InitAuditModelImpl.ENTITY_CACHE_ENABLED,
            InitAuditModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(InitAuditModelImpl.ENTITY_CACHE_ENABLED,
            InitAuditModelImpl.FINDER_CACHE_ENABLED, InitAuditImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
        new FinderPath(InitAuditModelImpl.ENTITY_CACHE_ENABLED,
            InitAuditModelImpl.FINDER_CACHE_ENABLED, InitAuditImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
            new String[] { Long.class.getName() },
            InitAuditModelImpl.GROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(InitAuditModelImpl.ENTITY_CACHE_ENABLED,
            InitAuditModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "initAudit.groupId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_AUDITID = new FinderPath(InitAuditModelImpl.ENTITY_CACHE_ENABLED,
            InitAuditModelImpl.FINDER_CACHE_ENABLED, InitAuditImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByAuditId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AUDITID =
        new FinderPath(InitAuditModelImpl.ENTITY_CACHE_ENABLED,
            InitAuditModelImpl.FINDER_CACHE_ENABLED, InitAuditImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByAuditId",
            new String[] { Long.class.getName() },
            InitAuditModelImpl.INITAUDITID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_AUDITID = new FinderPath(InitAuditModelImpl.ENTITY_CACHE_ENABLED,
            InitAuditModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByAuditId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_AUDITID_INITAUDITID_2 = "initAudit.InitAuditId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_AUDITNAME =
        new FinderPath(InitAuditModelImpl.ENTITY_CACHE_ENABLED,
            InitAuditModelImpl.FINDER_CACHE_ENABLED, InitAuditImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByAuditName",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AUDITNAME =
        new FinderPath(InitAuditModelImpl.ENTITY_CACHE_ENABLED,
            InitAuditModelImpl.FINDER_CACHE_ENABLED, InitAuditImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByAuditName",
            new String[] { String.class.getName() },
            InitAuditModelImpl.INITAUDITNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_AUDITNAME = new FinderPath(InitAuditModelImpl.ENTITY_CACHE_ENABLED,
            InitAuditModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByAuditName",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_AUDITNAME_INITAUDITNAME_1 = "initAudit.InitAuditName IS NULL";
    private static final String _FINDER_COLUMN_AUDITNAME_INITAUDITNAME_2 = "initAudit.InitAuditName = ?";
    private static final String _FINDER_COLUMN_AUDITNAME_INITAUDITNAME_3 = "(initAudit.InitAuditName IS NULL OR initAudit.InitAuditName = '')";
    private static final String _SQL_SELECT_INITAUDIT = "SELECT initAudit FROM InitAudit initAudit";
    private static final String _SQL_SELECT_INITAUDIT_WHERE = "SELECT initAudit FROM InitAudit initAudit WHERE ";
    private static final String _SQL_COUNT_INITAUDIT = "SELECT COUNT(initAudit) FROM InitAudit initAudit";
    private static final String _SQL_COUNT_INITAUDIT_WHERE = "SELECT COUNT(initAudit) FROM InitAudit initAudit WHERE ";
    private static final String _FILTER_ENTITY_TABLE_FILTER_PK_COLUMN = "initAudit.InitAuditId";
    private static final String _FILTER_SQL_SELECT_INITAUDIT_WHERE = "SELECT DISTINCT {initAudit.*} FROM InitAudit initAudit WHERE ";
    private static final String _FILTER_SQL_SELECT_INITAUDIT_NO_INLINE_DISTINCT_WHERE_1 =
        "SELECT {InitAudit.*} FROM (SELECT DISTINCT initAudit.InitAuditId FROM InitAudit initAudit WHERE ";
    private static final String _FILTER_SQL_SELECT_INITAUDIT_NO_INLINE_DISTINCT_WHERE_2 =
        ") TEMP_TABLE INNER JOIN InitAudit ON TEMP_TABLE.InitAuditId = InitAudit.InitAuditId";
    private static final String _FILTER_SQL_COUNT_INITAUDIT_WHERE = "SELECT COUNT(DISTINCT initAudit.InitAuditId) AS COUNT_VALUE FROM InitAudit initAudit WHERE ";
    private static final String _FILTER_ENTITY_ALIAS = "initAudit";
    private static final String _FILTER_ENTITY_TABLE = "InitAudit";
    private static final String _ORDER_BY_ENTITY_ALIAS = "initAudit.";
    private static final String _ORDER_BY_ENTITY_TABLE = "InitAudit.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No InitAudit exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No InitAudit exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(InitAuditPersistenceImpl.class);
    private static InitAudit _nullInitAudit = new InitAuditImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<InitAudit> toCacheModel() {
                return _nullInitAuditCacheModel;
            }
        };

    private static CacheModel<InitAudit> _nullInitAuditCacheModel = new CacheModel<InitAudit>() {
            @Override
            public InitAudit toEntityModel() {
                return _nullInitAudit;
            }
        };

    public InitAuditPersistenceImpl() {
        setModelClass(InitAudit.class);
    }

    /**
     * Returns all the init audits where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the matching init audits
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<InitAudit> findByGroupId(long groupId)
        throws SystemException {
        return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the init audits where groupId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.InitAuditModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param start the lower bound of the range of init audits
     * @param end the upper bound of the range of init audits (not inclusive)
     * @return the range of matching init audits
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<InitAudit> findByGroupId(long groupId, int start, int end)
        throws SystemException {
        return findByGroupId(groupId, start, end, null);
    }

    /**
     * Returns an ordered range of all the init audits where groupId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.InitAuditModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param start the lower bound of the range of init audits
     * @param end the upper bound of the range of init audits (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching init audits
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<InitAudit> findByGroupId(long groupId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
            finderArgs = new Object[] { groupId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
            finderArgs = new Object[] { groupId, start, end, orderByComparator };
        }

        List<InitAudit> list = (List<InitAudit>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (InitAudit initAudit : list) {
                if ((groupId != initAudit.getGroupId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_INITAUDIT_WHERE);

            query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(InitAuditModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (!pagination) {
                    list = (List<InitAudit>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<InitAudit>(list);
                } else {
                    list = (List<InitAudit>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first init audit in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching init audit
     * @throws syneren.qms.audit.NoSuchInitAuditException if a matching init audit could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public InitAudit findByGroupId_First(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchInitAuditException, SystemException {
        InitAudit initAudit = fetchByGroupId_First(groupId, orderByComparator);

        if (initAudit != null) {
            return initAudit;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchInitAuditException(msg.toString());
    }

    /**
     * Returns the first init audit in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching init audit, or <code>null</code> if a matching init audit could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public InitAudit fetchByGroupId_First(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        List<InitAudit> list = findByGroupId(groupId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last init audit in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching init audit
     * @throws syneren.qms.audit.NoSuchInitAuditException if a matching init audit could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public InitAudit findByGroupId_Last(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchInitAuditException, SystemException {
        InitAudit initAudit = fetchByGroupId_Last(groupId, orderByComparator);

        if (initAudit != null) {
            return initAudit;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchInitAuditException(msg.toString());
    }

    /**
     * Returns the last init audit in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching init audit, or <code>null</code> if a matching init audit could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public InitAudit fetchByGroupId_Last(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByGroupId(groupId);

        if (count == 0) {
            return null;
        }

        List<InitAudit> list = findByGroupId(groupId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the init audits before and after the current init audit in the ordered set where groupId = &#63;.
     *
     * @param InitAuditId the primary key of the current init audit
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next init audit
     * @throws syneren.qms.audit.NoSuchInitAuditException if a init audit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public InitAudit[] findByGroupId_PrevAndNext(long InitAuditId,
        long groupId, OrderByComparator orderByComparator)
        throws NoSuchInitAuditException, SystemException {
        InitAudit initAudit = findByPrimaryKey(InitAuditId);

        Session session = null;

        try {
            session = openSession();

            InitAudit[] array = new InitAuditImpl[3];

            array[0] = getByGroupId_PrevAndNext(session, initAudit, groupId,
                    orderByComparator, true);

            array[1] = initAudit;

            array[2] = getByGroupId_PrevAndNext(session, initAudit, groupId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected InitAudit getByGroupId_PrevAndNext(Session session,
        InitAudit initAudit, long groupId, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_INITAUDIT_WHERE);

        query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(InitAuditModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(initAudit);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<InitAudit> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Returns all the init audits that the user has permission to view where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the matching init audits that the user has permission to view
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<InitAudit> filterFindByGroupId(long groupId)
        throws SystemException {
        return filterFindByGroupId(groupId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the init audits that the user has permission to view where groupId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.InitAuditModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param start the lower bound of the range of init audits
     * @param end the upper bound of the range of init audits (not inclusive)
     * @return the range of matching init audits that the user has permission to view
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<InitAudit> filterFindByGroupId(long groupId, int start, int end)
        throws SystemException {
        return filterFindByGroupId(groupId, start, end, null);
    }

    /**
     * Returns an ordered range of all the init audits that the user has permissions to view where groupId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.InitAuditModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param start the lower bound of the range of init audits
     * @param end the upper bound of the range of init audits (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching init audits that the user has permission to view
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<InitAudit> filterFindByGroupId(long groupId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        if (!InlineSQLHelperUtil.isEnabled(groupId)) {
            return findByGroupId(groupId, start, end, orderByComparator);
        }

        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(3 +
                    (orderByComparator.getOrderByFields().length * 3));
        } else {
            query = new StringBundler(3);
        }

        if (getDB().isSupportsInlineDistinct()) {
            query.append(_FILTER_SQL_SELECT_INITAUDIT_WHERE);
        } else {
            query.append(_FILTER_SQL_SELECT_INITAUDIT_NO_INLINE_DISTINCT_WHERE_1);
        }

        query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

        if (!getDB().isSupportsInlineDistinct()) {
            query.append(_FILTER_SQL_SELECT_INITAUDIT_NO_INLINE_DISTINCT_WHERE_2);
        }

        if (orderByComparator != null) {
            if (getDB().isSupportsInlineDistinct()) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator, true);
            } else {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_TABLE,
                    orderByComparator, true);
            }
        } else {
            if (getDB().isSupportsInlineDistinct()) {
                query.append(InitAuditModelImpl.ORDER_BY_JPQL);
            } else {
                query.append(InitAuditModelImpl.ORDER_BY_SQL);
            }
        }

        String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
                InitAudit.class.getName(),
                _FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

        Session session = null;

        try {
            session = openSession();

            SQLQuery q = session.createSQLQuery(sql);

            if (getDB().isSupportsInlineDistinct()) {
                q.addEntity(_FILTER_ENTITY_ALIAS, InitAuditImpl.class);
            } else {
                q.addEntity(_FILTER_ENTITY_TABLE, InitAuditImpl.class);
            }

            QueryPos qPos = QueryPos.getInstance(q);

            qPos.add(groupId);

            return (List<InitAudit>) QueryUtil.list(q, getDialect(), start, end);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    /**
     * Returns the init audits before and after the current init audit in the ordered set of init audits that the user has permission to view where groupId = &#63;.
     *
     * @param InitAuditId the primary key of the current init audit
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next init audit
     * @throws syneren.qms.audit.NoSuchInitAuditException if a init audit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public InitAudit[] filterFindByGroupId_PrevAndNext(long InitAuditId,
        long groupId, OrderByComparator orderByComparator)
        throws NoSuchInitAuditException, SystemException {
        if (!InlineSQLHelperUtil.isEnabled(groupId)) {
            return findByGroupId_PrevAndNext(InitAuditId, groupId,
                orderByComparator);
        }

        InitAudit initAudit = findByPrimaryKey(InitAuditId);

        Session session = null;

        try {
            session = openSession();

            InitAudit[] array = new InitAuditImpl[3];

            array[0] = filterGetByGroupId_PrevAndNext(session, initAudit,
                    groupId, orderByComparator, true);

            array[1] = initAudit;

            array[2] = filterGetByGroupId_PrevAndNext(session, initAudit,
                    groupId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected InitAudit filterGetByGroupId_PrevAndNext(Session session,
        InitAudit initAudit, long groupId, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        if (getDB().isSupportsInlineDistinct()) {
            query.append(_FILTER_SQL_SELECT_INITAUDIT_WHERE);
        } else {
            query.append(_FILTER_SQL_SELECT_INITAUDIT_NO_INLINE_DISTINCT_WHERE_1);
        }

        query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

        if (!getDB().isSupportsInlineDistinct()) {
            query.append(_FILTER_SQL_SELECT_INITAUDIT_NO_INLINE_DISTINCT_WHERE_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                if (getDB().isSupportsInlineDistinct()) {
                    query.append(_ORDER_BY_ENTITY_ALIAS);
                } else {
                    query.append(_ORDER_BY_ENTITY_TABLE);
                }

                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                if (getDB().isSupportsInlineDistinct()) {
                    query.append(_ORDER_BY_ENTITY_ALIAS);
                } else {
                    query.append(_ORDER_BY_ENTITY_TABLE);
                }

                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            if (getDB().isSupportsInlineDistinct()) {
                query.append(InitAuditModelImpl.ORDER_BY_JPQL);
            } else {
                query.append(InitAuditModelImpl.ORDER_BY_SQL);
            }
        }

        String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
                InitAudit.class.getName(),
                _FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

        SQLQuery q = session.createSQLQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        if (getDB().isSupportsInlineDistinct()) {
            q.addEntity(_FILTER_ENTITY_ALIAS, InitAuditImpl.class);
        } else {
            q.addEntity(_FILTER_ENTITY_TABLE, InitAuditImpl.class);
        }

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(initAudit);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<InitAudit> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the init audits where groupId = &#63; from the database.
     *
     * @param groupId the group ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByGroupId(long groupId) throws SystemException {
        for (InitAudit initAudit : findByGroupId(groupId, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(initAudit);
        }
    }

    /**
     * Returns the number of init audits where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the number of matching init audits
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByGroupId(long groupId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

        Object[] finderArgs = new Object[] { groupId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_INITAUDIT_WHERE);

            query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the number of init audits that the user has permission to view where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the number of matching init audits that the user has permission to view
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int filterCountByGroupId(long groupId) throws SystemException {
        if (!InlineSQLHelperUtil.isEnabled(groupId)) {
            return countByGroupId(groupId);
        }

        StringBundler query = new StringBundler(2);

        query.append(_FILTER_SQL_COUNT_INITAUDIT_WHERE);

        query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

        String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
                InitAudit.class.getName(),
                _FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

        Session session = null;

        try {
            session = openSession();

            SQLQuery q = session.createSQLQuery(sql);

            q.addScalar(COUNT_COLUMN_NAME,
                com.liferay.portal.kernel.dao.orm.Type.LONG);

            QueryPos qPos = QueryPos.getInstance(q);

            qPos.add(groupId);

            Long count = (Long) q.uniqueResult();

            return count.intValue();
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    /**
     * Returns all the init audits where InitAuditId = &#63;.
     *
     * @param InitAuditId the init audit ID
     * @return the matching init audits
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<InitAudit> findByAuditId(long InitAuditId)
        throws SystemException {
        return findByAuditId(InitAuditId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the init audits where InitAuditId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.InitAuditModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param InitAuditId the init audit ID
     * @param start the lower bound of the range of init audits
     * @param end the upper bound of the range of init audits (not inclusive)
     * @return the range of matching init audits
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<InitAudit> findByAuditId(long InitAuditId, int start, int end)
        throws SystemException {
        return findByAuditId(InitAuditId, start, end, null);
    }

    /**
     * Returns an ordered range of all the init audits where InitAuditId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.InitAuditModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param InitAuditId the init audit ID
     * @param start the lower bound of the range of init audits
     * @param end the upper bound of the range of init audits (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching init audits
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<InitAudit> findByAuditId(long InitAuditId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AUDITID;
            finderArgs = new Object[] { InitAuditId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_AUDITID;
            finderArgs = new Object[] { InitAuditId, start, end, orderByComparator };
        }

        List<InitAudit> list = (List<InitAudit>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (InitAudit initAudit : list) {
                if ((InitAuditId != initAudit.getInitAuditId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_INITAUDIT_WHERE);

            query.append(_FINDER_COLUMN_AUDITID_INITAUDITID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(InitAuditModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(InitAuditId);

                if (!pagination) {
                    list = (List<InitAudit>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<InitAudit>(list);
                } else {
                    list = (List<InitAudit>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first init audit in the ordered set where InitAuditId = &#63;.
     *
     * @param InitAuditId the init audit ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching init audit
     * @throws syneren.qms.audit.NoSuchInitAuditException if a matching init audit could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public InitAudit findByAuditId_First(long InitAuditId,
        OrderByComparator orderByComparator)
        throws NoSuchInitAuditException, SystemException {
        InitAudit initAudit = fetchByAuditId_First(InitAuditId,
                orderByComparator);

        if (initAudit != null) {
            return initAudit;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("InitAuditId=");
        msg.append(InitAuditId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchInitAuditException(msg.toString());
    }

    /**
     * Returns the first init audit in the ordered set where InitAuditId = &#63;.
     *
     * @param InitAuditId the init audit ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching init audit, or <code>null</code> if a matching init audit could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public InitAudit fetchByAuditId_First(long InitAuditId,
        OrderByComparator orderByComparator) throws SystemException {
        List<InitAudit> list = findByAuditId(InitAuditId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last init audit in the ordered set where InitAuditId = &#63;.
     *
     * @param InitAuditId the init audit ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching init audit
     * @throws syneren.qms.audit.NoSuchInitAuditException if a matching init audit could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public InitAudit findByAuditId_Last(long InitAuditId,
        OrderByComparator orderByComparator)
        throws NoSuchInitAuditException, SystemException {
        InitAudit initAudit = fetchByAuditId_Last(InitAuditId, orderByComparator);

        if (initAudit != null) {
            return initAudit;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("InitAuditId=");
        msg.append(InitAuditId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchInitAuditException(msg.toString());
    }

    /**
     * Returns the last init audit in the ordered set where InitAuditId = &#63;.
     *
     * @param InitAuditId the init audit ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching init audit, or <code>null</code> if a matching init audit could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public InitAudit fetchByAuditId_Last(long InitAuditId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByAuditId(InitAuditId);

        if (count == 0) {
            return null;
        }

        List<InitAudit> list = findByAuditId(InitAuditId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Removes all the init audits where InitAuditId = &#63; from the database.
     *
     * @param InitAuditId the init audit ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByAuditId(long InitAuditId) throws SystemException {
        for (InitAudit initAudit : findByAuditId(InitAuditId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(initAudit);
        }
    }

    /**
     * Returns the number of init audits where InitAuditId = &#63;.
     *
     * @param InitAuditId the init audit ID
     * @return the number of matching init audits
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByAuditId(long InitAuditId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_AUDITID;

        Object[] finderArgs = new Object[] { InitAuditId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_INITAUDIT_WHERE);

            query.append(_FINDER_COLUMN_AUDITID_INITAUDITID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(InitAuditId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the init audits where InitAuditName = &#63;.
     *
     * @param InitAuditName the init audit name
     * @return the matching init audits
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<InitAudit> findByAuditName(String InitAuditName)
        throws SystemException {
        return findByAuditName(InitAuditName, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the init audits where InitAuditName = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.InitAuditModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param InitAuditName the init audit name
     * @param start the lower bound of the range of init audits
     * @param end the upper bound of the range of init audits (not inclusive)
     * @return the range of matching init audits
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<InitAudit> findByAuditName(String InitAuditName, int start,
        int end) throws SystemException {
        return findByAuditName(InitAuditName, start, end, null);
    }

    /**
     * Returns an ordered range of all the init audits where InitAuditName = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.InitAuditModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param InitAuditName the init audit name
     * @param start the lower bound of the range of init audits
     * @param end the upper bound of the range of init audits (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching init audits
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<InitAudit> findByAuditName(String InitAuditName, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AUDITNAME;
            finderArgs = new Object[] { InitAuditName };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_AUDITNAME;
            finderArgs = new Object[] {
                    InitAuditName,
                    
                    start, end, orderByComparator
                };
        }

        List<InitAudit> list = (List<InitAudit>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (InitAudit initAudit : list) {
                if (!Validator.equals(InitAuditName,
                            initAudit.getInitAuditName())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_INITAUDIT_WHERE);

            boolean bindInitAuditName = false;

            if (InitAuditName == null) {
                query.append(_FINDER_COLUMN_AUDITNAME_INITAUDITNAME_1);
            } else if (InitAuditName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_AUDITNAME_INITAUDITNAME_3);
            } else {
                bindInitAuditName = true;

                query.append(_FINDER_COLUMN_AUDITNAME_INITAUDITNAME_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(InitAuditModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindInitAuditName) {
                    qPos.add(InitAuditName);
                }

                if (!pagination) {
                    list = (List<InitAudit>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<InitAudit>(list);
                } else {
                    list = (List<InitAudit>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first init audit in the ordered set where InitAuditName = &#63;.
     *
     * @param InitAuditName the init audit name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching init audit
     * @throws syneren.qms.audit.NoSuchInitAuditException if a matching init audit could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public InitAudit findByAuditName_First(String InitAuditName,
        OrderByComparator orderByComparator)
        throws NoSuchInitAuditException, SystemException {
        InitAudit initAudit = fetchByAuditName_First(InitAuditName,
                orderByComparator);

        if (initAudit != null) {
            return initAudit;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("InitAuditName=");
        msg.append(InitAuditName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchInitAuditException(msg.toString());
    }

    /**
     * Returns the first init audit in the ordered set where InitAuditName = &#63;.
     *
     * @param InitAuditName the init audit name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching init audit, or <code>null</code> if a matching init audit could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public InitAudit fetchByAuditName_First(String InitAuditName,
        OrderByComparator orderByComparator) throws SystemException {
        List<InitAudit> list = findByAuditName(InitAuditName, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last init audit in the ordered set where InitAuditName = &#63;.
     *
     * @param InitAuditName the init audit name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching init audit
     * @throws syneren.qms.audit.NoSuchInitAuditException if a matching init audit could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public InitAudit findByAuditName_Last(String InitAuditName,
        OrderByComparator orderByComparator)
        throws NoSuchInitAuditException, SystemException {
        InitAudit initAudit = fetchByAuditName_Last(InitAuditName,
                orderByComparator);

        if (initAudit != null) {
            return initAudit;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("InitAuditName=");
        msg.append(InitAuditName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchInitAuditException(msg.toString());
    }

    /**
     * Returns the last init audit in the ordered set where InitAuditName = &#63;.
     *
     * @param InitAuditName the init audit name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching init audit, or <code>null</code> if a matching init audit could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public InitAudit fetchByAuditName_Last(String InitAuditName,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByAuditName(InitAuditName);

        if (count == 0) {
            return null;
        }

        List<InitAudit> list = findByAuditName(InitAuditName, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the init audits before and after the current init audit in the ordered set where InitAuditName = &#63;.
     *
     * @param InitAuditId the primary key of the current init audit
     * @param InitAuditName the init audit name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next init audit
     * @throws syneren.qms.audit.NoSuchInitAuditException if a init audit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public InitAudit[] findByAuditName_PrevAndNext(long InitAuditId,
        String InitAuditName, OrderByComparator orderByComparator)
        throws NoSuchInitAuditException, SystemException {
        InitAudit initAudit = findByPrimaryKey(InitAuditId);

        Session session = null;

        try {
            session = openSession();

            InitAudit[] array = new InitAuditImpl[3];

            array[0] = getByAuditName_PrevAndNext(session, initAudit,
                    InitAuditName, orderByComparator, true);

            array[1] = initAudit;

            array[2] = getByAuditName_PrevAndNext(session, initAudit,
                    InitAuditName, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected InitAudit getByAuditName_PrevAndNext(Session session,
        InitAudit initAudit, String InitAuditName,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_INITAUDIT_WHERE);

        boolean bindInitAuditName = false;

        if (InitAuditName == null) {
            query.append(_FINDER_COLUMN_AUDITNAME_INITAUDITNAME_1);
        } else if (InitAuditName.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_AUDITNAME_INITAUDITNAME_3);
        } else {
            bindInitAuditName = true;

            query.append(_FINDER_COLUMN_AUDITNAME_INITAUDITNAME_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(InitAuditModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindInitAuditName) {
            qPos.add(InitAuditName);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(initAudit);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<InitAudit> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the init audits where InitAuditName = &#63; from the database.
     *
     * @param InitAuditName the init audit name
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByAuditName(String InitAuditName)
        throws SystemException {
        for (InitAudit initAudit : findByAuditName(InitAuditName,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(initAudit);
        }
    }

    /**
     * Returns the number of init audits where InitAuditName = &#63;.
     *
     * @param InitAuditName the init audit name
     * @return the number of matching init audits
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByAuditName(String InitAuditName) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_AUDITNAME;

        Object[] finderArgs = new Object[] { InitAuditName };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_INITAUDIT_WHERE);

            boolean bindInitAuditName = false;

            if (InitAuditName == null) {
                query.append(_FINDER_COLUMN_AUDITNAME_INITAUDITNAME_1);
            } else if (InitAuditName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_AUDITNAME_INITAUDITNAME_3);
            } else {
                bindInitAuditName = true;

                query.append(_FINDER_COLUMN_AUDITNAME_INITAUDITNAME_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindInitAuditName) {
                    qPos.add(InitAuditName);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the init audit in the entity cache if it is enabled.
     *
     * @param initAudit the init audit
     */
    @Override
    public void cacheResult(InitAudit initAudit) {
        EntityCacheUtil.putResult(InitAuditModelImpl.ENTITY_CACHE_ENABLED,
            InitAuditImpl.class, initAudit.getPrimaryKey(), initAudit);

        initAudit.resetOriginalValues();
    }

    /**
     * Caches the init audits in the entity cache if it is enabled.
     *
     * @param initAudits the init audits
     */
    @Override
    public void cacheResult(List<InitAudit> initAudits) {
        for (InitAudit initAudit : initAudits) {
            if (EntityCacheUtil.getResult(
                        InitAuditModelImpl.ENTITY_CACHE_ENABLED,
                        InitAuditImpl.class, initAudit.getPrimaryKey()) == null) {
                cacheResult(initAudit);
            } else {
                initAudit.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all init audits.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(InitAuditImpl.class.getName());
        }

        EntityCacheUtil.clearCache(InitAuditImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the init audit.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(InitAudit initAudit) {
        EntityCacheUtil.removeResult(InitAuditModelImpl.ENTITY_CACHE_ENABLED,
            InitAuditImpl.class, initAudit.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<InitAudit> initAudits) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (InitAudit initAudit : initAudits) {
            EntityCacheUtil.removeResult(InitAuditModelImpl.ENTITY_CACHE_ENABLED,
                InitAuditImpl.class, initAudit.getPrimaryKey());
        }
    }

    /**
     * Creates a new init audit with the primary key. Does not add the init audit to the database.
     *
     * @param InitAuditId the primary key for the new init audit
     * @return the new init audit
     */
    @Override
    public InitAudit create(long InitAuditId) {
        InitAudit initAudit = new InitAuditImpl();

        initAudit.setNew(true);
        initAudit.setPrimaryKey(InitAuditId);

        return initAudit;
    }

    /**
     * Removes the init audit with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param InitAuditId the primary key of the init audit
     * @return the init audit that was removed
     * @throws syneren.qms.audit.NoSuchInitAuditException if a init audit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public InitAudit remove(long InitAuditId)
        throws NoSuchInitAuditException, SystemException {
        return remove((Serializable) InitAuditId);
    }

    /**
     * Removes the init audit with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the init audit
     * @return the init audit that was removed
     * @throws syneren.qms.audit.NoSuchInitAuditException if a init audit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public InitAudit remove(Serializable primaryKey)
        throws NoSuchInitAuditException, SystemException {
        Session session = null;

        try {
            session = openSession();

            InitAudit initAudit = (InitAudit) session.get(InitAuditImpl.class,
                    primaryKey);

            if (initAudit == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchInitAuditException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(initAudit);
        } catch (NoSuchInitAuditException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected InitAudit removeImpl(InitAudit initAudit)
        throws SystemException {
        initAudit = toUnwrappedModel(initAudit);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(initAudit)) {
                initAudit = (InitAudit) session.get(InitAuditImpl.class,
                        initAudit.getPrimaryKeyObj());
            }

            if (initAudit != null) {
                session.delete(initAudit);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (initAudit != null) {
            clearCache(initAudit);
        }

        return initAudit;
    }

    @Override
    public InitAudit updateImpl(syneren.qms.audit.model.InitAudit initAudit)
        throws SystemException {
        initAudit = toUnwrappedModel(initAudit);

        boolean isNew = initAudit.isNew();

        InitAuditModelImpl initAuditModelImpl = (InitAuditModelImpl) initAudit;

        Session session = null;

        try {
            session = openSession();

            if (initAudit.isNew()) {
                session.save(initAudit);

                initAudit.setNew(false);
            } else {
                session.merge(initAudit);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !InitAuditModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((initAuditModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        initAuditModelImpl.getOriginalGroupId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);

                args = new Object[] { initAuditModelImpl.getGroupId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);
            }

            if ((initAuditModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AUDITID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        initAuditModelImpl.getOriginalInitAuditId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_AUDITID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AUDITID,
                    args);

                args = new Object[] { initAuditModelImpl.getInitAuditId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_AUDITID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AUDITID,
                    args);
            }

            if ((initAuditModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AUDITNAME.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        initAuditModelImpl.getOriginalInitAuditName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_AUDITNAME,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AUDITNAME,
                    args);

                args = new Object[] { initAuditModelImpl.getInitAuditName() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_AUDITNAME,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AUDITNAME,
                    args);
            }
        }

        EntityCacheUtil.putResult(InitAuditModelImpl.ENTITY_CACHE_ENABLED,
            InitAuditImpl.class, initAudit.getPrimaryKey(), initAudit);

        return initAudit;
    }

    protected InitAudit toUnwrappedModel(InitAudit initAudit) {
        if (initAudit instanceof InitAuditImpl) {
            return initAudit;
        }

        InitAuditImpl initAuditImpl = new InitAuditImpl();

        initAuditImpl.setNew(initAudit.isNew());
        initAuditImpl.setPrimaryKey(initAudit.getPrimaryKey());

        initAuditImpl.setInitAuditId(initAudit.getInitAuditId());
        initAuditImpl.setInitAuditName(initAudit.getInitAuditName());
        initAuditImpl.setStartDate(initAudit.getStartDate());
        initAuditImpl.setEndDate(initAudit.getEndDate());
        initAuditImpl.setCompanyId(initAudit.getCompanyId());
        initAuditImpl.setGroupId(initAudit.getGroupId());
        initAuditImpl.setUserId(initAudit.getUserId());
        initAuditImpl.setCreateDate(initAudit.getCreateDate());
        initAuditImpl.setModifiedDate(initAudit.getModifiedDate());

        return initAuditImpl;
    }

    /**
     * Returns the init audit with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the init audit
     * @return the init audit
     * @throws syneren.qms.audit.NoSuchInitAuditException if a init audit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public InitAudit findByPrimaryKey(Serializable primaryKey)
        throws NoSuchInitAuditException, SystemException {
        InitAudit initAudit = fetchByPrimaryKey(primaryKey);

        if (initAudit == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchInitAuditException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return initAudit;
    }

    /**
     * Returns the init audit with the primary key or throws a {@link syneren.qms.audit.NoSuchInitAuditException} if it could not be found.
     *
     * @param InitAuditId the primary key of the init audit
     * @return the init audit
     * @throws syneren.qms.audit.NoSuchInitAuditException if a init audit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public InitAudit findByPrimaryKey(long InitAuditId)
        throws NoSuchInitAuditException, SystemException {
        return findByPrimaryKey((Serializable) InitAuditId);
    }

    /**
     * Returns the init audit with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the init audit
     * @return the init audit, or <code>null</code> if a init audit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public InitAudit fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        InitAudit initAudit = (InitAudit) EntityCacheUtil.getResult(InitAuditModelImpl.ENTITY_CACHE_ENABLED,
                InitAuditImpl.class, primaryKey);

        if (initAudit == _nullInitAudit) {
            return null;
        }

        if (initAudit == null) {
            Session session = null;

            try {
                session = openSession();

                initAudit = (InitAudit) session.get(InitAuditImpl.class,
                        primaryKey);

                if (initAudit != null) {
                    cacheResult(initAudit);
                } else {
                    EntityCacheUtil.putResult(InitAuditModelImpl.ENTITY_CACHE_ENABLED,
                        InitAuditImpl.class, primaryKey, _nullInitAudit);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(InitAuditModelImpl.ENTITY_CACHE_ENABLED,
                    InitAuditImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return initAudit;
    }

    /**
     * Returns the init audit with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param InitAuditId the primary key of the init audit
     * @return the init audit, or <code>null</code> if a init audit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public InitAudit fetchByPrimaryKey(long InitAuditId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) InitAuditId);
    }

    /**
     * Returns all the init audits.
     *
     * @return the init audits
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<InitAudit> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the init audits.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.InitAuditModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of init audits
     * @param end the upper bound of the range of init audits (not inclusive)
     * @return the range of init audits
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<InitAudit> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the init audits.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.InitAuditModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of init audits
     * @param end the upper bound of the range of init audits (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of init audits
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<InitAudit> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<InitAudit> list = (List<InitAudit>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_INITAUDIT);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_INITAUDIT;

                if (pagination) {
                    sql = sql.concat(InitAuditModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<InitAudit>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<InitAudit>(list);
                } else {
                    list = (List<InitAudit>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the init audits from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (InitAudit initAudit : findAll()) {
            remove(initAudit);
        }
    }

    /**
     * Returns the number of init audits.
     *
     * @return the number of init audits
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_INITAUDIT);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the init audit persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.syneren.qms.audit.model.InitAudit")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<InitAudit>> listenersList = new ArrayList<ModelListener<InitAudit>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<InitAudit>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(InitAuditImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
