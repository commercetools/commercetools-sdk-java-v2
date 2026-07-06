
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalFlowCreatedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalFlowCreatedMessagePayload approvalFlowCreatedMessagePayload = ApprovalFlowCreatedMessagePayload.builder()
 *             .approvalFlow(approvalFlowBuilder -> approvalFlowBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalFlowCreatedMessagePayloadBuilder implements Builder<ApprovalFlowCreatedMessagePayload> {

    private com.commercetools.api.models.approval_flow.ApprovalFlow approvalFlow;

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalFlow" rel="nofollow">Approval Flow</a> that was created.</p>
     * @param builder function to build the approvalFlow value
     * @return Builder
     */

    public ApprovalFlowCreatedMessagePayloadBuilder approvalFlow(
            Function<com.commercetools.api.models.approval_flow.ApprovalFlowBuilder, com.commercetools.api.models.approval_flow.ApprovalFlowBuilder> builder) {
        this.approvalFlow = builder.apply(com.commercetools.api.models.approval_flow.ApprovalFlowBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalFlow" rel="nofollow">Approval Flow</a> that was created.</p>
     * @param builder function to build the approvalFlow value
     * @return Builder
     */

    public ApprovalFlowCreatedMessagePayloadBuilder withApprovalFlow(
            Function<com.commercetools.api.models.approval_flow.ApprovalFlowBuilder, com.commercetools.api.models.approval_flow.ApprovalFlow> builder) {
        this.approvalFlow = builder.apply(com.commercetools.api.models.approval_flow.ApprovalFlowBuilder.of());
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalFlow" rel="nofollow">Approval Flow</a> that was created.</p>
     * @param approvalFlow value to be set
     * @return Builder
     */

    public ApprovalFlowCreatedMessagePayloadBuilder approvalFlow(
            final com.commercetools.api.models.approval_flow.ApprovalFlow approvalFlow) {
        this.approvalFlow = approvalFlow;
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalFlow" rel="nofollow">Approval Flow</a> that was created.</p>
     * @return approvalFlow
     */

    public com.commercetools.api.models.approval_flow.ApprovalFlow getApprovalFlow() {
        return this.approvalFlow;
    }

    /**
     * builds ApprovalFlowCreatedMessagePayload with checking for non-null required values
     * @return ApprovalFlowCreatedMessagePayload
     */
    public ApprovalFlowCreatedMessagePayload build() {
        Objects.requireNonNull(approvalFlow, ApprovalFlowCreatedMessagePayload.class + ": approvalFlow is missing");
        return new ApprovalFlowCreatedMessagePayloadImpl(approvalFlow);
    }

    /**
     * builds ApprovalFlowCreatedMessagePayload without checking for non-null required values
     * @return ApprovalFlowCreatedMessagePayload
     */
    public ApprovalFlowCreatedMessagePayload buildUnchecked() {
        return new ApprovalFlowCreatedMessagePayloadImpl(approvalFlow);
    }

    /**
     * factory method for an instance of ApprovalFlowCreatedMessagePayloadBuilder
     * @return builder
     */
    public static ApprovalFlowCreatedMessagePayloadBuilder of() {
        return new ApprovalFlowCreatedMessagePayloadBuilder();
    }

    /**
     * create builder for ApprovalFlowCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalFlowCreatedMessagePayloadBuilder of(final ApprovalFlowCreatedMessagePayload template) {
        ApprovalFlowCreatedMessagePayloadBuilder builder = new ApprovalFlowCreatedMessagePayloadBuilder();
        builder.approvalFlow = template.getApprovalFlow();
        return builder;
    }

}
