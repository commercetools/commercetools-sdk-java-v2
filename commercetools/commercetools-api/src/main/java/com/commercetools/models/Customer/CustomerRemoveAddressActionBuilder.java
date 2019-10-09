package com.commercetools.models.customer;

import com.commercetools.models.customer.CustomerUpdateAction;
import com.commercetools.models.customer.CustomerRemoveAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerRemoveAddressActionBuilder {
   
   
   private String addressId;
   
   public CustomerRemoveAddressActionBuilder addressId( final String addressId) {
      this.addressId = addressId;
      return this;
   }
   
   
   public String getAddressId(){
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