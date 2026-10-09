
package com.commercetools.checkout.models.transaction;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.checkout.models.common.Amount;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Base type for creating a Transaction Item. If <code>type</code> is omitted, a <a href="https://docs.commercetools.com/apis/ctp:checkout:type:TransactionItemPaymentIntegrationDraft" rel="nofollow">TransactionItemPaymentIntegrationDraft</a> is created to process the payment through a Payment Integration. Each supported payment flow has its own corresponding Transaction Item Draft type, like <a href="https://docs.commercetools.com/apis/ctp:checkout:type:TransactionItemRecurringDraft" rel="nofollow">TransactionItemRecurringDraft</a>.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TransactionItemDraft transactionItemDraft = TransactionItemDraft.recurringBuilder()
 *             paymentMethod(paymentMethodBuilder -> paymentMethodBuilder)
 *             connectorDeployment(connectorDeploymentBuilder -> connectorDeploymentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = TransactionItemDraftImpl.class, visible = true)
@JsonDeserialize(as = TransactionItemDraftImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface TransactionItemDraft {

    /**
     *  <p>Type of the Transaction Item to create.</p>
     * @return type
     */

    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Money value of the Transaction Item. If not present, the Connector resolves the amount from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>.</p>
     * @return amount
     */
    @Valid
    @JsonProperty("amount")
    public Amount getAmount();

    /**
     *  <p>Money value of the Transaction Item. If not present, the Connector resolves the amount from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>.</p>
     * @param amount value to be set
     */

    public void setAmount(final Amount amount);

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

        if (!(template instanceof TransactionItemDraftImpl)) {
            return template.copyDeep();
        }
        TransactionItemDraftImpl instance = new TransactionItemDraftImpl();
        instance.setAmount(com.commercetools.checkout.models.common.Amount.deepCopy(template.getAmount()));
        return instance;
    }

    /**
     * builder for recurring subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.transaction.TransactionItemRecurringDraftBuilder recurringBuilder() {
        return com.commercetools.checkout.models.transaction.TransactionItemRecurringDraftBuilder.of();
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
    public static tools.jackson.core.type.TypeReference<TransactionItemDraft> typeReference() {
        return new tools.jackson.core.type.TypeReference<TransactionItemDraft>() {
            @Override
            public String toString() {
                return "TypeReference<TransactionItemDraft>";
            }
        };
    }
}
