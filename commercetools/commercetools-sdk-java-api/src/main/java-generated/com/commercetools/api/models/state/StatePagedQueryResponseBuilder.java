
package com.commercetools.api.models.state;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   StatePagedQueryResponse statePagedQueryResponse = StatePagedQueryResponse.builder()
           .limit(0.3)
           .offset(0.3)
           .count(0.3)
           .plusResults(resultsBuilder -> resultsBuilder)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StatePagedQueryResponseBuilder implements Builder<StatePagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.state.State> results;

    /**
     *  <p>Number of results requested.</p>
     */

    public StatePagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     */

    public StatePagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     */

    public StatePagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     */

    public StatePagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>States matching the query.</p>
     */

    public StatePagedQueryResponseBuilder results(final com.commercetools.api.models.state.State... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>States matching the query.</p>
     */

    public StatePagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.state.State> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>States matching the query.</p>
     */

    public StatePagedQueryResponseBuilder plusResults(final com.commercetools.api.models.state.State... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>States matching the query.</p>
     */

    public StatePagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.state.StateBuilder, com.commercetools.api.models.state.StateBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.state.StateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>States matching the query.</p>
     */

    public StatePagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.state.StateBuilder, com.commercetools.api.models.state.StateBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.state.StateBuilder.of()).build());
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

    public java.util.List<com.commercetools.api.models.state.State> getResults() {
        return this.results;
    }

    public StatePagedQueryResponse build() {
        Objects.requireNonNull(limit, StatePagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, StatePagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, StatePagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, StatePagedQueryResponse.class + ": results is missing");
        return new StatePagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds StatePagedQueryResponse without checking for non null required values
     */
    public StatePagedQueryResponse buildUnchecked() {
        return new StatePagedQueryResponseImpl(limit, offset, count, total, results);
    }

    public static StatePagedQueryResponseBuilder of() {
        return new StatePagedQueryResponseBuilder();
    }

    public static StatePagedQueryResponseBuilder of(final StatePagedQueryResponse template) {
        StatePagedQueryResponseBuilder builder = new StatePagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
