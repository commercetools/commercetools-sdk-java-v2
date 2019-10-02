package com.commercetools.models.order_edit;

import com.commercetools.models.cart.ItemShippingDetailsDraft;
import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.order_edit.StagedOrderSetLineItemShippingDetailsActionImpl;

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
@JsonDeserialize(as = StagedOrderSetLineItemShippingDetailsActionImpl.class)
public interface StagedOrderSetLineItemShippingDetailsAction extends StagedOrderUpdateAction {

   
   @NotNull
   @JsonProperty("lineItemId")
   public String getLineItemId();
   
   @Valid
   @JsonProperty("shippingDetails")
   public ItemShippingDetailsDraft getShippingDetails();

   public void setLineItemId(final String lineItemId);
   
   public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);
   
   public static StagedOrderSetLineItemShippingDetailsActionImpl of(){
      return new StagedOrderSetLineItemShippingDetailsActionImpl();
   }
   

   public static StagedOrderSetLineItemShippingDetailsActionImpl of(final StagedOrderSetLineItemShippingDetailsAction template) {
      StagedOrderSetLineItemShippingDetailsActionImpl instance = new StagedOrderSetLineItemShippingDetailsActionImpl();
      instance.setShippingDetails(template.getShippingDetails());
      instance.setLineItemId(template.getLineItemId());
      return instance;
   }

}