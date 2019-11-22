package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.TaxPortionDraft;
import com.commercetools.api.generated.models.common.TypedMoneyDraft;
import io.vrap.rmf.base.client.utils.Generated;
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
public final class TaxedPriceDraftImpl implements TaxedPriceDraft {

   private java.util.List<com.commercetools.api.generated.models.cart.TaxPortionDraft> taxPortions;
   
   private com.commercetools.api.generated.models.common.TypedMoneyDraft totalGross;
   
   private com.commercetools.api.generated.models.common.TypedMoneyDraft totalNet;

   @JsonCreator
   TaxedPriceDraftImpl(@JsonProperty("taxPortions") final java.util.List<com.commercetools.api.generated.models.cart.TaxPortionDraft> taxPortions, @JsonProperty("totalGross") final com.commercetools.api.generated.models.common.TypedMoneyDraft totalGross, @JsonProperty("totalNet") final com.commercetools.api.generated.models.common.TypedMoneyDraft totalNet) {
      this.taxPortions = taxPortions;
      this.totalGross = totalGross;
      this.totalNet = totalNet;
   }
   public TaxedPriceDraftImpl() {
      
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.cart.TaxPortionDraft> getTaxPortions(){
      return this.taxPortions;
   }
   
   
   public com.commercetools.api.generated.models.common.TypedMoneyDraft getTotalGross(){
      return this.totalGross;
   }
   
   
   public com.commercetools.api.generated.models.common.TypedMoneyDraft getTotalNet(){
      return this.totalNet;
   }

   public void setTaxPortions(final java.util.List<com.commercetools.api.generated.models.cart.TaxPortionDraft> taxPortions){
      this.taxPortions = taxPortions;
   }
   
   public void setTotalGross(final com.commercetools.api.generated.models.common.TypedMoneyDraft totalGross){
      this.totalGross = totalGross;
   }
   
   public void setTotalNet(final com.commercetools.api.generated.models.common.TypedMoneyDraft totalNet){
      this.totalNet = totalNet;
   }

}