
package com.commercetools.api.models.api_client;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ApiClientPagedQueryResponseBuilder implements Builder<ApiClientPagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.api_client.ApiClient> results;

    public ApiClientPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    public ApiClientPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public ApiClientPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public ApiClientPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    public ApiClientPagedQueryResponseBuilder results(
            final com.commercetools.api.models.api_client.ApiClient... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public ApiClientPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.api_client.ApiClient> results) {
        this.results = results;
        return this;
    }

    public ApiClientPagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.api_client.ApiClient... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    public ApiClientPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.api_client.ApiClientBuilder, com.commercetools.api.models.api_client.ApiClientBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.api_client.ApiClientBuilder.of()).build());
        return this;
    }

    public ApiClientPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.api_client.ApiClientBuilder, com.commercetools.api.models.api_client.ApiClientBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.api_client.ApiClientBuilder.of()).build());
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

    public java.util.List<com.commercetools.api.models.api_client.ApiClient> getResults() {
        return this.results;
    }

    public ApiClientPagedQueryResponse build() {
        Objects.requireNonNull(limit, ApiClientPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, ApiClientPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, ApiClientPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, ApiClientPagedQueryResponse.class + ": results is missing");
        return new ApiClientPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds ApiClientPagedQueryResponse without checking for non null required values
     */
    public ApiClientPagedQueryResponse buildUnchecked() {
        return new ApiClientPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    public static ApiClientPagedQueryResponseBuilder of() {
        return new ApiClientPagedQueryResponseBuilder();
    }

    public static ApiClientPagedQueryResponseBuilder of(final ApiClientPagedQueryResponse template) {
        ApiClientPagedQueryResponseBuilder builder = new ApiClientPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
