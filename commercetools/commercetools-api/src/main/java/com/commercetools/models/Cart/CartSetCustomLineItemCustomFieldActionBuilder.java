package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.cart.CartSetCustomLineItemCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetCustomLineItemCustomFieldActionBuilder {
   
   
   private java.lang.String customLineItemId;
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.Object value;
   
   public CartSetCustomLineItemCustomFieldActionBuilder customLineItemId( final java.lang.String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public CartSetCustomLineItemCustomFieldActionBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public CartSetCustomLineItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
      this.value = value;
      return this;
   }
   
   
   public java.lang.String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   @Nullable
   public java.lang.Object getValue(){
      return this.value;
   }

   public CartSetCustomLineItemCustomFieldAction build() {
       return new CartSetCustomLineItemCustomFieldActionImpl(customLineItemId, name, value);
   }
   
   public static CartSetCustomLineItemCustomFieldActionBuilder of() {
      return new CartSetCustomLineItemCustomFieldActionBuilder();
   }
   
   public static CartSetCustomLineItemCustomFieldActionBuilder of(final CartSetCustomLineItemCustomFieldAction template) {
      CartSetCustomLineItemCustomFieldActionBuilder builder = new CartSetCustomLineItemCustomFieldActionBuilder();
      builder.customLineItemId = template.getCustomLineItemId();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}