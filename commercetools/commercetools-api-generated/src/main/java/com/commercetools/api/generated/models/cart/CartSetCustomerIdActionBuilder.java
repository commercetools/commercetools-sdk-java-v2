package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import com.commercetools.api.generated.models.cart.CartSetCustomerIdAction;
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
public final class CartSetCustomerIdActionBuilder {
   
   @Nullable
   private String customerId;
   
   public CartSetCustomerIdActionBuilder customerId(@Nullable final String customerId) {
      this.customerId = customerId;
      return this;
   }
   
   @Nullable
   public String getCustomerId(){
      return this.customerId;
   }

   public CartSetCustomerIdAction build() {
       return new CartSetCustomerIdActionImpl(customerId);
   }
   
   public static CartSetCustomerIdActionBuilder of() {
      return new CartSetCustomerIdActionBuilder();
   }
   
   public static CartSetCustomerIdActionBuilder of(final CartSetCustomerIdAction template) {
      CartSetCustomerIdActionBuilder builder = new CartSetCustomerIdActionBuilder();
      builder.customerId = template.getCustomerId();
      return builder;
   }
   
}