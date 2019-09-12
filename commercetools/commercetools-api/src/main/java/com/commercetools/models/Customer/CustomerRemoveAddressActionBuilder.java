package com.commercetools.models.Customer;

import com.commercetools.models.Customer.CustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.Customer.CustomerRemoveAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerRemoveAddressActionBuilder {
   
   
   private java.lang.String addressId;
   
   public CustomerRemoveAddressActionBuilder addressId( final java.lang.String addressId) {
      this.addressId = addressId;
      return this;
   }
   
   
   public java.lang.String getAddressId(){
      return this.addressId;
   }

   public CustomerRemoveAddressAction build() {
       return new CustomerRemoveAddressActionImpl(addressId);
   }
   
   public static CustomerRemoveAddressActionBuilder of() {
      return new CustomerRemoveAddressActionBuilder();
   }
   
   public static CustomerRemoveAddressActionBuilder of(final CustomerRemoveAddressAction template) {
      CustomerRemoveAddressActionBuilder builder = new CustomerRemoveAddressActionBuilder();
      builder.addressId = template.getAddressId();
      return builder;
   }
   
}