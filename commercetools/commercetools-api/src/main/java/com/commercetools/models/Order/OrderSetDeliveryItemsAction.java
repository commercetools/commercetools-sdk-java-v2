package com.commercetools.models.Order;

import com.commercetools.models.Order.DeliveryItem;
import com.commercetools.models.Order.OrderUpdateAction;
import java.lang.String;
import com.commercetools.models.Order.OrderSetDeliveryItemsActionImpl;

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
@JsonDeserialize(as = OrderSetDeliveryItemsActionImpl.class)
public interface OrderSetDeliveryItemsAction extends OrderUpdateAction {

   
   @NotNull
   @JsonProperty("deliveryId")
   public String getDeliveryId();
   
   @NotNull
   @Valid
   @JsonProperty("items")
   public List<DeliveryItem> getItems();

   public void setDeliveryId(final String deliveryId);
   
   public void setItems(final List<DeliveryItem> items);
   
   public static OrderSetDeliveryItemsActionImpl of(){
      return new OrderSetDeliveryItemsActionImpl();
   }
   

   public static OrderSetDeliveryItemsActionImpl of(final OrderSetDeliveryItemsAction template) {
      OrderSetDeliveryItemsActionImpl instance = new OrderSetDeliveryItemsActionImpl();
      instance.setDeliveryId(template.getDeliveryId());
      instance.setItems(template.getItems());
      return instance;
   }

}