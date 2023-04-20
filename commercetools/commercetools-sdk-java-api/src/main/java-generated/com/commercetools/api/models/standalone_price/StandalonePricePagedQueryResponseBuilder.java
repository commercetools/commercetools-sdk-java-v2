
package com.commercetools.api.models.standalone_price;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePricePagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePricePagedQueryResponse standalonePricePagedQueryResponse = StandalonePricePagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePricePagedQueryResponseBuilder implements Builder<StandalonePricePagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.standalone_price.StandalonePrice> results;

    /**
     *  <p>Number of requested results.</p>
     * @param limit value to be set
     * @return Builder
     */

    public StandalonePricePagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Offset supplied by the client or server default. It is the number of elements skipped, not a page number.</p>
     * @param offset value to be set
     * @return Builder
     */

    public StandalonePricePagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public StandalonePricePagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @param total value to be set
     * @return Builder
     */

    public StandalonePricePagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>StandalonePrices matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public StandalonePricePagedQueryResponseBuilder results(
            final com.commercetools.api.models.standalone_price.StandalonePrice... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>StandalonePrices matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public StandalonePricePagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.standalone_price.StandalonePrice> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>StandalonePrices matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public StandalonePricePagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.standalone_price.StandalonePrice... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>StandalonePrices matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public StandalonePricePagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.standalone_price.StandalonePriceBuilder, com.commercetools.api.models.standalone_price.StandalonePriceBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results
                .add(builder.apply(com.commercetools.api.models.standalone_price.StandalonePriceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>StandalonePrices matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public StandalonePricePagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.standalone_price.StandalonePriceBuilder, com.commercetools.api.models.standalone_price.StandalonePriceBuilder> builder) {
        this.results = new ArrayList<>();
        this.results
                .add(builder.apply(com.commercetools.api.models.standalone_price.StandalonePriceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>StandalonePrices matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public StandalonePricePagedQueryResponseBuilder addResults(
            Function<com.commercetools.api.models.standalone_price.StandalonePriceBuilder, com.commercetools.api.models.standalone_price.StandalonePrice> builder) {
        return plusResults(builder.apply(com.commercetools.api.models.standalone_price.StandalonePriceBuilder.of()));
    }

    /**
     *  <p>StandalonePrices matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public StandalonePricePagedQueryResponseBuilder setResults(
            Function<com.commercetools.api.models.standalone_price.StandalonePriceBuilder, com.commercetools.api.models.standalone_price.StandalonePrice> builder) {
        return results(builder.apply(com.commercetools.api.models.standalone_price.StandalonePriceBuilder.of()));
    }

    /**
     *  <p>Number of requested results.</p>
     * @return limit
     */

    public Long getLimit() {
        return this.limit;
    }

    /**
     *  <p>Offset supplied by the client or server default. It is the number of elements skipped, not a page number.</p>
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
     *  <p>StandalonePrices matching the query.</p>
     * @return results
     */

    public java.util.List<com.commercetools.api.models.standalone_price.StandalonePrice> getResults() {
        return this.results;
    }

    /**
     * builds StandalonePricePagedQueryResponse with checking for non-null required values
     * @return StandalonePricePagedQueryResponse
     */
    public StandalonePricePagedQueryResponse build() {
        Objects.requireNonNull(limit, StandalonePricePagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, StandalonePricePagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, StandalonePricePagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, StandalonePricePagedQueryResponse.class + ": results is missing");
        return new StandalonePricePagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds StandalonePricePagedQueryResponse without checking for non-null required values
     * @return StandalonePricePagedQueryResponse
     */
    public StandalonePricePagedQueryResponse buildUnchecked() {
        return new StandalonePricePagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * factory method for an instance of StandalonePricePagedQueryResponseBuilder
     * @return builder
     */
    public static StandalonePricePagedQueryResponseBuilder of() {
        return new StandalonePricePagedQueryResponseBuilder();
    }

    /**
     * create builder for StandalonePricePagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePricePagedQueryResponseBuilder of(final StandalonePricePagedQueryResponse template) {
        StandalonePricePagedQueryResponseBuilder builder = new StandalonePricePagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
