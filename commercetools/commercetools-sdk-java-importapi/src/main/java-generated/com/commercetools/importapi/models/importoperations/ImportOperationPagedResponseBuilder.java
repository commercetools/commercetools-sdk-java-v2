
package com.commercetools.importapi.models.importoperations;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ImportOperationPagedResponseBuilder {

    private Integer limit;

    private Long offset;

    private Long count;

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

    public ImportOperationPagedResponseBuilder results(
            final com.commercetools.importapi.models.importoperations.ImportOperation... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
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

    public java.util.List<com.commercetools.importapi.models.importoperations.ImportOperation> getResults() {
        return this.results;
    }

    public ImportOperationPagedResponse build() {
        return new ImportOperationPagedResponseImpl(limit, offset, count, results);
    }

    public static ImportOperationPagedResponseBuilder of() {
        return new ImportOperationPagedResponseBuilder();
    }

    public static ImportOperationPagedResponseBuilder of(final ImportOperationPagedResponse template) {
        ImportOperationPagedResponseBuilder builder = new ImportOperationPagedResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.results = template.getResults();
        return builder;
    }

}
