package com.commercetools.models.ShoppingList;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.ShoppingList.ShoppingListUpdateAction;
import com.commercetools.models.Type.CustomFieldsDraft;
import java.lang.Long;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.ShoppingList.ShoppingListAddTextLineItemAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShoppingListAddTextLineItemActionBuilder {
   
   @Nullable
   private java.time.ZonedDateTime addedAt;
   
   @Nullable
   private java.lang.Long quantity;
   
   @Nullable
   private com.commercetools.models.Type.CustomFieldsDraft custom;
   
   
   private com.commercetools.models.Common.LocalizedString name;
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString description;
   
   public ShoppingListAddTextLineItemActionBuilder addedAt(@Nullable final java.time.ZonedDateTime addedAt) {
      this.addedAt = addedAt;
      return this;
   }
   
   public ShoppingListAddTextLineItemActionBuilder quantity(@Nullable final java.lang.Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public ShoppingListAddTextLineItemActionBuilder custom(@Nullable final com.commercetools.models.Type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public ShoppingListAddTextLineItemActionBuilder name( final com.commercetools.models.Common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public ShoppingListAddTextLineItemActionBuilder description(@Nullable final com.commercetools.models.Common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   @Nullable
   public java.time.ZonedDateTime getAddedAt(){
      return this.addedAt;
   }
   
   @Nullable
   public java.lang.Long getQuantity(){
      return this.quantity;
   }
   
   @Nullable
   public com.commercetools.models.Type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getDescription(){
      return this.description;
   }

   public ShoppingListAddTextLineItemAction build() {
       return new ShoppingListAddTextLineItemActionImpl(addedAt, quantity, custom, name, description);
   }
   
   public static ShoppingListAddTextLineItemActionBuilder of() {
      return new ShoppingListAddTextLineItemActionBuilder();
   }
   
   public static ShoppingListAddTextLineItemActionBuilder of(final ShoppingListAddTextLineItemAction template) {
      ShoppingListAddTextLineItemActionBuilder builder = new ShoppingListAddTextLineItemActionBuilder();
      builder.addedAt = template.getAddedAt();
      builder.quantity = template.getQuantity();
      builder.custom = template.getCustom();
      builder.name = template.getName();
      builder.description = template.getDescription();
      return builder;
   }
   
}