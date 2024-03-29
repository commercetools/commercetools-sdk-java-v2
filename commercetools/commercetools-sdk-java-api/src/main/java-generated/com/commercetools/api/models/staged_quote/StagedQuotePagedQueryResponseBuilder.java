
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
     * @param limit value to be set
     * @return Builder
     */

    public StagedQuotePagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */

    public StagedQuotePagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public StagedQuotePagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @param total value to be set
     * @return Builder
     */

    public StagedQuotePagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Staged Quotes matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public StagedQuotePagedQueryResponseBuilder results(
            final com.commercetools.api.models.staged_quote.StagedQuote... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Staged Quotes matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public StagedQuotePagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.staged_quote.StagedQuote> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>Staged Quotes matching the query.</p>
     * @param results value to be set
     * @return Builder
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
     * @param builder function to build the results value
     * @return Builder
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
     * @param builder function to build the results value
     * @return Builder
     */

    public StagedQuotePagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.staged_quote.StagedQuoteBuilder, com.commercetools.api.models.staged_quote.StagedQuoteBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.staged_quote.StagedQuoteBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Staged Quotes matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public StagedQuotePagedQueryResponseBuilder addResults(
            Function<com.commercetools.api.models.staged_quote.StagedQuoteBuilder, com.commercetools.api.models.staged_quote.StagedQuote> builder) {
        return plusResults(builder.apply(com.commercetools.api.models.staged_quote.StagedQuoteBuilder.of()));
    }

    /**
     *  <p>Staged Quotes matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public StagedQuotePagedQueryResponseBuilder setResults(
            Function<com.commercetools.api.models.staged_quote.StagedQuoteBuilder, com.commercetools.api.models.staged_quote.StagedQuote> builder) {
        return results(builder.apply(com.commercetools.api.models.staged_quote.StagedQuoteBuilder.of()));
    }

    /**
     *  <p>Number of results requested.</p>
     * @return limit
     */

    public Long getLimit() {
        return this.limit;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @return offset
     */

    public Long getOffset() {
        return this.offset;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @return count
     */

    public Long getCount() {
        return this.count;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @return total
     */

    @Nullable
    public Long getTotal() {
        return this.total;
    }

    /**
     *  <p>Staged Quotes matching the query.</p>
     * @return results
     */

    public java.util.List<com.commercetools.api.models.staged_quote.StagedQuote> getResults() {
        return this.results;
    }

    /**
     * builds StagedQuotePagedQueryResponse with checking for non-null required values
     * @return StagedQuotePagedQueryResponse
     */
    public StagedQuotePagedQueryResponse build() {
        Objects.requireNonNull(limit, StagedQuotePagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, StagedQuotePagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, StagedQuotePagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, StagedQuotePagedQueryResponse.class + ": results is missing");
        return new StagedQuotePagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds StagedQuotePagedQueryResponse without checking for non-null required values
     * @return StagedQuotePagedQueryResponse
     */
    public StagedQuotePagedQueryResponse buildUnchecked() {
        return new StagedQuotePagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * factory method for an instance of StagedQuotePagedQueryResponseBuilder
     * @return builder
     */
    public static StagedQuotePagedQueryResponseBuilder of() {
        return new StagedQuotePagedQueryResponseBuilder();
    }

    /**
     * create builder for StagedQuotePagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
