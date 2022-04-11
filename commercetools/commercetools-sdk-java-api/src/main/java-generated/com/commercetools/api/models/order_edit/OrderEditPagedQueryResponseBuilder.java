
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderEditPagedQueryResponseBuilder implements Builder<OrderEditPagedQueryResponse> {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.order_edit.OrderEdit> results;

    public OrderEditPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    public OrderEditPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public OrderEditPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    public OrderEditPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public OrderEditPagedQueryResponseBuilder results(
            final com.commercetools.api.models.order_edit.OrderEdit... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public OrderEditPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.order_edit.OrderEdit> results) {
        this.results = results;
        return this;
    }

    public OrderEditPagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.order_edit.OrderEdit... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    public OrderEditPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.order_edit.OrderEditBuilder, com.commercetools.api.models.order_edit.OrderEditBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.order_edit.OrderEditBuilder.of()).build());
        return this;
    }

    public OrderEditPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.order_edit.OrderEditBuilder, com.commercetools.api.models.order_edit.OrderEditBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.order_edit.OrderEditBuilder.of()).build());
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

    public java.util.List<com.commercetools.api.models.order_edit.OrderEdit> getResults() {
        return this.results;
    }

    public OrderEditPagedQueryResponse build() {
        Objects.requireNonNull(limit, OrderEditPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(count, OrderEditPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(offset, OrderEditPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(results, OrderEditPagedQueryResponse.class + ": results is missing");
        return new OrderEditPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    /**
     * builds OrderEditPagedQueryResponse without checking for non null required values
     */
    public OrderEditPagedQueryResponse buildUnchecked() {
        return new OrderEditPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    public static OrderEditPagedQueryResponseBuilder of() {
        return new OrderEditPagedQueryResponseBuilder();
    }

    public static OrderEditPagedQueryResponseBuilder of(final OrderEditPagedQueryResponse template) {
        OrderEditPagedQueryResponseBuilder builder = new OrderEditPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
