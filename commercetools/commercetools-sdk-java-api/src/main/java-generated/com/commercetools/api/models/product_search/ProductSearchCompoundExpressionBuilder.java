
package com.commercetools.api.models.product_search;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchCompoundExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchCompoundExpression productSearchCompoundExpression = ProductSearchCompoundExpression.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchCompoundExpressionBuilder implements Builder<ProductSearchCompoundExpression> {

    /**
     * builds ProductSearchCompoundExpression with checking for non-null required values
     * @return ProductSearchCompoundExpression
     */
    public ProductSearchCompoundExpression build() {
        return new ProductSearchCompoundExpressionImpl();
    }

    /**
     * builds ProductSearchCompoundExpression without checking for non-null required values
     * @return ProductSearchCompoundExpression
     */
    public ProductSearchCompoundExpression buildUnchecked() {
        return new ProductSearchCompoundExpressionImpl();
    }

    /**
     * factory method for an instance of ProductSearchCompoundExpressionBuilder
     * @return builder
     */
    public static ProductSearchCompoundExpressionBuilder of() {
        return new ProductSearchCompoundExpressionBuilder();
    }

    /**
     * create builder for ProductSearchCompoundExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchCompoundExpressionBuilder of(final ProductSearchCompoundExpression template) {
        ProductSearchCompoundExpressionBuilder builder = new ProductSearchCompoundExpressionBuilder();
        return builder;
    }

}
