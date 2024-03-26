
package com.commercetools.api.models.product_search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchFacetCountExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetCountExpression productSearchFacetCountExpression = ProductSearchFacetCountExpression.builder()
 *             .count(countBuilder -> countBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFacetCountExpressionBuilder implements Builder<ProductSearchFacetCountExpression> {

    private com.commercetools.api.models.product_search.ProductSearchFacetCountValue count;

    /**
     *  <p>Definition of the count facet.</p>
     * @param builder function to build the count value
     * @return Builder
     */

    public ProductSearchFacetCountExpressionBuilder count(
            Function<com.commercetools.api.models.product_search.ProductSearchFacetCountValueBuilder, com.commercetools.api.models.product_search.ProductSearchFacetCountValueBuilder> builder) {
        this.count = builder.apply(com.commercetools.api.models.product_search.ProductSearchFacetCountValueBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Definition of the count facet.</p>
     * @param builder function to build the count value
     * @return Builder
     */

    public ProductSearchFacetCountExpressionBuilder withCount(
            Function<com.commercetools.api.models.product_search.ProductSearchFacetCountValueBuilder, com.commercetools.api.models.product_search.ProductSearchFacetCountValue> builder) {
        this.count = builder
                .apply(com.commercetools.api.models.product_search.ProductSearchFacetCountValueBuilder.of());
        return this;
    }

    /**
     *  <p>Definition of the count facet.</p>
     * @param count value to be set
     * @return Builder
     */

    public ProductSearchFacetCountExpressionBuilder count(
            final com.commercetools.api.models.product_search.ProductSearchFacetCountValue count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Definition of the count facet.</p>
     * @return count
     */

    public com.commercetools.api.models.product_search.ProductSearchFacetCountValue getCount() {
        return this.count;
    }

    /**
     * builds ProductSearchFacetCountExpression with checking for non-null required values
     * @return ProductSearchFacetCountExpression
     */
    public ProductSearchFacetCountExpression build() {
        Objects.requireNonNull(count, ProductSearchFacetCountExpression.class + ": count is missing");
        return new ProductSearchFacetCountExpressionImpl(count);
    }

    /**
     * builds ProductSearchFacetCountExpression without checking for non-null required values
     * @return ProductSearchFacetCountExpression
     */
    public ProductSearchFacetCountExpression buildUnchecked() {
        return new ProductSearchFacetCountExpressionImpl(count);
    }

    /**
     * factory method for an instance of ProductSearchFacetCountExpressionBuilder
     * @return builder
     */
    public static ProductSearchFacetCountExpressionBuilder of() {
        return new ProductSearchFacetCountExpressionBuilder();
    }

    /**
     * create builder for ProductSearchFacetCountExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetCountExpressionBuilder of(final ProductSearchFacetCountExpression template) {
        ProductSearchFacetCountExpressionBuilder builder = new ProductSearchFacetCountExpressionBuilder();
        builder.count = template.getCount();
        return builder;
    }

}
