
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Adding a Transaction to a Payment generates the PaymentTransactionAdded Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentAddTransactionAction paymentAddTransactionAction = PaymentAddTransactionAction.builder()
 *             .transaction(transactionBuilder -> transactionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("addTransaction")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentAddTransactionActionImpl.class)
public interface PaymentAddTransactionAction extends PaymentUpdateAction {

    /**
     * discriminator value for PaymentAddTransactionAction
     */
    String ADD_TRANSACTION = "addTransaction";

    /**
     *  <p>Value to append to the <code>transactions</code> array.</p>
     * @return transaction
     */
    @NotNull
    @Valid
    @JsonProperty("transaction")
    public TransactionDraft getTransaction();

    /**
     *  <p>Value to append to the <code>transactions</code> array.</p>
     * @param transaction value to be set
     */

    public void setTransaction(final TransactionDraft transaction);

    /**
     * factory method
     * @return instance of PaymentAddTransactionAction
     */
    public static PaymentAddTransactionAction of() {
        return new PaymentAddTransactionActionImpl();
    }

    /**
     * factory method to create a shallow copy PaymentAddTransactionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentAddTransactionAction of(final PaymentAddTransactionAction template) {
        PaymentAddTransactionActionImpl instance = new PaymentAddTransactionActionImpl();
        instance.setTransaction(template.getTransaction());
        return instance;
    }

    public PaymentAddTransactionAction copyDeep();

    /**
     * factory method to create a deep copy of PaymentAddTransactionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentAddTransactionAction deepCopy(@Nullable final PaymentAddTransactionAction template) {
        if (template == null) {
            return null;
        }
        PaymentAddTransactionActionImpl instance = new PaymentAddTransactionActionImpl();
        instance.setTransaction(
            com.commercetools.api.models.payment.TransactionDraft.deepCopy(template.getTransaction()));
        return instance;
    }

    /**
     * builder factory method for PaymentAddTransactionAction
     * @return builder
     */
    public static PaymentAddTransactionActionBuilder builder() {
        return PaymentAddTransactionActionBuilder.of();
    }

    /**
     * create builder for PaymentAddTransactionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentAddTransactionActionBuilder builder(final PaymentAddTransactionAction template) {
        return PaymentAddTransactionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentAddTransactionAction(Function<PaymentAddTransactionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentAddTransactionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentAddTransactionAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentAddTransactionAction>";
            }
        };
    }
}
