
package com.commercetools.api.models.product_tailoring;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringUnpublishActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringUnpublishAction productTailoringUnpublishAction = ProductTailoringUnpublishAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringUnpublishActionBuilder implements Builder<ProductTailoringUnpublishAction> {

    /**
     * builds ProductTailoringUnpublishAction with checking for non-null required values
     * @return ProductTailoringUnpublishAction
     */
    public ProductTailoringUnpublishAction build() {
        return new ProductTailoringUnpublishActionImpl();
    }

    /**
     * builds ProductTailoringUnpublishAction without checking for non-null required values
     * @return ProductTailoringUnpublishAction
     */
    public ProductTailoringUnpublishAction buildUnchecked() {
        return new ProductTailoringUnpublishActionImpl();
    }

    /**
     * factory method for an instance of ProductTailoringUnpublishActionBuilder
     * @return builder
     */
    public static ProductTailoringUnpublishActionBuilder of() {
        return new ProductTailoringUnpublishActionBuilder();
    }

    /**
     * create builder for ProductTailoringUnpublishAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringUnpublishActionBuilder of(final ProductTailoringUnpublishAction template) {
        ProductTailoringUnpublishActionBuilder builder = new ProductTailoringUnpublishActionBuilder();
        return builder;
    }

}
