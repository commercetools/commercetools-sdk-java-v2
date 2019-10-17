package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.me.MyCartUpdateAction;
import com.commercetools.api.generated.models.me.MyCartSetBillingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCartSetBillingAddressActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.common.Address address;
   
   public MyCartSetBillingAddressActionBuilder address(@Nullable final com.commercetools.api.generated.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.Address getAddress(){
      return this.address;
   }

   public MyCartSetBillingAddressAction build() {
       return new MyCartSetBillingAddressActionImpl(address);
   }
   
   public static MyCartSetBillingAddressActionBuilder of() {
      return new MyCartSetBillingAddressActionBuilder();
   }
   
   public static MyCartSetBillingAddressActionBuilder of(final MyCartSetBillingAddressAction template) {
      MyCartSetBillingAddressActionBuilder builder = new MyCartSetBillingAddressActionBuilder();
      builder.address = template.getAddress();
      return builder;
   }
   
}