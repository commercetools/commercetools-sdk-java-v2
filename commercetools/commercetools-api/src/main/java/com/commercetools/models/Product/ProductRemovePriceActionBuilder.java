package com.commercetools.models.product;

import com.commercetools.models.product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.product.ProductRemovePriceAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductRemovePriceActionBuilder {
   
   @Nullable
   private java.lang.Boolean staged;
   
   
   private java.lang.String priceId;
   
   public ProductRemovePriceActionBuilder staged(@Nullable final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductRemovePriceActionBuilder priceId( final java.lang.String priceId) {
      this.priceId = priceId;
      return this;
   }
   
   @Nullable
   public java.lang.Boolean getStaged(){
      return this.staged;
   }
   
   
   public java.lang.String getPriceId(){
      return this.priceId;
   }

   public ProductRemovePriceAction build() {
       return new ProductRemovePriceActionImpl(staged, priceId);
   }
   
   public static ProductRemovePriceActionBuilder of() {
      return new ProductRemovePriceActionBuilder();
   }
   
   public static ProductRemovePriceActionBuilder of(final ProductRemovePriceAction template) {
      ProductRemovePriceActionBuilder builder = new ProductRemovePriceActionBuilder();
      builder.staged = template.getStaged();
      builder.priceId = template.getPriceId();
      return builder;
   }
   
}