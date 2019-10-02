package com.commercetools.models.payment;

import com.commercetools.models.customer.CustomerResourceIdentifier;
import com.commercetools.models.payment.PaymentUpdateAction;
import com.commercetools.models.payment.PaymentSetCustomerActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = PaymentSetCustomerActionImpl.class)
public interface PaymentSetCustomerAction extends PaymentUpdateAction {

   
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

}