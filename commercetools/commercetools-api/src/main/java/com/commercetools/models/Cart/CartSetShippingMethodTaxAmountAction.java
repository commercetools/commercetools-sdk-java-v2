package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Cart.ExternalTaxAmountDraft;
import java.lang.String;
import com.commercetools.models.Cart.CartSetShippingMethodTaxAmountActionImpl;

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
@JsonDeserialize(as = CartSetShippingMethodTaxAmountActionImpl.class)
public interface CartSetShippingMethodTaxAmountAction extends CartUpdateAction {

   
   @Valid
   @JsonProperty("externalTaxAmount")
   public ExternalTaxAmountDraft getExternalTaxAmount();

   public void setExternalTaxAmount(final ExternalTaxAmountDraft externalTaxAmount);
   
   public static CartSetShippingMethodTaxAmountActionImpl of(){
      return new CartSetShippingMethodTaxAmountActionImpl();
   }
   

   public static CartSetShippingMethodTaxAmountActionImpl of(final CartSetShippingMethodTaxAmountAction template) {
      CartSetShippingMethodTaxAmountActionImpl instance = new CartSetShippingMethodTaxAmountActionImpl();
      instance.setExternalTaxAmount(template.getExternalTaxAmount());
      return instance;
   }

}