
package com.commercetools.checkout.models.payment_intents;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Requests to <span>cancel the authorization</span> for a Payment. Checkout will cancel the <span>Payment</span> and will request the PSP or gift card management system to proceed with the financial process to cancel the authorization.</p>
 *  <p>You cannot request to cancel the authorization for a Payment that has already been <span>captured</span>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntentCancelAction paymentIntentCancelAction = PaymentIntentCancelAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("cancelPayment")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentIntentCancelActionImpl.class)
public interface PaymentIntentCancelAction {

    /**
     * discriminator value for PaymentIntentCancelAction
     */
    String CANCEL_PAYMENT = "cancelPayment";

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     *  <p>A merchant-defined identifier associated with the <span>Payment</span> to track and reconcile the <a href="https://docs.commercetools.com/apis/ctp:checkout:type:PaymentIntentAction" rel="nofollow">Payment Intent Action</a> on the merchant's side. For example, an invoice number.</p>
     * @return merchantReference
     */

    @JsonProperty("merchantReference")
    public String getMerchantReference();

    /**
     *  <p>A merchant-defined identifier associated with the <span>Payment</span> to track and reconcile the <a href="https://docs.commercetools.com/apis/ctp:checkout:type:PaymentIntentAction" rel="nofollow">Payment Intent Action</a> on the merchant's side. For example, an invoice number.</p>
     * @param merchantReference value to be set
     */

    public void setMerchantReference(final String merchantReference);

    /**
     * factory method
     * @return instance of PaymentIntentCancelAction
     */
    public static PaymentIntentCancelAction of() {
        return new PaymentIntentCancelActionImpl();
    }

    /**
     * factory method to create a shallow copy PaymentIntentCancelAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentIntentCancelAction of(final PaymentIntentCancelAction template) {
        PaymentIntentCancelActionImpl instance = new PaymentIntentCancelActionImpl();
        instance.setMerchantReference(template.getMerchantReference());
        return instance;
    }

    public PaymentIntentCancelAction copyDeep();

    /**
     * factory method to create a deep copy of PaymentIntentCancelAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentIntentCancelAction deepCopy(@Nullable final PaymentIntentCancelAction template) {
        if (template == null) {
            return null;
        }
        PaymentIntentCancelActionImpl instance = new PaymentIntentCancelActionImpl();
        instance.setMerchantReference(template.getMerchantReference());
        return instance;
    }

    /**
     * builder factory method for PaymentIntentCancelAction
     * @return builder
     */
    public static PaymentIntentCancelActionBuilder builder() {
        return PaymentIntentCancelActionBuilder.of();
    }

    /**
     * create builder for PaymentIntentCancelAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntentCancelActionBuilder builder(final PaymentIntentCancelAction template) {
        return PaymentIntentCancelActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentIntentCancelAction(Function<PaymentIntentCancelAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentIntentCancelAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentIntentCancelAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentIntentCancelAction>";
            }
        };
    }
}
