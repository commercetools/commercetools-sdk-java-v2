package com.commercetools.models.me;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.me.MyShoppingListUpdateAction;
import com.commercetools.models.type.CustomFieldsDraft;
import java.lang.Long;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.me.MyShoppingListAddTextLineItemAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyShoppingListAddTextLineItemActionBuilder {
   
   @Nullable
   private java.time.ZonedDateTime addedAt;
   
   @Nullable
   private java.lang.Long quantity;
   
   @Nullable
   private com.commercetools.models.type.CustomFieldsDraft custom;
   
   
   private com.commercetools.models.common.LocalizedString name;
   
   @Nullable
   private com.commercetools.models.common.LocalizedString description;
   
   public MyShoppingListAddTextLineItemActionBuilder addedAt(@Nullable final java.time.ZonedDateTime addedAt) {
      this.addedAt = addedAt;
      return this;
   }
   
   public MyShoppingListAddTextLineItemActionBuilder quantity(@Nullable final java.lang.Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public MyShoppingListAddTextLineItemActionBuilder custom(@Nullable final com.commercetools.models.type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public MyShoppingListAddTextLineItemActionBuilder name( final com.commercetools.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public MyShoppingListAddTextLineItemActionBuilder description(@Nullable final com.commercetools.models.common.LocalizedString description) {
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
   public com.commercetools.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public com.commercetools.models.common.LocalizedString getDescription(){
      return this.description;
   }

   public MyShoppingListAddTextLineItemAction build() {
       return new MyShoppingListAddTextLineItemActionImpl(addedAt, quantity, custom, name, description);
   }
   
   public static MyShoppingListAddTextLineItemActionBuilder of() {
      return new MyShoppingListAddTextLineItemActionBuilder();
   }
   
   public static MyShoppingListAddTextLineItemActionBuilder of(final MyShoppingListAddTextLineItemAction template) {
      MyShoppingListAddTextLineItemActionBuilder builder = new MyShoppingListAddTextLineItemActionBuilder();
      builder.addedAt = template.getAddedAt();
      builder.quantity = template.getQuantity();
      builder.custom = template.getCustom();
      builder.name = template.getName();
      builder.description = template.getDescription();
      return builder;
   }
   
}