package com.commercetools.models.cart_discount;

import com.commercetools.models.cart_discount.CartDiscountTarget;
import com.commercetools.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.models.cart_discount.CartDiscountChangeTargetActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CartDiscountChangeTargetActionImpl.class)
public interface CartDiscountChangeTargetAction extends CartDiscountUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("target")
   public CartDiscountTarget getTarget();

   public void setTarget(final CartDiscountTarget target);
   
   public static CartDiscountChangeTargetActionImpl of(){
      return new CartDiscountChangeTargetActionImpl();
   }
   

   public static CartDiscountChangeTargetActionImpl of(final CartDiscountChangeTargetAction template) {
      CartDiscountChangeTargetActionImpl instance = new CartDiscountChangeTargetActionImpl();
      instance.setTarget(template.getTarget());
      return instance;
   }

}