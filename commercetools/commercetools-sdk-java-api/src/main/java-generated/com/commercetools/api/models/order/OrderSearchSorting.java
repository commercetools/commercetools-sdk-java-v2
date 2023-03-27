
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchSorting
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchSorting orderSearchSorting = OrderSearchSorting.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSearchSortingImpl.class)
public interface OrderSearchSorting {

    /**
     * factory method
     * @return instance of OrderSearchSorting
     */
    public static OrderSearchSorting of() {
        return new OrderSearchSortingImpl();
    }

    /**
     * factory method to copy an instance of OrderSearchSorting
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSearchSorting of(final OrderSearchSorting template) {
        OrderSearchSortingImpl instance = new OrderSearchSortingImpl();
        return instance;
    }

    /**
     * builder factory method for OrderSearchSorting
     * @return builder
     */
    public static OrderSearchSortingBuilder builder() {
        return OrderSearchSortingBuilder.of();
    }

    /**
     * create builder for OrderSearchSorting instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchSortingBuilder builder(final OrderSearchSorting template) {
        return OrderSearchSortingBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSearchSorting(Function<OrderSearchSorting, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSearchSorting> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSearchSorting>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSearchSorting>";
            }
        };
    }
}
