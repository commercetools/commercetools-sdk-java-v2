package com.commercetools.models.order_edit;

import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.order_edit.StagedOrderRemoveItemShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderRemoveItemShippingAddressActionBuilder {
   
   
   private String addressKey;
   
   public StagedOrderRemoveItemShippingAddressActionBuilder addressKey( final String addressKey) {
      this.addressKey = addressKey;
      return this;
   }
   
   
   public String getAddressKey(){
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