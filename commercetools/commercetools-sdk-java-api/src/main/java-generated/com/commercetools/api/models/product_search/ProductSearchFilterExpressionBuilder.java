
package com.commercetools.api.models.product_search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchFilterExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFilterExpression productSearchFilterExpression = ProductSearchFilterExpression.builder()
 *             .plusFilter(filterBuilder -> filterBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFilterExpressionBuilder implements Builder<ProductSearchFilterExpression> {

    private java.util.List<com.commercetools.api.models.product_search.ProductSearchQueryExpression> filter;

    /**
     * set values to the filter
     * @param filter value to be set
     * @return Builder
     */

    public ProductSearchFilterExpressionBuilder filter(
            final com.commercetools.api.models.product_search.ProductSearchQueryExpression... filter) {
        this.filter = new ArrayList<>(Arrays.asList(filter));
        return this;
    }

    /**
     * set value to the filter
     * @param filter value to be set
     * @return Builder
     */

    public ProductSearchFilterExpressionBuilder filter(
            final java.util.List<com.commercetools.api.models.product_search.ProductSearchQueryExpression> filter) {
        this.filter = filter;
        return this;
    }

    /**
     * add values to the filter
     * @param filter value to be set
     * @return Builder
     */

    public ProductSearchFilterExpressionBuilder plusFilter(
            final com.commercetools.api.models.product_search.ProductSearchQueryExpression... filter) {
        if (this.filter == null) {
            this.filter = new ArrayList<>();
        }
        this.filter.addAll(Arrays.asList(filter));
        return this;
    }

    /**
     * add the value to the filter using the builder function
     * @param builder function to build the filter value
     * @return Builder
     */

    public ProductSearchFilterExpressionBuilder plusFilter(
            Function<com.commercetools.api.models.product_search.ProductSearchQueryExpressionBuilder, com.commercetools.api.models.product_search.ProductSearchQueryExpressionBuilder> builder) {
        if (this.filter == null) {
            this.filter = new ArrayList<>();
        }
        this.filter
                .add(builder.apply(com.commercetools.api.models.product_search.ProductSearchQueryExpressionBuilder.of())
                        .build());
        return this;
    }

    /**
     * set the value to the filter using the builder function
     * @param builder function to build the filter value
     * @return Builder
     */

    public ProductSearchFilterExpressionBuilder withFilter(
            Function<com.commercetools.api.models.product_search.ProductSearchQueryExpressionBuilder, com.commercetools.api.models.product_search.ProductSearchQueryExpressionBuilder> builder) {
        this.filter = new ArrayList<>();
        this.filter
                .add(builder.apply(com.commercetools.api.models.product_search.ProductSearchQueryExpressionBuilder.of())
                        .build());
        return this;
    }

    /**
     * add the value to the filter using the builder function
     * @param builder function to build the filter value
     * @return Builder
     */

    public ProductSearchFilterExpressionBuilder addFilter(
            Function<com.commercetools.api.models.product_search.ProductSearchQueryExpressionBuilder, com.commercetools.api.models.product_search.ProductSearchQueryExpression> builder) {
        return plusFilter(
            builder.apply(com.commercetools.api.models.product_search.ProductSearchQueryExpressionBuilder.of()));
    }

    /**
     * set the value to the filter using the builder function
     * @param builder function to build the filter value
     * @return Builder
     */

    public ProductSearchFilterExpressionBuilder setFilter(
            Function<com.commercetools.api.models.product_search.ProductSearchQueryExpressionBuilder, com.commercetools.api.models.product_search.ProductSearchQueryExpression> builder) {
        return filter(
            builder.apply(com.commercetools.api.models.product_search.ProductSearchQueryExpressionBuilder.of()));
    }

    /**
     * value of filter}
     * @return filter
     */

    public java.util.List<com.commercetools.api.models.product_search.ProductSearchQueryExpression> getFilter() {
        return this.filter;
    }

    /**
     * builds ProductSearchFilterExpression with checking for non-null required values
     * @return ProductSearchFilterExpression
     */
    public ProductSearchFilterExpression build() {
        Objects.requireNonNull(filter, ProductSearchFilterExpression.class + ": filter is missing");
        return new ProductSearchFilterExpressionImpl(filter);
    }

    /**
     * builds ProductSearchFilterExpression without checking for non-null required values
     * @return ProductSearchFilterExpression
     */
    public ProductSearchFilterExpression buildUnchecked() {
        return new ProductSearchFilterExpressionImpl(filter);
    }

    /**
     * factory method for an instance of ProductSearchFilterExpressionBuilder
     * @return builder
     */
    public static ProductSearchFilterExpressionBuilder of() {
        return new ProductSearchFilterExpressionBuilder();
    }

    /**
     * create builder for ProductSearchFilterExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFilterExpressionBuilder of(final ProductSearchFilterExpression template) {
        ProductSearchFilterExpressionBuilder builder = new ProductSearchFilterExpressionBuilder();
        builder.filter = template.getFilter();
        return builder;
    }

}
