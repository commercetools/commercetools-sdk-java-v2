package com.commercetools.models.Customer;

import com.commercetools.models.Customer.CustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.Customer.CustomerSetLastNameActionImpl;

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
@JsonDeserialize(as = CustomerSetLastNameActionImpl.class)
public interface CustomerSetLastNameAction extends CustomerUpdateAction {

   
   
   @JsonProperty("lastName")
   public String getLastName();

   public void setLastName(final String lastName);
   
   public static CustomerSetLastNameActionImpl of(){
      return new CustomerSetLastNameActionImpl();
   }
   

   public static CustomerSetLastNameActionImpl of(final CustomerSetLastNameAction template) {
      CustomerSetLastNameActionImpl instance = new CustomerSetLastNameActionImpl();
      instance.setLastName(template.getLastName());
      return instance;
   }

}