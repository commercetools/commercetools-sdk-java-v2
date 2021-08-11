
package com.commercetools.history.models.label;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentLabelBuilder implements Builder<PaymentLabel> {

    private String key;

    private com.commercetools.history.models.common.Money amountPlanned;

    public PaymentLabelBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public PaymentLabelBuilder amountPlanned(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.amountPlanned = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public PaymentLabelBuilder amountPlanned(final com.commercetools.history.models.common.Money amountPlanned) {
        this.amountPlanned = amountPlanned;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public com.commercetools.history.models.common.Money getAmountPlanned() {
        return this.amountPlanned;
    }

    public PaymentLabel build() {
        Objects.requireNonNull(key, PaymentLabel.class + ": key is missing");
        Objects.requireNonNull(amountPlanned, PaymentLabel.class + ": amountPlanned is missing");
        return new PaymentLabelImpl(key, amountPlanned);
    }

    /**
     * builds PaymentLabel without checking for non null required values
     */
    public PaymentLabel buildUnchecked() {
        return new PaymentLabelImpl(key, amountPlanned);
    }

    public static PaymentLabelBuilder of() {
        return new PaymentLabelBuilder();
    }

    public static PaymentLabelBuilder of(final PaymentLabel template) {
        PaymentLabelBuilder builder = new PaymentLabelBuilder();
        builder.key = template.getKey();
        builder.amountPlanned = template.getAmountPlanned();
        return builder;
    }

}
