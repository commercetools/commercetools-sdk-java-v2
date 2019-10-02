package com.commercetools.models.product;

import com.commercetools.models.product.ProductVariantChannelAvailabilityMap;
import com.commercetools.models.product.ProductVariantAvailability;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductVariantAvailabilityBuilder {
   
   @Nullable
   private Long availableQuantity;
   
   @Nullable
   private com.commercetools.models.product.ProductVariantChannelAvailabilityMap channels;
   
   @Nullable
   private Long restockableInDays;
   
   @Nullable
   private Boolean isOnStock;
   
   public ProductVariantAvailabilityBuilder availableQuantity(@Nullable final Long availableQuantity) {
      this.availableQuantity = availableQuantity;
      return this;
   }
   
   public ProductVariantAvailabilityBuilder channels(@Nullable final com.commercetools.models.product.ProductVariantChannelAvailabilityMap channels) {
      this.channels = channels;
      return this;
   }
   
   public ProductVariantAvailabilityBuilder restockableInDays(@Nullable final Long restockableInDays) {
      this.restockableInDays = restockableInDays;
      return this;
   }
   
   public ProductVariantAvailabilityBuilder isOnStock(@Nullable final Boolean isOnStock) {
      this.isOnStock = isOnStock;
      return this;
   }
   
   @Nullable
   public Long getAvailableQuantity(){
      return this.availableQuantity;
   }
   
   @Nullable
   public com.commercetools.models.product.ProductVariantChannelAvailabilityMap getChannels(){
      return this.channels;
   }
   
   @Nullable
   public Long getRestockableInDays(){
      return this.restockableInDays;
   }
   
   @Nullable
   public Boolean getIsOnStock(){
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