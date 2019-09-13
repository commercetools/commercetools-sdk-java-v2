package com.commercetools.models.order;

import com.commercetools.models.order.DeliveryItem;
import com.commercetools.models.order.OrderUpdateAction;
import java.lang.String;
import com.commercetools.models.order.OrderSetParcelItemsActionImpl;

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
@JsonDeserialize(as = OrderSetParcelItemsActionImpl.class)
public interface OrderSetParcelItemsAction extends OrderUpdateAction {

   
   @NotNull
   @JsonProperty("parcelId")
   public String getParcelId();
   
   @NotNull
   @Valid
   @JsonProperty("items")
   public List<DeliveryItem> getItems();

   public void setParcelId(final String parcelId);
   
   public void setItems(final List<DeliveryItem> items);
   
   public static OrderSetParcelItemsActionImpl of(){
      return new OrderSetParcelItemsActionImpl();
   }
   

   public static OrderSetParcelItemsActionImpl of(final OrderSetParcelItemsAction template) {
      OrderSetParcelItemsActionImpl instance = new OrderSetParcelItemsActionImpl();
      instance.setItems(template.getItems());
      instance.setParcelId(template.getParcelId());
      return instance;
   }

}