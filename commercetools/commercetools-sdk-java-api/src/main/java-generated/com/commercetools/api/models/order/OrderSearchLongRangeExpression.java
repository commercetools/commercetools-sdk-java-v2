
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * OrderSearchLongRangeExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchLongRangeExpression orderSearchLongRangeExpression = OrderSearchLongRangeExpression.builder()
 *             .range(rangeBuilder -> rangeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSearchLongRangeExpressionImpl.class)
public interface OrderSearchLongRangeExpression extends OrderSearchQueryExpression {

    /**
     *
     * @return range
     */
    @NotNull
    @Valid
    @JsonProperty("range")
    public OrderSearchLongRangeValue getRange();

    /**
     * set range
     * @param range value to be set
     */

    public void setRange(final OrderSearchLongRangeValue range);

    /**
     * factory method
     * @return instance of OrderSearchLongRangeExpression
     */
    public static OrderSearchLongRangeExpression of() {
        return new OrderSearchLongRangeExpressionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSearchLongRangeExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSearchLongRangeExpression of(final OrderSearchLongRangeExpression template) {
        OrderSearchLongRangeExpressionImpl instance = new OrderSearchLongRangeExpressionImpl();
        instance.setRange(template.getRange());
        return instance;
    }

    public OrderSearchLongRangeExpression copyDeep();

    /**
     * factory method to create a deep copy of OrderSearchLongRangeExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSearchLongRangeExpression deepCopy(@Nullable final OrderSearchLongRangeExpression template) {
        if (template == null) {
            return null;
        }
        OrderSearchLongRangeExpressionImpl instance = new OrderSearchLongRangeExpressionImpl();
        instance.setRange(com.commercetools.api.models.order.OrderSearchLongRangeValue.deepCopy(template.getRange()));
        return instance;
    }

    /**
     * builder factory method for OrderSearchLongRangeExpression
     * @return builder
     */
    public static OrderSearchLongRangeExpressionBuilder builder() {
        return OrderSearchLongRangeExpressionBuilder.of();
    }

    /**
     * create builder for OrderSearchLongRangeExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchLongRangeExpressionBuilder builder(final OrderSearchLongRangeExpression template) {
        return OrderSearchLongRangeExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSearchLongRangeExpression(Function<OrderSearchLongRangeExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSearchLongRangeExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSearchLongRangeExpression>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSearchLongRangeExpression>";
            }
        };
    }
}
