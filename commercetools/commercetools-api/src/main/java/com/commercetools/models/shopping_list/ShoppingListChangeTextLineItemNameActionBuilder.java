package com.commercetools.models.shopping_list;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.models.shopping_list.ShoppingListChangeTextLineItemNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShoppingListChangeTextLineItemNameActionBuilder {
   
   
   private com.commercetools.models.common.LocalizedString name;
   
   
   private String textLineItemId;
   
   public ShoppingListChangeTextLineItemNameActionBuilder name( final com.commercetools.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public ShoppingListChangeTextLineItemNameActionBuilder textLineItemId( final String textLineItemId) {
      this.textLineItemId = textLineItemId;
      return this;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public String getTextLineItemId(){
      return this.textLineItemId;
   }

   public ShoppingListChangeTextLineItemNameAction build() {
       return new ShoppingListChangeTextLineItemNameActionImpl(name, textLineItemId);
   }
   
   public static ShoppingListChangeTextLineItemNameActionBuilder of() {
      return new ShoppingListChangeTextLineItemNameActionBuilder();
   }
   
   public static ShoppingListChangeTextLineItemNameActionBuilder of(final ShoppingListChangeTextLineItemNameAction template) {
      ShoppingListChangeTextLineItemNameActionBuilder builder = new ShoppingListChangeTextLineItemNameActionBuilder();
      builder.name = template.getName();
      builder.textLineItemId = template.getTextLineItemId();
      return builder;
   }
   
}