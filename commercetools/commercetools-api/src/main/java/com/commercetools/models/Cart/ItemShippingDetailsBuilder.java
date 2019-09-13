package com.commercetools.models.cart;

import com.commercetools.models.cart.ItemShippingTarget;
import java.lang.Boolean;
import com.commercetools.models.cart.ItemShippingDetails;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ItemShippingDetailsBuilder {
   
   
   private java.lang.Boolean valid;
   
   
   private java.util.List<com.commercetools.models.cart.ItemShippingTarget> targets;
   
   public ItemShippingDetailsBuilder valid( final java.lang.Boolean valid) {
      this.valid = valid;
      return this;
   }
   
   public ItemShippingDetailsBuilder targets( final java.util.List<com.commercetools.models.cart.ItemShippingTarget> targets) {
      this.targets = targets;
      return this;
   }
   
   
   public java.lang.Boolean getValid(){
      return this.valid;
   }
   
   
   public java.util.List<com.commercetools.models.cart.ItemShippingTarget> getTargets(){
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