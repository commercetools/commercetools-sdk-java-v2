package com.commercetools.models.Me;

import com.commercetools.models.Me.MyCustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.Me.MyCustomerAddShippingAddressIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCustomerAddShippingAddressIdActionBuilder {
   
   
   private java.lang.String addressId;
   
   public MyCustomerAddShippingAddressIdActionBuilder addressId( final java.lang.String addressId) {
      this.addressId = addressId;
      return this;
   }
   
   
   public java.lang.String getAddressId(){
      return this.addressId;
   }

   public MyCustomerAddShippingAddressIdAction build() {
       return new MyCustomerAddShippingAddressIdActionImpl(addressId);
   }
   
   public static MyCustomerAddShippingAddressIdActionBuilder of() {
      return new MyCustomerAddShippingAddressIdActionBuilder();
   }
   
   public static MyCustomerAddShippingAddressIdActionBuilder of(final MyCustomerAddShippingAddressIdAction template) {
      MyCustomerAddShippingAddressIdActionBuilder builder = new MyCustomerAddShippingAddressIdActionBuilder();
      builder.addressId = template.getAddressId();
      return builder;
   }
   
}