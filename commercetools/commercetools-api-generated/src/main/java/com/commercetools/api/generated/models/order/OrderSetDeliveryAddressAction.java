package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.order.OrderUpdateAction;
import com.commercetools.api.generated.models.order.OrderSetDeliveryAddressActionImpl;

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
@JsonDeserialize(as = OrderSetDeliveryAddressActionImpl.class)
public interface OrderSetDeliveryAddressAction extends OrderUpdateAction {

   
   @NotNull
   @JsonProperty("deliveryId")
   public String getDeliveryId();
   
   @Valid
   @JsonProperty("address")
   public Address getAddress();

   public void setDeliveryId(final String deliveryId);
   
   public void setAddress(final Address address);
   
   public static OrderSetDeliveryAddressActionImpl of(){
      return new OrderSetDeliveryAddressActionImpl();
   }
   

   public static OrderSetDeliveryAddressActionImpl of(final OrderSetDeliveryAddressAction template) {
      OrderSetDeliveryAddressActionImpl instance = new OrderSetDeliveryAddressActionImpl();
      instance.setDeliveryId(template.getDeliveryId());
      instance.setAddress(template.getAddress());
      return instance;
   }

}