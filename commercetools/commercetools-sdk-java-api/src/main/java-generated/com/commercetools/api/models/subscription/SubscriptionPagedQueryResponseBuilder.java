
package com.commercetools.api.models.subscription;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SubscriptionPagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SubscriptionPagedQueryResponse subscriptionPagedQueryResponse = SubscriptionPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SubscriptionPagedQueryResponseBuilder implements Builder<SubscriptionPagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.subscription.Subscription> results;

    /**
     *  <p>Number of <span>results requested</span>.</p>
     * @param limit value to be set
     * @return Builder
     */

    public SubscriptionPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of <span>elements skipped</span>.</p>
     * @param offset value to be set
     * @return Builder
     */

    public SubscriptionPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public SubscriptionPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not <span>strongly consistent</span>. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a <span>Query Predicate</span>, <code>total</code> is subject to a <span>limit</span>.</p>
     * @param total value to be set
     * @return Builder
     */

    public SubscriptionPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Subscriptions matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public SubscriptionPagedQueryResponseBuilder results(
            final com.commercetools.api.models.subscription.Subscription... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Subscriptions matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public SubscriptionPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.subscription.Subscription> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>Subscriptions matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public SubscriptionPagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.subscription.Subscription... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Subscriptions matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public SubscriptionPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.subscription.SubscriptionBuilder, com.commercetools.api.models.subscription.SubscriptionBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.subscription.SubscriptionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Subscriptions matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public SubscriptionPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.subscription.SubscriptionBuilder, com.commercetools.api.models.subscription.SubscriptionBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.subscription.SubscriptionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Subscriptions matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public SubscriptionPagedQueryResponseBuilder addResults(
            Function<com.commercetools.api.models.subscription.SubscriptionBuilder, com.commercetools.api.models.subscription.Subscription> builder) {
        return plusResults(builder.apply(com.commercetools.api.models.subscription.SubscriptionBuilder.of()));
    }

    /**
     *  <p>Subscriptions matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public SubscriptionPagedQueryResponseBuilder setResults(
            Function<com.commercetools.api.models.subscription.SubscriptionBuilder, com.commercetools.api.models.subscription.Subscription> builder) {
        return results(builder.apply(com.commercetools.api.models.subscription.SubscriptionBuilder.of()));
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
     *  <p>Subscriptions matching the query.</p>
     * @return results
     */

    public java.util.List<com.commercetools.api.models.subscription.Subscription> getResults() {
        return this.results;
    }

    /**
     * builds SubscriptionPagedQueryResponse with checking for non-null required values
     * @return SubscriptionPagedQueryResponse
     */
    public SubscriptionPagedQueryResponse build() {
        Objects.requireNonNull(limit, SubscriptionPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, SubscriptionPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, SubscriptionPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, SubscriptionPagedQueryResponse.class + ": results is missing");
        return new SubscriptionPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds SubscriptionPagedQueryResponse without checking for non-null required values
     * @return SubscriptionPagedQueryResponse
     */
    public SubscriptionPagedQueryResponse buildUnchecked() {
        return new SubscriptionPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * factory method for an instance of SubscriptionPagedQueryResponseBuilder
     * @return builder
     */
    public static SubscriptionPagedQueryResponseBuilder of() {
        return new SubscriptionPagedQueryResponseBuilder();
    }

    /**
     * create builder for SubscriptionPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SubscriptionPagedQueryResponseBuilder of(final SubscriptionPagedQueryResponse template) {
        SubscriptionPagedQueryResponseBuilder builder = new SubscriptionPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
