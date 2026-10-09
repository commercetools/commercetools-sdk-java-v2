
package com.commercetools.checkout.models.transaction;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.checkout.models.common.PaymentMethodReference;
import com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Creates a Transaction Item to process a recurring payment for a <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> using a specific connector deployment. The <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> referenced by the Transaction must have the same <code>customerId</code> as the referenced PaymentMethod.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TransactionItemRecurringDraft transactionItemRecurringDraft = TransactionItemRecurringDraft.builder()
 *             .paymentMethod(paymentMethodBuilder -> paymentMethodBuilder)
 *             .connectorDeployment(connectorDeploymentBuilder -> connectorDeploymentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("Recurring")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TransactionItemRecurringDraftImpl.class)
public interface TransactionItemRecurringDraft
        extends TransactionItemDraft, io.vrap.rmf.base.client.Draft<TransactionItemRecurringDraft> {

    /**
     * discriminator value for TransactionItemRecurringDraft
     */
    String RECURRING = "Recurring";

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> to charge. The PaymentMethod must belong to the same customer as the Cart referenced by the Transaction.</p>
     * @return paymentMethod
     */
    @NotNull
    @Valid
    @JsonProperty("paymentMethod")
    public PaymentMethodReference getPaymentMethod();

    /**
     *  <p>Reference to the connector deployment to use to execute the payment.</p>
     * @return connectorDeployment
     */
    @NotNull
    @Valid
    @JsonProperty("connectorDeployment")
    public ConnectorDeploymentReference getConnectorDeployment();

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> to charge. The PaymentMethod must belong to the same customer as the Cart referenced by the Transaction.</p>
     * @param paymentMethod value to be set
     */

    public void setPaymentMethod(final PaymentMethodReference paymentMethod);

    /**
     *  <p>Reference to the connector deployment to use to execute the payment.</p>
     * @param connectorDeployment value to be set
     */

    public void setConnectorDeployment(final ConnectorDeploymentReference connectorDeployment);

    /**
     * factory method
     * @return instance of TransactionItemRecurringDraft
     */
    public static TransactionItemRecurringDraft of() {
        return new TransactionItemRecurringDraftImpl();
    }

    /**
     * factory method to create a shallow copy TransactionItemRecurringDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static TransactionItemRecurringDraft of(final TransactionItemRecurringDraft template) {
        TransactionItemRecurringDraftImpl instance = new TransactionItemRecurringDraftImpl();
        instance.setAmount(template.getAmount());
        instance.setPaymentMethod(template.getPaymentMethod());
        instance.setConnectorDeployment(template.getConnectorDeployment());
        return instance;
    }

    public TransactionItemRecurringDraft copyDeep();

    /**
     * factory method to create a deep copy of TransactionItemRecurringDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TransactionItemRecurringDraft deepCopy(@Nullable final TransactionItemRecurringDraft template) {
        if (template == null) {
            return null;
        }
        TransactionItemRecurringDraftImpl instance = new TransactionItemRecurringDraftImpl();
        instance.setAmount(com.commercetools.checkout.models.common.Amount.deepCopy(template.getAmount()));
        instance.setPaymentMethod(
            com.commercetools.checkout.models.common.PaymentMethodReference.deepCopy(template.getPaymentMethod()));
        instance.setConnectorDeployment(
            com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference
                    .deepCopy(template.getConnectorDeployment()));
        return instance;
    }

    /**
     * builder factory method for TransactionItemRecurringDraft
     * @return builder
     */
    public static TransactionItemRecurringDraftBuilder builder() {
        return TransactionItemRecurringDraftBuilder.of();
    }

    /**
     * create builder for TransactionItemRecurringDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TransactionItemRecurringDraftBuilder builder(final TransactionItemRecurringDraft template) {
        return TransactionItemRecurringDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTransactionItemRecurringDraft(Function<TransactionItemRecurringDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<TransactionItemRecurringDraft> typeReference() {
        return new tools.jackson.core.type.TypeReference<TransactionItemRecurringDraft>() {
            @Override
            public String toString() {
                return "TypeReference<TransactionItemRecurringDraft>";
            }
        };
    }
}
