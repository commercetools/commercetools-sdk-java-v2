package com.commercetools.models.shopping_list;

import com.commercetools.models.shopping_list.ShoppingListUpdateAction;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.shopping_list.ShoppingListRemoveLineItemAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShoppingListRemoveLineItemActionBuilder {
   
   @Nullable
   private java.lang.Long quantity;
   
   
   private java.lang.String lineItemId;
   
   public ShoppingListRemoveLineItemActionBuilder quantity(@Nullable final java.lang.Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public ShoppingListRemoveLineItemActionBuilder lineItemId( final java.lang.String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   @Nullable
   public java.lang.Long getQuantity(){
      return this.quantity;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }

   public ShoppingListRemoveLineItemAction build() {
       return new ShoppingListRemoveLineItemActionImpl(quantity, lineItemId);
   }
   
   public static ShoppingListRemoveLineItemActionBuilder of() {
      return new ShoppingListRemoveLineItemActionBuilder();
   }
   
   public static ShoppingListRemoveLineItemActionBuilder of(final ShoppingListRemoveLineItemAction template) {
      ShoppingListRemoveLineItemActionBuilder builder = new ShoppingListRemoveLineItemActionBuilder();
      builder.quantity = template.getQuantity();
      builder.lineItemId = template.getLineItemId();
      return builder;
   }
   
}