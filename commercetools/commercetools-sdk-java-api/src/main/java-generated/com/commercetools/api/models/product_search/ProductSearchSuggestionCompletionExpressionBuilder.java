
package com.commercetools.api.models.product_search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchSuggestionCompletionExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchSuggestionCompletionExpression productSearchSuggestionCompletionExpression = ProductSearchSuggestionCompletionExpression.builder()
 *             .completion(completionBuilder -> completionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchSuggestionCompletionExpressionBuilder
        implements Builder<ProductSearchSuggestionCompletionExpression> {

    private com.commercetools.api.models.product_search.ProductSearchSuggestionCompletionExpressionValue completion;

    /**
     * set the value to the completion using the builder function
     * @param builder function to build the completion value
     * @return Builder
     */

    public ProductSearchSuggestionCompletionExpressionBuilder completion(
            Function<com.commercetools.api.models.product_search.ProductSearchSuggestionCompletionExpressionValueBuilder, com.commercetools.api.models.product_search.ProductSearchSuggestionCompletionExpressionValueBuilder> builder) {
        this.completion = builder.apply(
            com.commercetools.api.models.product_search.ProductSearchSuggestionCompletionExpressionValueBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the completion using the builder function
     * @param builder function to build the completion value
     * @return Builder
     */

    public ProductSearchSuggestionCompletionExpressionBuilder withCompletion(
            Function<com.commercetools.api.models.product_search.ProductSearchSuggestionCompletionExpressionValueBuilder, com.commercetools.api.models.product_search.ProductSearchSuggestionCompletionExpressionValue> builder) {
        this.completion = builder.apply(
            com.commercetools.api.models.product_search.ProductSearchSuggestionCompletionExpressionValueBuilder.of());
        return this;
    }

    /**
     * set the value to the completion
     * @param completion value to be set
     * @return Builder
     */

    public ProductSearchSuggestionCompletionExpressionBuilder completion(
            final com.commercetools.api.models.product_search.ProductSearchSuggestionCompletionExpressionValue completion) {
        this.completion = completion;
        return this;
    }

    /**
     * value of completion}
     * @return completion
     */

    public com.commercetools.api.models.product_search.ProductSearchSuggestionCompletionExpressionValue getCompletion() {
        return this.completion;
    }

    /**
     * builds ProductSearchSuggestionCompletionExpression with checking for non-null required values
     * @return ProductSearchSuggestionCompletionExpression
     */
    public ProductSearchSuggestionCompletionExpression build() {
        Objects.requireNonNull(completion,
            ProductSearchSuggestionCompletionExpression.class + ": completion is missing");
        return new ProductSearchSuggestionCompletionExpressionImpl(completion);
    }

    /**
     * builds ProductSearchSuggestionCompletionExpression without checking for non-null required values
     * @return ProductSearchSuggestionCompletionExpression
     */
    public ProductSearchSuggestionCompletionExpression buildUnchecked() {
        return new ProductSearchSuggestionCompletionExpressionImpl(completion);
    }

    /**
     * factory method for an instance of ProductSearchSuggestionCompletionExpressionBuilder
     * @return builder
     */
    public static ProductSearchSuggestionCompletionExpressionBuilder of() {
        return new ProductSearchSuggestionCompletionExpressionBuilder();
    }

    /**
     * create builder for ProductSearchSuggestionCompletionExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchSuggestionCompletionExpressionBuilder of(
            final ProductSearchSuggestionCompletionExpression template) {
        ProductSearchSuggestionCompletionExpressionBuilder builder = new ProductSearchSuggestionCompletionExpressionBuilder();
        builder.completion = template.getCompletion();
        return builder;
    }

}
