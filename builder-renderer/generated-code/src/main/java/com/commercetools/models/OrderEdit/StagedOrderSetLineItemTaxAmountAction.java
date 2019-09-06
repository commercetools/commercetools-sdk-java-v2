package com.commercetools.models.OrderEdit;

import com.commercetools.models.Cart.ExternalTaxAmountDraft;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderSetLineItemTaxAmountActionImpl;

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
@JsonDeserialize(as = StagedOrderSetLineItemTaxAmountActionImpl.class)
public interface StagedOrderSetLineItemTaxAmountAction extends StagedOrderUpdateAction {

   
   @NotNull
   @JsonProperty("lineItemId")
   public String getLineItemId();
   
   @Valid
   @JsonProperty("externalTaxAmount")
   public ExternalTaxAmountDraft getExternalTaxAmount();

   public void setLineItemId(final String lineItemId);
   
   public void setExternalTaxAmount(final ExternalTaxAmountDraft externalTaxAmount);
   
   public static StagedOrderSetLineItemTaxAmountActionImpl of(){
      return new StagedOrderSetLineItemTaxAmountActionImpl();
   }
   

   public static StagedOrderSetLineItemTaxAmountActionImpl of(final StagedOrderSetLineItemTaxAmountAction template) {
      StagedOrderSetLineItemTaxAmountActionImpl instance = new StagedOrderSetLineItemTaxAmountActionImpl();
      instance.setLineItemId(template.getLineItemId());
      instance.setExternalTaxAmount(template.getExternalTaxAmount());
      return instance;
   }

}