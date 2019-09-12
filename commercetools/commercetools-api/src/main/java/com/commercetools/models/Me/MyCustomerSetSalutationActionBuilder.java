package com.commercetools.models.Me;

import com.commercetools.models.Me.MyCustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.Me.MyCustomerSetSalutationAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCustomerSetSalutationActionBuilder {
   
   @Nullable
   private java.lang.String salutation;
   
   public MyCustomerSetSalutationActionBuilder salutation(@Nullable final java.lang.String salutation) {
      this.salutation = salutation;
      return this;
   }
   
   @Nullable
   public java.lang.String getSalutation(){
      return this.salutation;
   }

   public MyCustomerSetSalutationAction build() {
       return new MyCustomerSetSalutationActionImpl(salutation);
   }
   
   public static MyCustomerSetSalutationActionBuilder of() {
      return new MyCustomerSetSalutationActionBuilder();
   }
   
   public static MyCustomerSetSalutationActionBuilder of(final MyCustomerSetSalutationAction template) {
      MyCustomerSetSalutationActionBuilder builder = new MyCustomerSetSalutationActionBuilder();
      builder.salutation = template.getSalutation();
      return builder;
   }
   
}