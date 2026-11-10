
package com.commercetools.api.models.product_search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchFacetStatsExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetStatsExpression productSearchFacetStatsExpression = ProductSearchFacetStatsExpression.builder()
 *             .stats(statsBuilder -> statsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFacetStatsExpressionBuilder implements Builder<ProductSearchFacetStatsExpression> {

    private com.commercetools.api.models.product_search.ProductSearchFacetStatsValue stats;

    /**
     *  <p>Definition of the stats facet.</p>
     * @param builder function to build the stats value
     * @return Builder
     */

    public ProductSearchFacetStatsExpressionBuilder stats(
            Function<com.commercetools.api.models.product_search.ProductSearchFacetStatsValueBuilder, com.commercetools.api.models.product_search.ProductSearchFacetStatsValueBuilder> builder) {
        this.stats = builder.apply(com.commercetools.api.models.product_search.ProductSearchFacetStatsValueBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Definition of the stats facet.</p>
     * @param builder function to build the stats value
     * @return Builder
     */

    public ProductSearchFacetStatsExpressionBuilder withStats(
            Function<com.commercetools.api.models.product_search.ProductSearchFacetStatsValueBuilder, com.commercetools.api.models.product_search.ProductSearchFacetStatsValue> builder) {
        this.stats = builder
                .apply(com.commercetools.api.models.product_search.ProductSearchFacetStatsValueBuilder.of());
        return this;
    }

    /**
     *  <p>Definition of the stats facet.</p>
     * @param stats value to be set
     * @return Builder
     */

    public ProductSearchFacetStatsExpressionBuilder stats(
            final com.commercetools.api.models.product_search.ProductSearchFacetStatsValue stats) {
        this.stats = stats;
        return this;
    }

    /**
     *  <p>Definition of the stats facet.</p>
     * @return stats
     */

    public com.commercetools.api.models.product_search.ProductSearchFacetStatsValue getStats() {
        return this.stats;
    }

    /**
     * builds ProductSearchFacetStatsExpression with checking for non-null required values
     * @return ProductSearchFacetStatsExpression
     */
    public ProductSearchFacetStatsExpression build() {
        Objects.requireNonNull(stats, ProductSearchFacetStatsExpression.class + ": stats is missing");
        return new ProductSearchFacetStatsExpressionImpl(stats);
    }

    /**
     * builds ProductSearchFacetStatsExpression without checking for non-null required values
     * @return ProductSearchFacetStatsExpression
     */
    public ProductSearchFacetStatsExpression buildUnchecked() {
        return new ProductSearchFacetStatsExpressionImpl(stats);
    }

    /**
     * factory method for an instance of ProductSearchFacetStatsExpressionBuilder
     * @return builder
     */
    public static ProductSearchFacetStatsExpressionBuilder of() {
        return new ProductSearchFacetStatsExpressionBuilder();
    }

    /**
     * create builder for ProductSearchFacetStatsExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetStatsExpressionBuilder of(final ProductSearchFacetStatsExpression template) {
        ProductSearchFacetStatsExpressionBuilder builder = new ProductSearchFacetStatsExpressionBuilder();
        builder.stats = template.getStats();
        return builder;
    }

}
