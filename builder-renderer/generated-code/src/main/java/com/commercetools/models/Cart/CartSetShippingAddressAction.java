package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Common.Address;
import java.lang.String;
import com.commercetools.models.Cart.CartSetShippingAddressActionImpl;

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
@JsonDeserialize(as = CartSetShippingAddressActionImpl.class)
public interface CartSetShippingAddressAction extends CartUpdateAction {

   
   @Valid
   @JsonProperty("address")
   public Address getAddress();

   public void setAddress(final Address address);
   
   public static CartSetShippingAddressActionImpl of(){
      return new CartSetShippingAddressActionImpl();
   }
   

   public static CartSetShippingAddressActionImpl of(final CartSetShippingAddressAction template) {
      CartSetShippingAddressActionImpl instance = new CartSetShippingAddressActionImpl();
      instance.setAddress(template.getAddress());
      return instance;
   }

}