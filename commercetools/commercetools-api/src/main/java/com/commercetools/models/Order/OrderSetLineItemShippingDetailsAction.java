package com.commercetools.models.order;

import com.commercetools.models.cart.ItemShippingDetailsDraft;
import com.commercetools.models.order.OrderUpdateAction;
import com.commercetools.models.order.OrderSetLineItemShippingDetailsActionImpl;

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
@JsonDeserialize(as = OrderSetLineItemShippingDetailsActionImpl.class)
public interface OrderSetLineItemShippingDetailsAction extends OrderUpdateAction {

   
   @NotNull
   @JsonProperty("lineItemId")
   public String getLineItemId();
   
   @Valid
   @JsonProperty("shippingDetails")
   public ItemShippingDetailsDraft getShippingDetails();

   public void setLineItemId(final String lineItemId);
   
   public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);
   
   public static OrderSetLineItemShippingDetailsActionImpl of(){
      return new OrderSetLineItemShippingDetailsActionImpl();
   }
   

   public static OrderSetLineItemShippingDetailsActionImpl of(final OrderSetLineItemShippingDetailsAction template) {
      OrderSetLineItemShippingDetailsActionImpl instance = new OrderSetLineItemShippingDetailsActionImpl();
      instance.setShippingDetails(template.getShippingDetails());
      instance.setLineItemId(template.getLineItemId());
      return instance;
   }

}