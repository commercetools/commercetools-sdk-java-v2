package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.ItemShippingTarget;
import com.commercetools.api.generated.models.cart.ItemShippingDetails;
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
public final class ItemShippingDetailsBuilder {
   
   
   private Boolean valid;
   
   
   private java.util.List<com.commercetools.api.generated.models.cart.ItemShippingTarget> targets;
   
   public ItemShippingDetailsBuilder valid( final Boolean valid) {
      this.valid = valid;
      return this;
   }
   
   public ItemShippingDetailsBuilder targets( final java.util.List<com.commercetools.api.generated.models.cart.ItemShippingTarget> targets) {
      this.targets = targets;
      return this;
   }
   
   
   public Boolean getValid(){
      return this.valid;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.cart.ItemShippingTarget> getTargets(){
      return this.targets;
   }

   public ItemShippingDetails build() {
       return new ItemShippingDetailsImpl(valid, targets);
   }
   
   public static ItemShippingDetailsBuilder of() {
      return new ItemShippingDetailsBuilder();
   }
   
   public static ItemShippingDetailsBuilder of(final ItemShippingDetails template) {
      ItemShippingDetailsBuilder builder = new ItemShippingDetailsBuilder();
      builder.valid = template.getValid();
      builder.targets = template.getTargets();
      return builder;
   }
   
}