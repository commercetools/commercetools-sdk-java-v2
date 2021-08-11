
package com.commercetools.api.models.type;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TypePagedQueryResponseBuilder implements Builder<TypePagedQueryResponse> {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.type.Type> results;

    public TypePagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    public TypePagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public TypePagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    public TypePagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public TypePagedQueryResponseBuilder results(final com.commercetools.api.models.type.Type... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public TypePagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.type.TypeBuilder, com.commercetools.api.models.type.TypeBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.type.TypeBuilder.of()).build());
        return this;
    }

    public TypePagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.type.TypeBuilder, com.commercetools.api.models.type.TypeBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.type.TypeBuilder.of()).build());
        return this;
    }

    public TypePagedQueryResponseBuilder results(final java.util.List<com.commercetools.api.models.type.Type> results) {
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

    public java.util.List<com.commercetools.api.models.type.Type> getResults() {
        return this.results;
    }

    public TypePagedQueryResponse build() {
        Objects.requireNonNull(limit, TypePagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(count, TypePagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(offset, TypePagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(results, TypePagedQueryResponse.class + ": results is missing");
        return new TypePagedQueryResponseImpl(limit, count, total, offset, results);
    }

    /**
     * builds TypePagedQueryResponse without checking for non null required values
     */
    public TypePagedQueryResponse buildUnchecked() {
        return new TypePagedQueryResponseImpl(limit, count, total, offset, results);
    }

    public static TypePagedQueryResponseBuilder of() {
        return new TypePagedQueryResponseBuilder();
    }

    public static TypePagedQueryResponseBuilder of(final TypePagedQueryResponse template) {
        TypePagedQueryResponseBuilder builder = new TypePagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
