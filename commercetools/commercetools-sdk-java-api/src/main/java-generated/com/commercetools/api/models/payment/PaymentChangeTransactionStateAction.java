
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Changing the TransactionState generates the PaymentTransactionStateChanged Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentChangeTransactionStateAction paymentChangeTransactionStateAction = PaymentChangeTransactionStateAction.builder()
 *             .transactionId("{transactionId}")
 *             .state(TransactionState.INITIAL)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeTransactionState")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentChangeTransactionStateActionImpl.class)
public interface PaymentChangeTransactionStateAction extends PaymentUpdateAction {

    /**
     * discriminator value for PaymentChangeTransactionStateAction
     */
    String CHANGE_TRANSACTION_STATE = "changeTransactionState";

    /**
     *  <p>Unique identifier of the Transaction.</p>
     * @return transactionId
     */
    @NotNull
    @JsonProperty("transactionId")
    public String getTransactionId();

    /**
     *  <p>New TransactionState.</p>
     * @return state
     */
    @NotNull
    @JsonProperty("state")
    public TransactionState getState();

    /**
     *  <p>Unique identifier of the Transaction.</p>
     * @param transactionId value to be set
     */

    public void setTransactionId(final String transactionId);

    /**
     *  <p>New TransactionState.</p>
     * @param state value to be set
     */

    public void setState(final TransactionState state);

    /**
     * factory method
     * @return instance of PaymentChangeTransactionStateAction
     */
    public static PaymentChangeTransactionStateAction of() {
        return new PaymentChangeTransactionStateActionImpl();
    }

    /**
     * factory method to create a shallow copy PaymentChangeTransactionStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentChangeTransactionStateAction of(final PaymentChangeTransactionStateAction template) {
        PaymentChangeTransactionStateActionImpl instance = new PaymentChangeTransactionStateActionImpl();
        instance.setTransactionId(template.getTransactionId());
        instance.setState(template.getState());
        return instance;
    }

    public PaymentChangeTransactionStateAction copyDeep();

    /**
     * factory method to create a deep copy of PaymentChangeTransactionStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentChangeTransactionStateAction deepCopy(
            @Nullable final PaymentChangeTransactionStateAction template) {
        if (template == null) {
            return null;
        }
        PaymentChangeTransactionStateActionImpl instance = new PaymentChangeTransactionStateActionImpl();
        instance.setTransactionId(template.getTransactionId());
        instance.setState(template.getState());
        return instance;
    }

    /**
     * builder factory method for PaymentChangeTransactionStateAction
     * @return builder
     */
    public static PaymentChangeTransactionStateActionBuilder builder() {
        return PaymentChangeTransactionStateActionBuilder.of();
    }

    /**
     * create builder for PaymentChangeTransactionStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentChangeTransactionStateActionBuilder builder(
            final PaymentChangeTransactionStateAction template) {
        return PaymentChangeTransactionStateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentChangeTransactionStateAction(Function<PaymentChangeTransactionStateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentChangeTransactionStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentChangeTransactionStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentChangeTransactionStateAction>";
            }
        };
    }
}
