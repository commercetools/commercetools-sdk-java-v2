package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyPaymentUpdateAction;
import com.commercetools.api.models.payment.TransactionDraft;
import com.commercetools.api.models.me.MyPaymentAddTransactionActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = MyPaymentAddTransactionActionImpl.class)
public interface MyPaymentAddTransactionAction extends MyPaymentUpdateAction {

    
    @NotNull
    @Valid
    @JsonProperty("transaction")
    public TransactionDraft getTransaction();

    public void setTransaction(final TransactionDraft transaction);

    public static MyPaymentAddTransactionActionImpl of(){
        return new MyPaymentAddTransactionActionImpl();
    }
    

    public static MyPaymentAddTransactionActionImpl of(final MyPaymentAddTransactionAction template) {
        MyPaymentAddTransactionActionImpl instance = new MyPaymentAddTransactionActionImpl();
        instance.setTransaction(template.getTransaction());
        return instance;
    }

    default <T extends Accessor<MyPaymentAddTransactionAction>> T withMyPaymentAddTransactionAction(Function<MyPaymentAddTransactionAction, T> helper) {
        return helper.apply(this);
    }
}
