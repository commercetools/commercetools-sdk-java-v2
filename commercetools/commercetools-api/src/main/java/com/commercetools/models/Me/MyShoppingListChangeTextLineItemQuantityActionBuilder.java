package com.commercetools.models.me;

import com.commercetools.models.me.MyShoppingListUpdateAction;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.me.MyShoppingListChangeTextLineItemQuantityAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyShoppingListChangeTextLineItemQuantityActionBuilder {
   
   
   private java.lang.Long quantity;
   
   
   private java.lang.String textLineItemId;
   
   public MyShoppingListChangeTextLineItemQuantityActionBuilder quantity( final java.lang.Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public MyShoppingListChangeTextLineItemQuantityActionBuilder textLineItemId( final java.lang.String textLineItemId) {
      this.textLineItemId = textLineItemId;
      return this;
   }
   
   
   public java.lang.Long getQuantity(){
      return this.quantity;
   }
   
   
   public java.lang.String getTextLineItemId(){
      return this.textLineItemId;
   }

   public MyShoppingListChangeTextLineItemQuantityAction build() {
       return new MyShoppingListChangeTextLineItemQuantityActionImpl(quantity, textLineItemId);
   }
   
   public static MyShoppingListChangeTextLineItemQuantityActionBuilder of() {
      return new MyShoppingListChangeTextLineItemQuantityActionBuilder();
   }
   
   public static MyShoppingListChangeTextLineItemQuantityActionBuilder of(final MyShoppingListChangeTextLineItemQuantityAction template) {
      MyShoppingListChangeTextLineItemQuantityActionBuilder builder = new MyShoppingListChangeTextLineItemQuantityActionBuilder();
      builder.quantity = template.getQuantity();
      builder.textLineItemId = template.getTextLineItemId();
      return builder;
   }
   
}