package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Common.Address;
import java.lang.String;
import com.commercetools.models.Cart.CartSetBillingAddressActionImpl;

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
@JsonDeserialize(as = CartSetBillingAddressActionImpl.class)
public interface CartSetBillingAddressAction extends CartUpdateAction {

   
   @Valid
   @JsonProperty("address")
   public Address getAddress();

   public void setAddress(final Address address);
   
   public static CartSetBillingAddressActionImpl of(){
      return new CartSetBillingAddressActionImpl();
   }
   

   public static CartSetBillingAddressActionImpl of(final CartSetBillingAddressAction template) {
      CartSetBillingAddressActionImpl instance = new CartSetBillingAddressActionImpl();
      instance.setAddress(template.getAddress());
      return instance;
   }

}