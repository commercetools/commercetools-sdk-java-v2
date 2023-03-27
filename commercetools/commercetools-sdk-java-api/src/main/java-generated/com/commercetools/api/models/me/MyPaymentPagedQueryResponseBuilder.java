
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyPaymentPagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyPaymentPagedQueryResponse myPaymentPagedQueryResponse = MyPaymentPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .count(0.3)
 *             .offset(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyPaymentPagedQueryResponseBuilder implements Builder<MyPaymentPagedQueryResponse> {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.me.MyPayment> results;

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     * @return Builder
     */

    public MyPaymentPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public MyPaymentPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @param total value to be set
     * @return Builder
     */

    public MyPaymentPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */

    public MyPaymentPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>MyPayments matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public MyPaymentPagedQueryResponseBuilder results(final com.commercetools.api.models.me.MyPayment... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>MyPayments matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public MyPaymentPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.me.MyPayment> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>MyPayments matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public MyPaymentPagedQueryResponseBuilder plusResults(final com.commercetools.api.models.me.MyPayment... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>MyPayments matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public MyPaymentPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.me.MyPaymentBuilder, com.commercetools.api.models.me.MyPaymentBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.me.MyPaymentBuilder.of()).build());
        return this;
    }

    /**
     *  <p>MyPayments matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public MyPaymentPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.me.MyPaymentBuilder, com.commercetools.api.models.me.MyPaymentBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.me.MyPaymentBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Number of results requested.</p>
     * @return limit
     */

    public Long getLimit() {
        return this.limit;
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
     *  <p>Number of elements skipped.</p>
     * @return offset
     */

    public Long getOffset() {
        return this.offset;
    }

    /**
     *  <p>MyPayments matching the query.</p>
     * @return results
     */

    public java.util.List<com.commercetools.api.models.me.MyPayment> getResults() {
        return this.results;
    }

    /**
     * builds MyPaymentPagedQueryResponse with checking for non-null required values
     * @return MyPaymentPagedQueryResponse
     */
    public MyPaymentPagedQueryResponse build() {
        Objects.requireNonNull(limit, MyPaymentPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(count, MyPaymentPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(offset, MyPaymentPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(results, MyPaymentPagedQueryResponse.class + ": results is missing");
        return new MyPaymentPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    /**
     * builds MyPaymentPagedQueryResponse without checking for non-null required values
     * @return MyPaymentPagedQueryResponse
     */
    public MyPaymentPagedQueryResponse buildUnchecked() {
        return new MyPaymentPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    /**
     * factory method for an instance of MyPaymentPagedQueryResponseBuilder
     * @return builder
     */
    public static MyPaymentPagedQueryResponseBuilder of() {
        return new MyPaymentPagedQueryResponseBuilder();
    }

    /**
     * create builder for MyPaymentPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyPaymentPagedQueryResponseBuilder of(final MyPaymentPagedQueryResponse template) {
        MyPaymentPagedQueryResponseBuilder builder = new MyPaymentPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
