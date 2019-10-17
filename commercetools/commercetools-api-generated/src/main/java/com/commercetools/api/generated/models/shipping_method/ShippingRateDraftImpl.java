package com.commercetools.api.generated.models.shipping_method;

import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.shipping_method.ShippingRatePriceTier;
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

   private java.util.List<com.commercetools.api.generated.models.shipping_method.ShippingRatePriceTier> tiers;
   
   private com.commercetools.api.generated.models.common.Money price;
   
   private com.commercetools.api.generated.models.common.Money freeAbove;

   @JsonCreator
   ShippingRateDraftImpl(@JsonProperty("tiers") final java.util.List<com.commercetools.api.generated.models.shipping_method.ShippingRatePriceTier> tiers, @JsonProperty("price") final com.commercetools.api.generated.models.common.Money price, @JsonProperty("freeAbove") final com.commercetools.api.generated.models.common.Money freeAbove) {
      this.tiers = tiers;
      this.price = price;
      this.freeAbove = freeAbove;
   }
   public ShippingRateDraftImpl() {
      
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.shipping_method.ShippingRatePriceTier> getTiers(){
      return this.tiers;
   }
   
   
   public com.commercetools.api.generated.models.common.Money getPrice(){
      return this.price;
   }
   
   
   public com.commercetools.api.generated.models.common.Money getFreeAbove(){
      return this.freeAbove;
   }

   public void setTiers(final java.util.List<com.commercetools.api.generated.models.shipping_method.ShippingRatePriceTier> tiers){
      this.tiers = tiers;
   }
   
   public void setPrice(final com.commercetools.api.generated.models.common.Money price){
      this.price = price;
   }
   
   public void setFreeAbove(final com.commercetools.api.generated.models.common.Money freeAbove){
      this.freeAbove = freeAbove;
   }

}