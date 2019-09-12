package com.commercetools.models.Product;

import java.lang.Boolean;
import java.lang.Long;
import com.commercetools.models.Product.ProductVariantChannelAvailability;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductVariantChannelAvailabilityBuilder {
   
   @Nullable
   private java.lang.Long availableQuantity;
   
   @Nullable
   private java.lang.Long restockableInDays;
   
   @Nullable
   private java.lang.Boolean isOnStock;
   
   public ProductVariantChannelAvailabilityBuilder availableQuantity(@Nullable final java.lang.Long availableQuantity) {
      this.availableQuantity = availableQuantity;
      return this;
   }
   
   public ProductVariantChannelAvailabilityBuilder restockableInDays(@Nullable final java.lang.Long restockableInDays) {
      this.restockableInDays = restockableInDays;
      return this;
   }
   
   public ProductVariantChannelAvailabilityBuilder isOnStock(@Nullable final java.lang.Boolean isOnStock) {
      this.isOnStock = isOnStock;
      return this;
   }
   
   @Nullable
   public java.lang.Long getAvailableQuantity(){
      return this.availableQuantity;
   }
   
   @Nullable
   public java.lang.Long getRestockableInDays(){
      return this.restockableInDays;
   }
   
   @Nullable
   public java.lang.Boolean getIsOnStock(){
      return this.isOnStock;
   }

   public ProductVariantChannelAvailability build() {
       return new ProductVariantChannelAvailabilityImpl(availableQuantity, restockableInDays, isOnStock);
   }
   
   public static ProductVariantChannelAvailabilityBuilder of() {
      return new ProductVariantChannelAvailabilityBuilder();
   }
   
   public static ProductVariantChannelAvailabilityBuilder of(final ProductVariantChannelAvailability template) {
      ProductVariantChannelAvailabilityBuilder builder = new ProductVariantChannelAvailabilityBuilder();
      builder.availableQuantity = template.getAvailableQuantity();
      builder.restockableInDays = template.getRestockableInDays();
      builder.isOnStock = template.getIsOnStock();
      return builder;
   }
   
}