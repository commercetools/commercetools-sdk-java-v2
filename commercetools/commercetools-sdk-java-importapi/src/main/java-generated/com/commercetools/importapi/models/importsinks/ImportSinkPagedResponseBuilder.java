
package com.commercetools.importapi.models.importsinks;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ImportSinkPagedResponseBuilder {

    private Integer limit;

    private Long offset;

    private Long count;

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

    public Integer getLimit() {
        return this.limit;
    }

    public Long getOffset() {
        return this.offset;
    }

    public Long getCount() {
        return this.count;
    }

    public java.util.List<com.commercetools.importapi.models.importsinks.ImportSink> getResults() {
        return this.results;
    }

    public ImportSinkPagedResponse build() {
        return new ImportSinkPagedResponseImpl(limit, offset, count, results);
    }

    public static ImportSinkPagedResponseBuilder of() {
        return new ImportSinkPagedResponseBuilder();
    }

    public static ImportSinkPagedResponseBuilder of(final ImportSinkPagedResponse template) {
        ImportSinkPagedResponseBuilder builder = new ImportSinkPagedResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.results = template.getResults();
        return builder;
    }

}
