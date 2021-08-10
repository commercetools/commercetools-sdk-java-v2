
package com.commercetools.api.models.product_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductDiscountValueExternalBuilder implements Builder<ProductDiscountValueExternal> {

    public ProductDiscountValueExternal build() {
        return new ProductDiscountValueExternalImpl();
    }

    /**
     * builds ProductDiscountValueExternal without checking for non null required values
     */
    public ProductDiscountValueExternal buildUnchecked() {
        return new ProductDiscountValueExternalImpl();
    }

    public static ProductDiscountValueExternalBuilder of() {
        return new ProductDiscountValueExternalBuilder();
    }

    public static ProductDiscountValueExternalBuilder of(final ProductDiscountValueExternal template) {
        ProductDiscountValueExternalBuilder builder = new ProductDiscountValueExternalBuilder();
        return builder;
    }

}
