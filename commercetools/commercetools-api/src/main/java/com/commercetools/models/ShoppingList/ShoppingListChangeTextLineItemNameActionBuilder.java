package com.commercetools.models.ShoppingList;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.ShoppingList.ShoppingListUpdateAction;
import java.lang.String;
import com.commercetools.models.ShoppingList.ShoppingListChangeTextLineItemNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShoppingListChangeTextLineItemNameActionBuilder {
   
   
   private com.commercetools.models.Common.LocalizedString name;
   
   
   private java.lang.String textLineItemId;
   
   public ShoppingListChangeTextLineItemNameActionBuilder name( final com.commercetools.models.Common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public ShoppingListChangeTextLineItemNameActionBuilder textLineItemId( final java.lang.String textLineItemId) {
      this.textLineItemId = textLineItemId;
      return this;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }
   
   
   public java.lang.String getTextLineItemId(){
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