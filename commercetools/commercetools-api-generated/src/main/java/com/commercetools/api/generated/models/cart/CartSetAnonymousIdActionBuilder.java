package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import com.commercetools.api.generated.models.cart.CartSetAnonymousIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartSetAnonymousIdActionBuilder {
   
   @Nullable
   private String anonymousId;
   
   public CartSetAnonymousIdActionBuilder anonymousId(@Nullable final String anonymousId) {
      this.anonymousId = anonymousId;
      return this;
   }
   
   @Nullable
   public String getAnonymousId(){
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