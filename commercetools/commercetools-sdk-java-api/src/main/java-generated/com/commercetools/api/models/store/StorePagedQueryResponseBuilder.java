
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
     *  <p>Number of results requested.</p>
     */

    public StorePagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     */

    public StorePagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     */

    public StorePagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     */

    public StorePagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Stores matching the query.</p>
     */

    public StorePagedQueryResponseBuilder results(final com.commercetools.api.models.store.Store... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Stores matching the query.</p>
     */

    public StorePagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.store.Store> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>Stores matching the query.</p>
     */

    public StorePagedQueryResponseBuilder plusResults(final com.commercetools.api.models.store.Store... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Stores matching the query.</p>
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
     *  <p>Stores matching the query.</p>
     */

    public StorePagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.store.StoreBuilder, com.commercetools.api.models.store.StoreBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.store.StoreBuilder.of()).build());
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

    public java.util.List<com.commercetools.api.models.store.Store> getResults() {
        return this.results;
    }

    public StorePagedQueryResponse build() {
        Objects.requireNonNull(limit, StorePagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, StorePagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, StorePagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, StorePagedQueryResponse.class + ": results is missing");
        return new StorePagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds StorePagedQueryResponse without checking for non null required values
     */
    public StorePagedQueryResponse buildUnchecked() {
        return new StorePagedQueryResponseImpl(limit, offset, count, total, results);
    }

    public static StorePagedQueryResponseBuilder of() {
        return new StorePagedQueryResponseBuilder();
    }

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
