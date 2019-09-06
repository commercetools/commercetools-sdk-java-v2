package com.commercetools.models.OrderEdit;

import com.commercetools.models.Cart.ExternalTaxRateDraft;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderSetLineItemTaxRateActionImpl;

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
@JsonDeserialize(as = StagedOrderSetLineItemTaxRateActionImpl.class)
public interface StagedOrderSetLineItemTaxRateAction extends StagedOrderUpdateAction {

   
   @NotNull
   @JsonProperty("lineItemId")
   public String getLineItemId();
   
   @Valid
   @JsonProperty("externalTaxRate")
   public ExternalTaxRateDraft getExternalTaxRate();

   public void setLineItemId(final String lineItemId);
   
   public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);
   
   public static StagedOrderSetLineItemTaxRateActionImpl of(){
      return new StagedOrderSetLineItemTaxRateActionImpl();
   }
   

   public static StagedOrderSetLineItemTaxRateActionImpl of(final StagedOrderSetLineItemTaxRateAction template) {
      StagedOrderSetLineItemTaxRateActionImpl instance = new StagedOrderSetLineItemTaxRateActionImpl();
      instance.setExternalTaxRate(template.getExternalTaxRate());
      instance.setLineItemId(template.getLineItemId());
      return instance;
   }

}