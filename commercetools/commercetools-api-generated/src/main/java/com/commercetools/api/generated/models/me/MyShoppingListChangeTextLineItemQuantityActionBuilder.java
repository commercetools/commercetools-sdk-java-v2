package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.generated.models.me.MyShoppingListChangeTextLineItemQuantityAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyShoppingListChangeTextLineItemQuantityActionBuilder {
   
   
   private Long quantity;
   
   
   private String textLineItemId;
   
   public MyShoppingListChangeTextLineItemQuantityActionBuilder quantity( final Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public MyShoppingListChangeTextLineItemQuantityActionBuilder textLineItemId( final String textLineItemId) {
      this.textLineItemId = textLineItemId;
      return this;
   }
   
   
   public Long getQuantity(){
      return this.quantity;
   }
   
   
   public String getTextLineItemId(){
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