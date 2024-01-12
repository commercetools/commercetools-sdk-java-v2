
package com.commercetools.api.models.product_search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchFacetResultBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetResult productSearchFacetResult = ProductSearchFacetResult.builder()
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFacetResultBuilder implements Builder<ProductSearchFacetResult> {

    private java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetResultExpression> results;

    /**
     *  <p>Results of the facets.</p>
     * @param results value to be set
     * @return Builder
     */

    public ProductSearchFacetResultBuilder results(
            final com.commercetools.api.models.product_search.ProductSearchFacetResultExpression... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Results of the facets.</p>
     * @param results value to be set
     * @return Builder
     */

    public ProductSearchFacetResultBuilder results(
            final java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetResultExpression> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>Results of the facets.</p>
     * @param results value to be set
     * @return Builder
     */

    public ProductSearchFacetResultBuilder plusResults(
            final com.commercetools.api.models.product_search.ProductSearchFacetResultExpression... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Results of the facets.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ProductSearchFacetResultBuilder plusResults(
            Function<com.commercetools.api.models.product_search.ProductSearchFacetResultExpressionBuilder, com.commercetools.api.models.product_search.ProductSearchFacetResultExpressionBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(
            builder.apply(com.commercetools.api.models.product_search.ProductSearchFacetResultExpressionBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>Results of the facets.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ProductSearchFacetResultBuilder withResults(
            Function<com.commercetools.api.models.product_search.ProductSearchFacetResultExpressionBuilder, com.commercetools.api.models.product_search.ProductSearchFacetResultExpressionBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(
            builder.apply(com.commercetools.api.models.product_search.ProductSearchFacetResultExpressionBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>Results of the facets.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ProductSearchFacetResultBuilder addResults(
            Function<com.commercetools.api.models.product_search.ProductSearchFacetResultExpressionBuilder, com.commercetools.api.models.product_search.ProductSearchFacetResultExpression> builder) {
        return plusResults(
            builder.apply(com.commercetools.api.models.product_search.ProductSearchFacetResultExpressionBuilder.of()));
    }

    /**
     *  <p>Results of the facets.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ProductSearchFacetResultBuilder setResults(
            Function<com.commercetools.api.models.product_search.ProductSearchFacetResultExpressionBuilder, com.commercetools.api.models.product_search.ProductSearchFacetResultExpression> builder) {
        return results(
            builder.apply(com.commercetools.api.models.product_search.ProductSearchFacetResultExpressionBuilder.of()));
    }

    /**
     *  <p>Results of the facets.</p>
     * @return results
     */

    public java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetResultExpression> getResults() {
        return this.results;
    }

    /**
     * builds ProductSearchFacetResult with checking for non-null required values
     * @return ProductSearchFacetResult
     */
    public ProductSearchFacetResult build() {
        Objects.requireNonNull(results, ProductSearchFacetResult.class + ": results is missing");
        return new ProductSearchFacetResultImpl(results);
    }

    /**
     * builds ProductSearchFacetResult without checking for non-null required values
     * @return ProductSearchFacetResult
     */
    public ProductSearchFacetResult buildUnchecked() {
        return new ProductSearchFacetResultImpl(results);
    }

    /**
     * factory method for an instance of ProductSearchFacetResultBuilder
     * @return builder
     */
    public static ProductSearchFacetResultBuilder of() {
        return new ProductSearchFacetResultBuilder();
    }

    /**
     * create builder for ProductSearchFacetResult instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetResultBuilder of(final ProductSearchFacetResult template) {
        ProductSearchFacetResultBuilder builder = new ProductSearchFacetResultBuilder();
        builder.results = template.getResults();
        return builder;
    }

}
