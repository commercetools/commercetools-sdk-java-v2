package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.cart.TaxMode;
import com.commercetools.api.generated.models.me.MyCartUpdateAction;
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
public final class MyCartChangeTaxModeActionImpl implements MyCartChangeTaxModeAction {

   private String action;
   
   private com.commercetools.api.generated.models.cart.TaxMode taxMode;

   @JsonCreator
   MyCartChangeTaxModeActionImpl(@JsonProperty("taxMode") final com.commercetools.api.generated.models.cart.TaxMode taxMode) {
      this.taxMode = taxMode;
      this.action = "changeTaxMode";
   }
   public MyCartChangeTaxModeActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.api.generated.models.cart.TaxMode getTaxMode(){
      return this.taxMode;
   }

   public void setTaxMode(final com.commercetools.api.generated.models.cart.TaxMode taxMode){
      this.taxMode = taxMode;
   }

}