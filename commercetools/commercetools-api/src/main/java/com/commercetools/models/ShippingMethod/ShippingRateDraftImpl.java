package com.commercetools.models.ShippingMethod;

import com.commercetools.models.Common.Money;
import com.commercetools.models.ShippingMethod.ShippingRatePriceTier;
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
public final class ShippingRateDraftImpl implements ShippingRateDraft {

   private java.util.List<com.commercetools.models.ShippingMethod.ShippingRatePriceTier> tiers;
   
   private com.commercetools.models.Common.Money price;
   
   private com.commercetools.models.Common.Money freeAbove;

   @JsonCreator
   ShippingRateDraftImpl(@JsonProperty("tiers") final java.util.List<com.commercetools.models.ShippingMethod.ShippingRatePriceTier> tiers, @JsonProperty("price") final com.commercetools.models.Common.Money price, @JsonProperty("freeAbove") final com.commercetools.models.Common.Money freeAbove) {
      this.tiers = tiers;
      this.price = price;
      this.freeAbove = freeAbove;
   }
   public ShippingRateDraftImpl() {
      
   }
   
   
   public java.util.List<com.commercetools.models.ShippingMethod.ShippingRatePriceTier> getTiers(){
      return this.tiers;
   }
   
   
   public com.commercetools.models.Common.Money getPrice(){
      return this.price;
   }
   
   
   public com.commercetools.models.Common.Money getFreeAbove(){
      return this.freeAbove;
   }

   public void setTiers(final java.util.List<com.commercetools.models.ShippingMethod.ShippingRatePriceTier> tiers){
      this.tiers = tiers;
   }
   
   public void setPrice(final com.commercetools.models.Common.Money price){
      this.price = price;
   }
   
   public void setFreeAbove(final com.commercetools.models.Common.Money freeAbove){
      this.freeAbove = freeAbove;
   }

}