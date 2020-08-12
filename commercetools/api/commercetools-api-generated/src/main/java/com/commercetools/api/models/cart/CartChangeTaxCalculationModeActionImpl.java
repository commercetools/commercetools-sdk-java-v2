package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.TaxCalculationMode;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartChangeTaxCalculationModeActionImpl implements CartChangeTaxCalculationModeAction {

   private String action;
   
   private com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode;

   @JsonCreator
   CartChangeTaxCalculationModeActionImpl(@JsonProperty("taxCalculationMode") final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode) {
      this.taxCalculationMode = taxCalculationMode;
      this.action = "changeTaxCalculationMode";
   }
   public CartChangeTaxCalculationModeActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.api.models.cart.TaxCalculationMode getTaxCalculationMode(){
      return this.taxCalculationMode;
   }

   public void setTaxCalculationMode(final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode){
      this.taxCalculationMode = taxCalculationMode;
   }

}
