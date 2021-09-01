
package com.commercetools.api.models.discount_code;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DiscountCodeSetValidFromActionBuilder implements Builder<DiscountCodeSetValidFromAction> {

    @Nullable
    private java.time.ZonedDateTime validFrom;

    public DiscountCodeSetValidFromActionBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    public DiscountCodeSetValidFromAction build() {
        return new DiscountCodeSetValidFromActionImpl(validFrom);
    }

    /**
     * builds DiscountCodeSetValidFromAction without checking for non null required values
     */
    public DiscountCodeSetValidFromAction buildUnchecked() {
        return new DiscountCodeSetValidFromActionImpl(validFrom);
    }

    public static DiscountCodeSetValidFromActionBuilder of() {
        return new DiscountCodeSetValidFromActionBuilder();
    }

    public static DiscountCodeSetValidFromActionBuilder of(final DiscountCodeSetValidFromAction template) {
        DiscountCodeSetValidFromActionBuilder builder = new DiscountCodeSetValidFromActionBuilder();
        builder.validFrom = template.getValidFrom();
        return builder;
    }

}
