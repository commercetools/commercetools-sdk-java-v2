package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Cart.TaxCalculationMode;
import java.lang.String;
import com.commercetools.models.Cart.CartChangeTaxCalculationModeActionImpl;

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
@JsonDeserialize(as = CartChangeTaxCalculationModeActionImpl.class)
public interface CartChangeTaxCalculationModeAction extends CartUpdateAction {

   
   @NotNull
   @JsonProperty("taxCalculationMode")
   public TaxCalculationMode getTaxCalculationMode();

   public void setTaxCalculationMode(final TaxCalculationMode taxCalculationMode);
   
   public static CartChangeTaxCalculationModeActionImpl of(){
      return new CartChangeTaxCalculationModeActionImpl();
   }
   

   public static CartChangeTaxCalculationModeActionImpl of(final CartChangeTaxCalculationModeAction template) {
      CartChangeTaxCalculationModeActionImpl instance = new CartChangeTaxCalculationModeActionImpl();
      instance.setTaxCalculationMode(template.getTaxCalculationMode());
      return instance;
   }

}