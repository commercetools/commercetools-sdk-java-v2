package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.order.OrderUpdateAction;
import com.commercetools.api.generated.models.order.OrderSetCustomerIdActionImpl;

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
@JsonDeserialize(as = OrderSetCustomerIdActionImpl.class)
public interface OrderSetCustomerIdAction extends OrderUpdateAction {

   
   
   @JsonProperty("customerId")
   public String getCustomerId();

   public void setCustomerId(final String customerId);
   
   public static OrderSetCustomerIdActionImpl of(){
      return new OrderSetCustomerIdActionImpl();
   }
   

   public static OrderSetCustomerIdActionImpl of(final OrderSetCustomerIdAction template) {
      OrderSetCustomerIdActionImpl instance = new OrderSetCustomerIdActionImpl();
      instance.setCustomerId(template.getCustomerId());
      return instance;
   }

}