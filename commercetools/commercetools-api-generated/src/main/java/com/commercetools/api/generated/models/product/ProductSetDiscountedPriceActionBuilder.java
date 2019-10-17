package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.common.DiscountedPrice;
import com.commercetools.api.generated.models.product.ProductUpdateAction;
import com.commercetools.api.generated.models.product.ProductSetDiscountedPriceAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductSetDiscountedPriceActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.common.DiscountedPrice discounted;
   
   @Nullable
   private Boolean staged;
   
   
   private String priceId;
   
   public ProductSetDiscountedPriceActionBuilder discounted(@Nullable final com.commercetools.api.generated.models.common.DiscountedPrice discounted) {
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
   public com.commercetools.api.generated.models.common.DiscountedPrice getDiscounted(){
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