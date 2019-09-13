package com.commercetools.models.product_discount;

import com.commercetools.models.product_discount.ProductDiscountValue;
import java.lang.String;
import com.commercetools.models.product_discount.ProductDiscountValueExternal;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductDiscountValueExternalBuilder {
   
   
   

   public ProductDiscountValueExternal build() {
       return new ProductDiscountValueExternalImpl();
   }
   
   public static ProductDiscountValueExternalBuilder of() {
      return new ProductDiscountValueExternalBuilder();
   }
   
   public static ProductDiscountValueExternalBuilder of(final ProductDiscountValueExternal template) {
      ProductDiscountValueExternalBuilder builder = new ProductDiscountValueExternalBuilder();
      return builder;
   }
   
}