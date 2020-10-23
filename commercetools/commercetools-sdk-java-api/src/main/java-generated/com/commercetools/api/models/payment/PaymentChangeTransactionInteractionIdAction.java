package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.commercetools.api.models.payment.PaymentChangeTransactionInteractionIdActionImpl;

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
@JsonDeserialize(as = PaymentChangeTransactionInteractionIdActionImpl.class)
public interface PaymentChangeTransactionInteractionIdAction extends PaymentUpdateAction {

    
    @NotNull
    @JsonProperty("transactionId")
    public String getTransactionId();
    
    @NotNull
    @JsonProperty("interactionId")
    public String getInteractionId();

    public void setTransactionId(final String transactionId);
    
    public void setInteractionId(final String interactionId);

    public static PaymentChangeTransactionInteractionIdActionImpl of(){
        return new PaymentChangeTransactionInteractionIdActionImpl();
    }
    

    public static PaymentChangeTransactionInteractionIdActionImpl of(final PaymentChangeTransactionInteractionIdAction template) {
        PaymentChangeTransactionInteractionIdActionImpl instance = new PaymentChangeTransactionInteractionIdActionImpl();
        instance.setTransactionId(template.getTransactionId());
        instance.setInteractionId(template.getInteractionId());
        return instance;
    }

    default <T> T withPaymentChangeTransactionInteractionIdAction(Function<PaymentChangeTransactionInteractionIdAction, T> helper) {
        return helper.apply(this);
    }
}
