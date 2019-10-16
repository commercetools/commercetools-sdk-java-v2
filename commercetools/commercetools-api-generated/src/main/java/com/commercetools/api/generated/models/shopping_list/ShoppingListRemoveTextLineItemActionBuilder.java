package com.commercetools.api.generated.models.shopping_list;

import com.commercetools.api.generated.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.generated.models.shopping_list.ShoppingListRemoveTextLineItemAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShoppingListRemoveTextLineItemActionBuilder {
   
   @Nullable
   private Long quantity;
   
   
   private String textLineItemId;
   
   public ShoppingListRemoveTextLineItemActionBuilder quantity(@Nullable final Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public ShoppingListRemoveTextLineItemActionBuilder textLineItemId( final String textLineItemId) {
      this.textLineItemId = textLineItemId;
      return this;
   }
   
   @Nullable
   public Long getQuantity(){
      return this.quantity;
   }
   
   
   public String getTextLineItemId(){
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