package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.generated.models.me.MyShoppingListSetTextLineItemCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyShoppingListSetTextLineItemCustomFieldActionBuilder {
   
   
   private String name;
   
   @Nullable
   private Object value;
   
   
   private String textLineItemId;
   
   public MyShoppingListSetTextLineItemCustomFieldActionBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public MyShoppingListSetTextLineItemCustomFieldActionBuilder value(@Nullable final Object value) {
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
   public Object getValue(){
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