
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
 * OrderSearchFilterExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchFilterExpression orderSearchFilterExpression = OrderSearchFilterExpression.builder()
 *             .plusFilter(filterBuilder -> filterBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSearchFilterExpressionImpl.class)
public interface OrderSearchFilterExpression extends OrderSearchCompoundExpression {

    /**
     *
     * @return filter
     */
    @NotNull
    @Valid
    @JsonProperty("filter")
    public List<OrderSearchQueryExpression> getFilter();

    /**
     * set filter
     * @param filter values to be set
     */

    @JsonIgnore
    public void setFilter(final OrderSearchQueryExpression... filter);

    /**
     * set filter
     * @param filter values to be set
     */

    public void setFilter(final List<OrderSearchQueryExpression> filter);

    /**
     * factory method
     * @return instance of OrderSearchFilterExpression
     */
    public static OrderSearchFilterExpression of() {
        return new OrderSearchFilterExpressionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSearchFilterExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSearchFilterExpression of(final OrderSearchFilterExpression template) {
        OrderSearchFilterExpressionImpl instance = new OrderSearchFilterExpressionImpl();
        instance.setFilter(template.getFilter());
        return instance;
    }

    public OrderSearchFilterExpression copyDeep();

    /**
     * factory method to create a deep copy of OrderSearchFilterExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSearchFilterExpression deepCopy(@Nullable final OrderSearchFilterExpression template) {
        if (template == null) {
            return null;
        }
        OrderSearchFilterExpressionImpl instance = new OrderSearchFilterExpressionImpl();
        instance.setFilter(Optional.ofNullable(template.getFilter())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.OrderSearchQueryExpression::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for OrderSearchFilterExpression
     * @return builder
     */
    public static OrderSearchFilterExpressionBuilder builder() {
        return OrderSearchFilterExpressionBuilder.of();
    }

    /**
     * create builder for OrderSearchFilterExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchFilterExpressionBuilder builder(final OrderSearchFilterExpression template) {
        return OrderSearchFilterExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSearchFilterExpression(Function<OrderSearchFilterExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSearchFilterExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSearchFilterExpression>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSearchFilterExpression>";
            }
        };
    }
}
