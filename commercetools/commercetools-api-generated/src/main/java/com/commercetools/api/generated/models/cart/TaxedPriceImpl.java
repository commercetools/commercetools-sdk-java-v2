package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.TaxPortion;
import com.commercetools.api.generated.models.common.TypedMoney;
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
public final class TaxedPriceImpl implements TaxedPrice {

   private java.util.List<com.commercetools.api.generated.models.cart.TaxPortion> taxPortions;
   
   private com.commercetools.api.generated.models.common.TypedMoney totalGross;
   
   private com.commercetools.api.generated.models.common.TypedMoney totalNet;

   @JsonCreator
   TaxedPriceImpl(@JsonProperty("taxPortions") final java.util.List<com.commercetools.api.generated.models.cart.TaxPortion> taxPortions, @JsonProperty("totalGross") final com.commercetools.api.generated.models.common.TypedMoney totalGross, @JsonProperty("totalNet") final com.commercetools.api.generated.models.common.TypedMoney totalNet) {
      this.taxPortions = taxPortions;
      this.totalGross = totalGross;
      this.totalNet = totalNet;
   }
   public TaxedPriceImpl() {
      
   }
   
   /**
   	<p>TaxedPrice fields that can be used in query predicates: <code>totalNet</code>, <code>totalGross</code>.</p>
   */
   public java.util.List<com.commercetools.api.generated.models.cart.TaxPortion> getTaxPortions(){
      return this.taxPortions;
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.common.TypedMoney getTotalGross(){
      return this.totalGross;
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.common.TypedMoney getTotalNet(){
      return this.totalNet;
   }

   public void setTaxPortions(final java.util.List<com.commercetools.api.generated.models.cart.TaxPortion> taxPortions){
      this.taxPortions = taxPortions;
   }
   
   public void setTotalGross(final com.commercetools.api.generated.models.common.TypedMoney totalGross){
      this.totalGross = totalGross;
   }
   
   public void setTotalNet(final com.commercetools.api.generated.models.common.TypedMoney totalNet){
      this.totalNet = totalNet;
   }

}