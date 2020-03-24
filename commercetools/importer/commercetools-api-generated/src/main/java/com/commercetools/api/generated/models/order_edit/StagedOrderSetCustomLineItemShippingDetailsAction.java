package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetCustomLineItemShippingDetailsActionImpl;

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
@JsonDeserialize(as = StagedOrderSetCustomLineItemShippingDetailsActionImpl.class)
public interface StagedOrderSetCustomLineItemShippingDetailsAction extends StagedOrderUpdateAction {

   
   @NotNull
   @JsonProperty("customLineItemId")
   public String getCustomLineItemId();
   
   @Valid
   @JsonProperty("shippingDetails")
   public ItemShippingDetailsDraft getShippingDetails();

   public void setCustomLineItemId(final String customLineItemId);
   
   public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);
   
   public static StagedOrderSetCustomLineItemShippingDetailsActionImpl of(){
      return new StagedOrderSetCustomLineItemShippingDetailsActionImpl();
   }
   

   public static StagedOrderSetCustomLineItemShippingDetailsActionImpl of(final StagedOrderSetCustomLineItemShippingDetailsAction template) {
      StagedOrderSetCustomLineItemShippingDetailsActionImpl instance = new StagedOrderSetCustomLineItemShippingDetailsActionImpl();
      instance.setCustomLineItemId(template.getCustomLineItemId());
      instance.setShippingDetails(template.getShippingDetails());
      return instance;
   }

}