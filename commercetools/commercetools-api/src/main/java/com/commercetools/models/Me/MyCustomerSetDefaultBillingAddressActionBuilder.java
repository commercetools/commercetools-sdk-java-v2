package com.commercetools.models.Me;

import com.commercetools.models.Me.MyCustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.Me.MyCustomerSetDefaultBillingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCustomerSetDefaultBillingAddressActionBuilder {
   
   @Nullable
   private java.lang.String addressId;
   
   public MyCustomerSetDefaultBillingAddressActionBuilder addressId(@Nullable final java.lang.String addressId) {
      this.addressId = addressId;
      return this;
   }
   
   @Nullable
   public java.lang.String getAddressId(){
      return this.addressId;
   }

   public MyCustomerSetDefaultBillingAddressAction build() {
       return new MyCustomerSetDefaultBillingAddressActionImpl(addressId);
   }
   
   public static MyCustomerSetDefaultBillingAddressActionBuilder of() {
      return new MyCustomerSetDefaultBillingAddressActionBuilder();
   }
   
   public static MyCustomerSetDefaultBillingAddressActionBuilder of(final MyCustomerSetDefaultBillingAddressAction template) {
      MyCustomerSetDefaultBillingAddressActionBuilder builder = new MyCustomerSetDefaultBillingAddressActionBuilder();
      builder.addressId = template.getAddressId();
      return builder;
   }
   
}