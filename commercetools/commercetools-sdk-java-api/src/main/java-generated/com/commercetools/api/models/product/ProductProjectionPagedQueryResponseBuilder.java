
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductProjectionPagedQueryResponseBuilder implements Builder<ProductProjectionPagedQueryResponse> {

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
        Objects.requireNonNull(limit);
        Objects.requireNonNull(count);
        Objects.requireNonNull(offset);
        Objects.requireNonNull(results);
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
