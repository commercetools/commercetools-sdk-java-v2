package com.commercetools.models.cart_discount;

import com.commercetools.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.models.cart_discount.CartDiscountChangeCartPredicateActionImpl;

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
@JsonDeserialize(as = CartDiscountChangeCartPredicateActionImpl.class)
public interface CartDiscountChangeCartPredicateAction extends CartDiscountUpdateAction {

   
   @NotNull
   @JsonProperty("cartPredicate")
   public String getCartPredicate();

   public void setCartPredicate(final String cartPredicate);
   
   public static CartDiscountChangeCartPredicateActionImpl of(){
      return new CartDiscountChangeCartPredicateActionImpl();
   }
   

   public static CartDiscountChangeCartPredicateActionImpl of(final CartDiscountChangeCartPredicateAction template) {
      CartDiscountChangeCartPredicateActionImpl instance = new CartDiscountChangeCartPredicateActionImpl();
      instance.setCartPredicate(template.getCartPredicate());
      return instance;
   }

}