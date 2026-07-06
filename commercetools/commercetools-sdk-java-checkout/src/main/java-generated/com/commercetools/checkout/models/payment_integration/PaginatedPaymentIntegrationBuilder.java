
package com.commercetools.checkout.models.payment_integration;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaginatedPaymentIntegrationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaginatedPaymentIntegration paginatedPaymentIntegration = PaginatedPaymentIntegration.builder()
 *             .limit(1)
 *             .offset(1)
 *             .count(1)
 *             .total(1)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaginatedPaymentIntegrationBuilder implements Builder<PaginatedPaymentIntegration> {

    private Integer limit;

    private Integer offset;

    private Integer count;

    private Integer total;

    private java.util.List<com.commercetools.checkout.models.payment_integration.PaymentIntegration> results;

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     * @return Builder
     */

    public PaginatedPaymentIntegrationBuilder limit(final Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */

    public PaginatedPaymentIntegrationBuilder offset(final Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public PaginatedPaymentIntegrationBuilder count(final Integer count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query.</p>
     * @param total value to be set
     * @return Builder
     */

    public PaginatedPaymentIntegrationBuilder total(final Integer total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>PaymentIntegrations matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public PaginatedPaymentIntegrationBuilder results(
            final com.commercetools.checkout.models.payment_integration.PaymentIntegration... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>PaymentIntegrations matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public PaginatedPaymentIntegrationBuilder results(
            final java.util.List<com.commercetools.checkout.models.payment_integration.PaymentIntegration> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>PaymentIntegrations matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public PaginatedPaymentIntegrationBuilder plusResults(
            final com.commercetools.checkout.models.payment_integration.PaymentIntegration... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>PaymentIntegrations matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public PaginatedPaymentIntegrationBuilder plusResults(
            Function<com.commercetools.checkout.models.payment_integration.PaymentIntegrationBuilder, com.commercetools.checkout.models.payment_integration.PaymentIntegrationBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results
                .add(builder.apply(com.commercetools.checkout.models.payment_integration.PaymentIntegrationBuilder.of())
                        .build());
        return this;
    }

    /**
     *  <p>PaymentIntegrations matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public PaginatedPaymentIntegrationBuilder withResults(
            Function<com.commercetools.checkout.models.payment_integration.PaymentIntegrationBuilder, com.commercetools.checkout.models.payment_integration.PaymentIntegrationBuilder> builder) {
        this.results = new ArrayList<>();
        this.results
                .add(builder.apply(com.commercetools.checkout.models.payment_integration.PaymentIntegrationBuilder.of())
                        .build());
        return this;
    }

    /**
     *  <p>PaymentIntegrations matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public PaginatedPaymentIntegrationBuilder addResults(
            Function<com.commercetools.checkout.models.payment_integration.PaymentIntegrationBuilder, com.commercetools.checkout.models.payment_integration.PaymentIntegration> builder) {
        return plusResults(
            builder.apply(com.commercetools.checkout.models.payment_integration.PaymentIntegrationBuilder.of()));
    }

    /**
     *  <p>PaymentIntegrations matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public PaginatedPaymentIntegrationBuilder setResults(
            Function<com.commercetools.checkout.models.payment_integration.PaymentIntegrationBuilder, com.commercetools.checkout.models.payment_integration.PaymentIntegration> builder) {
        return results(
            builder.apply(com.commercetools.checkout.models.payment_integration.PaymentIntegrationBuilder.of()));
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
     *  <p>Total number of results matching the query.</p>
     * @return total
     */

    public Integer getTotal() {
        return this.total;
    }

    /**
     *  <p>PaymentIntegrations matching the query.</p>
     * @return results
     */

    public java.util.List<com.commercetools.checkout.models.payment_integration.PaymentIntegration> getResults() {
        return this.results;
    }

    /**
     * builds PaginatedPaymentIntegration with checking for non-null required values
     * @return PaginatedPaymentIntegration
     */
    public PaginatedPaymentIntegration build() {
        Objects.requireNonNull(limit, PaginatedPaymentIntegration.class + ": limit is missing");
        Objects.requireNonNull(offset, PaginatedPaymentIntegration.class + ": offset is missing");
        Objects.requireNonNull(count, PaginatedPaymentIntegration.class + ": count is missing");
        Objects.requireNonNull(total, PaginatedPaymentIntegration.class + ": total is missing");
        Objects.requireNonNull(results, PaginatedPaymentIntegration.class + ": results is missing");
        return new PaginatedPaymentIntegrationImpl(limit, offset, count, total, results);
    }

    /**
     * builds PaginatedPaymentIntegration without checking for non-null required values
     * @return PaginatedPaymentIntegration
     */
    public PaginatedPaymentIntegration buildUnchecked() {
        return new PaginatedPaymentIntegrationImpl(limit, offset, count, total, results);
    }

    /**
     * factory method for an instance of PaginatedPaymentIntegrationBuilder
     * @return builder
     */
    public static PaginatedPaymentIntegrationBuilder of() {
        return new PaginatedPaymentIntegrationBuilder();
    }

    /**
     * create builder for PaginatedPaymentIntegration instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaginatedPaymentIntegrationBuilder of(final PaginatedPaymentIntegration template) {
        PaginatedPaymentIntegrationBuilder builder = new PaginatedPaymentIntegrationBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
