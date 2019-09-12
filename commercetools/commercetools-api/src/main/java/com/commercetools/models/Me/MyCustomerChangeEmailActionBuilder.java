package com.commercetools.models.Me;

import com.commercetools.models.Me.MyCustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.Me.MyCustomerChangeEmailAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCustomerChangeEmailActionBuilder {
   
   
   private java.lang.String email;
   
   public MyCustomerChangeEmailActionBuilder email( final java.lang.String email) {
      this.email = email;
      return this;
   }
   
   
   public java.lang.String getEmail(){
      return this.email;
   }

   public MyCustomerChangeEmailAction build() {
       return new MyCustomerChangeEmailActionImpl(email);
   }
   
   public static MyCustomerChangeEmailActionBuilder of() {
      return new MyCustomerChangeEmailActionBuilder();
   }
   
   public static MyCustomerChangeEmailActionBuilder of(final MyCustomerChangeEmailAction template) {
      MyCustomerChangeEmailActionBuilder builder = new MyCustomerChangeEmailActionBuilder();
      builder.email = template.getEmail();
      return builder;
   }
   
}