package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.payment.TransactionState;
import com.commercetools.api.models.message.PaymentTransactionStateChangedMessagePayloadImpl;

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
@JsonDeserialize(as = PaymentTransactionStateChangedMessagePayloadImpl.class)
public interface PaymentTransactionStateChangedMessagePayload extends MessagePayload {

    String PAYMENT_TRANSACTION_STATE_CHANGED = "PaymentTransactionStateChanged";

    
    @NotNull
    @JsonProperty("transactionId")
    public String getTransactionId();
    
    @NotNull
    @JsonProperty("state")
    public TransactionState getState();

    
    public void setTransactionId(final String transactionId);
    
    
    
    public void setState(final TransactionState state);
    

    public static PaymentTransactionStateChangedMessagePayload of(){
        return new PaymentTransactionStateChangedMessagePayloadImpl();
    }
    

    public static PaymentTransactionStateChangedMessagePayload of(final PaymentTransactionStateChangedMessagePayload template) {
        PaymentTransactionStateChangedMessagePayloadImpl instance = new PaymentTransactionStateChangedMessagePayloadImpl();
        instance.setTransactionId(template.getTransactionId());
        instance.setState(template.getState());
        return instance;
    }

    public static PaymentTransactionStateChangedMessagePayloadBuilder builder(){
        return PaymentTransactionStateChangedMessagePayloadBuilder.of();
    }
    
    public static PaymentTransactionStateChangedMessagePayloadBuilder builder(final PaymentTransactionStateChangedMessagePayload template){
        return PaymentTransactionStateChangedMessagePayloadBuilder.of(template);
    }
    

    default <T> T withPaymentTransactionStateChangedMessagePayload(Function<PaymentTransactionStateChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
