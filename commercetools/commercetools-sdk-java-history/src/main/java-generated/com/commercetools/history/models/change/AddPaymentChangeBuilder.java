
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddPaymentChangeBuilder implements Builder<AddPaymentChange> {

    private String change;

    private com.commercetools.history.models.common.PaymentInfo nextValue;

    private com.commercetools.history.models.common.PaymentInfo previousValue;

    public AddPaymentChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddPaymentChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.PaymentInfoBuilder, com.commercetools.history.models.common.PaymentInfoBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.PaymentInfoBuilder.of()).build();
        return this;
    }

    public AddPaymentChangeBuilder nextValue(final com.commercetools.history.models.common.PaymentInfo nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public AddPaymentChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.PaymentInfoBuilder, com.commercetools.history.models.common.PaymentInfoBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.PaymentInfoBuilder.of()).build();
        return this;
    }

    public AddPaymentChangeBuilder previousValue(
            final com.commercetools.history.models.common.PaymentInfo previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.PaymentInfo getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.PaymentInfo getPreviousValue() {
        return this.previousValue;
    }

    public AddPaymentChange build() {
        Objects.requireNonNull(change, AddPaymentChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, AddPaymentChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, AddPaymentChange.class + ": previousValue is missing");
        return new AddPaymentChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds AddPaymentChange without checking for non null required values
     */
    public AddPaymentChange buildUnchecked() {
        return new AddPaymentChangeImpl(change, nextValue, previousValue);
    }

    public static AddPaymentChangeBuilder of() {
        return new AddPaymentChangeBuilder();
    }

    public static AddPaymentChangeBuilder of(final AddPaymentChange template) {
        AddPaymentChangeBuilder builder = new AddPaymentChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
