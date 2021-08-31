
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductPagedQueryResponseBuilder implements Builder<ProductPagedQueryResponse> {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.product.Product> results;

    public ProductPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    public ProductPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public ProductPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    public ProductPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public ProductPagedQueryResponseBuilder results(final com.commercetools.api.models.product.Product... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public ProductPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.product.ProductBuilder, com.commercetools.api.models.product.ProductBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.product.ProductBuilder.of()).build());
        return this;
    }

    public ProductPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.product.ProductBuilder, com.commercetools.api.models.product.ProductBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.product.ProductBuilder.of()).build());
        return this;
    }

    public ProductPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.product.Product> results) {
        this.results = results;
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

    public java.util.List<com.commercetools.api.models.product.Product> getResults() {
        return this.results;
    }

    public ProductPagedQueryResponse build() {
        Objects.requireNonNull(limit, ProductPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(count, ProductPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(offset, ProductPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(results, ProductPagedQueryResponse.class + ": results is missing");
        return new ProductPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    /**
     * builds ProductPagedQueryResponse without checking for non null required values
     */
    public ProductPagedQueryResponse buildUnchecked() {
        return new ProductPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    public static ProductPagedQueryResponseBuilder of() {
        return new ProductPagedQueryResponseBuilder();
    }

    public static ProductPagedQueryResponseBuilder of(final ProductPagedQueryResponse template) {
        ProductPagedQueryResponseBuilder builder = new ProductPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
