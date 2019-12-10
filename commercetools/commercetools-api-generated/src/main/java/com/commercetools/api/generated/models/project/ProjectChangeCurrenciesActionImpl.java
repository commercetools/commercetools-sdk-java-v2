package com.commercetools.api.generated.models.project;

import com.commercetools.api.generated.models.project.ProjectUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
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
public final class ProjectChangeCurrenciesActionImpl implements ProjectChangeCurrenciesAction {

   private String action;
   
   private java.util.List<String> currencies;

   @JsonCreator
   ProjectChangeCurrenciesActionImpl(@JsonProperty("currencies") final java.util.List<String> currencies) {
      this.currencies = currencies;
      this.action = "changeCurrencies";
   }
   public ProjectChangeCurrenciesActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   /**
   *  <p>A three-digit currency code as per currency code.</p>
   */
   public java.util.List<String> getCurrencies(){
      return this.currencies;
   }

   public void setCurrencies(final java.util.List<String> currencies){
      this.currencies = currencies;
   }

}