
package com.commercetools.api.models.approval_rule;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalRuleSetStatusActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleSetStatusAction approvalRuleSetStatusAction = ApprovalRuleSetStatusAction.builder()
 *             .status(ApprovalRuleStatus.ACTIVE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalRuleSetStatusActionBuilder implements Builder<ApprovalRuleSetStatusAction> {

    private com.commercetools.api.models.approval_rule.ApprovalRuleStatus status;

    /**
     *  <p>New status to set for the Approval Rule.</p>
     * @param status value to be set
     * @return Builder
     */

    public ApprovalRuleSetStatusActionBuilder status(
            final com.commercetools.api.models.approval_rule.ApprovalRuleStatus status) {
        this.status = status;
        return this;
    }

    /**
     *  <p>New status to set for the Approval Rule.</p>
     * @return status
     */

    public com.commercetools.api.models.approval_rule.ApprovalRuleStatus getStatus() {
        return this.status;
    }

    /**
     * builds ApprovalRuleSetStatusAction with checking for non-null required values
     * @return ApprovalRuleSetStatusAction
     */
    public ApprovalRuleSetStatusAction build() {
        Objects.requireNonNull(status, ApprovalRuleSetStatusAction.class + ": status is missing");
        return new ApprovalRuleSetStatusActionImpl(status);
    }

    /**
     * builds ApprovalRuleSetStatusAction without checking for non-null required values
     * @return ApprovalRuleSetStatusAction
     */
    public ApprovalRuleSetStatusAction buildUnchecked() {
        return new ApprovalRuleSetStatusActionImpl(status);
    }

    /**
     * factory method for an instance of ApprovalRuleSetStatusActionBuilder
     * @return builder
     */
    public static ApprovalRuleSetStatusActionBuilder of() {
        return new ApprovalRuleSetStatusActionBuilder();
    }

    /**
     * create builder for ApprovalRuleSetStatusAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleSetStatusActionBuilder of(final ApprovalRuleSetStatusAction template) {
        ApprovalRuleSetStatusActionBuilder builder = new ApprovalRuleSetStatusActionBuilder();
        builder.status = template.getStatus();
        return builder;
    }

}
