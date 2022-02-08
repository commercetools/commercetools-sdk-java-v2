
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.PaymentState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
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
}
