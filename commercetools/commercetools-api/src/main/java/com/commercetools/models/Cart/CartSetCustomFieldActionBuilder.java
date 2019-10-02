package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.cart.CartSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetCustomFieldActionBuilder {
   
   
   private String name;
   
   @Nullable
   private Object value;
   
   public CartSetCustomFieldActionBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public CartSetCustomFieldActionBuilder value(@Nullable final Object value) {
      this.value = value;
      return this;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   @Nullable
   public Object getValue(){
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