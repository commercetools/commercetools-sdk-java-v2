
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentCreatedMessagePayloadBuilder implements Builder<PaymentCreatedMessagePayload> {

    private com.commercetools.api.models.payment.Payment payment;

    public PaymentCreatedMessagePayloadBuilder payment(
            Function<com.commercetools.api.models.payment.PaymentBuilder, com.commercetools.api.models.payment.PaymentBuilder> builder) {
        this.payment = builder.apply(com.commercetools.api.models.payment.PaymentBuilder.of()).build();
        return this;
    }

    public PaymentCreatedMessagePayloadBuilder payment(final com.commercetools.api.models.payment.Payment payment) {
        this.payment = payment;
        return this;
    }

    public com.commercetools.api.models.payment.Payment getPayment() {
        return this.payment;
    }

    public PaymentCreatedMessagePayload build() {
        Objects.requireNonNull(payment, PaymentCreatedMessagePayload.class + ": payment is missing");
        return new PaymentCreatedMessagePayloadImpl(payment);
    }

    /**
     * builds PaymentCreatedMessagePayload without checking for non null required values
     */
    public PaymentCreatedMessagePayload buildUnchecked() {
        return new PaymentCreatedMessagePayloadImpl(payment);
    }

    public static PaymentCreatedMessagePayloadBuilder of() {
        return new PaymentCreatedMessagePayloadBuilder();
    }

    public static PaymentCreatedMessagePayloadBuilder of(final PaymentCreatedMessagePayload template) {
        PaymentCreatedMessagePayloadBuilder builder = new PaymentCreatedMessagePayloadBuilder();
        builder.payment = template.getPayment();
        return builder;
    }

}
