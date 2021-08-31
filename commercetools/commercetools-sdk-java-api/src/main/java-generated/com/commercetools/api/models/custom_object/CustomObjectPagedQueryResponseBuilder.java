
package com.commercetools.api.models.custom_object;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomObjectPagedQueryResponseBuilder implements Builder<CustomObjectPagedQueryResponse> {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.custom_object.CustomObject> results;

    public CustomObjectPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    public CustomObjectPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public CustomObjectPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    public CustomObjectPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public CustomObjectPagedQueryResponseBuilder results(
            final com.commercetools.api.models.custom_object.CustomObject... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public CustomObjectPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.custom_object.CustomObjectBuilder, com.commercetools.api.models.custom_object.CustomObjectBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.custom_object.CustomObjectBuilder.of()).build());
        return this;
    }

    public CustomObjectPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.custom_object.CustomObjectBuilder, com.commercetools.api.models.custom_object.CustomObjectBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.custom_object.CustomObjectBuilder.of()).build());
        return this;
    }

    public CustomObjectPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.custom_object.CustomObject> results) {
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

    public java.util.List<com.commercetools.api.models.custom_object.CustomObject> getResults() {
        return this.results;
    }

    public CustomObjectPagedQueryResponse build() {
        Objects.requireNonNull(limit, CustomObjectPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(count, CustomObjectPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(offset, CustomObjectPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(results, CustomObjectPagedQueryResponse.class + ": results is missing");
        return new CustomObjectPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    /**
     * builds CustomObjectPagedQueryResponse without checking for non null required values
     */
    public CustomObjectPagedQueryResponse buildUnchecked() {
        return new CustomObjectPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    public static CustomObjectPagedQueryResponseBuilder of() {
        return new CustomObjectPagedQueryResponseBuilder();
    }

    public static CustomObjectPagedQueryResponseBuilder of(final CustomObjectPagedQueryResponse template) {
        CustomObjectPagedQueryResponseBuilder builder = new CustomObjectPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
