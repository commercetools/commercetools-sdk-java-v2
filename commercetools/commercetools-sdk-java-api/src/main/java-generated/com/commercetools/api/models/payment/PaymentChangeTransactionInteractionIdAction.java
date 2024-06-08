
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
 * PaymentChangeTransactionInteractionIdAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentChangeTransactionInteractionIdAction paymentChangeTransactionInteractionIdAction = PaymentChangeTransactionInteractionIdAction.builder()
 *             .transactionId("{transactionId}")
 *             .interactionId("{interactionId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentChangeTransactionInteractionIdActionImpl.class)
public interface PaymentChangeTransactionInteractionIdAction extends PaymentUpdateAction {

    /**
     * discriminator value for PaymentChangeTransactionInteractionIdAction
     */
    String CHANGE_TRANSACTION_INTERACTION_ID = "changeTransactionInteractionId";

    /**
     *  <p>Unique identifier of the Transaction.</p>
     * @return transactionId
     */
    @NotNull
    @JsonProperty("transactionId")
    public String getTransactionId();

    /**
     *  <p>New value to set.</p>
     * @return interactionId
     */
    @NotNull
    @JsonProperty("interactionId")
    public String getInteractionId();

    /**
     *  <p>Unique identifier of the Transaction.</p>
     * @param transactionId value to be set
     */

    public void setTransactionId(final String transactionId);

    /**
     *  <p>New value to set.</p>
     * @param interactionId value to be set
     */

    public void setInteractionId(final String interactionId);

    /**
     * factory method
     * @return instance of PaymentChangeTransactionInteractionIdAction
     */
    public static PaymentChangeTransactionInteractionIdAction of() {
        return new PaymentChangeTransactionInteractionIdActionImpl();
    }

    /**
     * factory method to create a shallow copy PaymentChangeTransactionInteractionIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentChangeTransactionInteractionIdAction of(
            final PaymentChangeTransactionInteractionIdAction template) {
        PaymentChangeTransactionInteractionIdActionImpl instance = new PaymentChangeTransactionInteractionIdActionImpl();
        instance.setTransactionId(template.getTransactionId());
        instance.setInteractionId(template.getInteractionId());
        return instance;
    }

    /**
     * factory method to create a deep copy of PaymentChangeTransactionInteractionIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentChangeTransactionInteractionIdAction deepCopy(
            @Nullable final PaymentChangeTransactionInteractionIdAction template) {
        if (template == null) {
            return null;
        }
        PaymentChangeTransactionInteractionIdActionImpl instance = new PaymentChangeTransactionInteractionIdActionImpl();
        instance.setTransactionId(template.getTransactionId());
        instance.setInteractionId(template.getInteractionId());
        return instance;
    }

    /**
     * builder factory method for PaymentChangeTransactionInteractionIdAction
     * @return builder
     */
    public static PaymentChangeTransactionInteractionIdActionBuilder builder() {
        return PaymentChangeTransactionInteractionIdActionBuilder.of();
    }

    /**
     * create builder for PaymentChangeTransactionInteractionIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentChangeTransactionInteractionIdActionBuilder builder(
            final PaymentChangeTransactionInteractionIdAction template) {
        return PaymentChangeTransactionInteractionIdActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentChangeTransactionInteractionIdAction(
            Function<PaymentChangeTransactionInteractionIdAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentChangeTransactionInteractionIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentChangeTransactionInteractionIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentChangeTransactionInteractionIdAction>";
            }
        };
    }
}
