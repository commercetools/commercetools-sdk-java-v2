package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.generated.models.me.MyShoppingListRemoveTextLineItemAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyShoppingListRemoveTextLineItemActionBuilder {
   
   @Nullable
   private Long quantity;
   
   
   private String textLineItemId;
   
   public MyShoppingListRemoveTextLineItemActionBuilder quantity(@Nullable final Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public MyShoppingListRemoveTextLineItemActionBuilder textLineItemId( final String textLineItemId) {
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