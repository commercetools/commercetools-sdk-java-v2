package com.commercetools.models.Customer;

import com.commercetools.models.Customer.CustomerUpdateAction;
import java.lang.String;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerSetDateOfBirthActionImpl implements CustomerSetDateOfBirthAction {

   private java.lang.String action;
   
   private java.time.LocalDate dateOfBirth;

   @JsonCreator
   CustomerSetDateOfBirthActionImpl(@JsonProperty("dateOfBirth") final java.time.LocalDate dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
      this.action = "setDateOfBirth";
   }
   public CustomerSetDateOfBirthActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.time.LocalDate getDateOfBirth(){
      return this.dateOfBirth;
   }

   public void setDateOfBirth(final java.time.LocalDate dateOfBirth){
      this.dateOfBirth = dateOfBirth;
   }

}