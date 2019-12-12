package com.commercetools.api.generated.models.product_discount;

import com.commercetools.api.generated.models.product_discount.ProductDiscountUpdateAction;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.product_discount.ProductDiscountSetValidFromAndUntilAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductDiscountSetValidFromAndUntilActionBuilder {
   
   @Nullable
   private java.time.ZonedDateTime validUntil;
   
   @Nullable
   private java.time.ZonedDateTime validFrom;
   
   public ProductDiscountSetValidFromAndUntilActionBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
      this.validUntil = validUntil;
      return this;
   }
   
   public ProductDiscountSetValidFromAndUntilActionBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
      this.validFrom = validFrom;
      return this;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }

   public ProductDiscountSetValidFromAndUntilAction build() {
       return new ProductDiscountSetValidFromAndUntilActionImpl(validUntil, validFrom);
   }
   
   public static ProductDiscountSetValidFromAndUntilActionBuilder of() {
      return new ProductDiscountSetValidFromAndUntilActionBuilder();
   }
   
   public static ProductDiscountSetValidFromAndUntilActionBuilder of(final ProductDiscountSetValidFromAndUntilAction template) {
      ProductDiscountSetValidFromAndUntilActionBuilder builder = new ProductDiscountSetValidFromAndUntilActionBuilder();
      builder.validUntil = template.getValidUntil();
      builder.validFrom = template.getValidFrom();
      return builder;
   }
   
}