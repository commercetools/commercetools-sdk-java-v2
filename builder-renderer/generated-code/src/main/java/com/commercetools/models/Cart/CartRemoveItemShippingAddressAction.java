package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import java.lang.String;
import com.commercetools.models.Cart.CartRemoveItemShippingAddressActionImpl;

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