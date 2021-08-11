
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DiscountedLineItemPriceBuilder implements Builder<DiscountedLineItemPrice> {

    private com.commercetools.history.models.common.Money value;

    private java.util.List<com.commercetools.history.models.common.DiscountedLineItemPortion> includedDiscounts;

    public DiscountedLineItemPriceBuilder value(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.value = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public DiscountedLineItemPriceBuilder value(final com.commercetools.history.models.common.Money value) {
        this.value = value;
        return this;
    }

    public DiscountedLineItemPriceBuilder includedDiscounts(
            final com.commercetools.history.models.common.DiscountedLineItemPortion... includedDiscounts) {
        this.includedDiscounts = new ArrayList<>(Arrays.asList(includedDiscounts));
        return this;
    }

    public DiscountedLineItemPriceBuilder withIncludedDiscounts(
            Function<com.commercetools.history.models.common.DiscountedLineItemPortionBuilder, com.commercetools.history.models.common.DiscountedLineItemPortionBuilder> builder) {
        this.includedDiscounts = new ArrayList<>();
        this.includedDiscounts.add(
            builder.apply(com.commercetools.history.models.common.DiscountedLineItemPortionBuilder.of()).build());
        return this;
    }

    public DiscountedLineItemPriceBuilder plusIncludedDiscounts(
            Function<com.commercetools.history.models.common.DiscountedLineItemPortionBuilder, com.commercetools.history.models.common.DiscountedLineItemPortionBuilder> builder) {
        if (this.includedDiscounts == null) {
            this.includedDiscounts = new ArrayList<>();
        }
        this.includedDiscounts.add(
            builder.apply(com.commercetools.history.models.common.DiscountedLineItemPortionBuilder.of()).build());
        return this;
    }

    public DiscountedLineItemPriceBuilder includedDiscounts(
            final java.util.List<com.commercetools.history.models.common.DiscountedLineItemPortion> includedDiscounts) {
        this.includedDiscounts = includedDiscounts;
        return this;
    }

    public com.commercetools.history.models.common.Money getValue() {
        return this.value;
    }

    public java.util.List<com.commercetools.history.models.common.DiscountedLineItemPortion> getIncludedDiscounts() {
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
