
package com.commercetools.history.models.change_history;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class RecordPagedQueryResponseBuilder implements Builder<RecordPagedQueryResponse> {

    private Integer limit;

    private Integer count;

    private Integer total;

    private Integer offset;

    private java.util.List<com.commercetools.history.models.change_history.Record> results;

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

    public RecordPagedQueryResponseBuilder results(
            final com.commercetools.history.models.change_history.Record... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public RecordPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.history.models.change_history.Record> results) {
        this.results = results;
        return this;
    }

    public RecordPagedQueryResponseBuilder plusResults(
            final com.commercetools.history.models.change_history.Record... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    public RecordPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.history.models.change_history.RecordBuilder, com.commercetools.history.models.change_history.RecordBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.history.models.change_history.RecordBuilder.of()).build());
        return this;
    }

    public RecordPagedQueryResponseBuilder withResults(
            Function<com.commercetools.history.models.change_history.RecordBuilder, com.commercetools.history.models.change_history.RecordBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.history.models.change_history.RecordBuilder.of()).build());
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

    public java.util.List<com.commercetools.history.models.change_history.Record> getResults() {
        return this.results;
    }

    public RecordPagedQueryResponse build() {
        Objects.requireNonNull(limit, RecordPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(count, RecordPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(total, RecordPagedQueryResponse.class + ": total is missing");
        Objects.requireNonNull(offset, RecordPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(results, RecordPagedQueryResponse.class + ": results is missing");
        return new RecordPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    /**
     * builds RecordPagedQueryResponse without checking for non null required values
     */
    public RecordPagedQueryResponse buildUnchecked() {
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
