package com.commercetools.models.Order;

import com.commercetools.models.Order.ItemState;
import com.commercetools.models.Order.OrderUpdateAction;
import java.lang.String;
import com.commercetools.models.Order.OrderImportCustomLineItemStateActionImpl;

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