package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.payment.TransactionState;
import com.commercetools.api.models.message.PaymentTransactionStateChangedMessageImpl;

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
 *  <p>Generated after a successful Change Transaction State update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentTransactionStateChangedMessage paymentTransactionStateChangedMessage = PaymentTransactionStateChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .transactionId("{transactionId}")
 *             .state(TransactionState.INITIAL)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = PaymentTransactionStateChangedMessageImpl.class)
public interface PaymentTransactionStateChangedMessage extends Message {

    /**
     * discriminator value for PaymentTransactionStateChangedMessage
     */
    String PAYMENT_TRANSACTION_STATE_CHANGED = "PaymentTransactionStateChanged";

    /**
     *  <p>Unique identifier for the Transaction for which the Transaction State changed.</p>
     * @return transactionId
     */
    @NotNull
    @JsonProperty("transactionId")
    public String getTransactionId();
    /**
     *  <p>Transaction State after the Change Transaction State update action.</p>
     * @return state
     */
    @NotNull
    @JsonProperty("state")
    public TransactionState getState();

    /**
     *  <p>Unique identifier for the Transaction for which the Transaction State changed.</p>
     * @param transactionId value to be set
     */
    
    public void setTransactionId(final String transactionId);
    
    
    /**
     *  <p>Transaction State after the Change Transaction State update action.</p>
     * @param state value to be set
     */
    
    public void setState(final TransactionState state);
    

    /**
     * factory method
     * @return instance of PaymentTransactionStateChangedMessage
     */
    public static PaymentTransactionStateChangedMessage of(){
        return new PaymentTransactionStateChangedMessageImpl();
    }
    

    /**
     * factory method to create a shallow copy PaymentTransactionStateChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
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

    /**
     * factory method to create a deep copy of PaymentTransactionStateChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentTransactionStateChangedMessage deepCopy(@Nullable final PaymentTransactionStateChangedMessage template) {
        if (template == null) {
            return null;
        }
        PaymentTransactionStateChangedMessageImpl instance = new PaymentTransactionStateChangedMessageImpl();
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
        instance.setTransactionId(template.getTransactionId());
        instance.setState(template.getState());
        return instance;
    }

    /**
     * builder factory method for PaymentTransactionStateChangedMessage
     * @return builder
     */
    public static PaymentTransactionStateChangedMessageBuilder builder() {
        return PaymentTransactionStateChangedMessageBuilder.of();
    }
    
    /**
     * create builder for PaymentTransactionStateChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentTransactionStateChangedMessageBuilder builder(final PaymentTransactionStateChangedMessage template) {
        return PaymentTransactionStateChangedMessageBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentTransactionStateChangedMessage(Function<PaymentTransactionStateChangedMessage, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentTransactionStateChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentTransactionStateChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentTransactionStateChangedMessage>";
            }
        };
    }
}
