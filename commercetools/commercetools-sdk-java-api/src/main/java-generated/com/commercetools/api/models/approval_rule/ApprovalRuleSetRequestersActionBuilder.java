
package com.commercetools.api.models.approval_rule;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalRuleSetRequestersActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleSetRequestersAction approvalRuleSetRequestersAction = ApprovalRuleSetRequestersAction.builder()
 *             .plusRequesters(requestersBuilder -> requestersBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalRuleSetRequestersActionBuilder implements Builder<ApprovalRuleSetRequestersAction> {

    private java.util.List<com.commercetools.api.models.approval_rule.RuleRequesterDraft> requesters;

    /**
     *  <p>New requesters to set for the Approval Rule.</p>
     * @param requesters value to be set
     * @return Builder
     */

    public ApprovalRuleSetRequestersActionBuilder requesters(
            final com.commercetools.api.models.approval_rule.RuleRequesterDraft... requesters) {
        this.requesters = new ArrayList<>(Arrays.asList(requesters));
        return this;
    }

    /**
     *  <p>New requesters to set for the Approval Rule.</p>
     * @param requesters value to be set
     * @return Builder
     */

    public ApprovalRuleSetRequestersActionBuilder requesters(
            final java.util.List<com.commercetools.api.models.approval_rule.RuleRequesterDraft> requesters) {
        this.requesters = requesters;
        return this;
    }

    /**
     *  <p>New requesters to set for the Approval Rule.</p>
     * @param requesters value to be set
     * @return Builder
     */

    public ApprovalRuleSetRequestersActionBuilder plusRequesters(
            final com.commercetools.api.models.approval_rule.RuleRequesterDraft... requesters) {
        if (this.requesters == null) {
            this.requesters = new ArrayList<>();
        }
        this.requesters.addAll(Arrays.asList(requesters));
        return this;
    }

    /**
     *  <p>New requesters to set for the Approval Rule.</p>
     * @param builder function to build the requesters value
     * @return Builder
     */

    public ApprovalRuleSetRequestersActionBuilder plusRequesters(
            Function<com.commercetools.api.models.approval_rule.RuleRequesterDraftBuilder, com.commercetools.api.models.approval_rule.RuleRequesterDraftBuilder> builder) {
        if (this.requesters == null) {
            this.requesters = new ArrayList<>();
        }
        this.requesters
                .add(builder.apply(com.commercetools.api.models.approval_rule.RuleRequesterDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>New requesters to set for the Approval Rule.</p>
     * @param builder function to build the requesters value
     * @return Builder
     */

    public ApprovalRuleSetRequestersActionBuilder withRequesters(
            Function<com.commercetools.api.models.approval_rule.RuleRequesterDraftBuilder, com.commercetools.api.models.approval_rule.RuleRequesterDraftBuilder> builder) {
        this.requesters = new ArrayList<>();
        this.requesters
                .add(builder.apply(com.commercetools.api.models.approval_rule.RuleRequesterDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>New requesters to set for the Approval Rule.</p>
     * @param builder function to build the requesters value
     * @return Builder
     */

    public ApprovalRuleSetRequestersActionBuilder addRequesters(
            Function<com.commercetools.api.models.approval_rule.RuleRequesterDraftBuilder, com.commercetools.api.models.approval_rule.RuleRequesterDraft> builder) {
        return plusRequesters(builder.apply(com.commercetools.api.models.approval_rule.RuleRequesterDraftBuilder.of()));
    }

    /**
     *  <p>New requesters to set for the Approval Rule.</p>
     * @param builder function to build the requesters value
     * @return Builder
     */

    public ApprovalRuleSetRequestersActionBuilder setRequesters(
            Function<com.commercetools.api.models.approval_rule.RuleRequesterDraftBuilder, com.commercetools.api.models.approval_rule.RuleRequesterDraft> builder) {
        return requesters(builder.apply(com.commercetools.api.models.approval_rule.RuleRequesterDraftBuilder.of()));
    }

    /**
     *  <p>New requesters to set for the Approval Rule.</p>
     * @return requesters
     */

    public java.util.List<com.commercetools.api.models.approval_rule.RuleRequesterDraft> getRequesters() {
        return this.requesters;
    }

    /**
     * builds ApprovalRuleSetRequestersAction with checking for non-null required values
     * @return ApprovalRuleSetRequestersAction
     */
    public ApprovalRuleSetRequestersAction build() {
        Objects.requireNonNull(requesters, ApprovalRuleSetRequestersAction.class + ": requesters is missing");
        return new ApprovalRuleSetRequestersActionImpl(requesters);
    }

    /**
     * builds ApprovalRuleSetRequestersAction without checking for non-null required values
     * @return ApprovalRuleSetRequestersAction
     */
    public ApprovalRuleSetRequestersAction buildUnchecked() {
        return new ApprovalRuleSetRequestersActionImpl(requesters);
    }

    /**
     * factory method for an instance of ApprovalRuleSetRequestersActionBuilder
     * @return builder
     */
    public static ApprovalRuleSetRequestersActionBuilder of() {
        return new ApprovalRuleSetRequestersActionBuilder();
    }

    /**
     * create builder for ApprovalRuleSetRequestersAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleSetRequestersActionBuilder of(final ApprovalRuleSetRequestersAction template) {
        ApprovalRuleSetRequestersActionBuilder builder = new ApprovalRuleSetRequestersActionBuilder();
        builder.requesters = template.getRequesters();
        return builder;
    }

}
