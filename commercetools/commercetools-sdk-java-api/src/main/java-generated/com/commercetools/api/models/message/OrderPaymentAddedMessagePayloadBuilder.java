
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
 *             .payment(paymentBuilder -> paymentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderPaymentAddedMessagePayloadBuilder implements Builder<OrderPaymentAddedMessagePayload> {

    private com.commercetools.api.models.payment.PaymentReference payment;

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a> that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @param builder function to build the payment value
     * @return Builder
     */

    public OrderPaymentAddedMessagePayloadBuilder payment(
            Function<com.commercetools.api.models.payment.PaymentReferenceBuilder, com.commercetools.api.models.payment.PaymentReferenceBuilder> builder) {
        this.payment = builder.apply(com.commercetools.api.models.payment.PaymentReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a> that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @param builder function to build the payment value
     * @return Builder
     */

    public OrderPaymentAddedMessagePayloadBuilder withPayment(
            Function<com.commercetools.api.models.payment.PaymentReferenceBuilder, com.commercetools.api.models.payment.PaymentReference> builder) {
        this.payment = builder.apply(com.commercetools.api.models.payment.PaymentReferenceBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a> that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @param payment value to be set
     * @return Builder
     */

    public OrderPaymentAddedMessagePayloadBuilder payment(
            final com.commercetools.api.models.payment.PaymentReference payment) {
        this.payment = payment;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a> that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @return payment
     */

    public com.commercetools.api.models.payment.PaymentReference getPayment() {
        return this.payment;
    }

    /**
     * builds OrderPaymentAddedMessagePayload with checking for non-null required values
     * @return OrderPaymentAddedMessagePayload
     */
    public OrderPaymentAddedMessagePayload build() {
        Objects.requireNonNull(payment, OrderPaymentAddedMessagePayload.class + ": payment is missing");
        return new OrderPaymentAddedMessagePayloadImpl(payment);
    }

    /**
     * builds OrderPaymentAddedMessagePayload without checking for non-null required values
     * @return OrderPaymentAddedMessagePayload
     */
    public OrderPaymentAddedMessagePayload buildUnchecked() {
        return new OrderPaymentAddedMessagePayloadImpl(payment);
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
        builder.payment = template.getPayment();
        return builder;
    }

}
