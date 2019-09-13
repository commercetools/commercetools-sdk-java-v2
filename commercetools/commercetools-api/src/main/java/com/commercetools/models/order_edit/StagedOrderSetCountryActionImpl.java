package com.commercetools.models.order_edit;

import com.commercetools.models.order.StagedOrderUpdateAction;
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
public final class StagedOrderSetCountryActionImpl implements StagedOrderSetCountryAction {

   private java.lang.String action;
   
   private java.lang.String country;

   @JsonCreator
   StagedOrderSetCountryActionImpl(@JsonProperty("country") final java.lang.String country) {
      this.country = country;
      this.action = "setCountry";
   }
   public StagedOrderSetCountryActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getCountry(){
      return this.country;
   }

   public void setCountry(final java.lang.String country){
      this.country = country;
   }

}