package com.commercetools.models.me;

import com.commercetools.models.me.MyShoppingListUpdateAction;
import com.commercetools.models.me.MyShoppingListRemoveLineItemActionImpl;

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
@JsonDeserialize(as = MyShoppingListRemoveLineItemActionImpl.class)
public interface MyShoppingListRemoveLineItemAction extends MyShoppingListUpdateAction {

   
   @NotNull
   @JsonProperty("lineItemId")
   public String getLineItemId();
   
   
   @JsonProperty("quantity")
   public Long getQuantity();

   public void setLineItemId(final String lineItemId);
   
   public void setQuantity(final Long quantity);
   
   public static MyShoppingListRemoveLineItemActionImpl of(){
      return new MyShoppingListRemoveLineItemActionImpl();
   }
   

   public static MyShoppingListRemoveLineItemActionImpl of(final MyShoppingListRemoveLineItemAction template) {
      MyShoppingListRemoveLineItemActionImpl instance = new MyShoppingListRemoveLineItemActionImpl();
      instance.setQuantity(template.getQuantity());
      instance.setLineItemId(template.getLineItemId());
      return instance;
   }

}