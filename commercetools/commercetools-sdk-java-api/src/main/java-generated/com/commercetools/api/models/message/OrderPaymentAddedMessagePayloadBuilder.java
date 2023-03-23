
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
     *  <p>Payment that was added to the Order.</p>
     * @return Builder
     */

    public OrderPaymentAddedMessagePayloadBuilder payment(
            Function<com.commercetools.api.models.payment.PaymentReferenceBuilder, com.commercetools.api.models.payment.PaymentReferenceBuilder> builder) {
        this.payment = builder.apply(com.commercetools.api.models.payment.PaymentReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Payment that was added to the Order.</p>
     * @param payment
     * @return Builder
     */

    public OrderPaymentAddedMessagePayloadBuilder payment(
            final com.commercetools.api.models.payment.PaymentReference payment) {
        this.payment = payment;
        return this;
    }

    public com.commercetools.api.models.payment.PaymentReference getPayment() {
        return this.payment;
    }

    public OrderPaymentAddedMessagePayload build() {
        Objects.requireNonNull(payment, OrderPaymentAddedMessagePayload.class + ": payment is missing");
        return new OrderPaymentAddedMessagePayloadImpl(payment);
    }

    /**
     * builds OrderPaymentAddedMessagePayload without checking for non null required values
     */
    public OrderPaymentAddedMessagePayload buildUnchecked() {
        return new OrderPaymentAddedMessagePayloadImpl(payment);
    }

    public static OrderPaymentAddedMessagePayloadBuilder of() {
        return new OrderPaymentAddedMessagePayloadBuilder();
    }

    public static OrderPaymentAddedMessagePayloadBuilder of(final OrderPaymentAddedMessagePayload template) {
        OrderPaymentAddedMessagePayloadBuilder builder = new OrderPaymentAddedMessagePayloadBuilder();
        builder.payment = template.getPayment();
        return builder;
    }

}
