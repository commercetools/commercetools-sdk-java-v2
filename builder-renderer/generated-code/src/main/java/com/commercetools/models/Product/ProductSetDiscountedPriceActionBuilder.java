package com.commercetools.models.Product;

import com.commercetools.models.Common.DiscountedPrice;
import com.commercetools.models.Product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.Product.ProductSetDiscountedPriceAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductSetDiscountedPriceActionBuilder {
   
   @Nullable
   private com.commercetools.models.Common.DiscountedPrice discounted;
   
   @Nullable
   private java.lang.Boolean staged;
   
   
   private java.lang.String priceId;
   
   public ProductSetDiscountedPriceActionBuilder discounted(@Nullable final com.commercetools.models.Common.DiscountedPrice discounted) {
      this.discounted = discounted;
      return this;
   }
   
   public ProductSetDiscountedPriceActionBuilder staged(@Nullable final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductSetDiscountedPriceActionBuilder priceId( final java.lang.String priceId) {
      this.priceId = priceId;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Common.DiscountedPrice getDiscounted(){
      return this.discounted;
   }
   
   @Nullable
   public java.lang.Boolean getStaged(){
      return this.staged;
   }
   
   
   public java.lang.String getPriceId(){
      return this.priceId;
   }

   public ProductSetDiscountedPriceAction build() {
       return new ProductSetDiscountedPriceActionImpl(discounted, staged, priceId);
   }
   
   public static ProductSetDiscountedPriceActionBuilder of() {
      return new ProductSetDiscountedPriceActionBuilder();
   }
   
   public static ProductSetDiscountedPriceActionBuilder of(final ProductSetDiscountedPriceAction template) {
      ProductSetDiscountedPriceActionBuilder builder = new ProductSetDiscountedPriceActionBuilder();
      builder.discounted = template.getDiscounted();
      builder.staged = template.getStaged();
      builder.priceId = template.getPriceId();
      return builder;
   }
   
}