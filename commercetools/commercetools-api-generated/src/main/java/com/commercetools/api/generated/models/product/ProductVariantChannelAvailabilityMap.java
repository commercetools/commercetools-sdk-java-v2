package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.ProductVariantChannelAvailability;
import com.commercetools.api.generated.models.product.ProductVariantChannelAvailabilityMapImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
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
@JsonDeserialize(as = ProductVariantChannelAvailabilityMapImpl.class)
public interface ProductVariantChannelAvailabilityMap  {

   
   @NotNull
   @Valid
   @JsonAnyGetter
   public Map<String, ProductVariantChannelAvailability> values();

   @JsonAnySetter
   public void setValue(String key, ProductVariantChannelAvailability value);
   
   public static ProductVariantChannelAvailabilityMapImpl of(){
      return new ProductVariantChannelAvailabilityMapImpl();
   }
   

   public static ProductVariantChannelAvailabilityMapImpl of(final ProductVariantChannelAvailabilityMap template) {
      ProductVariantChannelAvailabilityMapImpl instance = new ProductVariantChannelAvailabilityMapImpl();
      return instance;
   }

}