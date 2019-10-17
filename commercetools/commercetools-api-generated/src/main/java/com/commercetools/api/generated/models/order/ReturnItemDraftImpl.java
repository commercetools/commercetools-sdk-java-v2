package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.order.ReturnShipmentState;
import javax.annotation.Generated;
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
public final class ReturnItemDraftImpl implements ReturnItemDraft {

   private com.commercetools.api.generated.models.order.ReturnShipmentState shipmentState;
   
   private String customLineItemId;
   
   private Long quantity;
   
   private String lineItemId;
   
   private String comment;

   @JsonCreator
   ReturnItemDraftImpl(@JsonProperty("shipmentState") final com.commercetools.api.generated.models.order.ReturnShipmentState shipmentState, @JsonProperty("customLineItemId") final String customLineItemId, @JsonProperty("quantity") final Long quantity, @JsonProperty("lineItemId") final String lineItemId, @JsonProperty("comment") final String comment) {
      this.shipmentState = shipmentState;
      this.customLineItemId = customLineItemId;
      this.quantity = quantity;
      this.lineItemId = lineItemId;
      this.comment = comment;
   }
   public ReturnItemDraftImpl() {
      
   }
   
   
   public com.commercetools.api.generated.models.order.ReturnShipmentState getShipmentState(){
      return this.shipmentState;
   }
   
   
   public String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public Long getQuantity(){
      return this.quantity;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public String getComment(){
      return this.comment;
   }

   public void setShipmentState(final com.commercetools.api.generated.models.order.ReturnShipmentState shipmentState){
      this.shipmentState = shipmentState;
   }
   
   public void setCustomLineItemId(final String customLineItemId){
      this.customLineItemId = customLineItemId;
   }
   
   public void setQuantity(final Long quantity){
      this.quantity = quantity;
   }
   
   public void setLineItemId(final String lineItemId){
      this.lineItemId = lineItemId;
   }
   
   public void setComment(final String comment){
      this.comment = comment;
   }

}