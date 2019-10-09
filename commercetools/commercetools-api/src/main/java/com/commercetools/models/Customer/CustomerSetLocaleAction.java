package com.commercetools.models.customer;

import com.commercetools.models.customer.CustomerUpdateAction;
import com.commercetools.models.customer.CustomerSetLocaleActionImpl;

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
@JsonDeserialize(as = CustomerSetLocaleActionImpl.class)
public interface CustomerSetLocaleAction extends CustomerUpdateAction {

   
   
   @JsonProperty("locale")
   public String getLocale();

   public void setLocale(final String locale);
   
   public static CustomerSetLocaleActionImpl of(){
      return new CustomerSetLocaleActionImpl();
   }
   

   public static CustomerSetLocaleActionImpl of(final CustomerSetLocaleAction template) {
      CustomerSetLocaleActionImpl instance = new CustomerSetLocaleActionImpl();
      instance.setLocale(template.getLocale());
      return instance;
   }

}