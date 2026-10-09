
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
 *  <p>A Transaction Item processing a recurring payment for a <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TransactionItemRecurring transactionItemRecurring = TransactionItemRecurring.builder()
 *             .paymentMethod(paymentMethodBuilder -> paymentMethodBuilder)
 *             .connectorDeployment(connectorDeploymentBuilder -> connectorDeploymentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("Recurring")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TransactionItemRecurringImpl.class)
public interface TransactionItemRecurring extends TransactionItem {

    /**
     * discriminator value for TransactionItemRecurring
     */
    String RECURRING = "Recurring";

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> charged for the Transaction Item.</p>
     * @return paymentMethod
     */
    @NotNull
    @Valid
    @JsonProperty("paymentMethod")
    public PaymentMethodReference getPaymentMethod();

    /**
     *  <p>Reference to the connector deployment used to execute the payment.</p>
     * @return connectorDeployment
     */
    @NotNull
    @Valid
    @JsonProperty("connectorDeployment")
    public ConnectorDeploymentReference getConnectorDeployment();

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> charged for the Transaction Item.</p>
     * @param paymentMethod value to be set
     */

    public void setPaymentMethod(final PaymentMethodReference paymentMethod);

    /**
     *  <p>Reference to the connector deployment used to execute the payment.</p>
     * @param connectorDeployment value to be set
     */

    public void setConnectorDeployment(final ConnectorDeploymentReference connectorDeployment);

    /**
     * factory method
     * @return instance of TransactionItemRecurring
     */
    public static TransactionItemRecurring of() {
        return new TransactionItemRecurringImpl();
    }

    /**
     * factory method to create a shallow copy TransactionItemRecurring
     * @param template instance to be copied
     * @return copy instance
     */
    public static TransactionItemRecurring of(final TransactionItemRecurring template) {
        TransactionItemRecurringImpl instance = new TransactionItemRecurringImpl();
        instance.setAmount(template.getAmount());
        instance.setPayment(template.getPayment());
        instance.setPaymentMethod(template.getPaymentMethod());
        instance.setConnectorDeployment(template.getConnectorDeployment());
        return instance;
    }

    public TransactionItemRecurring copyDeep();

    /**
     * factory method to create a deep copy of TransactionItemRecurring
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TransactionItemRecurring deepCopy(@Nullable final TransactionItemRecurring template) {
        if (template == null) {
            return null;
        }
        TransactionItemRecurringImpl instance = new TransactionItemRecurringImpl();
        instance.setAmount(com.commercetools.checkout.models.common.Amount.deepCopy(template.getAmount()));
        instance.setPayment(com.commercetools.checkout.models.payment.PaymentReference.deepCopy(template.getPayment()));
        instance.setPaymentMethod(
            com.commercetools.checkout.models.common.PaymentMethodReference.deepCopy(template.getPaymentMethod()));
        instance.setConnectorDeployment(
            com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference
                    .deepCopy(template.getConnectorDeployment()));
        return instance;
    }

    /**
     * builder factory method for TransactionItemRecurring
     * @return builder
     */
    public static TransactionItemRecurringBuilder builder() {
        return TransactionItemRecurringBuilder.of();
    }

    /**
     * create builder for TransactionItemRecurring instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TransactionItemRecurringBuilder builder(final TransactionItemRecurring template) {
        return TransactionItemRecurringBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTransactionItemRecurring(Function<TransactionItemRecurring, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<TransactionItemRecurring> typeReference() {
        return new tools.jackson.core.type.TypeReference<TransactionItemRecurring>() {
            @Override
            public String toString() {
                return "TypeReference<TransactionItemRecurring>";
            }
        };
    }
}
