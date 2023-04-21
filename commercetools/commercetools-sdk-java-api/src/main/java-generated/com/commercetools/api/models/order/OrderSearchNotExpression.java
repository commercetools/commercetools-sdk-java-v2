
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
 * OrderSearchNotExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchNotExpression orderSearchNotExpression = OrderSearchNotExpression.builder()
 *             .plusNot(notBuilder -> notBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSearchNotExpressionImpl.class)
public interface OrderSearchNotExpression extends OrderSearchCompoundExpression {

    /**
     *
     * @return not
     */
    @NotNull
    @Valid
    @JsonProperty("not")
    public List<OrderSearchQuery> getNot();

    /**
     * set not
     * @param not values to be set
     */

    @JsonIgnore
    public void setNot(final OrderSearchQuery... not);

    /**
     * set not
     * @param not values to be set
     */

    public void setNot(final List<OrderSearchQuery> not);

    /**
     * factory method
     * @return instance of OrderSearchNotExpression
     */
    public static OrderSearchNotExpression of() {
        return new OrderSearchNotExpressionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSearchNotExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSearchNotExpression of(final OrderSearchNotExpression template) {
        OrderSearchNotExpressionImpl instance = new OrderSearchNotExpressionImpl();
        instance.setNot(template.getNot());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSearchNotExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSearchNotExpression deepCopy(@Nullable final OrderSearchNotExpression template) {
        if (template == null) {
            return null;
        }
        OrderSearchNotExpressionImpl instance = new OrderSearchNotExpressionImpl();
        instance.setNot(Optional.ofNullable(template.getNot())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.OrderSearchQuery::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for OrderSearchNotExpression
     * @return builder
     */
    public static OrderSearchNotExpressionBuilder builder() {
        return OrderSearchNotExpressionBuilder.of();
    }

    /**
     * create builder for OrderSearchNotExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchNotExpressionBuilder builder(final OrderSearchNotExpression template) {
        return OrderSearchNotExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSearchNotExpression(Function<OrderSearchNotExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSearchNotExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSearchNotExpression>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSearchNotExpression>";
            }
        };
    }
}
