package com.commercetools.models.me;

import com.commercetools.models.me.MyShoppingListUpdateAction;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.me.MyShoppingListChangeLineItemQuantityActionImpl;

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
@JsonDeserialize(as = MyShoppingListChangeLineItemQuantityActionImpl.class)
public interface MyShoppingListChangeLineItemQuantityAction extends MyShoppingListUpdateAction {

   
   @NotNull
   @JsonProperty("lineItemId")
   public String getLineItemId();
   
   @NotNull
   @JsonProperty("quantity")
   public Long getQuantity();

   public void setLineItemId(final String lineItemId);
   
   public void setQuantity(final Long quantity);
   
   public static MyShoppingListChangeLineItemQuantityActionImpl of(){
      return new MyShoppingListChangeLineItemQuantityActionImpl();
   }
   

   public static MyShoppingListChangeLineItemQuantityActionImpl of(final MyShoppingListChangeLineItemQuantityAction template) {
      MyShoppingListChangeLineItemQuantityActionImpl instance = new MyShoppingListChangeLineItemQuantityActionImpl();
      instance.setQuantity(template.getQuantity());
      instance.setLineItemId(template.getLineItemId());
      return instance;
   }

}