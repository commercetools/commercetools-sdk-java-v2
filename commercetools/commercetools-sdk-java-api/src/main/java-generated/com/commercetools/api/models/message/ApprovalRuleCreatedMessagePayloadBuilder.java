
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalRuleCreatedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleCreatedMessagePayload approvalRuleCreatedMessagePayload = ApprovalRuleCreatedMessagePayload.builder()
 *             .approvalRule(approvalRuleBuilder -> approvalRuleBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalRuleCreatedMessagePayloadBuilder implements Builder<ApprovalRuleCreatedMessagePayload> {

    private com.commercetools.api.models.approval_rule.ApprovalRule approvalRule;

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">Approval Rule</a> that was created.</p>
     * @param builder function to build the approvalRule value
     * @return Builder
     */

    public ApprovalRuleCreatedMessagePayloadBuilder approvalRule(
            Function<com.commercetools.api.models.approval_rule.ApprovalRuleBuilder, com.commercetools.api.models.approval_rule.ApprovalRuleBuilder> builder) {
        this.approvalRule = builder.apply(com.commercetools.api.models.approval_rule.ApprovalRuleBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">Approval Rule</a> that was created.</p>
     * @param builder function to build the approvalRule value
     * @return Builder
     */

    public ApprovalRuleCreatedMessagePayloadBuilder withApprovalRule(
            Function<com.commercetools.api.models.approval_rule.ApprovalRuleBuilder, com.commercetools.api.models.approval_rule.ApprovalRule> builder) {
        this.approvalRule = builder.apply(com.commercetools.api.models.approval_rule.ApprovalRuleBuilder.of());
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">Approval Rule</a> that was created.</p>
     * @param approvalRule value to be set
     * @return Builder
     */

    public ApprovalRuleCreatedMessagePayloadBuilder approvalRule(
            final com.commercetools.api.models.approval_rule.ApprovalRule approvalRule) {
        this.approvalRule = approvalRule;
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">Approval Rule</a> that was created.</p>
     * @return approvalRule
     */

    public com.commercetools.api.models.approval_rule.ApprovalRule getApprovalRule() {
        return this.approvalRule;
    }

    /**
     * builds ApprovalRuleCreatedMessagePayload with checking for non-null required values
     * @return ApprovalRuleCreatedMessagePayload
     */
    public ApprovalRuleCreatedMessagePayload build() {
        Objects.requireNonNull(approvalRule, ApprovalRuleCreatedMessagePayload.class + ": approvalRule is missing");
        return new ApprovalRuleCreatedMessagePayloadImpl(approvalRule);
    }

    /**
     * builds ApprovalRuleCreatedMessagePayload without checking for non-null required values
     * @return ApprovalRuleCreatedMessagePayload
     */
    public ApprovalRuleCreatedMessagePayload buildUnchecked() {
        return new ApprovalRuleCreatedMessagePayloadImpl(approvalRule);
    }

    /**
     * factory method for an instance of ApprovalRuleCreatedMessagePayloadBuilder
     * @return builder
     */
    public static ApprovalRuleCreatedMessagePayloadBuilder of() {
        return new ApprovalRuleCreatedMessagePayloadBuilder();
    }

    /**
     * create builder for ApprovalRuleCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleCreatedMessagePayloadBuilder of(final ApprovalRuleCreatedMessagePayload template) {
        ApprovalRuleCreatedMessagePayloadBuilder builder = new ApprovalRuleCreatedMessagePayloadBuilder();
        builder.approvalRule = template.getApprovalRule();
        return builder;
    }

}
