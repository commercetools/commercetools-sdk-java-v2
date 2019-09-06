package com.commercetools.models.OrderEdit;

import com.commercetools.models.Common.Address;
import com.commercetools.models.Order.DeliveryItem;
import com.commercetools.models.Order.ParcelDraft;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderAddDeliveryActionImpl;

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
@JsonDeserialize(as = StagedOrderAddDeliveryActionImpl.class)
public interface StagedOrderAddDeliveryAction extends StagedOrderUpdateAction {

   
   @Valid
   @JsonProperty("items")
   public List<DeliveryItem> getItems();
   
   @Valid
   @JsonProperty("address")
   public Address getAddress();
   
   @Valid
   @JsonProperty("parcels")
   public List<ParcelDraft> getParcels();

   public void setItems(final List<DeliveryItem> items);
   
   public void setAddress(final Address address);
   
   public void setParcels(final List<ParcelDraft> parcels);
   
   public static StagedOrderAddDeliveryActionImpl of(){
      return new StagedOrderAddDeliveryActionImpl();
   }
   

   public static StagedOrderAddDeliveryActionImpl of(final StagedOrderAddDeliveryAction template) {
      StagedOrderAddDeliveryActionImpl instance = new StagedOrderAddDeliveryActionImpl();
      instance.setAddress(template.getAddress());
      instance.setItems(template.getItems());
      instance.setParcels(template.getParcels());
      return instance;
   }

}