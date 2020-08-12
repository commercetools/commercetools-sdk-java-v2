package com.commercetools.api.models.me;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.models.me.MyShoppingListSetTextLineItemDescriptionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyShoppingListSetTextLineItemDescriptionActionBuilder {
   
   
   private String textLineItemId;
   
   @Nullable
   private com.commercetools.api.models.common.LocalizedString description;
   
   public MyShoppingListSetTextLineItemDescriptionActionBuilder textLineItemId( final String textLineItemId) {
      this.textLineItemId = textLineItemId;
      return this;
   }
   
   public MyShoppingListSetTextLineItemDescriptionActionBuilder description(@Nullable final com.commercetools.api.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   
   public String getTextLineItemId(){
      return this.textLineItemId;
   }
   
   @Nullable
   public com.commercetools.api.models.common.LocalizedString getDescription(){
      return this.description;
   }

   public MyShoppingListSetTextLineItemDescriptionAction build() {
       return new MyShoppingListSetTextLineItemDescriptionActionImpl(textLineItemId, description);
   }
   
   public static MyShoppingListSetTextLineItemDescriptionActionBuilder of() {
      return new MyShoppingListSetTextLineItemDescriptionActionBuilder();
   }
   
   public static MyShoppingListSetTextLineItemDescriptionActionBuilder of(final MyShoppingListSetTextLineItemDescriptionAction template) {
      MyShoppingListSetTextLineItemDescriptionActionBuilder builder = new MyShoppingListSetTextLineItemDescriptionActionBuilder();
      builder.textLineItemId = template.getTextLineItemId();
      builder.description = template.getDescription();
      return builder;
   }
   
}
