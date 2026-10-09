
package com.commercetools.checkout.models.transaction;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.checkout.models.payment_integration.PaymentIntegrationReference;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>A Transaction Item processed through a <span>Payment Integration</span>. This is the default Transaction Item type used when <code>type</code> is not present.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TransactionItemPaymentIntegration transactionItemPaymentIntegration = TransactionItemPaymentIntegration.builder()
 *             .paymentIntegration(paymentIntegrationBuilder -> paymentIntegrationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface TransactionItemPaymentIntegration extends TransactionItem {

    /**
     *  <p>Not present for TransactionItemPaymentIntegration.</p>
     * @return type
     */

    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:checkout:type:PaymentIntegration" rel="nofollow">Payment Integration</a> used to execute the payment.</p>
     * @return paymentIntegration
     */
    @NotNull
    @Valid
    @JsonProperty("paymentIntegration")
    public PaymentIntegrationReference getPaymentIntegration();

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:checkout:type:PaymentIntegration" rel="nofollow">Payment Integration</a> used to execute the payment.</p>
     * @param paymentIntegration value to be set
     */

    public void setPaymentIntegration(final PaymentIntegrationReference paymentIntegration);

    public TransactionItemPaymentIntegration copyDeep();

    /**
     * factory method to create a deep copy of TransactionItemPaymentIntegration
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TransactionItemPaymentIntegration deepCopy(
            @Nullable final TransactionItemPaymentIntegration template) {
        if (template == null) {
            return null;
        }
        TransactionItemPaymentIntegrationImpl instance = new TransactionItemPaymentIntegrationImpl();
        instance.setAmount(com.commercetools.checkout.models.common.Amount.deepCopy(template.getAmount()));
        instance.setPayment(com.commercetools.checkout.models.payment.PaymentReference.deepCopy(template.getPayment()));
        instance.setPaymentIntegration(com.commercetools.checkout.models.payment_integration.PaymentIntegrationReference
                .deepCopy(template.getPaymentIntegration()));
        return instance;
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTransactionItemPaymentIntegration(Function<TransactionItemPaymentIntegration, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<TransactionItemPaymentIntegration> typeReference() {
        return new tools.jackson.core.type.TypeReference<TransactionItemPaymentIntegration>() {
            @Override
            public String toString() {
                return "TypeReference<TransactionItemPaymentIntegration>";
            }
        };
    }
}
