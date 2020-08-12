package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.TaxPortionDraft;
import com.commercetools.api.models.common.TypedMoneyDraft;
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
public final class TaxedPriceDraftImpl implements TaxedPriceDraft {

   private com.commercetools.api.models.common.TypedMoneyDraft totalNet;
   
   private com.commercetools.api.models.common.TypedMoneyDraft totalGross;
   
   private java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> taxPortions;

   @JsonCreator
   TaxedPriceDraftImpl(@JsonProperty("totalNet") final com.commercetools.api.models.common.TypedMoneyDraft totalNet, @JsonProperty("totalGross") final com.commercetools.api.models.common.TypedMoneyDraft totalGross, @JsonProperty("taxPortions") final java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> taxPortions) {
      this.totalNet = totalNet;
      this.totalGross = totalGross;
      this.taxPortions = taxPortions;
   }
   public TaxedPriceDraftImpl() {
      
   }
   
   
   public com.commercetools.api.models.common.TypedMoneyDraft getTotalNet(){
      return this.totalNet;
   }
   
   
   public com.commercetools.api.models.common.TypedMoneyDraft getTotalGross(){
      return this.totalGross;
   }
   
   
   public java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> getTaxPortions(){
      return this.taxPortions;
   }

   public void setTotalNet(final com.commercetools.api.models.common.TypedMoneyDraft totalNet){
      this.totalNet = totalNet;
   }
   
   public void setTotalGross(final com.commercetools.api.models.common.TypedMoneyDraft totalGross){
      this.totalGross = totalGross;
   }
   
   public void setTaxPortions(final java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> taxPortions){
      this.taxPortions = taxPortions;
   }

}
