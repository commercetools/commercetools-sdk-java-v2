package com.commercetools.api.generated.models.customer;

import com.commercetools.api.generated.models.customer.CustomerUpdateAction;
import com.commercetools.api.generated.models.customer.CustomerSetMiddleNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerSetMiddleNameActionBuilder {
   
   @Nullable
   private String middleName;
   
   public CustomerSetMiddleNameActionBuilder middleName(@Nullable final String middleName) {
      this.middleName = middleName;
      return this;
   }
   
   @Nullable
   public String getMiddleName(){
      return this.middleName;
   }

   public CustomerSetMiddleNameAction build() {
       return new CustomerSetMiddleNameActionImpl(middleName);
   }
   
   public static CustomerSetMiddleNameActionBuilder of() {
      return new CustomerSetMiddleNameActionBuilder();
   }
   
   public static CustomerSetMiddleNameActionBuilder of(final CustomerSetMiddleNameAction template) {
      CustomerSetMiddleNameActionBuilder builder = new CustomerSetMiddleNameActionBuilder();
      builder.middleName = template.getMiddleName();
      return builder;
   }
   
}