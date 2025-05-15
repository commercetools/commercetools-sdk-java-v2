
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
 * OrderSearchExactExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchExactExpression orderSearchExactExpression = OrderSearchExactExpression.builder()
 *             .exact(exactBuilder -> exactBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSearchExactExpressionImpl.class)
public interface OrderSearchExactExpression extends OrderSearchQueryExpression {

    /**
     *
     * @return exact
     */
    @NotNull
    @Valid
    @JsonProperty("exact")
    public OrderSearchAnyValue getExact();

    /**
     * set exact
     * @param exact value to be set
     */

    public void setExact(final OrderSearchAnyValue exact);

    /**
     * factory method
     * @return instance of OrderSearchExactExpression
     */
    public static OrderSearchExactExpression of() {
        return new OrderSearchExactExpressionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSearchExactExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSearchExactExpression of(final OrderSearchExactExpression template) {
        OrderSearchExactExpressionImpl instance = new OrderSearchExactExpressionImpl();
        instance.setExact(template.getExact());
        return instance;
    }

    public OrderSearchExactExpression copyDeep();

    /**
     * factory method to create a deep copy of OrderSearchExactExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSearchExactExpression deepCopy(@Nullable final OrderSearchExactExpression template) {
        if (template == null) {
            return null;
        }
        OrderSearchExactExpressionImpl instance = new OrderSearchExactExpressionImpl();
        instance.setExact(com.commercetools.api.models.order.OrderSearchAnyValue.deepCopy(template.getExact()));
        return instance;
    }

    /**
     * builder factory method for OrderSearchExactExpression
     * @return builder
     */
    public static OrderSearchExactExpressionBuilder builder() {
        return OrderSearchExactExpressionBuilder.of();
    }

    /**
     * create builder for OrderSearchExactExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchExactExpressionBuilder builder(final OrderSearchExactExpression template) {
        return OrderSearchExactExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSearchExactExpression(Function<OrderSearchExactExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSearchExactExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSearchExactExpression>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSearchExactExpression>";
            }
        };
    }
}
