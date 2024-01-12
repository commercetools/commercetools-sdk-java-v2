
package com.commercetools.api.models.product_search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchExactExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchExactExpression productSearchExactExpression = ProductSearchExactExpression.builder()
 *             .exact(exactBuilder -> exactBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchExactExpressionBuilder implements Builder<ProductSearchExactExpression> {

    private com.commercetools.api.models.product_search.ProductSearchAnyValue exact;

    /**
     * set the value to the exact using the builder function
     * @param builder function to build the exact value
     * @return Builder
     */

    public ProductSearchExactExpressionBuilder exact(
            Function<com.commercetools.api.models.product_search.ProductSearchAnyValueBuilder, com.commercetools.api.models.product_search.ProductSearchAnyValueBuilder> builder) {
        this.exact = builder.apply(com.commercetools.api.models.product_search.ProductSearchAnyValueBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the exact using the builder function
     * @param builder function to build the exact value
     * @return Builder
     */

    public ProductSearchExactExpressionBuilder withExact(
            Function<com.commercetools.api.models.product_search.ProductSearchAnyValueBuilder, com.commercetools.api.models.product_search.ProductSearchAnyValue> builder) {
        this.exact = builder.apply(com.commercetools.api.models.product_search.ProductSearchAnyValueBuilder.of());
        return this;
    }

    /**
     * set the value to the exact
     * @param exact value to be set
     * @return Builder
     */

    public ProductSearchExactExpressionBuilder exact(
            final com.commercetools.api.models.product_search.ProductSearchAnyValue exact) {
        this.exact = exact;
        return this;
    }

    /**
     * value of exact}
     * @return exact
     */

    public com.commercetools.api.models.product_search.ProductSearchAnyValue getExact() {
        return this.exact;
    }

    /**
     * builds ProductSearchExactExpression with checking for non-null required values
     * @return ProductSearchExactExpression
     */
    public ProductSearchExactExpression build() {
        Objects.requireNonNull(exact, ProductSearchExactExpression.class + ": exact is missing");
        return new ProductSearchExactExpressionImpl(exact);
    }

    /**
     * builds ProductSearchExactExpression without checking for non-null required values
     * @return ProductSearchExactExpression
     */
    public ProductSearchExactExpression buildUnchecked() {
        return new ProductSearchExactExpressionImpl(exact);
    }

    /**
     * factory method for an instance of ProductSearchExactExpressionBuilder
     * @return builder
     */
    public static ProductSearchExactExpressionBuilder of() {
        return new ProductSearchExactExpressionBuilder();
    }

    /**
     * create builder for ProductSearchExactExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchExactExpressionBuilder of(final ProductSearchExactExpression template) {
        ProductSearchExactExpressionBuilder builder = new ProductSearchExactExpressionBuilder();
        builder.exact = template.getExact();
        return builder;
    }

}
