package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.order.OrderUpdateAction;
import com.commercetools.api.generated.models.order.OrderAddItemShippingAddressActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
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
@JsonDeserialize(as = OrderAddItemShippingAddressActionImpl.class)
public interface OrderAddItemShippingAddressAction extends OrderUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("address")
   public Address getAddress();

   public void setAddress(final Address address);
   
   public static OrderAddItemShippingAddressActionImpl of(){
      return new OrderAddItemShippingAddressActionImpl();
   }
   

   public static OrderAddItemShippingAddressActionImpl of(final OrderAddItemShippingAddressAction template) {
      OrderAddItemShippingAddressActionImpl instance = new OrderAddItemShippingAddressActionImpl();
      instance.setAddress(template.getAddress());
      return instance;
   }

}