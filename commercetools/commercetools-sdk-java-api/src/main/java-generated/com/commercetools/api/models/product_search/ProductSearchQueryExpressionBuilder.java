
package com.commercetools.api.models.product_search;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchQueryExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchQueryExpression productSearchQueryExpression = ProductSearchQueryExpression.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchQueryExpressionBuilder implements Builder<ProductSearchQueryExpression> {

    /**
     * builds ProductSearchQueryExpression with checking for non-null required values
     * @return ProductSearchQueryExpression
     */
    public ProductSearchQueryExpression build() {
        return new ProductSearchQueryExpressionImpl();
    }

    /**
     * builds ProductSearchQueryExpression without checking for non-null required values
     * @return ProductSearchQueryExpression
     */
    public ProductSearchQueryExpression buildUnchecked() {
        return new ProductSearchQueryExpressionImpl();
    }

    /**
     * factory method for an instance of ProductSearchQueryExpressionBuilder
     * @return builder
     */
    public static ProductSearchQueryExpressionBuilder of() {
        return new ProductSearchQueryExpressionBuilder();
    }

    /**
     * create builder for ProductSearchQueryExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchQueryExpressionBuilder of(final ProductSearchQueryExpression template) {
        ProductSearchQueryExpressionBuilder builder = new ProductSearchQueryExpressionBuilder();
        return builder;
    }

}
