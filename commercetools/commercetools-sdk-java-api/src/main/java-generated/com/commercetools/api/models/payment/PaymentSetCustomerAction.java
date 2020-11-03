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

    /**
    *  <p>A reference to the customer this payment belongs to.</p>
    */
    @Valid
    @JsonProperty("customer")
    public CustomerResourceIdentifier getCustomer();

    public void setCustomer(final CustomerResourceIdentifier customer);

    public static PaymentSetCustomerActionImpl of(){
        return new PaymentSetCustomerActionImpl();
    }
    

    public static PaymentSetCustomerActionImpl of(final PaymentSetCustomerAction template) {
        PaymentSetCustomerActionImpl instance = new PaymentSetCustomerActionImpl();
        instance.setCustomer(template.getCustomer());
        return instance;
    }

    default <T> T withPaymentSetCustomerAction(Function<PaymentSetCustomerAction, T> helper) {
        return helper.apply(this);
    }
}
