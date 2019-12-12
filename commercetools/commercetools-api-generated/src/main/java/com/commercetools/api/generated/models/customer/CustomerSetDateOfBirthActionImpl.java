package com.commercetools.api.generated.models.customer;

import com.commercetools.api.generated.models.customer.CustomerUpdateAction;
import java.time.LocalDate;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerSetDateOfBirthActionImpl implements CustomerSetDateOfBirthAction {

   private String action;
   
   private java.time.LocalDate dateOfBirth;

   @JsonCreator
   CustomerSetDateOfBirthActionImpl(@JsonProperty("dateOfBirth") final java.time.LocalDate dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
      this.action = "setDateOfBirth";
   }
   public CustomerSetDateOfBirthActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   /**
   *  <p>If not defined, the date of birth is unset.</p>
   */
   public java.time.LocalDate getDateOfBirth(){
      return this.dateOfBirth;
   }

   public void setDateOfBirth(final java.time.LocalDate dateOfBirth){
      this.dateOfBirth = dateOfBirth;
   }

}