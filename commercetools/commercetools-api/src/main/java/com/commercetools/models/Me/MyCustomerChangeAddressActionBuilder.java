package com.commercetools.models.Me;

import com.commercetools.models.Common.Address;
import com.commercetools.models.Me.MyCustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.Me.MyCustomerChangeAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCustomerChangeAddressActionBuilder {
   
   
   private com.commercetools.models.Common.Address address;
   
   
   private java.lang.String addressId;
   
   public MyCustomerChangeAddressActionBuilder address( final com.commercetools.models.Common.Address address) {
      this.address = address;
      return this;
   }
   
   public MyCustomerChangeAddressActionBuilder addressId( final java.lang.String addressId) {
      this.addressId = addressId;
      return this;
   }
   
   
   public com.commercetools.models.Common.Address getAddress(){
      return this.address;
   }
   
   
   public java.lang.String getAddressId(){
      return this.addressId;
   }

   public MyCustomerChangeAddressAction build() {
       return new MyCustomerChangeAddressActionImpl(address, addressId);
   }
   
   public static MyCustomerChangeAddressActionBuilder of() {
      return new MyCustomerChangeAddressActionBuilder();
   }
   
   public static MyCustomerChangeAddressActionBuilder of(final MyCustomerChangeAddressAction template) {
      MyCustomerChangeAddressActionBuilder builder = new MyCustomerChangeAddressActionBuilder();
      builder.address = template.getAddress();
      builder.addressId = template.getAddressId();
      return builder;
   }
   
}