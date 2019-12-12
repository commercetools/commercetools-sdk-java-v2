package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import com.commercetools.api.generated.models.cart.CartUpdate;
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
public final class CartUpdateBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.cart.CartUpdateAction> actions;
   
   
   private Long version;
   
   public CartUpdateBuilder actions( final java.util.List<com.commercetools.api.generated.models.cart.CartUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public CartUpdateBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.cart.CartUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public Long getVersion(){
      return this.version;
   }

   public CartUpdate build() {
       return new CartUpdateImpl(actions, version);
   }
   
   public static CartUpdateBuilder of() {
      return new CartUpdateBuilder();
   }
   
   public static CartUpdateBuilder of(final CartUpdate template) {
      CartUpdateBuilder builder = new CartUpdateBuilder();
      builder.actions = template.getActions();
      builder.version = template.getVersion();
      return builder;
   }
   
}