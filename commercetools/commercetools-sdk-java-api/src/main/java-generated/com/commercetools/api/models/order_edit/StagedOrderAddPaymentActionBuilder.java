
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderAddPaymentActionBuilder implements Builder<StagedOrderAddPaymentAction> {

    private com.commercetools.api.models.payment.PaymentResourceIdentifier payment;

    public StagedOrderAddPaymentActionBuilder payment(
            final com.commercetools.api.models.payment.PaymentResourceIdentifier payment) {
        this.payment = payment;
        return this;
    }

    public com.commercetools.api.models.payment.PaymentResourceIdentifier getPayment() {
        return this.payment;
    }

    public StagedOrderAddPaymentAction build() {
        Objects.requireNonNull(payment);
        return new StagedOrderAddPaymentActionImpl(payment);
    }

    /**
     * builds StagedOrderAddPaymentAction without checking for non null required values
     */
    public StagedOrderAddPaymentAction buildUnchecked() {
        return new StagedOrderAddPaymentActionImpl(payment);
    }

    public static StagedOrderAddPaymentActionBuilder of() {
        return new StagedOrderAddPaymentActionBuilder();
    }

    public static StagedOrderAddPaymentActionBuilder of(final StagedOrderAddPaymentAction template) {
        StagedOrderAddPaymentActionBuilder builder = new StagedOrderAddPaymentActionBuilder();
        builder.payment = template.getPayment();
        return builder;
    }

}
