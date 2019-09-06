package com.commercetools.models.ShoppingList;

import com.commercetools.models.ShoppingList.ShoppingListUpdateAction;
import java.lang.String;
import com.commercetools.models.ShoppingList.ShoppingListChangeLineItemsOrderAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShoppingListChangeLineItemsOrderActionBuilder {
   
   
   private java.util.List<java.lang.String> lineItemOrder;
   
   public ShoppingListChangeLineItemsOrderActionBuilder lineItemOrder( final java.util.List<java.lang.String> lineItemOrder) {
      this.lineItemOrder = lineItemOrder;
      return this;
   }
   
   
   public java.util.List<java.lang.String> getLineItemOrder(){
      return this.lineItemOrder;
   }

   public ShoppingListChangeLineItemsOrderAction build() {
       return new ShoppingListChangeLineItemsOrderActionImpl(lineItemOrder);
   }
   
   public static ShoppingListChangeLineItemsOrderActionBuilder of() {
      return new ShoppingListChangeLineItemsOrderActionBuilder();
   }
   
   public static ShoppingListChangeLineItemsOrderActionBuilder of(final ShoppingListChangeLineItemsOrderAction template) {
      ShoppingListChangeLineItemsOrderActionBuilder builder = new ShoppingListChangeLineItemsOrderActionBuilder();
      builder.lineItemOrder = template.getLineItemOrder();
      return builder;
   }
   
}