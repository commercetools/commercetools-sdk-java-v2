
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DiscountedLineItemPriceBuilder {

    private com.commercetools.api.models.common.TypedMoney value;

    private java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPortion> includedDiscounts;

    public DiscountedLineItemPriceBuilder value(final com.commercetools.api.models.common.TypedMoney value) {
        this.value = value;
        return this;
    }

    public DiscountedLineItemPriceBuilder includedDiscounts(
            final com.commercetools.api.models.cart.DiscountedLineItemPortion... includedDiscounts) {
        this.includedDiscounts = new ArrayList<>(Arrays.asList(includedDiscounts));
        return this;
    }

    public DiscountedLineItemPriceBuilder includedDiscounts(
            final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPortion> includedDiscounts) {
        this.includedDiscounts = includedDiscounts;
        return this;
    }

    public com.commercetools.api.models.common.TypedMoney getValue() {
        return this.value;
    }

    public java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPortion> getIncludedDiscounts() {
        return this.includedDiscounts;
    }

    public DiscountedLineItemPrice build() {
        return new DiscountedLineItemPriceImpl(value, includedDiscounts);
    }

    public static DiscountedLineItemPriceBuilder of() {
        return new DiscountedLineItemPriceBuilder();
    }

    public static DiscountedLineItemPriceBuilder of(final DiscountedLineItemPrice template) {
        DiscountedLineItemPriceBuilder builder = new DiscountedLineItemPriceBuilder();
        builder.value = template.getValue();
        builder.includedDiscounts = template.getIncludedDiscounts();
        return builder;
    }

}
