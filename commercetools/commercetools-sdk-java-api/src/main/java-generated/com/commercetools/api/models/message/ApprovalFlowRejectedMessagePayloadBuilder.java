
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalFlowRejectedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalFlowRejectedMessagePayload approvalFlowRejectedMessagePayload = ApprovalFlowRejectedMessagePayload.builder()
 *             .associate(associateBuilder -> associateBuilder)
 *             .order(orderBuilder -> orderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalFlowRejectedMessagePayloadBuilder implements Builder<ApprovalFlowRejectedMessagePayload> {

    private com.commercetools.api.models.customer.CustomerReference associate;

    @Nullable
    private String rejectionReason;

    private com.commercetools.api.models.order.OrderReference order;

    /**
     *  <p>Reference to the Customer who rejected the Approval Flow.</p>
     * @param builder function to build the associate value
     * @return Builder
     */

    public ApprovalFlowRejectedMessagePayloadBuilder associate(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReferenceBuilder> builder) {
        this.associate = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the Customer who rejected the Approval Flow.</p>
     * @param builder function to build the associate value
     * @return Builder
     */

    public ApprovalFlowRejectedMessagePayloadBuilder withAssociate(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReference> builder) {
        this.associate = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the Customer who rejected the Approval Flow.</p>
     * @param associate value to be set
     * @return Builder
     */

    public ApprovalFlowRejectedMessagePayloadBuilder associate(
            final com.commercetools.api.models.customer.CustomerReference associate) {
        this.associate = associate;
        return this;
    }

    /**
     *  <p>Description of the reason why the Approval Flow was rejected.</p>
     * @param rejectionReason value to be set
     * @return Builder
     */

    public ApprovalFlowRejectedMessagePayloadBuilder rejectionReason(@Nullable final String rejectionReason) {
        this.rejectionReason = rejectionReason;
        return this;
    }

    /**
     *  <p>Reference to the Order that received the rejection.</p>
     * @param builder function to build the order value
     * @return Builder
     */

    public ApprovalFlowRejectedMessagePayloadBuilder order(
            Function<com.commercetools.api.models.order.OrderReferenceBuilder, com.commercetools.api.models.order.OrderReferenceBuilder> builder) {
        this.order = builder.apply(com.commercetools.api.models.order.OrderReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the Order that received the rejection.</p>
     * @param builder function to build the order value
     * @return Builder
     */

    public ApprovalFlowRejectedMessagePayloadBuilder withOrder(
            Function<com.commercetools.api.models.order.OrderReferenceBuilder, com.commercetools.api.models.order.OrderReference> builder) {
        this.order = builder.apply(com.commercetools.api.models.order.OrderReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the Order that received the rejection.</p>
     * @param order value to be set
     * @return Builder
     */

    public ApprovalFlowRejectedMessagePayloadBuilder order(
            final com.commercetools.api.models.order.OrderReference order) {
        this.order = order;
        return this;
    }

    /**
     *  <p>Reference to the Customer who rejected the Approval Flow.</p>
     * @return associate
     */

    public com.commercetools.api.models.customer.CustomerReference getAssociate() {
        return this.associate;
    }

    /**
     *  <p>Description of the reason why the Approval Flow was rejected.</p>
     * @return rejectionReason
     */

    @Nullable
    public String getRejectionReason() {
        return this.rejectionReason;
    }

    /**
     *  <p>Reference to the Order that received the rejection.</p>
     * @return order
     */

    public com.commercetools.api.models.order.OrderReference getOrder() {
        return this.order;
    }

    /**
     * builds ApprovalFlowRejectedMessagePayload with checking for non-null required values
     * @return ApprovalFlowRejectedMessagePayload
     */
    public ApprovalFlowRejectedMessagePayload build() {
        Objects.requireNonNull(associate, ApprovalFlowRejectedMessagePayload.class + ": associate is missing");
        Objects.requireNonNull(order, ApprovalFlowRejectedMessagePayload.class + ": order is missing");
        return new ApprovalFlowRejectedMessagePayloadImpl(associate, rejectionReason, order);
    }

    /**
     * builds ApprovalFlowRejectedMessagePayload without checking for non-null required values
     * @return ApprovalFlowRejectedMessagePayload
     */
    public ApprovalFlowRejectedMessagePayload buildUnchecked() {
        return new ApprovalFlowRejectedMessagePayloadImpl(associate, rejectionReason, order);
    }

    /**
     * factory method for an instance of ApprovalFlowRejectedMessagePayloadBuilder
     * @return builder
     */
    public static ApprovalFlowRejectedMessagePayloadBuilder of() {
        return new ApprovalFlowRejectedMessagePayloadBuilder();
    }

    /**
     * create builder for ApprovalFlowRejectedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalFlowRejectedMessagePayloadBuilder of(final ApprovalFlowRejectedMessagePayload template) {
        ApprovalFlowRejectedMessagePayloadBuilder builder = new ApprovalFlowRejectedMessagePayloadBuilder();
        builder.associate = template.getAssociate();
        builder.rejectionReason = template.getRejectionReason();
        builder.order = template.getOrder();
        return builder;
    }

}
