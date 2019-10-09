package com.commercetools.models.shopping_list;

import com.commercetools.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.models.shopping_list.ShoppingListChangeLineItemQuantityActionImpl;

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
@JsonDeserialize(as = ShoppingListChangeLineItemQuantityActionImpl.class)
public interface ShoppingListChangeLineItemQuantityAction extends ShoppingListUpdateAction {

   
   @NotNull
   @JsonProperty("lineItemId")
   public String getLineItemId();
   
   @NotNull
   @JsonProperty("quantity")
   public Long getQuantity();

   public void setLineItemId(final String lineItemId);
   
   public void setQuantity(final Long quantity);
   
   public static ShoppingListChangeLineItemQuantityActionImpl of(){
      return new ShoppingListChangeLineItemQuantityActionImpl();
   }
   

   public static ShoppingListChangeLineItemQuantityActionImpl of(final ShoppingListChangeLineItemQuantityAction template) {
      ShoppingListChangeLineItemQuantityActionImpl instance = new ShoppingListChangeLineItemQuantityActionImpl();
      instance.setQuantity(template.getQuantity());
      instance.setLineItemId(template.getLineItemId());
      return instance;
   }

}