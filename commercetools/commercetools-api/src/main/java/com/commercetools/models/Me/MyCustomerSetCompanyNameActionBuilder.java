package com.commercetools.models.Me;

import com.commercetools.models.Me.MyCustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.Me.MyCustomerSetCompanyNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCustomerSetCompanyNameActionBuilder {
   
   @Nullable
   private java.lang.String companyName;
   
   public MyCustomerSetCompanyNameActionBuilder companyName(@Nullable final java.lang.String companyName) {
      this.companyName = companyName;
      return this;
   }
   
   @Nullable
   public java.lang.String getCompanyName(){
      return this.companyName;
   }

   public MyCustomerSetCompanyNameAction build() {
       return new MyCustomerSetCompanyNameActionImpl(companyName);
   }
   
   public static MyCustomerSetCompanyNameActionBuilder of() {
      return new MyCustomerSetCompanyNameActionBuilder();
   }
   
   public static MyCustomerSetCompanyNameActionBuilder of(final MyCustomerSetCompanyNameAction template) {
      MyCustomerSetCompanyNameActionBuilder builder = new MyCustomerSetCompanyNameActionBuilder();
      builder.companyName = template.getCompanyName();
      return builder;
   }
   
}