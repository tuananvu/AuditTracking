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

import syneren.qms.audit.NoSuchAuditCheckItemException;
import syneren.qms.audit.model.AuditCheckItem;
import syneren.qms.audit.model.impl.AuditCheckItemImpl;
import syneren.qms.audit.model.impl.AuditCheckItemModelImpl;
import syneren.qms.audit.service.persistence.AuditCheckItemPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the audit check item service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author anguyen
 * @see AuditCheckItemPersistence
 * @see AuditCheckItemUtil
 * @generated
 */
public class AuditCheckItemPersistenceImpl extends BasePersistenceImpl<AuditCheckItem>
    implements AuditCheckItemPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link AuditCheckItemUtil} to access the audit check item persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = AuditCheckItemImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AuditCheckItemModelImpl.ENTITY_CACHE_ENABLED,
            AuditCheckItemModelImpl.FINDER_CACHE_ENABLED,
            AuditCheckItemImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AuditCheckItemModelImpl.ENTITY_CACHE_ENABLED,
            AuditCheckItemModelImpl.FINDER_CACHE_ENABLED,
            AuditCheckItemImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AuditCheckItemModelImpl.ENTITY_CACHE_ENABLED,
            AuditCheckItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(AuditCheckItemModelImpl.ENTITY_CACHE_ENABLED,
            AuditCheckItemModelImpl.FINDER_CACHE_ENABLED,
            AuditCheckItemImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByGroupId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
        new FinderPath(AuditCheckItemModelImpl.ENTITY_CACHE_ENABLED,
            AuditCheckItemModelImpl.FINDER_CACHE_ENABLED,
            AuditCheckItemImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
            new String[] { Long.class.getName() },
            AuditCheckItemModelImpl.GROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(AuditCheckItemModelImpl.ENTITY_CACHE_ENABLED,
            AuditCheckItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "auditCheckItem.groupId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CHECKITEMID =
        new FinderPath(AuditCheckItemModelImpl.ENTITY_CACHE_ENABLED,
            AuditCheckItemModelImpl.FINDER_CACHE_ENABLED,
            AuditCheckItemImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByCheckItemId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHECKITEMID =
        new FinderPath(AuditCheckItemModelImpl.ENTITY_CACHE_ENABLED,
            AuditCheckItemModelImpl.FINDER_CACHE_ENABLED,
            AuditCheckItemImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCheckItemId",
            new String[] { Long.class.getName() },
            AuditCheckItemModelImpl.CHECKITEMID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_CHECKITEMID = new FinderPath(AuditCheckItemModelImpl.ENTITY_CACHE_ENABLED,
            AuditCheckItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCheckItemId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_CHECKITEMID_CHECKITEMID_2 = "auditCheckItem.CheckItemId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_A = new FinderPath(AuditCheckItemModelImpl.ENTITY_CACHE_ENABLED,
            AuditCheckItemModelImpl.FINDER_CACHE_ENABLED,
            AuditCheckItemImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByG_A",
            new String[] {
                Long.class.getName(), Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_A = new FinderPath(AuditCheckItemModelImpl.ENTITY_CACHE_ENABLED,
            AuditCheckItemModelImpl.FINDER_CACHE_ENABLED,
            AuditCheckItemImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_A",
            new String[] { Long.class.getName(), Long.class.getName() },
            AuditCheckItemModelImpl.GROUPID_COLUMN_BITMASK |
            AuditCheckItemModelImpl.AUDITID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_G_A = new FinderPath(AuditCheckItemModelImpl.ENTITY_CACHE_ENABLED,
            AuditCheckItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_A",
            new String[] { Long.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_G_A_GROUPID_2 = "auditCheckItem.groupId = ? AND ";
    private static final String _FINDER_COLUMN_G_A_AUDITID_2 = "auditCheckItem.AuditId = ?";
    private static final String _SQL_SELECT_AUDITCHECKITEM = "SELECT auditCheckItem FROM AuditCheckItem auditCheckItem";
    private static final String _SQL_SELECT_AUDITCHECKITEM_WHERE = "SELECT auditCheckItem FROM AuditCheckItem auditCheckItem WHERE ";
    private static final String _SQL_COUNT_AUDITCHECKITEM = "SELECT COUNT(auditCheckItem) FROM AuditCheckItem auditCheckItem";
    private static final String _SQL_COUNT_AUDITCHECKITEM_WHERE = "SELECT COUNT(auditCheckItem) FROM AuditCheckItem auditCheckItem WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "auditCheckItem.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AuditCheckItem exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AuditCheckItem exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(AuditCheckItemPersistenceImpl.class);
    private static AuditCheckItem _nullAuditCheckItem = new AuditCheckItemImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<AuditCheckItem> toCacheModel() {
                return _nullAuditCheckItemCacheModel;
            }
        };

    private static CacheModel<AuditCheckItem> _nullAuditCheckItemCacheModel = new CacheModel<AuditCheckItem>() {
            @Override
            public AuditCheckItem toEntityModel() {
                return _nullAuditCheckItem;
            }
        };

    public AuditCheckItemPersistenceImpl() {
        setModelClass(AuditCheckItem.class);
    }

    /**
     * Returns all the audit check items where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the matching audit check items
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AuditCheckItem> findByGroupId(long groupId)
        throws SystemException {
        return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the audit check items where groupId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditCheckItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param start the lower bound of the range of audit check items
     * @param end the upper bound of the range of audit check items (not inclusive)
     * @return the range of matching audit check items
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AuditCheckItem> findByGroupId(long groupId, int start, int end)
        throws SystemException {
        return findByGroupId(groupId, start, end, null);
    }

    /**
     * Returns an ordered range of all the audit check items where groupId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditCheckItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param start the lower bound of the range of audit check items
     * @param end the upper bound of the range of audit check items (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching audit check items
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AuditCheckItem> findByGroupId(long groupId, int start, int end,
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

        List<AuditCheckItem> list = (List<AuditCheckItem>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (AuditCheckItem auditCheckItem : list) {
                if ((groupId != auditCheckItem.getGroupId())) {
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

            query.append(_SQL_SELECT_AUDITCHECKITEM_WHERE);

            query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(AuditCheckItemModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (!pagination) {
                    list = (List<AuditCheckItem>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<AuditCheckItem>(list);
                } else {
                    list = (List<AuditCheckItem>) QueryUtil.list(q,
                            getDialect(), start, end);
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
     * Returns the first audit check item in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching audit check item
     * @throws syneren.qms.audit.NoSuchAuditCheckItemException if a matching audit check item could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditCheckItem findByGroupId_First(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchAuditCheckItemException, SystemException {
        AuditCheckItem auditCheckItem = fetchByGroupId_First(groupId,
                orderByComparator);

        if (auditCheckItem != null) {
            return auditCheckItem;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAuditCheckItemException(msg.toString());
    }

    /**
     * Returns the first audit check item in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching audit check item, or <code>null</code> if a matching audit check item could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditCheckItem fetchByGroupId_First(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        List<AuditCheckItem> list = findByGroupId(groupId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last audit check item in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching audit check item
     * @throws syneren.qms.audit.NoSuchAuditCheckItemException if a matching audit check item could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditCheckItem findByGroupId_Last(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchAuditCheckItemException, SystemException {
        AuditCheckItem auditCheckItem = fetchByGroupId_Last(groupId,
                orderByComparator);

        if (auditCheckItem != null) {
            return auditCheckItem;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAuditCheckItemException(msg.toString());
    }

    /**
     * Returns the last audit check item in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching audit check item, or <code>null</code> if a matching audit check item could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditCheckItem fetchByGroupId_Last(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByGroupId(groupId);

        if (count == 0) {
            return null;
        }

        List<AuditCheckItem> list = findByGroupId(groupId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the audit check items before and after the current audit check item in the ordered set where groupId = &#63;.
     *
     * @param CheckItemId the primary key of the current audit check item
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next audit check item
     * @throws syneren.qms.audit.NoSuchAuditCheckItemException if a audit check item with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditCheckItem[] findByGroupId_PrevAndNext(long CheckItemId,
        long groupId, OrderByComparator orderByComparator)
        throws NoSuchAuditCheckItemException, SystemException {
        AuditCheckItem auditCheckItem = findByPrimaryKey(CheckItemId);

        Session session = null;

        try {
            session = openSession();

            AuditCheckItem[] array = new AuditCheckItemImpl[3];

            array[0] = getByGroupId_PrevAndNext(session, auditCheckItem,
                    groupId, orderByComparator, true);

            array[1] = auditCheckItem;

            array[2] = getByGroupId_PrevAndNext(session, auditCheckItem,
                    groupId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected AuditCheckItem getByGroupId_PrevAndNext(Session session,
        AuditCheckItem auditCheckItem, long groupId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_AUDITCHECKITEM_WHERE);

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
            query.append(AuditCheckItemModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(auditCheckItem);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<AuditCheckItem> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the audit check items where groupId = &#63; from the database.
     *
     * @param groupId the group ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByGroupId(long groupId) throws SystemException {
        for (AuditCheckItem auditCheckItem : findByGroupId(groupId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(auditCheckItem);
        }
    }

    /**
     * Returns the number of audit check items where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the number of matching audit check items
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

            query.append(_SQL_COUNT_AUDITCHECKITEM_WHERE);

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
     * Returns all the audit check items where CheckItemId = &#63;.
     *
     * @param CheckItemId the check item ID
     * @return the matching audit check items
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AuditCheckItem> findByCheckItemId(long CheckItemId)
        throws SystemException {
        return findByCheckItemId(CheckItemId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the audit check items where CheckItemId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditCheckItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param CheckItemId the check item ID
     * @param start the lower bound of the range of audit check items
     * @param end the upper bound of the range of audit check items (not inclusive)
     * @return the range of matching audit check items
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AuditCheckItem> findByCheckItemId(long CheckItemId, int start,
        int end) throws SystemException {
        return findByCheckItemId(CheckItemId, start, end, null);
    }

    /**
     * Returns an ordered range of all the audit check items where CheckItemId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditCheckItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param CheckItemId the check item ID
     * @param start the lower bound of the range of audit check items
     * @param end the upper bound of the range of audit check items (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching audit check items
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AuditCheckItem> findByCheckItemId(long CheckItemId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHECKITEMID;
            finderArgs = new Object[] { CheckItemId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CHECKITEMID;
            finderArgs = new Object[] { CheckItemId, start, end, orderByComparator };
        }

        List<AuditCheckItem> list = (List<AuditCheckItem>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (AuditCheckItem auditCheckItem : list) {
                if ((CheckItemId != auditCheckItem.getCheckItemId())) {
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

            query.append(_SQL_SELECT_AUDITCHECKITEM_WHERE);

            query.append(_FINDER_COLUMN_CHECKITEMID_CHECKITEMID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(AuditCheckItemModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(CheckItemId);

                if (!pagination) {
                    list = (List<AuditCheckItem>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<AuditCheckItem>(list);
                } else {
                    list = (List<AuditCheckItem>) QueryUtil.list(q,
                            getDialect(), start, end);
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
     * Returns the first audit check item in the ordered set where CheckItemId = &#63;.
     *
     * @param CheckItemId the check item ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching audit check item
     * @throws syneren.qms.audit.NoSuchAuditCheckItemException if a matching audit check item could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditCheckItem findByCheckItemId_First(long CheckItemId,
        OrderByComparator orderByComparator)
        throws NoSuchAuditCheckItemException, SystemException {
        AuditCheckItem auditCheckItem = fetchByCheckItemId_First(CheckItemId,
                orderByComparator);

        if (auditCheckItem != null) {
            return auditCheckItem;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("CheckItemId=");
        msg.append(CheckItemId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAuditCheckItemException(msg.toString());
    }

    /**
     * Returns the first audit check item in the ordered set where CheckItemId = &#63;.
     *
     * @param CheckItemId the check item ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching audit check item, or <code>null</code> if a matching audit check item could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditCheckItem fetchByCheckItemId_First(long CheckItemId,
        OrderByComparator orderByComparator) throws SystemException {
        List<AuditCheckItem> list = findByCheckItemId(CheckItemId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last audit check item in the ordered set where CheckItemId = &#63;.
     *
     * @param CheckItemId the check item ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching audit check item
     * @throws syneren.qms.audit.NoSuchAuditCheckItemException if a matching audit check item could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditCheckItem findByCheckItemId_Last(long CheckItemId,
        OrderByComparator orderByComparator)
        throws NoSuchAuditCheckItemException, SystemException {
        AuditCheckItem auditCheckItem = fetchByCheckItemId_Last(CheckItemId,
                orderByComparator);

        if (auditCheckItem != null) {
            return auditCheckItem;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("CheckItemId=");
        msg.append(CheckItemId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAuditCheckItemException(msg.toString());
    }

    /**
     * Returns the last audit check item in the ordered set where CheckItemId = &#63;.
     *
     * @param CheckItemId the check item ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching audit check item, or <code>null</code> if a matching audit check item could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditCheckItem fetchByCheckItemId_Last(long CheckItemId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByCheckItemId(CheckItemId);

        if (count == 0) {
            return null;
        }

        List<AuditCheckItem> list = findByCheckItemId(CheckItemId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Removes all the audit check items where CheckItemId = &#63; from the database.
     *
     * @param CheckItemId the check item ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByCheckItemId(long CheckItemId) throws SystemException {
        for (AuditCheckItem auditCheckItem : findByCheckItemId(CheckItemId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(auditCheckItem);
        }
    }

    /**
     * Returns the number of audit check items where CheckItemId = &#63;.
     *
     * @param CheckItemId the check item ID
     * @return the number of matching audit check items
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByCheckItemId(long CheckItemId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_CHECKITEMID;

        Object[] finderArgs = new Object[] { CheckItemId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_AUDITCHECKITEM_WHERE);

            query.append(_FINDER_COLUMN_CHECKITEMID_CHECKITEMID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(CheckItemId);

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
     * Returns all the audit check items where groupId = &#63; and AuditId = &#63;.
     *
     * @param groupId the group ID
     * @param AuditId the audit ID
     * @return the matching audit check items
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AuditCheckItem> findByG_A(long groupId, long AuditId)
        throws SystemException {
        return findByG_A(groupId, AuditId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the audit check items where groupId = &#63; and AuditId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditCheckItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param AuditId the audit ID
     * @param start the lower bound of the range of audit check items
     * @param end the upper bound of the range of audit check items (not inclusive)
     * @return the range of matching audit check items
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AuditCheckItem> findByG_A(long groupId, long AuditId,
        int start, int end) throws SystemException {
        return findByG_A(groupId, AuditId, start, end, null);
    }

    /**
     * Returns an ordered range of all the audit check items where groupId = &#63; and AuditId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditCheckItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param AuditId the audit ID
     * @param start the lower bound of the range of audit check items
     * @param end the upper bound of the range of audit check items (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching audit check items
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AuditCheckItem> findByG_A(long groupId, long AuditId,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_A;
            finderArgs = new Object[] { groupId, AuditId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_A;
            finderArgs = new Object[] {
                    groupId, AuditId,
                    
                    start, end, orderByComparator
                };
        }

        List<AuditCheckItem> list = (List<AuditCheckItem>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (AuditCheckItem auditCheckItem : list) {
                if ((groupId != auditCheckItem.getGroupId()) ||
                        (AuditId != auditCheckItem.getAuditId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_AUDITCHECKITEM_WHERE);

            query.append(_FINDER_COLUMN_G_A_GROUPID_2);

            query.append(_FINDER_COLUMN_G_A_AUDITID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(AuditCheckItemModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                qPos.add(AuditId);

                if (!pagination) {
                    list = (List<AuditCheckItem>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<AuditCheckItem>(list);
                } else {
                    list = (List<AuditCheckItem>) QueryUtil.list(q,
                            getDialect(), start, end);
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
     * Returns the first audit check item in the ordered set where groupId = &#63; and AuditId = &#63;.
     *
     * @param groupId the group ID
     * @param AuditId the audit ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching audit check item
     * @throws syneren.qms.audit.NoSuchAuditCheckItemException if a matching audit check item could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditCheckItem findByG_A_First(long groupId, long AuditId,
        OrderByComparator orderByComparator)
        throws NoSuchAuditCheckItemException, SystemException {
        AuditCheckItem auditCheckItem = fetchByG_A_First(groupId, AuditId,
                orderByComparator);

        if (auditCheckItem != null) {
            return auditCheckItem;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", AuditId=");
        msg.append(AuditId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAuditCheckItemException(msg.toString());
    }

    /**
     * Returns the first audit check item in the ordered set where groupId = &#63; and AuditId = &#63;.
     *
     * @param groupId the group ID
     * @param AuditId the audit ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching audit check item, or <code>null</code> if a matching audit check item could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditCheckItem fetchByG_A_First(long groupId, long AuditId,
        OrderByComparator orderByComparator) throws SystemException {
        List<AuditCheckItem> list = findByG_A(groupId, AuditId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last audit check item in the ordered set where groupId = &#63; and AuditId = &#63;.
     *
     * @param groupId the group ID
     * @param AuditId the audit ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching audit check item
     * @throws syneren.qms.audit.NoSuchAuditCheckItemException if a matching audit check item could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditCheckItem findByG_A_Last(long groupId, long AuditId,
        OrderByComparator orderByComparator)
        throws NoSuchAuditCheckItemException, SystemException {
        AuditCheckItem auditCheckItem = fetchByG_A_Last(groupId, AuditId,
                orderByComparator);

        if (auditCheckItem != null) {
            return auditCheckItem;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", AuditId=");
        msg.append(AuditId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAuditCheckItemException(msg.toString());
    }

    /**
     * Returns the last audit check item in the ordered set where groupId = &#63; and AuditId = &#63;.
     *
     * @param groupId the group ID
     * @param AuditId the audit ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching audit check item, or <code>null</code> if a matching audit check item could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditCheckItem fetchByG_A_Last(long groupId, long AuditId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByG_A(groupId, AuditId);

        if (count == 0) {
            return null;
        }

        List<AuditCheckItem> list = findByG_A(groupId, AuditId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the audit check items before and after the current audit check item in the ordered set where groupId = &#63; and AuditId = &#63;.
     *
     * @param CheckItemId the primary key of the current audit check item
     * @param groupId the group ID
     * @param AuditId the audit ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next audit check item
     * @throws syneren.qms.audit.NoSuchAuditCheckItemException if a audit check item with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditCheckItem[] findByG_A_PrevAndNext(long CheckItemId,
        long groupId, long AuditId, OrderByComparator orderByComparator)
        throws NoSuchAuditCheckItemException, SystemException {
        AuditCheckItem auditCheckItem = findByPrimaryKey(CheckItemId);

        Session session = null;

        try {
            session = openSession();

            AuditCheckItem[] array = new AuditCheckItemImpl[3];

            array[0] = getByG_A_PrevAndNext(session, auditCheckItem, groupId,
                    AuditId, orderByComparator, true);

            array[1] = auditCheckItem;

            array[2] = getByG_A_PrevAndNext(session, auditCheckItem, groupId,
                    AuditId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected AuditCheckItem getByG_A_PrevAndNext(Session session,
        AuditCheckItem auditCheckItem, long groupId, long AuditId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_AUDITCHECKITEM_WHERE);

        query.append(_FINDER_COLUMN_G_A_GROUPID_2);

        query.append(_FINDER_COLUMN_G_A_AUDITID_2);

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
            query.append(AuditCheckItemModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        qPos.add(AuditId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(auditCheckItem);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<AuditCheckItem> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the audit check items where groupId = &#63; and AuditId = &#63; from the database.
     *
     * @param groupId the group ID
     * @param AuditId the audit ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByG_A(long groupId, long AuditId)
        throws SystemException {
        for (AuditCheckItem auditCheckItem : findByG_A(groupId, AuditId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(auditCheckItem);
        }
    }

    /**
     * Returns the number of audit check items where groupId = &#63; and AuditId = &#63;.
     *
     * @param groupId the group ID
     * @param AuditId the audit ID
     * @return the number of matching audit check items
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByG_A(long groupId, long AuditId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_G_A;

        Object[] finderArgs = new Object[] { groupId, AuditId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_AUDITCHECKITEM_WHERE);

            query.append(_FINDER_COLUMN_G_A_GROUPID_2);

            query.append(_FINDER_COLUMN_G_A_AUDITID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                qPos.add(AuditId);

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
     * Caches the audit check item in the entity cache if it is enabled.
     *
     * @param auditCheckItem the audit check item
     */
    @Override
    public void cacheResult(AuditCheckItem auditCheckItem) {
        EntityCacheUtil.putResult(AuditCheckItemModelImpl.ENTITY_CACHE_ENABLED,
            AuditCheckItemImpl.class, auditCheckItem.getPrimaryKey(),
            auditCheckItem);

        auditCheckItem.resetOriginalValues();
    }

    /**
     * Caches the audit check items in the entity cache if it is enabled.
     *
     * @param auditCheckItems the audit check items
     */
    @Override
    public void cacheResult(List<AuditCheckItem> auditCheckItems) {
        for (AuditCheckItem auditCheckItem : auditCheckItems) {
            if (EntityCacheUtil.getResult(
                        AuditCheckItemModelImpl.ENTITY_CACHE_ENABLED,
                        AuditCheckItemImpl.class, auditCheckItem.getPrimaryKey()) == null) {
                cacheResult(auditCheckItem);
            } else {
                auditCheckItem.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all audit check items.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(AuditCheckItemImpl.class.getName());
        }

        EntityCacheUtil.clearCache(AuditCheckItemImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the audit check item.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(AuditCheckItem auditCheckItem) {
        EntityCacheUtil.removeResult(AuditCheckItemModelImpl.ENTITY_CACHE_ENABLED,
            AuditCheckItemImpl.class, auditCheckItem.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<AuditCheckItem> auditCheckItems) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (AuditCheckItem auditCheckItem : auditCheckItems) {
            EntityCacheUtil.removeResult(AuditCheckItemModelImpl.ENTITY_CACHE_ENABLED,
                AuditCheckItemImpl.class, auditCheckItem.getPrimaryKey());
        }
    }

    /**
     * Creates a new audit check item with the primary key. Does not add the audit check item to the database.
     *
     * @param CheckItemId the primary key for the new audit check item
     * @return the new audit check item
     */
    @Override
    public AuditCheckItem create(long CheckItemId) {
        AuditCheckItem auditCheckItem = new AuditCheckItemImpl();

        auditCheckItem.setNew(true);
        auditCheckItem.setPrimaryKey(CheckItemId);

        return auditCheckItem;
    }

    /**
     * Removes the audit check item with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param CheckItemId the primary key of the audit check item
     * @return the audit check item that was removed
     * @throws syneren.qms.audit.NoSuchAuditCheckItemException if a audit check item with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditCheckItem remove(long CheckItemId)
        throws NoSuchAuditCheckItemException, SystemException {
        return remove((Serializable) CheckItemId);
    }

    /**
     * Removes the audit check item with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the audit check item
     * @return the audit check item that was removed
     * @throws syneren.qms.audit.NoSuchAuditCheckItemException if a audit check item with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditCheckItem remove(Serializable primaryKey)
        throws NoSuchAuditCheckItemException, SystemException {
        Session session = null;

        try {
            session = openSession();

            AuditCheckItem auditCheckItem = (AuditCheckItem) session.get(AuditCheckItemImpl.class,
                    primaryKey);

            if (auditCheckItem == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchAuditCheckItemException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(auditCheckItem);
        } catch (NoSuchAuditCheckItemException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected AuditCheckItem removeImpl(AuditCheckItem auditCheckItem)
        throws SystemException {
        auditCheckItem = toUnwrappedModel(auditCheckItem);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(auditCheckItem)) {
                auditCheckItem = (AuditCheckItem) session.get(AuditCheckItemImpl.class,
                        auditCheckItem.getPrimaryKeyObj());
            }

            if (auditCheckItem != null) {
                session.delete(auditCheckItem);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (auditCheckItem != null) {
            clearCache(auditCheckItem);
        }

        return auditCheckItem;
    }

    @Override
    public AuditCheckItem updateImpl(
        syneren.qms.audit.model.AuditCheckItem auditCheckItem)
        throws SystemException {
        auditCheckItem = toUnwrappedModel(auditCheckItem);

        boolean isNew = auditCheckItem.isNew();

        AuditCheckItemModelImpl auditCheckItemModelImpl = (AuditCheckItemModelImpl) auditCheckItem;

        Session session = null;

        try {
            session = openSession();

            if (auditCheckItem.isNew()) {
                session.save(auditCheckItem);

                auditCheckItem.setNew(false);
            } else {
                session.merge(auditCheckItem);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !AuditCheckItemModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((auditCheckItemModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        auditCheckItemModelImpl.getOriginalGroupId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);

                args = new Object[] { auditCheckItemModelImpl.getGroupId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);
            }

            if ((auditCheckItemModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHECKITEMID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        auditCheckItemModelImpl.getOriginalCheckItemId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CHECKITEMID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHECKITEMID,
                    args);

                args = new Object[] { auditCheckItemModelImpl.getCheckItemId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CHECKITEMID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHECKITEMID,
                    args);
            }

            if ((auditCheckItemModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_A.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        auditCheckItemModelImpl.getOriginalGroupId(),
                        auditCheckItemModelImpl.getOriginalAuditId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_A, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_A,
                    args);

                args = new Object[] {
                        auditCheckItemModelImpl.getGroupId(),
                        auditCheckItemModelImpl.getAuditId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_A, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_A,
                    args);
            }
        }

        EntityCacheUtil.putResult(AuditCheckItemModelImpl.ENTITY_CACHE_ENABLED,
            AuditCheckItemImpl.class, auditCheckItem.getPrimaryKey(),
            auditCheckItem);

        return auditCheckItem;
    }

    protected AuditCheckItem toUnwrappedModel(AuditCheckItem auditCheckItem) {
        if (auditCheckItem instanceof AuditCheckItemImpl) {
            return auditCheckItem;
        }

        AuditCheckItemImpl auditCheckItemImpl = new AuditCheckItemImpl();

        auditCheckItemImpl.setNew(auditCheckItem.isNew());
        auditCheckItemImpl.setPrimaryKey(auditCheckItem.getPrimaryKey());

        auditCheckItemImpl.setCheckItemId(auditCheckItem.getCheckItemId());
        auditCheckItemImpl.setCheckItemName(auditCheckItem.getCheckItemName());
        auditCheckItemImpl.setQuestion(auditCheckItem.getQuestion());
        auditCheckItemImpl.setAnswer(auditCheckItem.getAnswer());
        auditCheckItemImpl.setComplie(auditCheckItem.isComplie());
        auditCheckItemImpl.setEvidence(auditCheckItem.getEvidence());
        auditCheckItemImpl.setOutcome(auditCheckItem.getOutcome());
        auditCheckItemImpl.setCompanyId(auditCheckItem.getCompanyId());
        auditCheckItemImpl.setGroupId(auditCheckItem.getGroupId());
        auditCheckItemImpl.setUserId(auditCheckItem.getUserId());
        auditCheckItemImpl.setCreateDate(auditCheckItem.getCreateDate());
        auditCheckItemImpl.setModifiedDate(auditCheckItem.getModifiedDate());
        auditCheckItemImpl.setAuditId(auditCheckItem.getAuditId());

        return auditCheckItemImpl;
    }

    /**
     * Returns the audit check item with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the audit check item
     * @return the audit check item
     * @throws syneren.qms.audit.NoSuchAuditCheckItemException if a audit check item with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditCheckItem findByPrimaryKey(Serializable primaryKey)
        throws NoSuchAuditCheckItemException, SystemException {
        AuditCheckItem auditCheckItem = fetchByPrimaryKey(primaryKey);

        if (auditCheckItem == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchAuditCheckItemException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return auditCheckItem;
    }

    /**
     * Returns the audit check item with the primary key or throws a {@link syneren.qms.audit.NoSuchAuditCheckItemException} if it could not be found.
     *
     * @param CheckItemId the primary key of the audit check item
     * @return the audit check item
     * @throws syneren.qms.audit.NoSuchAuditCheckItemException if a audit check item with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditCheckItem findByPrimaryKey(long CheckItemId)
        throws NoSuchAuditCheckItemException, SystemException {
        return findByPrimaryKey((Serializable) CheckItemId);
    }

    /**
     * Returns the audit check item with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the audit check item
     * @return the audit check item, or <code>null</code> if a audit check item with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditCheckItem fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        AuditCheckItem auditCheckItem = (AuditCheckItem) EntityCacheUtil.getResult(AuditCheckItemModelImpl.ENTITY_CACHE_ENABLED,
                AuditCheckItemImpl.class, primaryKey);

        if (auditCheckItem == _nullAuditCheckItem) {
            return null;
        }

        if (auditCheckItem == null) {
            Session session = null;

            try {
                session = openSession();

                auditCheckItem = (AuditCheckItem) session.get(AuditCheckItemImpl.class,
                        primaryKey);

                if (auditCheckItem != null) {
                    cacheResult(auditCheckItem);
                } else {
                    EntityCacheUtil.putResult(AuditCheckItemModelImpl.ENTITY_CACHE_ENABLED,
                        AuditCheckItemImpl.class, primaryKey,
                        _nullAuditCheckItem);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(AuditCheckItemModelImpl.ENTITY_CACHE_ENABLED,
                    AuditCheckItemImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return auditCheckItem;
    }

    /**
     * Returns the audit check item with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param CheckItemId the primary key of the audit check item
     * @return the audit check item, or <code>null</code> if a audit check item with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditCheckItem fetchByPrimaryKey(long CheckItemId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) CheckItemId);
    }

    /**
     * Returns all the audit check items.
     *
     * @return the audit check items
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AuditCheckItem> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the audit check items.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditCheckItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of audit check items
     * @param end the upper bound of the range of audit check items (not inclusive)
     * @return the range of audit check items
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AuditCheckItem> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the audit check items.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditCheckItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of audit check items
     * @param end the upper bound of the range of audit check items (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of audit check items
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AuditCheckItem> findAll(int start, int end,
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

        List<AuditCheckItem> list = (List<AuditCheckItem>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_AUDITCHECKITEM);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_AUDITCHECKITEM;

                if (pagination) {
                    sql = sql.concat(AuditCheckItemModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<AuditCheckItem>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<AuditCheckItem>(list);
                } else {
                    list = (List<AuditCheckItem>) QueryUtil.list(q,
                            getDialect(), start, end);
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
     * Removes all the audit check items from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (AuditCheckItem auditCheckItem : findAll()) {
            remove(auditCheckItem);
        }
    }

    /**
     * Returns the number of audit check items.
     *
     * @return the number of audit check items
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

                Query q = session.createQuery(_SQL_COUNT_AUDITCHECKITEM);

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
     * Initializes the audit check item persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.syneren.qms.audit.model.AuditCheckItem")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<AuditCheckItem>> listenersList = new ArrayList<ModelListener<AuditCheckItem>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<AuditCheckItem>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(AuditCheckItemImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
