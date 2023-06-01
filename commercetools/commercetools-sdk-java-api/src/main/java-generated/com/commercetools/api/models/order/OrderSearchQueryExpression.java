package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderSearchDateRangeExpression;
import com.commercetools.api.models.order.OrderSearchExactExpression;
import com.commercetools.api.models.order.OrderSearchExistsExpression;
import com.commercetools.api.models.order.OrderSearchFullTextExpression;
import com.commercetools.api.models.order.OrderSearchLongRangeExpression;
import com.commercetools.api.models.order.OrderSearchNumberRangeExpression;
import com.commercetools.api.models.order.OrderSearchPrefixExpression;
import com.commercetools.api.models.order.OrderSearchQuery;
import com.commercetools.api.models.order.OrderSearchWildCardExpression;
import com.commercetools.api.models.order.OrderSearchQueryExpressionImpl;

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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = OrderSearchQueryExpressionImpl.class)
public interface OrderSearchQueryExpression extends OrderSearchQuery {




    /**
     * factory method
     * @return instance of OrderSearchQueryExpression
     */
    public static OrderSearchQueryExpression of(){
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
        if (template instanceof com.commercetools.api.models.order.OrderSearchDateRangeExpression) {
            return com.commercetools.api.models.order.OrderSearchDateRangeExpression.deepCopy((com.commercetools.api.models.order.OrderSearchDateRangeExpression)template);
        }
        if (template instanceof com.commercetools.api.models.order.OrderSearchExactExpression) {
            return com.commercetools.api.models.order.OrderSearchExactExpression.deepCopy((com.commercetools.api.models.order.OrderSearchExactExpression)template);
        }
        if (template instanceof com.commercetools.api.models.order.OrderSearchExistsExpression) {
            return com.commercetools.api.models.order.OrderSearchExistsExpression.deepCopy((com.commercetools.api.models.order.OrderSearchExistsExpression)template);
        }
        if (template instanceof com.commercetools.api.models.order.OrderSearchFullTextExpression) {
            return com.commercetools.api.models.order.OrderSearchFullTextExpression.deepCopy((com.commercetools.api.models.order.OrderSearchFullTextExpression)template);
        }
        if (template instanceof com.commercetools.api.models.order.OrderSearchLongRangeExpression) {
            return com.commercetools.api.models.order.OrderSearchLongRangeExpression.deepCopy((com.commercetools.api.models.order.OrderSearchLongRangeExpression)template);
        }
        if (template instanceof com.commercetools.api.models.order.OrderSearchNumberRangeExpression) {
            return com.commercetools.api.models.order.OrderSearchNumberRangeExpression.deepCopy((com.commercetools.api.models.order.OrderSearchNumberRangeExpression)template);
        }
        if (template instanceof com.commercetools.api.models.order.OrderSearchPrefixExpression) {
            return com.commercetools.api.models.order.OrderSearchPrefixExpression.deepCopy((com.commercetools.api.models.order.OrderSearchPrefixExpression)template);
        }
        if (template instanceof com.commercetools.api.models.order.OrderSearchWildCardExpression) {
            return com.commercetools.api.models.order.OrderSearchWildCardExpression.deepCopy((com.commercetools.api.models.order.OrderSearchWildCardExpression)template);
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
