package com.commercetools.models.order;

import com.commercetools.models.order.OrderUpdateAction;
import java.lang.String;
import com.commercetools.models.order.OrderSetOrderNumberActionImpl;

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
@JsonDeserialize(as = OrderSetOrderNumberActionImpl.class)
public interface OrderSetOrderNumberAction extends OrderUpdateAction {

   
   
   @JsonProperty("orderNumber")
   public String getOrderNumber();

   public void setOrderNumber(final String orderNumber);
   
   public static OrderSetOrderNumberActionImpl of(){
      return new OrderSetOrderNumberActionImpl();
   }
   

   public static OrderSetOrderNumberActionImpl of(final OrderSetOrderNumberAction template) {
      OrderSetOrderNumberActionImpl instance = new OrderSetOrderNumberActionImpl();
      instance.setOrderNumber(template.getOrderNumber());
      return instance;
   }

}