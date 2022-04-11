
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class DiscountedLineItemPriceBuilder implements Builder<DiscountedLineItemPrice> {

    private com.commercetools.api.models.common.TypedMoney value;

    private java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPortion> includedDiscounts;

    public DiscountedLineItemPriceBuilder value(final com.commercetools.api.models.common.TypedMoney value) {
        this.value = value;
        return this;
    }

    public DiscountedLineItemPriceBuilder value(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.value = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
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

    public DiscountedLineItemPriceBuilder plusIncludedDiscounts(
            final com.commercetools.api.models.cart.DiscountedLineItemPortion... includedDiscounts) {
        if (this.includedDiscounts == null) {
            this.includedDiscounts = new ArrayList<>();
        }
        this.includedDiscounts.addAll(Arrays.asList(includedDiscounts));
        return this;
    }

    public DiscountedLineItemPriceBuilder plusIncludedDiscounts(
            Function<com.commercetools.api.models.cart.DiscountedLineItemPortionBuilder, com.commercetools.api.models.cart.DiscountedLineItemPortionBuilder> builder) {
        if (this.includedDiscounts == null) {
            this.includedDiscounts = new ArrayList<>();
        }
        this.includedDiscounts
                .add(builder.apply(com.commercetools.api.models.cart.DiscountedLineItemPortionBuilder.of()).build());
        return this;
    }

    public DiscountedLineItemPriceBuilder withIncludedDiscounts(
            Function<com.commercetools.api.models.cart.DiscountedLineItemPortionBuilder, com.commercetools.api.models.cart.DiscountedLineItemPortionBuilder> builder) {
        this.includedDiscounts = new ArrayList<>();
        this.includedDiscounts
                .add(builder.apply(com.commercetools.api.models.cart.DiscountedLineItemPortionBuilder.of()).build());
        return this;
    }

    public com.commercetools.api.models.common.TypedMoney getValue() {
        return this.value;
    }

    public java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPortion> getIncludedDiscounts() {
        return this.includedDiscounts;
    }

    public DiscountedLineItemPrice build() {
        Objects.requireNonNull(value, DiscountedLineItemPrice.class + ": value is missing");
        Objects.requireNonNull(includedDiscounts, DiscountedLineItemPrice.class + ": includedDiscounts is missing");
        return new DiscountedLineItemPriceImpl(value, includedDiscounts);
    }

    /**
     * builds DiscountedLineItemPrice without checking for non null required values
     */
    public DiscountedLineItemPrice buildUnchecked() {
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
