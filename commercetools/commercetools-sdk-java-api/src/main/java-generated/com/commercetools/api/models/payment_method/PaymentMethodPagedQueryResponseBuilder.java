
package com.commercetools.api.models.payment_method;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodPagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodPagedQueryResponse paymentMethodPagedQueryResponse = PaymentMethodPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodPagedQueryResponseBuilder implements Builder<PaymentMethodPagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.payment_method.PaymentMethod> results;

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     * @return Builder
     */

    public PaymentMethodPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */

    public PaymentMethodPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public PaymentMethodPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @param total value to be set
     * @return Builder
     */

    public PaymentMethodPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>PaymentMethods matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public PaymentMethodPagedQueryResponseBuilder results(
            final com.commercetools.api.models.payment_method.PaymentMethod... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>PaymentMethods matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public PaymentMethodPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.payment_method.PaymentMethod> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>PaymentMethods matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public PaymentMethodPagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.payment_method.PaymentMethod... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>PaymentMethods matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public PaymentMethodPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.payment_method.PaymentMethodBuilder, com.commercetools.api.models.payment_method.PaymentMethodBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.payment_method.PaymentMethodBuilder.of()).build());
        return this;
    }

    /**
     *  <p>PaymentMethods matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public PaymentMethodPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.payment_method.PaymentMethodBuilder, com.commercetools.api.models.payment_method.PaymentMethodBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.payment_method.PaymentMethodBuilder.of()).build());
        return this;
    }

    /**
     *  <p>PaymentMethods matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public PaymentMethodPagedQueryResponseBuilder addResults(
            Function<com.commercetools.api.models.payment_method.PaymentMethodBuilder, com.commercetools.api.models.payment_method.PaymentMethod> builder) {
        return plusResults(builder.apply(com.commercetools.api.models.payment_method.PaymentMethodBuilder.of()));
    }

    /**
     *  <p>PaymentMethods matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public PaymentMethodPagedQueryResponseBuilder setResults(
            Function<com.commercetools.api.models.payment_method.PaymentMethodBuilder, com.commercetools.api.models.payment_method.PaymentMethod> builder) {
        return results(builder.apply(com.commercetools.api.models.payment_method.PaymentMethodBuilder.of()));
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
     *  <p>PaymentMethods matching the query.</p>
     * @return results
     */

    public java.util.List<com.commercetools.api.models.payment_method.PaymentMethod> getResults() {
        return this.results;
    }

    /**
     * builds PaymentMethodPagedQueryResponse with checking for non-null required values
     * @return PaymentMethodPagedQueryResponse
     */
    public PaymentMethodPagedQueryResponse build() {
        Objects.requireNonNull(limit, PaymentMethodPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, PaymentMethodPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, PaymentMethodPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, PaymentMethodPagedQueryResponse.class + ": results is missing");
        return new PaymentMethodPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds PaymentMethodPagedQueryResponse without checking for non-null required values
     * @return PaymentMethodPagedQueryResponse
     */
    public PaymentMethodPagedQueryResponse buildUnchecked() {
        return new PaymentMethodPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * factory method for an instance of PaymentMethodPagedQueryResponseBuilder
     * @return builder
     */
    public static PaymentMethodPagedQueryResponseBuilder of() {
        return new PaymentMethodPagedQueryResponseBuilder();
    }

    /**
     * create builder for PaymentMethodPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodPagedQueryResponseBuilder of(final PaymentMethodPagedQueryResponse template) {
        PaymentMethodPagedQueryResponseBuilder builder = new PaymentMethodPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
