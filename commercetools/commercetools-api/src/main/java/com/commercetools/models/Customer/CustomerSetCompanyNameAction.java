package com.commercetools.models.Customer;

import com.commercetools.models.Customer.CustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.Customer.CustomerSetCompanyNameActionImpl;

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
@JsonDeserialize(as = CustomerSetCompanyNameActionImpl.class)
public interface CustomerSetCompanyNameAction extends CustomerUpdateAction {

   
   
   @JsonProperty("companyName")
   public String getCompanyName();

   public void setCompanyName(final String companyName);
   
   public static CustomerSetCompanyNameActionImpl of(){
      return new CustomerSetCompanyNameActionImpl();
   }
   

   public static CustomerSetCompanyNameActionImpl of(final CustomerSetCompanyNameAction template) {
      CustomerSetCompanyNameActionImpl instance = new CustomerSetCompanyNameActionImpl();
      instance.setCompanyName(template.getCompanyName());
      return instance;
   }

}