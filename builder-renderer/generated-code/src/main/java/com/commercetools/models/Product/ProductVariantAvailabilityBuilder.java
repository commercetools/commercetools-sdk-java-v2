package com.commercetools.models.Product;

import com.commercetools.models.Product.ProductVariantChannelAvailabilityMap;
import java.lang.Boolean;
import java.lang.Long;
import com.commercetools.models.Product.ProductVariantAvailability;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductVariantAvailabilityBuilder {
   
   @Nullable
   private java.lang.Long availableQuantity;
   
   @Nullable
   private com.commercetools.models.Product.ProductVariantChannelAvailabilityMap channels;
   
   @Nullable
   private java.lang.Long restockableInDays;
   
   @Nullable
   private java.lang.Boolean isOnStock;
   
   public ProductVariantAvailabilityBuilder availableQuantity(@Nullable final java.lang.Long availableQuantity) {
      this.availableQuantity = availableQuantity;
      return this;
   }
   
   public ProductVariantAvailabilityBuilder channels(@Nullable final com.commercetools.models.Product.ProductVariantChannelAvailabilityMap channels) {
      this.channels = channels;
      return this;
   }
   
   public ProductVariantAvailabilityBuilder restockableInDays(@Nullable final java.lang.Long restockableInDays) {
      this.restockableInDays = restockableInDays;
      return this;
   }
   
   public ProductVariantAvailabilityBuilder isOnStock(@Nullable final java.lang.Boolean isOnStock) {
      this.isOnStock = isOnStock;
      return this;
   }
   
   @Nullable
   public java.lang.Long getAvailableQuantity(){
      return this.availableQuantity;
   }
   
   @Nullable
   public com.commercetools.models.Product.ProductVariantChannelAvailabilityMap getChannels(){
      return this.channels;
   }
   
   @Nullable
   public java.lang.Long getRestockableInDays(){
      return this.restockableInDays;
   }
   
   @Nullable
   public java.lang.Boolean getIsOnStock(){
      return this.isOnStock;
   }

   public ProductVariantAvailability build() {
       return new ProductVariantAvailabilityImpl(availableQuantity, channels, restockableInDays, isOnStock);
   }
   
   public static ProductVariantAvailabilityBuilder of() {
      return new ProductVariantAvailabilityBuilder();
   }
   
   public static ProductVariantAvailabilityBuilder of(final ProductVariantAvailability template) {
      ProductVariantAvailabilityBuilder builder = new ProductVariantAvailabilityBuilder();
      builder.availableQuantity = template.getAvailableQuantity();
      builder.channels = template.getChannels();
      builder.restockableInDays = template.getRestockableInDays();
      builder.isOnStock = template.getIsOnStock();
      return builder;
   }
   
}