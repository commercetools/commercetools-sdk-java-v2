package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountUpdateAction;
import com.commercetools.models.CartDiscount.StackingMode;
import java.lang.String;
import com.commercetools.models.CartDiscount.CartDiscountChangeStackingModeActionImpl;

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
@JsonDeserialize(as = CartDiscountChangeStackingModeActionImpl.class)
public interface CartDiscountChangeStackingModeAction extends CartDiscountUpdateAction {

   
   @NotNull
   @JsonProperty("stackingMode")
   public StackingMode getStackingMode();

   public void setStackingMode(final StackingMode stackingMode);
   
   public static CartDiscountChangeStackingModeActionImpl of(){
      return new CartDiscountChangeStackingModeActionImpl();
   }
   

   public static CartDiscountChangeStackingModeActionImpl of(final CartDiscountChangeStackingModeAction template) {
      CartDiscountChangeStackingModeActionImpl instance = new CartDiscountChangeStackingModeActionImpl();
      instance.setStackingMode(template.getStackingMode());
      return instance;
   }

}