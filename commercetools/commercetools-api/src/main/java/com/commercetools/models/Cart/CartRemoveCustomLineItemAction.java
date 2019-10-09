package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.cart.CartRemoveCustomLineItemActionImpl;

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
@JsonDeserialize(as = CartRemoveCustomLineItemActionImpl.class)
public interface CartRemoveCustomLineItemAction extends CartUpdateAction {

   
   @NotNull
   @JsonProperty("customLineItemId")
   public String getCustomLineItemId();

   public void setCustomLineItemId(final String customLineItemId);
   
   public static CartRemoveCustomLineItemActionImpl of(){
      return new CartRemoveCustomLineItemActionImpl();
   }
   

   public static CartRemoveCustomLineItemActionImpl of(final CartRemoveCustomLineItemAction template) {
      CartRemoveCustomLineItemActionImpl instance = new CartRemoveCustomLineItemActionImpl();
      instance.setCustomLineItemId(template.getCustomLineItemId());
      return instance;
   }

}