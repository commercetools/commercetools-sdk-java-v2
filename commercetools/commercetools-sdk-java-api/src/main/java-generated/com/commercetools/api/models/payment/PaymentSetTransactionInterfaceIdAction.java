
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Setting the transaction interface ID produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentTransactionInterfaceIdSetMessage" rel="nofollow">PaymentTransactionInterfaceIdSet</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetTransactionInterfaceIdAction paymentSetTransactionInterfaceIdAction = PaymentSetTransactionInterfaceIdAction.builder()
 *             .transactionId("{transactionId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setTransactionInterfaceId")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentSetTransactionInterfaceIdActionImpl.class)
public interface PaymentSetTransactionInterfaceIdAction extends PaymentUpdateAction {

    /**
     * discriminator value for PaymentSetTransactionInterfaceIdAction
     */
    String SET_TRANSACTION_INTERFACE_ID = "setTransactionInterfaceId";

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Transaction" rel="nofollow">Transaction</a>.</p>
     * @return transactionId
     */
    @NotNull
    @JsonProperty("transactionId")
    public String getTransactionId();

    /**
     *  <p>Identifier used by the payment service that processes the Payment (for example, a PSP) in the current transaction. It must be unique across all transactions. If <code>interfaceId</code> is absent, this field will be removed from the specified Transaction, if it exists.</p>
     * @return interfaceId
     */

    @JsonProperty("interfaceId")
    public String getInterfaceId();

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Transaction" rel="nofollow">Transaction</a>.</p>
     * @param transactionId value to be set
     */

    public void setTransactionId(final String transactionId);

    /**
     *  <p>Identifier used by the payment service that processes the Payment (for example, a PSP) in the current transaction. It must be unique across all transactions. If <code>interfaceId</code> is absent, this field will be removed from the specified Transaction, if it exists.</p>
     * @param interfaceId value to be set
     */

    public void setInterfaceId(final String interfaceId);

    /**
     * factory method
     * @return instance of PaymentSetTransactionInterfaceIdAction
     */
    public static PaymentSetTransactionInterfaceIdAction of() {
        return new PaymentSetTransactionInterfaceIdActionImpl();
    }

    /**
     * factory method to create a shallow copy PaymentSetTransactionInterfaceIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentSetTransactionInterfaceIdAction of(final PaymentSetTransactionInterfaceIdAction template) {
        PaymentSetTransactionInterfaceIdActionImpl instance = new PaymentSetTransactionInterfaceIdActionImpl();
        instance.setTransactionId(template.getTransactionId());
        instance.setInterfaceId(template.getInterfaceId());
        return instance;
    }

    public PaymentSetTransactionInterfaceIdAction copyDeep();

    /**
     * factory method to create a deep copy of PaymentSetTransactionInterfaceIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentSetTransactionInterfaceIdAction deepCopy(
            @Nullable final PaymentSetTransactionInterfaceIdAction template) {
        if (template == null) {
            return null;
        }
        PaymentSetTransactionInterfaceIdActionImpl instance = new PaymentSetTransactionInterfaceIdActionImpl();
        instance.setTransactionId(template.getTransactionId());
        instance.setInterfaceId(template.getInterfaceId());
        return instance;
    }

    /**
     * builder factory method for PaymentSetTransactionInterfaceIdAction
     * @return builder
     */
    public static PaymentSetTransactionInterfaceIdActionBuilder builder() {
        return PaymentSetTransactionInterfaceIdActionBuilder.of();
    }

    /**
     * create builder for PaymentSetTransactionInterfaceIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentSetTransactionInterfaceIdActionBuilder builder(
            final PaymentSetTransactionInterfaceIdAction template) {
        return PaymentSetTransactionInterfaceIdActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentSetTransactionInterfaceIdAction(
            Function<PaymentSetTransactionInterfaceIdAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentSetTransactionInterfaceIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentSetTransactionInterfaceIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentSetTransactionInterfaceIdAction>";
            }
        };
    }
}
