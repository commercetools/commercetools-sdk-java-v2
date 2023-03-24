
package com.commercetools.api.models.payment;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentPagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentPagedQueryResponse paymentPagedQueryResponse = PaymentPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .count(0.3)
 *             .offset(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentPagedQueryResponseBuilder implements Builder<PaymentPagedQueryResponse> {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.payment.Payment> results;

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     * @return Builder
     */

    public PaymentPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public PaymentPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @param total value to be set
     * @return Builder
     */

    public PaymentPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */

    public PaymentPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Payments matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public PaymentPagedQueryResponseBuilder results(final com.commercetools.api.models.payment.Payment... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Payments matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public PaymentPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.payment.Payment> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>Payments matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public PaymentPagedQueryResponseBuilder plusResults(final com.commercetools.api.models.payment.Payment... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Payments matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public PaymentPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.payment.PaymentBuilder, com.commercetools.api.models.payment.PaymentBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.payment.PaymentBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Payments matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public PaymentPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.payment.PaymentBuilder, com.commercetools.api.models.payment.PaymentBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.payment.PaymentBuilder.of()).build());
        return this;
    }

    public Long getLimit() {
        return this.limit;
    }

    public Long getCount() {
        return this.count;
    }

    @Nullable
    public Long getTotal() {
        return this.total;
    }

    public Long getOffset() {
        return this.offset;
    }

    public java.util.List<com.commercetools.api.models.payment.Payment> getResults() {
        return this.results;
    }

    /**
     * builds PaymentPagedQueryResponse with checking for non-null required values
     * @return PaymentPagedQueryResponse
     */
    public PaymentPagedQueryResponse build() {
        Objects.requireNonNull(limit, PaymentPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(count, PaymentPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(offset, PaymentPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(results, PaymentPagedQueryResponse.class + ": results is missing");
        return new PaymentPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    /**
     * builds PaymentPagedQueryResponse without checking for non-null required values
     * @return PaymentPagedQueryResponse
     */
    public PaymentPagedQueryResponse buildUnchecked() {
        return new PaymentPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    public static PaymentPagedQueryResponseBuilder of() {
        return new PaymentPagedQueryResponseBuilder();
    }

    public static PaymentPagedQueryResponseBuilder of(final PaymentPagedQueryResponse template) {
        PaymentPagedQueryResponseBuilder builder = new PaymentPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
