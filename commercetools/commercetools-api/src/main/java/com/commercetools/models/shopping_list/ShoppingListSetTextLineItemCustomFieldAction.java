package com.commercetools.models.shopping_list;

import com.commercetools.models.shopping_list.ShoppingListUpdateAction;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.shopping_list.ShoppingListSetTextLineItemCustomFieldActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ShoppingListSetTextLineItemCustomFieldActionImpl.class)
public interface ShoppingListSetTextLineItemCustomFieldAction extends ShoppingListUpdateAction {

   
   @NotNull
   @JsonProperty("textLineItemId")
   public String getTextLineItemId();
   
   @NotNull
   @JsonProperty("name")
   public String getName();
   
   
   @JsonProperty("value")
   public Object getValue();

   public void setTextLineItemId(final String textLineItemId);
   
   public void setName(final String name);
   
   public void setValue(final Object value);
   
   public static ShoppingListSetTextLineItemCustomFieldActionImpl of(){
      return new ShoppingListSetTextLineItemCustomFieldActionImpl();
   }
   

   public static ShoppingListSetTextLineItemCustomFieldActionImpl of(final ShoppingListSetTextLineItemCustomFieldAction template) {
      ShoppingListSetTextLineItemCustomFieldActionImpl instance = new ShoppingListSetTextLineItemCustomFieldActionImpl();
      instance.setName(template.getName());
      instance.setValue(template.getValue());
      instance.setTextLineItemId(template.getTextLineItemId());
      return instance;
   }

}