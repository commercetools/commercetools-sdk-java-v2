
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderPaymentAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderPaymentAddedMessagePayload orderPaymentAddedMessagePayload = OrderPaymentAddedMessagePayload.builder()
 *             .paymentRef(paymentRefBuilder -> paymentRefBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderPaymentAddedMessagePayloadBuilder implements Builder<OrderPaymentAddedMessagePayload> {

    private com.commercetools.api.models.payment.PaymentReference paymentRef;

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a> that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @param builder function to build the paymentRef value
     * @return Builder
     */

    public OrderPaymentAddedMessagePayloadBuilder paymentRef(
            Function<com.commercetools.api.models.payment.PaymentReferenceBuilder, com.commercetools.api.models.payment.PaymentReferenceBuilder> builder) {
        this.paymentRef = builder.apply(com.commercetools.api.models.payment.PaymentReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a> that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @param builder function to build the paymentRef value
     * @return Builder
     */

    public OrderPaymentAddedMessagePayloadBuilder withPaymentRef(
            Function<com.commercetools.api.models.payment.PaymentReferenceBuilder, com.commercetools.api.models.payment.PaymentReference> builder) {
        this.paymentRef = builder.apply(com.commercetools.api.models.payment.PaymentReferenceBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a> that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @param paymentRef value to be set
     * @return Builder
     */

    public OrderPaymentAddedMessagePayloadBuilder paymentRef(
            final com.commercetools.api.models.payment.PaymentReference paymentRef) {
        this.paymentRef = paymentRef;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a> that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @return paymentRef
     */

    public com.commercetools.api.models.payment.PaymentReference getPaymentRef() {
        return this.paymentRef;
    }

    /**
     * builds OrderPaymentAddedMessagePayload with checking for non-null required values
     * @return OrderPaymentAddedMessagePayload
     */
    public OrderPaymentAddedMessagePayload build() {
        Objects.requireNonNull(paymentRef, OrderPaymentAddedMessagePayload.class + ": paymentRef is missing");
        return new OrderPaymentAddedMessagePayloadImpl(paymentRef);
    }

    /**
     * builds OrderPaymentAddedMessagePayload without checking for non-null required values
     * @return OrderPaymentAddedMessagePayload
     */
    public OrderPaymentAddedMessagePayload buildUnchecked() {
        return new OrderPaymentAddedMessagePayloadImpl(paymentRef);
    }

    /**
     * factory method for an instance of OrderPaymentAddedMessagePayloadBuilder
     * @return builder
     */
    public static OrderPaymentAddedMessagePayloadBuilder of() {
        return new OrderPaymentAddedMessagePayloadBuilder();
    }

    /**
     * create builder for OrderPaymentAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderPaymentAddedMessagePayloadBuilder of(final OrderPaymentAddedMessagePayload template) {
        OrderPaymentAddedMessagePayloadBuilder builder = new OrderPaymentAddedMessagePayloadBuilder();
        builder.paymentRef = template.getPaymentRef();
        return builder;
    }

}
