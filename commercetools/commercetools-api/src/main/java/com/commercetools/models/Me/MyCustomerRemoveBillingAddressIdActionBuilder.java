package com.commercetools.models.me;

import com.commercetools.models.me.MyCustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.me.MyCustomerRemoveBillingAddressIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCustomerRemoveBillingAddressIdActionBuilder {
   
   
   private java.lang.String addressId;
   
   public MyCustomerRemoveBillingAddressIdActionBuilder addressId( final java.lang.String addressId) {
      this.addressId = addressId;
      return this;
   }
   
   
   public java.lang.String getAddressId(){
      return this.addressId;
   }

   public MyCustomerRemoveBillingAddressIdAction build() {
       return new MyCustomerRemoveBillingAddressIdActionImpl(addressId);
   }
   
   public static MyCustomerRemoveBillingAddressIdActionBuilder of() {
      return new MyCustomerRemoveBillingAddressIdActionBuilder();
   }
   
   public static MyCustomerRemoveBillingAddressIdActionBuilder of(final MyCustomerRemoveBillingAddressIdAction template) {
      MyCustomerRemoveBillingAddressIdActionBuilder builder = new MyCustomerRemoveBillingAddressIdActionBuilder();
      builder.addressId = template.getAddressId();
      return builder;
   }
   
}