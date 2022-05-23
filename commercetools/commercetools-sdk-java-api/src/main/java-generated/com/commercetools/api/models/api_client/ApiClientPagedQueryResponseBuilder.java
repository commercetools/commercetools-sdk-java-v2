
package com.commercetools.api.models.api_client;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApiClientPagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApiClientPagedQueryResponse apiClientPagedQueryResponse = ApiClientPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApiClientPagedQueryResponseBuilder implements Builder<ApiClientPagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.api_client.ApiClient> results;

    /**
     <*  <p>Number of results requested.</p>>
     */

    public ApiClientPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     <*  <p>Number of elements skipped.</p>>
     */

    public ApiClientPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     <*  <p>Actual number of results returned.</p>>
     */

    public ApiClientPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     <*  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>>
     */

    public ApiClientPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     <*  <p>APIClients matching the query.</p>>
     */

    public ApiClientPagedQueryResponseBuilder results(
            final com.commercetools.api.models.api_client.ApiClient... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     <*  <p>APIClients matching the query.</p>>
     */

    public ApiClientPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.api_client.ApiClient> results) {
        this.results = results;
        return this;
    }

    /**
     <*  <p>APIClients matching the query.</p>>
     */

    public ApiClientPagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.api_client.ApiClient... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     <*  <p>APIClients matching the query.</p>>
     */

    public ApiClientPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.api_client.ApiClientBuilder, com.commercetools.api.models.api_client.ApiClientBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.api_client.ApiClientBuilder.of()).build());
        return this;
    }

    /**
     <*  <p>APIClients matching the query.</p>>
     */

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
