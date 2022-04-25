
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentAddTransactionActionImpl.class)
public interface PaymentAddTransactionAction extends PaymentUpdateAction {

    String ADD_TRANSACTION = "addTransaction";

    @NotNull
    @Valid
    @JsonProperty("transaction")
    public TransactionDraft getTransaction();

    public void setTransaction(final TransactionDraft transaction);

    public static PaymentAddTransactionAction of() {
        return new PaymentAddTransactionActionImpl();
    }

    public static PaymentAddTransactionAction of(final PaymentAddTransactionAction template) {
        PaymentAddTransactionActionImpl instance = new PaymentAddTransactionActionImpl();
        instance.setTransaction(template.getTransaction());
        return instance;
    }

    public static PaymentAddTransactionActionBuilder builder() {
        return PaymentAddTransactionActionBuilder.of();
    }

    public static PaymentAddTransactionActionBuilder builder(final PaymentAddTransactionAction template) {
        return PaymentAddTransactionActionBuilder.of(template);
    }

    default <T> T withPaymentAddTransactionAction(Function<PaymentAddTransactionAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PaymentAddTransactionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentAddTransactionAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentAddTransactionAction>";
            }
        };
    }
}
