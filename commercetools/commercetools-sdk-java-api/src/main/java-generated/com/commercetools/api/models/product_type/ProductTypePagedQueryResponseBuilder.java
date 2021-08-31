
package com.commercetools.api.models.product_type;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductTypePagedQueryResponseBuilder implements Builder<ProductTypePagedQueryResponse> {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.product_type.ProductType> results;

    public ProductTypePagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    public ProductTypePagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public ProductTypePagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    public ProductTypePagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public ProductTypePagedQueryResponseBuilder results(
            final com.commercetools.api.models.product_type.ProductType... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public ProductTypePagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.product_type.ProductTypeBuilder, com.commercetools.api.models.product_type.ProductTypeBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.product_type.ProductTypeBuilder.of()).build());
        return this;
    }

    public ProductTypePagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.product_type.ProductTypeBuilder, com.commercetools.api.models.product_type.ProductTypeBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.product_type.ProductTypeBuilder.of()).build());
        return this;
    }

    public ProductTypePagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.product_type.ProductType> results) {
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

    public java.util.List<com.commercetools.api.models.product_type.ProductType> getResults() {
        return this.results;
    }

    public ProductTypePagedQueryResponse build() {
        Objects.requireNonNull(limit, ProductTypePagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(count, ProductTypePagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(offset, ProductTypePagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(results, ProductTypePagedQueryResponse.class + ": results is missing");
        return new ProductTypePagedQueryResponseImpl(limit, count, total, offset, results);
    }

    /**
     * builds ProductTypePagedQueryResponse without checking for non null required values
     */
    public ProductTypePagedQueryResponse buildUnchecked() {
        return new ProductTypePagedQueryResponseImpl(limit, count, total, offset, results);
    }

    public static ProductTypePagedQueryResponseBuilder of() {
        return new ProductTypePagedQueryResponseBuilder();
    }

    public static ProductTypePagedQueryResponseBuilder of(final ProductTypePagedQueryResponse template) {
        ProductTypePagedQueryResponseBuilder builder = new ProductTypePagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
