
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * OrderSearchRequest
 *
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
@JsonDeserialize(as = OrderSearchRequestImpl.class)
public interface OrderSearchRequest {

    /**
     *  <p>The Order search query.</p>
     * @return query
     */
    @NotNull
    @Valid
    @JsonProperty("query")
    public OrderSearchQuery getQuery();

    /**
     *  <p>Controls how results to your query are sorted. If not provided, the results are sorted by relevance in descending order.</p>
     * @return sort
     */
    @Valid
    @JsonProperty("sort")
    public List<OrderSearchSorting> getSort();

    /**
     *  <p>The maximum number of search results to be returned on one page.</p>
     * @return limit
     */

    @JsonProperty("limit")
    public Integer getLimit();

    /**
     *  <p>The number of search results to be skipped in the response for pagination.</p>
     * @return offset
     */

    @JsonProperty("offset")
    public Integer getOffset();

    /**
     *  <p>The Order search query.</p>
     * @param query value to be set
     */

    public void setQuery(final OrderSearchQuery query);

    /**
     *  <p>Controls how results to your query are sorted. If not provided, the results are sorted by relevance in descending order.</p>
     * @param sort values to be set
     */

    @JsonIgnore
    public void setSort(final OrderSearchSorting... sort);

    /**
     *  <p>Controls how results to your query are sorted. If not provided, the results are sorted by relevance in descending order.</p>
     * @param sort values to be set
     */

    public void setSort(final List<OrderSearchSorting> sort);

    /**
     *  <p>The maximum number of search results to be returned on one page.</p>
     * @param limit value to be set
     */

    public void setLimit(final Integer limit);

    /**
     *  <p>The number of search results to be skipped in the response for pagination.</p>
     * @param offset value to be set
     */

    public void setOffset(final Integer offset);

    /**
     * factory method
     * @return instance of OrderSearchRequest
     */
    public static OrderSearchRequest of() {
        return new OrderSearchRequestImpl();
    }

    /**
     * factory method to create a shallow copy OrderSearchRequest
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSearchRequest of(final OrderSearchRequest template) {
        OrderSearchRequestImpl instance = new OrderSearchRequestImpl();
        instance.setQuery(template.getQuery());
        instance.setSort(template.getSort());
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        return instance;
    }

    public OrderSearchRequest copyDeep();

    /**
     * factory method to create a deep copy of OrderSearchRequest
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSearchRequest deepCopy(@Nullable final OrderSearchRequest template) {
        if (template == null) {
            return null;
        }
        OrderSearchRequestImpl instance = new OrderSearchRequestImpl();
        instance.setQuery(com.commercetools.api.models.order.OrderSearchQuery.deepCopy(template.getQuery()));
        instance.setSort(Optional.ofNullable(template.getSort())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.OrderSearchSorting::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        return instance;
    }

    /**
     * builder factory method for OrderSearchRequest
     * @return builder
     */
    public static OrderSearchRequestBuilder builder() {
        return OrderSearchRequestBuilder.of();
    }

    /**
     * create builder for OrderSearchRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchRequestBuilder builder(final OrderSearchRequest template) {
        return OrderSearchRequestBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSearchRequest(Function<OrderSearchRequest, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSearchRequest> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSearchRequest>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSearchRequest>";
            }
        };
    }
}
