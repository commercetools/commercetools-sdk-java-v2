
package com.commercetools.api.models.product_search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductPagedSearchResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPagedSearchResponse productPagedSearchResponse = ProductPagedSearchResponse.builder()
 *             .total(0.3)
 *             .offset(0.3)
 *             .limit(0.3)
 *             .plusFacets(facetsBuilder -> facetsBuilder)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductPagedSearchResponseBuilder implements Builder<ProductPagedSearchResponse> {

    private Long total;

    private Integer offset;

    private Integer limit;

    private java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetResult> facets;

    private java.util.List<com.commercetools.api.models.product_search.ProductSearchResult> results;

    /**
     *  <p>Total number of results matching the query.</p>
     * @param total value to be set
     * @return Builder
     */

    public ProductPagedSearchResponseBuilder total(final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Number of <span>elements skipped</span>.</p>
     * @param offset value to be set
     * @return Builder
     */

    public ProductPagedSearchResponseBuilder offset(final Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Number of <span>results requested</span>.</p>
     * @param limit value to be set
     * @return Builder
     */

    public ProductPagedSearchResponseBuilder limit(final Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Results for <span>facets</span> when requested.</p>
     * @param facets value to be set
     * @return Builder
     */

    public ProductPagedSearchResponseBuilder facets(
            final com.commercetools.api.models.product_search.ProductSearchFacetResult... facets) {
        this.facets = new ArrayList<>(Arrays.asList(facets));
        return this;
    }

    /**
     *  <p>Results for <span>facets</span> when requested.</p>
     * @param facets value to be set
     * @return Builder
     */

    public ProductPagedSearchResponseBuilder facets(
            final java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetResult> facets) {
        this.facets = facets;
        return this;
    }

    /**
     *  <p>Results for <span>facets</span> when requested.</p>
     * @param facets value to be set
     * @return Builder
     */

    public ProductPagedSearchResponseBuilder plusFacets(
            final com.commercetools.api.models.product_search.ProductSearchFacetResult... facets) {
        if (this.facets == null) {
            this.facets = new ArrayList<>();
        }
        this.facets.addAll(Arrays.asList(facets));
        return this;
    }

    /**
     *  <p>Results for <span>facets</span> when requested.</p>
     * @param builder function to build the facets value
     * @return Builder
     */

    public ProductPagedSearchResponseBuilder plusFacets(
            Function<com.commercetools.api.models.product_search.ProductSearchFacetResultBuilder, com.commercetools.api.models.product_search.ProductSearchFacetResultBuilder> builder) {
        if (this.facets == null) {
            this.facets = new ArrayList<>();
        }
        this.facets.add(
            builder.apply(com.commercetools.api.models.product_search.ProductSearchFacetResultBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Results for <span>facets</span> when requested.</p>
     * @param builder function to build the facets value
     * @return Builder
     */

    public ProductPagedSearchResponseBuilder withFacets(
            Function<com.commercetools.api.models.product_search.ProductSearchFacetResultBuilder, com.commercetools.api.models.product_search.ProductSearchFacetResultBuilder> builder) {
        this.facets = new ArrayList<>();
        this.facets.add(
            builder.apply(com.commercetools.api.models.product_search.ProductSearchFacetResultBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Results for <span>facets</span> when requested.</p>
     * @param builder function to build the facets value
     * @return Builder
     */

    public ProductPagedSearchResponseBuilder addFacets(
            Function<com.commercetools.api.models.product_search.ProductSearchFacetResultBuilder, com.commercetools.api.models.product_search.ProductSearchFacetResult> builder) {
        return plusFacets(
            builder.apply(com.commercetools.api.models.product_search.ProductSearchFacetResultBuilder.of()));
    }

    /**
     *  <p>Results for <span>facets</span> when requested.</p>
     * @param builder function to build the facets value
     * @return Builder
     */

    public ProductPagedSearchResponseBuilder setFacets(
            Function<com.commercetools.api.models.product_search.ProductSearchFacetResultBuilder, com.commercetools.api.models.product_search.ProductSearchFacetResult> builder) {
        return facets(builder.apply(com.commercetools.api.models.product_search.ProductSearchFacetResultBuilder.of()));
    }

    /**
     *  <p>Search result containing the Products matching the search query.</p>
     * @param results value to be set
     * @return Builder
     */

    public ProductPagedSearchResponseBuilder results(
            final com.commercetools.api.models.product_search.ProductSearchResult... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Search result containing the Products matching the search query.</p>
     * @param results value to be set
     * @return Builder
     */

    public ProductPagedSearchResponseBuilder results(
            final java.util.List<com.commercetools.api.models.product_search.ProductSearchResult> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>Search result containing the Products matching the search query.</p>
     * @param results value to be set
     * @return Builder
     */

    public ProductPagedSearchResponseBuilder plusResults(
            final com.commercetools.api.models.product_search.ProductSearchResult... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Search result containing the Products matching the search query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ProductPagedSearchResponseBuilder plusResults(
            Function<com.commercetools.api.models.product_search.ProductSearchResultBuilder, com.commercetools.api.models.product_search.ProductSearchResultBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(
            builder.apply(com.commercetools.api.models.product_search.ProductSearchResultBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Search result containing the Products matching the search query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ProductPagedSearchResponseBuilder withResults(
            Function<com.commercetools.api.models.product_search.ProductSearchResultBuilder, com.commercetools.api.models.product_search.ProductSearchResultBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(
            builder.apply(com.commercetools.api.models.product_search.ProductSearchResultBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Search result containing the Products matching the search query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ProductPagedSearchResponseBuilder addResults(
            Function<com.commercetools.api.models.product_search.ProductSearchResultBuilder, com.commercetools.api.models.product_search.ProductSearchResult> builder) {
        return plusResults(builder.apply(com.commercetools.api.models.product_search.ProductSearchResultBuilder.of()));
    }

    /**
     *  <p>Search result containing the Products matching the search query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ProductPagedSearchResponseBuilder setResults(
            Function<com.commercetools.api.models.product_search.ProductSearchResultBuilder, com.commercetools.api.models.product_search.ProductSearchResult> builder) {
        return results(builder.apply(com.commercetools.api.models.product_search.ProductSearchResultBuilder.of()));
    }

    /**
     *  <p>Total number of results matching the query.</p>
     * @return total
     */

    public Long getTotal() {
        return this.total;
    }

    /**
     *  <p>Number of <span>elements skipped</span>.</p>
     * @return offset
     */

    public Integer getOffset() {
        return this.offset;
    }

    /**
     *  <p>Number of <span>results requested</span>.</p>
     * @return limit
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     *  <p>Results for <span>facets</span> when requested.</p>
     * @return facets
     */

    public java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetResult> getFacets() {
        return this.facets;
    }

    /**
     *  <p>Search result containing the Products matching the search query.</p>
     * @return results
     */

    public java.util.List<com.commercetools.api.models.product_search.ProductSearchResult> getResults() {
        return this.results;
    }

    /**
     * builds ProductPagedSearchResponse with checking for non-null required values
     * @return ProductPagedSearchResponse
     */
    public ProductPagedSearchResponse build() {
        Objects.requireNonNull(total, ProductPagedSearchResponse.class + ": total is missing");
        Objects.requireNonNull(offset, ProductPagedSearchResponse.class + ": offset is missing");
        Objects.requireNonNull(limit, ProductPagedSearchResponse.class + ": limit is missing");
        Objects.requireNonNull(facets, ProductPagedSearchResponse.class + ": facets is missing");
        Objects.requireNonNull(results, ProductPagedSearchResponse.class + ": results is missing");
        return new ProductPagedSearchResponseImpl(total, offset, limit, facets, results);
    }

    /**
     * builds ProductPagedSearchResponse without checking for non-null required values
     * @return ProductPagedSearchResponse
     */
    public ProductPagedSearchResponse buildUnchecked() {
        return new ProductPagedSearchResponseImpl(total, offset, limit, facets, results);
    }

    /**
     * factory method for an instance of ProductPagedSearchResponseBuilder
     * @return builder
     */
    public static ProductPagedSearchResponseBuilder of() {
        return new ProductPagedSearchResponseBuilder();
    }

    /**
     * create builder for ProductPagedSearchResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPagedSearchResponseBuilder of(final ProductPagedSearchResponse template) {
        ProductPagedSearchResponseBuilder builder = new ProductPagedSearchResponseBuilder();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.limit = template.getLimit();
        builder.facets = template.getFacets();
        builder.results = template.getResults();
        return builder;
    }

}
