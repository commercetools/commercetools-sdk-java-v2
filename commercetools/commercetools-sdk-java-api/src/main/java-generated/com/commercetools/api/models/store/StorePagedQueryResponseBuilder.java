
package com.commercetools.api.models.store;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StorePagedQueryResponseBuilder {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.store.Store> results;

    public StorePagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    public StorePagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public StorePagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    public StorePagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public StorePagedQueryResponseBuilder results(final com.commercetools.api.models.store.Store... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public StorePagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.store.Store> results) {
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

    public java.util.List<com.commercetools.api.models.store.Store> getResults() {
        return this.results;
    }

    public StorePagedQueryResponse build() {
        return new StorePagedQueryResponseImpl(limit, count, total, offset, results);
    }

    public static StorePagedQueryResponseBuilder of() {
        return new StorePagedQueryResponseBuilder();
    }

    public static StorePagedQueryResponseBuilder of(final StorePagedQueryResponse template) {
        StorePagedQueryResponseBuilder builder = new StorePagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
