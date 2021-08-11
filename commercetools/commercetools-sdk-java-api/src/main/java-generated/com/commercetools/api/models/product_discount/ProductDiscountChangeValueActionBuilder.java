
package com.commercetools.api.models.product_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductDiscountChangeValueActionBuilder implements Builder<ProductDiscountChangeValueAction> {

    private com.commercetools.api.models.product_discount.ProductDiscountValueDraft value;

    public ProductDiscountChangeValueActionBuilder value(
            final com.commercetools.api.models.product_discount.ProductDiscountValueDraft value) {
        this.value = value;
        return this;
    }

    public com.commercetools.api.models.product_discount.ProductDiscountValueDraft getValue() {
        return this.value;
    }

    public ProductDiscountChangeValueAction build() {
        Objects.requireNonNull(value, ProductDiscountChangeValueAction.class + ": value is missing");
        return new ProductDiscountChangeValueActionImpl(value);
    }

    /**
     * builds ProductDiscountChangeValueAction without checking for non null required values
     */
    public ProductDiscountChangeValueAction buildUnchecked() {
        return new ProductDiscountChangeValueActionImpl(value);
    }

    public static ProductDiscountChangeValueActionBuilder of() {
        return new ProductDiscountChangeValueActionBuilder();
    }

    public static ProductDiscountChangeValueActionBuilder of(final ProductDiscountChangeValueAction template) {
        ProductDiscountChangeValueActionBuilder builder = new ProductDiscountChangeValueActionBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
