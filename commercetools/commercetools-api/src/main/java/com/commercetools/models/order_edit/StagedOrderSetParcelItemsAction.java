package com.commercetools.models.order_edit;

import com.commercetools.models.order.DeliveryItem;
import com.commercetools.models.order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.order_edit.StagedOrderSetParcelItemsActionImpl;

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
@JsonDeserialize(as = StagedOrderSetParcelItemsActionImpl.class)
public interface StagedOrderSetParcelItemsAction extends StagedOrderUpdateAction {

   
   @NotNull
   @JsonProperty("parcelId")
   public String getParcelId();
   
   @NotNull
   @Valid
   @JsonProperty("items")
   public List<DeliveryItem> getItems();

   public void setParcelId(final String parcelId);
   
   public void setItems(final List<DeliveryItem> items);
   
   public static StagedOrderSetParcelItemsActionImpl of(){
      return new StagedOrderSetParcelItemsActionImpl();
   }
   

   public static StagedOrderSetParcelItemsActionImpl of(final StagedOrderSetParcelItemsAction template) {
      StagedOrderSetParcelItemsActionImpl instance = new StagedOrderSetParcelItemsActionImpl();
      instance.setItems(template.getItems());
      instance.setParcelId(template.getParcelId());
      return instance;
   }

}