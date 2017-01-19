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
 * The base model interface for the AuditCheckItem service. Represents a row in the &quot;AuditCheckItem&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link syneren.qms.audit.model.impl.AuditCheckItemModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link syneren.qms.audit.model.impl.AuditCheckItemImpl}.
 * </p>
 *
 * @author anguyen
 * @see AuditCheckItem
 * @see syneren.qms.audit.model.impl.AuditCheckItemImpl
 * @see syneren.qms.audit.model.impl.AuditCheckItemModelImpl
 * @generated
 */
public interface AuditCheckItemModel extends BaseModel<AuditCheckItem> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a audit check item model instance should use the {@link AuditCheckItem} interface instead.
     */

    /**
     * Returns the primary key of this audit check item.
     *
     * @return the primary key of this audit check item
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this audit check item.
     *
     * @param primaryKey the primary key of this audit check item
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the check item ID of this audit check item.
     *
     * @return the check item ID of this audit check item
     */
    public long getCheckItemId();

    /**
     * Sets the check item ID of this audit check item.
     *
     * @param CheckItemId the check item ID of this audit check item
     */
    public void setCheckItemId(long CheckItemId);

    /**
     * Returns the check item name of this audit check item.
     *
     * @return the check item name of this audit check item
     */
    @AutoEscape
    public String getCheckItemName();

    /**
     * Sets the check item name of this audit check item.
     *
     * @param CheckItemName the check item name of this audit check item
     */
    public void setCheckItemName(String CheckItemName);

    /**
     * Returns the question of this audit check item.
     *
     * @return the question of this audit check item
     */
    @AutoEscape
    public String getQuestion();

    /**
     * Sets the question of this audit check item.
     *
     * @param Question the question of this audit check item
     */
    public void setQuestion(String Question);

    /**
     * Returns the answer of this audit check item.
     *
     * @return the answer of this audit check item
     */
    @AutoEscape
    public String getAnswer();

    /**
     * Sets the answer of this audit check item.
     *
     * @param Answer the answer of this audit check item
     */
    public void setAnswer(String Answer);

    /**
     * Returns the complie of this audit check item.
     *
     * @return the complie of this audit check item
     */
    public boolean getComplie();

    /**
     * Returns <code>true</code> if this audit check item is complie.
     *
     * @return <code>true</code> if this audit check item is complie; <code>false</code> otherwise
     */
    public boolean isComplie();

    /**
     * Sets whether this audit check item is complie.
     *
     * @param Complie the complie of this audit check item
     */
    public void setComplie(boolean Complie);

    /**
     * Returns the evidence of this audit check item.
     *
     * @return the evidence of this audit check item
     */
    @AutoEscape
    public String getEvidence();

    /**
     * Sets the evidence of this audit check item.
     *
     * @param Evidence the evidence of this audit check item
     */
    public void setEvidence(String Evidence);

    /**
     * Returns the outcome of this audit check item.
     *
     * @return the outcome of this audit check item
     */
    @AutoEscape
    public String getOutcome();

    /**
     * Sets the outcome of this audit check item.
     *
     * @param Outcome the outcome of this audit check item
     */
    public void setOutcome(String Outcome);

    /**
     * Returns the company ID of this audit check item.
     *
     * @return the company ID of this audit check item
     */
    public long getCompanyId();

    /**
     * Sets the company ID of this audit check item.
     *
     * @param companyId the company ID of this audit check item
     */
    public void setCompanyId(long companyId);

    /**
     * Returns the group ID of this audit check item.
     *
     * @return the group ID of this audit check item
     */
    public long getGroupId();

    /**
     * Sets the group ID of this audit check item.
     *
     * @param groupId the group ID of this audit check item
     */
    public void setGroupId(long groupId);

    /**
     * Returns the user ID of this audit check item.
     *
     * @return the user ID of this audit check item
     */
    public long getUserId();

    /**
     * Sets the user ID of this audit check item.
     *
     * @param userId the user ID of this audit check item
     */
    public void setUserId(long userId);

    /**
     * Returns the user uuid of this audit check item.
     *
     * @return the user uuid of this audit check item
     * @throws SystemException if a system exception occurred
     */
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this audit check item.
     *
     * @param userUuid the user uuid of this audit check item
     */
    public void setUserUuid(String userUuid);

    /**
     * Returns the create date of this audit check item.
     *
     * @return the create date of this audit check item
     */
    public Date getCreateDate();

    /**
     * Sets the create date of this audit check item.
     *
     * @param createDate the create date of this audit check item
     */
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this audit check item.
     *
     * @return the modified date of this audit check item
     */
    public Date getModifiedDate();

    /**
     * Sets the modified date of this audit check item.
     *
     * @param modifiedDate the modified date of this audit check item
     */
    public void setModifiedDate(Date modifiedDate);

    /**
     * Returns the audit ID of this audit check item.
     *
     * @return the audit ID of this audit check item
     */
    public long getAuditId();

    /**
     * Sets the audit ID of this audit check item.
     *
     * @param AuditId the audit ID of this audit check item
     */
    public void setAuditId(long AuditId);

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
    public int compareTo(syneren.qms.audit.model.AuditCheckItem auditCheckItem);

    @Override
    public int hashCode();

    @Override
    public CacheModel<syneren.qms.audit.model.AuditCheckItem> toCacheModel();

    @Override
    public syneren.qms.audit.model.AuditCheckItem toEscapedModel();

    @Override
    public syneren.qms.audit.model.AuditCheckItem toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
