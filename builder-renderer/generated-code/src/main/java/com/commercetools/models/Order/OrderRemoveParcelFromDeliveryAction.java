package com.commercetools.models.Order;

import com.commercetools.models.Order.OrderUpdateAction;
import java.lang.String;
import com.commercetools.models.Order.OrderRemoveParcelFromDeliveryActionImpl;

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
@JsonDeserialize(as = OrderRemoveParcelFromDeliveryActionImpl.class)
public interface OrderRemoveParcelFromDeliveryAction extends OrderUpdateAction {

   
   @NotNull
   @JsonProperty("parcelId")
   public String getParcelId();

   public void setParcelId(final String parcelId);
   
   public static OrderRemoveParcelFromDeliveryActionImpl of(){
      return new OrderRemoveParcelFromDeliveryActionImpl();
   }
   

   public static OrderRemoveParcelFromDeliveryActionImpl of(final OrderRemoveParcelFromDeliveryAction template) {
      OrderRemoveParcelFromDeliveryActionImpl instance = new OrderRemoveParcelFromDeliveryActionImpl();
      instance.setParcelId(template.getParcelId());
      return instance;
   }

}