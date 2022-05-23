
package com.commercetools.api.models.product_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   ProductDiscountValueExternalDraft productDiscountValueExternalDraft = ProductDiscountValueExternalDraft.builder()
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDiscountValueExternalDraftBuilder implements Builder<ProductDiscountValueExternalDraft> {

    public ProductDiscountValueExternalDraft build() {
        return new ProductDiscountValueExternalDraftImpl();
    }

    /**
     * builds ProductDiscountValueExternalDraft without checking for non null required values
     */
    public ProductDiscountValueExternalDraft buildUnchecked() {
        return new ProductDiscountValueExternalDraftImpl();
    }

    public static ProductDiscountValueExternalDraftBuilder of() {
        return new ProductDiscountValueExternalDraftBuilder();
    }

    public static ProductDiscountValueExternalDraftBuilder of(final ProductDiscountValueExternalDraft template) {
        ProductDiscountValueExternalDraftBuilder builder = new ProductDiscountValueExternalDraftBuilder();
        return builder;
    }

}
