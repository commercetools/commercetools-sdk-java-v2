package com.commercetools.models.ShippingMethod;

import com.commercetools.models.ShippingMethod.ShippingMethodUpdateAction;
import java.lang.String;
import com.commercetools.models.ShippingMethod.ShippingMethodSetKeyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShippingMethodSetKeyActionBuilder {
   
   @Nullable
   private java.lang.String key;
   
   public ShippingMethodSetKeyActionBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }

   public ShippingMethodSetKeyAction build() {
       return new ShippingMethodSetKeyActionImpl(key);
   }
   
   public static ShippingMethodSetKeyActionBuilder of() {
      return new ShippingMethodSetKeyActionBuilder();
   }
   
   public static ShippingMethodSetKeyActionBuilder of(final ShippingMethodSetKeyAction template) {
      ShippingMethodSetKeyActionBuilder builder = new ShippingMethodSetKeyActionBuilder();
      builder.key = template.getKey();
      return builder;
   }
   
}