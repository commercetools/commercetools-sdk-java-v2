package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.commercetools.api.models.payment.PaymentSetMethodInfoInterfaceActionImpl;

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
@JsonDeserialize(as = PaymentSetMethodInfoInterfaceActionImpl.class)
public interface PaymentSetMethodInfoInterfaceAction extends PaymentUpdateAction {

    
    @NotNull
    @JsonProperty("interface")
    public String getInterface();

    public void setInterface(final String _interface);

    public static PaymentSetMethodInfoInterfaceAction of(){
        return new PaymentSetMethodInfoInterfaceActionImpl();
    }
    

    public static PaymentSetMethodInfoInterfaceAction of(final PaymentSetMethodInfoInterfaceAction template) {
        PaymentSetMethodInfoInterfaceActionImpl instance = new PaymentSetMethodInfoInterfaceActionImpl();
        instance.setInterface(template.getInterface());
        return instance;
    }

    public static PaymentSetMethodInfoInterfaceActionBuilder builder(){
        return PaymentSetMethodInfoInterfaceActionBuilder.of();
    }
    
    public static PaymentSetMethodInfoInterfaceActionBuilder builder(final PaymentSetMethodInfoInterfaceAction template){
        return PaymentSetMethodInfoInterfaceActionBuilder.of(template);
    }
    

    default <T> T withPaymentSetMethodInfoInterfaceAction(Function<PaymentSetMethodInfoInterfaceAction, T> helper) {
        return helper.apply(this);
    }
}
