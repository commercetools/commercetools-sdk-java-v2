
package com.commercetools.api.models.discount_code;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DiscountCodeSetValidUntilActionBuilder implements Builder<DiscountCodeSetValidUntilAction> {

    @Nullable
    private java.time.ZonedDateTime validUntil;

    public DiscountCodeSetValidUntilActionBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    public DiscountCodeSetValidUntilAction build() {
        return new DiscountCodeSetValidUntilActionImpl(validUntil);
    }

    /**
     * builds DiscountCodeSetValidUntilAction without checking for non null required values
     */
    public DiscountCodeSetValidUntilAction buildUnchecked() {
        return new DiscountCodeSetValidUntilActionImpl(validUntil);
    }

    public static DiscountCodeSetValidUntilActionBuilder of() {
        return new DiscountCodeSetValidUntilActionBuilder();
    }

    public static DiscountCodeSetValidUntilActionBuilder of(final DiscountCodeSetValidUntilAction template) {
        DiscountCodeSetValidUntilActionBuilder builder = new DiscountCodeSetValidUntilActionBuilder();
        builder.validUntil = template.getValidUntil();
        return builder;
    }

}
