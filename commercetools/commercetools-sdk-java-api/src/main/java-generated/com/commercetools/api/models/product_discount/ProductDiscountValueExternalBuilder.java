
package com.commercetools.api.models.product_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountValueExternalBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountValueExternal productDiscountValueExternal = ProductDiscountValueExternal.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDiscountValueExternalBuilder implements Builder<ProductDiscountValueExternal> {

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
