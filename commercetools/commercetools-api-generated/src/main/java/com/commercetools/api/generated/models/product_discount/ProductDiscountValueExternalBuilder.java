package com.commercetools.api.generated.models.product_discount;

import com.commercetools.api.generated.models.product_discount.ProductDiscountValue;
import com.commercetools.api.generated.models.product_discount.ProductDiscountValueExternal;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
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