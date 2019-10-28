package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.order.ReturnShipmentState;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderReturnShipmentStateChangedMessagePayloadImpl implements OrderReturnShipmentStateChangedMessagePayload {

   private String type;
   
   private String returnItemId;
   
   private com.commercetools.api.generated.models.order.ReturnShipmentState returnShipmentState;

   @JsonCreator
   OrderReturnShipmentStateChangedMessagePayloadImpl(@JsonProperty("returnItemId") final String returnItemId, @JsonProperty("returnShipmentState") final com.commercetools.api.generated.models.order.ReturnShipmentState returnShipmentState) {
      this.returnItemId = returnItemId;
      this.returnShipmentState = returnShipmentState;
      this.type = "OrderReturnShipmentStateChanged";
   }
   public OrderReturnShipmentStateChangedMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public String getReturnItemId(){
      return this.returnItemId;
   }
   
   
   public com.commercetools.api.generated.models.order.ReturnShipmentState getReturnShipmentState(){
      return this.returnShipmentState;
   }

   public void setReturnItemId(final String returnItemId){
      this.returnItemId = returnItemId;
   }
   
   public void setReturnShipmentState(final com.commercetools.api.generated.models.order.ReturnShipmentState returnShipmentState){
      this.returnShipmentState = returnShipmentState;
   }

}