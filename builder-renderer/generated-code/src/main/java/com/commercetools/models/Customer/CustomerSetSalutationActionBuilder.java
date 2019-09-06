package com.commercetools.models.Customer;

import com.commercetools.models.Customer.CustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.Customer.CustomerSetSalutationAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerSetSalutationActionBuilder {
   
   @Nullable
   private java.lang.String salutation;
   
   public CustomerSetSalutationActionBuilder salutation(@Nullable final java.lang.String salutation) {
      this.salutation = salutation;
      return this;
   }
   
   @Nullable
   public java.lang.String getSalutation(){
      return this.salutation;
   }

   public CustomerSetSalutationAction build() {
       return new CustomerSetSalutationActionImpl(salutation);
   }
   
   public static CustomerSetSalutationActionBuilder of() {
      return new CustomerSetSalutationActionBuilder();
   }
   
   public static CustomerSetSalutationActionBuilder of(final CustomerSetSalutationAction template) {
      CustomerSetSalutationActionBuilder builder = new CustomerSetSalutationActionBuilder();
      builder.salutation = template.getSalutation();
      return builder;
   }
   
}