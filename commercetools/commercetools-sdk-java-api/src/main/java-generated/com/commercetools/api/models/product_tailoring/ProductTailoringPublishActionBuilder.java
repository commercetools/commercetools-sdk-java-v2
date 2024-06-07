
package com.commercetools.api.models.product_tailoring;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringPublishActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringPublishAction productTailoringPublishAction = ProductTailoringPublishAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringPublishActionBuilder implements Builder<ProductTailoringPublishAction> {

    /**
     * builds ProductTailoringPublishAction with checking for non-null required values
     * @return ProductTailoringPublishAction
     */
    public ProductTailoringPublishAction build() {
        return new ProductTailoringPublishActionImpl();
    }

    /**
     * builds ProductTailoringPublishAction without checking for non-null required values
     * @return ProductTailoringPublishAction
     */
    public ProductTailoringPublishAction buildUnchecked() {
        return new ProductTailoringPublishActionImpl();
    }

    /**
     * factory method for an instance of ProductTailoringPublishActionBuilder
     * @return builder
     */
    public static ProductTailoringPublishActionBuilder of() {
        return new ProductTailoringPublishActionBuilder();
    }

    /**
     * create builder for ProductTailoringPublishAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringPublishActionBuilder of(final ProductTailoringPublishAction template) {
        ProductTailoringPublishActionBuilder builder = new ProductTailoringPublishActionBuilder();
        return builder;
    }

}
