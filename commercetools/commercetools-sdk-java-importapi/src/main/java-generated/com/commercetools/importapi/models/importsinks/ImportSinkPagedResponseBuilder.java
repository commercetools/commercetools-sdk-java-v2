
package com.commercetools.importapi.models.importsinks;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ImportSinkPagedResponseBuilder implements Builder<ImportSinkPagedResponse> {

    private Integer limit;

    private Long offset;

    private Long count;

    private Long total;

    private java.util.List<com.commercetools.importapi.models.importsinks.ImportSink> results;

    public ImportSinkPagedResponseBuilder limit(final Integer limit) {
        this.limit = limit;
        return this;
    }

    public ImportSinkPagedResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public ImportSinkPagedResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public ImportSinkPagedResponseBuilder total(final Long total) {
        this.total = total;
        return this;
    }

    public ImportSinkPagedResponseBuilder results(
            final com.commercetools.importapi.models.importsinks.ImportSink... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public ImportSinkPagedResponseBuilder results(
            final java.util.List<com.commercetools.importapi.models.importsinks.ImportSink> results) {
        this.results = results;
        return this;
    }

    public ImportSinkPagedResponseBuilder plusResults(
            final com.commercetools.importapi.models.importsinks.ImportSink... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    public ImportSinkPagedResponseBuilder plusResults(
            Function<com.commercetools.importapi.models.importsinks.ImportSinkBuilder, com.commercetools.importapi.models.importsinks.ImportSinkBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.importapi.models.importsinks.ImportSinkBuilder.of()).build());
        return this;
    }

    public ImportSinkPagedResponseBuilder withResults(
            Function<com.commercetools.importapi.models.importsinks.ImportSinkBuilder, com.commercetools.importapi.models.importsinks.ImportSinkBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.importapi.models.importsinks.ImportSinkBuilder.of()).build());
        return this;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public Long getOffset() {
        return this.offset;
    }

    public Long getCount() {
        return this.count;
    }

    public Long getTotal() {
        return this.total;
    }

    public java.util.List<com.commercetools.importapi.models.importsinks.ImportSink> getResults() {
        return this.results;
    }

    public ImportSinkPagedResponse build() {
        Objects.requireNonNull(limit, ImportSinkPagedResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, ImportSinkPagedResponse.class + ": offset is missing");
        Objects.requireNonNull(count, ImportSinkPagedResponse.class + ": count is missing");
        Objects.requireNonNull(total, ImportSinkPagedResponse.class + ": total is missing");
        Objects.requireNonNull(results, ImportSinkPagedResponse.class + ": results is missing");
        return new ImportSinkPagedResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds ImportSinkPagedResponse without checking for non null required values
     */
    public ImportSinkPagedResponse buildUnchecked() {
        return new ImportSinkPagedResponseImpl(limit, offset, count, total, results);
    }

    public static ImportSinkPagedResponseBuilder of() {
        return new ImportSinkPagedResponseBuilder();
    }

    public static ImportSinkPagedResponseBuilder of(final ImportSinkPagedResponse template) {
        ImportSinkPagedResponseBuilder builder = new ImportSinkPagedResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
