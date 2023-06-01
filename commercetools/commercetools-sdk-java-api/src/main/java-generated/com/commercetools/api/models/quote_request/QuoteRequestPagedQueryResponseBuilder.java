package com.commercetools.api.models.quote_request;

import com.commercetools.api.models.quote_request.QuoteRequest;
import com.commercetools.api.models.quote_request.QuoteRequestPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteRequestPagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestPagedQueryResponse quoteRequestPagedQueryResponse = QuoteRequestPagedQueryResponse.builder()
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
public class QuoteRequestPagedQueryResponseBuilder implements Builder<QuoteRequestPagedQueryResponse> {

    
    
    private Long limit;
    
    
    
    private Long offset;
    
    
    
    private Long count;
    
    
    @Nullable
    private Long total;
    
    
    
    private java.util.List<com.commercetools.api.models.quote_request.QuoteRequest> results;

    
    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     * @return Builder
     */
    
    public QuoteRequestPagedQueryResponseBuilder limit( final Long limit) {
        this.limit = limit;
        return this;
    }
    
    
    
    
    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */
    
    public QuoteRequestPagedQueryResponseBuilder offset( final Long offset) {
        this.offset = offset;
        return this;
    }
    
    
    
    
    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */
    
    public QuoteRequestPagedQueryResponseBuilder count( final Long count) {
        this.count = count;
        return this;
    }
    
    
    
    
    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @param total value to be set
     * @return Builder
     */
    
    public QuoteRequestPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }
    
    
    
    /**
     *  <p>Quote Requests matching the query.</p>
     * @param results value to be set
     * @return Builder
     */
    
    public QuoteRequestPagedQueryResponseBuilder results( final com.commercetools.api.models.quote_request.QuoteRequest ...results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }
    
    /**
     *  <p>Quote Requests matching the query.</p>
     * @param results value to be set
     * @return Builder
     */
    
    public QuoteRequestPagedQueryResponseBuilder results( final java.util.List<com.commercetools.api.models.quote_request.QuoteRequest> results) {
        this.results = results;
        return this;
    }
    
    /**
     *  <p>Quote Requests matching the query.</p>
     * @param results value to be set
     * @return Builder
     */
    
    public QuoteRequestPagedQueryResponseBuilder plusResults( final com.commercetools.api.models.quote_request.QuoteRequest ...results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }
    
    
    
    /**
     *  <p>Quote Requests matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */
    
    public QuoteRequestPagedQueryResponseBuilder plusResults(Function<com.commercetools.api.models.quote_request.QuoteRequestBuilder, com.commercetools.api.models.quote_request.QuoteRequestBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.quote_request.QuoteRequestBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Quote Requests matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */
    
    public QuoteRequestPagedQueryResponseBuilder withResults(Function<com.commercetools.api.models.quote_request.QuoteRequestBuilder, com.commercetools.api.models.quote_request.QuoteRequestBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.quote_request.QuoteRequestBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Quote Requests matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */
    
    public QuoteRequestPagedQueryResponseBuilder addResults(Function<com.commercetools.api.models.quote_request.QuoteRequestBuilder, com.commercetools.api.models.quote_request.QuoteRequest> builder) {
        return plusResults(builder.apply(com.commercetools.api.models.quote_request.QuoteRequestBuilder.of()));
    }
    
    /**
     *  <p>Quote Requests matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */
    
    public QuoteRequestPagedQueryResponseBuilder setResults(Function<com.commercetools.api.models.quote_request.QuoteRequestBuilder, com.commercetools.api.models.quote_request.QuoteRequest> builder) {
        return results(builder.apply(com.commercetools.api.models.quote_request.QuoteRequestBuilder.of()));
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
     *  <p>Quote Requests matching the query.</p>
     * @return results
     */
    
    
    public java.util.List<com.commercetools.api.models.quote_request.QuoteRequest> getResults(){
        return this.results;
    }

    /**
     * builds QuoteRequestPagedQueryResponse with checking for non-null required values
     * @return QuoteRequestPagedQueryResponse
     */
    public QuoteRequestPagedQueryResponse build() {
        Objects.requireNonNull(limit, QuoteRequestPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, QuoteRequestPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, QuoteRequestPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, QuoteRequestPagedQueryResponse.class + ": results is missing");
        return new QuoteRequestPagedQueryResponseImpl(limit, offset, count, total, results);
    }
    
    /**
     * builds QuoteRequestPagedQueryResponse without checking for non-null required values
     * @return QuoteRequestPagedQueryResponse
     */
    public QuoteRequestPagedQueryResponse buildUnchecked() {
        return new QuoteRequestPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * factory method for an instance of QuoteRequestPagedQueryResponseBuilder
     * @return builder 
     */
    public static QuoteRequestPagedQueryResponseBuilder of() {
        return new QuoteRequestPagedQueryResponseBuilder();
    }

    /**
     * create builder for QuoteRequestPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteRequestPagedQueryResponseBuilder of(final QuoteRequestPagedQueryResponse template) {
        QuoteRequestPagedQueryResponseBuilder builder = new QuoteRequestPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
