package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.PaymentState;
import com.commercetools.api.models.order.OrderChangePaymentStateActionImpl;

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
 * OrderChangePaymentStateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderChangePaymentStateAction orderChangePaymentStateAction = OrderChangePaymentStateAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = OrderChangePaymentStateActionImpl.class)
public interface OrderChangePaymentStateAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderChangePaymentStateAction
     */
    String CHANGE_PAYMENT_STATE = "changePaymentState";

    /**
     *
     * @return paymentState
     */
    
    @JsonProperty("paymentState")
    public PaymentState getPaymentState();

    /**
     * set paymentState
     * @param paymentState value to be set
     */
    
    public void setPaymentState(final PaymentState paymentState);
    

    /**
     * factory method
     * @return instance of OrderChangePaymentStateAction
     */
    public static OrderChangePaymentStateAction of(){
        return new OrderChangePaymentStateActionImpl();
    }
    

    /**
     * factory method to create a shallow copy OrderChangePaymentStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderChangePaymentStateAction of(final OrderChangePaymentStateAction template) {
        OrderChangePaymentStateActionImpl instance = new OrderChangePaymentStateActionImpl();
        instance.setPaymentState(template.getPaymentState());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderChangePaymentStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderChangePaymentStateAction deepCopy(@Nullable final OrderChangePaymentStateAction template) {
        if (template == null) {
            return null;
        }
        OrderChangePaymentStateActionImpl instance = new OrderChangePaymentStateActionImpl();
        instance.setPaymentState(template.getPaymentState());
        return instance;
    }

    /**
     * builder factory method for OrderChangePaymentStateAction
     * @return builder
     */
    public static OrderChangePaymentStateActionBuilder builder() {
        return OrderChangePaymentStateActionBuilder.of();
    }
    
    /**
     * create builder for OrderChangePaymentStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderChangePaymentStateActionBuilder builder(final OrderChangePaymentStateAction template) {
        return OrderChangePaymentStateActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderChangePaymentStateAction(Function<OrderChangePaymentStateAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderChangePaymentStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderChangePaymentStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderChangePaymentStateAction>";
            }
        };
    }
}
