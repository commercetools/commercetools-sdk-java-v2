
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderPagedQueryResponse
 *
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
@JsonDeserialize(as = OrderPagedQueryResponseImpl.class)
public interface OrderPagedQueryResponse extends com.commercetools.api.models.ResourcePagedQueryResponse<Order> {

    /**
     *  <p>Number of results requested.</p>
     * @return limit
     */
    @NotNull
    @JsonProperty("limit")
    public Long getLimit();

    /**
     *
     * @return count
     */
    @NotNull
    @JsonProperty("count")
    public Long getCount();

    /**
     *
     * @return total
     */

    @JsonProperty("total")
    public Long getTotal();

    /**
     *  <p>Number of elements skipped.</p>
     * @return offset
     */
    @NotNull
    @JsonProperty("offset")
    public Long getOffset();

    /**
     *
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<Order> getResults();

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     */

    public void setLimit(final Long limit);

    /**
     * set count
     * @param count value to be set
     */

    public void setCount(final Long count);

    /**
     * set total
     * @param total value to be set
     */

    public void setTotal(final Long total);

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     */

    public void setOffset(final Long offset);

    /**
     * set results
     * @param results values to be set
     */

    @JsonIgnore
    public void setResults(final Order... results);

    /**
     * set results
     * @param results values to be set
     */

    public void setResults(final List<Order> results);

    /**
     * factory method
     * @return instance of OrderPagedQueryResponse
     */
    public static OrderPagedQueryResponse of() {
        return new OrderPagedQueryResponseImpl();
    }

    /**
     * factory method to create a shallow copy OrderPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderPagedQueryResponse of(final OrderPagedQueryResponse template) {
        OrderPagedQueryResponseImpl instance = new OrderPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderPagedQueryResponse deepCopy(@Nullable final OrderPagedQueryResponse template) {
        if (template == null) {
            return null;
        }
        OrderPagedQueryResponseImpl instance = new OrderPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.Order::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for OrderPagedQueryResponse
     * @return builder
     */
    public static OrderPagedQueryResponseBuilder builder() {
        return OrderPagedQueryResponseBuilder.of();
    }

    /**
     * create builder for OrderPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderPagedQueryResponseBuilder builder(final OrderPagedQueryResponse template) {
        return OrderPagedQueryResponseBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderPagedQueryResponse(Function<OrderPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<OrderPagedQueryResponse>";
            }
        };
    }
}
