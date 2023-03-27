
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentCreatedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentCreatedMessagePayload paymentCreatedMessagePayload = PaymentCreatedMessagePayload.builder()
 *             .payment(paymentBuilder -> paymentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentCreatedMessagePayloadBuilder implements Builder<PaymentCreatedMessagePayload> {

    private com.commercetools.api.models.payment.Payment payment;

    /**
     *  <p>Payment that was created.</p>
     * @param builder function to build the payment value
     * @return Builder
     */

    public PaymentCreatedMessagePayloadBuilder payment(
            Function<com.commercetools.api.models.payment.PaymentBuilder, com.commercetools.api.models.payment.PaymentBuilder> builder) {
        this.payment = builder.apply(com.commercetools.api.models.payment.PaymentBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Payment that was created.</p>
     * @param payment value to be set
     * @return Builder
     */

    public PaymentCreatedMessagePayloadBuilder payment(final com.commercetools.api.models.payment.Payment payment) {
        this.payment = payment;
        return this;
    }

    /**
     *  <p>Payment that was created.</p>
     * @return payment
     */

    public com.commercetools.api.models.payment.Payment getPayment() {
        return this.payment;
    }

    /**
     * builds PaymentCreatedMessagePayload with checking for non-null required values
     * @return PaymentCreatedMessagePayload
     */
    public PaymentCreatedMessagePayload build() {
        Objects.requireNonNull(payment, PaymentCreatedMessagePayload.class + ": payment is missing");
        return new PaymentCreatedMessagePayloadImpl(payment);
    }

    /**
     * builds PaymentCreatedMessagePayload without checking for non-null required values
     * @return PaymentCreatedMessagePayload
     */
    public PaymentCreatedMessagePayload buildUnchecked() {
        return new PaymentCreatedMessagePayloadImpl(payment);
    }

    /**
     * factory method for an instance of PaymentCreatedMessagePayloadBuilder
     * @return builder
     */
    public static PaymentCreatedMessagePayloadBuilder of() {
        return new PaymentCreatedMessagePayloadBuilder();
    }

    /**
     * create builder for PaymentCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentCreatedMessagePayloadBuilder of(final PaymentCreatedMessagePayload template) {
        PaymentCreatedMessagePayloadBuilder builder = new PaymentCreatedMessagePayloadBuilder();
        builder.payment = template.getPayment();
        return builder;
    }

}
