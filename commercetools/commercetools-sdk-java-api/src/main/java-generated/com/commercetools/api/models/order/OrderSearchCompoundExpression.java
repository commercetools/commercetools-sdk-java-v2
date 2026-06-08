
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchCompoundExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchCompoundExpression orderSearchCompoundExpression = OrderSearchCompoundExpression.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSearchCompoundExpressionImpl.class)
public interface OrderSearchCompoundExpression extends OrderSearchQuery {

    /**
     * factory method
     * @return instance of OrderSearchCompoundExpression
     */
    public static OrderSearchCompoundExpression of() {
        return new OrderSearchCompoundExpressionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSearchCompoundExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSearchCompoundExpression of(final OrderSearchCompoundExpression template) {
        OrderSearchCompoundExpressionImpl instance = new OrderSearchCompoundExpressionImpl();
        return instance;
    }

    public OrderSearchCompoundExpression copyDeep();

    /**
     * factory method to create a deep copy of OrderSearchCompoundExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSearchCompoundExpression deepCopy(@Nullable final OrderSearchCompoundExpression template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof OrderSearchCompoundExpressionImpl)) {
            return template.copyDeep();
        }
        OrderSearchCompoundExpressionImpl instance = new OrderSearchCompoundExpressionImpl();
        return instance;
    }

    /**
     * builder factory method for OrderSearchCompoundExpression
     * @return builder
     */
    public static OrderSearchCompoundExpressionBuilder builder() {
        return OrderSearchCompoundExpressionBuilder.of();
    }

    /**
     * create builder for OrderSearchCompoundExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchCompoundExpressionBuilder builder(final OrderSearchCompoundExpression template) {
        return OrderSearchCompoundExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSearchCompoundExpression(Function<OrderSearchCompoundExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSearchCompoundExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSearchCompoundExpression>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSearchCompoundExpression>";
            }
        };
    }
}
