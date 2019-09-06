package com.commercetools.models.OrderEdit;

import com.commercetools.models.Cart.TaxPortion;
import com.commercetools.models.Common.Money;
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
public final class StagedOrderSetOrderTotalTaxActionImpl implements StagedOrderSetOrderTotalTaxAction {

   private java.lang.String action;
   
   private java.util.List<com.commercetools.models.Cart.TaxPortion> externalTaxPortions;
   
   private com.commercetools.models.Common.Money externalTotalGross;

   @JsonCreator
   StagedOrderSetOrderTotalTaxActionImpl(@JsonProperty("externalTaxPortions") final java.util.List<com.commercetools.models.Cart.TaxPortion> externalTaxPortions, @JsonProperty("externalTotalGross") final com.commercetools.models.Common.Money externalTotalGross) {
      this.externalTaxPortions = externalTaxPortions;
      this.externalTotalGross = externalTotalGross;
      this.action = "setOrderTotalTax";
   }
   public StagedOrderSetOrderTotalTaxActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.util.List<com.commercetools.models.Cart.TaxPortion> getExternalTaxPortions(){
      return this.externalTaxPortions;
   }
   
   
   public com.commercetools.models.Common.Money getExternalTotalGross(){
      return this.externalTotalGross;
   }

   public void setExternalTaxPortions(final java.util.List<com.commercetools.models.Cart.TaxPortion> externalTaxPortions){
      this.externalTaxPortions = externalTaxPortions;
   }
   
   public void setExternalTotalGross(final com.commercetools.models.Common.Money externalTotalGross){
      this.externalTotalGross = externalTotalGross;
   }

}