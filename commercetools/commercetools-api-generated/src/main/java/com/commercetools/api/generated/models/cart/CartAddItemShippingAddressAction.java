package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.cart.CartAddItemShippingAddressActionImpl;

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