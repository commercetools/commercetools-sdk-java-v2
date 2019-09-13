package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.cart.ExternalTaxRateDraft;
import java.lang.String;
import com.commercetools.models.cart.CartSetShippingMethodTaxRateActionImpl;

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
@JsonDeserialize(as = CartSetShippingMethodTaxRateActionImpl.class)
public interface CartSetShippingMethodTaxRateAction extends CartUpdateAction {

   
   @Valid
   @JsonProperty("externalTaxRate")
   public ExternalTaxRateDraft getExternalTaxRate();

   public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);
   
   public static CartSetShippingMethodTaxRateActionImpl of(){
      return new CartSetShippingMethodTaxRateActionImpl();
   }
   

   public static CartSetShippingMethodTaxRateActionImpl of(final CartSetShippingMethodTaxRateAction template) {
      CartSetShippingMethodTaxRateActionImpl instance = new CartSetShippingMethodTaxRateActionImpl();
      instance.setExternalTaxRate(template.getExternalTaxRate());
      return instance;
   }

}