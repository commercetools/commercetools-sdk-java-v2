
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductProjectionPagedSearchResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductProjectionPagedSearchResponse productProjectionPagedSearchResponse = ProductProjectionPagedSearchResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductProjectionPagedSearchResponseBuilder implements Builder<ProductProjectionPagedSearchResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.product.ProductProjection> results;

    @Nullable
    private com.commercetools.api.models.product.FacetResults facets;

    /**
     *  <p>The maximum number of results returned on a page.</p>
     * @param limit value to be set
     * @return Builder
     */

    public ProductProjectionPagedSearchResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>The starting point for the retrieved paginated result.</p>
     * @param offset value to be set
     * @return Builder
     */

    public ProductProjectionPagedSearchResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public ProductProjectionPagedSearchResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query.</p>
     * @param total value to be set
     * @return Builder
     */

    public ProductProjectionPagedSearchResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>ProductProjections where at least one ProductVariant matches the search query, provided with the <code>text.{language}</code> and/or <code>filter.query</code> or <code>filter</code> query parameter. If the query parameter <code>markMatchingVariants=true</code> was provided with the request, the matching variants are marked as such.</p>
     * @param results value to be set
     * @return Builder
     */

    public ProductProjectionPagedSearchResponseBuilder results(
            final com.commercetools.api.models.product.ProductProjection... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>ProductProjections where at least one ProductVariant matches the search query, provided with the <code>text.{language}</code> and/or <code>filter.query</code> or <code>filter</code> query parameter. If the query parameter <code>markMatchingVariants=true</code> was provided with the request, the matching variants are marked as such.</p>
     * @param results value to be set
     * @return Builder
     */

    public ProductProjectionPagedSearchResponseBuilder results(
            final java.util.List<com.commercetools.api.models.product.ProductProjection> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>ProductProjections where at least one ProductVariant matches the search query, provided with the <code>text.{language}</code> and/or <code>filter.query</code> or <code>filter</code> query parameter. If the query parameter <code>markMatchingVariants=true</code> was provided with the request, the matching variants are marked as such.</p>
     * @param results value to be set
     * @return Builder
     */

    public ProductProjectionPagedSearchResponseBuilder plusResults(
            final com.commercetools.api.models.product.ProductProjection... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>ProductProjections where at least one ProductVariant matches the search query, provided with the <code>text.{language}</code> and/or <code>filter.query</code> or <code>filter</code> query parameter. If the query parameter <code>markMatchingVariants=true</code> was provided with the request, the matching variants are marked as such.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ProductProjectionPagedSearchResponseBuilder plusResults(
            Function<com.commercetools.api.models.product.ProductProjectionBuilder, com.commercetools.api.models.product.ProductProjectionBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.product.ProductProjectionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>ProductProjections where at least one ProductVariant matches the search query, provided with the <code>text.{language}</code> and/or <code>filter.query</code> or <code>filter</code> query parameter. If the query parameter <code>markMatchingVariants=true</code> was provided with the request, the matching variants are marked as such.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ProductProjectionPagedSearchResponseBuilder withResults(
            Function<com.commercetools.api.models.product.ProductProjectionBuilder, com.commercetools.api.models.product.ProductProjectionBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.product.ProductProjectionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>ProductProjections where at least one ProductVariant matches the search query, provided with the <code>text.{language}</code> and/or <code>filter.query</code> or <code>filter</code> query parameter. If the query parameter <code>markMatchingVariants=true</code> was provided with the request, the matching variants are marked as such.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ProductProjectionPagedSearchResponseBuilder addResults(
            Function<com.commercetools.api.models.product.ProductProjectionBuilder, com.commercetools.api.models.product.ProductProjection> builder) {
        return plusResults(builder.apply(com.commercetools.api.models.product.ProductProjectionBuilder.of()));
    }

    /**
     *  <p>ProductProjections where at least one ProductVariant matches the search query, provided with the <code>text.{language}</code> and/or <code>filter.query</code> or <code>filter</code> query parameter. If the query parameter <code>markMatchingVariants=true</code> was provided with the request, the matching variants are marked as such.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ProductProjectionPagedSearchResponseBuilder setResults(
            Function<com.commercetools.api.models.product.ProductProjectionBuilder, com.commercetools.api.models.product.ProductProjection> builder) {
        return results(builder.apply(com.commercetools.api.models.product.ProductProjectionBuilder.of()));
    }

    /**
     *  <p>Facet results for each facet expression specified in the search request.</p>
     *  <p>Only present if at least one <code>facet</code> parameter was provided with the search request.</p>
     * @param builder function to build the facets value
     * @return Builder
     */

    public ProductProjectionPagedSearchResponseBuilder facets(
            Function<com.commercetools.api.models.product.FacetResultsBuilder, com.commercetools.api.models.product.FacetResultsBuilder> builder) {
        this.facets = builder.apply(com.commercetools.api.models.product.FacetResultsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Facet results for each facet expression specified in the search request.</p>
     *  <p>Only present if at least one <code>facet</code> parameter was provided with the search request.</p>
     * @param builder function to build the facets value
     * @return Builder
     */

    public ProductProjectionPagedSearchResponseBuilder withFacets(
            Function<com.commercetools.api.models.product.FacetResultsBuilder, com.commercetools.api.models.product.FacetResults> builder) {
        this.facets = builder.apply(com.commercetools.api.models.product.FacetResultsBuilder.of());
        return this;
    }

    /**
     *  <p>Facet results for each facet expression specified in the search request.</p>
     *  <p>Only present if at least one <code>facet</code> parameter was provided with the search request.</p>
     * @param facets value to be set
     * @return Builder
     */

    public ProductProjectionPagedSearchResponseBuilder facets(
            @Nullable final com.commercetools.api.models.product.FacetResults facets) {
        this.facets = facets;
        return this;
    }

    /**
     *  <p>The maximum number of results returned on a page.</p>
     * @return limit
     */

    public Long getLimit() {
        return this.limit;
    }

    /**
     *  <p>The starting point for the retrieved paginated result.</p>
     * @return offset
     */

    public Long getOffset() {
        return this.offset;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @return count
     */

    public Long getCount() {
        return this.count;
    }

    /**
     *  <p>Total number of results matching the query.</p>
     * @return total
     */

    @Nullable
    public Long getTotal() {
        return this.total;
    }

    /**
     *  <p>ProductProjections where at least one ProductVariant matches the search query, provided with the <code>text.{language}</code> and/or <code>filter.query</code> or <code>filter</code> query parameter. If the query parameter <code>markMatchingVariants=true</code> was provided with the request, the matching variants are marked as such.</p>
     * @return results
     */

    public java.util.List<com.commercetools.api.models.product.ProductProjection> getResults() {
        return this.results;
    }

    /**
     *  <p>Facet results for each facet expression specified in the search request.</p>
     *  <p>Only present if at least one <code>facet</code> parameter was provided with the search request.</p>
     * @return facets
     */

    @Nullable
    public com.commercetools.api.models.product.FacetResults getFacets() {
        return this.facets;
    }

    /**
     * builds ProductProjectionPagedSearchResponse with checking for non-null required values
     * @return ProductProjectionPagedSearchResponse
     */
    public ProductProjectionPagedSearchResponse build() {
        Objects.requireNonNull(limit, ProductProjectionPagedSearchResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, ProductProjectionPagedSearchResponse.class + ": offset is missing");
        Objects.requireNonNull(count, ProductProjectionPagedSearchResponse.class + ": count is missing");
        Objects.requireNonNull(results, ProductProjectionPagedSearchResponse.class + ": results is missing");
        return new ProductProjectionPagedSearchResponseImpl(limit, offset, count, total, results, facets);
    }

    /**
     * builds ProductProjectionPagedSearchResponse without checking for non-null required values
     * @return ProductProjectionPagedSearchResponse
     */
    public ProductProjectionPagedSearchResponse buildUnchecked() {
        return new ProductProjectionPagedSearchResponseImpl(limit, offset, count, total, results, facets);
    }

    /**
     * factory method for an instance of ProductProjectionPagedSearchResponseBuilder
     * @return builder
     */
    public static ProductProjectionPagedSearchResponseBuilder of() {
        return new ProductProjectionPagedSearchResponseBuilder();
    }

    /**
     * create builder for ProductProjectionPagedSearchResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductProjectionPagedSearchResponseBuilder of(final ProductProjectionPagedSearchResponse template) {
        ProductProjectionPagedSearchResponseBuilder builder = new ProductProjectionPagedSearchResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        builder.facets = template.getFacets();
        return builder;
    }

}
