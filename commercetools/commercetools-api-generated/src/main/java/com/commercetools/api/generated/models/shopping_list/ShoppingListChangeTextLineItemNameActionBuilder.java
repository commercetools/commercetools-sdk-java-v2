package com.commercetools.api.generated.models.shopping_list;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.generated.models.shopping_list.ShoppingListChangeTextLineItemNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShoppingListChangeTextLineItemNameActionBuilder {
   
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   
   private String textLineItemId;
   
   public ShoppingListChangeTextLineItemNameActionBuilder name( final com.commercetools.api.generated.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public ShoppingListChangeTextLineItemNameActionBuilder textLineItemId( final String textLineItemId) {
      this.textLineItemId = textLineItemId;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
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