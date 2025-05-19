
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
 * OrderSearchDateRangeExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchDateRangeExpression orderSearchDateRangeExpression = OrderSearchDateRangeExpression.builder()
 *             .range(rangeBuilder -> rangeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSearchDateRangeExpressionImpl.class)
public interface OrderSearchDateRangeExpression extends OrderSearchQueryExpression {

    /**
     *
     * @return range
     */
    @NotNull
    @Valid
    @JsonProperty("range")
    public OrderSearchDateRangeValue getRange();

    /**
     * set range
     * @param range value to be set
     */

    public void setRange(final OrderSearchDateRangeValue range);

    /**
     * factory method
     * @return instance of OrderSearchDateRangeExpression
     */
    public static OrderSearchDateRangeExpression of() {
        return new OrderSearchDateRangeExpressionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSearchDateRangeExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSearchDateRangeExpression of(final OrderSearchDateRangeExpression template) {
        OrderSearchDateRangeExpressionImpl instance = new OrderSearchDateRangeExpressionImpl();
        instance.setRange(template.getRange());
        return instance;
    }

    public OrderSearchDateRangeExpression copyDeep();

    /**
     * factory method to create a deep copy of OrderSearchDateRangeExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSearchDateRangeExpression deepCopy(@Nullable final OrderSearchDateRangeExpression template) {
        if (template == null) {
            return null;
        }
        OrderSearchDateRangeExpressionImpl instance = new OrderSearchDateRangeExpressionImpl();
        instance.setRange(com.commercetools.api.models.order.OrderSearchDateRangeValue.deepCopy(template.getRange()));
        return instance;
    }

    /**
     * builder factory method for OrderSearchDateRangeExpression
     * @return builder
     */
    public static OrderSearchDateRangeExpressionBuilder builder() {
        return OrderSearchDateRangeExpressionBuilder.of();
    }

    /**
     * create builder for OrderSearchDateRangeExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchDateRangeExpressionBuilder builder(final OrderSearchDateRangeExpression template) {
        return OrderSearchDateRangeExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSearchDateRangeExpression(Function<OrderSearchDateRangeExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSearchDateRangeExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSearchDateRangeExpression>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSearchDateRangeExpression>";
            }
        };
    }
}
