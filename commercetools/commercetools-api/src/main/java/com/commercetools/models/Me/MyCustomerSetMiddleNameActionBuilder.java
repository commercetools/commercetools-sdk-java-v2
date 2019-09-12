package com.commercetools.models.Me;

import com.commercetools.models.Me.MyCustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.Me.MyCustomerSetMiddleNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCustomerSetMiddleNameActionBuilder {
   
   @Nullable
   private java.lang.String middleName;
   
   public MyCustomerSetMiddleNameActionBuilder middleName(@Nullable final java.lang.String middleName) {
      this.middleName = middleName;
      return this;
   }
   
   @Nullable
   public java.lang.String getMiddleName(){
      return this.middleName;
   }

   public MyCustomerSetMiddleNameAction build() {
       return new MyCustomerSetMiddleNameActionImpl(middleName);
   }
   
   public static MyCustomerSetMiddleNameActionBuilder of() {
      return new MyCustomerSetMiddleNameActionBuilder();
   }
   
   public static MyCustomerSetMiddleNameActionBuilder of(final MyCustomerSetMiddleNameAction template) {
      MyCustomerSetMiddleNameActionBuilder builder = new MyCustomerSetMiddleNameActionBuilder();
      builder.middleName = template.getMiddleName();
      return builder;
   }
   
}