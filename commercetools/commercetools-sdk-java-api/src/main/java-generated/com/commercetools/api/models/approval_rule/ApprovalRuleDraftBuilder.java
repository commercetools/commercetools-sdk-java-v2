
package com.commercetools.api.models.approval_rule;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalRuleDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleDraft approvalRuleDraft = ApprovalRuleDraft.builder()
 *             .name("{name}")
 *             .status(ApprovalRuleStatus.ACTIVE)
 *             .predicate("{predicate}")
 *             .approvers(approversBuilder -> approversBuilder)
 *             .plusRequesters(requestersBuilder -> requestersBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalRuleDraftBuilder implements Builder<ApprovalRuleDraft> {

    @Nullable
    private String key;

    private String name;

    @Nullable
    private String description;

    private com.commercetools.api.models.approval_rule.ApprovalRuleStatus status;

    private String predicate;

    private com.commercetools.api.models.approval_rule.ApproverHierarchyDraft approvers;

    private java.util.List<com.commercetools.api.models.approval_rule.RuleRequesterDraft> requesters;

    /**
     *  <p>User-defined unique identifier of the Approval Rule. Uniqueness is enforced within the Business Unit.</p>
     * @param key value to be set
     * @return Builder
     */

    public ApprovalRuleDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Name of the Approval Rule.</p>
     * @param name value to be set
     * @return Builder
     */

    public ApprovalRuleDraftBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Description of the Approval Rule.</p>
     * @param description value to be set
     * @return Builder
     */

    public ApprovalRuleDraftBuilder description(@Nullable final String description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Indicates whether the Approval Rule should be matched against Orders or not.</p>
     * @param status value to be set
     * @return Builder
     */

    public ApprovalRuleDraftBuilder status(final com.commercetools.api.models.approval_rule.ApprovalRuleStatus status) {
        this.status = status;
        return this;
    }

    /**
     *  <p>The predicate describing the Orders the Approval Rule should match against.</p>
     * @param predicate value to be set
     * @return Builder
     */

    public ApprovalRuleDraftBuilder predicate(final String predicate) {
        this.predicate = predicate;
        return this;
    }

    /**
     *  <p>The hierarchy of approvers within the Approval Rule.</p>
     * @param builder function to build the approvers value
     * @return Builder
     */

    public ApprovalRuleDraftBuilder approvers(
            Function<com.commercetools.api.models.approval_rule.ApproverHierarchyDraftBuilder, com.commercetools.api.models.approval_rule.ApproverHierarchyDraftBuilder> builder) {
        this.approvers = builder.apply(com.commercetools.api.models.approval_rule.ApproverHierarchyDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The hierarchy of approvers within the Approval Rule.</p>
     * @param builder function to build the approvers value
     * @return Builder
     */

    public ApprovalRuleDraftBuilder withApprovers(
            Function<com.commercetools.api.models.approval_rule.ApproverHierarchyDraftBuilder, com.commercetools.api.models.approval_rule.ApproverHierarchyDraft> builder) {
        this.approvers = builder.apply(com.commercetools.api.models.approval_rule.ApproverHierarchyDraftBuilder.of());
        return this;
    }

    /**
     *  <p>The hierarchy of approvers within the Approval Rule.</p>
     * @param approvers value to be set
     * @return Builder
     */

    public ApprovalRuleDraftBuilder approvers(
            final com.commercetools.api.models.approval_rule.ApproverHierarchyDraft approvers) {
        this.approvers = approvers;
        return this;
    }

    /**
     *  <p>The Associate Roles customers must hold for their Order to require approval.</p>
     * @param requesters value to be set
     * @return Builder
     */

    public ApprovalRuleDraftBuilder requesters(
            final com.commercetools.api.models.approval_rule.RuleRequesterDraft... requesters) {
        this.requesters = new ArrayList<>(Arrays.asList(requesters));
        return this;
    }

    /**
     *  <p>The Associate Roles customers must hold for their Order to require approval.</p>
     * @param requesters value to be set
     * @return Builder
     */

    public ApprovalRuleDraftBuilder requesters(
            final java.util.List<com.commercetools.api.models.approval_rule.RuleRequesterDraft> requesters) {
        this.requesters = requesters;
        return this;
    }

    /**
     *  <p>The Associate Roles customers must hold for their Order to require approval.</p>
     * @param requesters value to be set
     * @return Builder
     */

    public ApprovalRuleDraftBuilder plusRequesters(
            final com.commercetools.api.models.approval_rule.RuleRequesterDraft... requesters) {
        if (this.requesters == null) {
            this.requesters = new ArrayList<>();
        }
        this.requesters.addAll(Arrays.asList(requesters));
        return this;
    }

    /**
     *  <p>The Associate Roles customers must hold for their Order to require approval.</p>
     * @param builder function to build the requesters value
     * @return Builder
     */

    public ApprovalRuleDraftBuilder plusRequesters(
            Function<com.commercetools.api.models.approval_rule.RuleRequesterDraftBuilder, com.commercetools.api.models.approval_rule.RuleRequesterDraftBuilder> builder) {
        if (this.requesters == null) {
            this.requesters = new ArrayList<>();
        }
        this.requesters
                .add(builder.apply(com.commercetools.api.models.approval_rule.RuleRequesterDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Associate Roles customers must hold for their Order to require approval.</p>
     * @param builder function to build the requesters value
     * @return Builder
     */

    public ApprovalRuleDraftBuilder withRequesters(
            Function<com.commercetools.api.models.approval_rule.RuleRequesterDraftBuilder, com.commercetools.api.models.approval_rule.RuleRequesterDraftBuilder> builder) {
        this.requesters = new ArrayList<>();
        this.requesters
                .add(builder.apply(com.commercetools.api.models.approval_rule.RuleRequesterDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Associate Roles customers must hold for their Order to require approval.</p>
     * @param builder function to build the requesters value
     * @return Builder
     */

    public ApprovalRuleDraftBuilder addRequesters(
            Function<com.commercetools.api.models.approval_rule.RuleRequesterDraftBuilder, com.commercetools.api.models.approval_rule.RuleRequesterDraft> builder) {
        return plusRequesters(builder.apply(com.commercetools.api.models.approval_rule.RuleRequesterDraftBuilder.of()));
    }

    /**
     *  <p>The Associate Roles customers must hold for their Order to require approval.</p>
     * @param builder function to build the requesters value
     * @return Builder
     */

    public ApprovalRuleDraftBuilder setRequesters(
            Function<com.commercetools.api.models.approval_rule.RuleRequesterDraftBuilder, com.commercetools.api.models.approval_rule.RuleRequesterDraft> builder) {
        return requesters(builder.apply(com.commercetools.api.models.approval_rule.RuleRequesterDraftBuilder.of()));
    }

    /**
     *  <p>User-defined unique identifier of the Approval Rule. Uniqueness is enforced within the Business Unit.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Name of the Approval Rule.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Description of the Approval Rule.</p>
     * @return description
     */

    @Nullable
    public String getDescription() {
        return this.description;
    }

    /**
     *  <p>Indicates whether the Approval Rule should be matched against Orders or not.</p>
     * @return status
     */

    public com.commercetools.api.models.approval_rule.ApprovalRuleStatus getStatus() {
        return this.status;
    }

    /**
     *  <p>The predicate describing the Orders the Approval Rule should match against.</p>
     * @return predicate
     */

    public String getPredicate() {
        return this.predicate;
    }

    /**
     *  <p>The hierarchy of approvers within the Approval Rule.</p>
     * @return approvers
     */

    public com.commercetools.api.models.approval_rule.ApproverHierarchyDraft getApprovers() {
        return this.approvers;
    }

    /**
     *  <p>The Associate Roles customers must hold for their Order to require approval.</p>
     * @return requesters
     */

    public java.util.List<com.commercetools.api.models.approval_rule.RuleRequesterDraft> getRequesters() {
        return this.requesters;
    }

    /**
     * builds ApprovalRuleDraft with checking for non-null required values
     * @return ApprovalRuleDraft
     */
    public ApprovalRuleDraft build() {
        Objects.requireNonNull(name, ApprovalRuleDraft.class + ": name is missing");
        Objects.requireNonNull(status, ApprovalRuleDraft.class + ": status is missing");
        Objects.requireNonNull(predicate, ApprovalRuleDraft.class + ": predicate is missing");
        Objects.requireNonNull(approvers, ApprovalRuleDraft.class + ": approvers is missing");
        Objects.requireNonNull(requesters, ApprovalRuleDraft.class + ": requesters is missing");
        return new ApprovalRuleDraftImpl(key, name, description, status, predicate, approvers, requesters);
    }

    /**
     * builds ApprovalRuleDraft without checking for non-null required values
     * @return ApprovalRuleDraft
     */
    public ApprovalRuleDraft buildUnchecked() {
        return new ApprovalRuleDraftImpl(key, name, description, status, predicate, approvers, requesters);
    }

    /**
     * factory method for an instance of ApprovalRuleDraftBuilder
     * @return builder
     */
    public static ApprovalRuleDraftBuilder of() {
        return new ApprovalRuleDraftBuilder();
    }

    /**
     * create builder for ApprovalRuleDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleDraftBuilder of(final ApprovalRuleDraft template) {
        ApprovalRuleDraftBuilder builder = new ApprovalRuleDraftBuilder();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.status = template.getStatus();
        builder.predicate = template.getPredicate();
        builder.approvers = template.getApprovers();
        builder.requesters = template.getRequesters();
        return builder;
    }

}
