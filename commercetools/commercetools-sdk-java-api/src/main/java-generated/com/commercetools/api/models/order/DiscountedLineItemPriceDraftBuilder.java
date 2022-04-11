
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class DiscountedLineItemPriceDraftBuilder implements Builder<DiscountedLineItemPriceDraft> {

    private com.commercetools.api.models.common.Money value;

    private java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPortion> includedDiscounts;

    public DiscountedLineItemPriceDraftBuilder value(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.value = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public DiscountedLineItemPriceDraftBuilder value(final com.commercetools.api.models.common.Money value) {
        this.value = value;
        return this;
    }

    public DiscountedLineItemPriceDraftBuilder includedDiscounts(
            final com.commercetools.api.models.cart.DiscountedLineItemPortion... includedDiscounts) {
        this.includedDiscounts = new ArrayList<>(Arrays.asList(includedDiscounts));
        return this;
    }

    public DiscountedLineItemPriceDraftBuilder includedDiscounts(
            final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPortion> includedDiscounts) {
        this.includedDiscounts = includedDiscounts;
        return this;
    }

    public DiscountedLineItemPriceDraftBuilder plusIncludedDiscounts(
            final com.commercetools.api.models.cart.DiscountedLineItemPortion... includedDiscounts) {
        if (this.includedDiscounts == null) {
            this.includedDiscounts = new ArrayList<>();
        }
        this.includedDiscounts.addAll(Arrays.asList(includedDiscounts));
        return this;
    }

    public DiscountedLineItemPriceDraftBuilder plusIncludedDiscounts(
            Function<com.commercetools.api.models.cart.DiscountedLineItemPortionBuilder, com.commercetools.api.models.cart.DiscountedLineItemPortionBuilder> builder) {
        if (this.includedDiscounts == null) {
            this.includedDiscounts = new ArrayList<>();
        }
        this.includedDiscounts
                .add(builder.apply(com.commercetools.api.models.cart.DiscountedLineItemPortionBuilder.of()).build());
        return this;
    }

    public DiscountedLineItemPriceDraftBuilder withIncludedDiscounts(
            Function<com.commercetools.api.models.cart.DiscountedLineItemPortionBuilder, com.commercetools.api.models.cart.DiscountedLineItemPortionBuilder> builder) {
        this.includedDiscounts = new ArrayList<>();
        this.includedDiscounts
                .add(builder.apply(com.commercetools.api.models.cart.DiscountedLineItemPortionBuilder.of()).build());
        return this;
    }

    public com.commercetools.api.models.common.Money getValue() {
        return this.value;
    }

    public java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPortion> getIncludedDiscounts() {
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
