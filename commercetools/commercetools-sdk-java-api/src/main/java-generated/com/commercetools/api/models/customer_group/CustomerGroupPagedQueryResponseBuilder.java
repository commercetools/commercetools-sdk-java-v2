
package com.commercetools.api.models.customer_group;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerGroupPagedQueryResponseBuilder {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.customer_group.CustomerGroup> results;

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

    public CustomerGroupPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public CustomerGroupPagedQueryResponseBuilder results(
            final com.commercetools.api.models.customer_group.CustomerGroup... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public CustomerGroupPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.customer_group.CustomerGroup> results) {
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

    public java.util.List<com.commercetools.api.models.customer_group.CustomerGroup> getResults() {
        return this.results;
    }

    public CustomerGroupPagedQueryResponse build() {
        return new CustomerGroupPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    public static CustomerGroupPagedQueryResponseBuilder of() {
        return new CustomerGroupPagedQueryResponseBuilder();
    }

    public static CustomerGroupPagedQueryResponseBuilder of(final CustomerGroupPagedQueryResponse template) {
        CustomerGroupPagedQueryResponseBuilder builder = new CustomerGroupPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
