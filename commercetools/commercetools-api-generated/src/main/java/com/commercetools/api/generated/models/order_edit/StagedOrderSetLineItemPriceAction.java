package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetLineItemPriceActionImpl;

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
@JsonDeserialize(as = StagedOrderSetLineItemPriceActionImpl.class)
public interface StagedOrderSetLineItemPriceAction extends StagedOrderUpdateAction {

   
   @NotNull
   @JsonProperty("lineItemId")
   public String getLineItemId();
   
   @Valid
   @JsonProperty("externalPrice")
   public Money getExternalPrice();

   public void setLineItemId(final String lineItemId);
   
   public void setExternalPrice(final Money externalPrice);
   
   public static StagedOrderSetLineItemPriceActionImpl of(){
      return new StagedOrderSetLineItemPriceActionImpl();
   }
   

   public static StagedOrderSetLineItemPriceActionImpl of(final StagedOrderSetLineItemPriceAction template) {
      StagedOrderSetLineItemPriceActionImpl instance = new StagedOrderSetLineItemPriceActionImpl();
      instance.setLineItemId(template.getLineItemId());
      instance.setExternalPrice(template.getExternalPrice());
      return instance;
   }

}