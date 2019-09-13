package com.commercetools.models.product_discount;

import com.commercetools.models.product_discount.ProductDiscountUpdateAction;
import java.lang.String;
import com.commercetools.models.product_discount.ProductDiscountSetKeyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductDiscountSetKeyActionBuilder {
   
   @Nullable
   private java.lang.String key;
   
   public ProductDiscountSetKeyActionBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }

   public ProductDiscountSetKeyAction build() {
       return new ProductDiscountSetKeyActionImpl(key);
   }
   
   public static ProductDiscountSetKeyActionBuilder of() {
      return new ProductDiscountSetKeyActionBuilder();
   }
   
   public static ProductDiscountSetKeyActionBuilder of(final ProductDiscountSetKeyAction template) {
      ProductDiscountSetKeyActionBuilder builder = new ProductDiscountSetKeyActionBuilder();
      builder.key = template.getKey();
      return builder;
   }
   
}