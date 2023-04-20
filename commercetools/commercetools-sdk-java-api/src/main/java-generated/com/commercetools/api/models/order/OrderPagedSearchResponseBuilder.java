
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderPagedSearchResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderPagedSearchResponse orderPagedSearchResponse = OrderPagedSearchResponse.builder()
 *             .total(0.3)
 *             .plusHits(hitsBuilder -> hitsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderPagedSearchResponseBuilder implements Builder<OrderPagedSearchResponse> {

    private Long total;

    @Nullable
    private Long offset;

    @Nullable
    private Long limit;

    private java.util.List<com.commercetools.api.models.order.Hit> hits;

    /**
     *  <p>Total number of results matching the query.</p>
     * @param total value to be set
     * @return Builder
     */

    public OrderPagedSearchResponseBuilder total(final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */

    public OrderPagedSearchResponseBuilder offset(@Nullable final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     * @return Builder
     */

    public OrderPagedSearchResponseBuilder limit(@Nullable final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Actual results.</p>
     * @param hits value to be set
     * @return Builder
     */

    public OrderPagedSearchResponseBuilder hits(final com.commercetools.api.models.order.Hit... hits) {
        this.hits = new ArrayList<>(Arrays.asList(hits));
        return this;
    }

    /**
     *  <p>Actual results.</p>
     * @param hits value to be set
     * @return Builder
     */

    public OrderPagedSearchResponseBuilder hits(final java.util.List<com.commercetools.api.models.order.Hit> hits) {
        this.hits = hits;
        return this;
    }

    /**
     *  <p>Actual results.</p>
     * @param hits value to be set
     * @return Builder
     */

    public OrderPagedSearchResponseBuilder plusHits(final com.commercetools.api.models.order.Hit... hits) {
        if (this.hits == null) {
            this.hits = new ArrayList<>();
        }
        this.hits.addAll(Arrays.asList(hits));
        return this;
    }

    /**
     *  <p>Actual results.</p>
     * @param builder function to build the hits value
     * @return Builder
     */

    public OrderPagedSearchResponseBuilder plusHits(
            Function<com.commercetools.api.models.order.HitBuilder, com.commercetools.api.models.order.HitBuilder> builder) {
        if (this.hits == null) {
            this.hits = new ArrayList<>();
        }
        this.hits.add(builder.apply(com.commercetools.api.models.order.HitBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Actual results.</p>
     * @param builder function to build the hits value
     * @return Builder
     */

    public OrderPagedSearchResponseBuilder withHits(
            Function<com.commercetools.api.models.order.HitBuilder, com.commercetools.api.models.order.HitBuilder> builder) {
        this.hits = new ArrayList<>();
        this.hits.add(builder.apply(com.commercetools.api.models.order.HitBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Actual results.</p>
     * @param builder function to build the hits value
     * @return Builder
     */

    public OrderPagedSearchResponseBuilder addHits(
            Function<com.commercetools.api.models.order.HitBuilder, com.commercetools.api.models.order.Hit> builder) {
        return plusHits(builder.apply(com.commercetools.api.models.order.HitBuilder.of()));
    }

    /**
     *  <p>Actual results.</p>
     * @param builder function to build the hits value
     * @return Builder
     */

    public OrderPagedSearchResponseBuilder setHits(
            Function<com.commercetools.api.models.order.HitBuilder, com.commercetools.api.models.order.Hit> builder) {
        return hits(builder.apply(com.commercetools.api.models.order.HitBuilder.of()));
    }

    /**
     *  <p>Total number of results matching the query.</p>
     * @return total
     */

    public Long getTotal() {
        return this.total;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @return offset
     */

    @Nullable
    public Long getOffset() {
        return this.offset;
    }

    /**
     *  <p>Number of results requested.</p>
     * @return limit
     */

    @Nullable
    public Long getLimit() {
        return this.limit;
    }

    /**
     *  <p>Actual results.</p>
     * @return hits
     */

    public java.util.List<com.commercetools.api.models.order.Hit> getHits() {
        return this.hits;
    }

    /**
     * builds OrderPagedSearchResponse with checking for non-null required values
     * @return OrderPagedSearchResponse
     */
    public OrderPagedSearchResponse build() {
        Objects.requireNonNull(total, OrderPagedSearchResponse.class + ": total is missing");
        Objects.requireNonNull(hits, OrderPagedSearchResponse.class + ": hits is missing");
        return new OrderPagedSearchResponseImpl(total, offset, limit, hits);
    }

    /**
     * builds OrderPagedSearchResponse without checking for non-null required values
     * @return OrderPagedSearchResponse
     */
    public OrderPagedSearchResponse buildUnchecked() {
        return new OrderPagedSearchResponseImpl(total, offset, limit, hits);
    }

    /**
     * factory method for an instance of OrderPagedSearchResponseBuilder
     * @return builder
     */
    public static OrderPagedSearchResponseBuilder of() {
        return new OrderPagedSearchResponseBuilder();
    }

    /**
     * create builder for OrderPagedSearchResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderPagedSearchResponseBuilder of(final OrderPagedSearchResponse template) {
        OrderPagedSearchResponseBuilder builder = new OrderPagedSearchResponseBuilder();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.limit = template.getLimit();
        builder.hits = template.getHits();
        return builder;
    }

}
