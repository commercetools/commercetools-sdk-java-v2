
package com.commercetools.checkout.models.transaction;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.checkout.models.payment_integration.PaymentIntegrationResourceIdentifier;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Creates a Transaction Item that is processed through a <span>Payment Integration</span>. This is the default Transaction Item type used when <code>type</code> is omitted.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TransactionItemPaymentIntegrationDraft transactionItemPaymentIntegrationDraft = TransactionItemPaymentIntegrationDraft.builder()
 *             .paymentIntegration(paymentIntegrationBuilder -> paymentIntegrationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface TransactionItemPaymentIntegrationDraft
        extends TransactionItemDraft, io.vrap.rmf.base.client.Draft<TransactionItemPaymentIntegrationDraft> {

    /**
     *  <p>Must not be set for TransactionItemPaymentIntegrationDraft.</p>
     * @return type
     */

    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Resource Identifier of the <span>Payment Integration</span> to use to execute the payment.</p>
     * @return paymentIntegration
     */
    @NotNull
    @Valid
    @JsonProperty("paymentIntegration")
    public PaymentIntegrationResourceIdentifier getPaymentIntegration();

    /**
     *  <p>Resource Identifier of the <span>Payment Integration</span> to use to execute the payment.</p>
     * @param paymentIntegration value to be set
     */

    public void setPaymentIntegration(final PaymentIntegrationResourceIdentifier paymentIntegration);

    public TransactionItemPaymentIntegrationDraft copyDeep();

    /**
     * factory method to create a deep copy of TransactionItemPaymentIntegrationDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TransactionItemPaymentIntegrationDraft deepCopy(
            @Nullable final TransactionItemPaymentIntegrationDraft template) {
        if (template == null) {
            return null;
        }
        TransactionItemPaymentIntegrationDraftImpl instance = new TransactionItemPaymentIntegrationDraftImpl();
        instance.setAmount(com.commercetools.checkout.models.common.Amount.deepCopy(template.getAmount()));
        instance.setPaymentIntegration(
            com.commercetools.checkout.models.payment_integration.PaymentIntegrationResourceIdentifier
                    .deepCopy(template.getPaymentIntegration()));
        return instance;
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTransactionItemPaymentIntegrationDraft(
            Function<TransactionItemPaymentIntegrationDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<TransactionItemPaymentIntegrationDraft> typeReference() {
        return new tools.jackson.core.type.TypeReference<TransactionItemPaymentIntegrationDraft>() {
            @Override
            public String toString() {
                return "TypeReference<TransactionItemPaymentIntegrationDraft>";
            }
        };
    }
}
