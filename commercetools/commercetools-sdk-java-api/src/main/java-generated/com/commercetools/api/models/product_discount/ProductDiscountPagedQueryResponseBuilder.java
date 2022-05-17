
package com.commercetools.api.models.product_discount;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductDiscountPagedQueryResponseBuilder implements Builder<ProductDiscountPagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.product_discount.ProductDiscount> results;

    public ProductDiscountPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    public ProductDiscountPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
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

    public ProductDiscountPagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.product_discount.ProductDiscount... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    public ProductDiscountPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.product_discount.ProductDiscountBuilder, com.commercetools.api.models.product_discount.ProductDiscountBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results
                .add(builder.apply(com.commercetools.api.models.product_discount.ProductDiscountBuilder.of()).build());
        return this;
    }

    public ProductDiscountPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.product_discount.ProductDiscountBuilder, com.commercetools.api.models.product_discount.ProductDiscountBuilder> builder) {
        this.results = new ArrayList<>();
        this.results
                .add(builder.apply(com.commercetools.api.models.product_discount.ProductDiscountBuilder.of()).build());
        return this;
    }

    public Long getLimit() {
        return this.limit;
    }

    public Long getOffset() {
        return this.offset;
    }

    public Long getCount() {
        return this.count;
    }

    @Nullable
    public Long getTotal() {
        return this.total;
    }

    public java.util.List<com.commercetools.api.models.product_discount.ProductDiscount> getResults() {
        return this.results;
    }

    public ProductDiscountPagedQueryResponse build() {
        Objects.requireNonNull(limit, ProductDiscountPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, ProductDiscountPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, ProductDiscountPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, ProductDiscountPagedQueryResponse.class + ": results is missing");
        return new ProductDiscountPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds ProductDiscountPagedQueryResponse without checking for non null required values
     */
    public ProductDiscountPagedQueryResponse buildUnchecked() {
        return new ProductDiscountPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    public static ProductDiscountPagedQueryResponseBuilder of() {
        return new ProductDiscountPagedQueryResponseBuilder();
    }

    public static ProductDiscountPagedQueryResponseBuilder of(final ProductDiscountPagedQueryResponse template) {
        ProductDiscountPagedQueryResponseBuilder builder = new ProductDiscountPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
