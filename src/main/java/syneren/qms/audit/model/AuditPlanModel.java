package syneren.qms.audit.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the AuditPlan service. Represents a row in the &quot;AuditPlan&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link syneren.qms.audit.model.impl.AuditPlanModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link syneren.qms.audit.model.impl.AuditPlanImpl}.
 * </p>
 *
 * @author anguyen
 * @see AuditPlan
 * @see syneren.qms.audit.model.impl.AuditPlanImpl
 * @see syneren.qms.audit.model.impl.AuditPlanModelImpl
 * @generated
 */
public interface AuditPlanModel extends BaseModel<AuditPlan> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a audit plan model instance should use the {@link AuditPlan} interface instead.
     */

    /**
     * Returns the primary key of this audit plan.
     *
     * @return the primary key of this audit plan
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this audit plan.
     *
     * @param primaryKey the primary key of this audit plan
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the plan ID of this audit plan.
     *
     * @return the plan ID of this audit plan
     */
    public long getPlanId();

    /**
     * Sets the plan ID of this audit plan.
     *
     * @param PlanId the plan ID of this audit plan
     */
    public void setPlanId(long PlanId);

    /**
     * Returns the plan name of this audit plan.
     *
     * @return the plan name of this audit plan
     */
    @AutoEscape
    public String getPlanName();

    /**
     * Sets the plan name of this audit plan.
     *
     * @param PlanName the plan name of this audit plan
     */
    public void setPlanName(String PlanName);

    /**
     * Returns the init audit ID of this audit plan.
     *
     * @return the init audit ID of this audit plan
     */
    public long getInitAuditId();

    /**
     * Sets the init audit ID of this audit plan.
     *
     * @param InitAuditId the init audit ID of this audit plan
     */
    public void setInitAuditId(long InitAuditId);

    /**
     * Returns the auditor of this audit plan.
     *
     * @return the auditor of this audit plan
     */
    @AutoEscape
    public String getAuditor();

    /**
     * Sets the auditor of this audit plan.
     *
     * @param Auditor the auditor of this audit plan
     */
    public void setAuditor(String Auditor);

    /**
     * Returns the audit team of this audit plan.
     *
     * @return the audit team of this audit plan
     */
    @AutoEscape
    public String getAuditTeam();

    /**
     * Sets the audit team of this audit plan.
     *
     * @param AuditTeam the audit team of this audit plan
     */
    public void setAuditTeam(String AuditTeam);

    /**
     * Returns the interviewes of this audit plan.
     *
     * @return the interviewes of this audit plan
     */
    @AutoEscape
    public String getInterviewes();

    /**
     * Sets the interviewes of this audit plan.
     *
     * @param Interviewes the interviewes of this audit plan
     */
    public void setInterviewes(String Interviewes);

    /**
     * Returns the plan date of this audit plan.
     *
     * @return the plan date of this audit plan
     */
    public Date getPlanDate();

    /**
     * Sets the plan date of this audit plan.
     *
     * @param PlanDate the plan date of this audit plan
     */
    public void setPlanDate(Date PlanDate);

    /**
     * Returns the act date of this audit plan.
     *
     * @return the act date of this audit plan
     */
    public Date getActDate();

    /**
     * Sets the act date of this audit plan.
     *
     * @param ActDate the act date of this audit plan
     */
    public void setActDate(Date ActDate);

    /**
     * Returns the status of this audit plan.
     *
     * @return the status of this audit plan
     */
    @AutoEscape
    public String getStatus();

    /**
     * Sets the status of this audit plan.
     *
     * @param Status the status of this audit plan
     */
    public void setStatus(String Status);

    /**
     * Returns the note of this audit plan.
     *
     * @return the note of this audit plan
     */
    @AutoEscape
    public String getNote();

    /**
     * Sets the note of this audit plan.
     *
     * @param Note the note of this audit plan
     */
    public void setNote(String Note);

    /**
     * Returns the company ID of this audit plan.
     *
     * @return the company ID of this audit plan
     */
    public long getCompanyId();

    /**
     * Sets the company ID of this audit plan.
     *
     * @param companyId the company ID of this audit plan
     */
    public void setCompanyId(long companyId);

    /**
     * Returns the group ID of this audit plan.
     *
     * @return the group ID of this audit plan
     */
    public long getGroupId();

    /**
     * Sets the group ID of this audit plan.
     *
     * @param groupId the group ID of this audit plan
     */
    public void setGroupId(long groupId);

    /**
     * Returns the user ID of this audit plan.
     *
     * @return the user ID of this audit plan
     */
    public long getUserId();

    /**
     * Sets the user ID of this audit plan.
     *
     * @param userId the user ID of this audit plan
     */
    public void setUserId(long userId);

    /**
     * Returns the user uuid of this audit plan.
     *
     * @return the user uuid of this audit plan
     * @throws SystemException if a system exception occurred
     */
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this audit plan.
     *
     * @param userUuid the user uuid of this audit plan
     */
    public void setUserUuid(String userUuid);

    /**
     * Returns the create date of this audit plan.
     *
     * @return the create date of this audit plan
     */
    public Date getCreateDate();

    /**
     * Sets the create date of this audit plan.
     *
     * @param createDate the create date of this audit plan
     */
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this audit plan.
     *
     * @return the modified date of this audit plan
     */
    public Date getModifiedDate();

    /**
     * Sets the modified date of this audit plan.
     *
     * @param modifiedDate the modified date of this audit plan
     */
    public void setModifiedDate(Date modifiedDate);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(syneren.qms.audit.model.AuditPlan auditPlan);

    @Override
    public int hashCode();

    @Override
    public CacheModel<syneren.qms.audit.model.AuditPlan> toCacheModel();

    @Override
    public syneren.qms.audit.model.AuditPlan toEscapedModel();

    @Override
    public syneren.qms.audit.model.AuditPlan toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
