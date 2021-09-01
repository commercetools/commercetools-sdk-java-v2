
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DiscountedLineItemPortionBuilder implements Builder<DiscountedLineItemPortion> {

    private com.commercetools.history.models.common.Reference discount;

    private com.commercetools.history.models.common.Money discountedAmount;

    public DiscountedLineItemPortionBuilder discount(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.discount = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    public DiscountedLineItemPortionBuilder discount(final com.commercetools.history.models.common.Reference discount) {
        this.discount = discount;
        return this;
    }

    public DiscountedLineItemPortionBuilder discountedAmount(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.discountedAmount = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public DiscountedLineItemPortionBuilder discountedAmount(
            final com.commercetools.history.models.common.Money discountedAmount) {
        this.discountedAmount = discountedAmount;
        return this;
    }

    public com.commercetools.history.models.common.Reference getDiscount() {
        return this.discount;
    }

    public com.commercetools.history.models.common.Money getDiscountedAmount() {
        return this.discountedAmount;
    }

    public DiscountedLineItemPortion build() {
        Objects.requireNonNull(discount, DiscountedLineItemPortion.class + ": discount is missing");
        Objects.requireNonNull(discountedAmount, DiscountedLineItemPortion.class + ": discountedAmount is missing");
        return new DiscountedLineItemPortionImpl(discount, discountedAmount);
    }

    /**
     * builds DiscountedLineItemPortion without checking for non null required values
     */
    public DiscountedLineItemPortion buildUnchecked() {
        return new DiscountedLineItemPortionImpl(discount, discountedAmount);
    }

    public static DiscountedLineItemPortionBuilder of() {
        return new DiscountedLineItemPortionBuilder();
    }

    public static DiscountedLineItemPortionBuilder of(final DiscountedLineItemPortion template) {
        DiscountedLineItemPortionBuilder builder = new DiscountedLineItemPortionBuilder();
        builder.discount = template.getDiscount();
        builder.discountedAmount = template.getDiscountedAmount();
        return builder;
    }

}
