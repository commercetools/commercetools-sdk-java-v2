
package com.commercetools.api.models.product_discount;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductDiscountSetValidFromActionBuilder implements Builder<ProductDiscountSetValidFromAction> {

    @Nullable
    private java.time.ZonedDateTime validFrom;

    public ProductDiscountSetValidFromActionBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    public ProductDiscountSetValidFromAction build() {
        return new ProductDiscountSetValidFromActionImpl(validFrom);
    }

    /**
     * builds ProductDiscountSetValidFromAction without checking for non null required values
     */
    public ProductDiscountSetValidFromAction buildUnchecked() {
        return new ProductDiscountSetValidFromActionImpl(validFrom);
    }

    public static ProductDiscountSetValidFromActionBuilder of() {
        return new ProductDiscountSetValidFromActionBuilder();
    }

    public static ProductDiscountSetValidFromActionBuilder of(final ProductDiscountSetValidFromAction template) {
        ProductDiscountSetValidFromActionBuilder builder = new ProductDiscountSetValidFromActionBuilder();
        builder.validFrom = template.getValidFrom();
        return builder;
    }

}
