package com.commercetools.models.shopping_list;

import com.commercetools.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.models.shopping_list.ShoppingListChangeLineItemsOrderAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShoppingListChangeLineItemsOrderActionBuilder {
   
   
   private java.util.List<String> lineItemOrder;
   
   public ShoppingListChangeLineItemsOrderActionBuilder lineItemOrder( final java.util.List<String> lineItemOrder) {
      this.lineItemOrder = lineItemOrder;
      return this;
   }
   
   
   public java.util.List<String> getLineItemOrder(){
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