package com.commercetools.models.me;

import com.commercetools.models.me.MyShoppingListUpdateAction;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.me.MyShoppingListRemoveLineItemAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyShoppingListRemoveLineItemActionBuilder {
   
   @Nullable
   private java.lang.Long quantity;
   
   
   private java.lang.String lineItemId;
   
   public MyShoppingListRemoveLineItemActionBuilder quantity(@Nullable final java.lang.Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public MyShoppingListRemoveLineItemActionBuilder lineItemId( final java.lang.String lineItemId) {
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

   public MyShoppingListRemoveLineItemAction build() {
       return new MyShoppingListRemoveLineItemActionImpl(quantity, lineItemId);
   }
   
   public static MyShoppingListRemoveLineItemActionBuilder of() {
      return new MyShoppingListRemoveLineItemActionBuilder();
   }
   
   public static MyShoppingListRemoveLineItemActionBuilder of(final MyShoppingListRemoveLineItemAction template) {
      MyShoppingListRemoveLineItemActionBuilder builder = new MyShoppingListRemoveLineItemActionBuilder();
      builder.quantity = template.getQuantity();
      builder.lineItemId = template.getLineItemId();
      return builder;
   }
   
}