
package com.commercetools.api.models.product_search;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

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
 *             .plusHits(hitsBuilder -> hitsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductPagedSearchResponseBuilder implements Builder<ProductPagedSearchResponse> {

    private Long total;

    @Nullable
    private Integer offset;

    @Nullable
    private Integer limit;

    @Nullable
    private com.commercetools.api.models.product_search.ProductSearchFacetResult facets;

    private java.util.List<com.commercetools.api.models.product_search.ProductSearchHit> hits;

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
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */

    public ProductPagedSearchResponseBuilder offset(@Nullable final Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     * @return Builder
     */

    public ProductPagedSearchResponseBuilder limit(@Nullable final Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Results of faceting.</p>
     * @param builder function to build the facets value
     * @return Builder
     */

    public ProductPagedSearchResponseBuilder facets(
            Function<com.commercetools.api.models.product_search.ProductSearchFacetResultBuilder, com.commercetools.api.models.product_search.ProductSearchFacetResultBuilder> builder) {
        this.facets = builder.apply(com.commercetools.api.models.product_search.ProductSearchFacetResultBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Results of faceting.</p>
     * @param builder function to build the facets value
     * @return Builder
     */

    public ProductPagedSearchResponseBuilder withFacets(
            Function<com.commercetools.api.models.product_search.ProductSearchFacetResultBuilder, com.commercetools.api.models.product_search.ProductSearchFacetResult> builder) {
        this.facets = builder.apply(com.commercetools.api.models.product_search.ProductSearchFacetResultBuilder.of());
        return this;
    }

    /**
     *  <p>Results of faceting.</p>
     * @param facets value to be set
     * @return Builder
     */

    public ProductPagedSearchResponseBuilder facets(
            @Nullable final com.commercetools.api.models.product_search.ProductSearchFacetResult facets) {
        this.facets = facets;
        return this;
    }

    /**
     *  <p>Actual results.</p>
     * @param hits value to be set
     * @return Builder
     */

    public ProductPagedSearchResponseBuilder hits(
            final com.commercetools.api.models.product_search.ProductSearchHit... hits) {
        this.hits = new ArrayList<>(Arrays.asList(hits));
        return this;
    }

    /**
     *  <p>Actual results.</p>
     * @param hits value to be set
     * @return Builder
     */

    public ProductPagedSearchResponseBuilder hits(
            final java.util.List<com.commercetools.api.models.product_search.ProductSearchHit> hits) {
        this.hits = hits;
        return this;
    }

    /**
     *  <p>Actual results.</p>
     * @param hits value to be set
     * @return Builder
     */

    public ProductPagedSearchResponseBuilder plusHits(
            final com.commercetools.api.models.product_search.ProductSearchHit... hits) {
        if (this.hits == null) {
            this.hits = new ArrayList<>();
        }
        this.hits.addAll(Arrays.asList(hits));
        return this;
    }

    /**
     *  <p>Actual results.</p>
     * @param builder function to build the hits value
     * @return Builder
     */

    public ProductPagedSearchResponseBuilder plusHits(
            Function<com.commercetools.api.models.product_search.ProductSearchHitBuilder, com.commercetools.api.models.product_search.ProductSearchHitBuilder> builder) {
        if (this.hits == null) {
            this.hits = new ArrayList<>();
        }
        this.hits.add(builder.apply(com.commercetools.api.models.product_search.ProductSearchHitBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Actual results.</p>
     * @param builder function to build the hits value
     * @return Builder
     */

    public ProductPagedSearchResponseBuilder withHits(
            Function<com.commercetools.api.models.product_search.ProductSearchHitBuilder, com.commercetools.api.models.product_search.ProductSearchHitBuilder> builder) {
        this.hits = new ArrayList<>();
        this.hits.add(builder.apply(com.commercetools.api.models.product_search.ProductSearchHitBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Actual results.</p>
     * @param builder function to build the hits value
     * @return Builder
     */

    public ProductPagedSearchResponseBuilder addHits(
            Function<com.commercetools.api.models.product_search.ProductSearchHitBuilder, com.commercetools.api.models.product_search.ProductSearchHit> builder) {
        return plusHits(builder.apply(com.commercetools.api.models.product_search.ProductSearchHitBuilder.of()));
    }

    /**
     *  <p>Actual results.</p>
     * @param builder function to build the hits value
     * @return Builder
     */

    public ProductPagedSearchResponseBuilder setHits(
            Function<com.commercetools.api.models.product_search.ProductSearchHitBuilder, com.commercetools.api.models.product_search.ProductSearchHit> builder) {
        return hits(builder.apply(com.commercetools.api.models.product_search.ProductSearchHitBuilder.of()));
    }

    /**
     *  <p>Total number of results matching the query.</p>
     * @return total
     */

    public Long getTotal() {
        return this.total;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @return offset
     */

    @Nullable
    public Integer getOffset() {
        return this.offset;
    }

    /**
     *  <p>Number of results requested.</p>
     * @return limit
     */

    @Nullable
    public Integer getLimit() {
        return this.limit;
    }

    /**
     *  <p>Results of faceting.</p>
     * @return facets
     */

    @Nullable
    public com.commercetools.api.models.product_search.ProductSearchFacetResult getFacets() {
        return this.facets;
    }

    /**
     *  <p>Actual results.</p>
     * @return hits
     */

    public java.util.List<com.commercetools.api.models.product_search.ProductSearchHit> getHits() {
        return this.hits;
    }

    /**
     * builds ProductPagedSearchResponse with checking for non-null required values
     * @return ProductPagedSearchResponse
     */
    public ProductPagedSearchResponse build() {
        Objects.requireNonNull(total, ProductPagedSearchResponse.class + ": total is missing");
        Objects.requireNonNull(hits, ProductPagedSearchResponse.class + ": hits is missing");
        return new ProductPagedSearchResponseImpl(total, offset, limit, facets, hits);
    }

    /**
     * builds ProductPagedSearchResponse without checking for non-null required values
     * @return ProductPagedSearchResponse
     */
    public ProductPagedSearchResponse buildUnchecked() {
        return new ProductPagedSearchResponseImpl(total, offset, limit, facets, hits);
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
        builder.hits = template.getHits();
        return builder;
    }

}
