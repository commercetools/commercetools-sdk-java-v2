
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentInfoBuilder implements Builder<PaymentInfo> {

    private java.util.List<com.commercetools.history.models.common.Reference> payments;

    public PaymentInfoBuilder payments(final com.commercetools.history.models.common.Reference... payments) {
        this.payments = new ArrayList<>(Arrays.asList(payments));
        return this;
    }

    public PaymentInfoBuilder withPayments(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.payments = new ArrayList<>();
        this.payments.add(builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    public PaymentInfoBuilder plusPayments(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        if (this.payments == null) {
            this.payments = new ArrayList<>();
        }
        this.payments.add(builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    public PaymentInfoBuilder payments(
            final java.util.List<com.commercetools.history.models.common.Reference> payments) {
        this.payments = payments;
        return this;
    }

    public java.util.List<com.commercetools.history.models.common.Reference> getPayments() {
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
