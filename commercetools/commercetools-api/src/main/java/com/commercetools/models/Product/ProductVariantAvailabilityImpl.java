package com.commercetools.models.product;

import com.commercetools.models.product.ProductVariantChannelAvailabilityMap;
import java.lang.Boolean;
import java.lang.Long;
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
public final class ProductVariantAvailabilityImpl implements ProductVariantAvailability {

   private java.lang.Long availableQuantity;
   
   private com.commercetools.models.product.ProductVariantChannelAvailabilityMap channels;
   
   private java.lang.Long restockableInDays;
   
   private java.lang.Boolean isOnStock;

   @JsonCreator
   ProductVariantAvailabilityImpl(@JsonProperty("availableQuantity") final java.lang.Long availableQuantity, @JsonProperty("channels") final com.commercetools.models.product.ProductVariantChannelAvailabilityMap channels, @JsonProperty("restockableInDays") final java.lang.Long restockableInDays, @JsonProperty("isOnStock") final java.lang.Boolean isOnStock) {
      this.availableQuantity = availableQuantity;
      this.channels = channels;
      this.restockableInDays = restockableInDays;
      this.isOnStock = isOnStock;
   }
   public ProductVariantAvailabilityImpl() {
      
   }
   
   
   public java.lang.Long getAvailableQuantity(){
      return this.availableQuantity;
   }
   
   
   public com.commercetools.models.product.ProductVariantChannelAvailabilityMap getChannels(){
      return this.channels;
   }
   
   
   public java.lang.Long getRestockableInDays(){
      return this.restockableInDays;
   }
   
   
   public java.lang.Boolean getIsOnStock(){
      return this.isOnStock;
   }

   public void setAvailableQuantity(final java.lang.Long availableQuantity){
      this.availableQuantity = availableQuantity;
   }
   
   public void setChannels(final com.commercetools.models.product.ProductVariantChannelAvailabilityMap channels){
      this.channels = channels;
   }
   
   public void setRestockableInDays(final java.lang.Long restockableInDays){
      this.restockableInDays = restockableInDays;
   }
   
   public void setIsOnStock(final java.lang.Boolean isOnStock){
      this.isOnStock = isOnStock;
   }

}