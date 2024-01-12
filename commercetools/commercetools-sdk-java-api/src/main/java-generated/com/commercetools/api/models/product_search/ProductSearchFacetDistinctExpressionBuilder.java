
package com.commercetools.api.models.product_search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchFacetDistinctExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetDistinctExpression productSearchFacetDistinctExpression = ProductSearchFacetDistinctExpression.builder()
 *             .distinct(distinctBuilder -> distinctBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFacetDistinctExpressionBuilder implements Builder<ProductSearchFacetDistinctExpression> {

    private com.commercetools.api.models.product_search.ProductSearchFacetDistinctValue distinct;

    /**
     *  <p>Definition of the distinct facet.</p>
     * @param builder function to build the distinct value
     * @return Builder
     */

    public ProductSearchFacetDistinctExpressionBuilder distinct(
            Function<com.commercetools.api.models.product_search.ProductSearchFacetDistinctValueBuilder, com.commercetools.api.models.product_search.ProductSearchFacetDistinctValueBuilder> builder) {
        this.distinct = builder
                .apply(com.commercetools.api.models.product_search.ProductSearchFacetDistinctValueBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Definition of the distinct facet.</p>
     * @param builder function to build the distinct value
     * @return Builder
     */

    public ProductSearchFacetDistinctExpressionBuilder withDistinct(
            Function<com.commercetools.api.models.product_search.ProductSearchFacetDistinctValueBuilder, com.commercetools.api.models.product_search.ProductSearchFacetDistinctValue> builder) {
        this.distinct = builder
                .apply(com.commercetools.api.models.product_search.ProductSearchFacetDistinctValueBuilder.of());
        return this;
    }

    /**
     *  <p>Definition of the distinct facet.</p>
     * @param distinct value to be set
     * @return Builder
     */

    public ProductSearchFacetDistinctExpressionBuilder distinct(
            final com.commercetools.api.models.product_search.ProductSearchFacetDistinctValue distinct) {
        this.distinct = distinct;
        return this;
    }

    /**
     *  <p>Definition of the distinct facet.</p>
     * @return distinct
     */

    public com.commercetools.api.models.product_search.ProductSearchFacetDistinctValue getDistinct() {
        return this.distinct;
    }

    /**
     * builds ProductSearchFacetDistinctExpression with checking for non-null required values
     * @return ProductSearchFacetDistinctExpression
     */
    public ProductSearchFacetDistinctExpression build() {
        Objects.requireNonNull(distinct, ProductSearchFacetDistinctExpression.class + ": distinct is missing");
        return new ProductSearchFacetDistinctExpressionImpl(distinct);
    }

    /**
     * builds ProductSearchFacetDistinctExpression without checking for non-null required values
     * @return ProductSearchFacetDistinctExpression
     */
    public ProductSearchFacetDistinctExpression buildUnchecked() {
        return new ProductSearchFacetDistinctExpressionImpl(distinct);
    }

    /**
     * factory method for an instance of ProductSearchFacetDistinctExpressionBuilder
     * @return builder
     */
    public static ProductSearchFacetDistinctExpressionBuilder of() {
        return new ProductSearchFacetDistinctExpressionBuilder();
    }

    /**
     * create builder for ProductSearchFacetDistinctExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetDistinctExpressionBuilder of(final ProductSearchFacetDistinctExpression template) {
        ProductSearchFacetDistinctExpressionBuilder builder = new ProductSearchFacetDistinctExpressionBuilder();
        builder.distinct = template.getDistinct();
        return builder;
    }

}
