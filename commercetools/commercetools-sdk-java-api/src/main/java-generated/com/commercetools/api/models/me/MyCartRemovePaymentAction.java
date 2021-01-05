package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCartUpdateAction;
import com.commercetools.api.models.payment.PaymentResourceIdentifier;
import com.commercetools.api.models.me.MyCartRemovePaymentActionImpl;

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
@JsonDeserialize(as = MyCartRemovePaymentActionImpl.class)
public interface MyCartRemovePaymentAction extends MyCartUpdateAction {

    
    @NotNull
    @Valid
    @JsonProperty("payment")
    public PaymentResourceIdentifier getPayment();

    public void setPayment(final PaymentResourceIdentifier payment);

    public static MyCartRemovePaymentAction of(){
        return new MyCartRemovePaymentActionImpl();
    }
    

    public static MyCartRemovePaymentAction of(final MyCartRemovePaymentAction template) {
        MyCartRemovePaymentActionImpl instance = new MyCartRemovePaymentActionImpl();
        instance.setPayment(template.getPayment());
        return instance;
    }

    public static MyCartRemovePaymentActionBuilder builder(){
        return MyCartRemovePaymentActionBuilder.of();
    }
    
    public static MyCartRemovePaymentActionBuilder builder(final MyCartRemovePaymentAction template){
        return MyCartRemovePaymentActionBuilder.of(template);
    }
    

    default <T> T withMyCartRemovePaymentAction(Function<MyCartRemovePaymentAction, T> helper) {
        return helper.apply(this);
    }
}
