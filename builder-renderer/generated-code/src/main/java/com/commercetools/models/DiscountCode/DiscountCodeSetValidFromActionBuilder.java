package com.commercetools.models.DiscountCode;

import com.commercetools.models.DiscountCode.DiscountCodeUpdateAction;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.DiscountCode.DiscountCodeSetValidFromAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DiscountCodeSetValidFromActionBuilder {
   
   @Nullable
   private java.time.ZonedDateTime validFrom;
   
   public DiscountCodeSetValidFromActionBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
      this.validFrom = validFrom;
      return this;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }

   public DiscountCodeSetValidFromAction build() {
       return new DiscountCodeSetValidFromActionImpl(validFrom);
   }
   
   public static DiscountCodeSetValidFromActionBuilder of() {
      return new DiscountCodeSetValidFromActionBuilder();
   }
   
   public static DiscountCodeSetValidFromActionBuilder of(final DiscountCodeSetValidFromAction template) {
      DiscountCodeSetValidFromActionBuilder builder = new DiscountCodeSetValidFromActionBuilder();
      builder.validFrom = template.getValidFrom();
      return builder;
   }
   
}