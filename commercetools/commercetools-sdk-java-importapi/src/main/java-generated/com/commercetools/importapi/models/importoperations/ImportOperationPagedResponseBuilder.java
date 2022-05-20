
package com.commercetools.importapi.models.importoperations;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ImportOperationPagedResponseBuilder implements Builder<ImportOperationPagedResponse> {

    private Integer limit;

    private Long offset;

    private Long count;

    private Long total;

    private java.util.List<com.commercetools.importapi.models.importoperations.ImportOperation> results;

    /**
    *  <p>Number of results requested.</p>
    */

    public ImportOperationPagedResponseBuilder limit(final Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
    *  <p>Number of elements skipped.</p>
    */

    public ImportOperationPagedResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
    *  <p>The actual number of results returned.</p>
    */

    public ImportOperationPagedResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
    *  <p>The total number of import operations matching the query.</p>
    */

    public ImportOperationPagedResponseBuilder total(final Long total) {
        this.total = total;
        return this;
    }

    /**
    *  <p>The array of Import Operations matching the query.</p>
    */

    public ImportOperationPagedResponseBuilder results(
            final com.commercetools.importapi.models.importoperations.ImportOperation... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
    *  <p>The array of Import Operations matching the query.</p>
    */

    public ImportOperationPagedResponseBuilder results(
            final java.util.List<com.commercetools.importapi.models.importoperations.ImportOperation> results) {
        this.results = results;
        return this;
    }

    /**
    *  <p>The array of Import Operations matching the query.</p>
    */

    public ImportOperationPagedResponseBuilder plusResults(
            final com.commercetools.importapi.models.importoperations.ImportOperation... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
    *  <p>The array of Import Operations matching the query.</p>
    */

    public ImportOperationPagedResponseBuilder plusResults(
            Function<com.commercetools.importapi.models.importoperations.ImportOperationBuilder, com.commercetools.importapi.models.importoperations.ImportOperationBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(
            builder.apply(com.commercetools.importapi.models.importoperations.ImportOperationBuilder.of()).build());
        return this;
    }

    /**
    *  <p>The array of Import Operations matching the query.</p>
    */

    public ImportOperationPagedResponseBuilder withResults(
            Function<com.commercetools.importapi.models.importoperations.ImportOperationBuilder, com.commercetools.importapi.models.importoperations.ImportOperationBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(
            builder.apply(com.commercetools.importapi.models.importoperations.ImportOperationBuilder.of()).build());
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
