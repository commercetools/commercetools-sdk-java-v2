package com.commercetools.models.me;

import com.commercetools.models.me.MyCustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.me.MyCustomerRemoveShippingAddressIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCustomerRemoveShippingAddressIdActionBuilder {
   
   
   private java.lang.String addressId;
   
   public MyCustomerRemoveShippingAddressIdActionBuilder addressId( final java.lang.String addressId) {
      this.addressId = addressId;
      return this;
   }
   
   
   public java.lang.String getAddressId(){
      return this.addressId;
   }

   public MyCustomerRemoveShippingAddressIdAction build() {
       return new MyCustomerRemoveShippingAddressIdActionImpl(addressId);
   }
   
   public static MyCustomerRemoveShippingAddressIdActionBuilder of() {
      return new MyCustomerRemoveShippingAddressIdActionBuilder();
   }
   
   public static MyCustomerRemoveShippingAddressIdActionBuilder of(final MyCustomerRemoveShippingAddressIdAction template) {
      MyCustomerRemoveShippingAddressIdActionBuilder builder = new MyCustomerRemoveShippingAddressIdActionBuilder();
      builder.addressId = template.getAddressId();
      return builder;
   }
   
}