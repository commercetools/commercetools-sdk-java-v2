package com.commercetools.models.Me;

import com.commercetools.models.Me.MyCustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.Me.MyCustomerSetDefaultShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCustomerSetDefaultShippingAddressActionBuilder {
   
   @Nullable
   private java.lang.String addressId;
   
   public MyCustomerSetDefaultShippingAddressActionBuilder addressId(@Nullable final java.lang.String addressId) {
      this.addressId = addressId;
      return this;
   }
   
   @Nullable
   public java.lang.String getAddressId(){
      return this.addressId;
   }

   public MyCustomerSetDefaultShippingAddressAction build() {
       return new MyCustomerSetDefaultShippingAddressActionImpl(addressId);
   }
   
   public static MyCustomerSetDefaultShippingAddressActionBuilder of() {
      return new MyCustomerSetDefaultShippingAddressActionBuilder();
   }
   
   public static MyCustomerSetDefaultShippingAddressActionBuilder of(final MyCustomerSetDefaultShippingAddressAction template) {
      MyCustomerSetDefaultShippingAddressActionBuilder builder = new MyCustomerSetDefaultShippingAddressActionBuilder();
      builder.addressId = template.getAddressId();
      return builder;
   }
   
}