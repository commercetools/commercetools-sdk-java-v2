
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

/**
 *  <p>Generated after a successful Add Transaction update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentTransactionAddedMessagePayload paymentTransactionAddedMessagePayload = PaymentTransactionAddedMessagePayload.builder()
 *             .transaction(transactionBuilder -> transactionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentTransactionAddedMessagePayloadImpl.class)
public interface PaymentTransactionAddedMessagePayload extends MessagePayload {

    /**
     * discriminator value for PaymentTransactionAddedMessagePayload
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
     * @return instance of PaymentTransactionAddedMessagePayload
     */
    public static PaymentTransactionAddedMessagePayload of() {
        return new PaymentTransactionAddedMessagePayloadImpl();
    }

    /**
     * factory method to copy an instance of PaymentTransactionAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentTransactionAddedMessagePayload of(final PaymentTransactionAddedMessagePayload template) {
        PaymentTransactionAddedMessagePayloadImpl instance = new PaymentTransactionAddedMessagePayloadImpl();
        instance.setTransaction(template.getTransaction());
        return instance;
    }

    /**
     * builder factory method for PaymentTransactionAddedMessagePayload
     * @return builder
     */
    public static PaymentTransactionAddedMessagePayloadBuilder builder() {
        return PaymentTransactionAddedMessagePayloadBuilder.of();
    }

    /**
     * create builder for PaymentTransactionAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentTransactionAddedMessagePayloadBuilder builder(
            final PaymentTransactionAddedMessagePayload template) {
        return PaymentTransactionAddedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentTransactionAddedMessagePayload(Function<PaymentTransactionAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentTransactionAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentTransactionAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentTransactionAddedMessagePayload>";
            }
        };
    }
}
