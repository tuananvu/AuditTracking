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

import syneren.qms.audit.NoSuchAuditReportException;
import syneren.qms.audit.model.AuditReport;
import syneren.qms.audit.model.impl.AuditReportImpl;
import syneren.qms.audit.model.impl.AuditReportModelImpl;
import syneren.qms.audit.service.persistence.AuditReportPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the audit report service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author anguyen
 * @see AuditReportPersistence
 * @see AuditReportUtil
 * @generated
 */
public class AuditReportPersistenceImpl extends BasePersistenceImpl<AuditReport>
    implements AuditReportPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link AuditReportUtil} to access the audit report persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = AuditReportImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AuditReportModelImpl.ENTITY_CACHE_ENABLED,
            AuditReportModelImpl.FINDER_CACHE_ENABLED, AuditReportImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AuditReportModelImpl.ENTITY_CACHE_ENABLED,
            AuditReportModelImpl.FINDER_CACHE_ENABLED, AuditReportImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AuditReportModelImpl.ENTITY_CACHE_ENABLED,
            AuditReportModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(AuditReportModelImpl.ENTITY_CACHE_ENABLED,
            AuditReportModelImpl.FINDER_CACHE_ENABLED, AuditReportImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
        new FinderPath(AuditReportModelImpl.ENTITY_CACHE_ENABLED,
            AuditReportModelImpl.FINDER_CACHE_ENABLED, AuditReportImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
            new String[] { Long.class.getName() },
            AuditReportModelImpl.GROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(AuditReportModelImpl.ENTITY_CACHE_ENABLED,
            AuditReportModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "auditReport.groupId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_AUDITID = new FinderPath(AuditReportModelImpl.ENTITY_CACHE_ENABLED,
            AuditReportModelImpl.FINDER_CACHE_ENABLED, AuditReportImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByAuditId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AUDITID =
        new FinderPath(AuditReportModelImpl.ENTITY_CACHE_ENABLED,
            AuditReportModelImpl.FINDER_CACHE_ENABLED, AuditReportImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByAuditId",
            new String[] { Long.class.getName() },
            AuditReportModelImpl.AUDITID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_AUDITID = new FinderPath(AuditReportModelImpl.ENTITY_CACHE_ENABLED,
            AuditReportModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByAuditId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_AUDITID_AUDITID_2 = "auditReport.AuditId = ?";
    private static final String _SQL_SELECT_AUDITREPORT = "SELECT auditReport FROM AuditReport auditReport";
    private static final String _SQL_SELECT_AUDITREPORT_WHERE = "SELECT auditReport FROM AuditReport auditReport WHERE ";
    private static final String _SQL_COUNT_AUDITREPORT = "SELECT COUNT(auditReport) FROM AuditReport auditReport";
    private static final String _SQL_COUNT_AUDITREPORT_WHERE = "SELECT COUNT(auditReport) FROM AuditReport auditReport WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "auditReport.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AuditReport exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AuditReport exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(AuditReportPersistenceImpl.class);
    private static AuditReport _nullAuditReport = new AuditReportImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<AuditReport> toCacheModel() {
                return _nullAuditReportCacheModel;
            }
        };

    private static CacheModel<AuditReport> _nullAuditReportCacheModel = new CacheModel<AuditReport>() {
            @Override
            public AuditReport toEntityModel() {
                return _nullAuditReport;
            }
        };

    public AuditReportPersistenceImpl() {
        setModelClass(AuditReport.class);
    }

    /**
     * Returns all the audit reports where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the matching audit reports
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AuditReport> findByGroupId(long groupId)
        throws SystemException {
        return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the audit reports where groupId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param start the lower bound of the range of audit reports
     * @param end the upper bound of the range of audit reports (not inclusive)
     * @return the range of matching audit reports
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AuditReport> findByGroupId(long groupId, int start, int end)
        throws SystemException {
        return findByGroupId(groupId, start, end, null);
    }

    /**
     * Returns an ordered range of all the audit reports where groupId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param start the lower bound of the range of audit reports
     * @param end the upper bound of the range of audit reports (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching audit reports
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AuditReport> findByGroupId(long groupId, int start, int end,
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

        List<AuditReport> list = (List<AuditReport>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (AuditReport auditReport : list) {
                if ((groupId != auditReport.getGroupId())) {
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

            query.append(_SQL_SELECT_AUDITREPORT_WHERE);

            query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(AuditReportModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (!pagination) {
                    list = (List<AuditReport>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<AuditReport>(list);
                } else {
                    list = (List<AuditReport>) QueryUtil.list(q, getDialect(),
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
     * Returns the first audit report in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching audit report
     * @throws syneren.qms.audit.NoSuchAuditReportException if a matching audit report could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditReport findByGroupId_First(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchAuditReportException, SystemException {
        AuditReport auditReport = fetchByGroupId_First(groupId,
                orderByComparator);

        if (auditReport != null) {
            return auditReport;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAuditReportException(msg.toString());
    }

    /**
     * Returns the first audit report in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching audit report, or <code>null</code> if a matching audit report could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditReport fetchByGroupId_First(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        List<AuditReport> list = findByGroupId(groupId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last audit report in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching audit report
     * @throws syneren.qms.audit.NoSuchAuditReportException if a matching audit report could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditReport findByGroupId_Last(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchAuditReportException, SystemException {
        AuditReport auditReport = fetchByGroupId_Last(groupId, orderByComparator);

        if (auditReport != null) {
            return auditReport;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAuditReportException(msg.toString());
    }

    /**
     * Returns the last audit report in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching audit report, or <code>null</code> if a matching audit report could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditReport fetchByGroupId_Last(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByGroupId(groupId);

        if (count == 0) {
            return null;
        }

        List<AuditReport> list = findByGroupId(groupId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the audit reports before and after the current audit report in the ordered set where groupId = &#63;.
     *
     * @param AuditId the primary key of the current audit report
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next audit report
     * @throws syneren.qms.audit.NoSuchAuditReportException if a audit report with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditReport[] findByGroupId_PrevAndNext(long AuditId, long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchAuditReportException, SystemException {
        AuditReport auditReport = findByPrimaryKey(AuditId);

        Session session = null;

        try {
            session = openSession();

            AuditReport[] array = new AuditReportImpl[3];

            array[0] = getByGroupId_PrevAndNext(session, auditReport, groupId,
                    orderByComparator, true);

            array[1] = auditReport;

            array[2] = getByGroupId_PrevAndNext(session, auditReport, groupId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected AuditReport getByGroupId_PrevAndNext(Session session,
        AuditReport auditReport, long groupId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_AUDITREPORT_WHERE);

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
            query.append(AuditReportModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(auditReport);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<AuditReport> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the audit reports where groupId = &#63; from the database.
     *
     * @param groupId the group ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByGroupId(long groupId) throws SystemException {
        for (AuditReport auditReport : findByGroupId(groupId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(auditReport);
        }
    }

    /**
     * Returns the number of audit reports where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the number of matching audit reports
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

            query.append(_SQL_COUNT_AUDITREPORT_WHERE);

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
     * Returns all the audit reports where AuditId = &#63;.
     *
     * @param AuditId the audit ID
     * @return the matching audit reports
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AuditReport> findByAuditId(long AuditId)
        throws SystemException {
        return findByAuditId(AuditId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the audit reports where AuditId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param AuditId the audit ID
     * @param start the lower bound of the range of audit reports
     * @param end the upper bound of the range of audit reports (not inclusive)
     * @return the range of matching audit reports
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AuditReport> findByAuditId(long AuditId, int start, int end)
        throws SystemException {
        return findByAuditId(AuditId, start, end, null);
    }

    /**
     * Returns an ordered range of all the audit reports where AuditId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param AuditId the audit ID
     * @param start the lower bound of the range of audit reports
     * @param end the upper bound of the range of audit reports (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching audit reports
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AuditReport> findByAuditId(long AuditId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AUDITID;
            finderArgs = new Object[] { AuditId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_AUDITID;
            finderArgs = new Object[] { AuditId, start, end, orderByComparator };
        }

        List<AuditReport> list = (List<AuditReport>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (AuditReport auditReport : list) {
                if ((AuditId != auditReport.getAuditId())) {
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

            query.append(_SQL_SELECT_AUDITREPORT_WHERE);

            query.append(_FINDER_COLUMN_AUDITID_AUDITID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(AuditReportModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(AuditId);

                if (!pagination) {
                    list = (List<AuditReport>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<AuditReport>(list);
                } else {
                    list = (List<AuditReport>) QueryUtil.list(q, getDialect(),
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
     * Returns the first audit report in the ordered set where AuditId = &#63;.
     *
     * @param AuditId the audit ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching audit report
     * @throws syneren.qms.audit.NoSuchAuditReportException if a matching audit report could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditReport findByAuditId_First(long AuditId,
        OrderByComparator orderByComparator)
        throws NoSuchAuditReportException, SystemException {
        AuditReport auditReport = fetchByAuditId_First(AuditId,
                orderByComparator);

        if (auditReport != null) {
            return auditReport;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("AuditId=");
        msg.append(AuditId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAuditReportException(msg.toString());
    }

    /**
     * Returns the first audit report in the ordered set where AuditId = &#63;.
     *
     * @param AuditId the audit ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching audit report, or <code>null</code> if a matching audit report could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditReport fetchByAuditId_First(long AuditId,
        OrderByComparator orderByComparator) throws SystemException {
        List<AuditReport> list = findByAuditId(AuditId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last audit report in the ordered set where AuditId = &#63;.
     *
     * @param AuditId the audit ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching audit report
     * @throws syneren.qms.audit.NoSuchAuditReportException if a matching audit report could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditReport findByAuditId_Last(long AuditId,
        OrderByComparator orderByComparator)
        throws NoSuchAuditReportException, SystemException {
        AuditReport auditReport = fetchByAuditId_Last(AuditId, orderByComparator);

        if (auditReport != null) {
            return auditReport;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("AuditId=");
        msg.append(AuditId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAuditReportException(msg.toString());
    }

    /**
     * Returns the last audit report in the ordered set where AuditId = &#63;.
     *
     * @param AuditId the audit ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching audit report, or <code>null</code> if a matching audit report could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditReport fetchByAuditId_Last(long AuditId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByAuditId(AuditId);

        if (count == 0) {
            return null;
        }

        List<AuditReport> list = findByAuditId(AuditId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Removes all the audit reports where AuditId = &#63; from the database.
     *
     * @param AuditId the audit ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByAuditId(long AuditId) throws SystemException {
        for (AuditReport auditReport : findByAuditId(AuditId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(auditReport);
        }
    }

    /**
     * Returns the number of audit reports where AuditId = &#63;.
     *
     * @param AuditId the audit ID
     * @return the number of matching audit reports
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByAuditId(long AuditId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_AUDITID;

        Object[] finderArgs = new Object[] { AuditId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_AUDITREPORT_WHERE);

            query.append(_FINDER_COLUMN_AUDITID_AUDITID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

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
     * Caches the audit report in the entity cache if it is enabled.
     *
     * @param auditReport the audit report
     */
    @Override
    public void cacheResult(AuditReport auditReport) {
        EntityCacheUtil.putResult(AuditReportModelImpl.ENTITY_CACHE_ENABLED,
            AuditReportImpl.class, auditReport.getPrimaryKey(), auditReport);

        auditReport.resetOriginalValues();
    }

    /**
     * Caches the audit reports in the entity cache if it is enabled.
     *
     * @param auditReports the audit reports
     */
    @Override
    public void cacheResult(List<AuditReport> auditReports) {
        for (AuditReport auditReport : auditReports) {
            if (EntityCacheUtil.getResult(
                        AuditReportModelImpl.ENTITY_CACHE_ENABLED,
                        AuditReportImpl.class, auditReport.getPrimaryKey()) == null) {
                cacheResult(auditReport);
            } else {
                auditReport.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all audit reports.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(AuditReportImpl.class.getName());
        }

        EntityCacheUtil.clearCache(AuditReportImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the audit report.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(AuditReport auditReport) {
        EntityCacheUtil.removeResult(AuditReportModelImpl.ENTITY_CACHE_ENABLED,
            AuditReportImpl.class, auditReport.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<AuditReport> auditReports) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (AuditReport auditReport : auditReports) {
            EntityCacheUtil.removeResult(AuditReportModelImpl.ENTITY_CACHE_ENABLED,
                AuditReportImpl.class, auditReport.getPrimaryKey());
        }
    }

    /**
     * Creates a new audit report with the primary key. Does not add the audit report to the database.
     *
     * @param AuditId the primary key for the new audit report
     * @return the new audit report
     */
    @Override
    public AuditReport create(long AuditId) {
        AuditReport auditReport = new AuditReportImpl();

        auditReport.setNew(true);
        auditReport.setPrimaryKey(AuditId);

        return auditReport;
    }

    /**
     * Removes the audit report with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param AuditId the primary key of the audit report
     * @return the audit report that was removed
     * @throws syneren.qms.audit.NoSuchAuditReportException if a audit report with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditReport remove(long AuditId)
        throws NoSuchAuditReportException, SystemException {
        return remove((Serializable) AuditId);
    }

    /**
     * Removes the audit report with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the audit report
     * @return the audit report that was removed
     * @throws syneren.qms.audit.NoSuchAuditReportException if a audit report with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditReport remove(Serializable primaryKey)
        throws NoSuchAuditReportException, SystemException {
        Session session = null;

        try {
            session = openSession();

            AuditReport auditReport = (AuditReport) session.get(AuditReportImpl.class,
                    primaryKey);

            if (auditReport == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchAuditReportException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(auditReport);
        } catch (NoSuchAuditReportException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected AuditReport removeImpl(AuditReport auditReport)
        throws SystemException {
        auditReport = toUnwrappedModel(auditReport);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(auditReport)) {
                auditReport = (AuditReport) session.get(AuditReportImpl.class,
                        auditReport.getPrimaryKeyObj());
            }

            if (auditReport != null) {
                session.delete(auditReport);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (auditReport != null) {
            clearCache(auditReport);
        }

        return auditReport;
    }

    @Override
    public AuditReport updateImpl(
        syneren.qms.audit.model.AuditReport auditReport)
        throws SystemException {
        auditReport = toUnwrappedModel(auditReport);

        boolean isNew = auditReport.isNew();

        AuditReportModelImpl auditReportModelImpl = (AuditReportModelImpl) auditReport;

        Session session = null;

        try {
            session = openSession();

            if (auditReport.isNew()) {
                session.save(auditReport);

                auditReport.setNew(false);
            } else {
                session.merge(auditReport);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !AuditReportModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((auditReportModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        auditReportModelImpl.getOriginalGroupId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);

                args = new Object[] { auditReportModelImpl.getGroupId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);
            }

            if ((auditReportModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AUDITID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        auditReportModelImpl.getOriginalAuditId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_AUDITID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AUDITID,
                    args);

                args = new Object[] { auditReportModelImpl.getAuditId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_AUDITID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AUDITID,
                    args);
            }
        }

        EntityCacheUtil.putResult(AuditReportModelImpl.ENTITY_CACHE_ENABLED,
            AuditReportImpl.class, auditReport.getPrimaryKey(), auditReport);

        return auditReport;
    }

    protected AuditReport toUnwrappedModel(AuditReport auditReport) {
        if (auditReport instanceof AuditReportImpl) {
            return auditReport;
        }

        AuditReportImpl auditReportImpl = new AuditReportImpl();

        auditReportImpl.setNew(auditReport.isNew());
        auditReportImpl.setPrimaryKey(auditReport.getPrimaryKey());

        auditReportImpl.setAuditId(auditReport.getAuditId());
        auditReportImpl.setAuditName(auditReport.getAuditName());
        auditReportImpl.setInitAuditId(auditReport.getInitAuditId());
        auditReportImpl.setAuditor(auditReport.getAuditor());
        auditReportImpl.setNote(auditReport.getNote());
        auditReportImpl.setCompanyId(auditReport.getCompanyId());
        auditReportImpl.setGroupId(auditReport.getGroupId());
        auditReportImpl.setUserId(auditReport.getUserId());
        auditReportImpl.setCreateDate(auditReport.getCreateDate());
        auditReportImpl.setModifiedDate(auditReport.getModifiedDate());

        return auditReportImpl;
    }

    /**
     * Returns the audit report with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the audit report
     * @return the audit report
     * @throws syneren.qms.audit.NoSuchAuditReportException if a audit report with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditReport findByPrimaryKey(Serializable primaryKey)
        throws NoSuchAuditReportException, SystemException {
        AuditReport auditReport = fetchByPrimaryKey(primaryKey);

        if (auditReport == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchAuditReportException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return auditReport;
    }

    /**
     * Returns the audit report with the primary key or throws a {@link syneren.qms.audit.NoSuchAuditReportException} if it could not be found.
     *
     * @param AuditId the primary key of the audit report
     * @return the audit report
     * @throws syneren.qms.audit.NoSuchAuditReportException if a audit report with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditReport findByPrimaryKey(long AuditId)
        throws NoSuchAuditReportException, SystemException {
        return findByPrimaryKey((Serializable) AuditId);
    }

    /**
     * Returns the audit report with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the audit report
     * @return the audit report, or <code>null</code> if a audit report with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditReport fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        AuditReport auditReport = (AuditReport) EntityCacheUtil.getResult(AuditReportModelImpl.ENTITY_CACHE_ENABLED,
                AuditReportImpl.class, primaryKey);

        if (auditReport == _nullAuditReport) {
            return null;
        }

        if (auditReport == null) {
            Session session = null;

            try {
                session = openSession();

                auditReport = (AuditReport) session.get(AuditReportImpl.class,
                        primaryKey);

                if (auditReport != null) {
                    cacheResult(auditReport);
                } else {
                    EntityCacheUtil.putResult(AuditReportModelImpl.ENTITY_CACHE_ENABLED,
                        AuditReportImpl.class, primaryKey, _nullAuditReport);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(AuditReportModelImpl.ENTITY_CACHE_ENABLED,
                    AuditReportImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return auditReport;
    }

    /**
     * Returns the audit report with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param AuditId the primary key of the audit report
     * @return the audit report, or <code>null</code> if a audit report with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AuditReport fetchByPrimaryKey(long AuditId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) AuditId);
    }

    /**
     * Returns all the audit reports.
     *
     * @return the audit reports
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AuditReport> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the audit reports.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of audit reports
     * @param end the upper bound of the range of audit reports (not inclusive)
     * @return the range of audit reports
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AuditReport> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the audit reports.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link syneren.qms.audit.model.impl.AuditReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of audit reports
     * @param end the upper bound of the range of audit reports (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of audit reports
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AuditReport> findAll(int start, int end,
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

        List<AuditReport> list = (List<AuditReport>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_AUDITREPORT);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_AUDITREPORT;

                if (pagination) {
                    sql = sql.concat(AuditReportModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<AuditReport>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<AuditReport>(list);
                } else {
                    list = (List<AuditReport>) QueryUtil.list(q, getDialect(),
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
     * Removes all the audit reports from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (AuditReport auditReport : findAll()) {
            remove(auditReport);
        }
    }

    /**
     * Returns the number of audit reports.
     *
     * @return the number of audit reports
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

                Query q = session.createQuery(_SQL_COUNT_AUDITREPORT);

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
     * Initializes the audit report persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.syneren.qms.audit.model.AuditReport")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<AuditReport>> listenersList = new ArrayList<ModelListener<AuditReport>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<AuditReport>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(AuditReportImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
