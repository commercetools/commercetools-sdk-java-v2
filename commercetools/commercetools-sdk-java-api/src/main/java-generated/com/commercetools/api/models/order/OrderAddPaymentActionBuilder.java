
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderAddPaymentActionBuilder implements Builder<OrderAddPaymentAction> {

    private com.commercetools.api.models.payment.PaymentResourceIdentifier payment;

    public OrderAddPaymentActionBuilder payment(
            Function<com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder, com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder> builder) {
        this.payment = builder.apply(com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    public OrderAddPaymentActionBuilder payment(
            final com.commercetools.api.models.payment.PaymentResourceIdentifier payment) {
        this.payment = payment;
        return this;
    }

    public com.commercetools.api.models.payment.PaymentResourceIdentifier getPayment() {
        return this.payment;
    }

    public OrderAddPaymentAction build() {
        Objects.requireNonNull(payment, OrderAddPaymentAction.class + ": payment is missing");
        return new OrderAddPaymentActionImpl(payment);
    }

    /**
     * builds OrderAddPaymentAction without checking for non null required values
     */
    public OrderAddPaymentAction buildUnchecked() {
        return new OrderAddPaymentActionImpl(payment);
    }

    public static OrderAddPaymentActionBuilder of() {
        return new OrderAddPaymentActionBuilder();
    }

    public static OrderAddPaymentActionBuilder of(final OrderAddPaymentAction template) {
        OrderAddPaymentActionBuilder builder = new OrderAddPaymentActionBuilder();
        builder.payment = template.getPayment();
        return builder;
    }

}
