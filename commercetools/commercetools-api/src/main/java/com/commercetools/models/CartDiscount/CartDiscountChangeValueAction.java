package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountUpdateAction;
import com.commercetools.models.CartDiscount.CartDiscountValue;
import java.lang.String;
import com.commercetools.models.CartDiscount.CartDiscountChangeValueActionImpl;

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
@JsonDeserialize(as = CartDiscountChangeValueActionImpl.class)
public interface CartDiscountChangeValueAction extends CartDiscountUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("value")
   public CartDiscountValue getValue();

   public void setValue(final CartDiscountValue value);
   
   public static CartDiscountChangeValueActionImpl of(){
      return new CartDiscountChangeValueActionImpl();
   }
   

   public static CartDiscountChangeValueActionImpl of(final CartDiscountChangeValueAction template) {
      CartDiscountChangeValueActionImpl instance = new CartDiscountChangeValueActionImpl();
      instance.setValue(template.getValue());
      return instance;
   }

}