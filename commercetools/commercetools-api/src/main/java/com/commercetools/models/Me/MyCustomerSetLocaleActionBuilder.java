package com.commercetools.models.Me;

import com.commercetools.models.Me.MyCustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.Me.MyCustomerSetLocaleAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCustomerSetLocaleActionBuilder {
   
   @Nullable
   private java.lang.String locale;
   
   public MyCustomerSetLocaleActionBuilder locale(@Nullable final java.lang.String locale) {
      this.locale = locale;
      return this;
   }
   
   @Nullable
   public java.lang.String getLocale(){
      return this.locale;
   }

   public MyCustomerSetLocaleAction build() {
       return new MyCustomerSetLocaleActionImpl(locale);
   }
   
   public static MyCustomerSetLocaleActionBuilder of() {
      return new MyCustomerSetLocaleActionBuilder();
   }
   
   public static MyCustomerSetLocaleActionBuilder of(final MyCustomerSetLocaleAction template) {
      MyCustomerSetLocaleActionBuilder builder = new MyCustomerSetLocaleActionBuilder();
      builder.locale = template.getLocale();
      return builder;
   }
   
}