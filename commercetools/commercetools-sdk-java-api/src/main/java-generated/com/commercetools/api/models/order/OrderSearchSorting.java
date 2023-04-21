
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

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
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSearchSortingImpl.class)
public interface OrderSearchSorting {

    /**
     *
     * @return field
     */
    @NotNull
    @JsonProperty("field")
    public String getField();

    /**
     *
     * @return language
     */

    @JsonProperty("language")
    public String getLanguage();

    /**
     *
     * @return order
     */

    @JsonProperty("order")
    public OrderSearchSortOrder getOrder();

    /**
     *
     * @return mode
     */

    @JsonProperty("mode")
    public OrderSearchSortMode getMode();

    /**
     *
     * @return filter
     */
    @Valid
    @JsonProperty("filter")
    public OrderSearchQueryExpression getFilter();

    /**
     * set field
     * @param field value to be set
     */

    public void setField(final String field);

    /**
     * set language
     * @param language value to be set
     */

    public void setLanguage(final String language);

    /**
     * set order
     * @param order value to be set
     */

    public void setOrder(final OrderSearchSortOrder order);

    /**
     * set mode
     * @param mode value to be set
     */

    public void setMode(final OrderSearchSortMode mode);

    /**
     * set filter
     * @param filter value to be set
     */

    public void setFilter(final OrderSearchQueryExpression filter);

    /**
     * factory method
     * @return instance of OrderSearchSorting
     */
    public static OrderSearchSorting of() {
        return new OrderSearchSortingImpl();
    }

    /**
     * factory method to create a shallow copy OrderSearchSorting
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSearchSorting of(final OrderSearchSorting template) {
        OrderSearchSortingImpl instance = new OrderSearchSortingImpl();
        instance.setField(template.getField());
        instance.setLanguage(template.getLanguage());
        instance.setOrder(template.getOrder());
        instance.setMode(template.getMode());
        instance.setFilter(template.getFilter());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSearchSorting
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSearchSorting deepCopy(@Nullable final OrderSearchSorting template) {
        if (template == null) {
            return null;
        }
        OrderSearchSortingImpl instance = new OrderSearchSortingImpl();
        instance.setField(template.getField());
        instance.setLanguage(template.getLanguage());
        instance.setOrder(template.getOrder());
        instance.setMode(template.getMode());
        instance.setFilter(
            com.commercetools.api.models.order.OrderSearchQueryExpression.deepCopy(template.getFilter()));
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
