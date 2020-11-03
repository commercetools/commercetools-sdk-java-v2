package com.commercetools.api.models.payment;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.commercetools.api.models.payment.PaymentSetAmountPaidActionImpl;

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
@JsonDeserialize(as = PaymentSetAmountPaidActionImpl.class)
public interface PaymentSetAmountPaidAction extends PaymentUpdateAction {

    
    @Valid
    @JsonProperty("amount")
    public Money getAmount();

    public void setAmount(final Money amount);

    public static PaymentSetAmountPaidActionImpl of(){
        return new PaymentSetAmountPaidActionImpl();
    }
    

    public static PaymentSetAmountPaidActionImpl of(final PaymentSetAmountPaidAction template) {
        PaymentSetAmountPaidActionImpl instance = new PaymentSetAmountPaidActionImpl();
        instance.setAmount(template.getAmount());
        return instance;
    }

    default <T> T withPaymentSetAmountPaidAction(Function<PaymentSetAmountPaidAction, T> helper) {
        return helper.apply(this);
    }
}
