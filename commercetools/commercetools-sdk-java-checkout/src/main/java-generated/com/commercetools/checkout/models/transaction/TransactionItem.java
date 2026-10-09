
package com.commercetools.checkout.models.transaction;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.checkout.models.common.Amount;
import com.commercetools.checkout.models.payment.PaymentReference;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Payment information related to the <a href="https://docs.commercetools.com/apis/ctp:checkout:type:Transaction" rel="nofollow">Transaction</a>. If <code>type</code> is not present, this is a <a href="https://docs.commercetools.com/apis/ctp:checkout:type:TransactionItemPaymentIntegration" rel="nofollow">TransactionItemPaymentIntegration</a>. Each supported payment flow has its own corresponding Transaction Item type, like <a href="https://docs.commercetools.com/apis/ctp:checkout:type:TransactionItemRecurring" rel="nofollow">TransactionItemRecurring</a>.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TransactionItem transactionItem = TransactionItem.recurringBuilder()
 *             paymentMethod(paymentMethodBuilder -> paymentMethodBuilder)
 *             connectorDeployment(connectorDeploymentBuilder -> connectorDeploymentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = TransactionItemImpl.class, visible = true)
@JsonDeserialize(as = TransactionItemImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface TransactionItem {

    /**
     *  <p>Type of the Transaction Item, matching the <code>type</code> of the <a href="https://docs.commercetools.com/apis/ctp:checkout:type:TransactionItemDraft" rel="nofollow">TransactionItemDraft</a> it was created from. Not present for Transaction Items created without an explicit <code>type</code>.</p>
     * @return type
     */

    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Money value of the Transaction Item.</p>
     * @return amount
     */
    @Valid
    @JsonProperty("amount")
    public Amount getAmount();

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a> associated with the Transaction Item.</p>
     * @return payment
     */
    @Valid
    @JsonProperty("payment")
    public PaymentReference getPayment();

    /**
     *  <p>Money value of the Transaction Item.</p>
     * @param amount value to be set
     */

    public void setAmount(final Amount amount);

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a> associated with the Transaction Item.</p>
     * @param payment value to be set
     */

    public void setPayment(final PaymentReference payment);

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

        if (!(template instanceof TransactionItemImpl)) {
            return template.copyDeep();
        }
        TransactionItemImpl instance = new TransactionItemImpl();
        instance.setAmount(com.commercetools.checkout.models.common.Amount.deepCopy(template.getAmount()));
        instance.setPayment(com.commercetools.checkout.models.payment.PaymentReference.deepCopy(template.getPayment()));
        return instance;
    }

    /**
     * builder for recurring subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.transaction.TransactionItemRecurringBuilder recurringBuilder() {
        return com.commercetools.checkout.models.transaction.TransactionItemRecurringBuilder.of();
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
    public static tools.jackson.core.type.TypeReference<TransactionItem> typeReference() {
        return new tools.jackson.core.type.TypeReference<TransactionItem>() {
            @Override
            public String toString() {
                return "TypeReference<TransactionItem>";
            }
        };
    }
}
