package com.commercetools.models.shopping_list;

import com.commercetools.models.shopping_list.ShoppingListUpdateAction;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.shopping_list.ShoppingListChangeTextLineItemQuantityAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShoppingListChangeTextLineItemQuantityActionBuilder {
   
   
   private java.lang.Long quantity;
   
   
   private java.lang.String textLineItemId;
   
   public ShoppingListChangeTextLineItemQuantityActionBuilder quantity( final java.lang.Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public ShoppingListChangeTextLineItemQuantityActionBuilder textLineItemId( final java.lang.String textLineItemId) {
      this.textLineItemId = textLineItemId;
      return this;
   }
   
   
   public java.lang.Long getQuantity(){
      return this.quantity;
   }
   
   
   public java.lang.String getTextLineItemId(){
      return this.textLineItemId;
   }

   public ShoppingListChangeTextLineItemQuantityAction build() {
       return new ShoppingListChangeTextLineItemQuantityActionImpl(quantity, textLineItemId);
   }
   
   public static ShoppingListChangeTextLineItemQuantityActionBuilder of() {
      return new ShoppingListChangeTextLineItemQuantityActionBuilder();
   }
   
   public static ShoppingListChangeTextLineItemQuantityActionBuilder of(final ShoppingListChangeTextLineItemQuantityAction template) {
      ShoppingListChangeTextLineItemQuantityActionBuilder builder = new ShoppingListChangeTextLineItemQuantityActionBuilder();
      builder.quantity = template.getQuantity();
      builder.textLineItemId = template.getTextLineItemId();
      return builder;
   }
   
}