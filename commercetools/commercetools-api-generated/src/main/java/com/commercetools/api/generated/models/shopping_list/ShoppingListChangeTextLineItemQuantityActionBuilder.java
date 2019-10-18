package com.commercetools.api.generated.models.shopping_list;

import com.commercetools.api.generated.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.generated.models.shopping_list.ShoppingListChangeTextLineItemQuantityAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShoppingListChangeTextLineItemQuantityActionBuilder {
   
   
   private Long quantity;
   
   
   private String textLineItemId;
   
   public ShoppingListChangeTextLineItemQuantityActionBuilder quantity( final Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public ShoppingListChangeTextLineItemQuantityActionBuilder textLineItemId( final String textLineItemId) {
      this.textLineItemId = textLineItemId;
      return this;
   }
   
   
   public Long getQuantity(){
      return this.quantity;
   }
   
   
   public String getTextLineItemId(){
      return this.textLineItemId;
   }

   public ShoppingListChangeTextLineItemQuantityAction build() {
       return new ShoppingListChangeTextLineItemQuantityActionImpl(quantity, textLineItemId);
   }
   
   public static ShoppingListChangeTextLineItemQuantityActionBuilder of() {
      return new ShoppingListChangeTextLineItemQuantityActionBuilder();
   }
   
   public static ShoppingListChangeTextLineItemQuantityActionBuilder of(final ShoppingListChangeTextLineItemQuantityAction template) {
      ShoppingListChangeTextLineItemQuantityActionBuilder builder = new ShoppingListChangeTextLineItemQuantityActionBuilder();
      builder.quantity = template.getQuantity();
      builder.textLineItemId = template.getTextLineItemId();
      return builder;
   }
   
}