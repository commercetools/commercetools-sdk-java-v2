package com.commercetools.models.me;

import com.commercetools.models.me.MyCartUpdateAction;
import java.lang.String;
import com.commercetools.models.me.MyCartRemoveItemShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCartRemoveItemShippingAddressActionBuilder {
   
   
   private java.lang.String addressKey;
   
   public MyCartRemoveItemShippingAddressActionBuilder addressKey( final java.lang.String addressKey) {
      this.addressKey = addressKey;
      return this;
   }
   
   
   public java.lang.String getAddressKey(){
      return this.addressKey;
   }

   public MyCartRemoveItemShippingAddressAction build() {
       return new MyCartRemoveItemShippingAddressActionImpl(addressKey);
   }
   
   public static MyCartRemoveItemShippingAddressActionBuilder of() {
      return new MyCartRemoveItemShippingAddressActionBuilder();
   }
   
   public static MyCartRemoveItemShippingAddressActionBuilder of(final MyCartRemoveItemShippingAddressAction template) {
      MyCartRemoveItemShippingAddressActionBuilder builder = new MyCartRemoveItemShippingAddressActionBuilder();
      builder.addressKey = template.getAddressKey();
      return builder;
   }
   
}