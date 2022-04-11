
package com.commercetools.api.models.cart_discount;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CartDiscountTargetBuilder {

    public com.commercetools.api.models.cart_discount.CartDiscountCustomLineItemsTargetBuilder customLineItemsBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountCustomLineItemsTargetBuilder.of();
    }

    public com.commercetools.api.models.cart_discount.CartDiscountLineItemsTargetBuilder lineItemsBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountLineItemsTargetBuilder.of();
    }

    public com.commercetools.api.models.cart_discount.CartDiscountShippingCostTargetBuilder shippingBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountShippingCostTargetBuilder.of();
    }

    public com.commercetools.api.models.cart_discount.MultiBuyCustomLineItemsTargetBuilder multiBuyCustomLineItemsBuilder() {
        return com.commercetools.api.models.cart_discount.MultiBuyCustomLineItemsTargetBuilder.of();
    }

    public com.commercetools.api.models.cart_discount.MultiBuyLineItemsTargetBuilder multiBuyLineItemsBuilder() {
        return com.commercetools.api.models.cart_discount.MultiBuyLineItemsTargetBuilder.of();
    }

    public static CartDiscountTargetBuilder of() {
        return new CartDiscountTargetBuilder();
    }
}
