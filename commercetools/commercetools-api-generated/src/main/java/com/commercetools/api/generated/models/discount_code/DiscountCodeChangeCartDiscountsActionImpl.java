package com.commercetools.api.generated.models.discount_code;

import com.commercetools.api.generated.models.cart_discount.CartDiscountResourceIdentifier;
import com.commercetools.api.generated.models.discount_code.DiscountCodeUpdateAction;
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
public final class DiscountCodeChangeCartDiscountsActionImpl implements DiscountCodeChangeCartDiscountsAction {

   private String action;
   
   private java.util.List<com.commercetools.api.generated.models.cart_discount.CartDiscountResourceIdentifier> cartDiscounts;

   @JsonCreator
   DiscountCodeChangeCartDiscountsActionImpl(@JsonProperty("cartDiscounts") final java.util.List<com.commercetools.api.generated.models.cart_discount.CartDiscountResourceIdentifier> cartDiscounts) {
      this.cartDiscounts = cartDiscounts;
      this.action = "changeCartDiscounts";
   }
   public DiscountCodeChangeCartDiscountsActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.cart_discount.CartDiscountResourceIdentifier> getCartDiscounts(){
      return this.cartDiscounts;
   }

   public void setCartDiscounts(final java.util.List<com.commercetools.api.generated.models.cart_discount.CartDiscountResourceIdentifier> cartDiscounts){
      this.cartDiscounts = cartDiscounts;
   }

}