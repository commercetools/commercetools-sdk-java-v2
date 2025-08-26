
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
 *  <p>Requests to <span>refund</span> the given amount to the customer. Checkout will request the PSP or gift card management system to proceed with the financial process to refund the amount.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntentRefundAction paymentIntentRefundAction = PaymentIntentRefundAction.builder()
 *             .amount(amountBuilder -> amountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("refundPayment")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentIntentRefundActionImpl.class)
public interface PaymentIntentRefundAction {

    /**
     * discriminator value for PaymentIntentRefundAction
     */
    String REFUND_PAYMENT = "refundPayment";

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     *  <p>Amount to be refunded. It must be less than or equal to the <span>captured</span> amount.</p>
     * @return amount
     */
    @NotNull
    @Valid
    @JsonProperty("amount")
    public Amount getAmount();

    /**
     *  <p>The identifier of the capture transaction that is associated with the refund action.</p>
     * @return transactionId
     */

    @JsonProperty("transactionId")
    public String getTransactionId();

    /**
     *  <p>A merchant-defined identifier associated with the <span>Payment</span> to track and reconcile the <a href="https://docs.commercetools.com/apis/ctp:checkout:type:PaymentIntentAction" rel="nofollow">Payment Intent Action</a> on the merchant's side. For example, an invoice number.</p>
     * @return merchantReference
     */

    @JsonProperty("merchantReference")
    public String getMerchantReference();

    /**
     *  <p>Amount to be refunded. It must be less than or equal to the <span>captured</span> amount.</p>
     * @param amount value to be set
     */

    public void setAmount(final Amount amount);

    /**
     *  <p>The identifier of the capture transaction that is associated with the refund action.</p>
     * @param transactionId value to be set
     */

    public void setTransactionId(final String transactionId);

    /**
     *  <p>A merchant-defined identifier associated with the <span>Payment</span> to track and reconcile the <a href="https://docs.commercetools.com/apis/ctp:checkout:type:PaymentIntentAction" rel="nofollow">Payment Intent Action</a> on the merchant's side. For example, an invoice number.</p>
     * @param merchantReference value to be set
     */

    public void setMerchantReference(final String merchantReference);

    /**
     * factory method
     * @return instance of PaymentIntentRefundAction
     */
    public static PaymentIntentRefundAction of() {
        return new PaymentIntentRefundActionImpl();
    }

    /**
     * factory method to create a shallow copy PaymentIntentRefundAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentIntentRefundAction of(final PaymentIntentRefundAction template) {
        PaymentIntentRefundActionImpl instance = new PaymentIntentRefundActionImpl();
        instance.setAmount(template.getAmount());
        instance.setTransactionId(template.getTransactionId());
        instance.setMerchantReference(template.getMerchantReference());
        return instance;
    }

    public PaymentIntentRefundAction copyDeep();

    /**
     * factory method to create a deep copy of PaymentIntentRefundAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentIntentRefundAction deepCopy(@Nullable final PaymentIntentRefundAction template) {
        if (template == null) {
            return null;
        }
        PaymentIntentRefundActionImpl instance = new PaymentIntentRefundActionImpl();
        instance.setAmount(com.commercetools.checkout.models.common.Amount.deepCopy(template.getAmount()));
        instance.setTransactionId(template.getTransactionId());
        instance.setMerchantReference(template.getMerchantReference());
        return instance;
    }

    /**
     * builder factory method for PaymentIntentRefundAction
     * @return builder
     */
    public static PaymentIntentRefundActionBuilder builder() {
        return PaymentIntentRefundActionBuilder.of();
    }

    /**
     * create builder for PaymentIntentRefundAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntentRefundActionBuilder builder(final PaymentIntentRefundAction template) {
        return PaymentIntentRefundActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentIntentRefundAction(Function<PaymentIntentRefundAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentIntentRefundAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentIntentRefundAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentIntentRefundAction>";
            }
        };
    }
}
