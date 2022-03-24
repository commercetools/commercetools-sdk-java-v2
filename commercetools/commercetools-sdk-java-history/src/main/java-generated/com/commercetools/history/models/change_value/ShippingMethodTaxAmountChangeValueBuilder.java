
package com.commercetools.history.models.change_value;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ShippingMethodTaxAmountChangeValueBuilder implements Builder<ShippingMethodTaxAmountChangeValue> {

    private com.commercetools.history.models.common.TaxedPrice taxedPrice;

    private com.commercetools.history.models.common.TaxRate taxRate;

    public ShippingMethodTaxAmountChangeValueBuilder taxedPrice(
            Function<com.commercetools.history.models.common.TaxedPriceBuilder, com.commercetools.history.models.common.TaxedPriceBuilder> builder) {
        this.taxedPrice = builder.apply(com.commercetools.history.models.common.TaxedPriceBuilder.of()).build();
        return this;
    }

    public ShippingMethodTaxAmountChangeValueBuilder taxedPrice(
            final com.commercetools.history.models.common.TaxedPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    public ShippingMethodTaxAmountChangeValueBuilder taxRate(
            Function<com.commercetools.history.models.common.TaxRateBuilder, com.commercetools.history.models.common.TaxRateBuilder> builder) {
        this.taxRate = builder.apply(com.commercetools.history.models.common.TaxRateBuilder.of()).build();
        return this;
    }

    public ShippingMethodTaxAmountChangeValueBuilder taxRate(
            final com.commercetools.history.models.common.TaxRate taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    public com.commercetools.history.models.common.TaxedPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    public com.commercetools.history.models.common.TaxRate getTaxRate() {
        return this.taxRate;
    }

    public ShippingMethodTaxAmountChangeValue build() {
        Objects.requireNonNull(taxedPrice, ShippingMethodTaxAmountChangeValue.class + ": taxedPrice is missing");
        Objects.requireNonNull(taxRate, ShippingMethodTaxAmountChangeValue.class + ": taxRate is missing");
        return new ShippingMethodTaxAmountChangeValueImpl(taxedPrice, taxRate);
    }

    /**
     * builds ShippingMethodTaxAmountChangeValue without checking for non null required values
     */
    public ShippingMethodTaxAmountChangeValue buildUnchecked() {
        return new ShippingMethodTaxAmountChangeValueImpl(taxedPrice, taxRate);
    }

    public static ShippingMethodTaxAmountChangeValueBuilder of() {
        return new ShippingMethodTaxAmountChangeValueBuilder();
    }

    public static ShippingMethodTaxAmountChangeValueBuilder of(final ShippingMethodTaxAmountChangeValue template) {
        ShippingMethodTaxAmountChangeValueBuilder builder = new ShippingMethodTaxAmountChangeValueBuilder();
        builder.taxedPrice = template.getTaxedPrice();
        builder.taxRate = template.getTaxRate();
        return builder;
    }

}
