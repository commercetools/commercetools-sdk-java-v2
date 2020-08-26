package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.commercetools.api.models.payment.TransactionState;
import com.commercetools.api.models.payment.PaymentChangeTransactionStateActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = PaymentChangeTransactionStateActionImpl.class)
public interface PaymentChangeTransactionStateAction extends PaymentUpdateAction {

    
    @NotNull
    @JsonProperty("transactionId")
    public String getTransactionId();
    
    @NotNull
    @JsonProperty("state")
    public TransactionState getState();

    public void setTransactionId(final String transactionId);
    
    public void setState(final TransactionState state);

    public static PaymentChangeTransactionStateActionImpl of(){
        return new PaymentChangeTransactionStateActionImpl();
    }
    

    public static PaymentChangeTransactionStateActionImpl of(final PaymentChangeTransactionStateAction template) {
        PaymentChangeTransactionStateActionImpl instance = new PaymentChangeTransactionStateActionImpl();
        instance.setTransactionId(template.getTransactionId());
        instance.setState(template.getState());
        return instance;
    }

}
