package com.commercetools.models.OrderEdit;

import com.commercetools.models.Cart.RoundingMode;
import com.commercetools.models.Order.StagedOrderUpdateAction;
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
public final class StagedOrderChangeTaxRoundingModeActionImpl implements StagedOrderChangeTaxRoundingModeAction {

   private java.lang.String action;
   
   private com.commercetools.models.Cart.RoundingMode taxRoundingMode;

   @JsonCreator
   StagedOrderChangeTaxRoundingModeActionImpl(@JsonProperty("taxRoundingMode") final com.commercetools.models.Cart.RoundingMode taxRoundingMode) {
      this.taxRoundingMode = taxRoundingMode;
      this.action = "changeTaxRoundingMode";
   }
   public StagedOrderChangeTaxRoundingModeActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.Cart.RoundingMode getTaxRoundingMode(){
      return this.taxRoundingMode;
   }

   public void setTaxRoundingMode(final com.commercetools.models.Cart.RoundingMode taxRoundingMode){
      this.taxRoundingMode = taxRoundingMode;
   }

}