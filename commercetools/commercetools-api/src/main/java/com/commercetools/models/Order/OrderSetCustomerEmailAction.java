package com.commercetools.models.order;

import com.commercetools.models.order.OrderUpdateAction;
import com.commercetools.models.order.OrderSetCustomerEmailActionImpl;

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
@JsonDeserialize(as = OrderSetCustomerEmailActionImpl.class)
public interface OrderSetCustomerEmailAction extends OrderUpdateAction {

   
   
   @JsonProperty("email")
   public String getEmail();

   public void setEmail(final String email);
   
   public static OrderSetCustomerEmailActionImpl of(){
      return new OrderSetCustomerEmailActionImpl();
   }
   

   public static OrderSetCustomerEmailActionImpl of(final OrderSetCustomerEmailAction template) {
      OrderSetCustomerEmailActionImpl instance = new OrderSetCustomerEmailActionImpl();
      instance.setEmail(template.getEmail());
      return instance;
   }

}