package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Cart.RoundingMode;
import java.lang.String;
import com.commercetools.models.Cart.CartChangeTaxRoundingModeActionImpl;

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
@JsonDeserialize(as = CartChangeTaxRoundingModeActionImpl.class)
public interface CartChangeTaxRoundingModeAction extends CartUpdateAction {

   
   @NotNull
   @JsonProperty("taxRoundingMode")
   public RoundingMode getTaxRoundingMode();

   public void setTaxRoundingMode(final RoundingMode taxRoundingMode);
   
   public static CartChangeTaxRoundingModeActionImpl of(){
      return new CartChangeTaxRoundingModeActionImpl();
   }
   

   public static CartChangeTaxRoundingModeActionImpl of(final CartChangeTaxRoundingModeAction template) {
      CartChangeTaxRoundingModeActionImpl instance = new CartChangeTaxRoundingModeActionImpl();
      instance.setTaxRoundingMode(template.getTaxRoundingMode());
      return instance;
   }

}