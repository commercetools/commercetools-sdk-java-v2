
package com.commercetools.checkout.models.payment_intents;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Requests to <span>reverse</span> a <span>Payment</span>. Checkout reverses the Payment, and then requests the PSP or gift card management system to proceed with the relevant process to reverse the Payment.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntentReverseAction paymentIntentReverseAction = PaymentIntentReverseAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("reversePayment")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentIntentReverseActionImpl.class)
public interface PaymentIntentReverseAction extends PaymentIntentAction {

    /**
     * discriminator value for PaymentIntentReverseAction
     */
    String REVERSE_PAYMENT = "reversePayment";

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
     * @return instance of PaymentIntentReverseAction
     */
    public static PaymentIntentReverseAction of() {
        return new PaymentIntentReverseActionImpl();
    }

    /**
     * factory method to create a shallow copy PaymentIntentReverseAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentIntentReverseAction of(final PaymentIntentReverseAction template) {
        PaymentIntentReverseActionImpl instance = new PaymentIntentReverseActionImpl();
        instance.setMerchantReference(template.getMerchantReference());
        return instance;
    }

    public PaymentIntentReverseAction copyDeep();

    /**
     * factory method to create a deep copy of PaymentIntentReverseAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentIntentReverseAction deepCopy(@Nullable final PaymentIntentReverseAction template) {
        if (template == null) {
            return null;
        }
        PaymentIntentReverseActionImpl instance = new PaymentIntentReverseActionImpl();
        instance.setMerchantReference(template.getMerchantReference());
        return instance;
    }

    /**
     * builder factory method for PaymentIntentReverseAction
     * @return builder
     */
    public static PaymentIntentReverseActionBuilder builder() {
        return PaymentIntentReverseActionBuilder.of();
    }

    /**
     * create builder for PaymentIntentReverseAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntentReverseActionBuilder builder(final PaymentIntentReverseAction template) {
        return PaymentIntentReverseActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentIntentReverseAction(Function<PaymentIntentReverseAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentIntentReverseAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentIntentReverseAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentIntentReverseAction>";
            }
        };
    }
}
