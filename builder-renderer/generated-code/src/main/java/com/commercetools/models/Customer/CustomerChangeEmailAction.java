package com.commercetools.models.Customer;

import com.commercetools.models.Customer.CustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.Customer.CustomerChangeEmailActionImpl;

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
@JsonDeserialize(as = CustomerChangeEmailActionImpl.class)
public interface CustomerChangeEmailAction extends CustomerUpdateAction {

   
   @NotNull
   @JsonProperty("email")
   public String getEmail();

   public void setEmail(final String email);
   
   public static CustomerChangeEmailActionImpl of(){
      return new CustomerChangeEmailActionImpl();
   }
   

   public static CustomerChangeEmailActionImpl of(final CustomerChangeEmailAction template) {
      CustomerChangeEmailActionImpl instance = new CustomerChangeEmailActionImpl();
      instance.setEmail(template.getEmail());
      return instance;
   }

}