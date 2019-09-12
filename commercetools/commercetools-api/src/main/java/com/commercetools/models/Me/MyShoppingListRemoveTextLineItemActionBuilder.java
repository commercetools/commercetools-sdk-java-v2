package com.commercetools.models.Me;

import com.commercetools.models.Me.MyShoppingListUpdateAction;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.Me.MyShoppingListRemoveTextLineItemAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyShoppingListRemoveTextLineItemActionBuilder {
   
   @Nullable
   private java.lang.Long quantity;
   
   
   private java.lang.String textLineItemId;
   
   public MyShoppingListRemoveTextLineItemActionBuilder quantity(@Nullable final java.lang.Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public MyShoppingListRemoveTextLineItemActionBuilder textLineItemId( final java.lang.String textLineItemId) {
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

   public MyShoppingListRemoveTextLineItemAction build() {
       return new MyShoppingListRemoveTextLineItemActionImpl(quantity, textLineItemId);
   }
   
   public static MyShoppingListRemoveTextLineItemActionBuilder of() {
      return new MyShoppingListRemoveTextLineItemActionBuilder();
   }
   
   public static MyShoppingListRemoveTextLineItemActionBuilder of(final MyShoppingListRemoveTextLineItemAction template) {
      MyShoppingListRemoveTextLineItemActionBuilder builder = new MyShoppingListRemoveTextLineItemActionBuilder();
      builder.quantity = template.getQuantity();
      builder.textLineItemId = template.getTextLineItemId();
      return builder;
   }
   
}