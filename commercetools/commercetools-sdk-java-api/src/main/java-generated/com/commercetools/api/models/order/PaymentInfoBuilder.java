
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class PaymentInfoBuilder implements Builder<PaymentInfo> {

    private java.util.List<com.commercetools.api.models.payment.PaymentReference> payments;

    public PaymentInfoBuilder payments(final com.commercetools.api.models.payment.PaymentReference... payments) {
        this.payments = new ArrayList<>(Arrays.asList(payments));
        return this;
    }

    public PaymentInfoBuilder payments(
            final java.util.List<com.commercetools.api.models.payment.PaymentReference> payments) {
        this.payments = payments;
        return this;
    }

    public PaymentInfoBuilder plusPayments(final com.commercetools.api.models.payment.PaymentReference... payments) {
        if (this.payments == null) {
            this.payments = new ArrayList<>();
        }
        this.payments.addAll(Arrays.asList(payments));
        return this;
    }

    public PaymentInfoBuilder plusPayments(
            Function<com.commercetools.api.models.payment.PaymentReferenceBuilder, com.commercetools.api.models.payment.PaymentReferenceBuilder> builder) {
        if (this.payments == null) {
            this.payments = new ArrayList<>();
        }
        this.payments.add(builder.apply(com.commercetools.api.models.payment.PaymentReferenceBuilder.of()).build());
        return this;
    }

    public PaymentInfoBuilder withPayments(
            Function<com.commercetools.api.models.payment.PaymentReferenceBuilder, com.commercetools.api.models.payment.PaymentReferenceBuilder> builder) {
        this.payments = new ArrayList<>();
        this.payments.add(builder.apply(com.commercetools.api.models.payment.PaymentReferenceBuilder.of()).build());
        return this;
    }

    public java.util.List<com.commercetools.api.models.payment.PaymentReference> getPayments() {
        return this.payments;
    }

    public PaymentInfo build() {
        Objects.requireNonNull(payments, PaymentInfo.class + ": payments is missing");
        return new PaymentInfoImpl(payments);
    }

    /**
     * builds PaymentInfo without checking for non null required values
     */
    public PaymentInfo buildUnchecked() {
        return new PaymentInfoImpl(payments);
    }

    public static PaymentInfoBuilder of() {
        return new PaymentInfoBuilder();
    }

    public static PaymentInfoBuilder of(final PaymentInfo template) {
        PaymentInfoBuilder builder = new PaymentInfoBuilder();
        builder.payments = template.getPayments();
        return builder;
    }

}
