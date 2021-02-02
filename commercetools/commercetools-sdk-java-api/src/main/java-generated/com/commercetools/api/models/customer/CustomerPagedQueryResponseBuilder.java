
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerPagedQueryResponseBuilder {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.customer.Customer> results;

    public CustomerPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    public CustomerPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public CustomerPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    public CustomerPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public CustomerPagedQueryResponseBuilder results(final com.commercetools.api.models.customer.Customer... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public CustomerPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.customer.Customer> results) {
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

    public java.util.List<com.commercetools.api.models.customer.Customer> getResults() {
        return this.results;
    }

    public CustomerPagedQueryResponse build() {
        return new CustomerPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    public static CustomerPagedQueryResponseBuilder of() {
        return new CustomerPagedQueryResponseBuilder();
    }

    public static CustomerPagedQueryResponseBuilder of(final CustomerPagedQueryResponse template) {
        CustomerPagedQueryResponseBuilder builder = new CustomerPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
