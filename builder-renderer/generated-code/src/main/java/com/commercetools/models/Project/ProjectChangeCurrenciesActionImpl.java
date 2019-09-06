package com.commercetools.models.Project;

import com.commercetools.models.Project.ProjectUpdateAction;
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
public final class ProjectChangeCurrenciesActionImpl implements ProjectChangeCurrenciesAction {

   private java.lang.String action;
   
   private java.util.List<java.lang.String> currencies;

   @JsonCreator
   ProjectChangeCurrenciesActionImpl(@JsonProperty("currencies") final java.util.List<java.lang.String> currencies) {
      this.currencies = currencies;
      this.action = "changeCurrencies";
   }
   public ProjectChangeCurrenciesActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.util.List<java.lang.String> getCurrencies(){
      return this.currencies;
   }

   public void setCurrencies(final java.util.List<java.lang.String> currencies){
      this.currencies = currencies;
   }

}