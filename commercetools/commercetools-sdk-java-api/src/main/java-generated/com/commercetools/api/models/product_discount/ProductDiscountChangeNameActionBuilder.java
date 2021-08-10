
package com.commercetools.api.models.product_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductDiscountChangeNameActionBuilder implements Builder<ProductDiscountChangeNameAction> {

    private com.commercetools.api.models.common.LocalizedString name;

    public ProductDiscountChangeNameActionBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public ProductDiscountChangeNameAction build() {
        Objects.requireNonNull(name);
        return new ProductDiscountChangeNameActionImpl(name);
    }

    /**
     * builds ProductDiscountChangeNameAction without checking for non null required values
     */
    public ProductDiscountChangeNameAction buildUnchecked() {
        return new ProductDiscountChangeNameActionImpl(name);
    }

    public static ProductDiscountChangeNameActionBuilder of() {
        return new ProductDiscountChangeNameActionBuilder();
    }

    public static ProductDiscountChangeNameActionBuilder of(final ProductDiscountChangeNameAction template) {
        ProductDiscountChangeNameActionBuilder builder = new ProductDiscountChangeNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
