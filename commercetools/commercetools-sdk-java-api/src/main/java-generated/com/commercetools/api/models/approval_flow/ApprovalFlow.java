
package com.commercetools.api.models.approval_flow;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.approval_rule.ApprovalRule;
import com.commercetools.api.models.approval_rule.RuleApprover;
import com.commercetools.api.models.business_unit.BusinessUnitKeyReference;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.order.OrderReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalFlow
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalFlow approvalFlow = ApprovalFlow.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .order(orderBuilder -> orderBuilder)
 *             .businessUnit(businessUnitBuilder -> businessUnitBuilder)
 *             .plusRules(rulesBuilder -> rulesBuilder)
 *             .status(ApprovalFlowStatus.PENDING)
 *             .plusApprovals(approvalsBuilder -> approvalsBuilder)
 *             .plusEligibleApprovers(eligibleApproversBuilder -> eligibleApproversBuilder)
 *             .plusPendingApprovers(pendingApproversBuilder -> pendingApproversBuilder)
 *             .plusCurrentTierPendingApprovers(currentTierPendingApproversBuilder -> currentTierPendingApproversBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalFlowImpl.class)
public interface ApprovalFlow extends BaseResource {

    /**
     *  <p>Unique identifier of the Approval Flow.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the Approval Flow.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the Approval Flow was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>Date and time (UTC) the Approval Flow was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>Order that needs to be approved.</p>
     * @return order
     */
    @NotNull
    @Valid
    @JsonProperty("order")
    public OrderReference getOrder();

    /**
     *  <p>Business Unit the Approval Flow belongs to.</p>
     * @return businessUnit
     */
    @NotNull
    @Valid
    @JsonProperty("businessUnit")
    public BusinessUnitKeyReference getBusinessUnit();

    /**
     *  <p>Approval Rules that matched the Order.</p>
     * @return rules
     */
    @NotNull
    @Valid
    @JsonProperty("rules")
    public List<ApprovalRule> getRules();

    /**
     *  <p>Indicates whether the Approval Flow is under review, approved, or rejected.</p>
     * @return status
     */
    @NotNull
    @JsonProperty("status")
    public ApprovalFlowStatus getStatus();

    /**
     *  <p>Present when the status of the Approval Flow is <code>Rejected</code>.</p>
     * @return rejection
     */
    @Valid
    @JsonProperty("rejection")
    public ApprovalFlowRejection getRejection();

    /**
     *  <p>Existing approvals in the Approval Flow.</p>
     * @return approvals
     */
    @NotNull
    @Valid
    @JsonProperty("approvals")
    public List<ApprovalFlowApproval> getApprovals();

    /**
     *  <p>Associate Roles that can approve according to the approver hierarchy tiers defined in <code>rules</code>. Associates are allowed to reject even after they have given approval, as long as the current approver hierarchy tier still contains their role.</p>
     * @return eligibleApprovers
     */
    @NotNull
    @Valid
    @JsonProperty("eligibleApprovers")
    public List<RuleApprover> getEligibleApprovers();

    /**
     *  <p>Associate Roles required for approval based on the approver hierarchy tiers defined in <code>rules</code> across all remaining tiers.</p>
     * @return pendingApprovers
     */
    @NotNull
    @Valid
    @JsonProperty("pendingApprovers")
    public List<RuleApprover> getPendingApprovers();

    /**
     *  <p>Associate Roles required for approval based on the approver hierarchy tiers defined in <code>rules</code> only for the currently active tier(s).</p>
     * @return currentTierPendingApprovers
     */
    @NotNull
    @Valid
    @JsonProperty("currentTierPendingApprovers")
    public List<RuleApprover> getCurrentTierPendingApprovers();

    /**
     *  <p>Unique identifier of the Approval Flow.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the Approval Flow.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Date and time (UTC) the Approval Flow was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     *  <p>Date and time (UTC) the Approval Flow was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>Order that needs to be approved.</p>
     * @param order value to be set
     */

    public void setOrder(final OrderReference order);

    /**
     *  <p>Business Unit the Approval Flow belongs to.</p>
     * @param businessUnit value to be set
     */

    public void setBusinessUnit(final BusinessUnitKeyReference businessUnit);

    /**
     *  <p>Approval Rules that matched the Order.</p>
     * @param rules values to be set
     */

    @JsonIgnore
    public void setRules(final ApprovalRule... rules);

    /**
     *  <p>Approval Rules that matched the Order.</p>
     * @param rules values to be set
     */

    public void setRules(final List<ApprovalRule> rules);

    /**
     *  <p>Indicates whether the Approval Flow is under review, approved, or rejected.</p>
     * @param status value to be set
     */

    public void setStatus(final ApprovalFlowStatus status);

    /**
     *  <p>Present when the status of the Approval Flow is <code>Rejected</code>.</p>
     * @param rejection value to be set
     */

