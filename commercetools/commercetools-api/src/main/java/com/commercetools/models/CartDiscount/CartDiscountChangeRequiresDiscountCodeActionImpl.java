package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountUpdateAction;
import java.lang.Boolean;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartDiscountChangeRequiresDiscountCodeActionImpl implements CartDiscountChangeRequiresDiscountCodeAction {

   private java.lang.String action;
   
   private java.lang.Boolean requiresDiscountCode;

   @JsonCreator
   CartDiscountChangeRequiresDiscountCodeActionImpl(@JsonProperty("requiresDiscountCode") final java.lang.Boolean requiresDiscountCode) {
      this.requiresDiscountCode = requiresDiscountCode;
      this.action = "changeRequiresDiscountCode";
   }
   public CartDiscountChangeRequiresDiscountCodeActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.Boolean getRequiresDiscountCode(){
      return this.requiresDiscountCode;
   }

   public void setRequiresDiscountCode(final java.lang.Boolean requiresDiscountCode){
      this.requiresDiscountCode = requiresDiscountCode;
   }

}