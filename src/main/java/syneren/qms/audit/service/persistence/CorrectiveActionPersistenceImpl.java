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

import syneren.qms.audit.NoSuchCorrectiveActionException;
import syneren.qms.audit.model.CorrectiveAction;
import syneren.qms.audit.model.impl.CorrectiveActionImpl;
import syneren.qms.audit.model.impl.CorrectiveActionModelImpl;
import syneren.qms.audit.service.persistence.CorrectiveActionPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the corrective action service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author anguyen
 * @see CorrectiveActionPersistence
 * @see CorrectiveActionUtil
 * @generated
 */
public class CorrectiveActionPersistenceImpl extends BasePersistenceImpl<CorrectiveAction>
    implements CorrectiveActionPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link CorrectiveActionUtil} to access the corrective action persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = CorrectiveActionImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CorrectiveActionModelImpl.ENTITY_CACHE_ENABLED,
            CorrectiveActionModelImpl.FINDER_CACHE_ENABLED,
            CorrectiveActionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CorrectiveActionModelImpl.ENTITY_CACHE_ENABLED,
            CorrectiveActionModelImpl.FINDER_CACHE_ENABLED,
            CorrectiveActionImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CorrectiveActionModelImpl.ENTITY_CACHE_ENABLED,
            CorrectiveActionModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(CorrectiveActionModelImpl.ENTITY_CACHE_ENABLED,
            CorrectiveActionModelImpl.FINDER_CACHE_ENABLED,
            CorrectiveActionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByGroupId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
        new FinderPath(CorrectiveActionModelImpl.ENTITY_CACHE_ENABLED,
            CorrectiveActionModelImpl.FINDER_CACHE_ENABLED,
            CorrectiveActionImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
            new String[] { Long.class.getName() },
            CorrectiveActionModelImpl.GROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(CorrectiveActionModelImpl.ENTITY_CACHE_ENABLED,
            CorrectiveActionModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "correctiveAction.groupId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ACTIONID = new FinderPath(CorrectiveActionModelImpl.ENTITY_CACHE_ENABLED,
            CorrectiveActionModelImpl.FINDER_CACHE_ENABLED,
            CorrectiveActionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByActionId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIONID =
        new FinderPath(CorrectiveActionModelImpl.ENTITY_CACHE_ENABLED,
            CorrectiveActionModelImpl.FINDER_CACHE_ENABLED,
            CorrectiveActionImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByActionId",
            new String[] { Long.class.getName() },
            CorrectiveActionModelImpl.ACTIONID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_ACTIONID = new FinderPath(CorrectiveActionModelImpl.ENTITY_CACHE_ENABLED,
            CorrectiveActionModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByActionId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_ACTIONID_ACTIONID_2 = "correctiveAction.ActionId = ?";
    private static final String _SQL_SELECT_CORRECTIVEACTION = "SELECT correctiveAction FROM CorrectiveAction correctiveAction";
    private static final String _SQL_SELECT_CORRECTIVEACTION_WHERE = "SELECT correctiveAction FROM CorrectiveAction correctiveAction WHERE ";
    private static final String _SQL_COUNT_CORRECTIVEACTION = "SELECT COUNT(correctiveAction) FROM CorrectiveAction correctiveAction";
    private static final String _SQL_COUNT_CORRECTIVEACTION_WHERE = "SELECT COUNT(correctiveAction) FROM CorrectiveAction correctiveAction WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "correctiveAction.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CorrectiveAction exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CorrectiveAction exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(CorrectiveActionPersistenceImpl.class);
    private static CorrectiveAction _nullCorrectiveAction = new CorrectiveActionImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<CorrectiveAction> toCacheModel() {
                return _nullCorrectiveActionCacheModel;
            }
        };

    private static CacheModel<CorrectiveAction> _nullCorrectiveActionCacheModel = new CacheModel<CorrectiveAction>() {
            @Override
            public CorrectiveAction toEntityModel() {
                return _nullCorrectiveAction;
            }
        };

    public CorrectiveActionPersistenceImpl() {
        setModelClass(CorrectiveAction.class);
    }

    /**
     * Returns all the corrective actions where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the matching corrective actions
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CorrectiveAction> findByGroupId(long groupId)
        throws SystemException {
        return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the corrective actions where groupId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.CorrectiveActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param start the lower bound of the range of corrective actions
     * @param end the upper bound of the range of corrective actions (not inclusive)
     * @return the range of matching corrective actions
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CorrectiveAction> findByGroupId(long groupId, int start, int end)
        throws SystemException {
        return findByGroupId(groupId, start, end, null);
    }

    /**
     * Returns an ordered range of all the corrective actions where groupId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.CorrectiveActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param start the lower bound of the range of corrective actions
     * @param end the upper bound of the range of corrective actions (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching corrective actions
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CorrectiveAction> findByGroupId(long groupId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
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

        List<CorrectiveAction> list = (List<CorrectiveAction>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (CorrectiveAction correctiveAction : list) {
                if ((groupId != correctiveAction.getGroupId())) {
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

            query.append(_SQL_SELECT_CORRECTIVEACTION_WHERE);

            query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(CorrectiveActionModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (!pagination) {
                    list = (List<CorrectiveAction>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<CorrectiveAction>(list);
                } else {
                    list = (List<CorrectiveAction>) QueryUtil.list(q,
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
     * Returns the first corrective action in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching corrective action
     * @throws syneren.qms.audit.NoSuchCorrectiveActionException if a matching corrective action could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CorrectiveAction findByGroupId_First(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchCorrectiveActionException, SystemException {
        CorrectiveAction correctiveAction = fetchByGroupId_First(groupId,
                orderByComparator);

        if (correctiveAction != null) {
            return correctiveAction;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchCorrectiveActionException(msg.toString());
    }

    /**
     * Returns the first corrective action in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching corrective action, or <code>null</code> if a matching corrective action could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CorrectiveAction fetchByGroupId_First(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        List<CorrectiveAction> list = findByGroupId(groupId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last corrective action in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching corrective action
     * @throws syneren.qms.audit.NoSuchCorrectiveActionException if a matching corrective action could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CorrectiveAction findByGroupId_Last(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchCorrectiveActionException, SystemException {
        CorrectiveAction correctiveAction = fetchByGroupId_Last(groupId,
                orderByComparator);

        if (correctiveAction != null) {
            return correctiveAction;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchCorrectiveActionException(msg.toString());
    }

    /**
     * Returns the last corrective action in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching corrective action, or <code>null</code> if a matching corrective action could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CorrectiveAction fetchByGroupId_Last(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByGroupId(groupId);

        if (count == 0) {
            return null;
        }

        List<CorrectiveAction> list = findByGroupId(groupId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the corrective actions before and after the current corrective action in the ordered set where groupId = &#63;.
     *
     * @param ActionId the primary key of the current corrective action
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next corrective action
     * @throws syneren.qms.audit.NoSuchCorrectiveActionException if a corrective action with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CorrectiveAction[] findByGroupId_PrevAndNext(long ActionId,
        long groupId, OrderByComparator orderByComparator)
        throws NoSuchCorrectiveActionException, SystemException {
        CorrectiveAction correctiveAction = findByPrimaryKey(ActionId);

        Session session = null;

        try {
            session = openSession();

            CorrectiveAction[] array = new CorrectiveActionImpl[3];

            array[0] = getByGroupId_PrevAndNext(session, correctiveAction,
                    groupId, orderByComparator, true);

            array[1] = correctiveAction;

            array[2] = getByGroupId_PrevAndNext(session, correctiveAction,
                    groupId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected CorrectiveAction getByGroupId_PrevAndNext(Session session,
        CorrectiveAction correctiveAction, long groupId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_CORRECTIVEACTION_WHERE);

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
            query.append(CorrectiveActionModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(correctiveAction);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<CorrectiveAction> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the corrective actions where groupId = &#63; from the database.
     *
     * @param groupId the group ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByGroupId(long groupId) throws SystemException {
        for (CorrectiveAction correctiveAction : findByGroupId(groupId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(correctiveAction);
        }
    }

    /**
     * Returns the number of corrective actions where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the number of matching corrective actions
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

            query.append(_SQL_COUNT_CORRECTIVEACTION_WHERE);

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
     * Returns all the corrective actions where ActionId = &#63;.
     *
     * @param ActionId the action ID
     * @return the matching corrective actions
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CorrectiveAction> findByActionId(long ActionId)
        throws SystemException {
        return findByActionId(ActionId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the corrective actions where ActionId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.CorrectiveActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param ActionId the action ID
     * @param start the lower bound of the range of corrective actions
     * @param end the upper bound of the range of corrective actions (not inclusive)
     * @return the range of matching corrective actions
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CorrectiveAction> findByActionId(long ActionId, int start,
        int end) throws SystemException {
        return findByActionId(ActionId, start, end, null);
    }

    /**
     * Returns an ordered range of all the corrective actions where ActionId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.CorrectiveActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param ActionId the action ID
     * @param start the lower bound of the range of corrective actions
     * @param end the upper bound of the range of corrective actions (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching corrective actions
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CorrectiveAction> findByActionId(long ActionId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIONID;
            finderArgs = new Object[] { ActionId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ACTIONID;
            finderArgs = new Object[] { ActionId, start, end, orderByComparator };
        }

        List<CorrectiveAction> list = (List<CorrectiveAction>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (CorrectiveAction correctiveAction : list) {
                if ((ActionId != correctiveAction.getActionId())) {
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

            query.append(_SQL_SELECT_CORRECTIVEACTION_WHERE);

            query.append(_FINDER_COLUMN_ACTIONID_ACTIONID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(CorrectiveActionModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(ActionId);

                if (!pagination) {
                    list = (List<CorrectiveAction>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<CorrectiveAction>(list);
                } else {
                    list = (List<CorrectiveAction>) QueryUtil.list(q,
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
     * Returns the first corrective action in the ordered set where ActionId = &#63;.
     *
     * @param ActionId the action ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching corrective action
     * @throws syneren.qms.audit.NoSuchCorrectiveActionException if a matching corrective action could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CorrectiveAction findByActionId_First(long ActionId,
        OrderByComparator orderByComparator)
        throws NoSuchCorrectiveActionException, SystemException {
        CorrectiveAction correctiveAction = fetchByActionId_First(ActionId,
                orderByComparator);

        if (correctiveAction != null) {
            return correctiveAction;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("ActionId=");
        msg.append(ActionId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchCorrectiveActionException(msg.toString());
    }

    /**
     * Returns the first corrective action in the ordered set where ActionId = &#63;.
     *
     * @param ActionId the action ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching corrective action, or <code>null</code> if a matching corrective action could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CorrectiveAction fetchByActionId_First(long ActionId,
        OrderByComparator orderByComparator) throws SystemException {
        List<CorrectiveAction> list = findByActionId(ActionId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last corrective action in the ordered set where ActionId = &#63;.
     *
     * @param ActionId the action ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching corrective action
     * @throws syneren.qms.audit.NoSuchCorrectiveActionException if a matching corrective action could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CorrectiveAction findByActionId_Last(long ActionId,
        OrderByComparator orderByComparator)
        throws NoSuchCorrectiveActionException, SystemException {
        CorrectiveAction correctiveAction = fetchByActionId_Last(ActionId,
                orderByComparator);

        if (correctiveAction != null) {
            return correctiveAction;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("ActionId=");
        msg.append(ActionId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchCorrectiveActionException(msg.toString());
    }

    /**
     * Returns the last corrective action in the ordered set where ActionId = &#63;.
     *
     * @param ActionId the action ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching corrective action, or <code>null</code> if a matching corrective action could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CorrectiveAction fetchByActionId_Last(long ActionId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByActionId(ActionId);

        if (count == 0) {
            return null;
        }

        List<CorrectiveAction> list = findByActionId(ActionId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Removes all the corrective actions where ActionId = &#63; from the database.
     *
     * @param ActionId the action ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByActionId(long ActionId) throws SystemException {
        for (CorrectiveAction correctiveAction : findByActionId(ActionId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(correctiveAction);
        }
    }

    /**
     * Returns the number of corrective actions where ActionId = &#63;.
     *
     * @param ActionId the action ID
     * @return the number of matching corrective actions
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByActionId(long ActionId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_ACTIONID;

        Object[] finderArgs = new Object[] { ActionId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_CORRECTIVEACTION_WHERE);

            query.append(_FINDER_COLUMN_ACTIONID_ACTIONID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(ActionId);

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
     * Caches the corrective action in the entity cache if it is enabled.
     *
     * @param correctiveAction the corrective action
     */
    @Override
    public void cacheResult(CorrectiveAction correctiveAction) {
        EntityCacheUtil.putResult(CorrectiveActionModelImpl.ENTITY_CACHE_ENABLED,
            CorrectiveActionImpl.class, correctiveAction.getPrimaryKey(),
            correctiveAction);

        correctiveAction.resetOriginalValues();
    }

    /**
     * Caches the corrective actions in the entity cache if it is enabled.
     *
     * @param correctiveActions the corrective actions
     */
    @Override
    public void cacheResult(List<CorrectiveAction> correctiveActions) {
        for (CorrectiveAction correctiveAction : correctiveActions) {
            if (EntityCacheUtil.getResult(
                        CorrectiveActionModelImpl.ENTITY_CACHE_ENABLED,
                        CorrectiveActionImpl.class,
                        correctiveAction.getPrimaryKey()) == null) {
                cacheResult(correctiveAction);
            } else {
                correctiveAction.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all corrective actions.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(CorrectiveActionImpl.class.getName());
        }

        EntityCacheUtil.clearCache(CorrectiveActionImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the corrective action.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(CorrectiveAction correctiveAction) {
        EntityCacheUtil.removeResult(CorrectiveActionModelImpl.ENTITY_CACHE_ENABLED,
            CorrectiveActionImpl.class, correctiveAction.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<CorrectiveAction> correctiveActions) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (CorrectiveAction correctiveAction : correctiveActions) {
            EntityCacheUtil.removeResult(CorrectiveActionModelImpl.ENTITY_CACHE_ENABLED,
                CorrectiveActionImpl.class, correctiveAction.getPrimaryKey());
        }
    }

    /**
     * Creates a new corrective action with the primary key. Does not add the corrective action to the database.
     *
     * @param ActionId the primary key for the new corrective action
     * @return the new corrective action
     */
    @Override
    public CorrectiveAction create(long ActionId) {
        CorrectiveAction correctiveAction = new CorrectiveActionImpl();

        correctiveAction.setNew(true);
        correctiveAction.setPrimaryKey(ActionId);

        return correctiveAction;
    }

    /**
     * Removes the corrective action with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param ActionId the primary key of the corrective action
     * @return the corrective action that was removed
     * @throws syneren.qms.audit.NoSuchCorrectiveActionException if a corrective action with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CorrectiveAction remove(long ActionId)
        throws NoSuchCorrectiveActionException, SystemException {
        return remove((Serializable) ActionId);
    }

    /**
     * Removes the corrective action with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the corrective action
     * @return the corrective action that was removed
     * @throws syneren.qms.audit.NoSuchCorrectiveActionException if a corrective action with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CorrectiveAction remove(Serializable primaryKey)
        throws NoSuchCorrectiveActionException, SystemException {
        Session session = null;

        try {
            session = openSession();

            CorrectiveAction correctiveAction = (CorrectiveAction) session.get(CorrectiveActionImpl.class,
                    primaryKey);

            if (correctiveAction == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchCorrectiveActionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(correctiveAction);
        } catch (NoSuchCorrectiveActionException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected CorrectiveAction removeImpl(CorrectiveAction correctiveAction)
        throws SystemException {
        correctiveAction = toUnwrappedModel(correctiveAction);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(correctiveAction)) {
                correctiveAction = (CorrectiveAction) session.get(CorrectiveActionImpl.class,
                        correctiveAction.getPrimaryKeyObj());
            }

            if (correctiveAction != null) {
                session.delete(correctiveAction);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (correctiveAction != null) {
            clearCache(correctiveAction);
        }

        return correctiveAction;
    }

    @Override
    public CorrectiveAction updateImpl(
        syneren.qms.audit.model.CorrectiveAction correctiveAction)
        throws SystemException {
        correctiveAction = toUnwrappedModel(correctiveAction);

        boolean isNew = correctiveAction.isNew();

        CorrectiveActionModelImpl correctiveActionModelImpl = (CorrectiveActionModelImpl) correctiveAction;

        Session session = null;

        try {
            session = openSession();

            if (correctiveAction.isNew()) {
                session.save(correctiveAction);

                correctiveAction.setNew(false);
            } else {
                session.merge(correctiveAction);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !CorrectiveActionModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((correctiveActionModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        correctiveActionModelImpl.getOriginalGroupId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);

                args = new Object[] { correctiveActionModelImpl.getGroupId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);
            }

            if ((correctiveActionModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIONID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        correctiveActionModelImpl.getOriginalActionId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACTIONID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIONID,
                    args);

                args = new Object[] { correctiveActionModelImpl.getActionId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACTIONID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIONID,
                    args);
            }
        }

        EntityCacheUtil.putResult(CorrectiveActionModelImpl.ENTITY_CACHE_ENABLED,
            CorrectiveActionImpl.class, correctiveAction.getPrimaryKey(),
            correctiveAction);

        return correctiveAction;
    }

    protected CorrectiveAction toUnwrappedModel(
        CorrectiveAction correctiveAction) {
        if (correctiveAction instanceof CorrectiveActionImpl) {
            return correctiveAction;
        }

        CorrectiveActionImpl correctiveActionImpl = new CorrectiveActionImpl();

        correctiveActionImpl.setNew(correctiveAction.isNew());
        correctiveActionImpl.setPrimaryKey(correctiveAction.getPrimaryKey());

        correctiveActionImpl.setActionId(correctiveAction.getActionId());
        correctiveActionImpl.setActionName(correctiveAction.getActionName());
        correctiveActionImpl.setFindingId(correctiveAction.getFindingId());
        correctiveActionImpl.setNote(correctiveAction.getNote());
        correctiveActionImpl.setCompanyId(correctiveAction.getCompanyId());
        correctiveActionImpl.setGroupId(correctiveAction.getGroupId());
        correctiveActionImpl.setUserId(correctiveAction.getUserId());
        correctiveActionImpl.setCreateDate(correctiveAction.getCreateDate());
        correctiveActionImpl.setModifiedDate(correctiveAction.getModifiedDate());

        return correctiveActionImpl;
    }

    /**
     * Returns the corrective action with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the corrective action
     * @return the corrective action
     * @throws syneren.qms.audit.NoSuchCorrectiveActionException if a corrective action with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CorrectiveAction findByPrimaryKey(Serializable primaryKey)
        throws NoSuchCorrectiveActionException, SystemException {
        CorrectiveAction correctiveAction = fetchByPrimaryKey(primaryKey);

        if (correctiveAction == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchCorrectiveActionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return correctiveAction;
    }

    /**
     * Returns the corrective action with the primary key or throws a {@link syneren.qms.audit.NoSuchCorrectiveActionException} if it could not be found.
     *
     * @param ActionId the primary key of the corrective action
     * @return the corrective action
     * @throws syneren.qms.audit.NoSuchCorrectiveActionException if a corrective action with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CorrectiveAction findByPrimaryKey(long ActionId)
        throws NoSuchCorrectiveActionException, SystemException {
        return findByPrimaryKey((Serializable) ActionId);
    }

    /**
     * Returns the corrective action with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the corrective action
     * @return the corrective action, or <code>null</code> if a corrective action with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CorrectiveAction fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        CorrectiveAction correctiveAction = (CorrectiveAction) EntityCacheUtil.getResult(CorrectiveActionModelImpl.ENTITY_CACHE_ENABLED,
                CorrectiveActionImpl.class, primaryKey);

        if (correctiveAction == _nullCorrectiveAction) {
            return null;
        }

        if (correctiveAction == null) {
            Session session = null;

            try {
                session = openSession();

                correctiveAction = (CorrectiveAction) session.get(CorrectiveActionImpl.class,
                        primaryKey);

                if (correctiveAction != null) {
                    cacheResult(correctiveAction);
                } else {
                    EntityCacheUtil.putResult(CorrectiveActionModelImpl.ENTITY_CACHE_ENABLED,
                        CorrectiveActionImpl.class, primaryKey,
                        _nullCorrectiveAction);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(CorrectiveActionModelImpl.ENTITY_CACHE_ENABLED,
                    CorrectiveActionImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return correctiveAction;
    }

    /**
     * Returns the corrective action with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param ActionId the primary key of the corrective action
     * @return the corrective action, or <code>null</code> if a corrective action with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CorrectiveAction fetchByPrimaryKey(long ActionId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) ActionId);
    }

    /**
     * Returns all the corrective actions.
     *
     * @return the corrective actions
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CorrectiveAction> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the corrective actions.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.CorrectiveActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of corrective actions
     * @param end the upper bound of the range of corrective actions (not inclusive)
     * @return the range of corrective actions
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CorrectiveAction> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the corrective actions.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.CorrectiveActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of corrective actions
     * @param end the upper bound of the range of corrective actions (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of corrective actions
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CorrectiveAction> findAll(int start, int end,
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

        List<CorrectiveAction> list = (List<CorrectiveAction>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_CORRECTIVEACTION);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_CORRECTIVEACTION;

                if (pagination) {
                    sql = sql.concat(CorrectiveActionModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<CorrectiveAction>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<CorrectiveAction>(list);
                } else {
                    list = (List<CorrectiveAction>) QueryUtil.list(q,
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
     * Removes all the corrective actions from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (CorrectiveAction correctiveAction : findAll()) {
            remove(correctiveAction);
        }
    }

    /**
     * Returns the number of corrective actions.
     *
     * @return the number of corrective actions
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

                Query q = session.createQuery(_SQL_COUNT_CORRECTIVEACTION);

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
     * Initializes the corrective action persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.syneren.qms.audit.model.CorrectiveAction")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<CorrectiveAction>> listenersList = new ArrayList<ModelListener<CorrectiveAction>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<CorrectiveAction>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(CorrectiveActionImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
