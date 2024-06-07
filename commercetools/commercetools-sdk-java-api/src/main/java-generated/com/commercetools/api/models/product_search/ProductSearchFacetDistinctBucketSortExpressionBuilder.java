
package com.commercetools.api.models.product_search;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchFacetDistinctBucketSortExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetDistinctBucketSortExpression productSearchFacetDistinctBucketSortExpression = ProductSearchFacetDistinctBucketSortExpression.builder()
 *             .by(ProductSearchFacetDistinctBucketSortBy.COUNT)
 *             .order(SearchSortOrder.ASC)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFacetDistinctBucketSortExpressionBuilder
        implements Builder<ProductSearchFacetDistinctBucketSortExpression> {

    private com.commercetools.api.models.product_search.ProductSearchFacetDistinctBucketSortBy by;

    private com.commercetools.api.models.search.SearchSortOrder order;

    /**
     *  <p>Defines whether to sort by bucket count or key.</p>
     * @param by value to be set
     * @return Builder
     */

    public ProductSearchFacetDistinctBucketSortExpressionBuilder by(
            final com.commercetools.api.models.product_search.ProductSearchFacetDistinctBucketSortBy by) {
        this.by = by;
        return this;
    }

    /**
     *  <p>Defines the sorting order.</p>
     * @param order value to be set
     * @return Builder
     */

    public ProductSearchFacetDistinctBucketSortExpressionBuilder order(
            final com.commercetools.api.models.search.SearchSortOrder order) {
        this.order = order;
        return this;
    }

    /**
     *  <p>Defines whether to sort by bucket count or key.</p>
     * @return by
     */

    public com.commercetools.api.models.product_search.ProductSearchFacetDistinctBucketSortBy getBy() {
        return this.by;
    }

    /**
     *  <p>Defines the sorting order.</p>
     * @return order
     */

    public com.commercetools.api.models.search.SearchSortOrder getOrder() {
        return this.order;
    }

    /**
     * builds ProductSearchFacetDistinctBucketSortExpression with checking for non-null required values
     * @return ProductSearchFacetDistinctBucketSortExpression
     */
    public ProductSearchFacetDistinctBucketSortExpression build() {
        Objects.requireNonNull(by, ProductSearchFacetDistinctBucketSortExpression.class + ": by is missing");
        Objects.requireNonNull(order, ProductSearchFacetDistinctBucketSortExpression.class + ": order is missing");
        return new ProductSearchFacetDistinctBucketSortExpressionImpl(by, order);
    }

    /**
     * builds ProductSearchFacetDistinctBucketSortExpression without checking for non-null required values
     * @return ProductSearchFacetDistinctBucketSortExpression
     */
    public ProductSearchFacetDistinctBucketSortExpression buildUnchecked() {
        return new ProductSearchFacetDistinctBucketSortExpressionImpl(by, order);
    }

    /**
     * factory method for an instance of ProductSearchFacetDistinctBucketSortExpressionBuilder
     * @return builder
     */
    public static ProductSearchFacetDistinctBucketSortExpressionBuilder of() {
        return new ProductSearchFacetDistinctBucketSortExpressionBuilder();
    }

    /**
     * create builder for ProductSearchFacetDistinctBucketSortExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetDistinctBucketSortExpressionBuilder of(
            final ProductSearchFacetDistinctBucketSortExpression template) {
        ProductSearchFacetDistinctBucketSortExpressionBuilder builder = new ProductSearchFacetDistinctBucketSortExpressionBuilder();
        builder.by = template.getBy();
        builder.order = template.getOrder();
        return builder;
    }

}
