
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchQueryExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchQueryExpression orderSearchQueryExpression = OrderSearchQueryExpression.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSearchQueryExpressionImpl.class)
public interface OrderSearchQueryExpression extends OrderSearchQuery {

    /**
     * factory method
     * @return instance of OrderSearchQueryExpression
     */
    public static OrderSearchQueryExpression of() {
        return new OrderSearchQueryExpressionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSearchQueryExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSearchQueryExpression of(final OrderSearchQueryExpression template) {
        OrderSearchQueryExpressionImpl instance = new OrderSearchQueryExpressionImpl();
        return instance;
    }

    public OrderSearchQueryExpression copyDeep();

    /**
     * factory method to create a deep copy of OrderSearchQueryExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSearchQueryExpression deepCopy(@Nullable final OrderSearchQueryExpression template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof OrderSearchQueryExpressionImpl)) {
            return template.copyDeep();
        }
        OrderSearchQueryExpressionImpl instance = new OrderSearchQueryExpressionImpl();
        return instance;
    }

    /**
     * builder factory method for OrderSearchQueryExpression
     * @return builder
     */
    public static OrderSearchQueryExpressionBuilder builder() {
        return OrderSearchQueryExpressionBuilder.of();
    }

    /**
     * create builder for OrderSearchQueryExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchQueryExpressionBuilder builder(final OrderSearchQueryExpression template) {
        return OrderSearchQueryExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSearchQueryExpression(Function<OrderSearchQueryExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSearchQueryExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSearchQueryExpression>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSearchQueryExpression>";
            }
        };
    }
}
