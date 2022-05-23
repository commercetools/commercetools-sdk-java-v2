
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.PaymentState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   OrderPaymentStateChangedMessage orderPaymentStateChangedMessage = OrderPaymentStateChangedMessage.builder()
           .id("{id}")
           .version(0.3)
           .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
           .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
           .sequenceNumber(0.3)
           .resource(resourceBuilder -> resourceBuilder)
           .resourceVersion(0.3)
           .paymentState(PaymentState.BALANCE_DUE)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderPaymentStateChangedMessageImpl.class)
public interface OrderPaymentStateChangedMessage extends OrderMessage {

    String ORDER_PAYMENT_STATE_CHANGED = "OrderPaymentStateChanged";

    @NotNull
    @JsonProperty("paymentState")
    public PaymentState getPaymentState();

    @JsonProperty("oldPaymentState")
    public PaymentState getOldPaymentState();

    public void setPaymentState(final PaymentState paymentState);

    public void setOldPaymentState(final PaymentState oldPaymentState);

    public static OrderPaymentStateChangedMessage of() {
        return new OrderPaymentStateChangedMessageImpl();
    }

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

    public static OrderPaymentStateChangedMessageBuilder builder() {
        return OrderPaymentStateChangedMessageBuilder.of();
    }

    public static OrderPaymentStateChangedMessageBuilder builder(final OrderPaymentStateChangedMessage template) {
        return OrderPaymentStateChangedMessageBuilder.of(template);
    }

    default <T> T withOrderPaymentStateChangedMessage(Function<OrderPaymentStateChangedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderPaymentStateChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderPaymentStateChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderPaymentStateChangedMessage>";
            }
        };
    }
}
