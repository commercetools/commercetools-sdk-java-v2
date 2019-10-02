package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.cart.CartSetCountryAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetCountryActionBuilder {
   
   @Nullable
   private String country;
   
   public CartSetCountryActionBuilder country(@Nullable final String country) {
      this.country = country;
      return this;
   }
   
   @Nullable
   public String getCountry(){
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