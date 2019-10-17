package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.generated.models.me.MyShoppingListRemoveLineItemAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyShoppingListRemoveLineItemActionBuilder {
   
   @Nullable
   private Long quantity;
   
   
   private String lineItemId;
   
   public MyShoppingListRemoveLineItemActionBuilder quantity(@Nullable final Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public MyShoppingListRemoveLineItemActionBuilder lineItemId( final String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   @Nullable
   public Long getQuantity(){
      return this.quantity;
   }
   
   
   public String getLineItemId(){
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