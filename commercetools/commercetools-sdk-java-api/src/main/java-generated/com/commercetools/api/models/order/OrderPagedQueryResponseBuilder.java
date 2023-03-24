
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderPagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderPagedQueryResponse orderPagedQueryResponse = OrderPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .count(0.3)
 *             .offset(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderPagedQueryResponseBuilder implements Builder<OrderPagedQueryResponse> {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.order.Order> results;

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     * @return Builder
     */

    public OrderPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *
     * @param count value to be set
     * @return Builder
     */

    public OrderPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *
     * @param total value to be set
     * @return Builder
     */

    public OrderPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */

    public OrderPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *
     * @param results value to be set
     * @return Builder
     */

    public OrderPagedQueryResponseBuilder results(final com.commercetools.api.models.order.Order... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *
     * @param results value to be set
     * @return Builder
     */

    public OrderPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.order.Order> results) {
        this.results = results;
        return this;
    }

    /**
     *
     * @param results value to be set
     * @return Builder
     */

    public OrderPagedQueryResponseBuilder plusResults(final com.commercetools.api.models.order.Order... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *
     * @param builder function to build the results value
     * @return Builder
     */

    public OrderPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.order.OrderBuilder, com.commercetools.api.models.order.OrderBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.order.OrderBuilder.of()).build());
        return this;
    }

    /**
     *
     * @param builder function to build the results value
     * @return Builder
     */

    public OrderPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.order.OrderBuilder, com.commercetools.api.models.order.OrderBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.order.OrderBuilder.of()).build());
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

    public java.util.List<com.commercetools.api.models.order.Order> getResults() {
        return this.results;
    }

    /**
     * builds OrderPagedQueryResponse with checking for non-null required values
     * @return OrderPagedQueryResponse
     */
    public OrderPagedQueryResponse build() {
        Objects.requireNonNull(limit, OrderPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(count, OrderPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(offset, OrderPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(results, OrderPagedQueryResponse.class + ": results is missing");
        return new OrderPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    /**
     * builds OrderPagedQueryResponse without checking for non-null required values
     * @return OrderPagedQueryResponse
     */
    public OrderPagedQueryResponse buildUnchecked() {
        return new OrderPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    public static OrderPagedQueryResponseBuilder of() {
        return new OrderPagedQueryResponseBuilder();
    }

    public static OrderPagedQueryResponseBuilder of(final OrderPagedQueryResponse template) {
        OrderPagedQueryResponseBuilder builder = new OrderPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
