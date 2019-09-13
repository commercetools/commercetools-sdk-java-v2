package com.commercetools.models.order_edit;

import com.commercetools.models.order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.order_edit.StagedOrderRemoveDeliveryActionImpl;

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
@JsonDeserialize(as = StagedOrderRemoveDeliveryActionImpl.class)
public interface StagedOrderRemoveDeliveryAction extends StagedOrderUpdateAction {

   
   @NotNull
   @JsonProperty("deliveryId")
   public String getDeliveryId();

   public void setDeliveryId(final String deliveryId);
   
   public static StagedOrderRemoveDeliveryActionImpl of(){
      return new StagedOrderRemoveDeliveryActionImpl();
   }
   

   public static StagedOrderRemoveDeliveryActionImpl of(final StagedOrderRemoveDeliveryAction template) {
      StagedOrderRemoveDeliveryActionImpl instance = new StagedOrderRemoveDeliveryActionImpl();
      instance.setDeliveryId(template.getDeliveryId());
      return instance;
   }

}