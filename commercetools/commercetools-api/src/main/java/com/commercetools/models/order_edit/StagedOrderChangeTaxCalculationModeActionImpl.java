package com.commercetools.models.order_edit;

import com.commercetools.models.cart.TaxCalculationMode;
import com.commercetools.models.order.StagedOrderUpdateAction;
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
public final class StagedOrderChangeTaxCalculationModeActionImpl implements StagedOrderChangeTaxCalculationModeAction {

   private String action;
   
   private com.commercetools.models.cart.TaxCalculationMode taxCalculationMode;

   @JsonCreator
   StagedOrderChangeTaxCalculationModeActionImpl(@JsonProperty("taxCalculationMode") final com.commercetools.models.cart.TaxCalculationMode taxCalculationMode) {
      this.taxCalculationMode = taxCalculationMode;
      this.action = "changeTaxCalculationMode";
   }
   public StagedOrderChangeTaxCalculationModeActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.cart.TaxCalculationMode getTaxCalculationMode(){
      return this.taxCalculationMode;
   }

   public void setTaxCalculationMode(final com.commercetools.models.cart.TaxCalculationMode taxCalculationMode){
      this.taxCalculationMode = taxCalculationMode;
   }

}