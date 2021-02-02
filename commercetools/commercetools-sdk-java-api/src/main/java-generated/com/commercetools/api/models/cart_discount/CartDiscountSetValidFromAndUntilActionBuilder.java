
package com.commercetools.api.models.cart_discount;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartDiscountSetValidFromAndUntilActionBuilder {

    @Nullable
    private java.time.ZonedDateTime validFrom;

    @Nullable
    private java.time.ZonedDateTime validUntil;

    public CartDiscountSetValidFromAndUntilActionBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    public CartDiscountSetValidFromAndUntilActionBuilder validUntil(
            @Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    public CartDiscountSetValidFromAndUntilAction build() {
        return new CartDiscountSetValidFromAndUntilActionImpl(validFrom, validUntil);
    }

    public static CartDiscountSetValidFromAndUntilActionBuilder of() {
        return new CartDiscountSetValidFromAndUntilActionBuilder();
    }

    public static CartDiscountSetValidFromAndUntilActionBuilder of(
            final CartDiscountSetValidFromAndUntilAction template) {
        CartDiscountSetValidFromAndUntilActionBuilder builder = new CartDiscountSetValidFromAndUntilActionBuilder();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        return builder;
    }

}
