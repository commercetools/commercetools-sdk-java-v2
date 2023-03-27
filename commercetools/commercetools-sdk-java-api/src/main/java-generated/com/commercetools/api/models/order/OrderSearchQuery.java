
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchQuery
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchQuery orderSearchQuery = OrderSearchQuery.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSearchQueryImpl.class)
public interface OrderSearchQuery {

    /**
     * factory method
     * @return instance of OrderSearchQuery
     */
    public static OrderSearchQuery of() {
        return new OrderSearchQueryImpl();
    }

    /**
     * factory method to copy an instance of OrderSearchQuery
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSearchQuery of(final OrderSearchQuery template) {
        OrderSearchQueryImpl instance = new OrderSearchQueryImpl();
        return instance;
    }

    /**
     * builder factory method for OrderSearchQuery
     * @return builder
     */
    public static OrderSearchQueryBuilder builder() {
        return OrderSearchQueryBuilder.of();
    }

    /**
     * create builder for OrderSearchQuery instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchQueryBuilder builder(final OrderSearchQuery template) {
        return OrderSearchQueryBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSearchQuery(Function<OrderSearchQuery, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSearchQuery> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSearchQuery>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSearchQuery>";
            }
        };
    }
}
