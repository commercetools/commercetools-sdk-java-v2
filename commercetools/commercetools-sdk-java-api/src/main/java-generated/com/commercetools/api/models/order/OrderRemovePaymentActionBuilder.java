
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderRemovePaymentActionBuilder implements Builder<OrderRemovePaymentAction> {

    private com.commercetools.api.models.payment.PaymentResourceIdentifier payment;

    public OrderRemovePaymentActionBuilder payment(
            Function<com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder, com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder> builder) {
        this.payment = builder.apply(com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    public OrderRemovePaymentActionBuilder payment(
            final com.commercetools.api.models.payment.PaymentResourceIdentifier payment) {
        this.payment = payment;
        return this;
    }

    public com.commercetools.api.models.payment.PaymentResourceIdentifier getPayment() {
        return this.payment;
    }

    public OrderRemovePaymentAction build() {
        Objects.requireNonNull(payment, OrderRemovePaymentAction.class + ": payment is missing");
        return new OrderRemovePaymentActionImpl(payment);
    }

    /**
     * builds OrderRemovePaymentAction without checking for non null required values
     */
    public OrderRemovePaymentAction buildUnchecked() {
        return new OrderRemovePaymentActionImpl(payment);
    }

    public static OrderRemovePaymentActionBuilder of() {
        return new OrderRemovePaymentActionBuilder();
    }

    public static OrderRemovePaymentActionBuilder of(final OrderRemovePaymentAction template) {
        OrderRemovePaymentActionBuilder builder = new OrderRemovePaymentActionBuilder();
        builder.payment = template.getPayment();
        return builder;
    }

}
