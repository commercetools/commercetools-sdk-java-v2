
package com.commercetools.api.models.product_discount;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductDiscountSetValidFromAndUntilActionBuilder {

    @Nullable
    private java.time.ZonedDateTime validFrom;

    @Nullable
    private java.time.ZonedDateTime validUntil;

    public ProductDiscountSetValidFromAndUntilActionBuilder validFrom(
            @Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    public ProductDiscountSetValidFromAndUntilActionBuilder validUntil(
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

    public ProductDiscountSetValidFromAndUntilAction build() {
        return new ProductDiscountSetValidFromAndUntilActionImpl(validFrom, validUntil);
    }

    public static ProductDiscountSetValidFromAndUntilActionBuilder of() {
        return new ProductDiscountSetValidFromAndUntilActionBuilder();
    }

    public static ProductDiscountSetValidFromAndUntilActionBuilder of(
            final ProductDiscountSetValidFromAndUntilAction template) {
        ProductDiscountSetValidFromAndUntilActionBuilder builder = new ProductDiscountSetValidFromAndUntilActionBuilder();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        return builder;
    }

}
