
package com.commercetools.api.models.product_discount;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductDiscountChangeNameActionBuilder implements Builder<ProductDiscountChangeNameAction> {

    private com.commercetools.api.models.common.LocalizedString name;

    public ProductDiscountChangeNameActionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public ProductDiscountChangeNameActionBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public ProductDiscountChangeNameAction build() {
        Objects.requireNonNull(name, ProductDiscountChangeNameAction.class + ": name is missing");
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
