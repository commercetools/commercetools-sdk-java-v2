package com.commercetools.api.generated.models.cart_discount;

import com.commercetools.api.generated.models.cart_discount.CartDiscountUpdateAction;
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

   private String action;
   
   private Boolean requiresDiscountCode;

   @JsonCreator
   CartDiscountChangeRequiresDiscountCodeActionImpl(@JsonProperty("requiresDiscountCode") final Boolean requiresDiscountCode) {
      this.requiresDiscountCode = requiresDiscountCode;
      this.action = "changeRequiresDiscountCode";
   }
   public CartDiscountChangeRequiresDiscountCodeActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public Boolean getRequiresDiscountCode(){
      return this.requiresDiscountCode;
   }

   public void setRequiresDiscountCode(final Boolean requiresDiscountCode){
      this.requiresDiscountCode = requiresDiscountCode;
   }

}