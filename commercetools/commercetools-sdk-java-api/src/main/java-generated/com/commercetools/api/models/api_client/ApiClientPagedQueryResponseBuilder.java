package com.commercetools.api.models.api_client;

import com.commercetools.api.models.api_client.ApiClient;
import com.commercetools.api.models.api_client.ApiClientPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ApiClientPagedQueryResponseBuilder implements Builder<ApiClientPagedQueryResponse> {

    
    
    private Long limit;
    
    
    
    private Long offset;
    
    
    
    private Long count;
    
    
    @Nullable
    private Long total;
    
    
    
    private java.util.List<com.commercetools.api.models.api_client.ApiClient> results;

    
    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     * @return Builder
     */
    
    public ApiClientPagedQueryResponseBuilder limit( final Long limit) {
        this.limit = limit;
        return this;
    }
    
    
    
    
    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */
    
    public ApiClientPagedQueryResponseBuilder offset( final Long offset) {
        this.offset = offset;
        return this;
    }
    
    
    
    
    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */
    
    public ApiClientPagedQueryResponseBuilder count( final Long count) {
        this.count = count;
        return this;
    }
    
    
    
    
    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @param total value to be set
     * @return Builder
     */
    
    public ApiClientPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }
    
    
    
    /**
     *  <p>APIClients matching the query.</p>
     * @param results value to be set
     * @return Builder
     */
    
    public ApiClientPagedQueryResponseBuilder results( final com.commercetools.api.models.api_client.ApiClient ...results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }
    
    /**
     *  <p>APIClients matching the query.</p>
     * @param results value to be set
     * @return Builder
     */
    
    public ApiClientPagedQueryResponseBuilder results( final java.util.List<com.commercetools.api.models.api_client.ApiClient> results) {
        this.results = results;
        return this;
    }
    
    /**
     *  <p>APIClients matching the query.</p>
     * @param results value to be set
     * @return Builder
     */
    
    public ApiClientPagedQueryResponseBuilder plusResults( final com.commercetools.api.models.api_client.ApiClient ...results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }
    
    
    
    /**
     *  <p>APIClients matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */
    
    public ApiClientPagedQueryResponseBuilder plusResults(Function<com.commercetools.api.models.api_client.ApiClientBuilder, com.commercetools.api.models.api_client.ApiClientBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.api_client.ApiClientBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>APIClients matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */
    
    public ApiClientPagedQueryResponseBuilder withResults(Function<com.commercetools.api.models.api_client.ApiClientBuilder, com.commercetools.api.models.api_client.ApiClientBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.api_client.ApiClientBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>APIClients matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */
    
    public ApiClientPagedQueryResponseBuilder addResults(Function<com.commercetools.api.models.api_client.ApiClientBuilder, com.commercetools.api.models.api_client.ApiClient> builder) {
        return plusResults(builder.apply(com.commercetools.api.models.api_client.ApiClientBuilder.of()));
    }
    
    /**
     *  <p>APIClients matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */
    
    public ApiClientPagedQueryResponseBuilder setResults(Function<com.commercetools.api.models.api_client.ApiClientBuilder, com.commercetools.api.models.api_client.ApiClient> builder) {
        return results(builder.apply(com.commercetools.api.models.api_client.ApiClientBuilder.of()));
    }
                    

    /**
     *  <p>Number of results requested.</p>
     * @return limit
     */
    
    
    public Long getLimit(){
        return this.limit;
    }
    
    /**
     *  <p>Number of elements skipped.</p>
     * @return offset
     */
    
    
    public Long getOffset(){
        return this.offset;
    }
    
    /**
     *  <p>Actual number of results returned.</p>
     * @return count
     */
    
    
    public Long getCount(){
        return this.count;
    }
    
    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @return total
     */
    
    @Nullable
    public Long getTotal(){
        return this.total;
    }
    
    /**
     *  <p>APIClients matching the query.</p>
     * @return results
     */
    
    
    public java.util.List<com.commercetools.api.models.api_client.ApiClient> getResults(){
        return this.results;
    }

    /**
     * builds ApiClientPagedQueryResponse with checking for non-null required values
     * @return ApiClientPagedQueryResponse
     */
    public ApiClientPagedQueryResponse build() {
        Objects.requireNonNull(limit, ApiClientPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, ApiClientPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, ApiClientPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, ApiClientPagedQueryResponse.class + ": results is missing");
        return new ApiClientPagedQueryResponseImpl(limit, offset, count, total, results);
    }
    
    /**
     * builds ApiClientPagedQueryResponse without checking for non-null required values
     * @return ApiClientPagedQueryResponse
     */
    public ApiClientPagedQueryResponse buildUnchecked() {
        return new ApiClientPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * factory method for an instance of ApiClientPagedQueryResponseBuilder
     * @return builder 
     */
    public static ApiClientPagedQueryResponseBuilder of() {
        return new ApiClientPagedQueryResponseBuilder();
    }

    /**
     * create builder for ApiClientPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
