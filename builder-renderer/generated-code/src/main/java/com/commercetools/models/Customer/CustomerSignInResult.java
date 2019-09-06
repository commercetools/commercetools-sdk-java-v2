package com.commercetools.models.Customer;

import com.commercetools.models.Customer.Customer;
import java.lang.Object;
import com.commercetools.models.Customer.CustomerSignInResultImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CustomerSignInResultImpl.class)
public interface CustomerSignInResult  {

   
   @NotNull
   @Valid
   @JsonProperty("customer")
   public Customer getCustomer();
   
   @Valid
   @JsonProperty("cart")
   public Object getCart();

   public void setCustomer(final Customer customer);
   
   public void setCart(final Object cart);
   
   public static CustomerSignInResultImpl of(){
      return new CustomerSignInResultImpl();
   }
   

   public static CustomerSignInResultImpl of(final CustomerSignInResult template) {
      CustomerSignInResultImpl instance = new CustomerSignInResultImpl();
      instance.setCart(template.getCart());
      instance.setCustomer(template.getCustomer());
      return instance;
   }

}