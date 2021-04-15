
package com.commercetools.api.models.discount_code;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DiscountCodeSetValidFromAndUntilActionBuilder {

    @Nullable
    private java.time.ZonedDateTime validFrom;

    @Nullable
    private java.time.ZonedDateTime validUntil;

    public DiscountCodeSetValidFromAndUntilActionBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    public DiscountCodeSetValidFromAndUntilActionBuilder validUntil(
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

    public DiscountCodeSetValidFromAndUntilAction build() {
        return new DiscountCodeSetValidFromAndUntilActionImpl(validFrom, validUntil);
    }

    public static DiscountCodeSetValidFromAndUntilActionBuilder of() {
        return new DiscountCodeSetValidFromAndUntilActionBuilder();
    }

    public static DiscountCodeSetValidFromAndUntilActionBuilder of(
            final DiscountCodeSetValidFromAndUntilAction template) {
        DiscountCodeSetValidFromAndUntilActionBuilder builder = new DiscountCodeSetValidFromAndUntilActionBuilder();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        return builder;
    }

}
