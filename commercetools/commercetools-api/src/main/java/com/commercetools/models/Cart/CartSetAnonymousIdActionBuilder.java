package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import java.lang.String;
import com.commercetools.models.Cart.CartSetAnonymousIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetAnonymousIdActionBuilder {
   
   @Nullable
   private java.lang.String anonymousId;
   
   public CartSetAnonymousIdActionBuilder anonymousId(@Nullable final java.lang.String anonymousId) {
      this.anonymousId = anonymousId;
      return this;
   }
   
   @Nullable
   public java.lang.String getAnonymousId(){
      return this.anonymousId;
   }

   public CartSetAnonymousIdAction build() {
       return new CartSetAnonymousIdActionImpl(anonymousId);
   }
   
   public static CartSetAnonymousIdActionBuilder of() {
      return new CartSetAnonymousIdActionBuilder();
   }
   
   public static CartSetAnonymousIdActionBuilder of(final CartSetAnonymousIdAction template) {
      CartSetAnonymousIdActionBuilder builder = new CartSetAnonymousIdActionBuilder();
      builder.anonymousId = template.getAnonymousId();
      return builder;
   }
   
}