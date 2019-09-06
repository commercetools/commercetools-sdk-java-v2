package com.commercetools.models.ShoppingList;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.ShoppingList.ShoppingListUpdateAction;
import java.lang.String;
import com.commercetools.models.ShoppingList.ShoppingListSetDescriptionActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ShoppingListSetDescriptionActionImpl.class)
public interface ShoppingListSetDescriptionAction extends ShoppingListUpdateAction {

   
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();

   public void setDescription(final LocalizedString description);
   
   public static ShoppingListSetDescriptionActionImpl of(){
      return new ShoppingListSetDescriptionActionImpl();
   }
   

   public static ShoppingListSetDescriptionActionImpl of(final ShoppingListSetDescriptionAction template) {
      ShoppingListSetDescriptionActionImpl instance = new ShoppingListSetDescriptionActionImpl();
      instance.setDescription(template.getDescription());
      return instance;
   }

}