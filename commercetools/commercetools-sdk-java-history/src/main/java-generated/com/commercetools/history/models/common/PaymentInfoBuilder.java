
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentInfoBuilder implements Builder<PaymentInfo> {

    private java.util.List<com.commercetools.history.models.common.Reference> payments;

    public PaymentInfoBuilder payments(final com.commercetools.history.models.common.Reference... payments) {
        this.payments = new ArrayList<>(Arrays.asList(payments));
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
        Objects.requireNonNull(payments);
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
