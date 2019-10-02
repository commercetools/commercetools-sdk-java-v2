package com.commercetools.models.product;

import com.commercetools.models.common.DiscountedPrice;
import com.commercetools.models.product.ProductUpdateAction;
import com.commercetools.models.product.ProductSetDiscountedPriceAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductSetDiscountedPriceActionBuilder {
   
   @Nullable
   private com.commercetools.models.common.DiscountedPrice discounted;
   
   @Nullable
   private Boolean staged;
   
   
   private String priceId;
   
   public ProductSetDiscountedPriceActionBuilder discounted(@Nullable final com.commercetools.models.common.DiscountedPrice discounted) {
      this.discounted = discounted;
      return this;
   }
   
   public ProductSetDiscountedPriceActionBuilder staged(@Nullable final Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductSetDiscountedPriceActionBuilder priceId( final String priceId) {
      this.priceId = priceId;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.common.DiscountedPrice getDiscounted(){
      return this.discounted;
   }
   
   @Nullable
   public Boolean getStaged(){
      return this.staged;
   }
   
   
   public String getPriceId(){
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