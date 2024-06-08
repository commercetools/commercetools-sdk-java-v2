
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
 * OrderSearchPrefixExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchPrefixExpression orderSearchPrefixExpression = OrderSearchPrefixExpression.builder()
 *             .prefix(prefixBuilder -> prefixBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSearchPrefixExpressionImpl.class)
public interface OrderSearchPrefixExpression extends OrderSearchQueryExpression {

    /**
     *
     * @return prefix
     */
    @NotNull
    @Valid
    @JsonProperty("prefix")
    public OrderSearchStringValue getPrefix();

    /**
     * set prefix
     * @param prefix value to be set
     */

    public void setPrefix(final OrderSearchStringValue prefix);

    /**
     * factory method
     * @return instance of OrderSearchPrefixExpression
     */
    public static OrderSearchPrefixExpression of() {
        return new OrderSearchPrefixExpressionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSearchPrefixExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSearchPrefixExpression of(final OrderSearchPrefixExpression template) {
        OrderSearchPrefixExpressionImpl instance = new OrderSearchPrefixExpressionImpl();
        instance.setPrefix(template.getPrefix());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSearchPrefixExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSearchPrefixExpression deepCopy(@Nullable final OrderSearchPrefixExpression template) {
        if (template == null) {
            return null;
        }
        OrderSearchPrefixExpressionImpl instance = new OrderSearchPrefixExpressionImpl();
        instance.setPrefix(com.commercetools.api.models.order.OrderSearchStringValue.deepCopy(template.getPrefix()));
        return instance;
    }

    /**
     * builder factory method for OrderSearchPrefixExpression
     * @return builder
     */
    public static OrderSearchPrefixExpressionBuilder builder() {
        return OrderSearchPrefixExpressionBuilder.of();
    }

    /**
     * create builder for OrderSearchPrefixExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchPrefixExpressionBuilder builder(final OrderSearchPrefixExpression template) {
        return OrderSearchPrefixExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSearchPrefixExpression(Function<OrderSearchPrefixExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSearchPrefixExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSearchPrefixExpression>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSearchPrefixExpression>";
            }
        };
    }
}
