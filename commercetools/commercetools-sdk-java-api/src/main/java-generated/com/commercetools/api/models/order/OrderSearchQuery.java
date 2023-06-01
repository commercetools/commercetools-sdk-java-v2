package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderSearchCompoundExpression;
import com.commercetools.api.models.order.OrderSearchQueryExpression;
import com.commercetools.api.models.order.OrderSearchQueryImpl;

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
 * OrderSearchQuery
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchQuery orderSearchQuery = OrderSearchQuery.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = OrderSearchQueryImpl.class)
public interface OrderSearchQuery  {




    /**
     * factory method
     * @return instance of OrderSearchQuery
     */
    public static OrderSearchQuery of(){
        return new OrderSearchQueryImpl();
    }
    

    /**
     * factory method to create a shallow copy OrderSearchQuery
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSearchQuery of(final OrderSearchQuery template) {
        OrderSearchQueryImpl instance = new OrderSearchQueryImpl();
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSearchQuery
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSearchQuery deepCopy(@Nullable final OrderSearchQuery template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.order.OrderSearchCompoundExpression) {
            return com.commercetools.api.models.order.OrderSearchCompoundExpression.deepCopy((com.commercetools.api.models.order.OrderSearchCompoundExpression)template);
        }
        if (template instanceof com.commercetools.api.models.order.OrderSearchQueryExpression) {
            return com.commercetools.api.models.order.OrderSearchQueryExpression.deepCopy((com.commercetools.api.models.order.OrderSearchQueryExpression)template);
        }
        OrderSearchQueryImpl instance = new OrderSearchQueryImpl();
        return instance;
    }

    /**
     * builder factory method for OrderSearchQuery
     * @return builder
     */
    public static OrderSearchQueryBuilder builder() {
        return OrderSearchQueryBuilder.of();
    }
    
    /**
     * create builder for OrderSearchQuery instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchQueryBuilder builder(final OrderSearchQuery template) {
        return OrderSearchQueryBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSearchQuery(Function<OrderSearchQuery, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSearchQuery> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSearchQuery>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSearchQuery>";
            }
        };
    }
}
