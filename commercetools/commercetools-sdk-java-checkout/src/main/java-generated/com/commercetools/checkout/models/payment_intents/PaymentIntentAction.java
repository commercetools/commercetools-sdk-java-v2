
package com.commercetools.checkout.models.payment_intents;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.checkout.models.common.Amount;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Depending on the action specified, Checkout requests the <span>payment service provider</span> (PSP) or gift card management system to capture, refund, or cancel the authorization for the given Payment.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntentAction paymentIntentAction = PaymentIntentAction.builder()
 *             .action(PaymentIntentOperation.CAPTURE_PAYMENT)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentIntentActionImpl.class)
public interface PaymentIntentAction {

    /**
     *  <p>Action to execute for the given <span>Payment</span>.</p>
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public PaymentIntentOperation getAction();

    /**
     *  <p>Amount to be captured or refunded.</p>
     * @return amount
     */
    @Valid
    @JsonProperty("amount")
    public Amount getAmount();

    /**
     *  <p>A merchant-defined identifier associated with the Payment to track and reconcile the Payment Intent Action on the merchant's side. For example, an invoice number.</p>
     * @return merchantReference
     */

    @JsonProperty("merchantReference")
    public String getMerchantReference();

    /**
     *  <p>Action to execute for the given <span>Payment</span>.</p>
     * @param action value to be set
     */

    public void setAction(final PaymentIntentOperation action);

    /**
     *  <p>Amount to be captured or refunded.</p>
     * @param amount value to be set
     */

    public void setAmount(final Amount amount);

    /**
     *  <p>A merchant-defined identifier associated with the Payment to track and reconcile the Payment Intent Action on the merchant's side. For example, an invoice number.</p>
     * @param merchantReference value to be set
     */

    public void setMerchantReference(final String merchantReference);

    /**
     * factory method
     * @return instance of PaymentIntentAction
     */
    public static PaymentIntentAction of() {
        return new PaymentIntentActionImpl();
    }

    /**
     * factory method to create a shallow copy PaymentIntentAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentIntentAction of(final PaymentIntentAction template) {
        PaymentIntentActionImpl instance = new PaymentIntentActionImpl();
        instance.setAction(template.getAction());
        instance.setAmount(template.getAmount());
        instance.setMerchantReference(template.getMerchantReference());
        return instance;
    }

    public PaymentIntentAction copyDeep();

    /**
     * factory method to create a deep copy of PaymentIntentAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentIntentAction deepCopy(@Nullable final PaymentIntentAction template) {
        if (template == null) {
            return null;
        }
        PaymentIntentActionImpl instance = new PaymentIntentActionImpl();
        instance.setAction(template.getAction());
        instance.setAmount(com.commercetools.checkout.models.common.Amount.deepCopy(template.getAmount()));
        instance.setMerchantReference(template.getMerchantReference());
        return instance;
    }

    /**
     * builder factory method for PaymentIntentAction
     * @return builder
     */
    public static PaymentIntentActionBuilder builder() {
        return PaymentIntentActionBuilder.of();
    }

    /**
     * create builder for PaymentIntentAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntentActionBuilder builder(final PaymentIntentAction template) {
        return PaymentIntentActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentIntentAction(Function<PaymentIntentAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentIntentAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentIntentAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentIntentAction>";
            }
        };
    }
}
