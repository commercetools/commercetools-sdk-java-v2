
package com.commercetools.api.models.product_search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchPrefixExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchPrefixExpression productSearchPrefixExpression = ProductSearchPrefixExpression.builder()
 *             .prefix(prefixBuilder -> prefixBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchPrefixExpressionBuilder implements Builder<ProductSearchPrefixExpression> {

    private com.commercetools.api.models.product_search.ProductSearchAnyValue prefix;

    /**
     * set the value to the prefix using the builder function
     * @param builder function to build the prefix value
     * @return Builder
     */

    public ProductSearchPrefixExpressionBuilder prefix(
            Function<com.commercetools.api.models.product_search.ProductSearchAnyValueBuilder, com.commercetools.api.models.product_search.ProductSearchAnyValueBuilder> builder) {
        this.prefix = builder.apply(com.commercetools.api.models.product_search.ProductSearchAnyValueBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the prefix using the builder function
     * @param builder function to build the prefix value
     * @return Builder
     */

    public ProductSearchPrefixExpressionBuilder withPrefix(
            Function<com.commercetools.api.models.product_search.ProductSearchAnyValueBuilder, com.commercetools.api.models.product_search.ProductSearchAnyValue> builder) {
        this.prefix = builder.apply(com.commercetools.api.models.product_search.ProductSearchAnyValueBuilder.of());
        return this;
    }

    /**
     * set the value to the prefix
     * @param prefix value to be set
     * @return Builder
     */

    public ProductSearchPrefixExpressionBuilder prefix(
            final com.commercetools.api.models.product_search.ProductSearchAnyValue prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * value of prefix}
     * @return prefix
     */

    public com.commercetools.api.models.product_search.ProductSearchAnyValue getPrefix() {
        return this.prefix;
    }

    /**
     * builds ProductSearchPrefixExpression with checking for non-null required values
     * @return ProductSearchPrefixExpression
     */
    public ProductSearchPrefixExpression build() {
        Objects.requireNonNull(prefix, ProductSearchPrefixExpression.class + ": prefix is missing");
        return new ProductSearchPrefixExpressionImpl(prefix);
    }

    /**
     * builds ProductSearchPrefixExpression without checking for non-null required values
     * @return ProductSearchPrefixExpression
     */
    public ProductSearchPrefixExpression buildUnchecked() {
        return new ProductSearchPrefixExpressionImpl(prefix);
    }

    /**
     * factory method for an instance of ProductSearchPrefixExpressionBuilder
     * @return builder
     */
    public static ProductSearchPrefixExpressionBuilder of() {
        return new ProductSearchPrefixExpressionBuilder();
    }

    /**
     * create builder for ProductSearchPrefixExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchPrefixExpressionBuilder of(final ProductSearchPrefixExpression template) {
        ProductSearchPrefixExpressionBuilder builder = new ProductSearchPrefixExpressionBuilder();
        builder.prefix = template.getPrefix();
        return builder;
    }

}
