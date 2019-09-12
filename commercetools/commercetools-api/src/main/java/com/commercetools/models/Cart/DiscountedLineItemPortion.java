package com.commercetools.models.Cart;

import com.commercetools.models.CartDiscount.CartDiscountReference;
import com.commercetools.models.Common.Money;
import com.commercetools.models.Cart.DiscountedLineItemPortionImpl;

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
@JsonDeserialize(as = DiscountedLineItemPortionImpl.class)
public interface DiscountedLineItemPortion  {

   
   @NotNull
   @Valid
   @JsonProperty("discount")
   public CartDiscountReference getDiscount();
   
   @NotNull
   @Valid
   @JsonProperty("discountedAmount")
   public Money getDiscountedAmount();

   public void setDiscount(final CartDiscountReference discount);
   
   public void setDiscountedAmount(final Money discountedAmount);
   
   public static DiscountedLineItemPortionImpl of(){
      return new DiscountedLineItemPortionImpl();
   }
   

   public static DiscountedLineItemPortionImpl of(final DiscountedLineItemPortion template) {
      DiscountedLineItemPortionImpl instance = new DiscountedLineItemPortionImpl();
      instance.setDiscountedAmount(template.getDiscountedAmount());
      instance.setDiscount(template.getDiscount());
      return instance;
   }

}