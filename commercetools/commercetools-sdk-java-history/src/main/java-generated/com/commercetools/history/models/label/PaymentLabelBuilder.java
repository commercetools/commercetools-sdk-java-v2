
package com.commercetools.history.models.label;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentLabelBuilder {

    private String key;

    private com.commercetools.history.models.common.Money amountPlanned;

    public PaymentLabelBuilder key(final String key) {
        this.key = key;
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
