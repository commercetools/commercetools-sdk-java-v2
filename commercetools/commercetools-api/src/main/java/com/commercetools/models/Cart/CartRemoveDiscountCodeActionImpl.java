package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.DiscountCode.DiscountCodeReference;
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
public final class CartRemoveDiscountCodeActionImpl implements CartRemoveDiscountCodeAction {

   private java.lang.String action;
   
   private com.commercetools.models.DiscountCode.DiscountCodeReference discountCode;

   @JsonCreator
   CartRemoveDiscountCodeActionImpl(@JsonProperty("discountCode") final com.commercetools.models.DiscountCode.DiscountCodeReference discountCode) {
      this.discountCode = discountCode;
      this.action = "removeDiscountCode";
   }
   public CartRemoveDiscountCodeActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.DiscountCode.DiscountCodeReference getDiscountCode(){
      return this.discountCode;
   }

   public void setDiscountCode(final com.commercetools.models.DiscountCode.DiscountCodeReference discountCode){
      this.discountCode = discountCode;
   }

}