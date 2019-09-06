package com.commercetools.models.Customer;

import com.commercetools.models.Customer.CustomerUpdateAction;
import java.lang.String;
import java.time.LocalDate;
import com.commercetools.models.Customer.CustomerSetDateOfBirthActionImpl;

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
@JsonDeserialize(as = CustomerSetDateOfBirthActionImpl.class)
public interface CustomerSetDateOfBirthAction extends CustomerUpdateAction {

   
   
   @JsonProperty("dateOfBirth")
   public LocalDate getDateOfBirth();

   public void setDateOfBirth(final LocalDate dateOfBirth);
   
   public static CustomerSetDateOfBirthActionImpl of(){
      return new CustomerSetDateOfBirthActionImpl();
   }
   

   public static CustomerSetDateOfBirthActionImpl of(final CustomerSetDateOfBirthAction template) {
      CustomerSetDateOfBirthActionImpl instance = new CustomerSetDateOfBirthActionImpl();
      instance.setDateOfBirth(template.getDateOfBirth());
      return instance;
   }

}