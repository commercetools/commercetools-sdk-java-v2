
package com.commercetools.api.models.product_search;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchSuggestionExpressionValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchSuggestionExpressionValue productSearchSuggestionExpressionValue = ProductSearchSuggestionExpressionValue.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchSuggestionExpressionValueBuilder implements Builder<ProductSearchSuggestionExpressionValue> {

    /**
     * builds ProductSearchSuggestionExpressionValue with checking for non-null required values
     * @return ProductSearchSuggestionExpressionValue
     */
    public ProductSearchSuggestionExpressionValue build() {
        return new ProductSearchSuggestionExpressionValueImpl();
    }

    /**
     * builds ProductSearchSuggestionExpressionValue without checking for non-null required values
     * @return ProductSearchSuggestionExpressionValue
     */
    public ProductSearchSuggestionExpressionValue buildUnchecked() {
        return new ProductSearchSuggestionExpressionValueImpl();
    }

    /**
     * factory method for an instance of ProductSearchSuggestionExpressionValueBuilder
     * @return builder
     */
    public static ProductSearchSuggestionExpressionValueBuilder of() {
        return new ProductSearchSuggestionExpressionValueBuilder();
    }

    /**
     * create builder for ProductSearchSuggestionExpressionValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchSuggestionExpressionValueBuilder of(
            final ProductSearchSuggestionExpressionValue template) {
        ProductSearchSuggestionExpressionValueBuilder builder = new ProductSearchSuggestionExpressionValueBuilder();
        return builder;
    }

}
