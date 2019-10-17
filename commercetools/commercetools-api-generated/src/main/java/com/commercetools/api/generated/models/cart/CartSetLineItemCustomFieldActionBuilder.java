package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import com.commercetools.api.generated.models.cart.CartSetLineItemCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetLineItemCustomFieldActionBuilder {
   
   
   private String lineItemId;
   
   
   private String name;
   
   @Nullable
   private Object value;
   
   public CartSetLineItemCustomFieldActionBuilder lineItemId( final String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public CartSetLineItemCustomFieldActionBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public CartSetLineItemCustomFieldActionBuilder value(@Nullable final Object value) {
      this.value = value;
      return this;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   @Nullable
   public Object getValue(){
      return this.value;
   }

   public CartSetLineItemCustomFieldAction build() {
       return new CartSetLineItemCustomFieldActionImpl(lineItemId, name, value);
   }
   
   public static CartSetLineItemCustomFieldActionBuilder of() {
      return new CartSetLineItemCustomFieldActionBuilder();
   }
   
   public static CartSetLineItemCustomFieldActionBuilder of(final CartSetLineItemCustomFieldAction template) {
      CartSetLineItemCustomFieldActionBuilder builder = new CartSetLineItemCustomFieldActionBuilder();
      builder.lineItemId = template.getLineItemId();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}