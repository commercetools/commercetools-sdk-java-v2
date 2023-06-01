package com.commercetools.api.models.quote;

import com.commercetools.api.models.quote.Quote;
import com.commercetools.api.models.quote.QuotePagedQueryResponse;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuotePagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuotePagedQueryResponse quotePagedQueryResponse = QuotePagedQueryResponse.builder()
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
public class QuotePagedQueryResponseBuilder implements Builder<QuotePagedQueryResponse> {

    
    
    private Long limit;
    
    
    
    private Long offset;
    
    
    
    private Long count;
    
    
    @Nullable
    private Long total;
    
    
    
    private java.util.List<com.commercetools.api.models.quote.Quote> results;

    
    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     * @return Builder
     */
    
    public QuotePagedQueryResponseBuilder limit( final Long limit) {
        this.limit = limit;
        return this;
    }
    
    
    
    
    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */
    
    public QuotePagedQueryResponseBuilder offset( final Long offset) {
        this.offset = offset;
        return this;
    }
    
    
    
    
    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */
    
    public QuotePagedQueryResponseBuilder count( final Long count) {
        this.count = count;
        return this;
    }
    
    
    
    
    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @param total value to be set
     * @return Builder
     */
    
    public QuotePagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }
    
    
    
    /**
     *  <p>Quotes matching the query.</p>
     * @param results value to be set
     * @return Builder
     */
    
    public QuotePagedQueryResponseBuilder results( final com.commercetools.api.models.quote.Quote ...results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }
    
    /**
     *  <p>Quotes matching the query.</p>
     * @param results value to be set
     * @return Builder
     */
    
    public QuotePagedQueryResponseBuilder results( final java.util.List<com.commercetools.api.models.quote.Quote> results) {
        this.results = results;
        return this;
    }
    
    /**
     *  <p>Quotes matching the query.</p>
     * @param results value to be set
     * @return Builder
     */
    
    public QuotePagedQueryResponseBuilder plusResults( final com.commercetools.api.models.quote.Quote ...results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }
    
    
    
    /**
     *  <p>Quotes matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */
    
    public QuotePagedQueryResponseBuilder plusResults(Function<com.commercetools.api.models.quote.QuoteBuilder, com.commercetools.api.models.quote.QuoteBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.quote.QuoteBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Quotes matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */
    
    public QuotePagedQueryResponseBuilder withResults(Function<com.commercetools.api.models.quote.QuoteBuilder, com.commercetools.api.models.quote.QuoteBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.quote.QuoteBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Quotes matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */
    
    public QuotePagedQueryResponseBuilder addResults(Function<com.commercetools.api.models.quote.QuoteBuilder, com.commercetools.api.models.quote.Quote> builder) {
        return plusResults(builder.apply(com.commercetools.api.models.quote.QuoteBuilder.of()));
    }
    
    /**
     *  <p>Quotes matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */
    
    public QuotePagedQueryResponseBuilder setResults(Function<com.commercetools.api.models.quote.QuoteBuilder, com.commercetools.api.models.quote.Quote> builder) {
        return results(builder.apply(com.commercetools.api.models.quote.QuoteBuilder.of()));
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
     *  <p>Quotes matching the query.</p>
     * @return results
     */
    
    
    public java.util.List<com.commercetools.api.models.quote.Quote> getResults(){
        return this.results;
    }

    /**
     * builds QuotePagedQueryResponse with checking for non-null required values
     * @return QuotePagedQueryResponse
     */
    public QuotePagedQueryResponse build() {
        Objects.requireNonNull(limit, QuotePagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, QuotePagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, QuotePagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, QuotePagedQueryResponse.class + ": results is missing");
        return new QuotePagedQueryResponseImpl(limit, offset, count, total, results);
    }
    
    /**
     * builds QuotePagedQueryResponse without checking for non-null required values
     * @return QuotePagedQueryResponse
     */
    public QuotePagedQueryResponse buildUnchecked() {
        return new QuotePagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * factory method for an instance of QuotePagedQueryResponseBuilder
     * @return builder 
     */
    public static QuotePagedQueryResponseBuilder of() {
        return new QuotePagedQueryResponseBuilder();
    }

    /**
     * create builder for QuotePagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuotePagedQueryResponseBuilder of(final QuotePagedQueryResponse template) {
        QuotePagedQueryResponseBuilder builder = new QuotePagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
