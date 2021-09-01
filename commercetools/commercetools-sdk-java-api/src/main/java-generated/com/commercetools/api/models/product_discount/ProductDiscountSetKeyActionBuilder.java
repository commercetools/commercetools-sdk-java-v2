
package com.commercetools.api.models.product_discount;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductDiscountSetKeyActionBuilder implements Builder<ProductDiscountSetKeyAction> {

    @Nullable
    private String key;

    public ProductDiscountSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public ProductDiscountSetKeyAction build() {
        return new ProductDiscountSetKeyActionImpl(key);
    }

    /**
     * builds ProductDiscountSetKeyAction without checking for non null required values
     */
    public ProductDiscountSetKeyAction buildUnchecked() {
        return new ProductDiscountSetKeyActionImpl(key);
    }

    public static ProductDiscountSetKeyActionBuilder of() {
        return new ProductDiscountSetKeyActionBuilder();
    }

    public static ProductDiscountSetKeyActionBuilder of(final ProductDiscountSetKeyAction template) {
        ProductDiscountSetKeyActionBuilder builder = new ProductDiscountSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
