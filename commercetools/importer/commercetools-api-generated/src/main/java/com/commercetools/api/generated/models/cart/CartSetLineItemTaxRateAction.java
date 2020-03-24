package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import com.commercetools.api.generated.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.generated.models.cart.CartSetLineItemTaxRateActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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
@JsonDeserialize(as = CartSetLineItemTaxRateActionImpl.class)
public interface CartSetLineItemTaxRateAction extends CartUpdateAction {

   
   @NotNull
   @JsonProperty("lineItemId")
   public String getLineItemId();
   
   @Valid
   @JsonProperty("externalTaxRate")
   public ExternalTaxRateDraft getExternalTaxRate();

   public void setLineItemId(final String lineItemId);
   
   public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);
   
   public static CartSetLineItemTaxRateActionImpl of(){
      return new CartSetLineItemTaxRateActionImpl();
   }
   

   public static CartSetLineItemTaxRateActionImpl of(final CartSetLineItemTaxRateAction template) {
      CartSetLineItemTaxRateActionImpl instance = new CartSetLineItemTaxRateActionImpl();
      instance.setExternalTaxRate(template.getExternalTaxRate());
      instance.setLineItemId(template.getLineItemId());
      return instance;
   }

}