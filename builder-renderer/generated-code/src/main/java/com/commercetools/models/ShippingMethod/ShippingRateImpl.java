package com.commercetools.models.ShippingMethod;

import com.commercetools.models.Common.TypedMoney;
import com.commercetools.models.ShippingMethod.ShippingRatePriceTier;
import java.lang.Boolean;
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
public final class ShippingRateImpl implements ShippingRate {

   private java.util.List<com.commercetools.models.ShippingMethod.ShippingRatePriceTier> tiers;
   
   private com.commercetools.models.Common.TypedMoney price;
   
   private com.commercetools.models.Common.TypedMoney freeAbove;
   
   private java.lang.Boolean isMatching;

   @JsonCreator
   ShippingRateImpl(@JsonProperty("tiers") final java.util.List<com.commercetools.models.ShippingMethod.ShippingRatePriceTier> tiers, @JsonProperty("price") final com.commercetools.models.Common.TypedMoney price, @JsonProperty("freeAbove") final com.commercetools.models.Common.TypedMoney freeAbove, @JsonProperty("isMatching") final java.lang.Boolean isMatching) {
      this.tiers = tiers;
      this.price = price;
      this.freeAbove = freeAbove;
      this.isMatching = isMatching;
   }
   public ShippingRateImpl() {
      
   }
   
   
   public java.util.List<com.commercetools.models.ShippingMethod.ShippingRatePriceTier> getTiers(){
      return this.tiers;
   }
   
   
   public com.commercetools.models.Common.TypedMoney getPrice(){
      return this.price;
   }
   
   
   public com.commercetools.models.Common.TypedMoney getFreeAbove(){
      return this.freeAbove;
   }
   
   
   public java.lang.Boolean getIsMatching(){
      return this.isMatching;
   }

   public void setTiers(final java.util.List<com.commercetools.models.ShippingMethod.ShippingRatePriceTier> tiers){
      this.tiers = tiers;
   }
   
   public void setPrice(final com.commercetools.models.Common.TypedMoney price){
      this.price = price;
   }
   
   public void setFreeAbove(final com.commercetools.models.Common.TypedMoney freeAbove){
      this.freeAbove = freeAbove;
   }
   
   public void setIsMatching(final java.lang.Boolean isMatching){
      this.isMatching = isMatching;
   }

}