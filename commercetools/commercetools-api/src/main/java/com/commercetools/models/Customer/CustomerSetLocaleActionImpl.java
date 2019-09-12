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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerSetLocaleActionImpl implements CustomerSetLocaleAction {

   private java.lang.String action;
   
   private java.lang.String locale;

   @JsonCreator
   CustomerSetLocaleActionImpl(@JsonProperty("locale") final java.lang.String locale) {
      this.locale = locale;
      this.action = "setLocale";
   }
   public CustomerSetLocaleActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getLocale(){
      return this.locale;
   }

   public void setLocale(final java.lang.String locale){
      this.locale = locale;
   }

}