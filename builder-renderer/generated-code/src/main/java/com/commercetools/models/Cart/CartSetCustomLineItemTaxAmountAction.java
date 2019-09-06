package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Cart.ExternalTaxAmountDraft;
import java.lang.String;
import com.commercetools.models.Cart.CartSetCustomLineItemTaxAmountActionImpl;

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
@JsonDeserialize(as = CartSetCustomLineItemTaxAmountActionImpl.class)
public interface CartSetCustomLineItemTaxAmountAction extends CartUpdateAction {

   
   @NotNull
   @JsonProperty("customLineItemId")
   public String getCustomLineItemId();
   
   @Valid
   @JsonProperty("externalTaxAmount")
   public ExternalTaxAmountDraft getExternalTaxAmount();

   public void setCustomLineItemId(final String customLineItemId);
   
   public void setExternalTaxAmount(final ExternalTaxAmountDraft externalTaxAmount);
   
   public static CartSetCustomLineItemTaxAmountActionImpl of(){
      return new CartSetCustomLineItemTaxAmountActionImpl();
   }
   

   public static CartSetCustomLineItemTaxAmountActionImpl of(final CartSetCustomLineItemTaxAmountAction template) {
      CartSetCustomLineItemTaxAmountActionImpl instance = new CartSetCustomLineItemTaxAmountActionImpl();
      instance.setCustomLineItemId(template.getCustomLineItemId());
      instance.setExternalTaxAmount(template.getExternalTaxAmount());
      return instance;
   }

}