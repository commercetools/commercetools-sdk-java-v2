
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RecordPagedQueryResponseBuilder {

    private Integer limit;

    private Integer count;

    private Integer total;

    private Integer offset;

    private java.util.List<com.commercetools.history.models.Record> results;

    public RecordPagedQueryResponseBuilder limit(final Integer limit) {
        this.limit = limit;
        return this;
    }

    public RecordPagedQueryResponseBuilder count(final Integer count) {
        this.count = count;
        return this;
    }

    public RecordPagedQueryResponseBuilder total(final Integer total) {
        this.total = total;
        return this;
    }

    public RecordPagedQueryResponseBuilder offset(final Integer offset) {
        this.offset = offset;
        return this;
    }

    public RecordPagedQueryResponseBuilder results(final com.commercetools.history.models.Record... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public RecordPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.history.models.Record> results) {
        this.results = results;
        return this;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public Integer getCount() {
        return this.count;
    }

    public Integer getTotal() {
        return this.total;
    }

    public Integer getOffset() {
        return this.offset;
    }

    public java.util.List<com.commercetools.history.models.Record> getResults() {
        return this.results;
    }

    public RecordPagedQueryResponse build() {
        return new RecordPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    public static RecordPagedQueryResponseBuilder of() {
        return new RecordPagedQueryResponseBuilder();
    }

    public static RecordPagedQueryResponseBuilder of(final RecordPagedQueryResponse template) {
        RecordPagedQueryResponseBuilder builder = new RecordPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
