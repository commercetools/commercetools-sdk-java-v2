
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.payment.Transaction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentTransactionAddedMessageImpl.class)
public interface PaymentTransactionAddedMessage extends Message {

    String PAYMENT_TRANSACTION_ADDED = "PaymentTransactionAdded";

    @NotNull
    @Valid
    @JsonProperty("transaction")
    public Transaction getTransaction();

    public void setTransaction(final Transaction transaction);

    public static PaymentTransactionAddedMessage of() {
        return new PaymentTransactionAddedMessageImpl();
    }

    public static PaymentTransactionAddedMessage of(final PaymentTransactionAddedMessage template) {
        PaymentTransactionAddedMessageImpl instance = new PaymentTransactionAddedMessageImpl();
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
        instance.setTransaction(template.getTransaction());
        return instance;
    }

    public static PaymentTransactionAddedMessageBuilder builder() {
        return PaymentTransactionAddedMessageBuilder.of();
    }

    public static PaymentTransactionAddedMessageBuilder builder(final PaymentTransactionAddedMessage template) {
        return PaymentTransactionAddedMessageBuilder.of(template);
    }

    default <T> T withPaymentTransactionAddedMessage(Function<PaymentTransactionAddedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PaymentTransactionAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentTransactionAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentTransactionAddedMessage>";
            }
        };
    }
}
