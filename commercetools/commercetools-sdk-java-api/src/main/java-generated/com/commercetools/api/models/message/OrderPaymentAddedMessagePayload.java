package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.payment.PaymentReference;
import com.commercetools.api.models.message.OrderPaymentAddedMessagePayloadImpl;

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
 *  <p>Generated after a successful Add Payment update action or when a Payment is added via Order Edits.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderPaymentAddedMessagePayload orderPaymentAddedMessagePayload = OrderPaymentAddedMessagePayload.builder()
 *             .payment(paymentBuilder -> paymentBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = OrderPaymentAddedMessagePayloadImpl.class)
public interface OrderPaymentAddedMessagePayload extends MessagePayload {

    /**
     * discriminator value for OrderPaymentAddedMessagePayload
     */
    String ORDER_PAYMENT_ADDED = "OrderPaymentAdded";

    /**
     *  <p>Payment that was added to the Order.</p>
     * @return payment
     */
    @NotNull
    @Valid
    @JsonProperty("payment")
    public PaymentReference getPayment();

    /**
     *  <p>Payment that was added to the Order.</p>
     * @param payment value to be set
     */
    
    public void setPayment(final PaymentReference payment);
    

    /**
     * factory method
     * @return instance of OrderPaymentAddedMessagePayload
     */
    public static OrderPaymentAddedMessagePayload of(){
        return new OrderPaymentAddedMessagePayloadImpl();
    }
    

    /**
     * factory method to create a shallow copy OrderPaymentAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderPaymentAddedMessagePayload of(final OrderPaymentAddedMessagePayload template) {
        OrderPaymentAddedMessagePayloadImpl instance = new OrderPaymentAddedMessagePayloadImpl();
        instance.setPayment(template.getPayment());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderPaymentAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderPaymentAddedMessagePayload deepCopy(@Nullable final OrderPaymentAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        OrderPaymentAddedMessagePayloadImpl instance = new OrderPaymentAddedMessagePayloadImpl();
        instance.setPayment(com.commercetools.api.models.payment.PaymentReference.deepCopy(template.getPayment()));
        return instance;
    }

    /**
     * builder factory method for OrderPaymentAddedMessagePayload
     * @return builder
     */
    public static OrderPaymentAddedMessagePayloadBuilder builder() {
        return OrderPaymentAddedMessagePayloadBuilder.of();
    }
    
    /**
     * create builder for OrderPaymentAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderPaymentAddedMessagePayloadBuilder builder(final OrderPaymentAddedMessagePayload template) {
        return OrderPaymentAddedMessagePayloadBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderPaymentAddedMessagePayload(Function<OrderPaymentAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderPaymentAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderPaymentAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderPaymentAddedMessagePayload>";
            }
        };
    }
}
