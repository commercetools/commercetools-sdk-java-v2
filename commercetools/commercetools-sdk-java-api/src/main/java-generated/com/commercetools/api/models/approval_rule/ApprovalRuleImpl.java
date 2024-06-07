
package com.commercetools.api.models.approval_rule;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * ApprovalRule
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalRuleImpl implements ApprovalRule, ModelBase {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private com.commercetools.api.models.common.CreatedBy createdBy;

    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    private String key;

    private String name;

    private String description;

    private com.commercetools.api.models.approval_rule.ApprovalRuleStatus status;

    private String predicate;

    private com.commercetools.api.models.approval_rule.ApproverHierarchy approvers;

    private java.util.List<com.commercetools.api.models.approval_rule.RuleRequester> requesters;

    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ApprovalRuleImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy,
            @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy,
            @JsonProperty("key") final String key, @JsonProperty("name") final String name,
            @JsonProperty("description") final String description,
            @JsonProperty("status") final com.commercetools.api.models.approval_rule.ApprovalRuleStatus status,
            @JsonProperty("predicate") final String predicate,
            @JsonProperty("approvers") final com.commercetools.api.models.approval_rule.ApproverHierarchy approvers,
            @JsonProperty("requesters") final java.util.List<com.commercetools.api.models.approval_rule.RuleRequester> requesters,
            @JsonProperty("businessUnit") final com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.createdBy = createdBy;
        this.lastModifiedBy = lastModifiedBy;
        this.key = key;
        this.name = name;
        this.description = description;
        this.status = status;
        this.predicate = predicate;
        this.approvers = approvers;
        this.requesters = requesters;
        this.businessUnit = businessUnit;
    }

    /**
     * create empty instance
     */
    public ApprovalRuleImpl() {
    }

    /**
     *  <p>Unique identifier of the Approval Rule.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the Approval Rule.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the Approval Rule was initially created.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the Approval Rule was last updated.</p>
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>IDs and references that created the ApprovalRule.</p>
     */

    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>IDs and references that last modified the ApprovalRule.</p>
     */

    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>User-defined unique identifier of the Approval Rule. Must be unique within a Business Unit.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Name of the Approval Rule.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Description of the Approval Rule.</p>
     */

    public String getDescription() {
        return this.description;
    }

    /**
     *  <p>Indicates whether the Approval Rule should be matched against Orders or not.</p>
     */

    public com.commercetools.api.models.approval_rule.ApprovalRuleStatus getStatus() {
        return this.status;
    }

    /**
     *  <p>The Order Predicate describing the Orders the Approval Rule should match against.</p>
     */

    public String getPredicate() {
        return this.predicate;
    }

    /**
     *  <p>The hierarchy of approvers within the Approval Rule.</p>
     */

    public com.commercetools.api.models.approval_rule.ApproverHierarchy getApprovers() {
        return this.approvers;
    }

    /**
     *  <p>The Associate Roles customers must hold for their Order to require approval.</p>
     */

    public java.util.List<com.commercetools.api.models.approval_rule.RuleRequester> getRequesters() {
        return this.requesters;
    }

    /**
     *  <p>The Business Unit the Approval Rule belongs to.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getBusinessUnit() {
        return this.businessUnit;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
    }

    public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setStatus(final com.commercetools.api.models.approval_rule.ApprovalRuleStatus status) {
        this.status = status;
    }

    public void setPredicate(final String predicate) {
        this.predicate = predicate;
    }

    public void setApprovers(final com.commercetools.api.models.approval_rule.ApproverHierarchy approvers) {
        this.approvers = approvers;
    }

    public void setRequesters(final com.commercetools.api.models.approval_rule.RuleRequester... requesters) {
        this.requesters = new ArrayList<>(Arrays.asList(requesters));
    }

    public void setRequesters(
            final java.util.List<com.commercetools.api.models.approval_rule.RuleRequester> requesters) {
        this.requesters = requesters;
    }

    public void setBusinessUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit) {
        this.businessUnit = businessUnit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ApprovalRuleImpl that = (ApprovalRuleImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(createdBy, that.createdBy)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(key, that.key)
                .append(name, that.name)
                .append(description, that.description)
                .append(status, that.status)
                .append(predicate, that.predicate)
                .append(approvers, that.approvers)
                .append(requesters, that.requesters)
                .append(businessUnit, that.businessUnit)
                .append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(createdBy, that.createdBy)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(key, that.key)
                .append(name, that.name)
                .append(description, that.description)
                .append(status, that.status)
                .append(predicate, that.predicate)
                .append(approvers, that.approvers)
                .append(requesters, that.requesters)
                .append(businessUnit, that.businessUnit)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(version)
                .append(createdAt)
                .append(lastModifiedAt)
                .append(createdBy)
                .append(lastModifiedBy)
                .append(key)
                .append(name)
                .append(description)
                .append(status)
                .append(predicate)
                .append(approvers)
                .append(requesters)
                .append(businessUnit)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("version", version)
                .append("createdAt", createdAt)
                .append("lastModifiedAt", lastModifiedAt)
                .append("createdBy", createdBy)
                .append("lastModifiedBy", lastModifiedBy)
                .append("key", key)
                .append("name", name)
                .append("description", description)
                .append("status", status)
                .append("predicate", predicate)
                .append("approvers", approvers)
                .append("requesters", requesters)
                .append("businessUnit", businessUnit)
                .build();
    }

}
