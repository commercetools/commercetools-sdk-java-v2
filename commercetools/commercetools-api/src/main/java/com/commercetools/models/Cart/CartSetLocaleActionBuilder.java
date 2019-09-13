package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import java.lang.String;
import com.commercetools.models.cart.CartSetLocaleAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetLocaleActionBuilder {
   
   @Nullable
   private java.lang.String locale;
   
   public CartSetLocaleActionBuilder locale(@Nullable final java.lang.String locale) {
      this.locale = locale;
      return this;
   }
   
   @Nullable
   public java.lang.String getLocale(){
      return this.locale;
   }

   public CartSetLocaleAction build() {
       return new CartSetLocaleActionImpl(locale);
   }
   
   public static CartSetLocaleActionBuilder of() {
      return new CartSetLocaleActionBuilder();
   }
   
   public static CartSetLocaleActionBuilder of(final CartSetLocaleAction template) {
      CartSetLocaleActionBuilder builder = new CartSetLocaleActionBuilder();
      builder.locale = template.getLocale();
      return builder;
   }
   
}