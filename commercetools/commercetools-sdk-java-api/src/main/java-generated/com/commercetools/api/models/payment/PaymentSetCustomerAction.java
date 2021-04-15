package com.commercetools.api.models.payment;

import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.commercetools.api.models.payment.PaymentSetCustomerActionImpl;

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
@JsonDeserialize(as = PaymentSetCustomerActionImpl.class)
public interface PaymentSetCustomerAction extends PaymentUpdateAction {

    String SET_CUSTOMER = "setCustomer";

    /**
    *  <p>A reference to the customer this payment belongs to.</p>
    */
    @Valid
    @JsonProperty("customer")
    public CustomerResourceIdentifier getCustomer();

    
    public void setCustomer(final CustomerResourceIdentifier customer);
    

    public static PaymentSetCustomerAction of(){
        return new PaymentSetCustomerActionImpl();
    }
    

    public static PaymentSetCustomerAction of(final PaymentSetCustomerAction template) {
        PaymentSetCustomerActionImpl instance = new PaymentSetCustomerActionImpl();
        instance.setCustomer(template.getCustomer());
        return instance;
    }

    public static PaymentSetCustomerActionBuilder builder(){
        return PaymentSetCustomerActionBuilder.of();
    }
    
    public static PaymentSetCustomerActionBuilder builder(final PaymentSetCustomerAction template){
        return PaymentSetCustomerActionBuilder.of(template);
    }
    

    default <T> T withPaymentSetCustomerAction(Function<PaymentSetCustomerAction, T> helper) {
        return helper.apply(this);
    }
}
