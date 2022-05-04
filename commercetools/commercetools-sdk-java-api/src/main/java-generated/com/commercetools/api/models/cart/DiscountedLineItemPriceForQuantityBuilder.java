
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class DiscountedLineItemPriceForQuantityBuilder implements Builder<DiscountedLineItemPriceForQuantity> {

    private Long quantity;

    private com.commercetools.api.models.cart.DiscountedLineItemPrice discountedPrice;

    public DiscountedLineItemPriceForQuantityBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public DiscountedLineItemPriceForQuantityBuilder discountedPrice(
            Function<com.commercetools.api.models.cart.DiscountedLineItemPriceBuilder, com.commercetools.api.models.cart.DiscountedLineItemPriceBuilder> builder) {
        this.discountedPrice = builder.apply(com.commercetools.api.models.cart.DiscountedLineItemPriceBuilder.of())
                .build();
        return this;
    }

    public DiscountedLineItemPriceForQuantityBuilder discountedPrice(
            final com.commercetools.api.models.cart.DiscountedLineItemPrice discountedPrice) {
        this.discountedPrice = discountedPrice;
        return this;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public com.commercetools.api.models.cart.DiscountedLineItemPrice getDiscountedPrice() {
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
