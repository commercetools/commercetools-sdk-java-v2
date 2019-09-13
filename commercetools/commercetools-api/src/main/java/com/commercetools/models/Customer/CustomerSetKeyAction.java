package com.commercetools.models.customer;

import com.commercetools.models.customer.CustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.customer.CustomerSetKeyActionImpl;

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
@JsonDeserialize(as = CustomerSetKeyActionImpl.class)
public interface CustomerSetKeyAction extends CustomerUpdateAction {

   
   
   @JsonProperty("key")
   public String getKey();

   public void setKey(final String key);
   
   public static CustomerSetKeyActionImpl of(){
      return new CustomerSetKeyActionImpl();
   }
   

   public static CustomerSetKeyActionImpl of(final CustomerSetKeyAction template) {
      CustomerSetKeyActionImpl instance = new CustomerSetKeyActionImpl();
      instance.setKey(template.getKey());
      return instance;
   }

}