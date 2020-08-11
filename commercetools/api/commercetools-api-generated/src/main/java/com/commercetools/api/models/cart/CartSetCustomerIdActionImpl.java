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
public final class CartSetCustomerIdActionImpl implements CartSetCustomerIdAction {

   private String action;

   private String customerId;

   @JsonCreator
   CartSetCustomerIdActionImpl(@JsonProperty("customerId") final String customerId) {
      this.customerId = customerId;
      this.action = "setCustomerId";
   }
   public CartSetCustomerIdActionImpl() {

   }


   public String getAction(){
      return this.action;
   }

   /**
   *  <p>If set, a customer with the given ID must exist in the project.</p>
   */
   public String getCustomerId(){
      return this.customerId;
   }

   public void setCustomerId(final String customerId){
      this.customerId = customerId;
   }

}
