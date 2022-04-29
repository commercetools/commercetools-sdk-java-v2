
package com.commercetools.api.models.extension;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ExtensionPagedQueryResponseBuilder implements Builder<ExtensionPagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.extension.Extension> results;

    public ExtensionPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    public ExtensionPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
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

    public ExtensionPagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.extension.Extension... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    public ExtensionPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.extension.ExtensionBuilder, com.commercetools.api.models.extension.ExtensionBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.extension.ExtensionBuilder.of()).build());
        return this;
    }

    public ExtensionPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.extension.ExtensionBuilder, com.commercetools.api.models.extension.ExtensionBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.extension.ExtensionBuilder.of()).build());
        return this;
    }

    public Long getLimit() {
        return this.limit;
    }

    public Long getOffset() {
        return this.offset;
    }

    public Long getCount() {
        return this.count;
    }

    @Nullable
    public Long getTotal() {
        return this.total;
    }

    public java.util.List<com.commercetools.api.models.extension.Extension> getResults() {
        return this.results;
    }

    public ExtensionPagedQueryResponse build() {
        Objects.requireNonNull(limit, ExtensionPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, ExtensionPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, ExtensionPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, ExtensionPagedQueryResponse.class + ": results is missing");
        return new ExtensionPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds ExtensionPagedQueryResponse without checking for non null required values
     */
    public ExtensionPagedQueryResponse buildUnchecked() {
        return new ExtensionPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    public static ExtensionPagedQueryResponseBuilder of() {
        return new ExtensionPagedQueryResponseBuilder();
    }

    public static ExtensionPagedQueryResponseBuilder of(final ExtensionPagedQueryResponse template) {
        ExtensionPagedQueryResponseBuilder builder = new ExtensionPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
