package com.commercetools.models.DiscountCode;

import com.commercetools.models.CartDiscount.CartDiscountResourceIdentifier;
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
public final class DiscountCodeChangeCartDiscountsActionImpl implements DiscountCodeChangeCartDiscountsAction {

   private java.lang.String action;
   
   private java.util.List<com.commercetools.models.CartDiscount.CartDiscountResourceIdentifier> cartDiscounts;

   @JsonCreator
   DiscountCodeChangeCartDiscountsActionImpl(@JsonProperty("cartDiscounts") final java.util.List<com.commercetools.models.CartDiscount.CartDiscountResourceIdentifier> cartDiscounts) {
      this.cartDiscounts = cartDiscounts;
      this.action = "changeCartDiscounts";
   }
   public DiscountCodeChangeCartDiscountsActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.util.List<com.commercetools.models.CartDiscount.CartDiscountResourceIdentifier> getCartDiscounts(){
      return this.cartDiscounts;
   }

   public void setCartDiscounts(final java.util.List<com.commercetools.models.CartDiscount.CartDiscountResourceIdentifier> cartDiscounts){
      this.cartDiscounts = cartDiscounts;
   }

}