
package com.commercetools.checkout.models.recurring_payment_job;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaginatedRecurringPaymentJobBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaginatedRecurringPaymentJob paginatedRecurringPaymentJob = PaginatedRecurringPaymentJob.builder()
 *             .limit(1)
 *             .offset(1)
 *             .count(1)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaginatedRecurringPaymentJobBuilder implements Builder<PaginatedRecurringPaymentJob> {

    private Integer limit;

    private Integer offset;

    private Integer count;

    @Nullable
    private Integer total;

    private java.util.List<com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJob> results;

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     * @return Builder
     */

    public PaginatedRecurringPaymentJobBuilder limit(final Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */

    public PaginatedRecurringPaymentJobBuilder offset(final Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public PaginatedRecurringPaymentJobBuilder count(final Integer count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. Only present when the <code>withTotal</code> query parameter is <code>true</code>.</p>
     * @param total value to be set
     * @return Builder
     */

    public PaginatedRecurringPaymentJobBuilder total(@Nullable final Integer total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Recurring Payment Jobs matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public PaginatedRecurringPaymentJobBuilder results(
            final com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJob... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Recurring Payment Jobs matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public PaginatedRecurringPaymentJobBuilder results(
            final java.util.List<com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJob> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>Recurring Payment Jobs matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public PaginatedRecurringPaymentJobBuilder plusResults(
            final com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJob... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Recurring Payment Jobs matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public PaginatedRecurringPaymentJobBuilder plusResults(
            Function<com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobBuilder, com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(
            builder.apply(com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>Recurring Payment Jobs matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public PaginatedRecurringPaymentJobBuilder withResults(
            Function<com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobBuilder, com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(
            builder.apply(com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>Recurring Payment Jobs matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public PaginatedRecurringPaymentJobBuilder addResults(
            Function<com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobBuilder, com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJob> builder) {
        return plusResults(
            builder.apply(com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobBuilder.of()));
    }

    /**
     *  <p>Recurring Payment Jobs matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public PaginatedRecurringPaymentJobBuilder setResults(
            Function<com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobBuilder, com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJob> builder) {
        return results(
            builder.apply(com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobBuilder.of()));
    }

    /**
     *  <p>Number of results requested.</p>
     * @return limit
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @return offset
     */

    public Integer getOffset() {
        return this.offset;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @return count
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     *  <p>Total number of results matching the query. Only present when the <code>withTotal</code> query parameter is <code>true</code>.</p>
     * @return total
     */

    @Nullable
    public Integer getTotal() {
        return this.total;
    }

    /**
     *  <p>Recurring Payment Jobs matching the query.</p>
     * @return results
     */

    public java.util.List<com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJob> getResults() {
        return this.results;
    }

    /**
     * builds PaginatedRecurringPaymentJob with checking for non-null required values
     * @return PaginatedRecurringPaymentJob
     */
    public PaginatedRecurringPaymentJob build() {
        Objects.requireNonNull(limit, PaginatedRecurringPaymentJob.class + ": limit is missing");
        Objects.requireNonNull(offset, PaginatedRecurringPaymentJob.class + ": offset is missing");
        Objects.requireNonNull(count, PaginatedRecurringPaymentJob.class + ": count is missing");
        Objects.requireNonNull(results, PaginatedRecurringPaymentJob.class + ": results is missing");
        return new PaginatedRecurringPaymentJobImpl(limit, offset, count, total, results);
    }

    /**
     * builds PaginatedRecurringPaymentJob without checking for non-null required values
     * @return PaginatedRecurringPaymentJob
     */
    public PaginatedRecurringPaymentJob buildUnchecked() {
        return new PaginatedRecurringPaymentJobImpl(limit, offset, count, total, results);
    }

    /**
     * factory method for an instance of PaginatedRecurringPaymentJobBuilder
     * @return builder
     */
    public static PaginatedRecurringPaymentJobBuilder of() {
        return new PaginatedRecurringPaymentJobBuilder();
    }

    /**
     * create builder for PaginatedRecurringPaymentJob instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaginatedRecurringPaymentJobBuilder of(final PaginatedRecurringPaymentJob template) {
        PaginatedRecurringPaymentJobBuilder builder = new PaginatedRecurringPaymentJobBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
