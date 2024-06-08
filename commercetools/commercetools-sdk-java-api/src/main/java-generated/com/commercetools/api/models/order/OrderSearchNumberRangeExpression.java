
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
 * OrderSearchNumberRangeExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchNumberRangeExpression orderSearchNumberRangeExpression = OrderSearchNumberRangeExpression.builder()
 *             .range(rangeBuilder -> rangeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSearchNumberRangeExpressionImpl.class)
public interface OrderSearchNumberRangeExpression extends OrderSearchQueryExpression {

    /**
     *
     * @return range
     */
    @NotNull
    @Valid
    @JsonProperty("range")
    public OrderSearchNumberRangeValue getRange();

    /**
     * set range
     * @param range value to be set
     */

    public void setRange(final OrderSearchNumberRangeValue range);

    /**
     * factory method
     * @return instance of OrderSearchNumberRangeExpression
     */
    public static OrderSearchNumberRangeExpression of() {
        return new OrderSearchNumberRangeExpressionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSearchNumberRangeExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSearchNumberRangeExpression of(final OrderSearchNumberRangeExpression template) {
        OrderSearchNumberRangeExpressionImpl instance = new OrderSearchNumberRangeExpressionImpl();
        instance.setRange(template.getRange());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSearchNumberRangeExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSearchNumberRangeExpression deepCopy(@Nullable final OrderSearchNumberRangeExpression template) {
        if (template == null) {
            return null;
        }
        OrderSearchNumberRangeExpressionImpl instance = new OrderSearchNumberRangeExpressionImpl();
        instance.setRange(com.commercetools.api.models.order.OrderSearchNumberRangeValue.deepCopy(template.getRange()));
        return instance;
    }

    /**
     * builder factory method for OrderSearchNumberRangeExpression
     * @return builder
     */
    public static OrderSearchNumberRangeExpressionBuilder builder() {
        return OrderSearchNumberRangeExpressionBuilder.of();
    }

    /**
     * create builder for OrderSearchNumberRangeExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchNumberRangeExpressionBuilder builder(final OrderSearchNumberRangeExpression template) {
        return OrderSearchNumberRangeExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSearchNumberRangeExpression(Function<OrderSearchNumberRangeExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSearchNumberRangeExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSearchNumberRangeExpression>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSearchNumberRangeExpression>";
            }
        };
    }
}
