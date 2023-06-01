package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.product_discount.ProductDiscountValueDraft;
import com.commercetools.api.models.product_discount.ProductDiscountValueExternalDraft;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountValueExternalDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountValueExternalDraft productDiscountValueExternalDraft = ProductDiscountValueExternalDraft.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductDiscountValueExternalDraftBuilder implements Builder<ProductDiscountValueExternalDraft> {




    /**
     * builds ProductDiscountValueExternalDraft with checking for non-null required values
     * @return ProductDiscountValueExternalDraft
     */
    public ProductDiscountValueExternalDraft build() {
        return new ProductDiscountValueExternalDraftImpl();
    }
    
    /**
     * builds ProductDiscountValueExternalDraft without checking for non-null required values
     * @return ProductDiscountValueExternalDraft
     */
    public ProductDiscountValueExternalDraft buildUnchecked() {
        return new ProductDiscountValueExternalDraftImpl();
    }

    /**
     * factory method for an instance of ProductDiscountValueExternalDraftBuilder
     * @return builder 
     */
    public static ProductDiscountValueExternalDraftBuilder of() {
        return new ProductDiscountValueExternalDraftBuilder();
    }

    /**
     * create builder for ProductDiscountValueExternalDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountValueExternalDraftBuilder of(final ProductDiscountValueExternalDraft template) {
        ProductDiscountValueExternalDraftBuilder builder = new ProductDiscountValueExternalDraftBuilder();
        return builder;
    }

}
