
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalFlowApprovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalFlowApprovedMessagePayload approvalFlowApprovedMessagePayload = ApprovalFlowApprovedMessagePayload.builder()
 *             .associate(associateBuilder -> associateBuilder)
 *             .order(orderBuilder -> orderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalFlowApprovedMessagePayloadBuilder implements Builder<ApprovalFlowApprovedMessagePayload> {

    private com.commercetools.api.models.customer.CustomerReference associate;

    private com.commercetools.api.models.order.OrderReference order;

    /**
     *  <p>Reference to the Customer who approved the Approval Flow.</p>
     * @param builder function to build the associate value
     * @return Builder
     */

    public ApprovalFlowApprovedMessagePayloadBuilder associate(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReferenceBuilder> builder) {
        this.associate = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the Customer who approved the Approval Flow.</p>
     * @param builder function to build the associate value
     * @return Builder
     */

    public ApprovalFlowApprovedMessagePayloadBuilder withAssociate(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReference> builder) {
        this.associate = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the Customer who approved the Approval Flow.</p>
     * @param associate value to be set
     * @return Builder
     */

    public ApprovalFlowApprovedMessagePayloadBuilder associate(
            final com.commercetools.api.models.customer.CustomerReference associate) {
        this.associate = associate;
        return this;
    }

    /**
     *  <p>Reference to the Order that received the approval.</p>
     * @param builder function to build the order value
     * @return Builder
     */

    public ApprovalFlowApprovedMessagePayloadBuilder order(
            Function<com.commercetools.api.models.order.OrderReferenceBuilder, com.commercetools.api.models.order.OrderReferenceBuilder> builder) {
        this.order = builder.apply(com.commercetools.api.models.order.OrderReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the Order that received the approval.</p>
     * @param builder function to build the order value
     * @return Builder
     */

    public ApprovalFlowApprovedMessagePayloadBuilder withOrder(
            Function<com.commercetools.api.models.order.OrderReferenceBuilder, com.commercetools.api.models.order.OrderReference> builder) {
        this.order = builder.apply(com.commercetools.api.models.order.OrderReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the Order that received the approval.</p>
     * @param order value to be set
     * @return Builder
     */

    public ApprovalFlowApprovedMessagePayloadBuilder order(
            final com.commercetools.api.models.order.OrderReference order) {
        this.order = order;
        return this;
    }

    /**
     *  <p>Reference to the Customer who approved the Approval Flow.</p>
     * @return associate
     */

    public com.commercetools.api.models.customer.CustomerReference getAssociate() {
        return this.associate;
    }

    /**
     *  <p>Reference to the Order that received the approval.</p>
     * @return order
     */

    public com.commercetools.api.models.order.OrderReference getOrder() {
        return this.order;
    }

    /**
     * builds ApprovalFlowApprovedMessagePayload with checking for non-null required values
     * @return ApprovalFlowApprovedMessagePayload
     */
    public ApprovalFlowApprovedMessagePayload build() {
        Objects.requireNonNull(associate, ApprovalFlowApprovedMessagePayload.class + ": associate is missing");
        Objects.requireNonNull(order, ApprovalFlowApprovedMessagePayload.class + ": order is missing");
        return new ApprovalFlowApprovedMessagePayloadImpl(associate, order);
    }

    /**
     * builds ApprovalFlowApprovedMessagePayload without checking for non-null required values
     * @return ApprovalFlowApprovedMessagePayload
     */
    public ApprovalFlowApprovedMessagePayload buildUnchecked() {
        return new ApprovalFlowApprovedMessagePayloadImpl(associate, order);
    }

    /**
     * factory method for an instance of ApprovalFlowApprovedMessagePayloadBuilder
     * @return builder
     */
    public static ApprovalFlowApprovedMessagePayloadBuilder of() {
        return new ApprovalFlowApprovedMessagePayloadBuilder();
    }

    /**
     * create builder for ApprovalFlowApprovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalFlowApprovedMessagePayloadBuilder of(final ApprovalFlowApprovedMessagePayload template) {
        ApprovalFlowApprovedMessagePayloadBuilder builder = new ApprovalFlowApprovedMessagePayloadBuilder();
        builder.associate = template.getAssociate();
        builder.order = template.getOrder();
        return builder;
    }

}
