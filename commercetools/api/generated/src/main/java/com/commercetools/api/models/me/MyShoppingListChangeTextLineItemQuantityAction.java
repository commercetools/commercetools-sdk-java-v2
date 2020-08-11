package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.models.me.MyShoppingListChangeTextLineItemQuantityActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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
@JsonDeserialize(as = MyShoppingListChangeTextLineItemQuantityActionImpl.class)
public interface MyShoppingListChangeTextLineItemQuantityAction extends MyShoppingListUpdateAction {


   @NotNull
   @JsonProperty("textLineItemId")
   public String getTextLineItemId();

   @NotNull
   @JsonProperty("quantity")
   public Long getQuantity();

   public void setTextLineItemId(final String textLineItemId);

   public void setQuantity(final Long quantity);

   public static MyShoppingListChangeTextLineItemQuantityActionImpl of(){
      return new MyShoppingListChangeTextLineItemQuantityActionImpl();
   }


   public static MyShoppingListChangeTextLineItemQuantityActionImpl of(final MyShoppingListChangeTextLineItemQuantityAction template) {
      MyShoppingListChangeTextLineItemQuantityActionImpl instance = new MyShoppingListChangeTextLineItemQuantityActionImpl();
      instance.setQuantity(template.getQuantity());
      instance.setTextLineItemId(template.getTextLineItemId());
      return instance;
   }

}
