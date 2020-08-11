package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.models.shopping_list.ShoppingListRemoveLineItemAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShoppingListRemoveLineItemActionBuilder {

   @Nullable
   private Long quantity;


   private String lineItemId;

   public ShoppingListRemoveLineItemActionBuilder quantity(@Nullable final Long quantity) {
      this.quantity = quantity;
      return this;
   }

   public ShoppingListRemoveLineItemActionBuilder lineItemId( final String lineItemId) {
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

   public ShoppingListRemoveLineItemAction build() {
       return new ShoppingListRemoveLineItemActionImpl(quantity, lineItemId);
   }

   public static ShoppingListRemoveLineItemActionBuilder of() {
      return new ShoppingListRemoveLineItemActionBuilder();
   }

   public static ShoppingListRemoveLineItemActionBuilder of(final ShoppingListRemoveLineItemAction template) {
      ShoppingListRemoveLineItemActionBuilder builder = new ShoppingListRemoveLineItemActionBuilder();
      builder.quantity = template.getQuantity();
      builder.lineItemId = template.getLineItemId();
      return builder;
   }

}
