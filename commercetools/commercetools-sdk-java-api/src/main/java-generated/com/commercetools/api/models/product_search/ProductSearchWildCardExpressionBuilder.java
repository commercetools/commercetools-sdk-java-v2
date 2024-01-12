
package com.commercetools.api.models.product_search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchWildCardExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchWildCardExpression productSearchWildCardExpression = ProductSearchWildCardExpression.builder()
 *             .wildcard(wildcardBuilder -> wildcardBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchWildCardExpressionBuilder implements Builder<ProductSearchWildCardExpression> {

    private com.commercetools.api.models.product_search.ProductSearchAnyValue wildcard;

    /**
     * set the value to the wildcard using the builder function
     * @param builder function to build the wildcard value
     * @return Builder
     */

    public ProductSearchWildCardExpressionBuilder wildcard(
            Function<com.commercetools.api.models.product_search.ProductSearchAnyValueBuilder, com.commercetools.api.models.product_search.ProductSearchAnyValueBuilder> builder) {
        this.wildcard = builder.apply(com.commercetools.api.models.product_search.ProductSearchAnyValueBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the wildcard using the builder function
     * @param builder function to build the wildcard value
     * @return Builder
     */

    public ProductSearchWildCardExpressionBuilder withWildcard(
            Function<com.commercetools.api.models.product_search.ProductSearchAnyValueBuilder, com.commercetools.api.models.product_search.ProductSearchAnyValue> builder) {
        this.wildcard = builder.apply(com.commercetools.api.models.product_search.ProductSearchAnyValueBuilder.of());
        return this;
    }

    /**
     * set the value to the wildcard
     * @param wildcard value to be set
     * @return Builder
     */

    public ProductSearchWildCardExpressionBuilder wildcard(
            final com.commercetools.api.models.product_search.ProductSearchAnyValue wildcard) {
        this.wildcard = wildcard;
        return this;
    }

    /**
     * value of wildcard}
     * @return wildcard
     */

    public com.commercetools.api.models.product_search.ProductSearchAnyValue getWildcard() {
        return this.wildcard;
    }

    /**
     * builds ProductSearchWildCardExpression with checking for non-null required values
     * @return ProductSearchWildCardExpression
     */
    public ProductSearchWildCardExpression build() {
        Objects.requireNonNull(wildcard, ProductSearchWildCardExpression.class + ": wildcard is missing");
        return new ProductSearchWildCardExpressionImpl(wildcard);
    }

    /**
     * builds ProductSearchWildCardExpression without checking for non-null required values
     * @return ProductSearchWildCardExpression
     */
    public ProductSearchWildCardExpression buildUnchecked() {
        return new ProductSearchWildCardExpressionImpl(wildcard);
    }

    /**
     * factory method for an instance of ProductSearchWildCardExpressionBuilder
     * @return builder
     */
    public static ProductSearchWildCardExpressionBuilder of() {
        return new ProductSearchWildCardExpressionBuilder();
    }

    /**
     * create builder for ProductSearchWildCardExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchWildCardExpressionBuilder of(final ProductSearchWildCardExpression template) {
        ProductSearchWildCardExpressionBuilder builder = new ProductSearchWildCardExpressionBuilder();
        builder.wildcard = template.getWildcard();
        return builder;
    }

}
