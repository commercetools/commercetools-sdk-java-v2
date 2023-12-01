
package com.commercetools.api.models.approval_rule;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalRuleSetApproversActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleSetApproversAction approvalRuleSetApproversAction = ApprovalRuleSetApproversAction.builder()
 *             .approvers(approversBuilder -> approversBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalRuleSetApproversActionBuilder implements Builder<ApprovalRuleSetApproversAction> {

    private com.commercetools.api.models.approval_rule.ApproverHierarchyDraft approvers;

    /**
     *  <p>New approvers to set for the Approval Rule.</p>
     * @param builder function to build the approvers value
     * @return Builder
     */

    public ApprovalRuleSetApproversActionBuilder approvers(
            Function<com.commercetools.api.models.approval_rule.ApproverHierarchyDraftBuilder, com.commercetools.api.models.approval_rule.ApproverHierarchyDraftBuilder> builder) {
        this.approvers = builder.apply(com.commercetools.api.models.approval_rule.ApproverHierarchyDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>New approvers to set for the Approval Rule.</p>
     * @param builder function to build the approvers value
     * @return Builder
     */

    public ApprovalRuleSetApproversActionBuilder withApprovers(
            Function<com.commercetools.api.models.approval_rule.ApproverHierarchyDraftBuilder, com.commercetools.api.models.approval_rule.ApproverHierarchyDraft> builder) {
        this.approvers = builder.apply(com.commercetools.api.models.approval_rule.ApproverHierarchyDraftBuilder.of());
        return this;
    }

    /**
     *  <p>New approvers to set for the Approval Rule.</p>
     * @param approvers value to be set
     * @return Builder
     */

    public ApprovalRuleSetApproversActionBuilder approvers(
            final com.commercetools.api.models.approval_rule.ApproverHierarchyDraft approvers) {
        this.approvers = approvers;
        return this;
    }

    /**
     *  <p>New approvers to set for the Approval Rule.</p>
     * @return approvers
     */

    public com.commercetools.api.models.approval_rule.ApproverHierarchyDraft getApprovers() {
        return this.approvers;
    }

    /**
     * builds ApprovalRuleSetApproversAction with checking for non-null required values
     * @return ApprovalRuleSetApproversAction
     */
    public ApprovalRuleSetApproversAction build() {
        Objects.requireNonNull(approvers, ApprovalRuleSetApproversAction.class + ": approvers is missing");
        return new ApprovalRuleSetApproversActionImpl(approvers);
    }

    /**
     * builds ApprovalRuleSetApproversAction without checking for non-null required values
     * @return ApprovalRuleSetApproversAction
     */
    public ApprovalRuleSetApproversAction buildUnchecked() {
        return new ApprovalRuleSetApproversActionImpl(approvers);
    }

    /**
     * factory method for an instance of ApprovalRuleSetApproversActionBuilder
     * @return builder
     */
    public static ApprovalRuleSetApproversActionBuilder of() {
        return new ApprovalRuleSetApproversActionBuilder();
    }

    /**
     * create builder for ApprovalRuleSetApproversAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleSetApproversActionBuilder of(final ApprovalRuleSetApproversAction template) {
        ApprovalRuleSetApproversActionBuilder builder = new ApprovalRuleSetApproversActionBuilder();
        builder.approvers = template.getApprovers();
        return builder;
    }

}
