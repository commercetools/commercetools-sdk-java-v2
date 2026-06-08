
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.payment.TransactionState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentChangeTransactionStateAction" rel="nofollow">Change TransactionState</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentTransactionStateChangedMessagePayload paymentTransactionStateChangedMessagePayload = PaymentTransactionStateChangedMessagePayload.builder()
 *             .transactionId("{transactionId}")
 *             .state(TransactionState.INITIAL)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("PaymentTransactionStateChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentTransactionStateChangedMessagePayloadImpl.class)
public interface PaymentTransactionStateChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for PaymentTransactionStateChangedMessagePayload
     */
    String PAYMENT_TRANSACTION_STATE_CHANGED = "PaymentTransactionStateChanged";

    /**
     *  <p>Unique identifier for the <a href="https://docs.commercetools.com/apis/ctp:api:type:Transaction" rel="nofollow">Transaction</a> for which the <a href="https://docs.commercetools.com/apis/ctp:api:type:TransactionState" rel="nofollow">Transaction State</a> changed.</p>
     * @return transactionId
     */
    @NotNull
    @JsonProperty("transactionId")
    public String getTransactionId();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:TransactionState" rel="nofollow">Transaction State</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentChangeTransactionStateAction" rel="nofollow">Change Transaction State</a> update action.</p>
     * @return state
     */
    @NotNull
    @JsonProperty("state")
    public TransactionState getState();

    /**
     *  <p>Unique identifier for the <a href="https://docs.commercetools.com/apis/ctp:api:type:Transaction" rel="nofollow">Transaction</a> for which the <a href="https://docs.commercetools.com/apis/ctp:api:type:TransactionState" rel="nofollow">Transaction State</a> changed.</p>
     * @param transactionId value to be set
     */

    public void setTransactionId(final String transactionId);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:TransactionState" rel="nofollow">Transaction State</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentChangeTransactionStateAction" rel="nofollow">Change Transaction State</a> update action.</p>
     * @param state value to be set
     */

    public void setState(final TransactionState state);

    /**
     * factory method
     * @return instance of PaymentTransactionStateChangedMessagePayload
     */
    public static PaymentTransactionStateChangedMessagePayload of() {
        return new PaymentTransactionStateChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy PaymentTransactionStateChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentTransactionStateChangedMessagePayload of(
            final PaymentTransactionStateChangedMessagePayload template) {
        PaymentTransactionStateChangedMessagePayloadImpl instance = new PaymentTransactionStateChangedMessagePayloadImpl();
        instance.setTransactionId(template.getTransactionId());
        instance.setState(template.getState());
        return instance;
    }

    public PaymentTransactionStateChangedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of PaymentTransactionStateChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentTransactionStateChangedMessagePayload deepCopy(
            @Nullable final PaymentTransactionStateChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        PaymentTransactionStateChangedMessagePayloadImpl instance = new PaymentTransactionStateChangedMessagePayloadImpl();
        instance.setTransactionId(template.getTransactionId());
        instance.setState(template.getState());
        return instance;
    }

    /**
     * builder factory method for PaymentTransactionStateChangedMessagePayload
     * @return builder
     */
    public static PaymentTransactionStateChangedMessagePayloadBuilder builder() {
        return PaymentTransactionStateChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for PaymentTransactionStateChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentTransactionStateChangedMessagePayloadBuilder builder(
            final PaymentTransactionStateChangedMessagePayload template) {
        return PaymentTransactionStateChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentTransactionStateChangedMessagePayload(
            Function<PaymentTransactionStateChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentTransactionStateChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentTransactionStateChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentTransactionStateChangedMessagePayload>";
            }
        };
    }
}
