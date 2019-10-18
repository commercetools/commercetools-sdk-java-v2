package com.commercetools.api.generated.models.shopping_list;

import com.commercetools.api.generated.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.generated.models.shopping_list.ShoppingListChangeLineItemQuantityAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShoppingListChangeLineItemQuantityActionBuilder {
   
   
   private Long quantity;
   
   
   private String lineItemId;
   
   public ShoppingListChangeLineItemQuantityActionBuilder quantity( final Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public ShoppingListChangeLineItemQuantityActionBuilder lineItemId( final String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   
   public Long getQuantity(){
      return this.quantity;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }

   public ShoppingListChangeLineItemQuantityAction build() {
       return new ShoppingListChangeLineItemQuantityActionImpl(quantity, lineItemId);
   }
   
   public static ShoppingListChangeLineItemQuantityActionBuilder of() {
      return new ShoppingListChangeLineItemQuantityActionBuilder();
   }
   
   public static ShoppingListChangeLineItemQuantityActionBuilder of(final ShoppingListChangeLineItemQuantityAction template) {
      ShoppingListChangeLineItemQuantityActionBuilder builder = new ShoppingListChangeLineItemQuantityActionBuilder();
      builder.quantity = template.getQuantity();
      builder.lineItemId = template.getLineItemId();
      return builder;
   }
   
}