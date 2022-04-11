
package com.commercetools.importapi.models.orders;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class DiscountedLineItemPriceDraftBuilder implements Builder<DiscountedLineItemPriceDraft> {

    private com.commercetools.importapi.models.common.Money value;

    private java.util.List<com.commercetools.importapi.models.orders.DiscountedLineItemPortion> includedDiscounts;

    public DiscountedLineItemPriceDraftBuilder value(
            Function<com.commercetools.importapi.models.common.MoneyBuilder, com.commercetools.importapi.models.common.MoneyBuilder> builder) {
        this.value = builder.apply(com.commercetools.importapi.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public DiscountedLineItemPriceDraftBuilder value(final com.commercetools.importapi.models.common.Money value) {
        this.value = value;
        return this;
    }

    public DiscountedLineItemPriceDraftBuilder includedDiscounts(
            final com.commercetools.importapi.models.orders.DiscountedLineItemPortion... includedDiscounts) {
        this.includedDiscounts = new ArrayList<>(Arrays.asList(includedDiscounts));
        return this;
    }

    public DiscountedLineItemPriceDraftBuilder includedDiscounts(
            final java.util.List<com.commercetools.importapi.models.orders.DiscountedLineItemPortion> includedDiscounts) {
        this.includedDiscounts = includedDiscounts;
        return this;
    }

    public DiscountedLineItemPriceDraftBuilder plusIncludedDiscounts(
            final com.commercetools.importapi.models.orders.DiscountedLineItemPortion... includedDiscounts) {
        if (this.includedDiscounts == null) {
            this.includedDiscounts = new ArrayList<>();
        }
        this.includedDiscounts.addAll(Arrays.asList(includedDiscounts));
        return this;
    }

    public DiscountedLineItemPriceDraftBuilder plusIncludedDiscounts(
            Function<com.commercetools.importapi.models.orders.DiscountedLineItemPortionBuilder, com.commercetools.importapi.models.orders.DiscountedLineItemPortionBuilder> builder) {
        if (this.includedDiscounts == null) {
            this.includedDiscounts = new ArrayList<>();
        }
        this.includedDiscounts.add(
            builder.apply(com.commercetools.importapi.models.orders.DiscountedLineItemPortionBuilder.of()).build());
        return this;
    }

    public DiscountedLineItemPriceDraftBuilder withIncludedDiscounts(
            Function<com.commercetools.importapi.models.orders.DiscountedLineItemPortionBuilder, com.commercetools.importapi.models.orders.DiscountedLineItemPortionBuilder> builder) {
        this.includedDiscounts = new ArrayList<>();
        this.includedDiscounts.add(
            builder.apply(com.commercetools.importapi.models.orders.DiscountedLineItemPortionBuilder.of()).build());
        return this;
    }

    public com.commercetools.importapi.models.common.Money getValue() {
        return this.value;
    }

    public java.util.List<com.commercetools.importapi.models.orders.DiscountedLineItemPortion> getIncludedDiscounts() {
        return this.includedDiscounts;
    }

    public DiscountedLineItemPriceDraft build() {
        Objects.requireNonNull(value, DiscountedLineItemPriceDraft.class + ": value is missing");
        Objects.requireNonNull(includedDiscounts,
            DiscountedLineItemPriceDraft.class + ": includedDiscounts is missing");
        return new DiscountedLineItemPriceDraftImpl(value, includedDiscounts);
    }

    /**
     * builds DiscountedLineItemPriceDraft without checking for non null required values
     */
    public DiscountedLineItemPriceDraft buildUnchecked() {
        return new DiscountedLineItemPriceDraftImpl(value, includedDiscounts);
    }

    public static DiscountedLineItemPriceDraftBuilder of() {
        return new DiscountedLineItemPriceDraftBuilder();
    }

    public static DiscountedLineItemPriceDraftBuilder of(final DiscountedLineItemPriceDraft template) {
        DiscountedLineItemPriceDraftBuilder builder = new DiscountedLineItemPriceDraftBuilder();
        builder.value = template.getValue();
        builder.includedDiscounts = template.getIncludedDiscounts();
        return builder;
    }

}
