
package com.commercetools.api.models.store;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StorePagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StorePagedQueryResponse storePagedQueryResponse = StorePagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StorePagedQueryResponseBuilder implements Builder<StorePagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.store.Store> results;

    /**
     *  <p>Number of <span>results requested</span>.</p>
     * @param limit value to be set
     * @return Builder
     */

    public StorePagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of <span>elements skipped</span>.</p>
     * @param offset value to be set
     * @return Builder
     */

    public StorePagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public StorePagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not <span>strongly consistent</span>. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a <span>Query Predicate</span>, <code>total</code> is subject to a <span>limit</span>.</p>
     * @param total value to be set
     * @return Builder
     */

    public StorePagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public StorePagedQueryResponseBuilder results(final com.commercetools.api.models.store.Store... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public StorePagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.store.Store> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public StorePagedQueryResponseBuilder plusResults(final com.commercetools.api.models.store.Store... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public StorePagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.store.StoreBuilder, com.commercetools.api.models.store.StoreBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.store.StoreBuilder.of()).build());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public StorePagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.store.StoreBuilder, com.commercetools.api.models.store.StoreBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.store.StoreBuilder.of()).build());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public StorePagedQueryResponseBuilder addResults(
            Function<com.commercetools.api.models.store.StoreBuilder, com.commercetools.api.models.store.Store> builder) {
        return plusResults(builder.apply(com.commercetools.api.models.store.StoreBuilder.of()));
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public StorePagedQueryResponseBuilder setResults(
            Function<com.commercetools.api.models.store.StoreBuilder, com.commercetools.api.models.store.Store> builder) {
        return results(builder.apply(com.commercetools.api.models.store.StoreBuilder.of()));
    }

    /**
     *  <p>Number of <span>results requested</span>.</p>
     * @return limit
     */

    public Long getLimit() {
        return this.limit;
    }

    /**
     *  <p>Number of <span>elements skipped</span>.</p>
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
     *  <p>Total number of results matching the query. This number is an estimation that is not <span>strongly consistent</span>. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a <span>Query Predicate</span>, <code>total</code> is subject to a <span>limit</span>.</p>
     * @return total
     */

    @Nullable
    public Long getTotal() {
        return this.total;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> matching the query.</p>
     * @return results
     */

    public java.util.List<com.commercetools.api.models.store.Store> getResults() {
        return this.results;
    }

    /**
     * builds StorePagedQueryResponse with checking for non-null required values
     * @return StorePagedQueryResponse
     */
    public StorePagedQueryResponse build() {
        Objects.requireNonNull(limit, StorePagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, StorePagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, StorePagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, StorePagedQueryResponse.class + ": results is missing");
        return new StorePagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds StorePagedQueryResponse without checking for non-null required values
     * @return StorePagedQueryResponse
     */
    public StorePagedQueryResponse buildUnchecked() {
        return new StorePagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * factory method for an instance of StorePagedQueryResponseBuilder
     * @return builder
     */
    public static StorePagedQueryResponseBuilder of() {
        return new StorePagedQueryResponseBuilder();
    }

    /**
     * create builder for StorePagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StorePagedQueryResponseBuilder of(final StorePagedQueryResponse template) {
        StorePagedQueryResponseBuilder builder = new StorePagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
