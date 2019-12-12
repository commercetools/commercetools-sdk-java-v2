package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import com.commercetools.api.generated.models.discount_code.DiscountCodeReference;
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
public final class CartRemoveDiscountCodeActionImpl implements CartRemoveDiscountCodeAction {

   private String action;
   
   private com.commercetools.api.generated.models.discount_code.DiscountCodeReference discountCode;

   @JsonCreator
   CartRemoveDiscountCodeActionImpl(@JsonProperty("discountCode") final com.commercetools.api.generated.models.discount_code.DiscountCodeReference discountCode) {
      this.discountCode = discountCode;
      this.action = "removeDiscountCode";
   }
   public CartRemoveDiscountCodeActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.api.generated.models.discount_code.DiscountCodeReference getDiscountCode(){
      return this.discountCode;
   }

   public void setDiscountCode(final com.commercetools.api.generated.models.discount_code.DiscountCodeReference discountCode){
      this.discountCode = discountCode;
   }

}