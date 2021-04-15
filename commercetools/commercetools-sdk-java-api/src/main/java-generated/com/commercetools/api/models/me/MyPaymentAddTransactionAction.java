
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyPaymentAddTransactionActionImpl.class)
public interface MyPaymentAddTransactionAction extends MyPaymentUpdateAction {

    String ADD_TRANSACTION = "addTransaction";

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
}
