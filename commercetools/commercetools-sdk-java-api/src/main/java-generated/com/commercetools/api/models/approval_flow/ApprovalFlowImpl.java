
package com.commercetools.api.models.approval_flow;

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
 * ApprovalFlow
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalFlowImpl implements ApprovalFlow, ModelBase {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private com.commercetools.api.models.common.CreatedBy createdBy;

    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    private com.commercetools.api.models.order.OrderReference order;

    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit;

    private java.util.List<com.commercetools.api.models.approval_rule.ApprovalRule> rules;

    private com.commercetools.api.models.approval_flow.ApprovalFlowStatus status;

    private com.commercetools.api.models.approval_flow.ApprovalFlowRejection rejection;

    private java.util.List<com.commercetools.api.models.approval_flow.ApprovalFlowApproval> approvals;

    private java.util.List<com.commercetools.api.models.approval_rule.RuleApprover> eligibleApprovers;

    private java.util.List<com.commercetools.api.models.approval_rule.RuleApprover> pendingApprovers;

    private java.util.List<com.commercetools.api.models.approval_rule.RuleApprover> currentTierPendingApprovers;

    private com.commercetools.api.models.type.CustomFields custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ApprovalFlowImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy,
            @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy,
            @JsonProperty("order") final com.commercetools.api.models.order.OrderReference order,
            @JsonProperty("businessUnit") final com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit,
            @JsonProperty("rules") final java.util.List<com.commercetools.api.models.approval_rule.ApprovalRule> rules,
            @JsonProperty("status") final com.commercetools.api.models.approval_flow.ApprovalFlowStatus status,
            @JsonProperty("rejection") final com.commercetools.api.models.approval_flow.ApprovalFlowRejection rejection,
            @JsonProperty("approvals") final java.util.List<com.commercetools.api.models.approval_flow.ApprovalFlowApproval> approvals,
            @JsonProperty("eligibleApprovers") final java.util.List<com.commercetools.api.models.approval_rule.RuleApprover> eligibleApprovers,
            @JsonProperty("pendingApprovers") final java.util.List<com.commercetools.api.models.approval_rule.RuleApprover> pendingApprovers,
            @JsonProperty("currentTierPendingApprovers") final java.util.List<com.commercetools.api.models.approval_rule.RuleApprover> currentTierPendingApprovers,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.createdBy = createdBy;
        this.lastModifiedBy = lastModifiedBy;
        this.order = order;
        this.businessUnit = businessUnit;
        this.rules = rules;
        this.status = status;
        this.rejection = rejection;
        this.approvals = approvals;
        this.eligibleApprovers = eligibleApprovers;
        this.pendingApprovers = pendingApprovers;
        this.currentTierPendingApprovers = currentTierPendingApprovers;
        this.custom = custom;
    }

    /**
     * create empty instance
     */
    public ApprovalFlowImpl() {
    }

    /**
     *  <p>Unique identifier of the Approval Flow.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the Approval Flow.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the Approval Flow was initially created.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the Approval Flow was last updated.</p>
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>IDs and references that created the ApprovalFlow.</p>
     */

    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>IDs and references that last modified the ApprovalFlow.</p>
     */

    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>Order that needs to be approved.</p>
     */

    public com.commercetools.api.models.order.OrderReference getOrder() {
        return this.order;
    }

    /**
     *  <p>Business Unit the Approval Flow belongs to.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     *  <p>Approval Rules that matched the Order.</p>
     */

    public java.util.List<com.commercetools.api.models.approval_rule.ApprovalRule> getRules() {
        return this.rules;
    }

    /**
     *  <p>Indicates whether the Approval Flow is under review, approved, or rejected.</p>
     */

    public com.commercetools.api.models.approval_flow.ApprovalFlowStatus getStatus() {
        return this.status;
    }

    /**
     *  <p>Present when the status of the Approval Flow is <code>Rejected</code>.</p>
     */

    public com.commercetools.api.models.approval_flow.ApprovalFlowRejection getRejection() {
        return this.rejection;
    }

    /**
     *  <p>Existing approvals in the Approval Flow.</p>
     */

    public java.util.List<com.commercetools.api.models.approval_flow.ApprovalFlowApproval> getApprovals() {
        return this.approvals;
    }

    /**
     *  <p>Associate Roles that can approve according to the approver hierarchy tiers defined in <code>rules</code>. Associates are allowed to reject even after they have given approval, as long as the current approver hierarchy tier still contains their role.</p>
     */

    public java.util.List<com.commercetools.api.models.approval_rule.RuleApprover> getEligibleApprovers() {
        return this.eligibleApprovers;
    }

    /**
     *  <p>Associate Roles required for approval based on the approver hierarchy tiers defined in <code>rules</code> across all remaining tiers.</p>
     */

    public java.util.List<com.commercetools.api.models.approval_rule.RuleApprover> getPendingApprovers() {
        return this.pendingApprovers;
    }

    /**
     *  <p>Associate Roles required for approval based on the approver hierarchy tiers defined in <code>rules</code> only for the currently active tier(s).</p>
     */

    public java.util.List<com.commercetools.api.models.approval_rule.RuleApprover> getCurrentTierPendingApprovers() {
        return this.currentTierPendingApprovers;
    }

    /**
     *  <p>Custom Fields on the Approval Flow.</p>
     */

    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
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

    public void setOrder(final com.commercetools.api.models.order.OrderReference order) {
        this.order = order;
    }

    public void setBusinessUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit) {
        this.businessUnit = businessUnit;
    }

    public void setRules(final com.commercetools.api.models.approval_rule.ApprovalRule... rules) {
        this.rules = new ArrayList<>(Arrays.asList(rules));
    }

    public void setRules(final java.util.List<com.commercetools.api.models.approval_rule.ApprovalRule> rules) {
        this.rules = rules;
    }

    public void setStatus(final com.commercetools.api.models.approval_flow.ApprovalFlowStatus status) {
        this.status = status;
    }

    public void setRejection(final com.commercetools.api.models.approval_flow.ApprovalFlowRejection rejection) {
        this.rejection = rejection;
    }

    public void setApprovals(final com.commercetools.api.models.approval_flow.ApprovalFlowApproval... approvals) {
        this.approvals = new ArrayList<>(Arrays.asList(approvals));
    }

    public void setApprovals(
            final java.util.List<com.commercetools.api.models.approval_flow.ApprovalFlowApproval> approvals) {
        this.approvals = approvals;
    }

    public void setEligibleApprovers(
            final com.commercetools.api.models.approval_rule.RuleApprover... eligibleApprovers) {
        this.eligibleApprovers = new ArrayList<>(Arrays.asList(eligibleApprovers));
    }

    public void setEligibleApprovers(
            final java.util.List<com.commercetools.api.models.approval_rule.RuleApprover> eligibleApprovers) {
        this.eligibleApprovers = eligibleApprovers;
    }

    public void setPendingApprovers(final com.commercetools.api.models.approval_rule.RuleApprover... pendingApprovers) {
        this.pendingApprovers = new ArrayList<>(Arrays.asList(pendingApprovers));
    }

    public void setPendingApprovers(
            final java.util.List<com.commercetools.api.models.approval_rule.RuleApprover> pendingApprovers) {
        this.pendingApprovers = pendingApprovers;
    }

    public void setCurrentTierPendingApprovers(
            final com.commercetools.api.models.approval_rule.RuleApprover... currentTierPendingApprovers) {
        this.currentTierPendingApprovers = new ArrayList<>(Arrays.asList(currentTierPendingApprovers));
    }

    public void setCurrentTierPendingApprovers(
            final java.util.List<com.commercetools.api.models.approval_rule.RuleApprover> currentTierPendingApprovers) {
        this.currentTierPendingApprovers = currentTierPendingApprovers;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ApprovalFlowImpl that = (ApprovalFlowImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(createdBy, that.createdBy)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(order, that.order)
                .append(businessUnit, that.businessUnit)
                .append(rules, that.rules)
                .append(status, that.status)
                .append(rejection, that.rejection)
                .append(approvals, that.approvals)
                .append(eligibleApprovers, that.eligibleApprovers)
                .append(pendingApprovers, that.pendingApprovers)
                .append(currentTierPendingApprovers, that.currentTierPendingApprovers)
                .append(custom, that.custom)
                .append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(createdBy, that.createdBy)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(order, that.order)
                .append(businessUnit, that.businessUnit)
                .append(rules, that.rules)
                .append(status, that.status)
                .append(rejection, that.rejection)
                .append(approvals, that.approvals)
                .append(eligibleApprovers, that.eligibleApprovers)
                .append(pendingApprovers, that.pendingApprovers)
                .append(currentTierPendingApprovers, that.currentTierPendingApprovers)
                .append(custom, that.custom)
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
                .append(order)
                .append(businessUnit)
                .append(rules)
                .append(status)
                .append(rejection)
                .append(approvals)
                .append(eligibleApprovers)
                .append(pendingApprovers)
                .append(currentTierPendingApprovers)
                .append(custom)
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
                .append("order", order)
                .append("businessUnit", businessUnit)
                .append("rules", rules)
                .append("status", status)
                .append("rejection", rejection)
                .append("approvals", approvals)
                .append("eligibleApprovers", eligibleApprovers)
                .append("pendingApprovers", pendingApprovers)
                .append("currentTierPendingApprovers", currentTierPendingApprovers)
                .append("custom", custom)
                .build();
    }

}
