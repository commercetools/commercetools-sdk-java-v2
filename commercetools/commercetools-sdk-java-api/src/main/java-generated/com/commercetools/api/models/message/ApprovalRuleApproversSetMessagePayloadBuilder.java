
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalRuleApproversSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleApproversSetMessagePayload approvalRuleApproversSetMessagePayload = ApprovalRuleApproversSetMessagePayload.builder()
 *             .approvers(approversBuilder -> approversBuilder)
 *             .oldApprovers(oldApproversBuilder -> oldApproversBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalRuleApproversSetMessagePayloadBuilder implements Builder<ApprovalRuleApproversSetMessagePayload> {

    private com.commercetools.api.models.approval_rule.ApproverHierarchy approvers;

    private com.commercetools.api.models.approval_rule.ApproverHierarchy oldApprovers;

    /**
     *  <p>Approver hierarchy of the ApprovalRule after the Set Approvers update action.</p>
     * @param builder function to build the approvers value
     * @return Builder
     */

    public ApprovalRuleApproversSetMessagePayloadBuilder approvers(
            Function<com.commercetools.api.models.approval_rule.ApproverHierarchyBuilder, com.commercetools.api.models.approval_rule.ApproverHierarchyBuilder> builder) {
        this.approvers = builder.apply(com.commercetools.api.models.approval_rule.ApproverHierarchyBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Approver hierarchy of the ApprovalRule after the Set Approvers update action.</p>
     * @param builder function to build the approvers value
     * @return Builder
     */

    public ApprovalRuleApproversSetMessagePayloadBuilder withApprovers(
            Function<com.commercetools.api.models.approval_rule.ApproverHierarchyBuilder, com.commercetools.api.models.approval_rule.ApproverHierarchy> builder) {
        this.approvers = builder.apply(com.commercetools.api.models.approval_rule.ApproverHierarchyBuilder.of());
        return this;
    }

    /**
     *  <p>Approver hierarchy of the ApprovalRule after the Set Approvers update action.</p>
     * @param approvers value to be set
     * @return Builder
     */

    public ApprovalRuleApproversSetMessagePayloadBuilder approvers(
            final com.commercetools.api.models.approval_rule.ApproverHierarchy approvers) {
        this.approvers = approvers;
        return this;
    }

    /**
     *  <p>Approver hierarchy of the ApprovalRule before the Set Approvers update action.</p>
     * @param builder function to build the oldApprovers value
     * @return Builder
     */

    public ApprovalRuleApproversSetMessagePayloadBuilder oldApprovers(
            Function<com.commercetools.api.models.approval_rule.ApproverHierarchyBuilder, com.commercetools.api.models.approval_rule.ApproverHierarchyBuilder> builder) {
        this.oldApprovers = builder.apply(com.commercetools.api.models.approval_rule.ApproverHierarchyBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Approver hierarchy of the ApprovalRule before the Set Approvers update action.</p>
     * @param builder function to build the oldApprovers value
     * @return Builder
     */

    public ApprovalRuleApproversSetMessagePayloadBuilder withOldApprovers(
            Function<com.commercetools.api.models.approval_rule.ApproverHierarchyBuilder, com.commercetools.api.models.approval_rule.ApproverHierarchy> builder) {
        this.oldApprovers = builder.apply(com.commercetools.api.models.approval_rule.ApproverHierarchyBuilder.of());
        return this;
    }

    /**
     *  <p>Approver hierarchy of the ApprovalRule before the Set Approvers update action.</p>
     * @param oldApprovers value to be set
     * @return Builder
     */

    public ApprovalRuleApproversSetMessagePayloadBuilder oldApprovers(
            final com.commercetools.api.models.approval_rule.ApproverHierarchy oldApprovers) {
        this.oldApprovers = oldApprovers;
        return this;
    }

    /**
     *  <p>Approver hierarchy of the ApprovalRule after the Set Approvers update action.</p>
     * @return approvers
     */

    public com.commercetools.api.models.approval_rule.ApproverHierarchy getApprovers() {
        return this.approvers;
    }

    /**
     *  <p>Approver hierarchy of the ApprovalRule before the Set Approvers update action.</p>
     * @return oldApprovers
     */

    public com.commercetools.api.models.approval_rule.ApproverHierarchy getOldApprovers() {
        return this.oldApprovers;
    }

    /**
     * builds ApprovalRuleApproversSetMessagePayload with checking for non-null required values
     * @return ApprovalRuleApproversSetMessagePayload
     */
    public ApprovalRuleApproversSetMessagePayload build() {
        Objects.requireNonNull(approvers, ApprovalRuleApproversSetMessagePayload.class + ": approvers is missing");
        Objects.requireNonNull(oldApprovers,
            ApprovalRuleApproversSetMessagePayload.class + ": oldApprovers is missing");
        return new ApprovalRuleApproversSetMessagePayloadImpl(approvers, oldApprovers);
    }

    /**
     * builds ApprovalRuleApproversSetMessagePayload without checking for non-null required values
     * @return ApprovalRuleApproversSetMessagePayload
     */
    public ApprovalRuleApproversSetMessagePayload buildUnchecked() {
        return new ApprovalRuleApproversSetMessagePayloadImpl(approvers, oldApprovers);
    }

    /**
     * factory method for an instance of ApprovalRuleApproversSetMessagePayloadBuilder
     * @return builder
     */
    public static ApprovalRuleApproversSetMessagePayloadBuilder of() {
        return new ApprovalRuleApproversSetMessagePayloadBuilder();
    }

    /**
     * create builder for ApprovalRuleApproversSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleApproversSetMessagePayloadBuilder of(
            final ApprovalRuleApproversSetMessagePayload template) {
        ApprovalRuleApproversSetMessagePayloadBuilder builder = new ApprovalRuleApproversSetMessagePayloadBuilder();
        builder.approvers = template.getApprovers();
        builder.oldApprovers = template.getOldApprovers();
        return builder;
    }

}
