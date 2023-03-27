
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchRequestBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchRequest orderSearchRequest = OrderSearchRequest.builder()
 *             .query(queryBuilder -> queryBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSearchRequestBuilder implements Builder<OrderSearchRequest> {

    private com.commercetools.api.models.order.OrderSearchQuery query;

    @Nullable
    private java.util.List<com.commercetools.api.models.order.OrderSearchSorting> sort;

    @Nullable
    private Integer limit;

    @Nullable
    private Integer offset;

    /**
     *  <p>The Order search query.</p>
     * @param builder function to build the query value
     * @return Builder
     */

    public OrderSearchRequestBuilder query(
            Function<com.commercetools.api.models.order.OrderSearchQueryBuilder, com.commercetools.api.models.order.OrderSearchQueryBuilder> builder) {
        this.query = builder.apply(com.commercetools.api.models.order.OrderSearchQueryBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Order search query.</p>
     * @param query value to be set
     * @return Builder
     */

    public OrderSearchRequestBuilder query(final com.commercetools.api.models.order.OrderSearchQuery query) {
        this.query = query;
        return this;
    }

    /**
     *  <p>Controls how results to your query are sorted. If not provided, the results are sorted by relevance in descending order.</p>
     * @param sort value to be set
     * @return Builder
     */

    public OrderSearchRequestBuilder sort(
            @Nullable final com.commercetools.api.models.order.OrderSearchSorting... sort) {
        this.sort = new ArrayList<>(Arrays.asList(sort));
        return this;
    }

    /**
     *  <p>Controls how results to your query are sorted. If not provided, the results are sorted by relevance in descending order.</p>
     * @param sort value to be set
     * @return Builder
     */

    public OrderSearchRequestBuilder sort(
            @Nullable final java.util.List<com.commercetools.api.models.order.OrderSearchSorting> sort) {
        this.sort = sort;
        return this;
    }

    /**
     *  <p>Controls how results to your query are sorted. If not provided, the results are sorted by relevance in descending order.</p>
     * @param sort value to be set
     * @return Builder
     */

    public OrderSearchRequestBuilder plusSort(
            @Nullable final com.commercetools.api.models.order.OrderSearchSorting... sort) {
        if (this.sort == null) {
            this.sort = new ArrayList<>();
        }
        this.sort.addAll(Arrays.asList(sort));
        return this;
    }

    /**
     *  <p>Controls how results to your query are sorted. If not provided, the results are sorted by relevance in descending order.</p>
     * @param builder function to build the sort value
     * @return Builder
     */

    public OrderSearchRequestBuilder plusSort(
            Function<com.commercetools.api.models.order.OrderSearchSortingBuilder, com.commercetools.api.models.order.OrderSearchSortingBuilder> builder) {
        if (this.sort == null) {
            this.sort = new ArrayList<>();
        }
        this.sort.add(builder.apply(com.commercetools.api.models.order.OrderSearchSortingBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Controls how results to your query are sorted. If not provided, the results are sorted by relevance in descending order.</p>
     * @param builder function to build the sort value
     * @return Builder
     */

    public OrderSearchRequestBuilder withSort(
            Function<com.commercetools.api.models.order.OrderSearchSortingBuilder, com.commercetools.api.models.order.OrderSearchSortingBuilder> builder) {
        this.sort = new ArrayList<>();
        this.sort.add(builder.apply(com.commercetools.api.models.order.OrderSearchSortingBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The maximum number of search results to be returned.</p>
     * @param limit value to be set
     * @return Builder
     */

    public OrderSearchRequestBuilder limit(@Nullable final Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>The number of search results to be skipped in the response for pagination.</p>
     * @param offset value to be set
     * @return Builder
     */

    public OrderSearchRequestBuilder offset(@Nullable final Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>The Order search query.</p>
     * @return query
     */

    public com.commercetools.api.models.order.OrderSearchQuery getQuery() {
        return this.query;
    }

    /**
     *  <p>Controls how results to your query are sorted. If not provided, the results are sorted by relevance in descending order.</p>
     * @return sort
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.order.OrderSearchSorting> getSort() {
        return this.sort;
    }

    /**
     *  <p>The maximum number of search results to be returned.</p>
     * @return limit
     */

    @Nullable
    public Integer getLimit() {
        return this.limit;
    }

    /**
     *  <p>The number of search results to be skipped in the response for pagination.</p>
     * @return offset
     */

    @Nullable
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * builds OrderSearchRequest with checking for non-null required values
     * @return OrderSearchRequest
     */
    public OrderSearchRequest build() {
        Objects.requireNonNull(query, OrderSearchRequest.class + ": query is missing");
        return new OrderSearchRequestImpl(query, sort, limit, offset);
    }

    /**
     * builds OrderSearchRequest without checking for non-null required values
     * @return OrderSearchRequest
     */
    public OrderSearchRequest buildUnchecked() {
        return new OrderSearchRequestImpl(query, sort, limit, offset);
    }

    /**
     * factory method for an instance of OrderSearchRequestBuilder
     * @return builder
     */
    public static OrderSearchRequestBuilder of() {
        return new OrderSearchRequestBuilder();
    }

    /**
     * create builder for OrderSearchRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchRequestBuilder of(final OrderSearchRequest template) {
        OrderSearchRequestBuilder builder = new OrderSearchRequestBuilder();
        builder.query = template.getQuery();
        builder.sort = template.getSort();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        return builder;
    }

}
