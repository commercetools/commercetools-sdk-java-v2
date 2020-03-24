package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order.DeliveryItem;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetDeliveryItemsActionImpl;

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
@JsonDeserialize(as = StagedOrderSetDeliveryItemsActionImpl.class)
public interface StagedOrderSetDeliveryItemsAction extends StagedOrderUpdateAction {

   
   @NotNull
   @JsonProperty("deliveryId")
   public String getDeliveryId();
   
   @NotNull
   @Valid
   @JsonProperty("items")
   public List<DeliveryItem> getItems();

   public void setDeliveryId(final String deliveryId);
   
   public void setItems(final List<DeliveryItem> items);
   
   public static StagedOrderSetDeliveryItemsActionImpl of(){
      return new StagedOrderSetDeliveryItemsActionImpl();
   }
   

   public static StagedOrderSetDeliveryItemsActionImpl of(final StagedOrderSetDeliveryItemsAction template) {
      StagedOrderSetDeliveryItemsActionImpl instance = new StagedOrderSetDeliveryItemsActionImpl();
      instance.setDeliveryId(template.getDeliveryId());
      instance.setItems(template.getItems());
      return instance;
   }

}