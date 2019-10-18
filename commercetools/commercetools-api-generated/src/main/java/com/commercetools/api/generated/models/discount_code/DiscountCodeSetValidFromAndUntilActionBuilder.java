package com.commercetools.api.generated.models.discount_code;

import com.commercetools.api.generated.models.discount_code.DiscountCodeUpdateAction;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.discount_code.DiscountCodeSetValidFromAndUntilAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DiscountCodeSetValidFromAndUntilActionBuilder {
   
   @Nullable
   private java.time.ZonedDateTime validUntil;
   
   @Nullable
   private java.time.ZonedDateTime validFrom;
   
   public DiscountCodeSetValidFromAndUntilActionBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
      this.validUntil = validUntil;
      return this;
   }
   
   public DiscountCodeSetValidFromAndUntilActionBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
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

   public DiscountCodeSetValidFromAndUntilAction build() {
       return new DiscountCodeSetValidFromAndUntilActionImpl(validUntil, validFrom);
   }
   
   public static DiscountCodeSetValidFromAndUntilActionBuilder of() {
      return new DiscountCodeSetValidFromAndUntilActionBuilder();
   }
   
   public static DiscountCodeSetValidFromAndUntilActionBuilder of(final DiscountCodeSetValidFromAndUntilAction template) {
      DiscountCodeSetValidFromAndUntilActionBuilder builder = new DiscountCodeSetValidFromAndUntilActionBuilder();
      builder.validUntil = template.getValidUntil();
      builder.validFrom = template.getValidFrom();
      return builder;
   }
   
}