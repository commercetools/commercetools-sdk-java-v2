package com.commercetools.api.generated.models.product;


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
public final class ProductVariantChannelAvailabilityImpl implements ProductVariantChannelAvailability {

   private Long availableQuantity;
   
   private Long restockableInDays;
   
   private Boolean isOnStock;

   @JsonCreator
   ProductVariantChannelAvailabilityImpl(@JsonProperty("availableQuantity") final Long availableQuantity, @JsonProperty("restockableInDays") final Long restockableInDays, @JsonProperty("isOnStock") final Boolean isOnStock) {
      this.availableQuantity = availableQuantity;
      this.restockableInDays = restockableInDays;
      this.isOnStock = isOnStock;
   }
   public ProductVariantChannelAvailabilityImpl() {
      
   }
   
   
   public Long getAvailableQuantity(){
      return this.availableQuantity;
   }
   
   
   public Long getRestockableInDays(){
      return this.restockableInDays;
   }
   
   
   public Boolean getIsOnStock(){
      return this.isOnStock;
   }

   public void setAvailableQuantity(final Long availableQuantity){
      this.availableQuantity = availableQuantity;
   }
   
   public void setRestockableInDays(final Long restockableInDays){
      this.restockableInDays = restockableInDays;
   }
   
   public void setIsOnStock(final Boolean isOnStock){
      this.isOnStock = isOnStock;
   }

}