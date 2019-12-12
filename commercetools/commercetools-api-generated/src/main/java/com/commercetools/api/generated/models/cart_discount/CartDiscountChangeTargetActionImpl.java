package com.commercetools.api.generated.models.cart_discount;

import com.commercetools.api.generated.models.cart_discount.CartDiscountTarget;
import com.commercetools.api.generated.models.cart_discount.CartDiscountUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartDiscountChangeTargetActionImpl implements CartDiscountChangeTargetAction {

   private String action;
   
   private com.commercetools.api.generated.models.cart_discount.CartDiscountTarget target;

   @JsonCreator
   CartDiscountChangeTargetActionImpl(@JsonProperty("target") final com.commercetools.api.generated.models.cart_discount.CartDiscountTarget target) {
      this.target = target;
      this.action = "changeTarget";
   }
   public CartDiscountChangeTargetActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.api.generated.models.cart_discount.CartDiscountTarget getTarget(){
      return this.target;
   }

   public void setTarget(final com.commercetools.api.generated.models.cart_discount.CartDiscountTarget target){
      this.target = target;
   }

}