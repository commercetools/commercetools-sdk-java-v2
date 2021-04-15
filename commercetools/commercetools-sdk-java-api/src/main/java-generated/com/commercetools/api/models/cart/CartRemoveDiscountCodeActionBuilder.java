
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartRemoveDiscountCodeActionBuilder {

    private com.commercetools.api.models.discount_code.DiscountCodeReference discountCode;

    public CartRemoveDiscountCodeActionBuilder discountCode(
            final com.commercetools.api.models.discount_code.DiscountCodeReference discountCode) {
        this.discountCode = discountCode;
        return this;
    }

    public com.commercetools.api.models.discount_code.DiscountCodeReference getDiscountCode() {
        return this.discountCode;
    }

    public CartRemoveDiscountCodeAction build() {
        return new CartRemoveDiscountCodeActionImpl(discountCode);
    }

    public static CartRemoveDiscountCodeActionBuilder of() {
        return new CartRemoveDiscountCodeActionBuilder();
    }

    public static CartRemoveDiscountCodeActionBuilder of(final CartRemoveDiscountCodeAction template) {
        CartRemoveDiscountCodeActionBuilder builder = new CartRemoveDiscountCodeActionBuilder();
        builder.discountCode = template.getDiscountCode();
        return builder;
    }

}
