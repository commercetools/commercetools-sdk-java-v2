package com.commercetools.models.Me;

import com.commercetools.models.Me.MyCustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.Me.MyCustomerSetFirstNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCustomerSetFirstNameActionBuilder {
   
   @Nullable
   private java.lang.String firstName;
   
   public MyCustomerSetFirstNameActionBuilder firstName(@Nullable final java.lang.String firstName) {
      this.firstName = firstName;
      return this;
   }
   
   @Nullable
   public java.lang.String getFirstName(){
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