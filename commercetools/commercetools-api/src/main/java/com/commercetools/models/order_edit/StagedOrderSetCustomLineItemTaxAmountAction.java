package com.commercetools.models.order_edit;

import com.commercetools.models.cart.ExternalTaxAmountDraft;
import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.order_edit.StagedOrderSetCustomLineItemTaxAmountActionImpl;

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
@JsonDeserialize(as = StagedOrderSetCustomLineItemTaxAmountActionImpl.class)
public interface StagedOrderSetCustomLineItemTaxAmountAction extends StagedOrderUpdateAction {

   
   @NotNull
   @JsonProperty("customLineItemId")
   public String getCustomLineItemId();
   
   @Valid
   @JsonProperty("externalTaxAmount")
   public ExternalTaxAmountDraft getExternalTaxAmount();

   public void setCustomLineItemId(final String customLineItemId);
   
   public void setExternalTaxAmount(final ExternalTaxAmountDraft externalTaxAmount);
   
   public static StagedOrderSetCustomLineItemTaxAmountActionImpl of(){
      return new StagedOrderSetCustomLineItemTaxAmountActionImpl();
   }
   

   public static StagedOrderSetCustomLineItemTaxAmountActionImpl of(final StagedOrderSetCustomLineItemTaxAmountAction template) {
      StagedOrderSetCustomLineItemTaxAmountActionImpl instance = new StagedOrderSetCustomLineItemTaxAmountActionImpl();
      instance.setCustomLineItemId(template.getCustomLineItemId());
      instance.setExternalTaxAmount(template.getExternalTaxAmount());
      return instance;
   }

}