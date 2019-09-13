package com.commercetools.models.customer;

import com.commercetools.models.customer.CustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.customer.CustomerSetLocaleAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerSetLocaleActionBuilder {
   
   @Nullable
   private java.lang.String locale;
   
   public CustomerSetLocaleActionBuilder locale(@Nullable final java.lang.String locale) {
      this.locale = locale;
      return this;
   }
   
   @Nullable
   public java.lang.String getLocale(){
      return this.locale;
   }

   public CustomerSetLocaleAction build() {
       return new CustomerSetLocaleActionImpl(locale);
   }
   
   public static CustomerSetLocaleActionBuilder of() {
      return new CustomerSetLocaleActionBuilder();
   }
   
   public static CustomerSetLocaleActionBuilder of(final CustomerSetLocaleAction template) {
      CustomerSetLocaleActionBuilder builder = new CustomerSetLocaleActionBuilder();
      builder.locale = template.getLocale();
      return builder;
   }
   
}