package com.commercetools.models.ShippingMethod;

import com.commercetools.models.ShippingMethod.ShippingMethodUpdateAction;
import java.lang.String;
import com.commercetools.models.ShippingMethod.ShippingMethodChangeNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShippingMethodChangeNameActionBuilder {
   
   
   private java.lang.String name;
   
   public ShippingMethodChangeNameActionBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }

   public ShippingMethodChangeNameAction build() {
       return new ShippingMethodChangeNameActionImpl(name);
   }
   
   public static ShippingMethodChangeNameActionBuilder of() {
      return new ShippingMethodChangeNameActionBuilder();
   }
   
   public static ShippingMethodChangeNameActionBuilder of(final ShippingMethodChangeNameAction template) {
      ShippingMethodChangeNameActionBuilder builder = new ShippingMethodChangeNameActionBuilder();
      builder.name = template.getName();
      return builder;
   }
   
}