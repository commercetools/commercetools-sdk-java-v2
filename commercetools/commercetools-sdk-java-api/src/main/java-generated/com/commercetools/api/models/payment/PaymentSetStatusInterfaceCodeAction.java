package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.commercetools.api.models.payment.PaymentSetStatusInterfaceCodeActionImpl;

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
@JsonDeserialize(as = PaymentSetStatusInterfaceCodeActionImpl.class)
public interface PaymentSetStatusInterfaceCodeAction extends PaymentUpdateAction {

    
    
    @JsonProperty("interfaceCode")
    public String getInterfaceCode();

    public void setInterfaceCode(final String interfaceCode);

    public static PaymentSetStatusInterfaceCodeActionImpl of(){
        return new PaymentSetStatusInterfaceCodeActionImpl();
    }
    

    public static PaymentSetStatusInterfaceCodeActionImpl of(final PaymentSetStatusInterfaceCodeAction template) {
        PaymentSetStatusInterfaceCodeActionImpl instance = new PaymentSetStatusInterfaceCodeActionImpl();
        instance.setInterfaceCode(template.getInterfaceCode());
        return instance;
    }

    default <T> T withPaymentSetStatusInterfaceCodeAction(Function<PaymentSetStatusInterfaceCodeAction, T> helper) {
        return helper.apply(this);
    }
}
