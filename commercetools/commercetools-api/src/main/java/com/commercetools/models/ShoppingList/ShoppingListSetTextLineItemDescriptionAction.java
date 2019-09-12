package com.commercetools.models.ShoppingList;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.ShoppingList.ShoppingListUpdateAction;
import java.lang.String;
import com.commercetools.models.ShoppingList.ShoppingListSetTextLineItemDescriptionActionImpl;

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
@JsonDeserialize(as = ShoppingListSetTextLineItemDescriptionActionImpl.class)
public interface ShoppingListSetTextLineItemDescriptionAction extends ShoppingListUpdateAction {

   
   @NotNull
   @JsonProperty("textLineItemId")
   public String getTextLineItemId();
   
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();

   public void setTextLineItemId(final String textLineItemId);
   
   public void setDescription(final LocalizedString description);
   
   public static ShoppingListSetTextLineItemDescriptionActionImpl of(){
      return new ShoppingListSetTextLineItemDescriptionActionImpl();
   }
   

   public static ShoppingListSetTextLineItemDescriptionActionImpl of(final ShoppingListSetTextLineItemDescriptionAction template) {
      ShoppingListSetTextLineItemDescriptionActionImpl instance = new ShoppingListSetTextLineItemDescriptionActionImpl();
      instance.setDescription(template.getDescription());
      instance.setTextLineItemId(template.getTextLineItemId());
      return instance;
   }

}