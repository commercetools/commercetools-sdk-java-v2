package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Common.Address;
import java.lang.String;
import com.commercetools.models.Cart.CartAddItemShippingAddressActionImpl;

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
@JsonDeserialize(as = CartAddItemShippingAddressActionImpl.class)
public interface CartAddItemShippingAddressAction extends CartUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("address")
   public Address getAddress();

   public void setAddress(final Address address);
   
   public static CartAddItemShippingAddressActionImpl of(){
      return new CartAddItemShippingAddressActionImpl();
   }
   

   public static CartAddItemShippingAddressActionImpl of(final CartAddItemShippingAddressAction template) {
      CartAddItemShippingAddressActionImpl instance = new CartAddItemShippingAddressActionImpl();
      instance.setAddress(template.getAddress());
      return instance;
   }

}