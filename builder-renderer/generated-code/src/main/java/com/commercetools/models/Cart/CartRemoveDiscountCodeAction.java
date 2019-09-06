package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.DiscountCode.DiscountCodeReference;
import java.lang.String;
import com.commercetools.models.Cart.CartRemoveDiscountCodeActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CartRemoveDiscountCodeActionImpl.class)
public interface CartRemoveDiscountCodeAction extends CartUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("discountCode")
   public DiscountCodeReference getDiscountCode();

   public void setDiscountCode(final DiscountCodeReference discountCode);
   
   public static CartRemoveDiscountCodeActionImpl of(){
      return new CartRemoveDiscountCodeActionImpl();
   }
   

   public static CartRemoveDiscountCodeActionImpl of(final CartRemoveDiscountCodeAction template) {
      CartRemoveDiscountCodeActionImpl instance = new CartRemoveDiscountCodeActionImpl();
      instance.setDiscountCode(template.getDiscountCode());
      return instance;
   }

}