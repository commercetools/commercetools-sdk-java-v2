package com.commercetools.models.me;

import com.commercetools.models.me.MyShoppingListUpdateAction;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.me.MyShoppingListChangeLineItemQuantityAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyShoppingListChangeLineItemQuantityActionBuilder {
   
   
   private java.lang.Long quantity;
   
   
   private java.lang.String lineItemId;
   
   public MyShoppingListChangeLineItemQuantityActionBuilder quantity( final java.lang.Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public MyShoppingListChangeLineItemQuantityActionBuilder lineItemId( final java.lang.String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   
   public java.lang.Long getQuantity(){
      return this.quantity;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }

   public MyShoppingListChangeLineItemQuantityAction build() {
       return new MyShoppingListChangeLineItemQuantityActionImpl(quantity, lineItemId);
   }
   
   public static MyShoppingListChangeLineItemQuantityActionBuilder of() {
      return new MyShoppingListChangeLineItemQuantityActionBuilder();
   }
   
   public static MyShoppingListChangeLineItemQuantityActionBuilder of(final MyShoppingListChangeLineItemQuantityAction template) {
      MyShoppingListChangeLineItemQuantityActionBuilder builder = new MyShoppingListChangeLineItemQuantityActionBuilder();
      builder.quantity = template.getQuantity();
      builder.lineItemId = template.getLineItemId();
      return builder;
   }
   
}