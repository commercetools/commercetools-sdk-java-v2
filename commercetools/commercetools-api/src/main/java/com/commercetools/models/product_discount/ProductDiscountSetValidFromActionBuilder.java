package com.commercetools.models.product_discount;

import com.commercetools.models.product_discount.ProductDiscountUpdateAction;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.product_discount.ProductDiscountSetValidFromAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductDiscountSetValidFromActionBuilder {
   
   @Nullable
   private java.time.ZonedDateTime validFrom;
   
   public ProductDiscountSetValidFromActionBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
      this.validFrom = validFrom;
      return this;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }

   public ProductDiscountSetValidFromAction build() {
       return new ProductDiscountSetValidFromActionImpl(validFrom);
   }
   
   public static ProductDiscountSetValidFromActionBuilder of() {
      return new ProductDiscountSetValidFromActionBuilder();
   }
   
   public static ProductDiscountSetValidFromActionBuilder of(final ProductDiscountSetValidFromAction template) {
      ProductDiscountSetValidFromActionBuilder builder = new ProductDiscountSetValidFromActionBuilder();
      builder.validFrom = template.getValidFrom();
      return builder;
   }
   
}