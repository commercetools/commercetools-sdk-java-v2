
package com.commercetools.api.models.recurrence_policy;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurrencePolicyPagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurrencePolicyPagedQueryResponse recurrencePolicyPagedQueryResponse = RecurrencePolicyPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurrencePolicyPagedQueryResponseBuilder implements Builder<RecurrencePolicyPagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.recurrence_policy.RecurrencePolicy> results;

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     * @return Builder
     */

    public RecurrencePolicyPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */

    public RecurrencePolicyPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public RecurrencePolicyPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @param total value to be set
     * @return Builder
     */

    public RecurrencePolicyPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>RecurrencePolicies matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public RecurrencePolicyPagedQueryResponseBuilder results(
            final com.commercetools.api.models.recurrence_policy.RecurrencePolicy... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>RecurrencePolicies matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public RecurrencePolicyPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.recurrence_policy.RecurrencePolicy> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>RecurrencePolicies matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public RecurrencePolicyPagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.recurrence_policy.RecurrencePolicy... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>RecurrencePolicies matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public RecurrencePolicyPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.recurrence_policy.RecurrencePolicyBuilder, com.commercetools.api.models.recurrence_policy.RecurrencePolicyBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(
            builder.apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyBuilder.of()).build());
        return this;
    }

    /**
     *  <p>RecurrencePolicies matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public RecurrencePolicyPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.recurrence_policy.RecurrencePolicyBuilder, com.commercetools.api.models.recurrence_policy.RecurrencePolicyBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(
            builder.apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyBuilder.of()).build());
        return this;
    }

    /**
     *  <p>RecurrencePolicies matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public RecurrencePolicyPagedQueryResponseBuilder addResults(
            Function<com.commercetools.api.models.recurrence_policy.RecurrencePolicyBuilder, com.commercetools.api.models.recurrence_policy.RecurrencePolicy> builder) {
        return plusResults(builder.apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyBuilder.of()));
    }

    /**
     *  <p>RecurrencePolicies matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public RecurrencePolicyPagedQueryResponseBuilder setResults(
            Function<com.commercetools.api.models.recurrence_policy.RecurrencePolicyBuilder, com.commercetools.api.models.recurrence_policy.RecurrencePolicy> builder) {
        return results(builder.apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyBuilder.of()));
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
     *  <p>RecurrencePolicies matching the query.</p>
     * @return results
     */

    public java.util.List<com.commercetools.api.models.recurrence_policy.RecurrencePolicy> getResults() {
        return this.results;
    }

    /**
     * builds RecurrencePolicyPagedQueryResponse with checking for non-null required values
     * @return RecurrencePolicyPagedQueryResponse
     */
    public RecurrencePolicyPagedQueryResponse build() {
        Objects.requireNonNull(limit, RecurrencePolicyPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, RecurrencePolicyPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, RecurrencePolicyPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, RecurrencePolicyPagedQueryResponse.class + ": results is missing");
        return new RecurrencePolicyPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds RecurrencePolicyPagedQueryResponse without checking for non-null required values
     * @return RecurrencePolicyPagedQueryResponse
     */
    public RecurrencePolicyPagedQueryResponse buildUnchecked() {
        return new RecurrencePolicyPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * factory method for an instance of RecurrencePolicyPagedQueryResponseBuilder
     * @return builder
     */
    public static RecurrencePolicyPagedQueryResponseBuilder of() {
        return new RecurrencePolicyPagedQueryResponseBuilder();
    }

    /**
     * create builder for RecurrencePolicyPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurrencePolicyPagedQueryResponseBuilder of(final RecurrencePolicyPagedQueryResponse template) {
        RecurrencePolicyPagedQueryResponseBuilder builder = new RecurrencePolicyPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
