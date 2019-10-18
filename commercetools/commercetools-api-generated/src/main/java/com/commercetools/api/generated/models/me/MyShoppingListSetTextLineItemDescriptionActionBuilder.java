package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.generated.models.me.MyShoppingListSetTextLineItemDescriptionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyShoppingListSetTextLineItemDescriptionActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString description;
   
   
   private String textLineItemId;
   
   public MyShoppingListSetTextLineItemDescriptionActionBuilder description(@Nullable final com.commercetools.api.generated.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public MyShoppingListSetTextLineItemDescriptionActionBuilder textLineItemId( final String textLineItemId) {
      this.textLineItemId = textLineItemId;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public String getTextLineItemId(){
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