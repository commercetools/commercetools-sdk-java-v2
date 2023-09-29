
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalFlowCompletedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalFlowCompletedMessagePayload approvalFlowCompletedMessagePayload = ApprovalFlowCompletedMessagePayload.builder()
 *             .status(ApprovalFlowStatus.PENDING)
 *             .order(orderBuilder -> orderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalFlowCompletedMessagePayloadBuilder implements Builder<ApprovalFlowCompletedMessagePayload> {

    private com.commercetools.api.models.approval_flow.ApprovalFlowStatus status;

    private com.commercetools.api.models.order.OrderReference order;

    /**
     *  <p>Final status of the Approval Flow.</p>
     * @param status value to be set
     * @return Builder
     */

    public ApprovalFlowCompletedMessagePayloadBuilder status(
            final com.commercetools.api.models.approval_flow.ApprovalFlowStatus status) {
        this.status = status;
        return this;
    }

    /**
     *  <p>Reference to the Order related to the completed Approval Flow.</p>
     * @param builder function to build the order value
     * @return Builder
     */

    public ApprovalFlowCompletedMessagePayloadBuilder order(
            Function<com.commercetools.api.models.order.OrderReferenceBuilder, com.commercetools.api.models.order.OrderReferenceBuilder> builder) {
        this.order = builder.apply(com.commercetools.api.models.order.OrderReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the Order related to the completed Approval Flow.</p>
     * @param builder function to build the order value
     * @return Builder
     */

    public ApprovalFlowCompletedMessagePayloadBuilder withOrder(
            Function<com.commercetools.api.models.order.OrderReferenceBuilder, com.commercetools.api.models.order.OrderReference> builder) {
        this.order = builder.apply(com.commercetools.api.models.order.OrderReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the Order related to the completed Approval Flow.</p>
     * @param order value to be set
     * @return Builder
     */

    public ApprovalFlowCompletedMessagePayloadBuilder order(
            final com.commercetools.api.models.order.OrderReference order) {
        this.order = order;
        return this;
    }

    /**
     *  <p>Final status of the Approval Flow.</p>
     * @return status
     */

    public com.commercetools.api.models.approval_flow.ApprovalFlowStatus getStatus() {
        return this.status;
    }

    /**
     *  <p>Reference to the Order related to the completed Approval Flow.</p>
     * @return order
     */

    public com.commercetools.api.models.order.OrderReference getOrder() {
        return this.order;
    }

    /**
     * builds ApprovalFlowCompletedMessagePayload with checking for non-null required values
     * @return ApprovalFlowCompletedMessagePayload
     */
    public ApprovalFlowCompletedMessagePayload build() {
        Objects.requireNonNull(status, ApprovalFlowCompletedMessagePayload.class + ": status is missing");
        Objects.requireNonNull(order, ApprovalFlowCompletedMessagePayload.class + ": order is missing");
        return new ApprovalFlowCompletedMessagePayloadImpl(status, order);
    }

    /**
     * builds ApprovalFlowCompletedMessagePayload without checking for non-null required values
     * @return ApprovalFlowCompletedMessagePayload
     */
    public ApprovalFlowCompletedMessagePayload buildUnchecked() {
        return new ApprovalFlowCompletedMessagePayloadImpl(status, order);
    }

    /**
     * factory method for an instance of ApprovalFlowCompletedMessagePayloadBuilder
     * @return builder
     */
    public static ApprovalFlowCompletedMessagePayloadBuilder of() {
        return new ApprovalFlowCompletedMessagePayloadBuilder();
    }

    /**
     * create builder for ApprovalFlowCompletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalFlowCompletedMessagePayloadBuilder of(final ApprovalFlowCompletedMessagePayload template) {
        ApprovalFlowCompletedMessagePayloadBuilder builder = new ApprovalFlowCompletedMessagePayloadBuilder();
        builder.status = template.getStatus();
        builder.order = template.getOrder();
        return builder;
    }

}
