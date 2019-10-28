package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetLineItemTaxRateActionImpl;

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