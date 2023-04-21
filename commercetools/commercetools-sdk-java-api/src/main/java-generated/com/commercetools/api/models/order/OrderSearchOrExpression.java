
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchOrExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchOrExpression orderSearchOrExpression = OrderSearchOrExpression.builder()
 *             .plusOr(orBuilder -> orBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSearchOrExpressionImpl.class)
public interface OrderSearchOrExpression extends OrderSearchCompoundExpression {

    /**
     *
     * @return or
     */
    @NotNull
    @Valid
    @JsonProperty("or")
    public List<OrderSearchQuery> getOr();

    /**
     * set or
     * @param or values to be set
     */

    @JsonIgnore
    public void setOr(final OrderSearchQuery... or);

    /**
     * set or
     * @param or values to be set
     */

    public void setOr(final List<OrderSearchQuery> or);

    /**
     * factory method
     * @return instance of OrderSearchOrExpression
     */
    public static OrderSearchOrExpression of() {
        return new OrderSearchOrExpressionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSearchOrExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSearchOrExpression of(final OrderSearchOrExpression template) {
        OrderSearchOrExpressionImpl instance = new OrderSearchOrExpressionImpl();
        instance.setOr(template.getOr());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSearchOrExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSearchOrExpression deepCopy(@Nullable final OrderSearchOrExpression template) {
        if (template == null) {
            return null;
        }
        OrderSearchOrExpressionImpl instance = new OrderSearchOrExpressionImpl();
        instance.setOr(Optional.ofNullable(template.getOr())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.OrderSearchQuery::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for OrderSearchOrExpression
     * @return builder
     */
    public static OrderSearchOrExpressionBuilder builder() {
        return OrderSearchOrExpressionBuilder.of();
    }

    /**
     * create builder for OrderSearchOrExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchOrExpressionBuilder builder(final OrderSearchOrExpression template) {
        return OrderSearchOrExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSearchOrExpression(Function<OrderSearchOrExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSearchOrExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSearchOrExpression>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSearchOrExpression>";
            }
        };
    }
}
