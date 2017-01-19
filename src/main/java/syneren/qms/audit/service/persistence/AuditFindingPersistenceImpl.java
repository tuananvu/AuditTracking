package syneren.qms.audit.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import syneren.qms.audit.NoSuchAuditFindingException;
import syneren.qms.audit.model.AuditFinding;
import syneren.qms.audit.model.impl.AuditFindingImpl;
import syneren.qms.audit.model.impl.AuditFindingModelImpl;
import syneren.qms.audit.service.persistence.AuditFindingPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the audit finding service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author anguyen
 * @see AuditFindingPersistence
 * @see AuditFindingUtil
 * @generated
 */
public class AuditFindingPersistenceImpl extends BasePersistenceImpl<AuditFinding>
    implements AuditFindingPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link AuditFindingUtil} to access the audit finding persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = AuditFindingImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AuditFindingModelImpl.ENTITY_CACHE_ENABLED,
            AuditFindingModelImpl.FINDER_CACHE_ENABLED, AuditFindingImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AuditFindingModelImpl.ENTITY_CACHE_ENABLED,
            AuditFindingModelImpl.FINDER_CACHE_ENABLED, AuditFindingImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AuditFindingModelImpl.ENTITY_CACHE_ENABLED,
            AuditFindingModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(AuditFindingModelImpl.ENTITY_CACHE_ENABLED,
            AuditFindingModelImpl.FINDER_CACHE_ENABLED, AuditFindingImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
        new FinderPath(AuditFindingModelImpl.ENTITY_CACHE_ENABLED,
            AuditFindingModelImpl.FINDER_CACHE_ENABLED, AuditFindingImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
            new String[] { Long.class.getName() },
            AuditFindingModelImpl.GROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(AuditFindingModelImpl.ENTITY_CACHE_ENABLED,
            AuditFindingModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "auditFinding.groupId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FINDINGID =
        new FinderPath(AuditFindingModelImpl.ENTITY_CACHE_ENABLED,
            AuditFindingModelImpl.FINDER_CACHE_ENABLED, AuditFindingImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByFindingId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDINGID =
        new FinderPath(AuditFindingModelImpl.ENTITY_CACHE_ENABLED,
            AuditFindingModelImpl.FINDER_CACHE_ENABLED, AuditFindingImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByFindingId",
            new String[] { Long.class.getName() },
            AuditFindingModelImpl.FINDINGID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_FINDINGID = new FinderPath(AuditFindingModelImpl.ENTITY_CACHE_ENABLED,
            AuditFindingModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByFindingId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_FINDINGID_FINDINGID_2 = "auditFinding.FindingId = ?";
    private static final String _SQL_SELECT_AUDITFINDING = "SELECT auditFinding FROM AuditFinding auditFinding";
    private static final String _SQL_SELECT_AUDITFINDING_WHERE = "SELECT auditFinding FROM AuditFinding auditFinding WHERE ";
    private static final String _SQL_COUNT_AUDITFINDING = "SELECT COUNT(auditFinding) FROM AuditFinding auditFinding";
    private static final String _SQL_COUNT_AUDITFINDING_WHERE = "SELECT COUNT(auditFinding) FROM AuditFinding auditFinding WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "auditFinding.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AuditFinding exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AuditFinding exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(AuditFindingPersistenceImpl.class);
    private static AuditFinding _nullAuditFinding = new AuditFindingImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<AuditFinding> toCacheModel() {
                return _nullAuditFindingCacheModel;
            }
        };

    private static CacheModel<AuditFinding> _nullAuditFindingCacheModel = new CacheModel<AuditFinding>() {
            @Override
            public AuditFinding toEntityModel() {
                return _nullAuditFinding;
            }
        };

    public AuditFindingPersistenceImpl() {
        setModelClass(AuditFinding.class);
    }

    /**
     * Returns all the audit findings where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the matching audit findings
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AuditFinding> findByGroupId(long groupId)
        throws SystemException {
        return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the audit findings where groupId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditFindingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param start the lower bound of the range of audit findings
     * @param end the upper bound of the range of audit findings (not inclusive)
     * @return the range of matching audit findings
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AuditFinding> findByGroupId(long groupId, int start, int end)
        throws SystemException {
        return findByGroupId(groupId, start, end, null);
    }

    /**
     * Returns an ordered range of all the audit findings where groupId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditFindingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param start the lower bound of the range of audit findings
     * @param end the upper bound of the range of audit findings (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching audit findings
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AuditFinding> findByGroupId(long groupId, int start, int end,
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

        List<AuditFinding> list = (List<AuditFinding>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (AuditFinding auditFinding : list) {
                if ((groupId != auditFinding.getGroupId())) {
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

            query.append(_SQL_SELECT_AUDITFINDING_WHERE);

            query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(AuditFindingModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (!pagination) {
                    list = (List<AuditFinding>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<AuditFinding>(list);
                } else {
                    list = (List<AuditFinding>) QueryUtil.list(q, getDialect(),
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
     * Returns the first audit finding in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching audit finding
     * @throws syneren.qms.audit.NoSuchAuditFindingException if a matching audit finding could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditFinding findByGroupId_First(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchAuditFindingException, SystemException {
        AuditFinding auditFinding = fetchByGroupId_First(groupId,
                orderByComparator);

        if (auditFinding != null) {
            return auditFinding;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAuditFindingException(msg.toString());
    }

    /**
     * Returns the first audit finding in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching audit finding, or <code>null</code> if a matching audit finding could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditFinding fetchByGroupId_First(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        List<AuditFinding> list = findByGroupId(groupId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last audit finding in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching audit finding
     * @throws syneren.qms.audit.NoSuchAuditFindingException if a matching audit finding could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditFinding findByGroupId_Last(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchAuditFindingException, SystemException {
        AuditFinding auditFinding = fetchByGroupId_Last(groupId,
                orderByComparator);

        if (auditFinding != null) {
            return auditFinding;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAuditFindingException(msg.toString());
    }

    /**
     * Returns the last audit finding in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching audit finding, or <code>null</code> if a matching audit finding could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditFinding fetchByGroupId_Last(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByGroupId(groupId);

        if (count == 0) {
            return null;
        }

        List<AuditFinding> list = findByGroupId(groupId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the audit findings before and after the current audit finding in the ordered set where groupId = &#63;.
     *
     * @param FindingId the primary key of the current audit finding
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next audit finding
     * @throws syneren.qms.audit.NoSuchAuditFindingException if a audit finding with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditFinding[] findByGroupId_PrevAndNext(long FindingId,
        long groupId, OrderByComparator orderByComparator)
        throws NoSuchAuditFindingException, SystemException {
        AuditFinding auditFinding = findByPrimaryKey(FindingId);

        Session session = null;

        try {
            session = openSession();

            AuditFinding[] array = new AuditFindingImpl[3];

            array[0] = getByGroupId_PrevAndNext(session, auditFinding, groupId,
                    orderByComparator, true);

            array[1] = auditFinding;

            array[2] = getByGroupId_PrevAndNext(session, auditFinding, groupId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected AuditFinding getByGroupId_PrevAndNext(Session session,
        AuditFinding auditFinding, long groupId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_AUDITFINDING_WHERE);

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
            query.append(AuditFindingModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(auditFinding);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<AuditFinding> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the audit findings where groupId = &#63; from the database.
     *
     * @param groupId the group ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByGroupId(long groupId) throws SystemException {
        for (AuditFinding auditFinding : findByGroupId(groupId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(auditFinding);
        }
    }

    /**
     * Returns the number of audit findings where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the number of matching audit findings
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

            query.append(_SQL_COUNT_AUDITFINDING_WHERE);

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
     * Returns all the audit findings where FindingId = &#63;.
     *
     * @param FindingId the finding ID
     * @return the matching audit findings
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AuditFinding> findByFindingId(long FindingId)
        throws SystemException {
        return findByFindingId(FindingId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the audit findings where FindingId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditFindingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param FindingId the finding ID
     * @param start the lower bound of the range of audit findings
     * @param end the upper bound of the range of audit findings (not inclusive)
     * @return the range of matching audit findings
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AuditFinding> findByFindingId(long FindingId, int start, int end)
        throws SystemException {
        return findByFindingId(FindingId, start, end, null);
    }

    /**
     * Returns an ordered range of all the audit findings where FindingId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditFindingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param FindingId the finding ID
     * @param start the lower bound of the range of audit findings
     * @param end the upper bound of the range of audit findings (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching audit findings
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AuditFinding> findByFindingId(long FindingId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDINGID;
            finderArgs = new Object[] { FindingId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FINDINGID;
            finderArgs = new Object[] { FindingId, start, end, orderByComparator };
        }

        List<AuditFinding> list = (List<AuditFinding>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (AuditFinding auditFinding : list) {
                if ((FindingId != auditFinding.getFindingId())) {
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

            query.append(_SQL_SELECT_AUDITFINDING_WHERE);

            query.append(_FINDER_COLUMN_FINDINGID_FINDINGID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(AuditFindingModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(FindingId);

                if (!pagination) {
                    list = (List<AuditFinding>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<AuditFinding>(list);
                } else {
                    list = (List<AuditFinding>) QueryUtil.list(q, getDialect(),
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
     * Returns the first audit finding in the ordered set where FindingId = &#63;.
     *
     * @param FindingId the finding ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching audit finding
     * @throws syneren.qms.audit.NoSuchAuditFindingException if a matching audit finding could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditFinding findByFindingId_First(long FindingId,
        OrderByComparator orderByComparator)
        throws NoSuchAuditFindingException, SystemException {
        AuditFinding auditFinding = fetchByFindingId_First(FindingId,
                orderByComparator);

        if (auditFinding != null) {
            return auditFinding;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("FindingId=");
        msg.append(FindingId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAuditFindingException(msg.toString());
    }

    /**
     * Returns the first audit finding in the ordered set where FindingId = &#63;.
     *
     * @param FindingId the finding ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching audit finding, or <code>null</code> if a matching audit finding could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditFinding fetchByFindingId_First(long FindingId,
        OrderByComparator orderByComparator) throws SystemException {
        List<AuditFinding> list = findByFindingId(FindingId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last audit finding in the ordered set where FindingId = &#63;.
     *
     * @param FindingId the finding ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching audit finding
     * @throws syneren.qms.audit.NoSuchAuditFindingException if a matching audit finding could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditFinding findByFindingId_Last(long FindingId,
        OrderByComparator orderByComparator)
        throws NoSuchAuditFindingException, SystemException {
        AuditFinding auditFinding = fetchByFindingId_Last(FindingId,
                orderByComparator);

        if (auditFinding != null) {
            return auditFinding;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("FindingId=");
        msg.append(FindingId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAuditFindingException(msg.toString());
    }

    /**
     * Returns the last audit finding in the ordered set where FindingId = &#63;.
     *
     * @param FindingId the finding ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching audit finding, or <code>null</code> if a matching audit finding could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditFinding fetchByFindingId_Last(long FindingId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByFindingId(FindingId);

        if (count == 0) {
            return null;
        }

        List<AuditFinding> list = findByFindingId(FindingId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Removes all the audit findings where FindingId = &#63; from the database.
     *
     * @param FindingId the finding ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByFindingId(long FindingId) throws SystemException {
        for (AuditFinding auditFinding : findByFindingId(FindingId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(auditFinding);
        }
    }

    /**
     * Returns the number of audit findings where FindingId = &#63;.
     *
     * @param FindingId the finding ID
     * @return the number of matching audit findings
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByFindingId(long FindingId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_FINDINGID;

        Object[] finderArgs = new Object[] { FindingId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_AUDITFINDING_WHERE);

            query.append(_FINDER_COLUMN_FINDINGID_FINDINGID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(FindingId);

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
     * Caches the audit finding in the entity cache if it is enabled.
     *
     * @param auditFinding the audit finding
     */
    @Override
    public void cacheResult(AuditFinding auditFinding) {
        EntityCacheUtil.putResult(AuditFindingModelImpl.ENTITY_CACHE_ENABLED,
            AuditFindingImpl.class, auditFinding.getPrimaryKey(), auditFinding);

        auditFinding.resetOriginalValues();
    }

    /**
     * Caches the audit findings in the entity cache if it is enabled.
     *
     * @param auditFindings the audit findings
     */
    @Override
    public void cacheResult(List<AuditFinding> auditFindings) {
        for (AuditFinding auditFinding : auditFindings) {
            if (EntityCacheUtil.getResult(
                        AuditFindingModelImpl.ENTITY_CACHE_ENABLED,
                        AuditFindingImpl.class, auditFinding.getPrimaryKey()) == null) {
                cacheResult(auditFinding);
            } else {
                auditFinding.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all audit findings.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(AuditFindingImpl.class.getName());
        }

        EntityCacheUtil.clearCache(AuditFindingImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the audit finding.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(AuditFinding auditFinding) {
        EntityCacheUtil.removeResult(AuditFindingModelImpl.ENTITY_CACHE_ENABLED,
            AuditFindingImpl.class, auditFinding.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<AuditFinding> auditFindings) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (AuditFinding auditFinding : auditFindings) {
            EntityCacheUtil.removeResult(AuditFindingModelImpl.ENTITY_CACHE_ENABLED,
                AuditFindingImpl.class, auditFinding.getPrimaryKey());
        }
    }

    /**
     * Creates a new audit finding with the primary key. Does not add the audit finding to the database.
     *
     * @param FindingId the primary key for the new audit finding
     * @return the new audit finding
     */
    @Override
    public AuditFinding create(long FindingId) {
        AuditFinding auditFinding = new AuditFindingImpl();

        auditFinding.setNew(true);
        auditFinding.setPrimaryKey(FindingId);

        return auditFinding;
    }

    /**
     * Removes the audit finding with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param FindingId the primary key of the audit finding
     * @return the audit finding that was removed
     * @throws syneren.qms.audit.NoSuchAuditFindingException if a audit finding with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditFinding remove(long FindingId)
        throws NoSuchAuditFindingException, SystemException {
        return remove((Serializable) FindingId);
    }

    /**
     * Removes the audit finding with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the audit finding
     * @return the audit finding that was removed
     * @throws syneren.qms.audit.NoSuchAuditFindingException if a audit finding with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditFinding remove(Serializable primaryKey)
        throws NoSuchAuditFindingException, SystemException {
        Session session = null;

        try {
            session = openSession();

            AuditFinding auditFinding = (AuditFinding) session.get(AuditFindingImpl.class,
                    primaryKey);

            if (auditFinding == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchAuditFindingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(auditFinding);
        } catch (NoSuchAuditFindingException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected AuditFinding removeImpl(AuditFinding auditFinding)
        throws SystemException {
        auditFinding = toUnwrappedModel(auditFinding);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(auditFinding)) {
                auditFinding = (AuditFinding) session.get(AuditFindingImpl.class,
                        auditFinding.getPrimaryKeyObj());
            }

            if (auditFinding != null) {
                session.delete(auditFinding);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (auditFinding != null) {
            clearCache(auditFinding);
        }

        return auditFinding;
    }

    @Override
    public AuditFinding updateImpl(
        syneren.qms.audit.model.AuditFinding auditFinding)
        throws SystemException {
        auditFinding = toUnwrappedModel(auditFinding);

        boolean isNew = auditFinding.isNew();

        AuditFindingModelImpl auditFindingModelImpl = (AuditFindingModelImpl) auditFinding;

        Session session = null;

        try {
            session = openSession();

            if (auditFinding.isNew()) {
                session.save(auditFinding);

                auditFinding.setNew(false);
            } else {
                session.merge(auditFinding);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !AuditFindingModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((auditFindingModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        auditFindingModelImpl.getOriginalGroupId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);

                args = new Object[] { auditFindingModelImpl.getGroupId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);
            }

            if ((auditFindingModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDINGID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        auditFindingModelImpl.getOriginalFindingId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDINGID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDINGID,
                    args);

                args = new Object[] { auditFindingModelImpl.getFindingId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDINGID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDINGID,
                    args);
            }
        }

        EntityCacheUtil.putResult(AuditFindingModelImpl.ENTITY_CACHE_ENABLED,
            AuditFindingImpl.class, auditFinding.getPrimaryKey(), auditFinding);

        return auditFinding;
    }

    protected AuditFinding toUnwrappedModel(AuditFinding auditFinding) {
        if (auditFinding instanceof AuditFindingImpl) {
            return auditFinding;
        }

        AuditFindingImpl auditFindingImpl = new AuditFindingImpl();

        auditFindingImpl.setNew(auditFinding.isNew());
        auditFindingImpl.setPrimaryKey(auditFinding.getPrimaryKey());

        auditFindingImpl.setFindingId(auditFinding.getFindingId());
        auditFindingImpl.setFindingName(auditFinding.getFindingName());
        auditFindingImpl.setPlanId(auditFinding.getPlanId());
        auditFindingImpl.setType(auditFinding.getType());
        auditFindingImpl.setDueDate(auditFinding.getDueDate());
        auditFindingImpl.setStatus(auditFinding.getStatus());
        auditFindingImpl.setFollowupDue(auditFinding.getFollowupDue());
        auditFindingImpl.setFollowupStatus(auditFinding.getFollowupStatus());
        auditFindingImpl.setNote(auditFinding.getNote());
        auditFindingImpl.setCompanyId(auditFinding.getCompanyId());
        auditFindingImpl.setGroupId(auditFinding.getGroupId());
        auditFindingImpl.setUserId(auditFinding.getUserId());
        auditFindingImpl.setCreateDate(auditFinding.getCreateDate());
        auditFindingImpl.setModifiedDate(auditFinding.getModifiedDate());

        return auditFindingImpl;
    }

    /**
     * Returns the audit finding with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the audit finding
     * @return the audit finding
     * @throws syneren.qms.audit.NoSuchAuditFindingException if a audit finding with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditFinding findByPrimaryKey(Serializable primaryKey)
        throws NoSuchAuditFindingException, SystemException {
        AuditFinding auditFinding = fetchByPrimaryKey(primaryKey);

        if (auditFinding == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchAuditFindingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return auditFinding;
    }

    /**
     * Returns the audit finding with the primary key or throws a {@link syneren.qms.audit.NoSuchAuditFindingException} if it could not be found.
     *
     * @param FindingId the primary key of the audit finding
     * @return the audit finding
     * @throws syneren.qms.audit.NoSuchAuditFindingException if a audit finding with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditFinding findByPrimaryKey(long FindingId)
        throws NoSuchAuditFindingException, SystemException {
        return findByPrimaryKey((Serializable) FindingId);
    }

    /**
     * Returns the audit finding with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the audit finding
     * @return the audit finding, or <code>null</code> if a audit finding with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditFinding fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        AuditFinding auditFinding = (AuditFinding) EntityCacheUtil.getResult(AuditFindingModelImpl.ENTITY_CACHE_ENABLED,
                AuditFindingImpl.class, primaryKey);

        if (auditFinding == _nullAuditFinding) {
            return null;
        }

        if (auditFinding == null) {
            Session session = null;

            try {
                session = openSession();

                auditFinding = (AuditFinding) session.get(AuditFindingImpl.class,
                        primaryKey);

                if (auditFinding != null) {
                    cacheResult(auditFinding);
                } else {
                    EntityCacheUtil.putResult(AuditFindingModelImpl.ENTITY_CACHE_ENABLED,
                        AuditFindingImpl.class, primaryKey, _nullAuditFinding);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(AuditFindingModelImpl.ENTITY_CACHE_ENABLED,
                    AuditFindingImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return auditFinding;
    }

    /**
     * Returns the audit finding with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param FindingId the primary key of the audit finding
     * @return the audit finding, or <code>null</code> if a audit finding with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditFinding fetchByPrimaryKey(long FindingId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) FindingId);
    }

    /**
     * Returns all the audit findings.
     *
     * @return the audit findings
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AuditFinding> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the audit findings.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditFindingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of audit findings
     * @param end the upper bound of the range of audit findings (not inclusive)
     * @return the range of audit findings
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AuditFinding> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the audit findings.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditFindingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of audit findings
     * @param end the upper bound of the range of audit findings (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of audit findings
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AuditFinding> findAll(int start, int end,
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

        List<AuditFinding> list = (List<AuditFinding>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_AUDITFINDING);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_AUDITFINDING;

                if (pagination) {
                    sql = sql.concat(AuditFindingModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<AuditFinding>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<AuditFinding>(list);
                } else {
                    list = (List<AuditFinding>) QueryUtil.list(q, getDialect(),
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
     * Removes all the audit findings from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (AuditFinding auditFinding : findAll()) {
            remove(auditFinding);
        }
    }

    /**
     * Returns the number of audit findings.
     *
     * @return the number of audit findings
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

                Query q = session.createQuery(_SQL_COUNT_AUDITFINDING);

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
     * Initializes the audit finding persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.syneren.qms.audit.model.AuditFinding")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<AuditFinding>> listenersList = new ArrayList<ModelListener<AuditFinding>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<AuditFinding>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(AuditFindingImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
