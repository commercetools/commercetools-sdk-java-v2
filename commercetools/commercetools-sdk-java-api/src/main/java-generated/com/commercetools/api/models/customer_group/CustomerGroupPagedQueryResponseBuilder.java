
package com.commercetools.api.models.customer_group;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerGroupPagedQueryResponseBuilder implements Builder<CustomerGroupPagedQueryResponse> {

    private Long offset;

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.customer_group.CustomerGroup> results;

    public CustomerGroupPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public CustomerGroupPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    public CustomerGroupPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public CustomerGroupPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    public CustomerGroupPagedQueryResponseBuilder results(
            final com.commercetools.api.models.customer_group.CustomerGroup... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public CustomerGroupPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.customer_group.CustomerGroupBuilder, com.commercetools.api.models.customer_group.CustomerGroupBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.customer_group.CustomerGroupBuilder.of()).build());
        return this;
    }

    public CustomerGroupPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.customer_group.CustomerGroupBuilder, com.commercetools.api.models.customer_group.CustomerGroupBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.customer_group.CustomerGroupBuilder.of()).build());
        return this;
    }

    public CustomerGroupPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.customer_group.CustomerGroup> results) {
        this.results = results;
        return this;
    }

    public Long getOffset() {
        return this.offset;
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

    public java.util.List<com.commercetools.api.models.customer_group.CustomerGroup> getResults() {
        return this.results;
    }

    public CustomerGroupPagedQueryResponse build() {
        Objects.requireNonNull(offset, CustomerGroupPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(limit, CustomerGroupPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(count, CustomerGroupPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, CustomerGroupPagedQueryResponse.class + ": results is missing");
        return new CustomerGroupPagedQueryResponseImpl(offset, limit, count, total, results);
    }

    /**
     * builds CustomerGroupPagedQueryResponse without checking for non null required values
     */
    public CustomerGroupPagedQueryResponse buildUnchecked() {
        return new CustomerGroupPagedQueryResponseImpl(offset, limit, count, total, results);
    }

    public static CustomerGroupPagedQueryResponseBuilder of() {
        return new CustomerGroupPagedQueryResponseBuilder();
    }

    public static CustomerGroupPagedQueryResponseBuilder of(final CustomerGroupPagedQueryResponse template) {
        CustomerGroupPagedQueryResponseBuilder builder = new CustomerGroupPagedQueryResponseBuilder();
        builder.offset = template.getOffset();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
