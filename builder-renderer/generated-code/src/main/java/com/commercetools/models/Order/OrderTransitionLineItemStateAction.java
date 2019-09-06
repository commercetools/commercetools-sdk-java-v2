package com.commercetools.models.Order;

import com.commercetools.models.Order.OrderUpdateAction;
import com.commercetools.models.State.StateResourceIdentifier;
import java.lang.Long;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.Order.OrderTransitionLineItemStateActionImpl;

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
@JsonDeserialize(as = OrderTransitionLineItemStateActionImpl.class)
public interface OrderTransitionLineItemStateAction extends OrderUpdateAction {

   
   @NotNull
   @JsonProperty("lineItemId")
   public String getLineItemId();
   
   @NotNull
   @JsonProperty("quantity")
   public Long getQuantity();
   
   @NotNull
   @Valid
   @JsonProperty("fromState")
   public StateResourceIdentifier getFromState();
   
   @NotNull
   @Valid
   @JsonProperty("toState")
   public StateResourceIdentifier getToState();
   
   
   @JsonProperty("actualTransitionDate")
   public ZonedDateTime getActualTransitionDate();

   public void setLineItemId(final String lineItemId);
   
   public void setQuantity(final Long quantity);
   
   public void setFromState(final StateResourceIdentifier fromState);
   
   public void setToState(final StateResourceIdentifier toState);
   
   public void setActualTransitionDate(final ZonedDateTime actualTransitionDate);
   
   public static OrderTransitionLineItemStateActionImpl of(){
      return new OrderTransitionLineItemStateActionImpl();
   }
   

   public static OrderTransitionLineItemStateActionImpl of(final OrderTransitionLineItemStateAction template) {
      OrderTransitionLineItemStateActionImpl instance = new OrderTransitionLineItemStateActionImpl();
      instance.setToState(template.getToState());
      instance.setFromState(template.getFromState());
      instance.setQuantity(template.getQuantity());
      instance.setLineItemId(template.getLineItemId());
      instance.setActualTransitionDate(template.getActualTransitionDate());
      return instance;
   }

}