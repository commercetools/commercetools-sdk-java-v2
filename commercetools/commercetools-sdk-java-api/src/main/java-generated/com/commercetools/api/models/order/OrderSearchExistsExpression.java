
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
 * OrderSearchExistsExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchExistsExpression orderSearchExistsExpression = OrderSearchExistsExpression.builder()
 *             .exists(existsBuilder -> existsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSearchExistsExpressionImpl.class)
public interface OrderSearchExistsExpression extends OrderSearchQueryExpression {

    /**
     *
     * @return exists
     */
    @NotNull
    @Valid
    @JsonProperty("exists")
    public OrderSearchQueryExpressionValue getExists();

    /**
     * set exists
     * @param exists value to be set
     */

    public void setExists(final OrderSearchQueryExpressionValue exists);

    /**
     * factory method
     * @return instance of OrderSearchExistsExpression
     */
    public static OrderSearchExistsExpression of() {
        return new OrderSearchExistsExpressionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSearchExistsExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSearchExistsExpression of(final OrderSearchExistsExpression template) {
        OrderSearchExistsExpressionImpl instance = new OrderSearchExistsExpressionImpl();
        instance.setExists(template.getExists());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSearchExistsExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSearchExistsExpression deepCopy(@Nullable final OrderSearchExistsExpression template) {
        if (template == null) {
            return null;
        }
        OrderSearchExistsExpressionImpl instance = new OrderSearchExistsExpressionImpl();
        instance.setExists(
            com.commercetools.api.models.order.OrderSearchQueryExpressionValue.deepCopy(template.getExists()));
        return instance;
    }

    /**
     * builder factory method for OrderSearchExistsExpression
     * @return builder
     */
    public static OrderSearchExistsExpressionBuilder builder() {
        return OrderSearchExistsExpressionBuilder.of();
    }

    /**
     * create builder for OrderSearchExistsExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchExistsExpressionBuilder builder(final OrderSearchExistsExpression template) {
        return OrderSearchExistsExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSearchExistsExpression(Function<OrderSearchExistsExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSearchExistsExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSearchExistsExpression>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSearchExistsExpression>";
            }
        };
    }
}
