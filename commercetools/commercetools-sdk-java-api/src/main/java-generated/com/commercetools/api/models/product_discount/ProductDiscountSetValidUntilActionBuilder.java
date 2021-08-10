
package com.commercetools.api.models.product_discount;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductDiscountSetValidUntilActionBuilder implements Builder<ProductDiscountSetValidUntilAction> {

    @Nullable
    private java.time.ZonedDateTime validUntil;

    public ProductDiscountSetValidUntilActionBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    public ProductDiscountSetValidUntilAction build() {
        return new ProductDiscountSetValidUntilActionImpl(validUntil);
    }

    /**
     * builds ProductDiscountSetValidUntilAction without checking for non null required values
     */
    public ProductDiscountSetValidUntilAction buildUnchecked() {
        return new ProductDiscountSetValidUntilActionImpl(validUntil);
    }

    public static ProductDiscountSetValidUntilActionBuilder of() {
        return new ProductDiscountSetValidUntilActionBuilder();
    }

    public static ProductDiscountSetValidUntilActionBuilder of(final ProductDiscountSetValidUntilAction template) {
        ProductDiscountSetValidUntilActionBuilder builder = new ProductDiscountSetValidUntilActionBuilder();
        builder.validUntil = template.getValidUntil();
        return builder;
    }

}
