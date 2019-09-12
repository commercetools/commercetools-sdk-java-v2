package com.commercetools.models.OrderEdit;

import com.commercetools.models.Cart.ShippingRateInputDraft;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderSetShippingRateInputActionImpl;

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
@JsonDeserialize(as = StagedOrderSetShippingRateInputActionImpl.class)
public interface StagedOrderSetShippingRateInputAction extends StagedOrderUpdateAction {

   
   @Valid
   @JsonProperty("shippingRateInput")
   public ShippingRateInputDraft getShippingRateInput();

   public void setShippingRateInput(final ShippingRateInputDraft shippingRateInput);
   
   public static StagedOrderSetShippingRateInputActionImpl of(){
      return new StagedOrderSetShippingRateInputActionImpl();
   }
   

   public static StagedOrderSetShippingRateInputActionImpl of(final StagedOrderSetShippingRateInputAction template) {
      StagedOrderSetShippingRateInputActionImpl instance = new StagedOrderSetShippingRateInputActionImpl();
      instance.setShippingRateInput(template.getShippingRateInput());
      return instance;
   }

}