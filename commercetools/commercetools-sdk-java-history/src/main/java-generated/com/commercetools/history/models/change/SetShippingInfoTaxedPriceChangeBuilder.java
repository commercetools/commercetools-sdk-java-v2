
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetShippingInfoTaxedPriceChangeBuilder implements Builder<SetShippingInfoTaxedPriceChange> {

    private String change;

    private com.commercetools.history.models.common.TaxedPrice nextValue;

    private com.commercetools.history.models.common.TaxedPrice previousValue;

    public SetShippingInfoTaxedPriceChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetShippingInfoTaxedPriceChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.TaxedPriceBuilder, com.commercetools.history.models.common.TaxedPriceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.TaxedPriceBuilder.of()).build();
        return this;
    }

    public SetShippingInfoTaxedPriceChangeBuilder nextValue(
            final com.commercetools.history.models.common.TaxedPrice nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetShippingInfoTaxedPriceChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.TaxedPriceBuilder, com.commercetools.history.models.common.TaxedPriceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.TaxedPriceBuilder.of()).build();
        return this;
    }

    public SetShippingInfoTaxedPriceChangeBuilder previousValue(
            final com.commercetools.history.models.common.TaxedPrice previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.TaxedPrice getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.TaxedPrice getPreviousValue() {
        return this.previousValue;
    }

    public SetShippingInfoTaxedPriceChange build() {
        Objects.requireNonNull(change, SetShippingInfoTaxedPriceChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, SetShippingInfoTaxedPriceChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetShippingInfoTaxedPriceChange.class + ": previousValue is missing");
        return new SetShippingInfoTaxedPriceChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds SetShippingInfoTaxedPriceChange without checking for non null required values
     */
    public SetShippingInfoTaxedPriceChange buildUnchecked() {
        return new SetShippingInfoTaxedPriceChangeImpl(change, nextValue, previousValue);
    }

    public static SetShippingInfoTaxedPriceChangeBuilder of() {
        return new SetShippingInfoTaxedPriceChangeBuilder();
    }

    public static SetShippingInfoTaxedPriceChangeBuilder of(final SetShippingInfoTaxedPriceChange template) {
        SetShippingInfoTaxedPriceChangeBuilder builder = new SetShippingInfoTaxedPriceChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
