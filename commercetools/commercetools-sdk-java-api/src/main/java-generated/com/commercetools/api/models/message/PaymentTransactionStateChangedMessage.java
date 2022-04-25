
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.payment.TransactionState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentTransactionStateChangedMessageImpl.class)
public interface PaymentTransactionStateChangedMessage extends Message {

    String PAYMENT_TRANSACTION_STATE_CHANGED = "PaymentTransactionStateChanged";

    @NotNull
    @JsonProperty("transactionId")
    public String getTransactionId();

    @NotNull
    @JsonProperty("state")
    public TransactionState getState();

    public void setTransactionId(final String transactionId);

    public void setState(final TransactionState state);

    public static PaymentTransactionStateChangedMessage of() {
        return new PaymentTransactionStateChangedMessageImpl();
    }

    public static PaymentTransactionStateChangedMessage of(final PaymentTransactionStateChangedMessage template) {
        PaymentTransactionStateChangedMessageImpl instance = new PaymentTransactionStateChangedMessageImpl();
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
        instance.setTransactionId(template.getTransactionId());
        instance.setState(template.getState());
        return instance;
    }

    public static PaymentTransactionStateChangedMessageBuilder builder() {
        return PaymentTransactionStateChangedMessageBuilder.of();
    }

    public static PaymentTransactionStateChangedMessageBuilder builder(
            final PaymentTransactionStateChangedMessage template) {
        return PaymentTransactionStateChangedMessageBuilder.of(template);
    }

    default <T> T withPaymentTransactionStateChangedMessage(Function<PaymentTransactionStateChangedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PaymentTransactionStateChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentTransactionStateChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentTransactionStateChangedMessage>";
            }
        };
    }
}
