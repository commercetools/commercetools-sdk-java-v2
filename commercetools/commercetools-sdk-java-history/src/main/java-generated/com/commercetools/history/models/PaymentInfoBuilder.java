
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentInfoBuilder {

    private java.util.List<com.commercetools.history.models.Reference> payments;

    public PaymentInfoBuilder payments(final com.commercetools.history.models.Reference... payments) {
        this.payments = new ArrayList<>(Arrays.asList(payments));
        return this;
    }

    public PaymentInfoBuilder payments(final java.util.List<com.commercetools.history.models.Reference> payments) {
        this.payments = payments;
        return this;
    }

    public java.util.List<com.commercetools.history.models.Reference> getPayments() {
        return this.payments;
    }

    public PaymentInfo build() {
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
