package com.commercetools.models.me;

import com.commercetools.models.me.MyCustomerUpdateAction;
import com.commercetools.models.me.MyCustomerSetLastNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCustomerSetLastNameActionBuilder {
   
   @Nullable
   private String lastName;
   
   public MyCustomerSetLastNameActionBuilder lastName(@Nullable final String lastName) {
      this.lastName = lastName;
      return this;
   }
   
   @Nullable
   public String getLastName(){
      return this.lastName;
   }

   public MyCustomerSetLastNameAction build() {
       return new MyCustomerSetLastNameActionImpl(lastName);
   }
   
   public static MyCustomerSetLastNameActionBuilder of() {
      return new MyCustomerSetLastNameActionBuilder();
   }
   
   public static MyCustomerSetLastNameActionBuilder of(final MyCustomerSetLastNameAction template) {
      MyCustomerSetLastNameActionBuilder builder = new MyCustomerSetLastNameActionBuilder();
      builder.lastName = template.getLastName();
      return builder;
   }
   
}