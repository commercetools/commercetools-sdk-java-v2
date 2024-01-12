
package com.commercetools.api.models.product_search;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchSuggestionExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchSuggestionExpression productSearchSuggestionExpression = ProductSearchSuggestionExpression.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchSuggestionExpressionBuilder implements Builder<ProductSearchSuggestionExpression> {

    /**
     * builds ProductSearchSuggestionExpression with checking for non-null required values
     * @return ProductSearchSuggestionExpression
     */
    public ProductSearchSuggestionExpression build() {
        return new ProductSearchSuggestionExpressionImpl();
    }

    /**
     * builds ProductSearchSuggestionExpression without checking for non-null required values
     * @return ProductSearchSuggestionExpression
     */
    public ProductSearchSuggestionExpression buildUnchecked() {
        return new ProductSearchSuggestionExpressionImpl();
    }

    /**
     * factory method for an instance of ProductSearchSuggestionExpressionBuilder
     * @return builder
     */
    public static ProductSearchSuggestionExpressionBuilder of() {
        return new ProductSearchSuggestionExpressionBuilder();
    }

    /**
     * create builder for ProductSearchSuggestionExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchSuggestionExpressionBuilder of(final ProductSearchSuggestionExpression template) {
        ProductSearchSuggestionExpressionBuilder builder = new ProductSearchSuggestionExpressionBuilder();
        return builder;
    }

}
