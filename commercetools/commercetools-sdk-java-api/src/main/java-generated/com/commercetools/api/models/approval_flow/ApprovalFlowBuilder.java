
package com.commercetools.api.models.approval_flow;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalFlowBuilder
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
public class ApprovalFlowBuilder implements Builder<ApprovalFlow> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    private com.commercetools.api.models.order.OrderReference order;

    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit;

    private java.util.List<com.commercetools.api.models.approval_rule.ApprovalRule> rules;

    private com.commercetools.api.models.approval_flow.ApprovalFlowStatus status;

    @Nullable
    private com.commercetools.api.models.approval_flow.ApprovalFlowRejection rejection;

    private java.util.List<com.commercetools.api.models.approval_flow.ApprovalFlowApproval> approvals;

    private java.util.List<com.commercetools.api.models.approval_rule.RuleApprover> eligibleApprovers;

    private java.util.List<com.commercetools.api.models.approval_rule.RuleApprover> pendingApprovers;

    private java.util.List<com.commercetools.api.models.approval_rule.RuleApprover> currentTierPendingApprovers;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    /**
     *  <p>Unique identifier of the Approval Flow.</p>
     * @param id value to be set
     * @return Builder
     */

    public ApprovalFlowBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the Approval Flow.</p>
     * @param version value to be set
     * @return Builder
     */

    public ApprovalFlowBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Approval Flow was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public ApprovalFlowBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Approval Flow was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public ApprovalFlowBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>IDs and references that created the ApprovalFlow.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public ApprovalFlowBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the ApprovalFlow.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public ApprovalFlowBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the ApprovalFlow.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public ApprovalFlowBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the ApprovalFlow.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public ApprovalFlowBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the ApprovalFlow.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public ApprovalFlowBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the ApprovalFlow.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public ApprovalFlowBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Order that needs to be approved.</p>
     * @param builder function to build the order value
     * @return Builder
     */

    public ApprovalFlowBuilder order(
            Function<com.commercetools.api.models.order.OrderReferenceBuilder, com.commercetools.api.models.order.OrderReferenceBuilder> builder) {
        this.order = builder.apply(com.commercetools.api.models.order.OrderReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Order that needs to be approved.</p>
     * @param builder function to build the order value
     * @return Builder
     */

    public ApprovalFlowBuilder withOrder(
            Function<com.commercetools.api.models.order.OrderReferenceBuilder, com.commercetools.api.models.order.OrderReference> builder) {
        this.order = builder.apply(com.commercetools.api.models.order.OrderReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Order that needs to be approved.</p>
     * @param order value to be set
     * @return Builder
     */

    public ApprovalFlowBuilder order(final com.commercetools.api.models.order.OrderReference order) {
        this.order = order;
        return this;
    }

    /**
     *  <p>Business Unit the Approval Flow belongs to.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public ApprovalFlowBuilder businessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Business Unit the Approval Flow belongs to.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public ApprovalFlowBuilder withBusinessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReference> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Business Unit the Approval Flow belongs to.</p>
     * @param businessUnit value to be set
     * @return Builder
     */

    public ApprovalFlowBuilder businessUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }

    /**
     *  <p>Approval Rules that matched the Order.</p>
     * @param rules value to be set
     * @return Builder
     */

    public ApprovalFlowBuilder rules(final com.commercetools.api.models.approval_rule.ApprovalRule... rules) {
        this.rules = new ArrayList<>(Arrays.asList(rules));
        return this;
    }

    /**
     *  <p>Approval Rules that matched the Order.</p>
     * @param rules value to be set
     * @return Builder
     */

    public ApprovalFlowBuilder rules(
            final java.util.List<com.commercetools.api.models.approval_rule.ApprovalRule> rules) {
        this.rules = rules;
        return this;
    }

    /**
     *  <p>Approval Rules that matched the Order.</p>
     * @param rules value to be set
     * @return Builder
     */

    public ApprovalFlowBuilder plusRules(final com.commercetools.api.models.approval_rule.ApprovalRule... rules) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.addAll(Arrays.asList(rules));
        return this;
    }

    /**
     *  <p>Approval Rules that matched the Order.</p>
     * @param builder function to build the rules value
     * @return Builder
     */

    public ApprovalFlowBuilder plusRules(
            Function<com.commercetools.api.models.approval_rule.ApprovalRuleBuilder, com.commercetools.api.models.approval_rule.ApprovalRuleBuilder> builder) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(builder.apply(com.commercetools.api.models.approval_rule.ApprovalRuleBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Approval Rules that matched the Order.</p>
     * @param builder function to build the rules value
     * @return Builder
     */

    public ApprovalFlowBuilder withRules(
            Function<com.commercetools.api.models.approval_rule.ApprovalRuleBuilder, com.commercetools.api.models.approval_rule.ApprovalRuleBuilder> builder) {
        this.rules = new ArrayList<>();
        this.rules.add(builder.apply(com.commercetools.api.models.approval_rule.ApprovalRuleBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Approval Rules that matched the Order.</p>
     * @param builder function to build the rules value
     * @return Builder
     */

    public ApprovalFlowBuilder addRules(
            Function<com.commercetools.api.models.approval_rule.ApprovalRuleBuilder, com.commercetools.api.models.approval_rule.ApprovalRule> builder) {
        return plusRules(builder.apply(com.commercetools.api.models.approval_rule.ApprovalRuleBuilder.of()));
    }

    /**
     *  <p>Approval Rules that matched the Order.</p>
     * @param builder function to build the rules value
     * @return Builder
     */

    public ApprovalFlowBuilder setRules(
            Function<com.commercetools.api.models.approval_rule.ApprovalRuleBuilder, com.commercetools.api.models.approval_rule.ApprovalRule> builder) {
        return rules(builder.apply(com.commercetools.api.models.approval_rule.ApprovalRuleBuilder.of()));
    }

    /**
     *  <p>Indicates whether the Approval Flow is under review, approved, or rejected.</p>
     * @param status value to be set
     * @return Builder
     */

    public ApprovalFlowBuilder status(final com.commercetools.api.models.approval_flow.ApprovalFlowStatus status) {
        this.status = status;
        return this;
    }

    /**
     *  <p>Present when the status of the Approval Flow is <code>Rejected</code>.</p>
     * @param builder function to build the rejection value
     * @return Builder
     */

    public ApprovalFlowBuilder rejection(
            Function<com.commercetools.api.models.approval_flow.ApprovalFlowRejectionBuilder, com.commercetools.api.models.approval_flow.ApprovalFlowRejectionBuilder> builder) {
        this.rejection = builder.apply(com.commercetools.api.models.approval_flow.ApprovalFlowRejectionBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Present when the status of the Approval Flow is <code>Rejected</code>.</p>
     * @param builder function to build the rejection value
     * @return Builder
     */

    public ApprovalFlowBuilder withRejection(
            Function<com.commercetools.api.models.approval_flow.ApprovalFlowRejectionBuilder, com.commercetools.api.models.approval_flow.ApprovalFlowRejection> builder) {
        this.rejection = builder.apply(com.commercetools.api.models.approval_flow.ApprovalFlowRejectionBuilder.of());
        return this;
    }

    /**
     *  <p>Present when the status of the Approval Flow is <code>Rejected</code>.</p>
     * @param rejection value to be set
     * @return Builder
     */

    public ApprovalFlowBuilder rejection(
            @Nullable final com.commercetools.api.models.approval_flow.ApprovalFlowRejection rejection) {
        this.rejection = rejection;
        return this;
    }

    /**
     *  <p>Existing approvals in the Approval Flow.</p>
     * @param approvals value to be set
     * @return Builder
     */

    public ApprovalFlowBuilder approvals(
            final com.commercetools.api.models.approval_flow.ApprovalFlowApproval... approvals) {
        this.approvals = new ArrayList<>(Arrays.asList(approvals));
        return this;
    }

    /**
     *  <p>Existing approvals in the Approval Flow.</p>
     * @param approvals value to be set
     * @return Builder
     */

    public ApprovalFlowBuilder approvals(
            final java.util.List<com.commercetools.api.models.approval_flow.ApprovalFlowApproval> approvals) {
        this.approvals = approvals;
        return this;
    }

    /**
     *  <p>Existing approvals in the Approval Flow.</p>
     * @param approvals value to be set
     * @return Builder
     */

    public ApprovalFlowBuilder plusApprovals(
            final com.commercetools.api.models.approval_flow.ApprovalFlowApproval... approvals) {
        if (this.approvals == null) {
            this.approvals = new ArrayList<>();
        }
        this.approvals.addAll(Arrays.asList(approvals));
        return this;
    }

    /**
     *  <p>Existing approvals in the Approval Flow.</p>
     * @param builder function to build the approvals value
     * @return Builder
     */

    public ApprovalFlowBuilder plusApprovals(
            Function<com.commercetools.api.models.approval_flow.ApprovalFlowApprovalBuilder, com.commercetools.api.models.approval_flow.ApprovalFlowApprovalBuilder> builder) {
        if (this.approvals == null) {
            this.approvals = new ArrayList<>();
        }
        this.approvals.add(
            builder.apply(com.commercetools.api.models.approval_flow.ApprovalFlowApprovalBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Existing approvals in the Approval Flow.</p>
     * @param builder function to build the approvals value
     * @return Builder
     */

    public ApprovalFlowBuilder withApprovals(
            Function<com.commercetools.api.models.approval_flow.ApprovalFlowApprovalBuilder, com.commercetools.api.models.approval_flow.ApprovalFlowApprovalBuilder> builder) {
        this.approvals = new ArrayList<>();
        this.approvals.add(
            builder.apply(com.commercetools.api.models.approval_flow.ApprovalFlowApprovalBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Existing approvals in the Approval Flow.</p>
     * @param builder function to build the approvals value
     * @return Builder
     */

    public ApprovalFlowBuilder addApprovals(
            Function<com.commercetools.api.models.approval_flow.ApprovalFlowApprovalBuilder, com.commercetools.api.models.approval_flow.ApprovalFlowApproval> builder) {
        return plusApprovals(
            builder.apply(com.commercetools.api.models.approval_flow.ApprovalFlowApprovalBuilder.of()));
    }

    /**
     *  <p>Existing approvals in the Approval Flow.</p>
     * @param builder function to build the approvals value
     * @return Builder
     */

    public ApprovalFlowBuilder setApprovals(
            Function<com.commercetools.api.models.approval_flow.ApprovalFlowApprovalBuilder, com.commercetools.api.models.approval_flow.ApprovalFlowApproval> builder) {
        return approvals(builder.apply(com.commercetools.api.models.approval_flow.ApprovalFlowApprovalBuilder.of()));
    }

    /**
     *  <p>Associate Roles that can approve according to the approver hierarchy tiers defined in <code>rules</code>. Associates are allowed to reject even after they have given approval, as long as the current approver hierarchy tier still contains their role.</p>
     * @param eligibleApprovers value to be set
     * @return Builder
     */

    public ApprovalFlowBuilder eligibleApprovers(
            final com.commercetools.api.models.approval_rule.RuleApprover... eligibleApprovers) {
        this.eligibleApprovers = new ArrayList<>(Arrays.asList(eligibleApprovers));
        return this;
    }

    /**
     *  <p>Associate Roles that can approve according to the approver hierarchy tiers defined in <code>rules</code>. Associates are allowed to reject even after they have given approval, as long as the current approver hierarchy tier still contains their role.</p>
     * @param eligibleApprovers value to be set
     * @return Builder
     */

    public ApprovalFlowBuilder eligibleApprovers(
            final java.util.List<com.commercetools.api.models.approval_rule.RuleApprover> eligibleApprovers) {
        this.eligibleApprovers = eligibleApprovers;
        return this;
    }

    /**
     *  <p>Associate Roles that can approve according to the approver hierarchy tiers defined in <code>rules</code>. Associates are allowed to reject even after they have given approval, as long as the current approver hierarchy tier still contains their role.</p>
     * @param eligibleApprovers value to be set
     * @return Builder
     */

    public ApprovalFlowBuilder plusEligibleApprovers(
            final com.commercetools.api.models.approval_rule.RuleApprover... eligibleApprovers) {
        if (this.eligibleApprovers == null) {
            this.eligibleApprovers = new ArrayList<>();
        }
        this.eligibleApprovers.addAll(Arrays.asList(eligibleApprovers));
        return this;
    }

    /**
     *  <p>Associate Roles that can approve according to the approver hierarchy tiers defined in <code>rules</code>. Associates are allowed to reject even after they have given approval, as long as the current approver hierarchy tier still contains their role.</p>
     * @param builder function to build the eligibleApprovers value
     * @return Builder
     */

    public ApprovalFlowBuilder plusEligibleApprovers(
            Function<com.commercetools.api.models.approval_rule.RuleApproverBuilder, com.commercetools.api.models.approval_rule.RuleApproverBuilder> builder) {
        if (this.eligibleApprovers == null) {
            this.eligibleApprovers = new ArrayList<>();
        }
        this.eligibleApprovers
                .add(builder.apply(com.commercetools.api.models.approval_rule.RuleApproverBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Associate Roles that can approve according to the approver hierarchy tiers defined in <code>rules</code>. Associates are allowed to reject even after they have given approval, as long as the current approver hierarchy tier still contains their role.</p>
     * @param builder function to build the eligibleApprovers value
     * @return Builder
     */

    public ApprovalFlowBuilder withEligibleApprovers(
            Function<com.commercetools.api.models.approval_rule.RuleApproverBuilder, com.commercetools.api.models.approval_rule.RuleApproverBuilder> builder) {
        this.eligibleApprovers = new ArrayList<>();
        this.eligibleApprovers
                .add(builder.apply(com.commercetools.api.models.approval_rule.RuleApproverBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Associate Roles that can approve according to the approver hierarchy tiers defined in <code>rules</code>. Associates are allowed to reject even after they have given approval, as long as the current approver hierarchy tier still contains their role.</p>
     * @param builder function to build the eligibleApprovers value
     * @return Builder
     */

    public ApprovalFlowBuilder addEligibleApprovers(
            Function<com.commercetools.api.models.approval_rule.RuleApproverBuilder, com.commercetools.api.models.approval_rule.RuleApprover> builder) {
        return plusEligibleApprovers(
            builder.apply(com.commercetools.api.models.approval_rule.RuleApproverBuilder.of()));
    }

    /**
     *  <p>Associate Roles that can approve according to the approver hierarchy tiers defined in <code>rules</code>. Associates are allowed to reject even after they have given approval, as long as the current approver hierarchy tier still contains their role.</p>
     * @param builder function to build the eligibleApprovers value
     * @return Builder
     */

    public ApprovalFlowBuilder setEligibleApprovers(
            Function<com.commercetools.api.models.approval_rule.RuleApproverBuilder, com.commercetools.api.models.approval_rule.RuleApprover> builder) {
        return eligibleApprovers(builder.apply(com.commercetools.api.models.approval_rule.RuleApproverBuilder.of()));
    }

    /**
     *  <p>Associate Roles required for approval based on the approver hierarchy tiers defined in <code>rules</code> across all remaining tiers.</p>
     * @param pendingApprovers value to be set
     * @return Builder
     */

    public ApprovalFlowBuilder pendingApprovers(
            final com.commercetools.api.models.approval_rule.RuleApprover... pendingApprovers) {
        this.pendingApprovers = new ArrayList<>(Arrays.asList(pendingApprovers));
        return this;
    }

    /**
     *  <p>Associate Roles required for approval based on the approver hierarchy tiers defined in <code>rules</code> across all remaining tiers.</p>
     * @param pendingApprovers value to be set
     * @return Builder
     */

    public ApprovalFlowBuilder pendingApprovers(
            final java.util.List<com.commercetools.api.models.approval_rule.RuleApprover> pendingApprovers) {
        this.pendingApprovers = pendingApprovers;
        return this;
    }

    /**
     *  <p>Associate Roles required for approval based on the approver hierarchy tiers defined in <code>rules</code> across all remaining tiers.</p>
     * @param pendingApprovers value to be set
     * @return Builder
     */

    public ApprovalFlowBuilder plusPendingApprovers(
            final com.commercetools.api.models.approval_rule.RuleApprover... pendingApprovers) {
        if (this.pendingApprovers == null) {
            this.pendingApprovers = new ArrayList<>();
        }
        this.pendingApprovers.addAll(Arrays.asList(pendingApprovers));
        return this;
    }

    /**
     *  <p>Associate Roles required for approval based on the approver hierarchy tiers defined in <code>rules</code> across all remaining tiers.</p>
     * @param builder function to build the pendingApprovers value
     * @return Builder
     */

    public ApprovalFlowBuilder plusPendingApprovers(
            Function<com.commercetools.api.models.approval_rule.RuleApproverBuilder, com.commercetools.api.models.approval_rule.RuleApproverBuilder> builder) {
        if (this.pendingApprovers == null) {
            this.pendingApprovers = new ArrayList<>();
        }
        this.pendingApprovers
                .add(builder.apply(com.commercetools.api.models.approval_rule.RuleApproverBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Associate Roles required for approval based on the approver hierarchy tiers defined in <code>rules</code> across all remaining tiers.</p>
     * @param builder function to build the pendingApprovers value
     * @return Builder
     */

    public ApprovalFlowBuilder withPendingApprovers(
            Function<com.commercetools.api.models.approval_rule.RuleApproverBuilder, com.commercetools.api.models.approval_rule.RuleApproverBuilder> builder) {
        this.pendingApprovers = new ArrayList<>();
        this.pendingApprovers
                .add(builder.apply(com.commercetools.api.models.approval_rule.RuleApproverBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Associate Roles required for approval based on the approver hierarchy tiers defined in <code>rules</code> across all remaining tiers.</p>
     * @param builder function to build the pendingApprovers value
     * @return Builder
     */

    public ApprovalFlowBuilder addPendingApprovers(
            Function<com.commercetools.api.models.approval_rule.RuleApproverBuilder, com.commercetools.api.models.approval_rule.RuleApprover> builder) {
        return plusPendingApprovers(builder.apply(com.commercetools.api.models.approval_rule.RuleApproverBuilder.of()));
    }

    /**
     *  <p>Associate Roles required for approval based on the approver hierarchy tiers defined in <code>rules</code> across all remaining tiers.</p>
     * @param builder function to build the pendingApprovers value
     * @return Builder
     */

    public ApprovalFlowBuilder setPendingApprovers(
            Function<com.commercetools.api.models.approval_rule.RuleApproverBuilder, com.commercetools.api.models.approval_rule.RuleApprover> builder) {
        return pendingApprovers(builder.apply(com.commercetools.api.models.approval_rule.RuleApproverBuilder.of()));
    }

    /**
     *  <p>Associate Roles required for approval based on the approver hierarchy tiers defined in <code>rules</code> only for the currently active tier(s).</p>
     * @param currentTierPendingApprovers value to be set
     * @return Builder
     */

    public ApprovalFlowBuilder currentTierPendingApprovers(
            final com.commercetools.api.models.approval_rule.RuleApprover... currentTierPendingApprovers) {
        this.currentTierPendingApprovers = new ArrayList<>(Arrays.asList(currentTierPendingApprovers));
        return this;
    }

    /**
     *  <p>Associate Roles required for approval based on the approver hierarchy tiers defined in <code>rules</code> only for the currently active tier(s).</p>
     * @param currentTierPendingApprovers value to be set
     * @return Builder
     */

    public ApprovalFlowBuilder currentTierPendingApprovers(
            final java.util.List<com.commercetools.api.models.approval_rule.RuleApprover> currentTierPendingApprovers) {
        this.currentTierPendingApprovers = currentTierPendingApprovers;
        return this;
    }

    /**
     *  <p>Associate Roles required for approval based on the approver hierarchy tiers defined in <code>rules</code> only for the currently active tier(s).</p>
     * @param currentTierPendingApprovers value to be set
     * @return Builder
     */

    public ApprovalFlowBuilder plusCurrentTierPendingApprovers(
            final com.commercetools.api.models.approval_rule.RuleApprover... currentTierPendingApprovers) {
        if (this.currentTierPendingApprovers == null) {
            this.currentTierPendingApprovers = new ArrayList<>();
        }
        this.currentTierPendingApprovers.addAll(Arrays.asList(currentTierPendingApprovers));
        return this;
    }

    /**
     *  <p>Associate Roles required for approval based on the approver hierarchy tiers defined in <code>rules</code> only for the currently active tier(s).</p>
     * @param builder function to build the currentTierPendingApprovers value
     * @return Builder
     */

    public ApprovalFlowBuilder plusCurrentTierPendingApprovers(
            Function<com.commercetools.api.models.approval_rule.RuleApproverBuilder, com.commercetools.api.models.approval_rule.RuleApproverBuilder> builder) {
        if (this.currentTierPendingApprovers == null) {
            this.currentTierPendingApprovers = new ArrayList<>();
        }
        this.currentTierPendingApprovers
                .add(builder.apply(com.commercetools.api.models.approval_rule.RuleApproverBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Associate Roles required for approval based on the approver hierarchy tiers defined in <code>rules</code> only for the currently active tier(s).</p>
     * @param builder function to build the currentTierPendingApprovers value
     * @return Builder
     */

    public ApprovalFlowBuilder withCurrentTierPendingApprovers(
            Function<com.commercetools.api.models.approval_rule.RuleApproverBuilder, com.commercetools.api.models.approval_rule.RuleApproverBuilder> builder) {
        this.currentTierPendingApprovers = new ArrayList<>();
        this.currentTierPendingApprovers
                .add(builder.apply(com.commercetools.api.models.approval_rule.RuleApproverBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Associate Roles required for approval based on the approver hierarchy tiers defined in <code>rules</code> only for the currently active tier(s).</p>
     * @param builder function to build the currentTierPendingApprovers value
     * @return Builder
     */

    public ApprovalFlowBuilder addCurrentTierPendingApprovers(
            Function<com.commercetools.api.models.approval_rule.RuleApproverBuilder, com.commercetools.api.models.approval_rule.RuleApprover> builder) {
        return plusCurrentTierPendingApprovers(
            builder.apply(com.commercetools.api.models.approval_rule.RuleApproverBuilder.of()));
    }

    /**
     *  <p>Associate Roles required for approval based on the approver hierarchy tiers defined in <code>rules</code> only for the currently active tier(s).</p>
     * @param builder function to build the currentTierPendingApprovers value
     * @return Builder
     */

    public ApprovalFlowBuilder setCurrentTierPendingApprovers(
            Function<com.commercetools.api.models.approval_rule.RuleApproverBuilder, com.commercetools.api.models.approval_rule.RuleApprover> builder) {
        return currentTierPendingApprovers(
            builder.apply(com.commercetools.api.models.approval_rule.RuleApproverBuilder.of()));
    }

    /**
     *  <p>Custom Fields on the Approval Flow.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public ApprovalFlowBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields on the Approval Flow.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public ApprovalFlowBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields on the Approval Flow.</p>
     * @param custom value to be set
     * @return Builder
     */

    public ApprovalFlowBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Unique identifier of the Approval Flow.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the Approval Flow.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the Approval Flow was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the Approval Flow was last updated.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>IDs and references that created the ApprovalFlow.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>IDs and references that last modified the ApprovalFlow.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>Order that needs to be approved.</p>
     * @return order
     */

    public com.commercetools.api.models.order.OrderReference getOrder() {
        return this.order;
    }

    /**
     *  <p>Business Unit the Approval Flow belongs to.</p>
     * @return businessUnit
     */

    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     *  <p>Approval Rules that matched the Order.</p>
     * @return rules
     */

    public java.util.List<com.commercetools.api.models.approval_rule.ApprovalRule> getRules() {
        return this.rules;
    }

    /**
     *  <p>Indicates whether the Approval Flow is under review, approved, or rejected.</p>
     * @return status
     */

    public com.commercetools.api.models.approval_flow.ApprovalFlowStatus getStatus() {
        return this.status;
    }

    /**
     *  <p>Present when the status of the Approval Flow is <code>Rejected</code>.</p>
     * @return rejection
     */

    @Nullable
    public com.commercetools.api.models.approval_flow.ApprovalFlowRejection getRejection() {
        return this.rejection;
    }

    /**
     *  <p>Existing approvals in the Approval Flow.</p>
     * @return approvals
     */

    public java.util.List<com.commercetools.api.models.approval_flow.ApprovalFlowApproval> getApprovals() {
        return this.approvals;
    }

    /**
     *  <p>Associate Roles that can approve according to the approver hierarchy tiers defined in <code>rules</code>. Associates are allowed to reject even after they have given approval, as long as the current approver hierarchy tier still contains their role.</p>
     * @return eligibleApprovers
     */

    public java.util.List<com.commercetools.api.models.approval_rule.RuleApprover> getEligibleApprovers() {
        return this.eligibleApprovers;
    }

    /**
     *  <p>Associate Roles required for approval based on the approver hierarchy tiers defined in <code>rules</code> across all remaining tiers.</p>
     * @return pendingApprovers
     */

    public java.util.List<com.commercetools.api.models.approval_rule.RuleApprover> getPendingApprovers() {
        return this.pendingApprovers;
    }

    /**
     *  <p>Associate Roles required for approval based on the approver hierarchy tiers defined in <code>rules</code> only for the currently active tier(s).</p>
     * @return currentTierPendingApprovers
     */

    public java.util.List<com.commercetools.api.models.approval_rule.RuleApprover> getCurrentTierPendingApprovers() {
        return this.currentTierPendingApprovers;
    }

    /**
     *  <p>Custom Fields on the Approval Flow.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     * builds ApprovalFlow with checking for non-null required values
     * @return ApprovalFlow
     */
    public ApprovalFlow build() {
        Objects.requireNonNull(id, ApprovalFlow.class + ": id is missing");
        Objects.requireNonNull(version, ApprovalFlow.class + ": version is missing");
        Objects.requireNonNull(createdAt, ApprovalFlow.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, ApprovalFlow.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(order, ApprovalFlow.class + ": order is missing");
        Objects.requireNonNull(businessUnit, ApprovalFlow.class + ": businessUnit is missing");
        Objects.requireNonNull(rules, ApprovalFlow.class + ": rules is missing");
        Objects.requireNonNull(status, ApprovalFlow.class + ": status is missing");
        Objects.requireNonNull(approvals, ApprovalFlow.class + ": approvals is missing");
        Objects.requireNonNull(eligibleApprovers, ApprovalFlow.class + ": eligibleApprovers is missing");
        Objects.requireNonNull(pendingApprovers, ApprovalFlow.class + ": pendingApprovers is missing");
        Objects.requireNonNull(currentTierPendingApprovers,
            ApprovalFlow.class + ": currentTierPendingApprovers is missing");
        return new ApprovalFlowImpl(id, version, createdAt, lastModifiedAt, createdBy, lastModifiedBy, order,
            businessUnit, rules, status, rejection, approvals, eligibleApprovers, pendingApprovers,
            currentTierPendingApprovers, custom);
    }

    /**
     * builds ApprovalFlow without checking for non-null required values
     * @return ApprovalFlow
     */
    public ApprovalFlow buildUnchecked() {
        return new ApprovalFlowImpl(id, version, createdAt, lastModifiedAt, createdBy, lastModifiedBy, order,
            businessUnit, rules, status, rejection, approvals, eligibleApprovers, pendingApprovers,
            currentTierPendingApprovers, custom);
    }

    /**
     * factory method for an instance of ApprovalFlowBuilder
     * @return builder
     */
    public static ApprovalFlowBuilder of() {
        return new ApprovalFlowBuilder();
    }

    /**
     * create builder for ApprovalFlow instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalFlowBuilder of(final ApprovalFlow template) {
        ApprovalFlowBuilder builder = new ApprovalFlowBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.createdBy = template.getCreatedBy();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.order = template.getOrder();
        builder.businessUnit = template.getBusinessUnit();
        builder.rules = template.getRules();
        builder.status = template.getStatus();
        builder.rejection = template.getRejection();
        builder.approvals = template.getApprovals();
        builder.eligibleApprovers = template.getEligibleApprovers();
        builder.pendingApprovers = template.getPendingApprovers();
        builder.currentTierPendingApprovers = template.getCurrentTierPendingApprovers();
        builder.custom = template.getCustom();
        return builder;
    }

}
