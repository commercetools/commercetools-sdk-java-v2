package com.commercetools.models.Me;

import com.commercetools.models.Me.MyCartUpdateAction;
import java.lang.String;
import com.commercetools.models.Me.MyCartSetCountryAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCartSetCountryActionBuilder {
   
   @Nullable
   private java.lang.String country;
   
   public MyCartSetCountryActionBuilder country(@Nullable final java.lang.String country) {
      this.country = country;
      return this;
   }
   
   @Nullable
   public java.lang.String getCountry(){
      return this.country;
   }

   public MyCartSetCountryAction build() {
       return new MyCartSetCountryActionImpl(country);
   }
   
   public static MyCartSetCountryActionBuilder of() {
      return new MyCartSetCountryActionBuilder();
   }
   
   public static MyCartSetCountryActionBuilder of(final MyCartSetCountryAction template) {
      MyCartSetCountryActionBuilder builder = new MyCartSetCountryActionBuilder();
      builder.country = template.getCountry();
      return builder;
   }
   
}