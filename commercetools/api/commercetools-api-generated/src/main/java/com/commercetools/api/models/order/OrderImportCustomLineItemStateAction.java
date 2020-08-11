package com.commercetools.api.models.order;

import com.commercetools.api.models.order.ItemState;
import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.OrderImportCustomLineItemStateActionImpl;

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
@JsonDeserialize(as = OrderImportCustomLineItemStateActionImpl.class)
public interface OrderImportCustomLineItemStateAction extends OrderUpdateAction {


   @NotNull
   @JsonProperty("customLineItemId")
   public String getCustomLineItemId();

   @NotNull
   @Valid
   @JsonProperty("state")
   public List<ItemState> getState();

   public void setCustomLineItemId(final String customLineItemId);

   public void setState(final List<ItemState> state);

   public static OrderImportCustomLineItemStateActionImpl of(){
      return new OrderImportCustomLineItemStateActionImpl();
   }


   public static OrderImportCustomLineItemStateActionImpl of(final OrderImportCustomLineItemStateAction template) {
      OrderImportCustomLineItemStateActionImpl instance = new OrderImportCustomLineItemStateActionImpl();
      instance.setCustomLineItemId(template.getCustomLineItemId());
      instance.setState(template.getState());
      return instance;
   }

}
