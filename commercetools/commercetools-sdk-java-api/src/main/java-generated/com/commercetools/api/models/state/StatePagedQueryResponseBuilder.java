
package com.commercetools.api.models.state;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StatePagedQueryResponseBuilder implements Builder<StatePagedQueryResponse> {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.state.State> results;

    public StatePagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    public StatePagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public StatePagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    public StatePagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public StatePagedQueryResponseBuilder results(final com.commercetools.api.models.state.State... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public StatePagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.state.StateBuilder, com.commercetools.api.models.state.StateBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.state.StateBuilder.of()).build());
        return this;
    }

    public StatePagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.state.StateBuilder, com.commercetools.api.models.state.StateBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.state.StateBuilder.of()).build());
        return this;
    }

    public StatePagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.state.State> results) {
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

    public java.util.List<com.commercetools.api.models.state.State> getResults() {
        return this.results;
    }

    public StatePagedQueryResponse build() {
        Objects.requireNonNull(limit, StatePagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(count, StatePagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(offset, StatePagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(results, StatePagedQueryResponse.class + ": results is missing");
        return new StatePagedQueryResponseImpl(limit, count, total, offset, results);
    }

    /**
     * builds StatePagedQueryResponse without checking for non null required values
     */
    public StatePagedQueryResponse buildUnchecked() {
        return new StatePagedQueryResponseImpl(limit, count, total, offset, results);
    }

    public static StatePagedQueryResponseBuilder of() {
        return new StatePagedQueryResponseBuilder();
    }

    public static StatePagedQueryResponseBuilder of(final StatePagedQueryResponse template) {
        StatePagedQueryResponseBuilder builder = new StatePagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
