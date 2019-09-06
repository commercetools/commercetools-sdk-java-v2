package com.commercetools.models.Customer;

import com.commercetools.models.Customer.CustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.Customer.CustomerSetTitleAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerSetTitleActionBuilder {
   
   @Nullable
   private java.lang.String title;
   
   public CustomerSetTitleActionBuilder title(@Nullable final java.lang.String title) {
      this.title = title;
      return this;
   }
   
   @Nullable
   public java.lang.String getTitle(){
      return this.title;
   }

   public CustomerSetTitleAction build() {
       return new CustomerSetTitleActionImpl(title);
   }
   
   public static CustomerSetTitleActionBuilder of() {
      return new CustomerSetTitleActionBuilder();
   }
   
   public static CustomerSetTitleActionBuilder of(final CustomerSetTitleAction template) {
      CustomerSetTitleActionBuilder builder = new CustomerSetTitleActionBuilder();
      builder.title = template.getTitle();
      return builder;
   }
   
}