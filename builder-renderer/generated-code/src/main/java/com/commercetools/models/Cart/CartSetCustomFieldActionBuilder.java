package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.Cart.CartSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetCustomFieldActionBuilder {
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.Object value;
   
   public CartSetCustomFieldActionBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public CartSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
      this.value = value;
      return this;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   @Nullable
   public java.lang.Object getValue(){
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