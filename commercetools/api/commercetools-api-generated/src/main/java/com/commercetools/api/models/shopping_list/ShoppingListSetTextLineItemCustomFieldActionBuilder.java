package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShoppingListSetTextLineItemCustomFieldActionBuilder {


   private String name;

   @Nullable
   private com.fasterxml.jackson.databind.JsonNode value;


   private String textLineItemId;

   public ShoppingListSetTextLineItemCustomFieldActionBuilder name( final String name) {
      this.name = name;
      return this;
   }

   public ShoppingListSetTextLineItemCustomFieldActionBuilder value(@Nullable final com.fasterxml.jackson.databind.JsonNode value) {
      this.value = value;
      return this;
   }

   public ShoppingListSetTextLineItemCustomFieldActionBuilder textLineItemId( final String textLineItemId) {
      this.textLineItemId = textLineItemId;
      return this;
   }


   public String getName(){
      return this.name;
   }

   @Nullable
   public com.fasterxml.jackson.databind.JsonNode getValue(){
      return this.value;
   }


   public String getTextLineItemId(){
      return this.textLineItemId;
   }

   public ShoppingListSetTextLineItemCustomFieldAction build() {
       return new ShoppingListSetTextLineItemCustomFieldActionImpl(name, value, textLineItemId);
   }

   public static ShoppingListSetTextLineItemCustomFieldActionBuilder of() {
      return new ShoppingListSetTextLineItemCustomFieldActionBuilder();
   }

   public static ShoppingListSetTextLineItemCustomFieldActionBuilder of(final ShoppingListSetTextLineItemCustomFieldAction template) {
      ShoppingListSetTextLineItemCustomFieldActionBuilder builder = new ShoppingListSetTextLineItemCustomFieldActionBuilder();
      builder.name = template.getName();
      builder.value = template.getValue();
      builder.textLineItemId = template.getTextLineItemId();
      return builder;
   }

}
