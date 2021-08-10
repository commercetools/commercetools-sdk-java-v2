
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DiscountedLineItemPriceForQuantityBuilder implements Builder<DiscountedLineItemPriceForQuantity> {

    private Double quantity;

    private com.commercetools.api.models.cart.DiscountedLineItemPrice discountedPrice;

    public DiscountedLineItemPriceForQuantityBuilder quantity(final Double quantity) {
        this.quantity = quantity;
        return this;
    }

    public DiscountedLineItemPriceForQuantityBuilder discountedPrice(
            final com.commercetools.api.models.cart.DiscountedLineItemPrice discountedPrice) {
        this.discountedPrice = discountedPrice;
        return this;
    }

    public Double getQuantity() {
        return this.quantity;
    }

    public com.commercetools.api.models.cart.DiscountedLineItemPrice getDiscountedPrice() {
        return this.discountedPrice;
    }

    public DiscountedLineItemPriceForQuantity build() {
        Objects.requireNonNull(quantity);
        Objects.requireNonNull(discountedPrice);
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
