package com.commercetools.api.models.me;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.models.me.MyShoppingListChangeTextLineItemNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyShoppingListChangeTextLineItemNameActionBuilder {


   private com.commercetools.api.models.common.LocalizedString name;


   private String textLineItemId;

   public MyShoppingListChangeTextLineItemNameActionBuilder name( final com.commercetools.api.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }

   public MyShoppingListChangeTextLineItemNameActionBuilder textLineItemId( final String textLineItemId) {
      this.textLineItemId = textLineItemId;
      return this;
   }


   public com.commercetools.api.models.common.LocalizedString getName(){
      return this.name;
   }


   public String getTextLineItemId(){
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
