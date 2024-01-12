
package com.commercetools.api.models.approval_flow;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalFlowUpdateActionBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalFlowUpdateActionBuilder {

    public com.commercetools.api.models.approval_flow.ApprovalFlowApproveActionBuilder approveBuilder() {
        return com.commercetools.api.models.approval_flow.ApprovalFlowApproveActionBuilder.of();
    }

    public com.commercetools.api.models.approval_flow.ApprovalFlowRejectActionBuilder rejectBuilder() {
        return com.commercetools.api.models.approval_flow.ApprovalFlowRejectActionBuilder.of();
    }

    /**
     * factory method for an instance of ApprovalFlowUpdateActionBuilder
     * @return builder
     */
    public static ApprovalFlowUpdateActionBuilder of() {
        return new ApprovalFlowUpdateActionBuilder();
    }

}
