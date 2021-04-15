package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.commercetools.api.models.payment.PaymentSetMethodInfoMethodActionImpl;

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
@JsonDeserialize(as = PaymentSetMethodInfoMethodActionImpl.class)
public interface PaymentSetMethodInfoMethodAction extends PaymentUpdateAction {

    String SET_METHOD_INFO_METHOD = "setMethodInfoMethod";

    /**
    *  <p>If not provided, the method is unset.</p>
    */
    
    @JsonProperty("method")
    public String getMethod();

    
    public void setMethod(final String method);
    

    public static PaymentSetMethodInfoMethodAction of(){
        return new PaymentSetMethodInfoMethodActionImpl();
    }
    

    public static PaymentSetMethodInfoMethodAction of(final PaymentSetMethodInfoMethodAction template) {
        PaymentSetMethodInfoMethodActionImpl instance = new PaymentSetMethodInfoMethodActionImpl();
        instance.setMethod(template.getMethod());
        return instance;
    }

    public static PaymentSetMethodInfoMethodActionBuilder builder(){
        return PaymentSetMethodInfoMethodActionBuilder.of();
    }
    
    public static PaymentSetMethodInfoMethodActionBuilder builder(final PaymentSetMethodInfoMethodAction template){
        return PaymentSetMethodInfoMethodActionBuilder.of(template);
    }
    

    default <T> T withPaymentSetMethodInfoMethodAction(Function<PaymentSetMethodInfoMethodAction, T> helper) {
        return helper.apply(this);
    }
}
