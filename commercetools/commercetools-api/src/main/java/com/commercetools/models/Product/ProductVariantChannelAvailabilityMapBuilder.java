package com.commercetools.models.product;

import com.commercetools.models.product.ProductVariantChannelAvailability;
import com.commercetools.models.product.ProductVariantChannelAvailabilityMap;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductVariantChannelAvailabilityMapBuilder {
   
   
   private Map<String, com.commercetools.models.product.ProductVariantChannelAvailability> values;
   
   public ProductVariantChannelAvailabilityMapBuilder values( final Map<String, com.commercetools.models.product.ProductVariantChannelAvailability> values){
      this.values = values;
      return this;
   }
   
   
   public Map<String, com.commercetools.models.product.ProductVariantChannelAvailability> getValues(){
      return this.values;
   }

   public ProductVariantChannelAvailabilityMap build() {
       return new ProductVariantChannelAvailabilityMapImpl(values);
   }
   
   public static ProductVariantChannelAvailabilityMapBuilder of() {
      return new ProductVariantChannelAvailabilityMapBuilder();
   }
   
   public static ProductVariantChannelAvailabilityMapBuilder of(final ProductVariantChannelAvailabilityMap template) {
      ProductVariantChannelAvailabilityMapBuilder builder = new ProductVariantChannelAvailabilityMapBuilder();
      builder.values = template.values();
      return builder;
   }
   
}