package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.commercetools.api.models.payment.TransactionState;
import com.commercetools.api.models.payment.PaymentChangeTransactionStateActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
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

    public static PaymentChangeTransactionStateAction of(){
        return new PaymentChangeTransactionStateActionImpl();
    }
    

    public static PaymentChangeTransactionStateAction of(final PaymentChangeTransactionStateAction template) {
        PaymentChangeTransactionStateActionImpl instance = new PaymentChangeTransactionStateActionImpl();
        instance.setTransactionId(template.getTransactionId());
        instance.setState(template.getState());
        return instance;
    }

    public static PaymentChangeTransactionStateActionBuilder builder(){
        return PaymentChangeTransactionStateActionBuilder.of();
    }
    
    public static PaymentChangeTransactionStateActionBuilder builder(final PaymentChangeTransactionStateAction template){
        return PaymentChangeTransactionStateActionBuilder.of(template);
    }
    

    default <T> T withPaymentChangeTransactionStateAction(Function<PaymentChangeTransactionStateAction, T> helper) {
        return helper.apply(this);
    }
}
