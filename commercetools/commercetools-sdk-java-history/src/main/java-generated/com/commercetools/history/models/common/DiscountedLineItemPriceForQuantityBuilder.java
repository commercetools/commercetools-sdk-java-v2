
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DiscountedLineItemPriceForQuantityBuilder implements Builder<DiscountedLineItemPriceForQuantity> {

    private Integer quantity;

    private com.commercetools.history.models.common.DiscountedLineItemPrice discountedPrice;

    public DiscountedLineItemPriceForQuantityBuilder quantity(final Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public DiscountedLineItemPriceForQuantityBuilder discountedPrice(
            Function<com.commercetools.history.models.common.DiscountedLineItemPriceBuilder, com.commercetools.history.models.common.DiscountedLineItemPriceBuilder> builder) {
        this.discountedPrice = builder
                .apply(com.commercetools.history.models.common.DiscountedLineItemPriceBuilder.of())
                .build();
        return this;
    }

    public DiscountedLineItemPriceForQuantityBuilder discountedPrice(
            final com.commercetools.history.models.common.DiscountedLineItemPrice discountedPrice) {
        this.discountedPrice = discountedPrice;
        return this;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public com.commercetools.history.models.common.DiscountedLineItemPrice getDiscountedPrice() {
        return this.discountedPrice;
    }

    public DiscountedLineItemPriceForQuantity build() {
        Objects.requireNonNull(quantity, DiscountedLineItemPriceForQuantity.class + ": quantity is missing");
        Objects.requireNonNull(discountedPrice,
            DiscountedLineItemPriceForQuantity.class + ": discountedPrice is missing");
        return new DiscountedLineItemPriceForQuantityImpl(quantity, discountedPrice);
    }

    /**
     * builds DiscountedLineItemPriceForQuantity without checking for non null required values
     */
    public DiscountedLineItemPriceForQuantity buildUnchecked() {
        return new DiscountedLineItemPriceForQuantityImpl(quantity, discountedPrice);
    }

    public static DiscountedLineItemPriceForQuantityBuilder of() {
        return new DiscountedLineItemPriceForQuantityBuilder();
    }

    public static DiscountedLineItemPriceForQuantityBuilder of(final DiscountedLineItemPriceForQuantity template) {
        DiscountedLineItemPriceForQuantityBuilder builder = new DiscountedLineItemPriceForQuantityBuilder();
        builder.quantity = template.getQuantity();
        builder.discountedPrice = template.getDiscountedPrice();
        return builder;
    }

}
