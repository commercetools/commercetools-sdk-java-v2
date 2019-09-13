package com.commercetools.models.me;

import com.commercetools.models.me.MyShoppingListUpdateAction;
import java.lang.String;
import com.commercetools.models.me.MyShoppingListChangeTextLineItemsOrderAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyShoppingListChangeTextLineItemsOrderActionBuilder {
   
   
   private java.util.List<java.lang.String> textLineItemOrder;
   
   public MyShoppingListChangeTextLineItemsOrderActionBuilder textLineItemOrder( final java.util.List<java.lang.String> textLineItemOrder) {
      this.textLineItemOrder = textLineItemOrder;
      return this;
   }
   
   
   public java.util.List<java.lang.String> getTextLineItemOrder(){
      return this.textLineItemOrder;
   }

   public MyShoppingListChangeTextLineItemsOrderAction build() {
       return new MyShoppingListChangeTextLineItemsOrderActionImpl(textLineItemOrder);
   }
   
   public static MyShoppingListChangeTextLineItemsOrderActionBuilder of() {
      return new MyShoppingListChangeTextLineItemsOrderActionBuilder();
   }
   
   public static MyShoppingListChangeTextLineItemsOrderActionBuilder of(final MyShoppingListChangeTextLineItemsOrderAction template) {
      MyShoppingListChangeTextLineItemsOrderActionBuilder builder = new MyShoppingListChangeTextLineItemsOrderActionBuilder();
      builder.textLineItemOrder = template.getTextLineItemOrder();
      return builder;
   }
   
}