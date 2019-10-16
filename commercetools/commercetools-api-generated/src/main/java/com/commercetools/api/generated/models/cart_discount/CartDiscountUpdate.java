package com.commercetools.api.generated.models.cart_discount;

import com.commercetools.api.generated.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.api.generated.models.cart_discount.CartDiscountUpdateImpl;

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
@JsonDeserialize(as = CartDiscountUpdateImpl.class)
public interface CartDiscountUpdate  {

   
   @NotNull
   @JsonProperty("version")
   public Long getVersion();
   
   @NotNull
   @Valid
   @JsonProperty("actions")
   public List<CartDiscountUpdateAction> getActions();

   public void setVersion(final Long version);
   
   public void setActions(final List<CartDiscountUpdateAction> actions);
   
   public static CartDiscountUpdateImpl of(){
      return new CartDiscountUpdateImpl();
   }
   

   public static CartDiscountUpdateImpl of(final CartDiscountUpdate template) {
      CartDiscountUpdateImpl instance = new CartDiscountUpdateImpl();
      instance.setActions(template.getActions());
      instance.setVersion(template.getVersion());
      return instance;
   }

}