package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.ProductVariantChannelAvailabilityMap;
import com.commercetools.api.generated.models.product.ProductVariantAvailabilityImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductVariantAvailabilityImpl.class)
public interface ProductVariantAvailability  {

   
   
   @JsonProperty("isOnStock")
   public Boolean getIsOnStock();
   
   
   @JsonProperty("restockableInDays")
   public Long getRestockableInDays();
   
   
   @JsonProperty("availableQuantity")
   public Long getAvailableQuantity();
   
   @Valid
   @JsonProperty("channels")
   public ProductVariantChannelAvailabilityMap getChannels();

   public void setIsOnStock(final Boolean isOnStock);
   
   public void setRestockableInDays(final Long restockableInDays);
   
   public void setAvailableQuantity(final Long availableQuantity);
   
   public void setChannels(final ProductVariantChannelAvailabilityMap channels);
   
   public static ProductVariantAvailabilityImpl of(){
      return new ProductVariantAvailabilityImpl();
   }
   

   public static ProductVariantAvailabilityImpl of(final ProductVariantAvailability template) {
      ProductVariantAvailabilityImpl instance = new ProductVariantAvailabilityImpl();
      instance.setAvailableQuantity(template.getAvailableQuantity());
      instance.setChannels(template.getChannels());
      instance.setRestockableInDays(template.getRestockableInDays());
      instance.setIsOnStock(template.getIsOnStock());
      return instance;
   }

}