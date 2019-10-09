package com.commercetools.models.shipping_method;

import com.commercetools.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.models.shipping_method.ShippingMethodSetKeyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShippingMethodSetKeyActionBuilder {
   
   @Nullable
   private String key;
   
   public ShippingMethodSetKeyActionBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public String getKey(){
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