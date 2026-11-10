
package com.commercetools.checkout.models.recurring_payment;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaginatedRecurringPaymentBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaginatedRecurringPayment paginatedRecurringPayment = PaginatedRecurringPayment.builder()
 *             .limit(1)
 *             .offset(1)
 *             .count(1)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaginatedRecurringPaymentBuilder implements Builder<PaginatedRecurringPayment> {

    private Integer limit;

    private Integer offset;

    private Integer count;

    @Nullable
    private Integer total;

    private java.util.List<com.commercetools.checkout.models.recurring_payment.RecurringPayment> results;

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     * @return Builder
     */

    public PaginatedRecurringPaymentBuilder limit(final Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */

    public PaginatedRecurringPaymentBuilder offset(final Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public PaginatedRecurringPaymentBuilder count(final Integer count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. Only present when the <code>withTotal</code> query parameter is <code>true</code>.</p>
     * @param total value to be set
     * @return Builder
     */

    public PaginatedRecurringPaymentBuilder total(@Nullable final Integer total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>RecurringPayments matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public PaginatedRecurringPaymentBuilder results(
            final com.commercetools.checkout.models.recurring_payment.RecurringPayment... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>RecurringPayments matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public PaginatedRecurringPaymentBuilder results(
            final java.util.List<com.commercetools.checkout.models.recurring_payment.RecurringPayment> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>RecurringPayments matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public PaginatedRecurringPaymentBuilder plusResults(
            final com.commercetools.checkout.models.recurring_payment.RecurringPayment... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>RecurringPayments matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public PaginatedRecurringPaymentBuilder plusResults(
            Function<com.commercetools.checkout.models.recurring_payment.RecurringPaymentBuilder, com.commercetools.checkout.models.recurring_payment.RecurringPaymentBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(
            builder.apply(com.commercetools.checkout.models.recurring_payment.RecurringPaymentBuilder.of()).build());
        return this;
    }

    /**
     *  <p>RecurringPayments matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public PaginatedRecurringPaymentBuilder withResults(
            Function<com.commercetools.checkout.models.recurring_payment.RecurringPaymentBuilder, com.commercetools.checkout.models.recurring_payment.RecurringPaymentBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(
            builder.apply(com.commercetools.checkout.models.recurring_payment.RecurringPaymentBuilder.of()).build());
        return this;
    }

    /**
     *  <p>RecurringPayments matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public PaginatedRecurringPaymentBuilder addResults(
            Function<com.commercetools.checkout.models.recurring_payment.RecurringPaymentBuilder, com.commercetools.checkout.models.recurring_payment.RecurringPayment> builder) {
        return plusResults(
            builder.apply(com.commercetools.checkout.models.recurring_payment.RecurringPaymentBuilder.of()));
    }

    /**
     *  <p>RecurringPayments matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public PaginatedRecurringPaymentBuilder setResults(
            Function<com.commercetools.checkout.models.recurring_payment.RecurringPaymentBuilder, com.commercetools.checkout.models.recurring_payment.RecurringPayment> builder) {
        return results(builder.apply(com.commercetools.checkout.models.recurring_payment.RecurringPaymentBuilder.of()));
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
     *  <p>RecurringPayments matching the query.</p>
     * @return results
     */

    public java.util.List<com.commercetools.checkout.models.recurring_payment.RecurringPayment> getResults() {
        return this.results;
    }

    /**
     * builds PaginatedRecurringPayment with checking for non-null required values
     * @return PaginatedRecurringPayment
     */
    public PaginatedRecurringPayment build() {
        Objects.requireNonNull(limit, PaginatedRecurringPayment.class + ": limit is missing");
        Objects.requireNonNull(offset, PaginatedRecurringPayment.class + ": offset is missing");
        Objects.requireNonNull(count, PaginatedRecurringPayment.class + ": count is missing");
        Objects.requireNonNull(results, PaginatedRecurringPayment.class + ": results is missing");
        return new PaginatedRecurringPaymentImpl(limit, offset, count, total, results);
    }

    /**
     * builds PaginatedRecurringPayment without checking for non-null required values
     * @return PaginatedRecurringPayment
     */
    public PaginatedRecurringPayment buildUnchecked() {
        return new PaginatedRecurringPaymentImpl(limit, offset, count, total, results);
    }

    /**
     * factory method for an instance of PaginatedRecurringPaymentBuilder
     * @return builder
     */
    public static PaginatedRecurringPaymentBuilder of() {
        return new PaginatedRecurringPaymentBuilder();
    }

    /**
     * create builder for PaginatedRecurringPayment instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaginatedRecurringPaymentBuilder of(final PaginatedRecurringPayment template) {
        PaginatedRecurringPaymentBuilder builder = new PaginatedRecurringPaymentBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
