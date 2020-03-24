package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import com.commercetools.api.generated.models.cart.CartSetCustomerIdActionImpl;

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
@JsonDeserialize(as = CartSetCustomerIdActionImpl.class)
public interface CartSetCustomerIdAction extends CartUpdateAction {

   /**
   *  <p>If set, a customer with the given ID must exist in the project.</p>
   */
   
   @JsonProperty("customerId")
   public String getCustomerId();

   public void setCustomerId(final String customerId);
   
   public static CartSetCustomerIdActionImpl of(){
      return new CartSetCustomerIdActionImpl();
   }
   

   public static CartSetCustomerIdActionImpl of(final CartSetCustomerIdAction template) {
      CartSetCustomerIdActionImpl instance = new CartSetCustomerIdActionImpl();
      instance.setCustomerId(template.getCustomerId());
      return instance;
   }

}