
package com.commercetools.api.models.cart_discount;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CartDiscountValueDraftBuilder {

    public com.commercetools.api.models.cart_discount.CartDiscountValueAbsoluteDraftBuilder absoluteBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountValueAbsoluteDraftBuilder.of();
    }

    public com.commercetools.api.models.cart_discount.CartDiscountValueFixedDraftBuilder fixedBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountValueFixedDraftBuilder.of();
    }

    public com.commercetools.api.models.cart_discount.CartDiscountValueGiftLineItemDraftBuilder giftLineItemBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountValueGiftLineItemDraftBuilder.of();
    }

    public com.commercetools.api.models.cart_discount.CartDiscountValueRelativeDraftBuilder relativeBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountValueRelativeDraftBuilder.of();
    }

    public static CartDiscountValueDraftBuilder of() {
        return new CartDiscountValueDraftBuilder();
    }
}
