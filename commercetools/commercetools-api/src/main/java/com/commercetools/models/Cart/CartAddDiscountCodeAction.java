package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import java.lang.String;
import com.commercetools.models.cart.CartAddDiscountCodeActionImpl;

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
@JsonDeserialize(as = CartAddDiscountCodeActionImpl.class)
public interface CartAddDiscountCodeAction extends CartUpdateAction {

   
   @NotNull
   @JsonProperty("code")
   public String getCode();

   public void setCode(final String code);
   
   public static CartAddDiscountCodeActionImpl of(){
      return new CartAddDiscountCodeActionImpl();
   }
   

   public static CartAddDiscountCodeActionImpl of(final CartAddDiscountCodeAction template) {
      CartAddDiscountCodeActionImpl instance = new CartAddDiscountCodeActionImpl();
      instance.setCode(template.getCode());
      return instance;
   }

}