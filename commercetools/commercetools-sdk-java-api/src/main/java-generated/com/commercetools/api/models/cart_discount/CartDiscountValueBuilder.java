
package com.commercetools.api.models.cart_discount;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountValueBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountValueBuilder {

    public com.commercetools.api.models.cart_discount.CartDiscountValueAbsoluteBuilder absoluteBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountValueAbsoluteBuilder.of();
    }

    public com.commercetools.api.models.cart_discount.CartDiscountValueFixedBuilder fixedBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountValueFixedBuilder.of();
    }

    public com.commercetools.api.models.cart_discount.CartDiscountValueGiftLineItemBuilder giftLineItemBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountValueGiftLineItemBuilder.of();
    }

    public com.commercetools.api.models.cart_discount.CartDiscountValueRelativeBuilder relativeBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountValueRelativeBuilder.of();
    }

    /**
     * factory method for an instance of CartDiscountValueBuilder
     * @return builder
     */
    public static CartDiscountValueBuilder of() {
        return new CartDiscountValueBuilder();
    }
}
