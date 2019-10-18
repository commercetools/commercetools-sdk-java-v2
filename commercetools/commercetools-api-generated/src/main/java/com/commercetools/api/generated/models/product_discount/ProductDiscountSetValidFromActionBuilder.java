package com.commercetools.api.generated.models.product_discount;

import com.commercetools.api.generated.models.product_discount.ProductDiscountUpdateAction;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.product_discount.ProductDiscountSetValidFromAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
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