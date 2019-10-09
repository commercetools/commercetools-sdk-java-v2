package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.common.Address;
import com.commercetools.models.cart.CartUpdateItemShippingAddressActionImpl;

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
@JsonDeserialize(as = CartUpdateItemShippingAddressActionImpl.class)
public interface CartUpdateItemShippingAddressAction extends CartUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("address")
   public Address getAddress();

   public void setAddress(final Address address);
   
   public static CartUpdateItemShippingAddressActionImpl of(){
      return new CartUpdateItemShippingAddressActionImpl();
   }
   

   public static CartUpdateItemShippingAddressActionImpl of(final CartUpdateItemShippingAddressAction template) {
      CartUpdateItemShippingAddressActionImpl instance = new CartUpdateItemShippingAddressActionImpl();
      instance.setAddress(template.getAddress());
      return instance;
   }

}