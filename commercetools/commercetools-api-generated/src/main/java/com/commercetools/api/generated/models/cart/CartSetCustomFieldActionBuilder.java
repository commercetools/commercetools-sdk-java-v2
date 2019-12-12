package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import com.commercetools.api.generated.models.cart.CartSetCustomFieldAction;
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
public final class CartSetCustomFieldActionBuilder {
   
   
   private String name;
   
   @Nullable
   private JsonNode value;
   
   public CartSetCustomFieldActionBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public CartSetCustomFieldActionBuilder value(@Nullable final JsonNode value) {
      this.value = value;
      return this;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   @Nullable
   public JsonNode getValue(){
      return this.value;
   }

   public CartSetCustomFieldAction build() {
       return new CartSetCustomFieldActionImpl(name, value);
   }
   
   public static CartSetCustomFieldActionBuilder of() {
      return new CartSetCustomFieldActionBuilder();
   }
   
   public static CartSetCustomFieldActionBuilder of(final CartSetCustomFieldAction template) {
      CartSetCustomFieldActionBuilder builder = new CartSetCustomFieldActionBuilder();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}