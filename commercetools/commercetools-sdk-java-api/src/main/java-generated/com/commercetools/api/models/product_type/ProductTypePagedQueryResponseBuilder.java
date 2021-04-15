
package com.commercetools.api.models.product_type;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductTypePagedQueryResponseBuilder {

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
