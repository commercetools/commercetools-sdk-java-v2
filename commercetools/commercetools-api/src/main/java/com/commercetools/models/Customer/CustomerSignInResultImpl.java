package com.commercetools.models.customer;

import com.commercetools.models.customer.Customer;
import javax.annotation.Generated;
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
   
   private com.commercetools.models.customer.Customer customer;

   @JsonCreator
   CustomerSignInResultImpl(@JsonProperty("cart") final Object cart, @JsonProperty("customer") final com.commercetools.models.customer.Customer customer) {
      this.cart = cart;
      this.customer = customer;
   }
   public CustomerSignInResultImpl() {
      
   }
   
   
   public Object getCart(){
      return this.cart;
   }
   
   
   public com.commercetools.models.customer.Customer getCustomer(){
      return this.customer;
   }

   public void setCart(final Object cart){
      this.cart = cart;
   }
   
   public void setCustomer(final com.commercetools.models.customer.Customer customer){
      this.customer = customer;
   }

}