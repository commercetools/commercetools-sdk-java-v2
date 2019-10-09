package com.commercetools.models.me;

import com.commercetools.models.me.MyCustomerUpdateAction;
import com.commercetools.models.me.MyCustomerSetFirstNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCustomerSetFirstNameActionBuilder {
   
   @Nullable
   private String firstName;
   
   public MyCustomerSetFirstNameActionBuilder firstName(@Nullable final String firstName) {
      this.firstName = firstName;
      return this;
   }
   
   @Nullable
   public String getFirstName(){
      return this.firstName;
   }

   public MyCustomerSetFirstNameAction build() {
       return new MyCustomerSetFirstNameActionImpl(firstName);
   }
   
   public static MyCustomerSetFirstNameActionBuilder of() {
      return new MyCustomerSetFirstNameActionBuilder();
   }
   
   public static MyCustomerSetFirstNameActionBuilder of(final MyCustomerSetFirstNameAction template) {
      MyCustomerSetFirstNameActionBuilder builder = new MyCustomerSetFirstNameActionBuilder();
      builder.firstName = template.getFirstName();
      return builder;
   }
   
}