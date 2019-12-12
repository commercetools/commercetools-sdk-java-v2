package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.generated.models.me.MyShoppingListSetTextLineItemCustomFieldAction;
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
public final class MyShoppingListSetTextLineItemCustomFieldActionBuilder {
   
   
   private String name;
   
   @Nullable
   private JsonNode value;
   
   
   private String textLineItemId;
   
   public MyShoppingListSetTextLineItemCustomFieldActionBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public MyShoppingListSetTextLineItemCustomFieldActionBuilder value(@Nullable final JsonNode value) {
      this.value = value;
      return this;
   }
   
   public MyShoppingListSetTextLineItemCustomFieldActionBuilder textLineItemId( final String textLineItemId) {
      this.textLineItemId = textLineItemId;
      return this;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   @Nullable
   public JsonNode getValue(){
      return this.value;
   }
   
   
   public String getTextLineItemId(){
      return this.textLineItemId;
   }

   public MyShoppingListSetTextLineItemCustomFieldAction build() {
       return new MyShoppingListSetTextLineItemCustomFieldActionImpl(name, value, textLineItemId);
   }
   
   public static MyShoppingListSetTextLineItemCustomFieldActionBuilder of() {
      return new MyShoppingListSetTextLineItemCustomFieldActionBuilder();
   }
   
   public static MyShoppingListSetTextLineItemCustomFieldActionBuilder of(final MyShoppingListSetTextLineItemCustomFieldAction template) {
      MyShoppingListSetTextLineItemCustomFieldActionBuilder builder = new MyShoppingListSetTextLineItemCustomFieldActionBuilder();
      builder.name = template.getName();
      builder.value = template.getValue();
      builder.textLineItemId = template.getTextLineItemId();
      return builder;
   }
   
}