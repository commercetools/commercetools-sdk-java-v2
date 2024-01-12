
package com.commercetools.api.models.product_search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchExistsExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchExistsExpression productSearchExistsExpression = ProductSearchExistsExpression.builder()
 *             .exists(existsBuilder -> existsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchExistsExpressionBuilder implements Builder<ProductSearchExistsExpression> {

    private com.commercetools.api.models.product_search.ProductSearchExistsValue exists;

    /**
     * set the value to the exists using the builder function
     * @param builder function to build the exists value
     * @return Builder
     */

    public ProductSearchExistsExpressionBuilder exists(
            Function<com.commercetools.api.models.product_search.ProductSearchExistsValueBuilder, com.commercetools.api.models.product_search.ProductSearchExistsValueBuilder> builder) {
        this.exists = builder.apply(com.commercetools.api.models.product_search.ProductSearchExistsValueBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the exists using the builder function
     * @param builder function to build the exists value
     * @return Builder
     */

    public ProductSearchExistsExpressionBuilder withExists(
            Function<com.commercetools.api.models.product_search.ProductSearchExistsValueBuilder, com.commercetools.api.models.product_search.ProductSearchExistsValue> builder) {
        this.exists = builder.apply(com.commercetools.api.models.product_search.ProductSearchExistsValueBuilder.of());
        return this;
    }

    /**
     * set the value to the exists
     * @param exists value to be set
     * @return Builder
     */

    public ProductSearchExistsExpressionBuilder exists(
            final com.commercetools.api.models.product_search.ProductSearchExistsValue exists) {
        this.exists = exists;
        return this;
    }

    /**
     * value of exists}
     * @return exists
     */

    public com.commercetools.api.models.product_search.ProductSearchExistsValue getExists() {
        return this.exists;
    }

    /**
     * builds ProductSearchExistsExpression with checking for non-null required values
     * @return ProductSearchExistsExpression
     */
    public ProductSearchExistsExpression build() {
        Objects.requireNonNull(exists, ProductSearchExistsExpression.class + ": exists is missing");
        return new ProductSearchExistsExpressionImpl(exists);
    }

    /**
     * builds ProductSearchExistsExpression without checking for non-null required values
     * @return ProductSearchExistsExpression
     */
    public ProductSearchExistsExpression buildUnchecked() {
        return new ProductSearchExistsExpressionImpl(exists);
    }

    /**
     * factory method for an instance of ProductSearchExistsExpressionBuilder
     * @return builder
     */
    public static ProductSearchExistsExpressionBuilder of() {
        return new ProductSearchExistsExpressionBuilder();
    }

    /**
     * create builder for ProductSearchExistsExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchExistsExpressionBuilder of(final ProductSearchExistsExpression template) {
        ProductSearchExistsExpressionBuilder builder = new ProductSearchExistsExpressionBuilder();
        builder.exists = template.getExists();
        return builder;
    }

}
