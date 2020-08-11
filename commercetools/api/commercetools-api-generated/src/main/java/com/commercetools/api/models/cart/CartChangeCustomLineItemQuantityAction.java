package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.CartChangeCustomLineItemQuantityActionImpl;

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
@JsonDeserialize(as = CartChangeCustomLineItemQuantityActionImpl.class)
public interface CartChangeCustomLineItemQuantityAction extends CartUpdateAction {

   
   @NotNull
   @JsonProperty("customLineItemId")
   public String getCustomLineItemId();
   
   @NotNull
   @JsonProperty("quantity")
   public Integer getQuantity();

   public void setCustomLineItemId(final String customLineItemId);
   
   public void setQuantity(final Integer quantity);
   
   public static CartChangeCustomLineItemQuantityActionImpl of(){
      return new CartChangeCustomLineItemQuantityActionImpl();
   }
   

   public static CartChangeCustomLineItemQuantityActionImpl of(final CartChangeCustomLineItemQuantityAction template) {
      CartChangeCustomLineItemQuantityActionImpl instance = new CartChangeCustomLineItemQuantityActionImpl();
      instance.setCustomLineItemId(template.getCustomLineItemId());
      instance.setQuantity(template.getQuantity());
      return instance;
   }

}
