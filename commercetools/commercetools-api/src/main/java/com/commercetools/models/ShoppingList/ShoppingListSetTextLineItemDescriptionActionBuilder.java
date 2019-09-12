package com.commercetools.models.ShoppingList;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.ShoppingList.ShoppingListUpdateAction;
import java.lang.String;
import com.commercetools.models.ShoppingList.ShoppingListSetTextLineItemDescriptionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShoppingListSetTextLineItemDescriptionActionBuilder {
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString description;
   
   
   private java.lang.String textLineItemId;
   
   public ShoppingListSetTextLineItemDescriptionActionBuilder description(@Nullable final com.commercetools.models.Common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public ShoppingListSetTextLineItemDescriptionActionBuilder textLineItemId( final java.lang.String textLineItemId) {
      this.textLineItemId = textLineItemId;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public java.lang.String getTextLineItemId(){
      return this.textLineItemId;
   }

   public ShoppingListSetTextLineItemDescriptionAction build() {
       return new ShoppingListSetTextLineItemDescriptionActionImpl(description, textLineItemId);
   }
   
   public static ShoppingListSetTextLineItemDescriptionActionBuilder of() {
      return new ShoppingListSetTextLineItemDescriptionActionBuilder();
   }
   
   public static ShoppingListSetTextLineItemDescriptionActionBuilder of(final ShoppingListSetTextLineItemDescriptionAction template) {
      ShoppingListSetTextLineItemDescriptionActionBuilder builder = new ShoppingListSetTextLineItemDescriptionActionBuilder();
      builder.description = template.getDescription();
      builder.textLineItemId = template.getTextLineItemId();
      return builder;
   }
   
}