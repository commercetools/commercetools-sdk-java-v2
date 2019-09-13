package com.commercetools.models.cart;

import com.commercetools.models.cart.ItemShippingTarget;
import com.commercetools.models.cart.ItemShippingDetailsDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ItemShippingDetailsDraftBuilder {
   
   
   private java.util.List<com.commercetools.models.cart.ItemShippingTarget> targets;
   
   public ItemShippingDetailsDraftBuilder targets( final java.util.List<com.commercetools.models.cart.ItemShippingTarget> targets) {
      this.targets = targets;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.cart.ItemShippingTarget> getTargets(){
      return this.targets;
   }

   public ItemShippingDetailsDraft build() {
       return new ItemShippingDetailsDraftImpl(targets);
   }
   
   public static ItemShippingDetailsDraftBuilder of() {
      return new ItemShippingDetailsDraftBuilder();
   }
   
   public static ItemShippingDetailsDraftBuilder of(final ItemShippingDetailsDraft template) {
      ItemShippingDetailsDraftBuilder builder = new ItemShippingDetailsDraftBuilder();
      builder.targets = template.getTargets();
      return builder;
   }
   
}