
package com.commercetools.api.models.cart_discount;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartDiscountPagedQueryResponseBuilder {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.cart_discount.CartDiscount> results;

    public CartDiscountPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    public CartDiscountPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public CartDiscountPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    public CartDiscountPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public CartDiscountPagedQueryResponseBuilder results(
            final com.commercetools.api.models.cart_discount.CartDiscount... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public CartDiscountPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.cart_discount.CartDiscount> results) {
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

    public java.util.List<com.commercetools.api.models.cart_discount.CartDiscount> getResults() {
        return this.results;
    }

    public CartDiscountPagedQueryResponse build() {
        return new CartDiscountPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    public static CartDiscountPagedQueryResponseBuilder of() {
        return new CartDiscountPagedQueryResponseBuilder();
    }

    public static CartDiscountPagedQueryResponseBuilder of(final CartDiscountPagedQueryResponse template) {
        CartDiscountPagedQueryResponseBuilder builder = new CartDiscountPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
