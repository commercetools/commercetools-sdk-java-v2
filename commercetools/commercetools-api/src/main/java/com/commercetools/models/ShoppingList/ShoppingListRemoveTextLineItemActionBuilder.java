package com.commercetools.models.ShoppingList;

import com.commercetools.models.ShoppingList.ShoppingListUpdateAction;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.ShoppingList.ShoppingListRemoveTextLineItemAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShoppingListRemoveTextLineItemActionBuilder {
   
   @Nullable
   private java.lang.Long quantity;
   
   
   private java.lang.String textLineItemId;
   
   public ShoppingListRemoveTextLineItemActionBuilder quantity(@Nullable final java.lang.Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public ShoppingListRemoveTextLineItemActionBuilder textLineItemId( final java.lang.String textLineItemId) {
      this.textLineItemId = textLineItemId;
      return this;
   }
   
   @Nullable
   public java.lang.Long getQuantity(){
      return this.quantity;
   }
   
   
   public java.lang.String getTextLineItemId(){
      return this.textLineItemId;
   }

   public ShoppingListRemoveTextLineItemAction build() {
       return new ShoppingListRemoveTextLineItemActionImpl(quantity, textLineItemId);
   }
   
   public static ShoppingListRemoveTextLineItemActionBuilder of() {
      return new ShoppingListRemoveTextLineItemActionBuilder();
   }
   
   public static ShoppingListRemoveTextLineItemActionBuilder of(final ShoppingListRemoveTextLineItemAction template) {
      ShoppingListRemoveTextLineItemActionBuilder builder = new ShoppingListRemoveTextLineItemActionBuilder();
      builder.quantity = template.getQuantity();
      builder.textLineItemId = template.getTextLineItemId();
      return builder;
   }
   
}