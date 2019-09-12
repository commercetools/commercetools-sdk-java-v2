package com.commercetools.models.Me;

import com.commercetools.models.Me.MyCustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.Me.MyCustomerAddBillingAddressIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCustomerAddBillingAddressIdActionBuilder {
   
   
   private java.lang.String addressId;
   
   public MyCustomerAddBillingAddressIdActionBuilder addressId( final java.lang.String addressId) {
      this.addressId = addressId;
      return this;
   }
   
   
   public java.lang.String getAddressId(){
      return this.addressId;
   }

   public MyCustomerAddBillingAddressIdAction build() {
       return new MyCustomerAddBillingAddressIdActionImpl(addressId);
   }
   
   public static MyCustomerAddBillingAddressIdActionBuilder of() {
      return new MyCustomerAddBillingAddressIdActionBuilder();
   }
   
   public static MyCustomerAddBillingAddressIdActionBuilder of(final MyCustomerAddBillingAddressIdAction template) {
      MyCustomerAddBillingAddressIdActionBuilder builder = new MyCustomerAddBillingAddressIdActionBuilder();
      builder.addressId = template.getAddressId();
      return builder;
   }
   
}