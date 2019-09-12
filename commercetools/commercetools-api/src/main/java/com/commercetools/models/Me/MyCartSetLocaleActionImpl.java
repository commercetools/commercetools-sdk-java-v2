package com.commercetools.models.Me;

import com.commercetools.models.Me.MyCartUpdateAction;
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
public final class MyCartSetLocaleActionImpl implements MyCartSetLocaleAction {

   private java.lang.String action;
   
   private java.lang.String locale;

   @JsonCreator
   MyCartSetLocaleActionImpl(@JsonProperty("locale") final java.lang.String locale) {
      this.locale = locale;
      this.action = "setLocale";
   }
   public MyCartSetLocaleActionImpl() {
      
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