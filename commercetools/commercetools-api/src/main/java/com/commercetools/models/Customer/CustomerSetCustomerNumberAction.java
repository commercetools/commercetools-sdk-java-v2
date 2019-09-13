package com.commercetools.models.customer;

import com.commercetools.models.customer.CustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.customer.CustomerSetCustomerNumberActionImpl;

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
@JsonDeserialize(as = CustomerSetCustomerNumberActionImpl.class)
public interface CustomerSetCustomerNumberAction extends CustomerUpdateAction {

   
   
   @JsonProperty("customerNumber")
   public String getCustomerNumber();

   public void setCustomerNumber(final String customerNumber);
   
   public static CustomerSetCustomerNumberActionImpl of(){
      return new CustomerSetCustomerNumberActionImpl();
   }
   

   public static CustomerSetCustomerNumberActionImpl of(final CustomerSetCustomerNumberAction template) {
      CustomerSetCustomerNumberActionImpl instance = new CustomerSetCustomerNumberActionImpl();
      instance.setCustomerNumber(template.getCustomerNumber());
      return instance;
   }

}