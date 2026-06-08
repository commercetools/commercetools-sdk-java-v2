
package com.commercetools.checkout.models.transaction;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.checkout.models.common.Amount;
import com.commercetools.checkout.models.payment_integration.PaymentIntegrationResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * TransactionItemDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TransactionItemDraft transactionItemDraft = TransactionItemDraft.builder()
 *             .paymentIntegration(paymentIntegrationBuilder -> paymentIntegrationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TransactionItemDraftImpl.class)
public interface TransactionItemDraft extends io.vrap.rmf.base.client.Draft<TransactionItemDraft> {

    /**
     *  <p>Resource Identifier of the <span>Payment Integration</span> to use to execute the payment.</p>
     * @return paymentIntegration
     */
    @NotNull
    @Valid
    @JsonProperty("paymentIntegration")
    public PaymentIntegrationResourceIdentifier getPaymentIntegration();

    /**
     *  <p>Money value of the Transaction Item.</p>
     * @return amount
     */
    @Valid
    @JsonProperty("amount")
    public Amount getAmount();

    /**
     *  <p>Resource Identifier of the <span>Payment Integration</span> to use to execute the payment.</p>
     * @param paymentIntegration value to be set
     */

    public void setPaymentIntegration(final PaymentIntegrationResourceIdentifier paymentIntegration);

    /**
     *  <p>Money value of the Transaction Item.</p>
     * @param amount value to be set
     */

    public void setAmount(final Amount amount);

    /**
     * factory method
     * @return instance of TransactionItemDraft
     */
    public static TransactionItemDraft of() {
        return new TransactionItemDraftImpl();
    }

    /**
     * factory method to create a shallow copy TransactionItemDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static TransactionItemDraft of(final TransactionItemDraft template) {
        TransactionItemDraftImpl instance = new TransactionItemDraftImpl();
        instance.setPaymentIntegration(template.getPaymentIntegration());
        instance.setAmount(template.getAmount());
        return instance;
    }

    public TransactionItemDraft copyDeep();

    /**
     * factory method to create a deep copy of TransactionItemDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TransactionItemDraft deepCopy(@Nullable final TransactionItemDraft template) {
        if (template == null) {
            return null;
        }
        TransactionItemDraftImpl instance = new TransactionItemDraftImpl();
        instance.setPaymentIntegration(
            com.commercetools.checkout.models.payment_integration.PaymentIntegrationResourceIdentifier
                    .deepCopy(template.getPaymentIntegration()));
        instance.setAmount(com.commercetools.checkout.models.common.Amount.deepCopy(template.getAmount()));
        return instance;
    }

    /**
     * builder factory method for TransactionItemDraft
     * @return builder
     */
    public static TransactionItemDraftBuilder builder() {
        return TransactionItemDraftBuilder.of();
    }

    /**
     * create builder for TransactionItemDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TransactionItemDraftBuilder builder(final TransactionItemDraft template) {
        return TransactionItemDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTransactionItemDraft(Function<TransactionItemDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TransactionItemDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TransactionItemDraft>() {
            @Override
            public String toString() {
                return "TypeReference<TransactionItemDraft>";
            }
        };
    }
}
