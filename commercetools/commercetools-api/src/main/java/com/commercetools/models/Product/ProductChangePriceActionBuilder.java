package com.commercetools.models.product;

import com.commercetools.models.common.PriceDraft;
import com.commercetools.models.product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.product.ProductChangePriceAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductChangePriceActionBuilder {
   
   
   private com.commercetools.models.common.PriceDraft price;
   
   @Nullable
   private java.lang.Boolean staged;
   
   
   private java.lang.String priceId;
   
   public ProductChangePriceActionBuilder price( final com.commercetools.models.common.PriceDraft price) {
      this.price = price;
      return this;
   }
   
   public ProductChangePriceActionBuilder staged(@Nullable final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductChangePriceActionBuilder priceId( final java.lang.String priceId) {
      this.priceId = priceId;
      return this;
   }
   
   
   public com.commercetools.models.common.PriceDraft getPrice(){
      return this.price;
   }
   
   @Nullable
   public java.lang.Boolean getStaged(){
      return this.staged;
   }
   
   
   public java.lang.String getPriceId(){
      return this.priceId;
   }

   public ProductChangePriceAction build() {
       return new ProductChangePriceActionImpl(price, staged, priceId);
   }
   
   public static ProductChangePriceActionBuilder of() {
      return new ProductChangePriceActionBuilder();
   }
   
   public static ProductChangePriceActionBuilder of(final ProductChangePriceAction template) {
      ProductChangePriceActionBuilder builder = new ProductChangePriceActionBuilder();
      builder.price = template.getPrice();
      builder.staged = template.getStaged();
      builder.priceId = template.getPriceId();
      return builder;
   }
   
}