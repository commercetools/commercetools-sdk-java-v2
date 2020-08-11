package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.CartRemoveItemShippingAddressActionImpl;

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
@JsonDeserialize(as = CartRemoveItemShippingAddressActionImpl.class)
public interface CartRemoveItemShippingAddressAction extends CartUpdateAction {


   @NotNull
   @JsonProperty("addressKey")
   public String getAddressKey();

   public void setAddressKey(final String addressKey);

   public static CartRemoveItemShippingAddressActionImpl of(){
      return new CartRemoveItemShippingAddressActionImpl();
   }


   public static CartRemoveItemShippingAddressActionImpl of(final CartRemoveItemShippingAddressAction template) {
      CartRemoveItemShippingAddressActionImpl instance = new CartRemoveItemShippingAddressActionImpl();
      instance.setAddressKey(template.getAddressKey());
      return instance;
   }

}
