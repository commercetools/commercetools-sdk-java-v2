package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.generated.models.type.CustomFieldsDraft;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.me.MyShoppingListAddTextLineItemAction;
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
public final class MyShoppingListAddTextLineItemActionBuilder {
   
   @Nullable
   private java.time.ZonedDateTime addedAt;
   
   @Nullable
   private Long quantity;
   
   @Nullable
   private com.commercetools.api.generated.models.type.CustomFieldsDraft custom;
   
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString description;
   
   public MyShoppingListAddTextLineItemActionBuilder addedAt(@Nullable final java.time.ZonedDateTime addedAt) {
      this.addedAt = addedAt;
      return this;
   }
   
   public MyShoppingListAddTextLineItemActionBuilder quantity(@Nullable final Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public MyShoppingListAddTextLineItemActionBuilder custom(@Nullable final com.commercetools.api.generated.models.type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public MyShoppingListAddTextLineItemActionBuilder name( final com.commercetools.api.generated.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public MyShoppingListAddTextLineItemActionBuilder description(@Nullable final com.commercetools.api.generated.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   @Nullable
   public java.time.ZonedDateTime getAddedAt(){
      return this.addedAt;
   }
   
   @Nullable
   public Long getQuantity(){
      return this.quantity;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getDescription(){
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