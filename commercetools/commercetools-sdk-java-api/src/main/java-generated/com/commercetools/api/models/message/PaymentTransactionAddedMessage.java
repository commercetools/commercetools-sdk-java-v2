package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.payment.Transaction;
import com.commercetools.api.models.message.PaymentTransactionAddedMessageImpl;

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
 *  <p>Generated after a successful Add Transaction update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentTransactionAddedMessage paymentTransactionAddedMessage = PaymentTransactionAddedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .transaction(transactionBuilder -> transactionBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = PaymentTransactionAddedMessageImpl.class)
public interface PaymentTransactionAddedMessage extends Message {

    /**
     * discriminator value for PaymentTransactionAddedMessage
     */
    String PAYMENT_TRANSACTION_ADDED = "PaymentTransactionAdded";

    /**
     *  <p>Transaction that was added to the Payment.</p>
     * @return transaction
     */
    @NotNull
    @Valid
    @JsonProperty("transaction")
    public Transaction getTransaction();

    /**
     *  <p>Transaction that was added to the Payment.</p>
     * @param transaction value to be set
     */
    
    public void setTransaction(final Transaction transaction);
    

    /**
     * factory method
     * @return instance of PaymentTransactionAddedMessage
     */
    public static PaymentTransactionAddedMessage of(){
        return new PaymentTransactionAddedMessageImpl();
    }
    

    /**
     * factory method to create a shallow copy PaymentTransactionAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
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

    /**
     * factory method to create a deep copy of PaymentTransactionAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentTransactionAddedMessage deepCopy(@Nullable final PaymentTransactionAddedMessage template) {
        if (template == null) {
            return null;
        }
        PaymentTransactionAddedMessageImpl instance = new PaymentTransactionAddedMessageImpl();
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
        instance.setTransaction(com.commercetools.api.models.payment.Transaction.deepCopy(template.getTransaction()));
        return instance;
    }

    /**
     * builder factory method for PaymentTransactionAddedMessage
     * @return builder
     */
    public static PaymentTransactionAddedMessageBuilder builder() {
        return PaymentTransactionAddedMessageBuilder.of();
    }
    
    /**
     * create builder for PaymentTransactionAddedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentTransactionAddedMessageBuilder builder(final PaymentTransactionAddedMessage template) {
        return PaymentTransactionAddedMessageBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentTransactionAddedMessage(Function<PaymentTransactionAddedMessage, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentTransactionAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentTransactionAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentTransactionAddedMessage>";
            }
        };
    }
}
