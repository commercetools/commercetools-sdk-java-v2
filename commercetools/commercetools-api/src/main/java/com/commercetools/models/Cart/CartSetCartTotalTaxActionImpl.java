package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Cart.TaxPortion;
import com.commercetools.models.Common.Money;
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
public final class CartSetCartTotalTaxActionImpl implements CartSetCartTotalTaxAction {

   private java.lang.String action;
   
   private java.util.List<com.commercetools.models.Cart.TaxPortion> externalTaxPortions;
   
   private com.commercetools.models.Common.Money externalTotalGross;

   @JsonCreator
   CartSetCartTotalTaxActionImpl(@JsonProperty("externalTaxPortions") final java.util.List<com.commercetools.models.Cart.TaxPortion> externalTaxPortions, @JsonProperty("externalTotalGross") final com.commercetools.models.Common.Money externalTotalGross) {
      this.externalTaxPortions = externalTaxPortions;
      this.externalTotalGross = externalTotalGross;
      this.action = "setCartTotalTax";
   }
   public CartSetCartTotalTaxActionImpl() {
      
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