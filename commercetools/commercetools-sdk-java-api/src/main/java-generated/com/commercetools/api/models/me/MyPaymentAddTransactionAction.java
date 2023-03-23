
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.payment.TransactionDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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

    String ADD_TRANSACTION = "addTransaction";

    /**
     *  <p>Transaction to add to the Payment.</p>
     * @return transaction
     */
    @NotNull
    @Valid
    @JsonProperty("transaction")
    public TransactionDraft getTransaction();

    public void setTransaction(final TransactionDraft transaction);

    public static MyPaymentAddTransactionAction of() {
        return new MyPaymentAddTransactionActionImpl();
    }

    public static MyPaymentAddTransactionAction of(final MyPaymentAddTransactionAction template) {
        MyPaymentAddTransactionActionImpl instance = new MyPaymentAddTransactionActionImpl();
        instance.setTransaction(template.getTransaction());
        return instance;
    }

    public static MyPaymentAddTransactionActionBuilder builder() {
        return MyPaymentAddTransactionActionBuilder.of();
    }

    public static MyPaymentAddTransactionActionBuilder builder(final MyPaymentAddTransactionAction template) {
        return MyPaymentAddTransactionActionBuilder.of(template);
    }

    default <T> T withMyPaymentAddTransactionAction(Function<MyPaymentAddTransactionAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyPaymentAddTransactionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyPaymentAddTransactionAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyPaymentAddTransactionAction>";
            }
        };
    }
}
