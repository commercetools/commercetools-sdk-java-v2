package com.commercetools.models.order_edit;

import com.commercetools.models.cart.ExternalTaxRateDraft;
import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.order_edit.StagedOrderSetCustomLineItemTaxRateActionImpl;

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
@JsonDeserialize(as = StagedOrderSetCustomLineItemTaxRateActionImpl.class)
public interface StagedOrderSetCustomLineItemTaxRateAction extends StagedOrderUpdateAction {

   
   @NotNull
   @JsonProperty("customLineItemId")
   public String getCustomLineItemId();
   
   @Valid
   @JsonProperty("externalTaxRate")
   public ExternalTaxRateDraft getExternalTaxRate();

   public void setCustomLineItemId(final String customLineItemId);
   
   public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);
   
   public static StagedOrderSetCustomLineItemTaxRateActionImpl of(){
      return new StagedOrderSetCustomLineItemTaxRateActionImpl();
   }
   

   public static StagedOrderSetCustomLineItemTaxRateActionImpl of(final StagedOrderSetCustomLineItemTaxRateAction template) {
      StagedOrderSetCustomLineItemTaxRateActionImpl instance = new StagedOrderSetCustomLineItemTaxRateActionImpl();
      instance.setCustomLineItemId(template.getCustomLineItemId());
      instance.setExternalTaxRate(template.getExternalTaxRate());
      return instance;
   }

}