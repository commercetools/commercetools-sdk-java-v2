package com.commercetools.api.models.message;

import com.commercetools.api.models.message.OrderMessagePayload;
import com.commercetools.api.models.order.PaymentState;
import com.commercetools.api.models.message.OrderPaymentStateChangedMessagePayloadImpl;

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
 *  <p>Generated after a successful Change Payment State update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderPaymentStateChangedMessagePayload orderPaymentStateChangedMessagePayload = OrderPaymentStateChangedMessagePayload.builder()
 *             .paymentState(PaymentState.BALANCE_DUE)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = OrderPaymentStateChangedMessagePayloadImpl.class)
public interface OrderPaymentStateChangedMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for OrderPaymentStateChangedMessagePayload
     */
    String ORDER_PAYMENT_STATE_CHANGED = "OrderPaymentStateChanged";

    /**
     *  <p>PaymentState after the Change Payment State update action.</p>
     * @return paymentState
     */
    @NotNull
    @JsonProperty("paymentState")
    public PaymentState getPaymentState();
    /**
     *  <p>PaymentState before the Change Payment State update action.</p>
     * @return oldPaymentState
     */
    
    @JsonProperty("oldPaymentState")
    public PaymentState getOldPaymentState();

    /**
     *  <p>PaymentState after the Change Payment State update action.</p>
     * @param paymentState value to be set
     */
    
    public void setPaymentState(final PaymentState paymentState);
    
    
    /**
     *  <p>PaymentState before the Change Payment State update action.</p>
     * @param oldPaymentState value to be set
     */
    
    public void setOldPaymentState(final PaymentState oldPaymentState);
    

    /**
     * factory method
     * @return instance of OrderPaymentStateChangedMessagePayload
     */
    public static OrderPaymentStateChangedMessagePayload of(){
        return new OrderPaymentStateChangedMessagePayloadImpl();
    }
    

    /**
     * factory method to create a shallow copy OrderPaymentStateChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderPaymentStateChangedMessagePayload of(final OrderPaymentStateChangedMessagePayload template) {
        OrderPaymentStateChangedMessagePayloadImpl instance = new OrderPaymentStateChangedMessagePayloadImpl();
        instance.setPaymentState(template.getPaymentState());
        instance.setOldPaymentState(template.getOldPaymentState());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderPaymentStateChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderPaymentStateChangedMessagePayload deepCopy(@Nullable final OrderPaymentStateChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        OrderPaymentStateChangedMessagePayloadImpl instance = new OrderPaymentStateChangedMessagePayloadImpl();
        instance.setPaymentState(template.getPaymentState());
        instance.setOldPaymentState(template.getOldPaymentState());
        return instance;
    }

    /**
     * builder factory method for OrderPaymentStateChangedMessagePayload
     * @return builder
     */
    public static OrderPaymentStateChangedMessagePayloadBuilder builder() {
        return OrderPaymentStateChangedMessagePayloadBuilder.of();
    }
    
    /**
     * create builder for OrderPaymentStateChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderPaymentStateChangedMessagePayloadBuilder builder(final OrderPaymentStateChangedMessagePayload template) {
        return OrderPaymentStateChangedMessagePayloadBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderPaymentStateChangedMessagePayload(Function<OrderPaymentStateChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderPaymentStateChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderPaymentStateChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderPaymentStateChangedMessagePayload>";
            }
        };
    }
}
