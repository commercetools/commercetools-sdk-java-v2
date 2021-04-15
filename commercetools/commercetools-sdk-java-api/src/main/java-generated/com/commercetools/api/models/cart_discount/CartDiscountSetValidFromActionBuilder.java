
package com.commercetools.api.models.cart_discount;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartDiscountSetValidFromActionBuilder {

    @Nullable
    private java.time.ZonedDateTime validFrom;

    public CartDiscountSetValidFromActionBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    public CartDiscountSetValidFromAction build() {
        return new CartDiscountSetValidFromActionImpl(validFrom);
    }

    public static CartDiscountSetValidFromActionBuilder of() {
        return new CartDiscountSetValidFromActionBuilder();
    }

    public static CartDiscountSetValidFromActionBuilder of(final CartDiscountSetValidFromAction template) {
        CartDiscountSetValidFromActionBuilder builder = new CartDiscountSetValidFromActionBuilder();
        builder.validFrom = template.getValidFrom();
        return builder;
    }

}
