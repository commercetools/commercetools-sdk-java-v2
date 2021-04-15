
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderPagedQueryResponseBuilder {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.order.Order> results;

    public OrderPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    public OrderPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public OrderPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    public OrderPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public OrderPagedQueryResponseBuilder results(final com.commercetools.api.models.order.Order... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public OrderPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.order.Order> results) {
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

    public java.util.List<com.commercetools.api.models.order.Order> getResults() {
        return this.results;
    }

    public OrderPagedQueryResponse build() {
        return new OrderPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    public static OrderPagedQueryResponseBuilder of() {
        return new OrderPagedQueryResponseBuilder();
    }

    public static OrderPagedQueryResponseBuilder of(final OrderPagedQueryResponse template) {
        OrderPagedQueryResponseBuilder builder = new OrderPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
