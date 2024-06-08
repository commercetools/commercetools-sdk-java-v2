
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.payment.TransactionDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Adding a Transaction to a Payment generates the PaymentTransactionAdded Message. Once a Transaction is added to the Payment, it can no longer be updated or deleted using the My Payments API.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyPaymentAddTransactionAction myPaymentAddTransactionAction = MyPaymentAddTransactionAction.builder()
 *             .transaction(transactionBuilder -> transactionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyPaymentAddTransactionActionImpl.class)
public interface MyPaymentAddTransactionAction extends MyPaymentUpdateAction {

    /**
     * discriminator value for MyPaymentAddTransactionAction
     */
    String ADD_TRANSACTION = "addTransaction";

    /**
     *  <p>Transaction to add to the Payment.</p>
     * @return transaction
     */
    @NotNull
    @Valid
    @JsonProperty("transaction")
    public TransactionDraft getTransaction();

    /**
     *  <p>Transaction to add to the Payment.</p>
     * @param transaction value to be set
     */

    public void setTransaction(final TransactionDraft transaction);

    /**
     * factory method
     * @return instance of MyPaymentAddTransactionAction
     */
    public static MyPaymentAddTransactionAction of() {
        return new MyPaymentAddTransactionActionImpl();
    }

    /**
     * factory method to create a shallow copy MyPaymentAddTransactionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyPaymentAddTransactionAction of(final MyPaymentAddTransactionAction template) {
        MyPaymentAddTransactionActionImpl instance = new MyPaymentAddTransactionActionImpl();
        instance.setTransaction(template.getTransaction());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyPaymentAddTransactionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyPaymentAddTransactionAction deepCopy(@Nullable final MyPaymentAddTransactionAction template) {
        if (template == null) {
            return null;
        }
        MyPaymentAddTransactionActionImpl instance = new MyPaymentAddTransactionActionImpl();
        instance.setTransaction(
            com.commercetools.api.models.payment.TransactionDraft.deepCopy(template.getTransaction()));
        return instance;
    }

    /**
     * builder factory method for MyPaymentAddTransactionAction
     * @return builder
     */
    public static MyPaymentAddTransactionActionBuilder builder() {
        return MyPaymentAddTransactionActionBuilder.of();
    }

    /**
     * create builder for MyPaymentAddTransactionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyPaymentAddTransactionActionBuilder builder(final MyPaymentAddTransactionAction template) {
        return MyPaymentAddTransactionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyPaymentAddTransactionAction(Function<MyPaymentAddTransactionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyPaymentAddTransactionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyPaymentAddTransactionAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyPaymentAddTransactionAction>";
            }
        };
    }
}
