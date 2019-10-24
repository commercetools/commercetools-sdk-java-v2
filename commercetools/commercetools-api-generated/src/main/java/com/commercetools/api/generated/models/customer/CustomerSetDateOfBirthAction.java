package com.commercetools.api.generated.models.customer;

import com.commercetools.api.generated.models.customer.CustomerUpdateAction;
import java.time.LocalDate;
import com.commercetools.api.generated.models.customer.CustomerSetDateOfBirthActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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