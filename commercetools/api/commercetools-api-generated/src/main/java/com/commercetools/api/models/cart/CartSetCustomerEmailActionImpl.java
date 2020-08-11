package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartSetCustomerEmailActionImpl implements CartSetCustomerEmailAction {

   private String action;

   private String email;

   @JsonCreator
   CartSetCustomerEmailActionImpl(@JsonProperty("email") final String email) {
      this.email = email;
      this.action = "setCustomerEmail";
   }
   public CartSetCustomerEmailActionImpl() {

   }


   public String getAction(){
      return this.action;
   }


   public String getEmail(){
      return this.email;
   }

   public void setEmail(final String email){
      this.email = email;
   }

}
