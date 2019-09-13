package com.commercetools.models.order;

import com.commercetools.models.common.Address;
import com.commercetools.models.order.OrderUpdateAction;
import java.lang.String;
import com.commercetools.models.order.OrderUpdateItemShippingAddressActionImpl;

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
@JsonDeserialize(as = OrderUpdateItemShippingAddressActionImpl.class)
public interface OrderUpdateItemShippingAddressAction extends OrderUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("address")
   public Address getAddress();

   public void setAddress(final Address address);
   
   public static OrderUpdateItemShippingAddressActionImpl of(){
      return new OrderUpdateItemShippingAddressActionImpl();
   }
   

   public static OrderUpdateItemShippingAddressActionImpl of(final OrderUpdateItemShippingAddressAction template) {
      OrderUpdateItemShippingAddressActionImpl instance = new OrderUpdateItemShippingAddressActionImpl();
      instance.setAddress(template.getAddress());
      return instance;
   }

}