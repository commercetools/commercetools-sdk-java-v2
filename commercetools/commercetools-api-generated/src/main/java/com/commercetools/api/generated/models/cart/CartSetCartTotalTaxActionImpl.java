package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import com.commercetools.api.generated.models.cart.TaxPortionDraft;
import com.commercetools.api.generated.models.common.Money;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartSetCartTotalTaxActionImpl implements CartSetCartTotalTaxAction {

   private String action;
   
   private java.util.List<com.commercetools.api.generated.models.cart.TaxPortionDraft> externalTaxPortions;
   
   private com.commercetools.api.generated.models.common.Money externalTotalGross;

   @JsonCreator
   CartSetCartTotalTaxActionImpl(@JsonProperty("externalTaxPortions") final java.util.List<com.commercetools.api.generated.models.cart.TaxPortionDraft> externalTaxPortions, @JsonProperty("externalTotalGross") final com.commercetools.api.generated.models.common.Money externalTotalGross) {
      this.externalTaxPortions = externalTaxPortions;
      this.externalTotalGross = externalTotalGross;
      this.action = "setCartTotalTax";
   }
   public CartSetCartTotalTaxActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.cart.TaxPortionDraft> getExternalTaxPortions(){
      return this.externalTaxPortions;
   }
   
   /**
   *  <p>The total gross amount of the cart (totalNet + taxes).</p>
   */
   public com.commercetools.api.generated.models.common.Money getExternalTotalGross(){
      return this.externalTotalGross;
   }

   public void setExternalTaxPortions(final java.util.List<com.commercetools.api.generated.models.cart.TaxPortionDraft> externalTaxPortions){
      this.externalTaxPortions = externalTaxPortions;
   }
   
   public void setExternalTotalGross(final com.commercetools.api.generated.models.common.Money externalTotalGross){
      this.externalTotalGross = externalTotalGross;
   }

}