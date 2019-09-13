package com.commercetools.models.order;

import com.commercetools.models.order.OrderState;
import com.commercetools.models.order.OrderUpdateAction;
import java.lang.String;
import com.commercetools.models.order.OrderChangeOrderStateActionImpl;

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
@JsonDeserialize(as = OrderChangeOrderStateActionImpl.class)
public interface OrderChangeOrderStateAction extends OrderUpdateAction {

   
   @NotNull
   @JsonProperty("orderState")
   public OrderState getOrderState();

   public void setOrderState(final OrderState orderState);
   
   public static OrderChangeOrderStateActionImpl of(){
      return new OrderChangeOrderStateActionImpl();
   }
   

   public static OrderChangeOrderStateActionImpl of(final OrderChangeOrderStateAction template) {
      OrderChangeOrderStateActionImpl instance = new OrderChangeOrderStateActionImpl();
      instance.setOrderState(template.getOrderState());
      return instance;
   }

}