
package com.commercetools.importapi.models.importoperations;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ImportOperationPagedResponseBuilder implements Builder<ImportOperationPagedResponse> {

    private Integer limit;

    private Long offset;

    private Long count;

    private Long total;

    private java.util.List<com.commercetools.importapi.models.importoperations.ImportOperation> results;

    public ImportOperationPagedResponseBuilder limit(final Integer limit) {
        this.limit = limit;
        return this;
    }

    public ImportOperationPagedResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public ImportOperationPagedResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public ImportOperationPagedResponseBuilder total(final Long total) {
        this.total = total;
        return this;
    }

    public ImportOperationPagedResponseBuilder results(
            final com.commercetools.importapi.models.importoperations.ImportOperation... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public ImportOperationPagedResponseBuilder withResults(
            Function<com.commercetools.importapi.models.importoperations.ImportOperationBuilder, com.commercetools.importapi.models.importoperations.ImportOperationBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(
            builder.apply(com.commercetools.importapi.models.importoperations.ImportOperationBuilder.of()).build());
        return this;
    }

    public ImportOperationPagedResponseBuilder plusResults(
            Function<com.commercetools.importapi.models.importoperations.ImportOperationBuilder, com.commercetools.importapi.models.importoperations.ImportOperationBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(
            builder.apply(com.commercetools.importapi.models.importoperations.ImportOperationBuilder.of()).build());
        return this;
    }

    public ImportOperationPagedResponseBuilder results(
            final java.util.List<com.commercetools.importapi.models.importoperations.ImportOperation> results) {
        this.results = results;
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

    public java.util.List<com.commercetools.importapi.models.importoperations.ImportOperation> getResults() {
        return this.results;
    }

    public ImportOperationPagedResponse build() {
        Objects.requireNonNull(limit, ImportOperationPagedResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, ImportOperationPagedResponse.class + ": offset is missing");
        Objects.requireNonNull(count, ImportOperationPagedResponse.class + ": count is missing");
        Objects.requireNonNull(total, ImportOperationPagedResponse.class + ": total is missing");
        Objects.requireNonNull(results, ImportOperationPagedResponse.class + ": results is missing");
        return new ImportOperationPagedResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds ImportOperationPagedResponse without checking for non null required values
     */
    public ImportOperationPagedResponse buildUnchecked() {
        return new ImportOperationPagedResponseImpl(limit, offset, count, total, results);
    }

    public static ImportOperationPagedResponseBuilder of() {
        return new ImportOperationPagedResponseBuilder();
    }

    public static ImportOperationPagedResponseBuilder of(final ImportOperationPagedResponse template) {
        ImportOperationPagedResponseBuilder builder = new ImportOperationPagedResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
