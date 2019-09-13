package com.commercetools.models.shopping_list;

import com.commercetools.models.shopping_list.ShoppingListUpdateAction;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.shopping_list.ShoppingListSetCustomFieldActionImpl;

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
@JsonDeserialize(as = ShoppingListSetCustomFieldActionImpl.class)
public interface ShoppingListSetCustomFieldAction extends ShoppingListUpdateAction {

   
   @NotNull
   @JsonProperty("name")
   public String getName();
   
   
   @JsonProperty("value")
   public Object getValue();

   public void setName(final String name);
   
   public void setValue(final Object value);
   
   public static ShoppingListSetCustomFieldActionImpl of(){
      return new ShoppingListSetCustomFieldActionImpl();
   }
   

   public static ShoppingListSetCustomFieldActionImpl of(final ShoppingListSetCustomFieldAction template) {
      ShoppingListSetCustomFieldActionImpl instance = new ShoppingListSetCustomFieldActionImpl();
      instance.setName(template.getName());
      instance.setValue(template.getValue());
      return instance;
   }

}