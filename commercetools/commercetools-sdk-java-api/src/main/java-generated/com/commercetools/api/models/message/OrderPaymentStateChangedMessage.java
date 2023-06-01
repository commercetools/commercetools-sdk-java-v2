package com.commercetools.api.models.message;

import com.commercetools.api.models.message.OrderMessage;
import com.commercetools.api.models.order.PaymentState;
import com.commercetools.api.models.message.OrderPaymentStateChangedMessageImpl;

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
 *     OrderPaymentStateChangedMessage orderPaymentStateChangedMessage = OrderPaymentStateChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .paymentState(PaymentState.BALANCE_DUE)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = OrderPaymentStateChangedMessageImpl.class)
public interface OrderPaymentStateChangedMessage extends OrderMessage {

    /**
     * discriminator value for OrderPaymentStateChangedMessage
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
     * @return instance of OrderPaymentStateChangedMessage
     */
    public static OrderPaymentStateChangedMessage of(){
        return new OrderPaymentStateChangedMessageImpl();
    }
    

    /**
     * factory method to create a shallow copy OrderPaymentStateChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderPaymentStateChangedMessage of(final OrderPaymentStateChangedMessage template) {
        OrderPaymentStateChangedMessageImpl instance = new OrderPaymentStateChangedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setPaymentState(template.getPaymentState());
        instance.setOldPaymentState(template.getOldPaymentState());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderPaymentStateChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderPaymentStateChangedMessage deepCopy(@Nullable final OrderPaymentStateChangedMessage template) {
        if (template == null) {
            return null;
        }
        OrderPaymentStateChangedMessageImpl instance = new OrderPaymentStateChangedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers.deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setPaymentState(template.getPaymentState());
        instance.setOldPaymentState(template.getOldPaymentState());
        return instance;
    }

    /**
     * builder factory method for OrderPaymentStateChangedMessage
     * @return builder
     */
    public static OrderPaymentStateChangedMessageBuilder builder() {
        return OrderPaymentStateChangedMessageBuilder.of();
    }
    
    /**
     * create builder for OrderPaymentStateChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderPaymentStateChangedMessageBuilder builder(final OrderPaymentStateChangedMessage template) {
        return OrderPaymentStateChangedMessageBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderPaymentStateChangedMessage(Function<OrderPaymentStateChangedMessage, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderPaymentStateChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderPaymentStateChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderPaymentStateChangedMessage>";
            }
        };
    }
}
