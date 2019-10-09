package com.commercetools.models.cart_discount;

import com.commercetools.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.models.cart_discount.CartDiscountChangeRequiresDiscountCodeActionImpl;

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
@JsonDeserialize(as = CartDiscountChangeRequiresDiscountCodeActionImpl.class)
public interface CartDiscountChangeRequiresDiscountCodeAction extends CartDiscountUpdateAction {

   
   @NotNull
   @JsonProperty("requiresDiscountCode")
   public Boolean getRequiresDiscountCode();

   public void setRequiresDiscountCode(final Boolean requiresDiscountCode);
   
   public static CartDiscountChangeRequiresDiscountCodeActionImpl of(){
      return new CartDiscountChangeRequiresDiscountCodeActionImpl();
   }
   

   public static CartDiscountChangeRequiresDiscountCodeActionImpl of(final CartDiscountChangeRequiresDiscountCodeAction template) {
      CartDiscountChangeRequiresDiscountCodeActionImpl instance = new CartDiscountChangeRequiresDiscountCodeActionImpl();
      instance.setRequiresDiscountCode(template.getRequiresDiscountCode());
      return instance;
   }

}