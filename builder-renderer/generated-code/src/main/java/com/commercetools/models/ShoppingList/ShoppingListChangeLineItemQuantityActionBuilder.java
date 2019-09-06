package com.commercetools.models.ShoppingList;

import com.commercetools.models.ShoppingList.ShoppingListUpdateAction;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.ShoppingList.ShoppingListChangeLineItemQuantityAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShoppingListChangeLineItemQuantityActionBuilder {
   
   
   private java.lang.Long quantity;
   
   
   private java.lang.String lineItemId;
   
   public ShoppingListChangeLineItemQuantityActionBuilder quantity( final java.lang.Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public ShoppingListChangeLineItemQuantityActionBuilder lineItemId( final java.lang.String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   
   public java.lang.Long getQuantity(){
      return this.quantity;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }

   public ShoppingListChangeLineItemQuantityAction build() {
       return new ShoppingListChangeLineItemQuantityActionImpl(quantity, lineItemId);
   }
   
   public static ShoppingListChangeLineItemQuantityActionBuilder of() {
      return new ShoppingListChangeLineItemQuantityActionBuilder();
   }
   
   public static ShoppingListChangeLineItemQuantityActionBuilder of(final ShoppingListChangeLineItemQuantityAction template) {
      ShoppingListChangeLineItemQuantityActionBuilder builder = new ShoppingListChangeLineItemQuantityActionBuilder();
      builder.quantity = template.getQuantity();
      builder.lineItemId = template.getLineItemId();
      return builder;
   }
   
}