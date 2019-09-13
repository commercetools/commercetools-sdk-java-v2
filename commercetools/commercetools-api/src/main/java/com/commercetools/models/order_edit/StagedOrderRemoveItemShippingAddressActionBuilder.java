package com.commercetools.models.order_edit;

import com.commercetools.models.order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.order_edit.StagedOrderRemoveItemShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderRemoveItemShippingAddressActionBuilder {
   
   
   private java.lang.String addressKey;
   
   public StagedOrderRemoveItemShippingAddressActionBuilder addressKey( final java.lang.String addressKey) {
      this.addressKey = addressKey;
      return this;
   }
   
   
   public java.lang.String getAddressKey(){
      return this.addressKey;
   }

   public StagedOrderRemoveItemShippingAddressAction build() {
       return new StagedOrderRemoveItemShippingAddressActionImpl(addressKey);
   }
   
   public static StagedOrderRemoveItemShippingAddressActionBuilder of() {
      return new StagedOrderRemoveItemShippingAddressActionBuilder();
   }
   
   public static StagedOrderRemoveItemShippingAddressActionBuilder of(final StagedOrderRemoveItemShippingAddressAction template) {
      StagedOrderRemoveItemShippingAddressActionBuilder builder = new StagedOrderRemoveItemShippingAddressActionBuilder();
      builder.addressKey = template.getAddressKey();
      return builder;
   }
   
}