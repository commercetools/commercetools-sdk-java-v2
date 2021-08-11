
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartAddDiscountCodeActionBuilder implements Builder<CartAddDiscountCodeAction> {

    private String code;

    public CartAddDiscountCodeActionBuilder code(final String code) {
        this.code = code;
        return this;
    }

    public String getCode() {
        return this.code;
    }

    public CartAddDiscountCodeAction build() {
        Objects.requireNonNull(code, CartAddDiscountCodeAction.class + ": code is missing");
        return new CartAddDiscountCodeActionImpl(code);
    }

    /**
     * builds CartAddDiscountCodeAction without checking for non null required values
     */
    public CartAddDiscountCodeAction buildUnchecked() {
        return new CartAddDiscountCodeActionImpl(code);
    }

    public static CartAddDiscountCodeActionBuilder of() {
        return new CartAddDiscountCodeActionBuilder();
    }

    public static CartAddDiscountCodeActionBuilder of(final CartAddDiscountCodeAction template) {
        CartAddDiscountCodeActionBuilder builder = new CartAddDiscountCodeActionBuilder();
        builder.code = template.getCode();
        return builder;
    }

}
