package com.commercetools.models.ProductDiscount;

import com.commercetools.models.ProductDiscount.ProductDiscountUpdateAction;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.ProductDiscount.ProductDiscountChangeIsActiveAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductDiscountChangeIsActiveActionBuilder {
   
   
   private java.lang.Boolean isActive;
   
   public ProductDiscountChangeIsActiveActionBuilder isActive( final java.lang.Boolean isActive) {
      this.isActive = isActive;
      return this;
   }
   
   
   public java.lang.Boolean getIsActive(){
      return this.isActive;
   }

   public ProductDiscountChangeIsActiveAction build() {
       return new ProductDiscountChangeIsActiveActionImpl(isActive);
   }
   
   public static ProductDiscountChangeIsActiveActionBuilder of() {
      return new ProductDiscountChangeIsActiveActionBuilder();
   }
   
   public static ProductDiscountChangeIsActiveActionBuilder of(final ProductDiscountChangeIsActiveAction template) {
      ProductDiscountChangeIsActiveActionBuilder builder = new ProductDiscountChangeIsActiveActionBuilder();
      builder.isActive = template.getIsActive();
      return builder;
   }
   
}