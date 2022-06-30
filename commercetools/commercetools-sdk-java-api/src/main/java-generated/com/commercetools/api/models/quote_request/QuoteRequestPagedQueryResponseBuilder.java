
package com.commercetools.api.models.quote_request;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteRequestPagedQueryResponseBuilder implements Builder<QuoteRequestPagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.quote_request.QuoteRequest> results;

    /**
     *  <p>Number of results requested.</p>
     */

    public QuoteRequestPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     */

    public QuoteRequestPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     */

    public QuoteRequestPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     */

    public QuoteRequestPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Quote Requests matching the query.</p>
     */

    public QuoteRequestPagedQueryResponseBuilder results(
            final com.commercetools.api.models.quote_request.QuoteRequest... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Quote Requests matching the query.</p>
     */

    public QuoteRequestPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.quote_request.QuoteRequest> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>Quote Requests matching the query.</p>
     */

    public QuoteRequestPagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.quote_request.QuoteRequest... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Quote Requests matching the query.</p>
     */

    public QuoteRequestPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.quote_request.QuoteRequestBuilder, com.commercetools.api.models.quote_request.QuoteRequestBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.quote_request.QuoteRequestBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Quote Requests matching the query.</p>
     */

    public QuoteRequestPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.quote_request.QuoteRequestBuilder, com.commercetools.api.models.quote_request.QuoteRequestBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.quote_request.QuoteRequestBuilder.of()).build());
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

    public java.util.List<com.commercetools.api.models.quote_request.QuoteRequest> getResults() {
        return this.results;
    }

    public QuoteRequestPagedQueryResponse build() {
        Objects.requireNonNull(limit, QuoteRequestPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, QuoteRequestPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, QuoteRequestPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, QuoteRequestPagedQueryResponse.class + ": results is missing");
        return new QuoteRequestPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds QuoteRequestPagedQueryResponse without checking for non null required values
     */
    public QuoteRequestPagedQueryResponse buildUnchecked() {
        return new QuoteRequestPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    public static QuoteRequestPagedQueryResponseBuilder of() {
        return new QuoteRequestPagedQueryResponseBuilder();
    }

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
