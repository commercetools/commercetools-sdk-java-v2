
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DiscountedLineItemPriceForQuantityBuilder {

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
