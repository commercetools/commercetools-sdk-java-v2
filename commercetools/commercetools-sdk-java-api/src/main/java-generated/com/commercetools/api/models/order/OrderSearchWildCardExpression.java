package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderSearchQueryExpression;
import com.commercetools.api.models.order.OrderSearchStringValue;
import com.commercetools.api.models.order.OrderSearchWildCardExpressionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * OrderSearchWildCardExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchWildCardExpression orderSearchWildCardExpression = OrderSearchWildCardExpression.builder()
 *             .wildcard(wildcardBuilder -> wildcardBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = OrderSearchWildCardExpressionImpl.class)
public interface OrderSearchWildCardExpression extends OrderSearchQueryExpression {


    /**
     *
     * @return wildcard
     */
    @NotNull
    @Valid
    @JsonProperty("wildcard")
    public OrderSearchStringValue getWildcard();

    /**
     * set wildcard
     * @param wildcard value to be set
     */
    
    public void setWildcard(final OrderSearchStringValue wildcard);
    

    /**
     * factory method
     * @return instance of OrderSearchWildCardExpression
     */
    public static OrderSearchWildCardExpression of(){
        return new OrderSearchWildCardExpressionImpl();
    }
    

    /**
     * factory method to create a shallow copy OrderSearchWildCardExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSearchWildCardExpression of(final OrderSearchWildCardExpression template) {
        OrderSearchWildCardExpressionImpl instance = new OrderSearchWildCardExpressionImpl();
        instance.setWildcard(template.getWildcard());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSearchWildCardExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSearchWildCardExpression deepCopy(@Nullable final OrderSearchWildCardExpression template) {
        if (template == null) {
            return null;
        }
        OrderSearchWildCardExpressionImpl instance = new OrderSearchWildCardExpressionImpl();
        instance.setWildcard(com.commercetools.api.models.order.OrderSearchStringValue.deepCopy(template.getWildcard()));
        return instance;
    }

    /**
     * builder factory method for OrderSearchWildCardExpression
     * @return builder
     */
    public static OrderSearchWildCardExpressionBuilder builder() {
        return OrderSearchWildCardExpressionBuilder.of();
    }
    
    /**
     * create builder for OrderSearchWildCardExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchWildCardExpressionBuilder builder(final OrderSearchWildCardExpression template) {
        return OrderSearchWildCardExpressionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSearchWildCardExpression(Function<OrderSearchWildCardExpression, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSearchWildCardExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSearchWildCardExpression>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSearchWildCardExpression>";
            }
        };
    }
}
