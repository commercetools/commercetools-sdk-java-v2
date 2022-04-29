
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductProjectionPagedQueryResponseBuilder implements Builder<ProductProjectionPagedQueryResponse> {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.product.ProductProjection> results;

    public ProductProjectionPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    public ProductProjectionPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public ProductProjectionPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    public ProductProjectionPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public ProductProjectionPagedQueryResponseBuilder results(
            final com.commercetools.api.models.product.ProductProjection... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public ProductProjectionPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.product.ProductProjection> results) {
        this.results = results;
        return this;
    }

    public ProductProjectionPagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.product.ProductProjection... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    public ProductProjectionPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.product.ProductProjectionBuilder, com.commercetools.api.models.product.ProductProjectionBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.product.ProductProjectionBuilder.of()).build());
        return this;
    }

    public ProductProjectionPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.product.ProductProjectionBuilder, com.commercetools.api.models.product.ProductProjectionBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.product.ProductProjectionBuilder.of()).build());
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

    public ProductProjectionPagedQueryResponse build() {
        Objects.requireNonNull(limit, ProductProjectionPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(count, ProductProjectionPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(offset, ProductProjectionPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(results, ProductProjectionPagedQueryResponse.class + ": results is missing");
        return new ProductProjectionPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    /**
     * builds ProductProjectionPagedQueryResponse without checking for non null required values
     */
    public ProductProjectionPagedQueryResponse buildUnchecked() {
        return new ProductProjectionPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    public static ProductProjectionPagedQueryResponseBuilder of() {
        return new ProductProjectionPagedQueryResponseBuilder();
    }

    public static ProductProjectionPagedQueryResponseBuilder of(final ProductProjectionPagedQueryResponse template) {
        ProductProjectionPagedQueryResponseBuilder builder = new ProductProjectionPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
