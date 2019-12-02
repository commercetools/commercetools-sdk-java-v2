package com.commercetools.api.generated.models.customer;

import com.commercetools.api.generated.models.customer.Customer;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerSignInResultImpl implements CustomerSignInResult {

   private Object cart;
   
   private com.commercetools.api.generated.models.customer.Customer customer;

   @JsonCreator
   CustomerSignInResultImpl(@JsonProperty("cart") final Object cart, @JsonProperty("customer") final com.commercetools.api.generated.models.customer.Customer customer) {
      this.cart = cart;
      this.customer = customer;
   }
   public CustomerSignInResultImpl() {
      
   }
   
   /**
   *  <p>A cart that is associated to the customer.
   *  Empty if the customer does not have a cart yet.</p>
   */
   public Object getCart(){
      return this.cart;
   }
   
   
   public com.commercetools.api.generated.models.customer.Customer getCustomer(){
      return this.customer;
   }

   public void setCart(final Object cart){
      this.cart = cart;
   }
   
   public void setCustomer(final com.commercetools.api.generated.models.customer.Customer customer){
      this.customer = customer;
   }

}