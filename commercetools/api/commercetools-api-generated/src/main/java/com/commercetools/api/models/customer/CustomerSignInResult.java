package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.Customer;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.customer.CustomerSignInResultImpl;

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
@JsonDeserialize(as = CustomerSignInResultImpl.class)
public interface CustomerSignInResult  {

   
   @NotNull
   @Valid
   @JsonProperty("customer")
   public Customer getCustomer();
   /**
   *  <p>A cart that is associated to the customer.
   *  Empty if the customer does not have a cart yet.</p>
   */
   @Valid
   @JsonProperty("cart")
   public JsonNode getCart();

   public void setCustomer(final Customer customer);
   
   public void setCart(final JsonNode cart);
   
   public static CustomerSignInResultImpl of(){
      return new CustomerSignInResultImpl();
   }
   

   public static CustomerSignInResultImpl of(final CustomerSignInResult template) {
      CustomerSignInResultImpl instance = new CustomerSignInResultImpl();
      instance.setCustomer(template.getCustomer());
      instance.setCart(template.getCart());
      return instance;
   }

}
