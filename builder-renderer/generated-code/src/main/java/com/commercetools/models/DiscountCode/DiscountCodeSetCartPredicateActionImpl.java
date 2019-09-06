package com.commercetools.models.DiscountCode;

import com.commercetools.models.DiscountCode.DiscountCodeUpdateAction;
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
public final class DiscountCodeSetCartPredicateActionImpl implements DiscountCodeSetCartPredicateAction {

   private java.lang.String action;
   
   private java.lang.String cartPredicate;

   @JsonCreator
   DiscountCodeSetCartPredicateActionImpl(@JsonProperty("cartPredicate") final java.lang.String cartPredicate) {
      this.cartPredicate = cartPredicate;
      this.action = "setCartPredicate";
   }
   public DiscountCodeSetCartPredicateActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getCartPredicate(){
      return this.cartPredicate;
   }

   public void setCartPredicate(final java.lang.String cartPredicate){
      this.cartPredicate = cartPredicate;
   }

}