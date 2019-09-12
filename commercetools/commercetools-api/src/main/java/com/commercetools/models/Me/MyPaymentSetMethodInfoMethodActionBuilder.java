package com.commercetools.models.Me;

import com.commercetools.models.Me.MyPaymentUpdateAction;
import java.lang.String;
import com.commercetools.models.Me.MyPaymentSetMethodInfoMethodAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyPaymentSetMethodInfoMethodActionBuilder {
   
   @Nullable
   private java.lang.String method;
   
   public MyPaymentSetMethodInfoMethodActionBuilder method(@Nullable final java.lang.String method) {
      this.method = method;
      return this;
   }
   
   @Nullable
   public java.lang.String getMethod(){
      return this.method;
   }

   public MyPaymentSetMethodInfoMethodAction build() {
       return new MyPaymentSetMethodInfoMethodActionImpl(method);
   }
   
   public static MyPaymentSetMethodInfoMethodActionBuilder of() {
      return new MyPaymentSetMethodInfoMethodActionBuilder();
   }
   
   public static MyPaymentSetMethodInfoMethodActionBuilder of(final MyPaymentSetMethodInfoMethodAction template) {
      MyPaymentSetMethodInfoMethodActionBuilder builder = new MyPaymentSetMethodInfoMethodActionBuilder();
      builder.method = template.getMethod();
      return builder;
   }
   
}