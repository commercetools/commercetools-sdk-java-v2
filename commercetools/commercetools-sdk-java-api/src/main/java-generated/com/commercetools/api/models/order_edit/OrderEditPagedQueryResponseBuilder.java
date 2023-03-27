
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderEditPagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditPagedQueryResponse orderEditPagedQueryResponse = OrderEditPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .count(0.3)
 *             .offset(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderEditPagedQueryResponseBuilder implements Builder<OrderEditPagedQueryResponse> {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.order_edit.OrderEdit> results;

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     * @return Builder
     */

    public OrderEditPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * set the value to the count
     * @param count value to be set
     * @return Builder
     */

    public OrderEditPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     * set the value to the total
     * @param total value to be set
     * @return Builder
     */

    public OrderEditPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */

    public OrderEditPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * set values to the results
     * @param results value to be set
     * @return Builder
     */

    public OrderEditPagedQueryResponseBuilder results(
            final com.commercetools.api.models.order_edit.OrderEdit... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     * set value to the results
     * @param results value to be set
     * @return Builder
     */

    public OrderEditPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.order_edit.OrderEdit> results) {
        this.results = results;
        return this;
    }

    /**
     * add values to the results
     * @param results value to be set
     * @return Builder
     */

    public OrderEditPagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.order_edit.OrderEdit... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     * add the value to the results using the builder function
     * @param builder function to build the results value
     * @return Builder
     */

    public OrderEditPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.order_edit.OrderEditBuilder, com.commercetools.api.models.order_edit.OrderEditBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.order_edit.OrderEditBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the results using the builder function
     * @param builder function to build the results value
     * @return Builder
     */

    public OrderEditPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.order_edit.OrderEditBuilder, com.commercetools.api.models.order_edit.OrderEditBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.order_edit.OrderEditBuilder.of()).build());
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
     * value of count}
     * @return count
     */

    public Long getCount() {
        return this.count;
    }

    /**
     * value of total}
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
     * value of results}
     * @return results
     */

    public java.util.List<com.commercetools.api.models.order_edit.OrderEdit> getResults() {
        return this.results;
    }

    /**
     * builds OrderEditPagedQueryResponse with checking for non-null required values
     * @return OrderEditPagedQueryResponse
     */
    public OrderEditPagedQueryResponse build() {
        Objects.requireNonNull(limit, OrderEditPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(count, OrderEditPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(offset, OrderEditPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(results, OrderEditPagedQueryResponse.class + ": results is missing");
        return new OrderEditPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    /**
     * builds OrderEditPagedQueryResponse without checking for non-null required values
     * @return OrderEditPagedQueryResponse
     */
    public OrderEditPagedQueryResponse buildUnchecked() {
        return new OrderEditPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    /**
     * factory method for an instance of OrderEditPagedQueryResponseBuilder
     * @return builder
     */
    public static OrderEditPagedQueryResponseBuilder of() {
        return new OrderEditPagedQueryResponseBuilder();
    }

    /**
     * create builder for OrderEditPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderEditPagedQueryResponseBuilder of(final OrderEditPagedQueryResponse template) {
        OrderEditPagedQueryResponseBuilder builder = new OrderEditPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
