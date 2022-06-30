
package com.commercetools.api.models.staged_quote;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuotePagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuotePagedQueryResponse stagedQuotePagedQueryResponse = StagedQuotePagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedQuotePagedQueryResponseBuilder implements Builder<StagedQuotePagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.staged_quote.StagedQuote> results;

    /**
     *  <p>Number of results requested.</p>
     */

    public StagedQuotePagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     */

    public StagedQuotePagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     */

    public StagedQuotePagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     */

    public StagedQuotePagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Staged Quotes matching the query.</p>
     */

    public StagedQuotePagedQueryResponseBuilder results(
            final com.commercetools.api.models.staged_quote.StagedQuote... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Staged Quotes matching the query.</p>
     */

    public StagedQuotePagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.staged_quote.StagedQuote> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>Staged Quotes matching the query.</p>
     */

    public StagedQuotePagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.staged_quote.StagedQuote... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Staged Quotes matching the query.</p>
     */

    public StagedQuotePagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.staged_quote.StagedQuoteBuilder, com.commercetools.api.models.staged_quote.StagedQuoteBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.staged_quote.StagedQuoteBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Staged Quotes matching the query.</p>
     */

    public StagedQuotePagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.staged_quote.StagedQuoteBuilder, com.commercetools.api.models.staged_quote.StagedQuoteBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.staged_quote.StagedQuoteBuilder.of()).build());
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

    public java.util.List<com.commercetools.api.models.staged_quote.StagedQuote> getResults() {
        return this.results;
    }

    public StagedQuotePagedQueryResponse build() {
        Objects.requireNonNull(limit, StagedQuotePagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, StagedQuotePagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, StagedQuotePagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, StagedQuotePagedQueryResponse.class + ": results is missing");
        return new StagedQuotePagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds StagedQuotePagedQueryResponse without checking for non null required values
     */
    public StagedQuotePagedQueryResponse buildUnchecked() {
        return new StagedQuotePagedQueryResponseImpl(limit, offset, count, total, results);
    }

    public static StagedQuotePagedQueryResponseBuilder of() {
        return new StagedQuotePagedQueryResponseBuilder();
    }

    public static StagedQuotePagedQueryResponseBuilder of(final StagedQuotePagedQueryResponse template) {
        StagedQuotePagedQueryResponseBuilder builder = new StagedQuotePagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
