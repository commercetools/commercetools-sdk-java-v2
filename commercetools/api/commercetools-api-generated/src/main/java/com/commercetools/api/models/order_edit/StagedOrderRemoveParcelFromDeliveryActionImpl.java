package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderRemoveParcelFromDeliveryActionImpl implements StagedOrderRemoveParcelFromDeliveryAction {

   private String action;
   
   private String parcelId;

   @JsonCreator
   StagedOrderRemoveParcelFromDeliveryActionImpl(@JsonProperty("parcelId") final String parcelId) {
      this.parcelId = parcelId;
      this.action = "removeParcelFromDelivery";
   }
   public StagedOrderRemoveParcelFromDeliveryActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getParcelId(){
      return this.parcelId;
   }

   public void setParcelId(final String parcelId){
      this.parcelId = parcelId;
   }

}
