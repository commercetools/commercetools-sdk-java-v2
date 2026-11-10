
package com.commercetools.api.models.approval_flow;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalFlowRejectActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalFlowRejectAction approvalFlowRejectAction = ApprovalFlowRejectAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalFlowRejectActionBuilder implements Builder<ApprovalFlowRejectAction> {

    @Nullable
    private String reason;

    /**
     *  <p>The reason for the rejection of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalFlow" rel="nofollow">Approval Flow</a>.</p>
     * @param reason value to be set
     * @return Builder
     */

    public ApprovalFlowRejectActionBuilder reason(@Nullable final String reason) {
        this.reason = reason;
        return this;
    }

    /**
     *  <p>The reason for the rejection of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalFlow" rel="nofollow">Approval Flow</a>.</p>
     * @return reason
     */

    @Nullable
    public String getReason() {
        return this.reason;
    }

    /**
     * builds ApprovalFlowRejectAction with checking for non-null required values
     * @return ApprovalFlowRejectAction
     */
    public ApprovalFlowRejectAction build() {
        return new ApprovalFlowRejectActionImpl(reason);
    }

    /**
     * builds ApprovalFlowRejectAction without checking for non-null required values
     * @return ApprovalFlowRejectAction
     */
    public ApprovalFlowRejectAction buildUnchecked() {
        return new ApprovalFlowRejectActionImpl(reason);
    }

    /**
     * factory method for an instance of ApprovalFlowRejectActionBuilder
     * @return builder
     */
    public static ApprovalFlowRejectActionBuilder of() {
        return new ApprovalFlowRejectActionBuilder();
    }

    /**
     * create builder for ApprovalFlowRejectAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalFlowRejectActionBuilder of(final ApprovalFlowRejectAction template) {
        ApprovalFlowRejectActionBuilder builder = new ApprovalFlowRejectActionBuilder();
        builder.reason = template.getReason();
        return builder;
    }

}
