package com.commercetools.api.models.payment;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.commercetools.api.models.payment.PaymentChangeAmountPlannedActionImpl;

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
@JsonDeserialize(as = PaymentChangeAmountPlannedActionImpl.class)
public interface PaymentChangeAmountPlannedAction extends PaymentUpdateAction {

    
    @NotNull
    @Valid
    @JsonProperty("amount")
    public Money getAmount();

    public void setAmount(final Money amount);

    public static PaymentChangeAmountPlannedAction of(){
        return new PaymentChangeAmountPlannedActionImpl();
    }
    

    public static PaymentChangeAmountPlannedAction of(final PaymentChangeAmountPlannedAction template) {
        PaymentChangeAmountPlannedActionImpl instance = new PaymentChangeAmountPlannedActionImpl();
        instance.setAmount(template.getAmount());
        return instance;
    }

    public static PaymentChangeAmountPlannedActionBuilder builder(){
        return PaymentChangeAmountPlannedActionBuilder.of();
    }
    
    public static PaymentChangeAmountPlannedActionBuilder builder(final PaymentChangeAmountPlannedAction template){
        return PaymentChangeAmountPlannedActionBuilder.of(template);
    }
    

    default <T> T withPaymentChangeAmountPlannedAction(Function<PaymentChangeAmountPlannedAction, T> helper) {
        return helper.apply(this);
    }
}
