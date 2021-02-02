
package com.commercetools.api.models.product_discount;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductDiscountPagedQueryResponseBuilder {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.product_discount.ProductDiscount> results;

    public ProductDiscountPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    public ProductDiscountPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public ProductDiscountPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    public ProductDiscountPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public ProductDiscountPagedQueryResponseBuilder results(
            final com.commercetools.api.models.product_discount.ProductDiscount... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public ProductDiscountPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.product_discount.ProductDiscount> results) {
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

    public java.util.List<com.commercetools.api.models.product_discount.ProductDiscount> getResults() {
        return this.results;
    }

    public ProductDiscountPagedQueryResponse build() {
        return new ProductDiscountPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    public static ProductDiscountPagedQueryResponseBuilder of() {
        return new ProductDiscountPagedQueryResponseBuilder();
    }

    public static ProductDiscountPagedQueryResponseBuilder of(final ProductDiscountPagedQueryResponse template) {
        ProductDiscountPagedQueryResponseBuilder builder = new ProductDiscountPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
