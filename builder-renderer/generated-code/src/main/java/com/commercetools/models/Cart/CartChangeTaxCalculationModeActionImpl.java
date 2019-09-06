package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Cart.TaxCalculationMode;
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
public final class CartChangeTaxCalculationModeActionImpl implements CartChangeTaxCalculationModeAction {

   private java.lang.String action;
   
   private com.commercetools.models.Cart.TaxCalculationMode taxCalculationMode;

   @JsonCreator
   CartChangeTaxCalculationModeActionImpl(@JsonProperty("taxCalculationMode") final com.commercetools.models.Cart.TaxCalculationMode taxCalculationMode) {
      this.taxCalculationMode = taxCalculationMode;
      this.action = "changeTaxCalculationMode";
   }
   public CartChangeTaxCalculationModeActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.Cart.TaxCalculationMode getTaxCalculationMode(){
      return this.taxCalculationMode;
   }

   public void setTaxCalculationMode(final com.commercetools.models.Cart.TaxCalculationMode taxCalculationMode){
      this.taxCalculationMode = taxCalculationMode;
   }

}