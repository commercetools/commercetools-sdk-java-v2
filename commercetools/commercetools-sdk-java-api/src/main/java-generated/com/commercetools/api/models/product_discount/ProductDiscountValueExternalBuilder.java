package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.product_discount.ProductDiscountValue;
import com.commercetools.api.models.product_discount.ProductDiscountValueExternal;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductDiscountValueExternalBuilder implements Builder<ProductDiscountValueExternal> {




    /**
     * builds ProductDiscountValueExternal with checking for non-null required values
     * @return ProductDiscountValueExternal
     */
    public ProductDiscountValueExternal build() {
        return new ProductDiscountValueExternalImpl();
    }
    
    /**
     * builds ProductDiscountValueExternal without checking for non-null required values
     * @return ProductDiscountValueExternal
     */
    public ProductDiscountValueExternal buildUnchecked() {
        return new ProductDiscountValueExternalImpl();
    }

    /**
     * factory method for an instance of ProductDiscountValueExternalBuilder
     * @return builder 
     */
    public static ProductDiscountValueExternalBuilder of() {
        return new ProductDiscountValueExternalBuilder();
    }

    /**
     * create builder for ProductDiscountValueExternal instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountValueExternalBuilder of(final ProductDiscountValueExternal template) {
        ProductDiscountValueExternalBuilder builder = new ProductDiscountValueExternalBuilder();
        return builder;
    }

}
