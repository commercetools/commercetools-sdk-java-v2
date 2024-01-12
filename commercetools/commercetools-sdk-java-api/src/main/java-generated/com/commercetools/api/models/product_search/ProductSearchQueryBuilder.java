
package com.commercetools.api.models.product_search;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchQueryBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchQuery productSearchQuery = ProductSearchQuery.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchQueryBuilder implements Builder<ProductSearchQuery> {

    /**
     * builds ProductSearchQuery with checking for non-null required values
     * @return ProductSearchQuery
     */
    public ProductSearchQuery build() {
        return new ProductSearchQueryImpl();
    }

    /**
     * builds ProductSearchQuery without checking for non-null required values
     * @return ProductSearchQuery
     */
    public ProductSearchQuery buildUnchecked() {
        return new ProductSearchQueryImpl();
    }

    /**
     * factory method for an instance of ProductSearchQueryBuilder
     * @return builder
     */
    public static ProductSearchQueryBuilder of() {
        return new ProductSearchQueryBuilder();
    }

    /**
     * create builder for ProductSearchQuery instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchQueryBuilder of(final ProductSearchQuery template) {
        ProductSearchQueryBuilder builder = new ProductSearchQueryBuilder();
        return builder;
    }

}
