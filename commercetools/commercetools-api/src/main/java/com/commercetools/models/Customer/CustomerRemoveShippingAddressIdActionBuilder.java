package com.commercetools.models.customer;

import com.commercetools.models.customer.CustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.customer.CustomerRemoveShippingAddressIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerRemoveShippingAddressIdActionBuilder {
   
   
   private java.lang.String addressId;
   
   public CustomerRemoveShippingAddressIdActionBuilder addressId( final java.lang.String addressId) {
      this.addressId = addressId;
      return this;
   }
   
   
   public java.lang.String getAddressId(){
      return this.addressId;
   }

   public CustomerRemoveShippingAddressIdAction build() {
       return new CustomerRemoveShippingAddressIdActionImpl(addressId);
   }
   
   public static CustomerRemoveShippingAddressIdActionBuilder of() {
      return new CustomerRemoveShippingAddressIdActionBuilder();
   }
   
   public static CustomerRemoveShippingAddressIdActionBuilder of(final CustomerRemoveShippingAddressIdAction template) {
      CustomerRemoveShippingAddressIdActionBuilder builder = new CustomerRemoveShippingAddressIdActionBuilder();
      builder.addressId = template.getAddressId();
      return builder;
   }
   
}