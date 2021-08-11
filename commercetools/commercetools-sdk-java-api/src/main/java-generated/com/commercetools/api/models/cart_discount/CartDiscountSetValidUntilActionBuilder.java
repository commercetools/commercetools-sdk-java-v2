
package com.commercetools.api.models.cart_discount;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartDiscountSetValidUntilActionBuilder implements Builder<CartDiscountSetValidUntilAction> {

    @Nullable
    private java.time.ZonedDateTime validUntil;

    public CartDiscountSetValidUntilActionBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    public CartDiscountSetValidUntilAction build() {
        return new CartDiscountSetValidUntilActionImpl(validUntil);
    }

    /**
     * builds CartDiscountSetValidUntilAction without checking for non null required values
     */
    public CartDiscountSetValidUntilAction buildUnchecked() {
        return new CartDiscountSetValidUntilActionImpl(validUntil);
    }

    public static CartDiscountSetValidUntilActionBuilder of() {
        return new CartDiscountSetValidUntilActionBuilder();
    }

    public static CartDiscountSetValidUntilActionBuilder of(final CartDiscountSetValidUntilAction template) {
        CartDiscountSetValidUntilActionBuilder builder = new CartDiscountSetValidUntilActionBuilder();
        builder.validUntil = template.getValidUntil();
        return builder;
    }

}
