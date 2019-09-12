package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import java.lang.String;
import com.commercetools.models.Cart.CartSetCustomerEmailActionImpl;

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
@JsonDeserialize(as = CartSetCustomerEmailActionImpl.class)
public interface CartSetCustomerEmailAction extends CartUpdateAction {

   
   @NotNull
   @JsonProperty("email")
   public String getEmail();

   public void setEmail(final String email);
   
   public static CartSetCustomerEmailActionImpl of(){
      return new CartSetCustomerEmailActionImpl();
   }
   

   public static CartSetCustomerEmailActionImpl of(final CartSetCustomerEmailAction template) {
      CartSetCustomerEmailActionImpl instance = new CartSetCustomerEmailActionImpl();
      instance.setEmail(template.getEmail());
      return instance;
   }

}