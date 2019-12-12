package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.generated.models.type.FieldContainer;
import com.commercetools.api.generated.models.type.TypeResourceIdentifier;
import com.commercetools.api.generated.models.me.MyShoppingListSetTextLineItemCustomTypeAction;
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
public final class MyShoppingListSetTextLineItemCustomTypeActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.type.FieldContainer fields;
   
   @Nullable
   private com.commercetools.api.generated.models.type.TypeResourceIdentifier type;
   
   
   private String textLineItemId;
   
   public MyShoppingListSetTextLineItemCustomTypeActionBuilder fields(@Nullable final com.commercetools.api.generated.models.type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }
   
   public MyShoppingListSetTextLineItemCustomTypeActionBuilder type(@Nullable final com.commercetools.api.generated.models.type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   public MyShoppingListSetTextLineItemCustomTypeActionBuilder textLineItemId( final String textLineItemId) {
      this.textLineItemId = textLineItemId;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.FieldContainer getFields(){
      return this.fields;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }
   
   
   public String getTextLineItemId(){
      return this.textLineItemId;
   }

   public MyShoppingListSetTextLineItemCustomTypeAction build() {
       return new MyShoppingListSetTextLineItemCustomTypeActionImpl(fields, type, textLineItemId);
   }
   
   public static MyShoppingListSetTextLineItemCustomTypeActionBuilder of() {
      return new MyShoppingListSetTextLineItemCustomTypeActionBuilder();
   }
   
   public static MyShoppingListSetTextLineItemCustomTypeActionBuilder of(final MyShoppingListSetTextLineItemCustomTypeAction template) {
      MyShoppingListSetTextLineItemCustomTypeActionBuilder builder = new MyShoppingListSetTextLineItemCustomTypeActionBuilder();
      builder.fields = template.getFields();
      builder.type = template.getType();
      builder.textLineItemId = template.getTextLineItemId();
      return builder;
   }
   
}