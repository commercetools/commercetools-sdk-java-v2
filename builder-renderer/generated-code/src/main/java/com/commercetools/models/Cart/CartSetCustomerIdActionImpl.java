package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import java.lang.String;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartSetCustomerIdActionImpl implements CartSetCustomerIdAction {

   private java.lang.String action;
   
   private java.lang.String customerId;

   @JsonCreator
   CartSetCustomerIdActionImpl(@JsonProperty("customerId") final java.lang.String customerId) {
      this.customerId = customerId;
      this.action = "setCustomerId";
   }
   public CartSetCustomerIdActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getCustomerId(){
      return this.customerId;
   }

   public void setCustomerId(final java.lang.String customerId){
      this.customerId = customerId;
   }

}