package com.commercetools.api.generated.models.shipping_method;

import com.commercetools.api.generated.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.generated.models.shipping_method.ShippingMethodSetDescriptionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShippingMethodSetDescriptionActionBuilder {
   
   @Nullable
   private String description;
   
   public ShippingMethodSetDescriptionActionBuilder description(@Nullable final String description) {
      this.description = description;
      return this;
   }
   
   @Nullable
   public String getDescription(){
      return this.description;
   }

   public ShippingMethodSetDescriptionAction build() {
       return new ShippingMethodSetDescriptionActionImpl(description);
   }
   
   public static ShippingMethodSetDescriptionActionBuilder of() {
      return new ShippingMethodSetDescriptionActionBuilder();
   }
   
   public static ShippingMethodSetDescriptionActionBuilder of(final ShippingMethodSetDescriptionAction template) {
      ShippingMethodSetDescriptionActionBuilder builder = new ShippingMethodSetDescriptionActionBuilder();
      builder.description = template.getDescription();
      return builder;
   }
   
}