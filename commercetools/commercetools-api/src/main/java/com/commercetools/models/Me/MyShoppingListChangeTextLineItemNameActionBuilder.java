package com.commercetools.models.me;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.me.MyShoppingListUpdateAction;
import java.lang.String;
import com.commercetools.models.me.MyShoppingListChangeTextLineItemNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyShoppingListChangeTextLineItemNameActionBuilder {
   
   
   private com.commercetools.models.common.LocalizedString name;
   
   
   private java.lang.String textLineItemId;
   
   public MyShoppingListChangeTextLineItemNameActionBuilder name( final com.commercetools.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public MyShoppingListChangeTextLineItemNameActionBuilder textLineItemId( final java.lang.String textLineItemId) {
      this.textLineItemId = textLineItemId;
      return this;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public java.lang.String getTextLineItemId(){
      return this.textLineItemId;
   }

   public MyShoppingListChangeTextLineItemNameAction build() {
       return new MyShoppingListChangeTextLineItemNameActionImpl(name, textLineItemId);
   }
   
   public static MyShoppingListChangeTextLineItemNameActionBuilder of() {
      return new MyShoppingListChangeTextLineItemNameActionBuilder();
   }
   
   public static MyShoppingListChangeTextLineItemNameActionBuilder of(final MyShoppingListChangeTextLineItemNameAction template) {
      MyShoppingListChangeTextLineItemNameActionBuilder builder = new MyShoppingListChangeTextLineItemNameActionBuilder();
      builder.name = template.getName();
      builder.textLineItemId = template.getTextLineItemId();
      return builder;
   }
   
}