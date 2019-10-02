package com.commercetools.models.cart_discount;

import com.commercetools.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.models.cart_discount.CartDiscountChangeIsActiveActionImpl;

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
@JsonDeserialize(as = CartDiscountChangeIsActiveActionImpl.class)
public interface CartDiscountChangeIsActiveAction extends CartDiscountUpdateAction {

   
   @NotNull
   @JsonProperty("isActive")
   public Boolean getIsActive();

   public void setIsActive(final Boolean isActive);
   
   public static CartDiscountChangeIsActiveActionImpl of(){
      return new CartDiscountChangeIsActiveActionImpl();
   }
   

   public static CartDiscountChangeIsActiveActionImpl of(final CartDiscountChangeIsActiveAction template) {
      CartDiscountChangeIsActiveActionImpl instance = new CartDiscountChangeIsActiveActionImpl();
      instance.setIsActive(template.getIsActive());
      return instance;
   }

}