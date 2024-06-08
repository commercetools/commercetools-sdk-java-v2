
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
 * OrderSearchAndExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchAndExpression orderSearchAndExpression = OrderSearchAndExpression.builder()
 *             .plusAnd(andBuilder -> andBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSearchAndExpressionImpl.class)
public interface OrderSearchAndExpression extends OrderSearchCompoundExpression {

    /**
     *
     * @return and
     */
    @NotNull
    @Valid
    @JsonProperty("and")
    public List<OrderSearchQuery> getAnd();

    /**
     * set and
     * @param and values to be set
     */

    @JsonIgnore
    public void setAnd(final OrderSearchQuery... and);

    /**
     * set and
     * @param and values to be set
     */

    public void setAnd(final List<OrderSearchQuery> and);

    /**
     * factory method
     * @return instance of OrderSearchAndExpression
     */
    public static OrderSearchAndExpression of() {
        return new OrderSearchAndExpressionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSearchAndExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSearchAndExpression of(final OrderSearchAndExpression template) {
        OrderSearchAndExpressionImpl instance = new OrderSearchAndExpressionImpl();
        instance.setAnd(template.getAnd());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSearchAndExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSearchAndExpression deepCopy(@Nullable final OrderSearchAndExpression template) {
        if (template == null) {
            return null;
        }
        OrderSearchAndExpressionImpl instance = new OrderSearchAndExpressionImpl();
        instance.setAnd(Optional.ofNullable(template.getAnd())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.OrderSearchQuery::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for OrderSearchAndExpression
     * @return builder
     */
    public static OrderSearchAndExpressionBuilder builder() {
        return OrderSearchAndExpressionBuilder.of();
    }

    /**
     * create builder for OrderSearchAndExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchAndExpressionBuilder builder(final OrderSearchAndExpression template) {
        return OrderSearchAndExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSearchAndExpression(Function<OrderSearchAndExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSearchAndExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSearchAndExpression>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSearchAndExpression>";
            }
        };
    }
}
