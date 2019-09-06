package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Cart.TaxMode;
import java.lang.String;
import com.commercetools.models.Cart.CartChangeTaxModeActionImpl;

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
@JsonDeserialize(as = CartChangeTaxModeActionImpl.class)
public interface CartChangeTaxModeAction extends CartUpdateAction {

   
   @NotNull
   @JsonProperty("taxMode")
   public TaxMode getTaxMode();

   public void setTaxMode(final TaxMode taxMode);
   
   public static CartChangeTaxModeActionImpl of(){
      return new CartChangeTaxModeActionImpl();
   }
   

   public static CartChangeTaxModeActionImpl of(final CartChangeTaxModeAction template) {
      CartChangeTaxModeActionImpl instance = new CartChangeTaxModeActionImpl();
      instance.setTaxMode(template.getTaxMode());
      return instance;
   }

}