    public void setRejection(final ApprovalFlowRejection rejection);

    /**
     *  <p>Existing approvals in the Approval Flow.</p>
     * @param approvals values to be set
     */

    @JsonIgnore
    public void setApprovals(final ApprovalFlowApproval... approvals);

    /**
     *  <p>Existing approvals in the Approval Flow.</p>
     * @param approvals values to be set
     */

    public void setApprovals(final List<ApprovalFlowApproval> approvals);

    /**
     *  <p>Associate Roles that can approve according to the approver hierarchy tiers defined in <code>rules</code>. Associates are allowed to reject even after they have given approval, as long as the current approver hierarchy tier still contains their role.</p>
     * @param eligibleApprovers values to be set
     */

    @JsonIgnore
    public void setEligibleApprovers(final RuleApprover... eligibleApprovers);

    /**
     *  <p>Associate Roles that can approve according to the approver hierarchy tiers defined in <code>rules</code>. Associates are allowed to reject even after they have given approval, as long as the current approver hierarchy tier still contains their role.</p>
     * @param eligibleApprovers values to be set
     */

    public void setEligibleApprovers(final List<RuleApprover> eligibleApprovers);

    /**
     *  <p>Associate Roles required for approval based on the approver hierarchy tiers defined in <code>rules</code> across all remaining tiers.</p>
     * @param pendingApprovers values to be set
     */

    @JsonIgnore
    public void setPendingApprovers(final RuleApprover... pendingApprovers);

    /**
     *  <p>Associate Roles required for approval based on the approver hierarchy tiers defined in <code>rules</code> across all remaining tiers.</p>
     * @param pendingApprovers values to be set
     */

    public void setPendingApprovers(final List<RuleApprover> pendingApprovers);

    /**
     *  <p>Associate Roles required for approval based on the approver hierarchy tiers defined in <code>rules</code> only for the currently active tier(s).</p>
     * @param currentTierPendingApprovers values to be set
     */

    @JsonIgnore
    public void setCurrentTierPendingApprovers(final RuleApprover... currentTierPendingApprovers);

    /**
     *  <p>Associate Roles required for approval based on the approver hierarchy tiers defined in <code>rules</code> only for the currently active tier(s).</p>
     * @param currentTierPendingApprovers values to be set
     */

    public void setCurrentTierPendingApprovers(final List<RuleApprover> currentTierPendingApprovers);

    /**
     * factory method
     * @return instance of ApprovalFlow
     */
    public static ApprovalFlow of() {
        return new ApprovalFlowImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalFlow
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalFlow of(final ApprovalFlow template) {
        ApprovalFlowImpl instance = new ApprovalFlowImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setOrder(template.getOrder());
        instance.setBusinessUnit(template.getBusinessUnit());
        instance.setRules(template.getRules());
        instance.setStatus(template.getStatus());
        instance.setRejection(template.getRejection());
        instance.setApprovals(template.getApprovals());
        instance.setEligibleApprovers(template.getEligibleApprovers());
        instance.setPendingApprovers(template.getPendingApprovers());
        instance.setCurrentTierPendingApprovers(template.getCurrentTierPendingApprovers());
        return instance;
    }

    /**
     * factory method to create a deep copy of ApprovalFlow
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalFlow deepCopy(@Nullable final ApprovalFlow template) {
        if (template == null) {
            return null;
        }
        ApprovalFlowImpl instance = new ApprovalFlowImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setOrder(com.commercetools.api.models.order.OrderReference.deepCopy(template.getOrder()));
        instance.setBusinessUnit(
            com.commercetools.api.models.business_unit.BusinessUnitKeyReference.deepCopy(template.getBusinessUnit()));
        instance.setRules(Optional.ofNullable(template.getRules())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.approval_rule.ApprovalRule::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setStatus(template.getStatus());
        instance.setRejection(
            com.commercetools.api.models.approval_flow.ApprovalFlowRejection.deepCopy(template.getRejection()));
        instance.setApprovals(Optional.ofNullable(template.getApprovals())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.approval_flow.ApprovalFlowApproval::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setEligibleApprovers(Optional.ofNullable(template.getEligibleApprovers())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.approval_rule.RuleApprover::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setPendingApprovers(Optional.ofNullable(template.getPendingApprovers())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.approval_rule.RuleApprover::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCurrentTierPendingApprovers(Optional.ofNullable(template.getCurrentTierPendingApprovers())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.approval_rule.RuleApprover::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ApprovalFlow
     * @return builder
     */
    public static ApprovalFlowBuilder builder() {
        return ApprovalFlowBuilder.of();
    }

    /**
     * create builder for ApprovalFlow instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalFlowBuilder builder(final ApprovalFlow template) {
        return ApprovalFlowBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalFlow(Function<ApprovalFlow, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalFlow> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalFlow>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalFlow>";
            }
        };
    }
}
