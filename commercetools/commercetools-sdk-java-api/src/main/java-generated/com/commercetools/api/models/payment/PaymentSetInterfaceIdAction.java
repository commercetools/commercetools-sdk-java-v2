package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.commercetools.api.models.payment.PaymentSetInterfaceIdActionImpl;

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
@JsonDeserialize(as = PaymentSetInterfaceIdActionImpl.class)
public interface PaymentSetInterfaceIdAction extends PaymentUpdateAction {

    
    @NotNull
    @JsonProperty("interfaceId")
    public String getInterfaceId();

    public void setInterfaceId(final String interfaceId);

    public static PaymentSetInterfaceIdActionImpl of(){
        return new PaymentSetInterfaceIdActionImpl();
    }
    

    public static PaymentSetInterfaceIdActionImpl of(final PaymentSetInterfaceIdAction template) {
        PaymentSetInterfaceIdActionImpl instance = new PaymentSetInterfaceIdActionImpl();
        instance.setInterfaceId(template.getInterfaceId());
        return instance;
    }

    default <T> T withPaymentSetInterfaceIdAction(Function<PaymentSetInterfaceIdAction, T> helper) {
        return helper.apply(this);
    }
}
