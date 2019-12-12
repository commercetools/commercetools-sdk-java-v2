package com.commercetools.api.generated.models.shipping_method;

import com.commercetools.api.generated.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.generated.models.shipping_method.ShippingMethodUpdate;
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
public final class ShippingMethodUpdateBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.shipping_method.ShippingMethodUpdateAction> actions;
   
   
   private Long version;
   
   public ShippingMethodUpdateBuilder actions( final java.util.List<com.commercetools.api.generated.models.shipping_method.ShippingMethodUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public ShippingMethodUpdateBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.shipping_method.ShippingMethodUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public Long getVersion(){
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