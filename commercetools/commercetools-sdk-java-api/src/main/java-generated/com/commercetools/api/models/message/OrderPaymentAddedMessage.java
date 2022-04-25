
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.payment.PaymentReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderPaymentAddedMessageImpl.class)
public interface OrderPaymentAddedMessage extends Message {

    String ORDER_PAYMENT_ADDED = "OrderPaymentAdded";

    @NotNull
    @Valid
    @JsonProperty("payment")
    public PaymentReference getPayment();

    public void setPayment(final PaymentReference payment);

    public static OrderPaymentAddedMessage of() {
        return new OrderPaymentAddedMessageImpl();
    }

    public static OrderPaymentAddedMessage of(final OrderPaymentAddedMessage template) {
        OrderPaymentAddedMessageImpl instance = new OrderPaymentAddedMessageImpl();
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
        instance.setPayment(template.getPayment());
        return instance;
    }

    public static OrderPaymentAddedMessageBuilder builder() {
        return OrderPaymentAddedMessageBuilder.of();
    }

    public static OrderPaymentAddedMessageBuilder builder(final OrderPaymentAddedMessage template) {
        return OrderPaymentAddedMessageBuilder.of(template);
    }

    default <T> T withOrderPaymentAddedMessage(Function<OrderPaymentAddedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderPaymentAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderPaymentAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderPaymentAddedMessage>";
            }
        };
    }
}
