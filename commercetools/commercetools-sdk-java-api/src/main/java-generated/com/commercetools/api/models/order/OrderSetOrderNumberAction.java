package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.OrderSetOrderNumberActionImpl;

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
 * OrderSetOrderNumberAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetOrderNumberAction orderSetOrderNumberAction = OrderSetOrderNumberAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = OrderSetOrderNumberActionImpl.class)
public interface OrderSetOrderNumberAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetOrderNumberAction
     */
    String SET_ORDER_NUMBER = "setOrderNumber";

    /**
     *
     * @return orderNumber
     */
    
    @JsonProperty("orderNumber")
    public String getOrderNumber();

    /**
     * set orderNumber
     * @param orderNumber value to be set
     */
    
    public void setOrderNumber(final String orderNumber);
    

    /**
     * factory method
     * @return instance of OrderSetOrderNumberAction
     */
    public static OrderSetOrderNumberAction of(){
        return new OrderSetOrderNumberActionImpl();
    }
    

    /**
     * factory method to create a shallow copy OrderSetOrderNumberAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetOrderNumberAction of(final OrderSetOrderNumberAction template) {
        OrderSetOrderNumberActionImpl instance = new OrderSetOrderNumberActionImpl();
        instance.setOrderNumber(template.getOrderNumber());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSetOrderNumberAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSetOrderNumberAction deepCopy(@Nullable final OrderSetOrderNumberAction template) {
        if (template == null) {
            return null;
        }
        OrderSetOrderNumberActionImpl instance = new OrderSetOrderNumberActionImpl();
        instance.setOrderNumber(template.getOrderNumber());
        return instance;
    }

    /**
     * builder factory method for OrderSetOrderNumberAction
     * @return builder
     */
    public static OrderSetOrderNumberActionBuilder builder() {
        return OrderSetOrderNumberActionBuilder.of();
    }
    
    /**
     * create builder for OrderSetOrderNumberAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetOrderNumberActionBuilder builder(final OrderSetOrderNumberAction template) {
        return OrderSetOrderNumberActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSetOrderNumberAction(Function<OrderSetOrderNumberAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetOrderNumberAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetOrderNumberAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetOrderNumberAction>";
            }
        };
    }
}
