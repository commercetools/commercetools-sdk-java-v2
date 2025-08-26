
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
 *  <p>Requests to <span>capture</span> the given amount from the customer. Checkout will request the PSP or gift card management system to proceed with the financial process to capture the amount.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntentCaptureAction paymentIntentCaptureAction = PaymentIntentCaptureAction.builder()
 *             .amount(amountBuilder -> amountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("capturePayment")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentIntentCaptureActionImpl.class)
public interface PaymentIntentCaptureAction {

    /**
     * discriminator value for PaymentIntentCaptureAction
     */
    String CAPTURE_PAYMENT = "capturePayment";

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     *  <p>Amount to be captured. It must be less than or equal to the <span>authorized</span> amount.</p>
     * @return amount
     */
    @NotNull
    @Valid
    @JsonProperty("amount")
    public Amount getAmount();

    /**
     *  <p>A merchant-defined identifier associated with the <span>Payment</span> to track and reconcile the <a href="https://docs.commercetools.com/apis/ctp:checkout:type:PaymentIntentAction" rel="nofollow">Payment Intent Action</a> on the merchant's side. For example, an invoice number.</p>
     * @return merchantReference
     */

    @JsonProperty("merchantReference")
    public String getMerchantReference();

    /**
     *  <p>Amount to be captured. It must be less than or equal to the <span>authorized</span> amount.</p>
     * @param amount value to be set
     */

    public void setAmount(final Amount amount);

    /**
     *  <p>A merchant-defined identifier associated with the <span>Payment</span> to track and reconcile the <a href="https://docs.commercetools.com/apis/ctp:checkout:type:PaymentIntentAction" rel="nofollow">Payment Intent Action</a> on the merchant's side. For example, an invoice number.</p>
     * @param merchantReference value to be set
     */

    public void setMerchantReference(final String merchantReference);

    /**
     * factory method
     * @return instance of PaymentIntentCaptureAction
     */
    public static PaymentIntentCaptureAction of() {
        return new PaymentIntentCaptureActionImpl();
    }

    /**
     * factory method to create a shallow copy PaymentIntentCaptureAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentIntentCaptureAction of(final PaymentIntentCaptureAction template) {
        PaymentIntentCaptureActionImpl instance = new PaymentIntentCaptureActionImpl();
        instance.setAmount(template.getAmount());
        instance.setMerchantReference(template.getMerchantReference());
        return instance;
    }

    public PaymentIntentCaptureAction copyDeep();

    /**
     * factory method to create a deep copy of PaymentIntentCaptureAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentIntentCaptureAction deepCopy(@Nullable final PaymentIntentCaptureAction template) {
        if (template == null) {
            return null;
        }
        PaymentIntentCaptureActionImpl instance = new PaymentIntentCaptureActionImpl();
        instance.setAmount(com.commercetools.checkout.models.common.Amount.deepCopy(template.getAmount()));
        instance.setMerchantReference(template.getMerchantReference());
        return instance;
    }

    /**
     * builder factory method for PaymentIntentCaptureAction
     * @return builder
     */
    public static PaymentIntentCaptureActionBuilder builder() {
        return PaymentIntentCaptureActionBuilder.of();
    }

    /**
     * create builder for PaymentIntentCaptureAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntentCaptureActionBuilder builder(final PaymentIntentCaptureAction template) {
        return PaymentIntentCaptureActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentIntentCaptureAction(Function<PaymentIntentCaptureAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentIntentCaptureAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentIntentCaptureAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentIntentCaptureAction>";
            }
        };
    }
}
