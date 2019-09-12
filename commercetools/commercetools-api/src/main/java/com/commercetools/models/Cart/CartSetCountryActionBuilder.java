package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import java.lang.String;
import com.commercetools.models.Cart.CartSetCountryAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetCountryActionBuilder {
   
   @Nullable
   private java.lang.String country;
   
   public CartSetCountryActionBuilder country(@Nullable final java.lang.String country) {
      this.country = country;
      return this;
   }
   
   @Nullable
   public java.lang.String getCountry(){
      return this.country;
   }

   public CartSetCountryAction build() {
       return new CartSetCountryActionImpl(country);
   }
   
   public static CartSetCountryActionBuilder of() {
      return new CartSetCountryActionBuilder();
   }
   
   public static CartSetCountryActionBuilder of(final CartSetCountryAction template) {
      CartSetCountryActionBuilder builder = new CartSetCountryActionBuilder();
      builder.country = template.getCountry();
      return builder;
   }
   
}