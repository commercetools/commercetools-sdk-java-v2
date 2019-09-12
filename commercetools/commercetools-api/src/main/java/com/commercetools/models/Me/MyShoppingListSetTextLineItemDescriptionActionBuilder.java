package com.commercetools.models.Me;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Me.MyShoppingListUpdateAction;
import java.lang.String;
import com.commercetools.models.Me.MyShoppingListSetTextLineItemDescriptionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyShoppingListSetTextLineItemDescriptionActionBuilder {
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString description;
   
   
   private java.lang.String textLineItemId;
   
   public MyShoppingListSetTextLineItemDescriptionActionBuilder description(@Nullable final com.commercetools.models.Common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public MyShoppingListSetTextLineItemDescriptionActionBuilder textLineItemId( final java.lang.String textLineItemId) {
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

   public MyShoppingListSetTextLineItemDescriptionAction build() {
       return new MyShoppingListSetTextLineItemDescriptionActionImpl(description, textLineItemId);
   }
   
   public static MyShoppingListSetTextLineItemDescriptionActionBuilder of() {
      return new MyShoppingListSetTextLineItemDescriptionActionBuilder();
   }
   
   public static MyShoppingListSetTextLineItemDescriptionActionBuilder of(final MyShoppingListSetTextLineItemDescriptionAction template) {
      MyShoppingListSetTextLineItemDescriptionActionBuilder builder = new MyShoppingListSetTextLineItemDescriptionActionBuilder();
      builder.description = template.getDescription();
      builder.textLineItemId = template.getTextLineItemId();
      return builder;
   }
   
}