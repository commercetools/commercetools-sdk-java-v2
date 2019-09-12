package com.commercetools.models.OrderEdit;

import com.commercetools.models.Cart.TaxMode;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderChangeTaxModeActionImpl implements StagedOrderChangeTaxModeAction {

   private java.lang.String action;
   
   private com.commercetools.models.Cart.TaxMode taxMode;

   @JsonCreator
   StagedOrderChangeTaxModeActionImpl(@JsonProperty("taxMode") final com.commercetools.models.Cart.TaxMode taxMode) {
      this.taxMode = taxMode;
      this.action = "changeTaxMode";
   }
   public StagedOrderChangeTaxModeActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.Cart.TaxMode getTaxMode(){
      return this.taxMode;
   }

   public void setTaxMode(final com.commercetools.models.Cart.TaxMode taxMode){
      this.taxMode = taxMode;
   }

}