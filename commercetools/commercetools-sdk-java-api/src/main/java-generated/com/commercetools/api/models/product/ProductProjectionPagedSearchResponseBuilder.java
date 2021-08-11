
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductProjectionPagedSearchResponseBuilder
        implements Builder<ProductProjectionPagedSearchResponse> {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.product.ProductProjection> results;

    private com.commercetools.api.models.product.FacetResults facets;

    public ProductProjectionPagedSearchResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    public ProductProjectionPagedSearchResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public ProductProjectionPagedSearchResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    public ProductProjectionPagedSearchResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public ProductProjectionPagedSearchResponseBuilder results(
            final com.commercetools.api.models.product.ProductProjection... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public ProductProjectionPagedSearchResponseBuilder withResults(
            Function<com.commercetools.api.models.product.ProductProjectionBuilder, com.commercetools.api.models.product.ProductProjectionBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.product.ProductProjectionBuilder.of()).build());
        return this;
    }

    public ProductProjectionPagedSearchResponseBuilder plusResults(
            Function<com.commercetools.api.models.product.ProductProjectionBuilder, com.commercetools.api.models.product.ProductProjectionBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.product.ProductProjectionBuilder.of()).build());
        return this;
    }

    public ProductProjectionPagedSearchResponseBuilder results(
            final java.util.List<com.commercetools.api.models.product.ProductProjection> results) {
        this.results = results;
        return this;
    }

    public ProductProjectionPagedSearchResponseBuilder facets(
            Function<com.commercetools.api.models.product.FacetResultsBuilder, com.commercetools.api.models.product.FacetResultsBuilder> builder) {
        this.facets = builder.apply(com.commercetools.api.models.product.FacetResultsBuilder.of()).build();
        return this;
    }

    public ProductProjectionPagedSearchResponseBuilder facets(
            final com.commercetools.api.models.product.FacetResults facets) {
        this.facets = facets;
        return this;
    }

    public Long getLimit() {
        return this.limit;
    }

    public Long getCount() {
        return this.count;
    }

    @Nullable
    public Long getTotal() {
        return this.total;
    }

    public Long getOffset() {
        return this.offset;
    }

    public java.util.List<com.commercetools.api.models.product.ProductProjection> getResults() {
        return this.results;
    }

    public com.commercetools.api.models.product.FacetResults getFacets() {
        return this.facets;
    }

    public ProductProjectionPagedSearchResponse build() {
        Objects.requireNonNull(limit, ProductProjectionPagedSearchResponse.class + ": limit is missing");
        Objects.requireNonNull(count, ProductProjectionPagedSearchResponse.class + ": count is missing");
        Objects.requireNonNull(offset, ProductProjectionPagedSearchResponse.class + ": offset is missing");
        Objects.requireNonNull(results, ProductProjectionPagedSearchResponse.class + ": results is missing");
        Objects.requireNonNull(facets, ProductProjectionPagedSearchResponse.class + ": facets is missing");
        return new ProductProjectionPagedSearchResponseImpl(limit, count, total, offset, results, facets);
    }

    /**
     * builds ProductProjectionPagedSearchResponse without checking for non null required values
     */
    public ProductProjectionPagedSearchResponse buildUnchecked() {
        return new ProductProjectionPagedSearchResponseImpl(limit, count, total, offset, results, facets);
    }

    public static ProductProjectionPagedSearchResponseBuilder of() {
        return new ProductProjectionPagedSearchResponseBuilder();
    }

    public static ProductProjectionPagedSearchResponseBuilder of(final ProductProjectionPagedSearchResponse template) {
        ProductProjectionPagedSearchResponseBuilder builder = new ProductProjectionPagedSearchResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        builder.facets = template.getFacets();
        return builder;
    }

}
