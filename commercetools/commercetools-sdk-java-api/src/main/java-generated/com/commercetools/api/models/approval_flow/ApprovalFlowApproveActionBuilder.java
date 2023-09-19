
package com.commercetools.api.models.approval_flow;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalFlowApproveActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalFlowApproveAction approvalFlowApproveAction = ApprovalFlowApproveAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalFlowApproveActionBuilder implements Builder<ApprovalFlowApproveAction> {

    /**
     * builds ApprovalFlowApproveAction with checking for non-null required values
     * @return ApprovalFlowApproveAction
     */
    public ApprovalFlowApproveAction build() {
        return new ApprovalFlowApproveActionImpl();
    }

    /**
     * builds ApprovalFlowApproveAction without checking for non-null required values
     * @return ApprovalFlowApproveAction
     */
    public ApprovalFlowApproveAction buildUnchecked() {
        return new ApprovalFlowApproveActionImpl();
    }

    /**
     * factory method for an instance of ApprovalFlowApproveActionBuilder
     * @return builder
     */
    public static ApprovalFlowApproveActionBuilder of() {
        return new ApprovalFlowApproveActionBuilder();
    }

    /**
     * create builder for ApprovalFlowApproveAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalFlowApproveActionBuilder of(final ApprovalFlowApproveAction template) {
        ApprovalFlowApproveActionBuilder builder = new ApprovalFlowApproveActionBuilder();
        return builder;
    }

}
