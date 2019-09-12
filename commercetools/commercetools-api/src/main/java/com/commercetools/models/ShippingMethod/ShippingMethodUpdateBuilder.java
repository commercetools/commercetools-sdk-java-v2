package com.commercetools.models.ShippingMethod;

import com.commercetools.models.ShippingMethod.ShippingMethodUpdateAction;
import java.lang.Long;
import com.commercetools.models.ShippingMethod.ShippingMethodUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShippingMethodUpdateBuilder {
   
   
   private java.util.List<com.commercetools.models.ShippingMethod.ShippingMethodUpdateAction> actions;
   
   
   private java.lang.Long version;
   
   public ShippingMethodUpdateBuilder actions( final java.util.List<com.commercetools.models.ShippingMethod.ShippingMethodUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public ShippingMethodUpdateBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.ShippingMethod.ShippingMethodUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }

   public ShippingMethodUpdate build() {
       return new ShippingMethodUpdateImpl(actions, version);
   }
   
   public static ShippingMethodUpdateBuilder of() {
      return new ShippingMethodUpdateBuilder();
   }
   
   public static ShippingMethodUpdateBuilder of(final ShippingMethodUpdate template) {
      ShippingMethodUpdateBuilder builder = new ShippingMethodUpdateBuilder();
      builder.actions = template.getActions();
      builder.version = template.getVersion();
      return builder;
   }
   
}