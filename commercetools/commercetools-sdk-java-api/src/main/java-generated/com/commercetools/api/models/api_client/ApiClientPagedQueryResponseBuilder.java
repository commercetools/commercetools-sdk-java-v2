
package com.commercetools.api.models.api_client;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ApiClientPagedQueryResponseBuilder {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.api_client.ApiClient> results;

    public ApiClientPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
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

    public ApiClientPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
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

    public java.util.List<com.commercetools.api.models.api_client.ApiClient> getResults() {
        return this.results;
    }

    public ApiClientPagedQueryResponse build() {
        return new ApiClientPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    public static ApiClientPagedQueryResponseBuilder of() {
        return new ApiClientPagedQueryResponseBuilder();
    }

    public static ApiClientPagedQueryResponseBuilder of(final ApiClientPagedQueryResponse template) {
        ApiClientPagedQueryResponseBuilder builder = new ApiClientPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
