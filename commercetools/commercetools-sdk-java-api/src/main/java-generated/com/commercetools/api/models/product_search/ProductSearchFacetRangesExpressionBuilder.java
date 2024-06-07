
package com.commercetools.api.models.product_search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchFacetRangesExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetRangesExpression productSearchFacetRangesExpression = ProductSearchFacetRangesExpression.builder()
 *             .ranges(rangesBuilder -> rangesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFacetRangesExpressionBuilder implements Builder<ProductSearchFacetRangesExpression> {

    private com.commercetools.api.models.product_search.ProductSearchFacetRangesValue ranges;

    /**
     *  <p>Definition of the ranges facet.</p>
     * @param builder function to build the ranges value
     * @return Builder
     */

    public ProductSearchFacetRangesExpressionBuilder ranges(
            Function<com.commercetools.api.models.product_search.ProductSearchFacetRangesValueBuilder, com.commercetools.api.models.product_search.ProductSearchFacetRangesValueBuilder> builder) {
        this.ranges = builder
                .apply(com.commercetools.api.models.product_search.ProductSearchFacetRangesValueBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Definition of the ranges facet.</p>
     * @param builder function to build the ranges value
     * @return Builder
     */

    public ProductSearchFacetRangesExpressionBuilder withRanges(
            Function<com.commercetools.api.models.product_search.ProductSearchFacetRangesValueBuilder, com.commercetools.api.models.product_search.ProductSearchFacetRangesValue> builder) {
        this.ranges = builder
                .apply(com.commercetools.api.models.product_search.ProductSearchFacetRangesValueBuilder.of());
        return this;
    }

    /**
     *  <p>Definition of the ranges facet.</p>
     * @param ranges value to be set
     * @return Builder
     */

    public ProductSearchFacetRangesExpressionBuilder ranges(
            final com.commercetools.api.models.product_search.ProductSearchFacetRangesValue ranges) {
        this.ranges = ranges;
        return this;
    }

    /**
     *  <p>Definition of the ranges facet.</p>
     * @return ranges
     */

    public com.commercetools.api.models.product_search.ProductSearchFacetRangesValue getRanges() {
        return this.ranges;
    }

    /**
     * builds ProductSearchFacetRangesExpression with checking for non-null required values
     * @return ProductSearchFacetRangesExpression
     */
    public ProductSearchFacetRangesExpression build() {
        Objects.requireNonNull(ranges, ProductSearchFacetRangesExpression.class + ": ranges is missing");
        return new ProductSearchFacetRangesExpressionImpl(ranges);
    }

    /**
     * builds ProductSearchFacetRangesExpression without checking for non-null required values
     * @return ProductSearchFacetRangesExpression
     */
    public ProductSearchFacetRangesExpression buildUnchecked() {
        return new ProductSearchFacetRangesExpressionImpl(ranges);
    }

    /**
     * factory method for an instance of ProductSearchFacetRangesExpressionBuilder
     * @return builder
     */
    public static ProductSearchFacetRangesExpressionBuilder of() {
        return new ProductSearchFacetRangesExpressionBuilder();
    }

    /**
     * create builder for ProductSearchFacetRangesExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetRangesExpressionBuilder of(final ProductSearchFacetRangesExpression template) {
        ProductSearchFacetRangesExpressionBuilder builder = new ProductSearchFacetRangesExpressionBuilder();
        builder.ranges = template.getRanges();
        return builder;
    }

}
