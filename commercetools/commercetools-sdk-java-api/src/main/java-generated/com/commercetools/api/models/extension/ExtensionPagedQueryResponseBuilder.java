
package com.commercetools.api.models.extension;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ExtensionPagedQueryResponseBuilder {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.extension.Extension> results;

    public ExtensionPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    public ExtensionPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public ExtensionPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    public ExtensionPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public ExtensionPagedQueryResponseBuilder results(
            final com.commercetools.api.models.extension.Extension... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public ExtensionPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.extension.Extension> results) {
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

    public java.util.List<com.commercetools.api.models.extension.Extension> getResults() {
        return this.results;
    }

    public ExtensionPagedQueryResponse build() {
        return new ExtensionPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    public static ExtensionPagedQueryResponseBuilder of() {
        return new ExtensionPagedQueryResponseBuilder();
    }

    public static ExtensionPagedQueryResponseBuilder of(final ExtensionPagedQueryResponse template) {
        ExtensionPagedQueryResponseBuilder builder = new ExtensionPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
