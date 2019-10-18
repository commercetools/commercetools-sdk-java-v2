package com.commercetools.api.generated.models.customer;

import com.commercetools.api.generated.models.customer.CustomerUpdateAction;
import com.commercetools.api.generated.models.customer.CustomerRemoveAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
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