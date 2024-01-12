
package com.commercetools.api.models.product_search;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchRequestBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchRequest productSearchRequest = ProductSearchRequest.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchRequestBuilder implements Builder<ProductSearchRequest> {

    @Nullable
    private com.commercetools.api.models.product_search.ProductSearchQuery query;

    @Nullable
    private com.commercetools.api.models.product_search.ProductSearchQuery postFilter;

    @Nullable
    private java.util.List<com.commercetools.api.models.product_search.ProductSearchSorting> sort;

    @Nullable
    private Integer limit;

    @Nullable
    private Integer offset;

    @Nullable
    private Boolean markMatchingVariants;

    @Nullable
    private com.commercetools.api.models.product_search.ProductSearchProjectionParams projection;

    @Nullable
    private java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetExpression> facets;

    /**
     *  <p>The Product search query.</p>
     * @param builder function to build the query value
     * @return Builder
     */

    public ProductSearchRequestBuilder query(
            Function<com.commercetools.api.models.product_search.ProductSearchQueryBuilder, com.commercetools.api.models.product_search.ProductSearchQueryBuilder> builder) {
        this.query = builder.apply(com.commercetools.api.models.product_search.ProductSearchQueryBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Product search query.</p>
     * @param builder function to build the query value
     * @return Builder
     */

    public ProductSearchRequestBuilder withQuery(
            Function<com.commercetools.api.models.product_search.ProductSearchQueryBuilder, com.commercetools.api.models.product_search.ProductSearchQuery> builder) {
        this.query = builder.apply(com.commercetools.api.models.product_search.ProductSearchQueryBuilder.of());
        return this;
    }

    /**
     *  <p>The Product search query.</p>
     * @param query value to be set
     * @return Builder
     */

    public ProductSearchRequestBuilder query(
            @Nullable final com.commercetools.api.models.product_search.ProductSearchQuery query) {
        this.query = query;
        return this;
    }

    /**
     * set the value to the postFilter using the builder function
     * @param builder function to build the postFilter value
     * @return Builder
     */

    public ProductSearchRequestBuilder postFilter(
            Function<com.commercetools.api.models.product_search.ProductSearchQueryBuilder, com.commercetools.api.models.product_search.ProductSearchQueryBuilder> builder) {
        this.postFilter = builder.apply(com.commercetools.api.models.product_search.ProductSearchQueryBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the postFilter using the builder function
     * @param builder function to build the postFilter value
     * @return Builder
     */

    public ProductSearchRequestBuilder withPostFilter(
            Function<com.commercetools.api.models.product_search.ProductSearchQueryBuilder, com.commercetools.api.models.product_search.ProductSearchQuery> builder) {
        this.postFilter = builder.apply(com.commercetools.api.models.product_search.ProductSearchQueryBuilder.of());
        return this;
    }

    /**
     * set the value to the postFilter
     * @param postFilter value to be set
     * @return Builder
     */

    public ProductSearchRequestBuilder postFilter(
            @Nullable final com.commercetools.api.models.product_search.ProductSearchQuery postFilter) {
        this.postFilter = postFilter;
        return this;
    }

    /**
     *  <p>Controls how results to your query are sorted. If not provided, the results are sorted by relevance in descending order.</p>
     * @param sort value to be set
     * @return Builder
     */

    public ProductSearchRequestBuilder sort(
            @Nullable final com.commercetools.api.models.product_search.ProductSearchSorting... sort) {
        this.sort = new ArrayList<>(Arrays.asList(sort));
        return this;
    }

    /**
     *  <p>Controls how results to your query are sorted. If not provided, the results are sorted by relevance in descending order.</p>
     * @param sort value to be set
     * @return Builder
     */

    public ProductSearchRequestBuilder sort(
            @Nullable final java.util.List<com.commercetools.api.models.product_search.ProductSearchSorting> sort) {
        this.sort = sort;
        return this;
    }

    /**
     *  <p>Controls how results to your query are sorted. If not provided, the results are sorted by relevance in descending order.</p>
     * @param sort value to be set
     * @return Builder
     */

    public ProductSearchRequestBuilder plusSort(
            @Nullable final com.commercetools.api.models.product_search.ProductSearchSorting... sort) {
        if (this.sort == null) {
            this.sort = new ArrayList<>();
        }
        this.sort.addAll(Arrays.asList(sort));
        return this;
    }

    /**
     *  <p>Controls how results to your query are sorted. If not provided, the results are sorted by relevance in descending order.</p>
     * @param builder function to build the sort value
     * @return Builder
     */

    public ProductSearchRequestBuilder plusSort(
            Function<com.commercetools.api.models.product_search.ProductSearchSortingBuilder, com.commercetools.api.models.product_search.ProductSearchSortingBuilder> builder) {
        if (this.sort == null) {
            this.sort = new ArrayList<>();
        }
        this.sort.add(
            builder.apply(com.commercetools.api.models.product_search.ProductSearchSortingBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Controls how results to your query are sorted. If not provided, the results are sorted by relevance in descending order.</p>
     * @param builder function to build the sort value
     * @return Builder
     */

    public ProductSearchRequestBuilder withSort(
            Function<com.commercetools.api.models.product_search.ProductSearchSortingBuilder, com.commercetools.api.models.product_search.ProductSearchSortingBuilder> builder) {
        this.sort = new ArrayList<>();
        this.sort.add(
            builder.apply(com.commercetools.api.models.product_search.ProductSearchSortingBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Controls how results to your query are sorted. If not provided, the results are sorted by relevance in descending order.</p>
     * @param builder function to build the sort value
     * @return Builder
     */

    public ProductSearchRequestBuilder addSort(
            Function<com.commercetools.api.models.product_search.ProductSearchSortingBuilder, com.commercetools.api.models.product_search.ProductSearchSorting> builder) {
        return plusSort(builder.apply(com.commercetools.api.models.product_search.ProductSearchSortingBuilder.of()));
    }

    /**
     *  <p>Controls how results to your query are sorted. If not provided, the results are sorted by relevance in descending order.</p>
     * @param builder function to build the sort value
     * @return Builder
     */

    public ProductSearchRequestBuilder setSort(
            Function<com.commercetools.api.models.product_search.ProductSearchSortingBuilder, com.commercetools.api.models.product_search.ProductSearchSorting> builder) {
        return sort(builder.apply(com.commercetools.api.models.product_search.ProductSearchSortingBuilder.of()));
    }

    /**
     *  <p>The maximum number of search results to be returned.</p>
     * @param limit value to be set
     * @return Builder
     */

    public ProductSearchRequestBuilder limit(@Nullable final Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>The number of search results to be skipped in the response for pagination.</p>
     * @param offset value to be set
     * @return Builder
     */

    public ProductSearchRequestBuilder offset(@Nullable final Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>The search can return Products where not all Product Variants match the search criteria. If <code>true</code>, the response will include a field called <code>matchingVariants</code> that contains the <code>sku</code> of Product Variants that match the search query. If the query does not specify any variant-level criteria, <code>matchingVariants</code> will be null signifying that all Product Variants are a match.</p>
     * @param markMatchingVariants value to be set
     * @return Builder
     */

    public ProductSearchRequestBuilder markMatchingVariants(@Nullable final Boolean markMatchingVariants) {
        this.markMatchingVariants = markMatchingVariants;
        return this;
    }

    /**
     *  <p>Contains Product Projection query parameters. Used to fetch matching Product Projection data of products matching the search query. If not included, Product Projection integration is not used.</p>
     * @param builder function to build the projection value
     * @return Builder
     */

    public ProductSearchRequestBuilder projection(
            Function<com.commercetools.api.models.product_search.ProductSearchProjectionParamsBuilder, com.commercetools.api.models.product_search.ProductSearchProjectionParamsBuilder> builder) {
        this.projection = builder
                .apply(com.commercetools.api.models.product_search.ProductSearchProjectionParamsBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Contains Product Projection query parameters. Used to fetch matching Product Projection data of products matching the search query. If not included, Product Projection integration is not used.</p>
     * @param builder function to build the projection value
     * @return Builder
     */

    public ProductSearchRequestBuilder withProjection(
            Function<com.commercetools.api.models.product_search.ProductSearchProjectionParamsBuilder, com.commercetools.api.models.product_search.ProductSearchProjectionParams> builder) {
        this.projection = builder
                .apply(com.commercetools.api.models.product_search.ProductSearchProjectionParamsBuilder.of());
        return this;
    }

    /**
     *  <p>Contains Product Projection query parameters. Used to fetch matching Product Projection data of products matching the search query. If not included, Product Projection integration is not used.</p>
     * @param projection value to be set
     * @return Builder
     */

    public ProductSearchRequestBuilder projection(
            @Nullable final com.commercetools.api.models.product_search.ProductSearchProjectionParams projection) {
        this.projection = projection;
        return this;
    }

    /**
     * set values to the facets
     * @param facets value to be set
     * @return Builder
     */

    public ProductSearchRequestBuilder facets(
            @Nullable final com.commercetools.api.models.product_search.ProductSearchFacetExpression... facets) {
        this.facets = new ArrayList<>(Arrays.asList(facets));
        return this;
    }

    /**
     * set value to the facets
     * @param facets value to be set
     * @return Builder
     */

    public ProductSearchRequestBuilder facets(
            @Nullable final java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetExpression> facets) {
        this.facets = facets;
        return this;
    }

    /**
     * add values to the facets
     * @param facets value to be set
     * @return Builder
     */

    public ProductSearchRequestBuilder plusFacets(
            @Nullable final com.commercetools.api.models.product_search.ProductSearchFacetExpression... facets) {
        if (this.facets == null) {
            this.facets = new ArrayList<>();
        }
        this.facets.addAll(Arrays.asList(facets));
        return this;
    }

    /**
     * add the value to the facets using the builder function
     * @param builder function to build the facets value
     * @return Builder
     */

    public ProductSearchRequestBuilder plusFacets(
            Function<com.commercetools.api.models.product_search.ProductSearchFacetExpressionBuilder, com.commercetools.api.models.product_search.ProductSearchFacetExpressionBuilder> builder) {
        if (this.facets == null) {
            this.facets = new ArrayList<>();
        }
        this.facets
                .add(builder.apply(com.commercetools.api.models.product_search.ProductSearchFacetExpressionBuilder.of())
                        .build());
        return this;
    }

    /**
     * set the value to the facets using the builder function
     * @param builder function to build the facets value
     * @return Builder
     */

    public ProductSearchRequestBuilder withFacets(
            Function<com.commercetools.api.models.product_search.ProductSearchFacetExpressionBuilder, com.commercetools.api.models.product_search.ProductSearchFacetExpressionBuilder> builder) {
        this.facets = new ArrayList<>();
        this.facets
                .add(builder.apply(com.commercetools.api.models.product_search.ProductSearchFacetExpressionBuilder.of())
                        .build());
        return this;
    }

    /**
     * add the value to the facets using the builder function
     * @param builder function to build the facets value
     * @return Builder
     */

    public ProductSearchRequestBuilder addFacets(
            Function<com.commercetools.api.models.product_search.ProductSearchFacetExpressionBuilder, com.commercetools.api.models.product_search.ProductSearchFacetExpression> builder) {
        return plusFacets(
            builder.apply(com.commercetools.api.models.product_search.ProductSearchFacetExpressionBuilder.of()));
    }

    /**
     * set the value to the facets using the builder function
     * @param builder function to build the facets value
     * @return Builder
     */

    public ProductSearchRequestBuilder setFacets(
            Function<com.commercetools.api.models.product_search.ProductSearchFacetExpressionBuilder, com.commercetools.api.models.product_search.ProductSearchFacetExpression> builder) {
        return facets(
            builder.apply(com.commercetools.api.models.product_search.ProductSearchFacetExpressionBuilder.of()));
    }

    /**
     *  <p>The Product search query.</p>
     * @return query
     */

    @Nullable
    public com.commercetools.api.models.product_search.ProductSearchQuery getQuery() {
        return this.query;
    }

    /**
     * value of postFilter}
     * @return postFilter
     */

    @Nullable
    public com.commercetools.api.models.product_search.ProductSearchQuery getPostFilter() {
        return this.postFilter;
    }

    /**
     *  <p>Controls how results to your query are sorted. If not provided, the results are sorted by relevance in descending order.</p>
     * @return sort
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.product_search.ProductSearchSorting> getSort() {
        return this.sort;
    }

    /**
     *  <p>The maximum number of search results to be returned.</p>
     * @return limit
     */

    @Nullable
    public Integer getLimit() {
        return this.limit;
    }

    /**
     *  <p>The number of search results to be skipped in the response for pagination.</p>
     * @return offset
     */

    @Nullable
    public Integer getOffset() {
        return this.offset;
    }

    /**
     *  <p>The search can return Products where not all Product Variants match the search criteria. If <code>true</code>, the response will include a field called <code>matchingVariants</code> that contains the <code>sku</code> of Product Variants that match the search query. If the query does not specify any variant-level criteria, <code>matchingVariants</code> will be null signifying that all Product Variants are a match.</p>
     * @return markMatchingVariants
     */

    @Nullable
    public Boolean getMarkMatchingVariants() {
        return this.markMatchingVariants;
    }

    /**
     *  <p>Contains Product Projection query parameters. Used to fetch matching Product Projection data of products matching the search query. If not included, Product Projection integration is not used.</p>
     * @return projection
     */

    @Nullable
    public com.commercetools.api.models.product_search.ProductSearchProjectionParams getProjection() {
        return this.projection;
    }

    /**
     * value of facets}
     * @return facets
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetExpression> getFacets() {
        return this.facets;
    }

    /**
     * builds ProductSearchRequest with checking for non-null required values
     * @return ProductSearchRequest
     */
    public ProductSearchRequest build() {
        return new ProductSearchRequestImpl(query, postFilter, sort, limit, offset, markMatchingVariants, projection,
            facets);
    }

    /**
     * builds ProductSearchRequest without checking for non-null required values
     * @return ProductSearchRequest
     */
    public ProductSearchRequest buildUnchecked() {
        return new ProductSearchRequestImpl(query, postFilter, sort, limit, offset, markMatchingVariants, projection,
            facets);
    }

    /**
     * factory method for an instance of ProductSearchRequestBuilder
     * @return builder
     */
    public static ProductSearchRequestBuilder of() {
        return new ProductSearchRequestBuilder();
    }

    /**
     * create builder for ProductSearchRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchRequestBuilder of(final ProductSearchRequest template) {
        ProductSearchRequestBuilder builder = new ProductSearchRequestBuilder();
        builder.query = template.getQuery();
        builder.postFilter = template.getPostFilter();
        builder.sort = template.getSort();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.markMatchingVariants = template.getMarkMatchingVariants();
        builder.projection = template.getProjection();
        builder.facets = template.getFacets();
        return builder;
    }

}
