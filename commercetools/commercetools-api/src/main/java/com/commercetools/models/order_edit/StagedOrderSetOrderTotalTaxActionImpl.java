package com.commercetools.models.order_edit;

import com.commercetools.models.cart.TaxPortion;
import com.commercetools.models.common.Money;
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
public final class StagedOrderSetOrderTotalTaxActionImpl implements StagedOrderSetOrderTotalTaxAction {

   private java.lang.String action;
   
   private java.util.List<com.commercetools.models.cart.TaxPortion> externalTaxPortions;
   
   private com.commercetools.models.common.Money externalTotalGross;

   @JsonCreator
   StagedOrderSetOrderTotalTaxActionImpl(@JsonProperty("externalTaxPortions") final java.util.List<com.commercetools.models.cart.TaxPortion> externalTaxPortions, @JsonProperty("externalTotalGross") final com.commercetools.models.common.Money externalTotalGross) {
      this.externalTaxPortions = externalTaxPortions;
      this.externalTotalGross = externalTotalGross;
      this.action = "setOrderTotalTax";
   }
   public StagedOrderSetOrderTotalTaxActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.util.List<com.commercetools.models.cart.TaxPortion> getExternalTaxPortions(){
      return this.externalTaxPortions;
   }
   
   
   public com.commercetools.models.common.Money getExternalTotalGross(){
      return this.externalTotalGross;
   }

   public void setExternalTaxPortions(final java.util.List<com.commercetools.models.cart.TaxPortion> externalTaxPortions){
      this.externalTaxPortions = externalTaxPortions;
   }
   
   public void setExternalTotalGross(final com.commercetools.models.common.Money externalTotalGross){
      this.externalTotalGross = externalTotalGross;
   }

}