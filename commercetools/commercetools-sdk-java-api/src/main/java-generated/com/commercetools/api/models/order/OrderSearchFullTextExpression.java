package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderSearchFullTextValue;
import com.commercetools.api.models.order.OrderSearchQueryExpression;
import com.commercetools.api.models.order.OrderSearchFullTextExpressionImpl;

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
 * OrderSearchFullTextExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchFullTextExpression orderSearchFullTextExpression = OrderSearchFullTextExpression.builder()
 *             .fullText(fullTextBuilder -> fullTextBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = OrderSearchFullTextExpressionImpl.class)
public interface OrderSearchFullTextExpression extends OrderSearchQueryExpression {


    /**
     *
     * @return fullText
     */
    @NotNull
    @Valid
    @JsonProperty("fullText")
    public OrderSearchFullTextValue getFullText();

    /**
     * set fullText
     * @param fullText value to be set
     */
    
    public void setFullText(final OrderSearchFullTextValue fullText);
    

    /**
     * factory method
     * @return instance of OrderSearchFullTextExpression
     */
    public static OrderSearchFullTextExpression of(){
        return new OrderSearchFullTextExpressionImpl();
    }
    

    /**
     * factory method to create a shallow copy OrderSearchFullTextExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSearchFullTextExpression of(final OrderSearchFullTextExpression template) {
        OrderSearchFullTextExpressionImpl instance = new OrderSearchFullTextExpressionImpl();
        instance.setFullText(template.getFullText());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSearchFullTextExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSearchFullTextExpression deepCopy(@Nullable final OrderSearchFullTextExpression template) {
        if (template == null) {
            return null;
        }
        OrderSearchFullTextExpressionImpl instance = new OrderSearchFullTextExpressionImpl();
        instance.setFullText(com.commercetools.api.models.order.OrderSearchFullTextValue.deepCopy(template.getFullText()));
        return instance;
    }

    /**
     * builder factory method for OrderSearchFullTextExpression
     * @return builder
     */
    public static OrderSearchFullTextExpressionBuilder builder() {
        return OrderSearchFullTextExpressionBuilder.of();
    }
    
    /**
     * create builder for OrderSearchFullTextExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchFullTextExpressionBuilder builder(final OrderSearchFullTextExpression template) {
        return OrderSearchFullTextExpressionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSearchFullTextExpression(Function<OrderSearchFullTextExpression, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSearchFullTextExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSearchFullTextExpression>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSearchFullTextExpression>";
            }
        };
    }
}
