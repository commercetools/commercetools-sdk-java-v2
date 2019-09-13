package com.commercetools.models.shipping_method;

import com.commercetools.models.shipping_method.ShippingMethodUpdateAction;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.shipping_method.ShippingMethodChangeIsDefaultAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShippingMethodChangeIsDefaultActionBuilder {
   
   
   private java.lang.Boolean isDefault;
   
   public ShippingMethodChangeIsDefaultActionBuilder isDefault( final java.lang.Boolean isDefault) {
      this.isDefault = isDefault;
      return this;
   }
   
   
   public java.lang.Boolean getIsDefault(){
      return this.isDefault;
   }

   public ShippingMethodChangeIsDefaultAction build() {
       return new ShippingMethodChangeIsDefaultActionImpl(isDefault);
   }
   
   public static ShippingMethodChangeIsDefaultActionBuilder of() {
      return new ShippingMethodChangeIsDefaultActionBuilder();
   }
   
   public static ShippingMethodChangeIsDefaultActionBuilder of(final ShippingMethodChangeIsDefaultAction template) {
      ShippingMethodChangeIsDefaultActionBuilder builder = new ShippingMethodChangeIsDefaultActionBuilder();
      builder.isDefault = template.getIsDefault();
      return builder;
   }
   
}