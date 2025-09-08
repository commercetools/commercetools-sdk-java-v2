
package com.commercetools.checkout.models.transaction;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.checkout.models.common.Amount;
import com.commercetools.checkout.models.payment.PaymentReference;
import com.commercetools.checkout.models.payment_integration.PaymentIntegrationReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Payment information related to the <span>Transaction</span>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TransactionItem transactionItem = TransactionItem.builder()
 *             .paymentIntegration(paymentIntegrationBuilder -> paymentIntegrationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TransactionItemImpl.class)
public interface TransactionItem {

    /**
     *  <p>Reference to the <span>Payment</span> associated with the Transaction Item.</p>
     * @return payment
     */
    @Valid
    @JsonProperty("payment")
    public PaymentReference getPayment();

    /**
     *  <p>Reference to the <span>Payment Integration</span> to use to execute the payment.</p>
     * @return paymentIntegration
     */
    @NotNull
    @Valid
    @JsonProperty("paymentIntegration")
    public PaymentIntegrationReference getPaymentIntegration();

    /**
     *  <p>Money value of the Transaction Item.</p>
     * @return amount
     */
    @Valid
    @JsonProperty("amount")
    public Amount getAmount();

    /**
     *  <p>Reference to the <span>Payment</span> associated with the Transaction Item.</p>
     * @param payment value to be set
     */

    public void setPayment(final PaymentReference payment);

    /**
     *  <p>Reference to the <span>Payment Integration</span> to use to execute the payment.</p>
     * @param paymentIntegration value to be set
     */

    public void setPaymentIntegration(final PaymentIntegrationReference paymentIntegration);

    /**
     *  <p>Money value of the Transaction Item.</p>
     * @param amount value to be set
     */

    public void setAmount(final Amount amount);

    /**
     * factory method
     * @return instance of TransactionItem
     */
    public static TransactionItem of() {
        return new TransactionItemImpl();
    }

    /**
     * factory method to create a shallow copy TransactionItem
     * @param template instance to be copied
     * @return copy instance
     */
    public static TransactionItem of(final TransactionItem template) {
        TransactionItemImpl instance = new TransactionItemImpl();
        instance.setPayment(template.getPayment());
        instance.setPaymentIntegration(template.getPaymentIntegration());
        instance.setAmount(template.getAmount());
        return instance;
    }

    public TransactionItem copyDeep();

    /**
     * factory method to create a deep copy of TransactionItem
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TransactionItem deepCopy(@Nullable final TransactionItem template) {
        if (template == null) {
            return null;
        }
        TransactionItemImpl instance = new TransactionItemImpl();
        instance.setPayment(com.commercetools.checkout.models.payment.PaymentReference.deepCopy(template.getPayment()));
        instance.setPaymentIntegration(com.commercetools.checkout.models.payment_integration.PaymentIntegrationReference
                .deepCopy(template.getPaymentIntegration()));
        instance.setAmount(com.commercetools.checkout.models.common.Amount.deepCopy(template.getAmount()));
        return instance;
    }

    /**
     * builder factory method for TransactionItem
     * @return builder
     */
    public static TransactionItemBuilder builder() {
        return TransactionItemBuilder.of();
    }

    /**
     * create builder for TransactionItem instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TransactionItemBuilder builder(final TransactionItem template) {
        return TransactionItemBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTransactionItem(Function<TransactionItem, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TransactionItem> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TransactionItem>() {
            @Override
            public String toString() {
                return "TypeReference<TransactionItem>";
            }
        };
    }
}
