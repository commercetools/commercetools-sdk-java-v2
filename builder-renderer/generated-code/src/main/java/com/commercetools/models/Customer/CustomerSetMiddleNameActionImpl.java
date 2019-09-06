package com.commercetools.models.Customer;

import com.commercetools.models.Customer.CustomerUpdateAction;
import java.lang.String;
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
public final class CustomerSetMiddleNameActionImpl implements CustomerSetMiddleNameAction {

   private java.lang.String action;
   
   private java.lang.String middleName;

   @JsonCreator
   CustomerSetMiddleNameActionImpl(@JsonProperty("middleName") final java.lang.String middleName) {
      this.middleName = middleName;
      this.action = "setMiddleName";
   }
   public CustomerSetMiddleNameActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getMiddleName(){
      return this.middleName;
   }

   public void setMiddleName(final java.lang.String middleName){
      this.middleName = middleName;
   }

}