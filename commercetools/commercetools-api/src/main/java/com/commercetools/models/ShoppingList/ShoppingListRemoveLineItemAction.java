package com.commercetools.models.ShoppingList;

import com.commercetools.models.ShoppingList.ShoppingListUpdateAction;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.ShoppingList.ShoppingListRemoveLineItemActionImpl;

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
@JsonDeserialize(as = ShoppingListRemoveLineItemActionImpl.class)
public interface ShoppingListRemoveLineItemAction extends ShoppingListUpdateAction {

   
   @NotNull
   @JsonProperty("lineItemId")
   public String getLineItemId();
   
   
   @JsonProperty("quantity")
   public Long getQuantity();

   public void setLineItemId(final String lineItemId);
   
   public void setQuantity(final Long quantity);
   
   public static ShoppingListRemoveLineItemActionImpl of(){
      return new ShoppingListRemoveLineItemActionImpl();
   }
   

   public static ShoppingListRemoveLineItemActionImpl of(final ShoppingListRemoveLineItemAction template) {
      ShoppingListRemoveLineItemActionImpl instance = new ShoppingListRemoveLineItemActionImpl();
      instance.setQuantity(template.getQuantity());
      instance.setLineItemId(template.getLineItemId());
      return instance;
   }

}