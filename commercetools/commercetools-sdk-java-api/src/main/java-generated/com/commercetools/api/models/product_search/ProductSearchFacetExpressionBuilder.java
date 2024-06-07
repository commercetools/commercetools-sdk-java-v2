
package com.commercetools.api.models.product_search;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchFacetExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetExpression productSearchFacetExpression = ProductSearchFacetExpression.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFacetExpressionBuilder implements Builder<ProductSearchFacetExpression> {

    /**
     * builds ProductSearchFacetExpression with checking for non-null required values
     * @return ProductSearchFacetExpression
     */
    public ProductSearchFacetExpression build() {
        return new ProductSearchFacetExpressionImpl();
    }

    /**
     * builds ProductSearchFacetExpression without checking for non-null required values
     * @return ProductSearchFacetExpression
     */
    public ProductSearchFacetExpression buildUnchecked() {
        return new ProductSearchFacetExpressionImpl();
    }

    /**
     * factory method for an instance of ProductSearchFacetExpressionBuilder
     * @return builder
     */
    public static ProductSearchFacetExpressionBuilder of() {
        return new ProductSearchFacetExpressionBuilder();
    }

    /**
     * create builder for ProductSearchFacetExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetExpressionBuilder of(final ProductSearchFacetExpression template) {
        ProductSearchFacetExpressionBuilder builder = new ProductSearchFacetExpressionBuilder();
        return builder;
    }

}
