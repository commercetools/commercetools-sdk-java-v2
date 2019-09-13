package com.commercetools.models.me;

import com.commercetools.models.me.MyCustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.me.MyCustomerRemoveAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCustomerRemoveAddressActionBuilder {
   
   
   private java.lang.String addressId;
   
   public MyCustomerRemoveAddressActionBuilder addressId( final java.lang.String addressId) {
      this.addressId = addressId;
      return this;
   }
   
   
   public java.lang.String getAddressId(){
      return this.addressId;
   }

   public MyCustomerRemoveAddressAction build() {
       return new MyCustomerRemoveAddressActionImpl(addressId);
   }
   
   public static MyCustomerRemoveAddressActionBuilder of() {
      return new MyCustomerRemoveAddressActionBuilder();
   }
   
   public static MyCustomerRemoveAddressActionBuilder of(final MyCustomerRemoveAddressAction template) {
      MyCustomerRemoveAddressActionBuilder builder = new MyCustomerRemoveAddressActionBuilder();
      builder.addressId = template.getAddressId();
      return builder;
   }
   
}