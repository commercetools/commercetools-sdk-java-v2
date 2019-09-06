package com.commercetools.models.DiscountCode;

import com.commercetools.models.DiscountCode.DiscountCodeUpdateAction;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.DiscountCode.DiscountCodeChangeIsActiveAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DiscountCodeChangeIsActiveActionBuilder {
   
   
   private java.lang.Boolean isActive;
   
   public DiscountCodeChangeIsActiveActionBuilder isActive( final java.lang.Boolean isActive) {
      this.isActive = isActive;
      return this;
   }
   
   
   public java.lang.Boolean getIsActive(){
      return this.isActive;
   }

   public DiscountCodeChangeIsActiveAction build() {
       return new DiscountCodeChangeIsActiveActionImpl(isActive);
   }
   
   public static DiscountCodeChangeIsActiveActionBuilder of() {
      return new DiscountCodeChangeIsActiveActionBuilder();
   }
   
   public static DiscountCodeChangeIsActiveActionBuilder of(final DiscountCodeChangeIsActiveAction template) {
      DiscountCodeChangeIsActiveActionBuilder builder = new DiscountCodeChangeIsActiveActionBuilder();
      builder.isActive = template.getIsActive();
      return builder;
   }
   
}